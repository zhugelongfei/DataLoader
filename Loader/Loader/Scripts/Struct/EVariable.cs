using System;

public abstract class EVariable
{
    public string name;

    public string type;

    public string note;

    #region NVelocity 使用的属性和函数

    public string NV_Name { get { return name; } }
    public string NV_Type { get { return type; } }
    public string NV_Note { get { return note; } }

    /// <summary>
    /// Thrift字段名称(Index : Type Name)
    /// </summary>
    /// <param name="varIndex">在Thrift中的变量声明索引</param>
    public abstract string NV_ThriftFieldStatementName(int varIndex);

    #endregion

    /// <summary>
    /// 根据行数获取数据
    /// </summary>
    /// <param name="index">行数</param>
    /// <returns>数据</returns>
    public abstract object GetDataByRowIndex(int index);

    /// <summary>
    /// 转换Excel里填写的类型为Thrift类型
    /// </summary>
    protected string ConvertThriftTypeByVarType()
    {
        string thriftType = null;
        switch (type)
        {
            case "boolean":
                thriftType = "bool";
                break;
            case "byte":
                thriftType = "byte";
                break;
            case "short":
                thriftType = "i16";
                break;
            case "int":
                thriftType = "i32";
                break;
            case "long":
                thriftType = "i64";
                break;
            case "double":
                thriftType = "double";
                break;
            case "string":
            case "String":
                thriftType = "string";
                break;
        }
        return thriftType;
    }

    /// <summary>
    /// 根据数据类型，转换为数据对象
    /// </summary>
    protected object ConvertValueByType(string value)
    {
        object obj = null;
        switch (type)
        {
            case "boolean":
                obj = !string.IsNullOrEmpty(value) || value.Equals("0");
                break;
            case "byte":
                obj = byte.Parse(value);
                break;
            case "short":
                obj = short.Parse(value);
                break;
            case "int":
                obj = int.Parse(value);
                break;
            case "long":
                obj = long.Parse(value);
                break;
            case "double":
                obj = double.Parse(value);
                break;
            case "string":
                obj = value == null ? value : value.ToLower();
                break;
            case "String":
                obj = value;
                break;
        }
        return obj;
    }

    /// <summary>
    /// 获取这个变量的数据类型
    /// </summary>
    protected Type GetThisVariableType()
    {
        Type resultType = null;
        switch (type)
        {
            case "boolean":
                resultType = typeof(bool);
                break;
            case "byte":
                resultType = typeof(byte);
                break;
            case "short":
                resultType = typeof(short);
                break;
            case "int":
                resultType = typeof(int);
                break;
            case "long":
                resultType = typeof(long);
                break;
            case "double":
                resultType = typeof(double);
                break;
            case "string":
            case "String":
                resultType = typeof(string);
                break;
            default:
                resultType = Loader.BytesFileBuilder.assembly.GetType("ThriftStruct." + type);
                break;
        }
        return resultType;
    }
}