using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

public class EListVariable : EVariable
{
    public bool isBaseType = false;
    private List<EVariable> varList = null;

    private EClass diyClass = null;
    private EClass copyClass = null;
    private int diyVarCount = 0;
    private int curCopyIndex = 0;
    private Dictionary<int, EBaseStruct> diyClassVarList = new Dictionary<int, EBaseStruct>();

    public EListVariable(int count)
    {
        varList = new List<EVariable>(count);
    }

    public void AddValue(EVariable data)
    {
        if (!varList.Contains(data))
            varList.Add(data);
    }

    public void AddVarToDiyClass(EBaseStruct data)
    {
        if (isBaseType)
        {
            type = data.type;
            AddValue(data);
        }
        else
        {
            if (diyClass != null && data != null)
            {
                diyClass.AddValue(data);
                diyClassVarList[diyVarCount] = data;

                diyVarCount++;
            }
        }
    }

    public void AddVarToCopyClass(List<string> data)
    {
        //证明是新的一个Copy类
        if (isBaseType)
        {
            //基本数据类型
            EBaseStruct newVar = new EBaseStruct();
            newVar.name = name;
            newVar.type = type;
            newVar.note = note;
            newVar.valueList = data;
            AddValue(newVar);
        }
        else
        {
            curCopyIndex %= diyVarCount;
            if (curCopyIndex == 0)
            {
                copyClass = new EClass(diyVarCount);
                copyClass.name = name;
                copyClass.type = type;
                copyClass.note = note;
                AddValue(copyClass);
            }
            EBaseStruct varBase = diyClassVarList[curCopyIndex].Clone();
            varBase.valueList = data;

            if (copyClass != null)
                copyClass.AddValue(varBase);

            curCopyIndex++;
        }
    }

    /// <summary>
    /// 获取这个List存储的自定义数据类型
    /// </summary>
    public EClass GetDiyClassType()
    {
        if (diyClass == null)
        {
            diyClass = new EClass(5);

            diyClass.name = name;
            diyClass.type = type;
            diyClass.note = note;
        }

        return diyClass;
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
        strCache.Append("list<");
        //List自定义数据是结构
        if (isBaseType)
        {
            strCache.Append(ConvertThriftTypeByVarType());
        }
        else
        {
            strCache.Append("public.");
            strCache.Append(type);
        }
        strCache.Append(">");

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
        //List数据结构
        Type listType = typeof(List<>);

        Type listTypeInstance = listType.MakeGenericType(GetThisVariableType());
        IList listInstance = (IList)Activator.CreateInstance(listTypeInstance);

        //生成数据对象，并存储信息
        foreach (EClass classData in varList)
        {
            listInstance.Add(classData.GetDataByRowIndex(index));
        }

        return listInstance;
    }
}