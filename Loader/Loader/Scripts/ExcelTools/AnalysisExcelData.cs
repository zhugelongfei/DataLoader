using System;
using System.IO;
using System.Data;
using NPOI.SS.UserModel;

namespace Loader
{
    public class AnalysisExcelData
    {

        /// <summary>
        /// 加载Excel
        /// </summary>
        /// <param name="filePath">文件路径</param>
        /// <returns>所有Sheet名字</returns>
        public static DataSet LoadFile(string filePath, int readRowCount = -1)
        {
            DataSet set = null;
            //读取文件，并使用工厂生成 workBook
            using (FileStream fileStream = new FileStream(filePath, FileMode.Open, FileAccess.Read, FileShare.Read))
            {
                IWorkbook _workBook = WorkbookFactory.Create(fileStream);

                set = GetAllTables(_workBook, readRowCount);

                _workBook.Close();
                _workBook = null;
            }

            return set;
        }

        /// <summary>
        /// 获取所有数据，所有sheet的数据转化为datatable。
        /// </summary>
        public static DataSet GetAllTables(IWorkbook _workBook, int readRowCount)
        {
            if (_workBook == null)
                return null;

            DataSet dataSet = new DataSet();

            for (int index = 0; index < _workBook.NumberOfSheets; index++)
            {
                dataSet.Tables.Add(ExcelToDataTable(_workBook.GetSheetAt(index), readRowCount));
            }

            return dataSet;
        }

        /// <summary>
        /// 将excel中的数据导入到DataTable中
        /// </summary>
        /// <param name="sheetName">excel工作薄sheet的名称</param>
        /// <param name="isFirstRowColumn">第一行是否是DataTable的列名</param>
        /// <returns>返回的DataTable</returns>
        public static DataTable ExcelToDataTable(ISheet sheet, int readRowCount)
        {
            if (sheet == null)
                return null;

            try
            {
                DataTable data = new DataTable(sheet.SheetName);

                IRow firstRow = sheet.GetRow(0);

                //证明没有数据，直接返回
                if (firstRow == null)
                    return data;

                //一行最后一个cell的编号 即总的列数
                int cellCount = firstRow.LastCellNum;

                //生成列结构
                for (int i = firstRow.FirstCellNum; i < cellCount; i++)
                {
                    //从A开始计算列名
                    data.Columns.Add(new DataColumn(Convert.ToChar(('A') + i).ToString()));
                }

                //第一行标号
                int startRow = sheet.FirstRowNum;
                //最后一行的标号（等于-1表示读取所有行的数据，否则读取指定行数的数据）减一是因为索引从0开始，但是外边填的值是从1开始记
                int rowCount = readRowCount == -1 ? sheet.LastRowNum : startRow + readRowCount - 1;
                for (int i = startRow; i <= rowCount; ++i)
                {
                    IRow row = sheet.GetRow(i);

                    //没有数据的行默认是null　　
                    if (row == null)
                        continue;

                    //上边的计算列，就是为了这句代码，创建相同结构的行
                    DataRow dataRow = data.NewRow();
                    for (int j = row.FirstCellNum; j < cellCount; j++)
                    {
                        //同理，没有数据的单元格都默认是null
                        if (row.GetCell(j) != null)
                            dataRow[j - row.FirstCellNum] = row.GetCell(j, MissingCellPolicy.RETURN_NULL_AND_BLANK).ToString();
                    }
                    data.Rows.Add(dataRow);
                }

                return data;
            }
            catch (Exception ex)
            {
                Console.WriteLine("Exception: " + ex.Message);
                return null;
            }
        }

    }
}