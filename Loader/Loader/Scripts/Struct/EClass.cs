using System.Text;
using System.Collections.Generic;
using System.Reflection;

public class EClass : EVariable
{
    public Dictionary<string, EVariable> varDic = null;
    public int rowDataCount = 0;

    public Dictionary<string, EVariable> NV_ExcelVarStructDic { get { return varDic; } }

    public EClass(int count)
    {
        varDic = new Dictionary<string, EVariable>(count);
    }

    public void AddValue(EVariable data)
    {
        if (data == null)
            return;

        varDic.Add(data.name, data);
    }

    /// <summary>
    /// 根据变量名和行数获取数据
    /// </summary>
    /// <param name="varName">变量名</param>
    /// <param name="index">行数</param>
    /// <returns>数据</returns>
    public object GetVariableValueByVarNameAndRow(string varName, int index)
    {
        if (!varDic.ContainsKey(varName))
            return null;

        if (varDic[varName] == null)
            return null;

        return varDic[varName].GetDataByRowIndex(index);
    }

    /// <summary>
    /// 创建字段声明的字符串
    /// </summary>
    /// <param name="index">字段索引</param>
    public override string NV_ThriftFieldStatementName(int index)
    {
        StringBuilder strCache = new StringBuilder(20);

        //1：变量ID
        strCache.Append(index.ToString());
        strCache.Append(":  ");

        //2：变量类型
        strCache.Append(type);

        //3：变量名
        strCache.Append("   ");
        strCache.Append(name);

        return strCache.ToString();
    }

    /// <summary>
    /// 根据行数获取数据
    /// </summary>
    /// <param name="index">行数</param>
    /// <returns>数据</returns>
    public override object GetDataByRowIndex(int index)
    {
        object diyClassObj = Loader.BytesFileBuilder.assembly.CreateInstance("ThriftStruct." + type);
        if (diyClassObj == null)
        {
            System.Console.WriteLine(type + " error");
            return null;
        }
        //获取数据对象的所有属性，赋值
        PropertyInfo[] propertyInfoArray = diyClassObj.GetType().GetProperties(BindingFlags.Public | BindingFlags.Instance);
        foreach (var item in propertyInfoArray)
        {
            item.SetValue(diyClassObj, GetVariableValueByVarNameAndRow(item.Name, index), null);
        }
        return diyClassObj;
    }
}