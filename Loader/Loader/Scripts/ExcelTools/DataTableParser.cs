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

        public void ResetData()
        {
            ignoreRow.Clear();
            ignoreColumn.Clear();
            isListStart = false;
        }

        /// <summary>
        /// 解析DataSet内的数据结构为List<ExcelSheet>
        /// </summary>
        /// <param name="setData">Excel数据</param>
        /// <param name="diyStructDic">所有Excel中使用的自定义数据结构</param>
        public List<EClass> AnalysisDataSetToSheetList(DataSet setData, Dictionary<string, EClass> diyStructDic)
        {
            if (setData == null || setData.Tables == null)
                throw new System.Exception("DataSet is null or tables is null");

            ResetData();

            List<EClass> sheetList = new List<EClass>(setData.Tables.Count);

            //遍历Sheet
            for (int i = 0; i < setData.Tables.Count; i++)
            {
                DataTable sheetData = setData.Tables[i];

                //处理Sheet数据
                EClass sheet = GenerateSheetInfo(sheetData, diyStructDic);

                //只加入有数据的Sheet
                if (sheet != null && sheet.varDic != null && sheet.varDic.Count > 0)
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

        public EClass GenerateSheetInfo(DataTable sheetSet, Dictionary<string, EClass> diyStructDic)
        {
            //1：初始化ExcelSheet信息
            EClass sheet = new EClass(sheetSet.Columns.Count);
            sheet.name = sheetSet.TableName;
            sheet.type = sheetSet.TableName;

            //2：转换DataTable为string的二维数组
            string[,] data = DataTableConvertToStringArray(sheetSet);
            sheet.rowDataCount = data.GetLength(0) - 3;

            //3：获取忽略行列集合
            LoadExcelIgnoreColumnAndRow(data);

            //4：读取结构信息
            EListVariable listVar = null;

            for (int columnIndex = 0; columnIndex < data.GetLength(1); columnIndex++)
            {
                string headValue = data[nameRowIndex, columnIndex];

                //列-忽略检测
                if (ignoreColumn.Contains(columnIndex))
                    continue;

                if (headValue.StartsWith("("))
                {
                    //情况1：List开始

                    isListStart = true;

                    //初始化数据，读取List结构信息
                    listVar = ReadListVariableInfo(data, columnIndex);
                    if (!listVar.isBaseType)
                        listVar.AddValue(listVar.GetDiyClassType());

                    sheet.AddValue(listVar);
                }
                else if (headValue.StartsWith(")"))
                {
                    //情况2：List结束

                    isListStart = false;

                    if (!listVar.isBaseType)
                    {
                        //加入全局自定义类型列表中（自定义类型需要外部处理生成thrift）
                        if (!diyStructDic.ContainsKey(listVar.type))
                            diyStructDic.Add(listVar.type, listVar.GetDiyClassType());
                    }
                }
                else if (isListStart && string.IsNullOrEmpty(headValue))
                {
                    //情况3：List自定义结构循环

                    //读取变量数据信息，传入List中
                    listVar.AddVarToCopyClass(ReadListCopyVariableData(data, columnIndex));
                }
                else
                {
                    //情况4：正常读取一个变量

                    EBaseStruct variable = ReadCommonVariableInfo(data, columnIndex);

                    //变量归属问题
                    if (isListStart)
                    {
                        //List集合体内，变量要加入自定义结构体中
                        listVar.AddVarToDiyClass(variable);
                    }
                    else
                    {
                        //普通变量，存储到Sheet中
                        sheet.AddValue(variable);
                    }
                }
            }

            return sheet;
        }

        /// <summary>
        /// 读取List的结构信息（范型类型，变量名）
        /// </summary>
        private EListVariable ReadListVariableInfo(string[,] data, int columnIndex)
        {
            EListVariable variable = new EListVariable(data.GetLength(1));

            for (int rowIndex = 0; rowIndex < dataRowIndex; rowIndex++)
            {
                string strData = data[rowIndex, columnIndex];

                switch (rowIndex)
                {
                    case nameRowIndex:
                        variable.name = strData.Replace("(", "");
                        break;
                    case noteRowIndex:
                        variable.note = strData.Replace("(", "");
                        break;
                    case typeRowIndex:
                        string value = strData.Replace("(", "");

                        //如果类型为Null或""则说明，这个List的范型是基础数据类型，不需要自定义
                        if (string.IsNullOrEmpty(value))
                            variable.isBaseType = true;
                        else
                            variable.type = value;

                        break;
                }
            }

            return variable;
        }

        /// <summary>
        /// 读取普通变量的信息（类型，变量名，注释，数据）
        /// </summary>
        private EBaseStruct ReadCommonVariableInfo(string[,] data, int columnIndex)
        {
            EBaseStruct variable = new EBaseStruct();
            variable.valueList = new List<string>(data.GetLength(0));

            for (int rowIndex = 0; rowIndex < data.GetLength(0); rowIndex++)
            {
                //行-忽略检测
                if (ignoreRow.Contains(rowIndex))
                    continue;

                string strData = data[rowIndex, columnIndex];

                switch (rowIndex)
                {
                    case nameRowIndex:
                        variable.name = strData;
                        break;
                    case noteRowIndex:
                        variable.note = strData;
                        break;
                    case typeRowIndex:
                        variable.type = strData;
                        break;
                    default:
                        variable.valueList.Add(strData);
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