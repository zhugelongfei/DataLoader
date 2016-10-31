using System.Text;
using System.Collections.Generic;

namespace Loader
{
    public class ExcelClass
    {
        public string className;
        public Dictionary<string, ExcelVariable> variablesDic = new Dictionary<string, ExcelVariable>();

        public Dictionary<string, ExcelVariable> VarDic { get { return variablesDic; } }

        #region NVelocity 使用属性

        //注：属性时在NVelocity中使用的，工程尽量不要使用属性访问，提高运行速度
        public string ClassName { get { return className; } }
        public Dictionary<string, ExcelVariable> ExcelVarStructDic { get { return variablesDic; } }

        #endregion

        public int GetDataRowCount()
        {
            foreach (var item in variablesDic)
            {
                return item.Value.values.Count;
            }
            return 0;
        }

        public void AddExcelVariable(string varName, ExcelVariable var)
        {
            variablesDic.Add(varName, var);
        }

        /// <summary>
        /// 根据变量名和行数，获取值
        /// </summary>
        public object GetVariableValueByVarNameAndRow(string varName, int index)
        {
            if (!variablesDic.ContainsKey(varName) || variablesDic[varName] == null)
            {
                System.Console.WriteLine("Error:不存在数据类型 : " + varName);
                return null;
            }

            return variablesDic[varName].GetValueByRowCount(index);
        }

        public override string ToString()
        {
            StringBuilder strCache = new StringBuilder(variablesDic.Count * 10);
            foreach (var item in variablesDic.Values)
            {
                strCache.Append(item.CreateFieldString(0));
                strCache.Append("\r\n");
            }
            return strCache.ToString();
        }

    }
}
