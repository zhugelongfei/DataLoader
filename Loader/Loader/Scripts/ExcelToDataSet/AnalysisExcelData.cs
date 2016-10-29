using System.Collections.Generic;
using System.Data;
using System.IO;
using NPOI.SS.UserModel;
using System;

namespace Loader
{
    public class AnalysisExcelData : IDisposable
    {
        private IWorkbook _workBook;
        private List<string> sheetNames = null;

        ~AnalysisExcelData()
        {
            Dispose();
        }

        #region Excel信息

        /// <summary>
        /// 加载Excel
        /// </summary>
        /// <param name="filePath">文件路径</param>
        /// <returns>所有Sheet名字</returns>
        public DataSet LoadFile(string filePath)
        {
            //读取文件，并使用工厂生成 workBook
            using (FileStream fileStream = new FileStream(filePath, FileMode.Open, FileAccess.Read, FileShare.Read))
            {
                _workBook = WorkbookFactory.Create(fileStream);
            }

            sheetNames = GetSheetNames();

            return GetAllTables();
        }

        /// <summary>
        /// 获取Excel中的所有Sheet名称
        /// </summary>
        private List<string> GetSheetNames()
        {
            List<string> sheetNames = new List<string>();

            //遍历Sheet的名字，添加到集合中
            int count = _workBook.NumberOfSheets;
            for (int i = 0; i < count; i++)
            {
                sheetNames.Add(_workBook.GetSheetName(i));
            }
            return sheetNames;
        }

        #endregion

        #region 获取数据源

        /// <summary>
        /// 获取所有数据，所有sheet的数据转化为datatable。
        /// </summary>
        public DataSet GetAllTables(int readRowCount = -1)
        {
            DataSet dataSet = new DataSet();

            foreach (string sheetName in sheetNames)
            {
                dataSet.Tables.Add(ExcelToDataTable(sheetName, readRowCount));
            }

            return dataSet;
        }

        /// <summary>
        /// 获取第<paramref name="index"/>的sheet的数据
        /// </summary>
        /// <param name="index">Excel文件的第几个sheet表</param>
        public DataTable GetTable(int index)
        {
            if (index >= sheetNames.Count || index < 0)
                throw new Exception("Do not Get This Sheet");
            return ExcelToDataTable(sheetNames[index]);
        }

        /// <summary>
        /// 获取sheet名称为<paramref name="sheetName"/>的数据
        /// </summary>
        /// <param name="sheetName">Sheet名称</param>
        public DataTable GetTable(string sheetName, bool isFirstRowColumn)
        {
            return ExcelToDataTable(sheetName);
        }

        #endregion

        #region 解析Sheet方法

        /// <summary>
        /// 将excel中的数据导入到DataTable中
        /// </summary>
        /// <param name="sheetName">excel工作薄sheet的名称</param>
        /// <param name="isFirstRowColumn">第一行是否是DataTable的列名</param>
        /// <returns>返回的DataTable</returns>
        public DataTable ExcelToDataTable(string sheetName, int readRowCount = -1)
        {
            try
            {
                DataTable data = new DataTable(sheetName);

                //根据名字，取得Sheet对象
                ISheet sheet = sheetName != null ? _workBook.GetSheet(sheetName) : _workBook.GetSheetAt(0);
                if (sheet == null)
                    throw new Exception(string.Format("Don't have This Sheet.Sheet name is {0}", sheetName));

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

        #endregion

        public void Dispose()
        {
            //因为这个类不是自己写的，而且这个对象有做过流操作，所以在这里关闭对象，以防无法释放资源
            if (_workBook != null)
                _workBook.Close();
            _workBook = null;
        }
    }
}