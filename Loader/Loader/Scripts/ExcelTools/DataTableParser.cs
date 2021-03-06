﻿using System.Collections.Generic;
using System.Data;

namespace Loader
{
    public class DataTableParser
    {
        /// <summary>
        /// 变量名行
        /// </summary>
        private const int NAME_ROW_INDEX = 0;

        /// <summary>
        /// 注释行
        /// </summary>
        private const int NOTE_ROW_INDEX = 1;

        /// <summary>
        /// 变量类型行
        /// </summary>
        private const int TYPE_ROW_INDEX = 2;

        /// <summary>
        /// 数据开始行
        /// </summary>
        private const int DATA_ROW_INDEX = 3;

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
        public List<EClass> AnalysisDataSetToSheetList(DataSet setData)
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
                EClass sheet = GenerateSheetInfo(sheetData);

                //只加入有数据的Sheet
                if (sheet != null && sheet.IsHasVaildData())
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
                if (rowIndex >= DATA_ROW_INDEX && string.IsNullOrEmpty(data[rowIndex, 0]) || IsIgnro(data[rowIndex, 0]))
                    ignoreRow.Add(rowIndex);
            }

            //忽略列集合
            for (int columnIndex = 0; columnIndex < data.GetLength(1); columnIndex++)
            {
                if (IsIgnro(data[NAME_ROW_INDEX, columnIndex]))
                    ignoreColumn.Add(columnIndex);
            }
        }

        /// <summary>
        /// 生成类型信息
        /// </summary>
        public EClass GenerateSheetInfo(DataTable sheetSet)
        {
            //1：初始化ExcelSheet信息
            EClass sheet = new EClass(sheetSet.Columns.Count);
            sheet.name = sheetSet.TableName;
            sheet.type = sheetSet.TableName;

            //2：转换DataTable为string的二维数组
            string[,] data = DataTableConvertToStringArray(sheetSet);
            sheet.rowDataCount = data.GetLength(0) - DATA_ROW_INDEX;

            //3：获取忽略行列集合
            LoadExcelIgnoreColumnAndRow(data);

            //4：读取结构信息
            EListVariable listVar = null;

            for (int columnIndex = 0; columnIndex < data.GetLength(1); columnIndex++)
            {
                string headValue = data[NAME_ROW_INDEX, columnIndex];

                //列-忽略检测
                if (ignoreColumn.Contains(columnIndex))
                    continue;

                if (headValue.StartsWith("("))
                {
                    //情况1：List开始

                    isListStart = true;

                    //初始化数据，读取List结构信息
                    listVar = ReadListVariableInfo(data, columnIndex);

                    sheet.AddVariable(listVar);
                }
                else if (headValue.StartsWith(")"))
                {
                    //情况2：List结束

                    isListStart = false;

                    if (!listVar.isBaseType)
                    {
                        //加入自定义类型列表中
                        sheet.AddDiyClass(listVar.GetDiyClassType());
                    }
                    listVar.ClearData();
                }
                else
                {
                    //情况3：正常读取一个变量

                    EBaseStruct variable = ReadCommonVariableInfo(data, columnIndex);

                    //变量归属问题
                    if (isListStart)
                    {
                        if (!string.IsNullOrEmpty(headValue))
                        {
                            //证明还在确定自定义类型结构中
                            listVar.AddVarToDiyClass(variable);
                        }
                        else
                        {
                            //证明自定义类型结构已确定，开始结构循环
                            listVar.AddVarToCopyClass(variable);
                        }
                    }
                    else
                    {
                        //普通变量，存储到Sheet中
                        sheet.AddVariable(variable);
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

            for (int rowIndex = 0; rowIndex < DATA_ROW_INDEX; rowIndex++)
            {
                string strData = data[rowIndex, columnIndex];

                switch (rowIndex)
                {
                    case NAME_ROW_INDEX:
                        variable.name = strData.Replace("(", "");
                        break;
                    case NOTE_ROW_INDEX:
                        variable.note = strData.Replace("(", "");
                        break;
                    case TYPE_ROW_INDEX:
                        string value = strData.Replace("(", "");

						//如果类型为Null或""则说明，这个List的范型是基础数据类型，不需要自定义
						if (EVariable.IsBaseType(value))
						{
							variable.type = value;
							variable.isBaseType = true;
						}
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
            EBaseStruct variable = new EBaseStruct(data.GetLength(0));

            for (int rowIndex = 0; rowIndex < data.GetLength(0); rowIndex++)
            {
                //行-忽略检测
                if (ignoreRow.Contains(rowIndex))
                    continue;

                string strData = data[rowIndex, columnIndex];

                switch (rowIndex)
                {
                    case NAME_ROW_INDEX:
                        variable.name = strData;
                        break;
                    case NOTE_ROW_INDEX:
                        variable.note = strData;
                        break;
                    case TYPE_ROW_INDEX:
                        variable.type = strData;
                        break;
                    default:
                        variable.AddValue(strData);
                        break;
                }
            }
            return variable;
        }

        /// <summary>
        /// 检测一个字符串是否代表忽略
        /// </summary>
        private bool IsIgnro(string str)
        {
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