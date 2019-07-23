using System;

public abstract class EVariable
{
    public string name;

    public string type;

    public string note;

    private const string TYPE_Boolean = "boolean";
    private const string TYPE_Byte = "byte";
    private const string TYPE_Short = "short";
    private const string TYPE_Int = "int";
    private const string TYPE_Long = "long";
    private const string TYPE_Double = "double";
    private const string TYPE_String = "string";
    private const string TYPE_String_Up = "string_up";
    private const string TYPE_String_Low = "string_low";

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
    protected string GetThriftTypeByVarType()
    {
        string thriftType = null;
        switch (type)
        {
            case TYPE_Boolean:
                thriftType = "bool";
                break;
            case TYPE_Byte:
                thriftType = "byte";
                break;
            case TYPE_Short:
                thriftType = "i16";
                break;
            case TYPE_Int:
                thriftType = "i32";
                break;
            case TYPE_Long:
                thriftType = "i64";
                break;
            case TYPE_Double:
                thriftType = "double";
                break;
            case TYPE_String:
            case TYPE_String_Up:
            case TYPE_String_Low:
                thriftType = "string";
                break;
        }
        return thriftType;
    }

    /// <summary>
    /// 根据数据类型，转换为数据对象
    /// </summary>
    protected object GetValueByType(string value)
    {
        object obj = null;
        switch (type)
        {
            case TYPE_Boolean:
                obj = !string.IsNullOrEmpty(value) || value.Equals("0");
                break;
            case TYPE_Byte:
                obj = byte.Parse(value);
                break;
            case TYPE_Short:
                obj = short.Parse(value);
                break;
            case TYPE_Int:
                obj = int.Parse(value);
                break;
            case TYPE_Long:
                obj = long.Parse(value);
                break;
            case TYPE_Double:
                obj = double.Parse(value);
                break;
            case TYPE_String:
                obj = value;
                break;
            case TYPE_String_Up:
                obj = value == null ? value : value.ToUpper();
                break;
            case TYPE_String_Low:
                obj = value == null ? value : value.ToLower();
                break;
        }

        if (obj == null)
            System.Console.WriteLine("data obj is null :::::: type is :::" + type);

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
            case TYPE_Boolean:
                resultType = typeof(bool);
                break;
            case TYPE_Byte:
                resultType = typeof(byte);
                break;
            case TYPE_Short:
                resultType = typeof(short);
                break;
            case TYPE_Int:
                resultType = typeof(int);
                break;
            case TYPE_Long:
                resultType = typeof(long);
                break;
            case TYPE_Double:
                resultType = typeof(double);
                break;
            case TYPE_String:
            case TYPE_String_Up:
            case TYPE_String_Low:
                resultType = typeof(string);
                break;
            default:
                resultType = Loader.BytesFileBuilder.GetTypeFromAssembly(type);
                break;
        }
        return resultType;
    }

	public static bool IsBaseType(string type)
	{
		if (string.IsNullOrEmpty(type))
			return false;

		if (type.Equals(TYPE_Boolean) || type.Equals(TYPE_Byte) || type.Equals(TYPE_Short) || type.Equals(TYPE_Int) || type.Equals(TYPE_Long) || type.Equals(TYPE_Double) || type.Equals(TYPE_String) || type.Equals(TYPE_String_Up) || type.Equals(TYPE_String_Low))
			return true;

		return false;
	}
}