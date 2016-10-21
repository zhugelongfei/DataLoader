using Loader.ExcelStruct;
using System;
using System.Collections.Generic;
using System.Data;
using System.Text;

namespace Loader
{
    public class DataTableUtils
    {
        private const int nameRowIndex = 0;

        private const int noteRowIndex = 1;

        private const int typeRowIndex = 2;

        private const int dataRowIndex = 3;

        /// <summary>
        /// 解析DataSet内的数据结构
        /// </summary>
        public static List<ExcelSheet> AnalysisDataSetToSheetList(DataSet setData)
        {
            if (setData == null || setData.Tables == null)
                throw new ProcessExcelException("DataSet is null or tables is null");

            List<ExcelSheet> sheetList = new List<ExcelSheet>(setData.Tables.Count);
            //遍历Sheet
            for (int i = 0; i < setData.Tables.Count; i++)
            {
                DataTable sheetData = setData.Tables[i];

                //处理Sheet数据
                ExcelSheet sheet = ProcessSheetData(sheetData);

                //只加入有数据的Sheet
                if (sheet != null && sheet.ExcelVarStructDic != null && sheet.ExcelVarStructDic.Count > 0)
                    sheetList.Add(sheet);
            }
            return sheetList;
        }

        /// <summary>
        /// 处理Excel的Sheet数据，生成ExcelSheet数据体
        /// </summary>
        private static ExcelSheet ProcessSheetData(DataTable sheetData)
        {
            if (sheetData == null)
                throw new ProcessExcelException("sheetData is null");

            ExcelSheet sheet = new ExcelSheet();
            sheet.SheetName = sheetData.TableName;
            sheet.ExcelVarStructDic = new Dictionary<string, ExcelVariable>(sheetData.Columns.Count);
            //不计算变量结构的三行，得到的数据行数（包括空行和忽略行）
            int valueRowCount = Math.Max(0, sheetData.Rows.Count - dataRowIndex);

            List<int> ignoreLine = new List<int>();

            //遍历列数据
            for (int index = 0; index < sheetData.Columns.Count; index++)
            {
                DataTable columnData = sheetData.DefaultView.ToTable("Column Data", false, sheetData.Columns[index].ColumnName);

                //获取变量信息，变量名，注释，类型
                ExcelVariable excelItem = GetVariableStructFromColumn(columnData);

                if (excelItem != null)
                {
                    //证明此列数据有效，取出数据
                    excelItem.values = GetColumnObjectDataFromColumn(columnData, ignoreLine, valueRowCount, index);
                    //放入结构体中
                    sheet.AddExcelVariable(excelItem.varName, excelItem);
                }
            }
            return sheet;
        }

        /// <summary>
        /// 从列数据中，生成变量结构体
        /// </summary>
        private static ExcelVariable GetVariableStructFromColumn(DataTable columnData)
        {
            if (columnData == null || columnData.Rows == null || columnData.Rows.Count < dataRowIndex)
                throw new ProcessExcelException("columnData is null or rowCount less than 3");

            ExcelVariable excelItem = new ExcelVariable();

            for (int index = 0; index < dataRowIndex; index++)
            {
                string strData = GetDataFromRowsFirstColumn(columnData.Rows[index]);

                if (index == 0 && (string.IsNullOrEmpty(strData) || strData.Contains("#")))
                {
                    //名字包含屏蔽字，不需要这列
                    return null;
                }

                if (index == 0 && strData.StartsWith("("))
                {
                    //证明是一个LIST结构
                    DiyStructInfo diyInfo = new DiyStructInfo();
                    diyInfo.className = strData.Substring(1, strData.Length - 1);
                }

                switch (index)
                {
                    case nameRowIndex:
                        excelItem.varName = strData;
                        break;
                    case noteRowIndex:
                        excelItem.varAnnotation = strData;
                        break;
                    case typeRowIndex:
                        excelItem.varType = strData;
                        break;
                }
            }

            return excelItem;
        }

        /// <summary>
        /// 从列数据中，获取所有数据
        /// </summary>
        private static List<string> GetColumnObjectDataFromColumn(DataTable columnData, List<int> ignoreLine, int rowCount, int columnIndex)
        {
            if (columnData == null || columnData.Rows == null || ignoreLine == null)
                throw new ProcessExcelException("columnData is null or ignoreLine is zero");

            List<string> values = new List<string>(rowCount);

            //遍历3行开始一下的数据
            for (int index = dataRowIndex; index < columnData.Rows.Count; index++)
            {
                //忽略行数，不存储数值
                if (ignoreLine.Contains(index))
                    continue;

                string strData = GetDataFromRowsFirstColumn(columnData.Rows[index]);

                if (columnIndex == 0 && strData.Contains("#"))
                {
                    //行的第一列数据包含屏蔽字，或者没有数据，证明这行不需要
                    ignoreLine.Add(index);
                    continue;
                }
                //数据
                values.Add(strData);
            }
            return values;
        }

        /// <summary>
        /// 从行中获取第一列数据
        /// </summary>
        private static string GetDataFromRowsFirstColumn(DataRow row)
        {
            if (row == null || row.ItemArray == null || row.ItemArray.Length == 0)
                throw new ProcessExcelException("row is null or itemArray's length is zero");

            return row.ItemArray[0].ToString();
        }

        private static void ReadColumn(DataSet data)
        {
            //遍历Sheet
            foreach (DataTable item in data.Tables)
            {
                //遍历Sheet内的所有行
                foreach (DataColumn column in item.Columns)
                {
                    //遍历一行内的数据
                    StringBuilder sb = new StringBuilder();
                    foreach (object str in column.ColumnName)
                    {
                        sb.Append(str.ToString());
                        sb.Append("    ");
                    }
                    Console.WriteLine(sb.ToString());
                    Console.WriteLine();
                    sb.Remove(0, sb.Length);
                }
            }
        }

        private static void ReadDataByRow(DataSet data)
        {
            //遍历Sheet
            foreach (DataTable item in data.Tables)
            {
                //遍历Sheet内的所有行
                foreach (DataRow row in item.Rows)
                {
                    //遍历一行内的数据
                    StringBuilder sb = new StringBuilder();
                    foreach (object str in row.ItemArray)
                    {
                        sb.Append(str.ToString());
                        sb.Append("    ");
                    }
                    Console.WriteLine(sb.ToString());
                    Console.WriteLine();
                    Console.WriteLine();
                    sb.Remove(0, sb.Length);
                }
            }
        }
    }
}