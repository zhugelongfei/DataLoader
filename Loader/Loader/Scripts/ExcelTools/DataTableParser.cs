using System.Collections.Generic;
using System.Data;

namespace Loader
{
    public class DataTableParser
    {
        /// <summary>
        /// 变量名行
        /// </summary>
        private const int nameRowIndex = 0;

        /// <summary>
        /// 注释行
        /// </summary>
        private const int noteRowIndex = 1;

        /// <summary>
        /// 变量类型行
        /// </summary>
        private const int typeRowIndex = 2;

        /// <summary>
        /// 数据开始行
        /// </summary>
        private const int dataRowIndex = 3;

        private bool isListStart = false;
        private List<int> ignoreRow = new List<int>();
        private List<int> ignoreColumn = new List<int>();
        private List<string> varNameList = new List<string>();

        public void ResetData()
        {
            ignoreRow.Clear();
            ignoreColumn.Clear();
            varNameList.Clear();
            isListStart = false;
        }

        /// <summary>
        /// 解析DataSet内的数据结构为List<ExcelSheet>
        /// </summary>
        /// <param name="setData">Excel数据</param>
        /// <param name="diyStructDic">所有Excel中使用的自定义数据结构</param>
        public List<ExcelClass> AnalysisDataSetToSheetList(DataSet setData, Dictionary<string, ExcelVariable> diyStructDic)
        {
            if (setData == null || setData.Tables == null)
                throw new System.Exception("DataSet is null or tables is null");

            ResetData();

            List<ExcelClass> sheetList = new List<ExcelClass>(setData.Tables.Count);

            //遍历Sheet
            for (int i = 0; i < setData.Tables.Count; i++)
            {
                DataTable sheetData = setData.Tables[i];

                //处理Sheet数据
                ExcelClass sheet = GenerateSheetInfo(sheetData, diyStructDic);

                //只加入有数据的Sheet
                if (sheet != null && sheet.variablesDic != null && sheet.variablesDic.Count > 0)
                    sheetList.Add(sheet);
            }
            return sheetList;
        }

        /// <summary>
        /// 读取数据的忽略行集合和列集合
        /// </summary>
        private void LoadExcelIgnoreColumnAndRow(string[,] data)
        {
            //忽略行集合
            for (int rowIndex = 0; rowIndex < data.GetLength(0); rowIndex++)
            {
                if (IsIgnro(data[rowIndex, 0]))
                    ignoreRow.Add(rowIndex);
            }

            //忽略列集合
            for (int columnIndex = 0; columnIndex < data.GetLength(1); columnIndex++)
            {
                if (IsIgnro(data[nameRowIndex, columnIndex]))
                    ignoreColumn.Add(columnIndex);
            }
        }

        /// <summary>
        /// 生成Sheet信息。从DataTable转换为ExcelSheet
        /// </summary>
        /// <param name="sheetSet">Excel数据</param>
        /// <param name="diyStructDic">所有Excel中使用的自定义数据结构</param>
        public ExcelClass GenerateSheetInfo(DataTable sheetSet, Dictionary<string, ExcelVariable> diyStructDic)
        {
            //1：初始化ExcelSheet信息
            ExcelClass sheet = new ExcelClass();
            sheet.className = sheetSet.TableName;
            sheet.variablesDic = new Dictionary<string, ExcelVariable>(sheetSet.Columns.Count);

            //2：转换DataTable为string的二维数组
            string[,] data = DataTableConvertToStringArray(sheetSet);

            //3：获取忽略行列集合
            LoadExcelIgnoreColumnAndRow(data);

            //自定义结构信息
            ExcelVariable listVariable = null;
            ExcelClass diyClass = null;
            ExcelClass copyClass = null;
            int index = 0;
            int copyIndex = 0;

            for (int columnIndex = 0; columnIndex < data.GetLength(1); columnIndex++)
            {
                string headValue = data[nameRowIndex, columnIndex];

                //列-忽略检测
                if (ignoreColumn.Contains(columnIndex))
                    continue;

                if (headValue.StartsWith("("))
                {
                    isListStart = true;

                    //初始化数据，读取List结构信息
                    listVariable = ReadListVariableInfo(data, columnIndex);
                    diyClass = new ExcelClass();
                    listVariable.diyVarType.Add(diyClass);
                    index = 0;
                    copyIndex = 0;

                    //将List加入变量组
                    sheet.variablesDic[listVariable.varName] = listVariable;
                }
                else if (headValue.StartsWith(")"))
                {
                    isListStart = false;

                    if (listVariable.isBaseType)
                    {
                        //处理基本数据类型
                        listVariable.varType = listVariable.diyVarType[0].variablesDic[varNameList[0]].varType;
                    }
                    else
                    {
                        //加入全局自定义类型列表中（自定义类型需要外部处理生成thrift）
                        if (!diyStructDic.ContainsKey(listVariable.varType))
                            diyStructDic.Add(listVariable.varType, listVariable);
                    }
                }
                else
                {
                    //三个值全是空，并且List开始了，那就是 自定义结构开始循环了
                    if (isListStart && string.IsNullOrEmpty(headValue))
                    {
                        if (copyClass == null)
                            copyClass = new ExcelClass();

                        //从自定义结构中开始复制数据结构
                        ExcelVariable copyVar = diyClass.variablesDic[varNameList[copyIndex]].Clone();
                        //从这列读取自己的数据
                        copyVar.values = ReadListCopyVariableData(data, columnIndex);
                        copyClass.variablesDic.Add(copyVar.varName, copyVar);
                        copyIndex++;

                        if (copyIndex >= index)
                        {
                            //证明变量数量够了，一个自定义结构体构造完成
                            listVariable.diyVarType.Add(copyClass);
                            copyClass = null;
                            copyIndex = 0;
                        }

                        continue;
                    }

                    //读取变量信息
                    ExcelVariable variable = ReadCommonVariableInfo(data, columnIndex);

                    //变量归属问题
                    if (isListStart)
                    {
                        //List集合体内，变量要加入自定义结构体中
                        diyClass.variablesDic.Add(variable.varName, variable);
                        varNameList.Add(variable.varName);
                        index++;
                    }
                    else
                    {
                        //普通变量，存储到Sheet中
                        sheet.variablesDic[variable.varName] = variable;
                    }
                }
            }

            return sheet;
        }

        /// <summary>
        /// 读取普通变量的信息（类型，变量名，注释，数据）
        /// </summary>
        private ExcelVariable ReadCommonVariableInfo(string[,] data, int columnIndex)
        {
            ExcelVariable variable = new ExcelVariable();

            for (int rowIndex = 0; rowIndex < data.GetLength(0); rowIndex++)
            {
                //行-忽略检测
                if (ignoreRow.Contains(rowIndex))
                    continue;

                string strData = data[rowIndex, columnIndex];

                switch (rowIndex)
                {
                    case nameRowIndex:
                        variable.varName = strData;
                        break;
                    case noteRowIndex:
                        variable.varNote = strData;
                        break;
                    case typeRowIndex:
                        variable.varType = strData;
                        break;
                    default:
                        variable.values.Add(strData);
                        break;
                }
            }
            return variable;
        }

        /// <summary>
        /// 读取List的结构信息（范型类型，变量名）
        /// </summary>
        private ExcelVariable ReadListVariableInfo(string[,] data, int columnIndex)
        {
            ExcelVariable variable = new ExcelVariable();

            variable.isListStruct = true;

            for (int rowIndex = 0; rowIndex < dataRowIndex; rowIndex++)
            {
                string strData = data[rowIndex, columnIndex];

                switch (rowIndex)
                {
                    case nameRowIndex:
                        variable.varName = strData.Replace("(", "");
                        break;
                    case noteRowIndex:
                        variable.varNote = strData;
                        break;
                    case typeRowIndex:
                        string value = strData.Replace("(", "");

                        //如果类型为Null或""则说明，这个List的范型是基础数据类型，不需要自定义
                        if (string.IsNullOrEmpty(value))
                            variable.isBaseType = true;
                        else
                            variable.varType = value;

                        break;
                }
            }

            return variable;
        }

        /// <summary>
        /// 读取List自定义数据结构内变量的数据
        /// </summary>
        /// <param name="data">Excel数据</param>
        /// <param name="columnIndex">列数</param>
        private List<string> ReadListCopyVariableData(string[,] data, int columnIndex)
        {
            List<string> values = new List<string>(data.GetLength(0) - dataRowIndex);

            for (int rowIndex = dataRowIndex; rowIndex < data.GetLength(0); rowIndex++)
            {
                values.Add(data[rowIndex, columnIndex]);
            }

            return values;
        }
        /// <summary>
        /// 检测一个字符串是否代表忽略
        /// </summary>
        private bool IsIgnro(string str)
        {
            if (string.IsNullOrEmpty(str))
                return false;

            return str.StartsWith("#");
        }

        /// <summary>
        /// 转换DataTable为string的二维数组
        /// </summary>
        private string[,] DataTableConvertToStringArray(DataTable table)
        {
            if (table == null)
                return null;

            string[,] data = new string[table.Rows.Count, table.Columns.Count];

            for (int rowIndex = 0; rowIndex < table.Rows.Count; rowIndex++)
            {
                DataRow rowData = table.Rows[rowIndex];
                for (int columnIndex = 0; columnIndex < rowData.ItemArray.Length; columnIndex++)
                {
                    data[rowIndex, columnIndex] = rowData.ItemArray[columnIndex].ToString();
                }
            }
            return data;
        }

    }
}