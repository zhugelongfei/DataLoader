using System.Text;
using System.Collections.Generic;

public class EBaseStruct : EVariable
{
    private List<string> valueList = null;

    /// <summary>
    /// 构造函数：对象创建时，确定数据数量
    /// </summary>
    public EBaseStruct(int count)
    {
        valueList = new List<string>(count);
    }

    /// <summary>
    /// 添加一个数据
    /// </summary>
    public void AddValue(string data)
    {
        if (data == null)
            return;

        valueList.Add(data);
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
        strCache.Append(GetThriftTypeByVarType());

        //3：变量名
        strCache.Append("   ");
        strCache.Append(name);

        return strCache.ToString();
    }

    /// <summary>
    /// 根据行号获取该行的数据
    /// </summary>
    public override object GetDataByRowIndex(int index)
    {
        //普通变量
        if (valueList.Count > index)
        {
            return GetValueByType(valueList[index]);
        }
        return null;
    }
}