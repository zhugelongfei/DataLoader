using System.Text;
using System.Collections.Generic;

public class EBaseStruct : EVariable
{
    public List<string> valueList = null;

    public void AddValue(string data)
    {
        if (data == null)
            return;

        valueList.Add(data);
    }

    public EBaseStruct Clone()
    {
        EBaseStruct info = new EBaseStruct();
        info.name = name;
        info.type = type;
        info.note = note;

        return info;
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
        strCache.Append(ConvertThriftTypeByVarType());

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
        if (valueList != null && valueList.Count > index)
        {
            return ConvertValueByType(valueList[index]);
        }
        return null;
    }
}