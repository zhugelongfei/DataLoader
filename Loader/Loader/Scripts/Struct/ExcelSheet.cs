using System.Text;
using System.Collections.Generic;

namespace Loader
{
    public class ExcelSheet
    {
        public string SheetName { get; set; }

        public Dictionary<string, ExcelVariable> ExcelVarStructDic { get; set; }

        public int GetDataRowCount()
        {
            foreach (var item in ExcelVarStructDic)
            {
                return item.Value.values.Count;
            }
            return 0;
        }

        public void AddExcelVariable(string varName, ExcelVariable var)
        {
            ExcelVarStructDic.Add(varName, var);
        }

        /// <summary>
        /// 根据变量名和行数，获取值
        /// </summary>
        public object GetVariableValueByVarNameAndRow(string varName, int index)
        {
            if (!ExcelVarStructDic.ContainsKey(varName) || ExcelVarStructDic[varName] == null)
            {
                return null;
            }

            return ExcelVarStructDic[varName].GetValueByRowCount(index);
        }

        public override string ToString()
        {
            StringBuilder strCache = new StringBuilder(ExcelVarStructDic.Count * 10);
            foreach (var item in ExcelVarStructDic.Values)
            {
                strCache.Append(item.CreateFieldString(0));
                strCache.Append("\r\n");
            }
            return strCache.ToString();
        }

    }
}
