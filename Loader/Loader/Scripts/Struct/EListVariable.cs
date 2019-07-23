using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

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

    public void AddVariable(EVariable data)
    {
        if (!varList.Contains(data))
            varList.Add(data);
    }

    /// <summary>
    /// 添加字段到自定义类中（确定自定义类结构）
    /// </summary>
    public void AddVarToDiyClass(EBaseStruct data)
    {
        if (isBaseType)
        {
            type = data.type;
            AddVariable(data);
        }
        else
        {
            if (diyClass == null)
            {
                //创建一个类，承载这个自定义的类型信息
                diyClass = new EClass(5);
                diyClass.name = name;
                diyClass.type = type;
                diyClass.note = note;

                AddVariable(diyClass);
            }

            //将变量加入自定义类中，并记录类的结构信息和数量
            diyClass.AddVariable(data);
            diyClassVarList[diyVarCount] = data;
            diyVarCount++;
        }
    }

    /// <summary>
    /// 添加字段到复制类中（自定义类结构已确定，开始循环）
    /// </summary>
    public void AddVarToCopyClass(EBaseStruct variable)
    {
        if (isBaseType)
        {
            //基本数据类型
            variable.type = type;
            AddVariable(variable);
        }
        else
        {
            //计算字段循环索引
            curCopyIndex %= diyVarCount;
            if (curCopyIndex == 0)
            {
                //证明需要创建一个新的对象，来存储数据
                copyClass = new EClass(diyVarCount);
                copyClass.name = name;
                copyClass.type = type;
                copyClass.note = note;
                AddVariable(copyClass);
            }

            //根据字段索引，找到对应的字段结构信息，并赋值
            EBaseStruct srcStruct = diyClassVarList[curCopyIndex];
            variable.name = srcStruct.name;
            variable.type = srcStruct.type;
            variable.note = srcStruct.note;

            //将字段加入到对象中
            if (copyClass != null)
                copyClass.AddVariable(variable);

            //字段索引递增
            curCopyIndex++;
        }
    }

    /// <summary>
    /// 获取这个List存储的自定义数据类型
    /// </summary>
    public EClass GetDiyClassType()
    {
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
            strCache.Append(GetThriftTypeByVarType());
        }
        else
        {
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
        foreach (EVariable classData in varList)
        {
            listInstance.Add(classData.GetDataByRowIndex(index));
        }

        return listInstance;
    }

    /// <summary>
    /// List读取完毕后，释放一些临时变量
    /// </summary>
    public void ClearData()
    {
        diyClass = null;
        copyClass = null;
        diyVarCount = 0;
        curCopyIndex = 0;
        diyClassVarList = null;
    }
}