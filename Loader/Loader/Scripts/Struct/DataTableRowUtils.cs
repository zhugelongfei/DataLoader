using System.Collections.Generic;
using System.Data;

namespace Loader
{
    public class DataTableRowUtils
    {
        private const int nameRowIndex = 0;

        private const int noteRowIndex = 1;

        private const int typeRowIndex = 2;

        private const int dataRowIndex = 3;

        /// <summary>
        /// 解析DataSet内的数据结构
        /// </summary>
        public static List<ExcelSheet> AnalysisDataSetToSheetList(DataSet setData, Dictionary<string, ExcelVariable> diyStructDic)
        {
            if (setData == null || setData.Tables == null)
                throw new ProcessExcelException("DataSet is null or tables is null");

            List<ExcelSheet> sheetList = new List<ExcelSheet>(setData.Tables.Count);

            //遍历Sheet
            for (int i = 0; i < setData.Tables.Count; i++)
            {
                DataTable sheetData = setData.Tables[i];

                //处理Sheet数据
                ExcelSheet sheet = Gen(sheetData, diyStructDic);

                //只加入有数据的Sheet
                if (sheet != null && sheet.ExcelVarStructDic != null && sheet.ExcelVarStructDic.Count > 0)
                    sheetList.Add(sheet);
            }
            return sheetList;
        }

        public static ExcelSheet Gen(DataTable sheetSet, Dictionary<string, ExcelVariable> diyStructDic)
        {
            ExcelSheet sheet = new ExcelSheet();
            sheet.SheetName = sheetSet.TableName;
            sheet.ExcelVarStructDic = new Dictionary<string, ExcelVariable>(sheetSet.Columns.Count);

            string[,] data = Convert(sheetSet);

            List<int> ignoreColumn = new List<int>();
            List<int> ignoreRow = new List<int>();

            bool isListStart = false;

            //自定义结构信息
            ExcelVariable listStructVar = null;
            DiyStructInfo diyStruct = null;
            DiyStructInfo copyStruct = null;
            int index = 0;
            int copyIndex = 0;

            for (int columnIndex = 0; columnIndex < data.GetLength(1); columnIndex++)
            {
                #region 忽略检测

                //检测这列是否被忽略
                if (ignoreColumn.Contains(columnIndex))
                    continue;

                //检测这列第一行数据，判断是否是忽略列
                if (IsIgnro(data[nameRowIndex, columnIndex]))
                {
                    ignoreColumn.Add(columnIndex);
                    continue;
                }

                #endregion

                string nameValue = data[nameRowIndex, columnIndex];

                ExcelVariable variable = null;

                if (nameValue.StartsWith("("))
                {
                    //初始化数据
                    listStructVar = new ExcelVariable();
                    diyStruct = new DiyStructInfo();
                    index = 0;
                    copyIndex = 0;

                    listStructVar.diyVarType.Add(diyStruct);

                    //处理List头数据
                    ProcessListHead(listStructVar, data, columnIndex);

                    sheet.ExcelVarStructDic[listStructVar.varName] = listStructVar;

                    isListStart = true;
                }
                else if (nameValue.StartsWith(")"))
                {
                    //处理基本数据类型
                    if (listStructVar.isBaseType)
                    {
                        listStructVar.varType = listStructVar.diyVarType[0].varDic[0].GetThriftTypeByStr();
                    }
                    else
                    {
                        if (!diyStructDic.ContainsKey(listStructVar.varType))
                        {
                            diyStructDic.Add(listStructVar.varType, listStructVar);
                        }
                    }

                    isListStart = false;
                }
                else
                {
                    //三个值全是空，并且List开始了，那就是 结构开始循环了
                    if (isListStart && string.IsNullOrEmpty(data[nameRowIndex, columnIndex]))
                    {
                        if (copyStruct == null)
                            copyStruct = new DiyStructInfo();

                        copyStruct.varDic.Add(copyIndex, diyStruct.varDic[copyIndex].Clone());
                        copyIndex++;

                        if (copyIndex >= index)
                        {
                            //证明变量数量够了，一个自定义结构体构造完成
                            listStructVar.diyVarType.Add(copyStruct);
                            copyStruct = null;
                            copyIndex = 0;
                        }

                        continue;
                    }

                    //普通变量
                    variable = new ExcelVariable();
                    for (int rowIndex = 0; rowIndex < data.GetLength(0); rowIndex++)
                    {
                        string strData = data[rowIndex, columnIndex];

                        switch (rowIndex)
                        {
                            case nameRowIndex:
                                variable.varName = strData;
                                break;
                            case noteRowIndex:
                                variable.varAnnotation = strData;
                                break;
                            case typeRowIndex:
                                variable.varType = strData;
                                break;
                            default:
                                variable.values.Add(strData);
                                break;
                        }

                    }

                }

                if (variable != null)
                {
                    //变量归属问题
                    if (isListStart)
                    {
                        diyStruct.varDic.Add(index++, variable);
                    }
                    else
                    {
                        //存储变量
                        sheet.ExcelVarStructDic[variable.varName] = variable;
                    }
                    variable = null;
                }
            }

            return sheet;
        }


        private static void ProcessListHead(ExcelVariable variable, string[,] data, int columnIndex)
        {
            for (int rowIndex = 0; rowIndex < dataRowIndex; rowIndex++)
            {
                string strData = data[rowIndex, columnIndex];

                switch (rowIndex)
                {
                    case nameRowIndex:
                        variable.varName = strData.Replace("(", "");
                        break;
                    case noteRowIndex:
                        variable.varAnnotation = strData;
                        break;
                    case typeRowIndex:
                        string value = strData.Replace("(", "");
                        if (string.IsNullOrEmpty(value))
                        {
                            //代表基础数据类型，不需要自定义类型
                            variable.isBaseType = true;
                        }
                        else
                        {
                            variable.varType = value;
                        }
                        break;
                }
            }
        }

        private static bool IsIgnro(string str)
        {
            return str.StartsWith("#");
        }


        public static string[,] Convert(DataTable table)
        {
            string[,] data = new string[table.Rows.Count, table.Columns.Count];

            for (int rowIndex = 0; rowIndex < table.Rows.Count; rowIndex++)
            {
                DataRow rowData = table.Rows[rowIndex];
                for (int columnIndex = 0; columnIndex < rowData.ItemArray.Length; columnIndex++)
                {
                    string strData = rowData.ItemArray[columnIndex].ToString();
                    data[rowIndex, columnIndex] = strData;
                }
            }
            return data;
        }

    }
}