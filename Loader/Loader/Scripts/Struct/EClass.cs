using System.Text;
using System.Collections.Generic;
using System.Reflection;

public class EClass : EVariable
{
    private Dictionary<string, EVariable> varDic = null;
    private List<EClass> diyClassList = null;
    public int rowDataCount = 0;

    public Dictionary<string, EVariable> NV_ExcelVarStructDic { get { return varDic; } }
    public List<EClass> NV_DiyClassList { get { return diyClassList; } }

    public EClass(int count)
    {
        varDic = new Dictionary<string, EVariable>(count);
    }

    /// <summary>
    /// 添加字段到类结构中
    /// </summary>
    /// <param name="data"></param>
    public void AddVariable(EVariable data)
    {
        if (data == null)
            return;

        varDic.Add(data.name, data);
    }

    /// <summary>
    /// 添加自定义类型（这个表中创建的自定义类型结构）
    /// </summary>
    public void AddDiyClass(EClass cls)
    {
        if (diyClassList == null)
            diyClassList = new List<EClass>();
        diyClassList.Add(cls);
    }

    /// <summary>
    /// 是否包含有效数据
    /// </summary>
    public bool IsHasVaildData()
    {
        return varDic != null && varDic.Count > 0;
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
        object dataObj = Loader.BytesFileBuilder.CreateInstance(type);

        //获取数据对象的所有属性，赋值
        PropertyInfo[] propertyInfoArray = dataObj.GetType().GetProperties(BindingFlags.Public | BindingFlags.Instance);
        foreach (var item in propertyInfoArray)
        {
            item.SetValue(dataObj, GetVariableValueByVarNameAndRow(item.Name, index), null);
        }
        return dataObj;
    }
}