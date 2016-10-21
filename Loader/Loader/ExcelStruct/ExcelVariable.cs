using System.Collections.Generic;
using System.Text;

namespace Loader
{
    public class ExcelVariable
    {
        /// <summary>
        /// 变量名
        /// </summary>
        public string varName;

        /// <summary>
        /// 变量类型
        /// </summary>
        public string varType;

        /// <summary>
        /// 变量注释
        /// </summary>
        public string varAnnotation;

        /// <summary>
        /// 所有的值
        /// </summary>
        public List<string> values;

        public DiyStructInfo diyVarType;

        public bool IsCommonType()
        {
            return !string.IsNullOrEmpty(GetThriftTypeByStr());
        }

        public object GetValueByRowCount(int index)
        {
            if (values!= null && values.Count > index)
            {
                return GetValueByType(values[index]);
            }
            return null;
        }

        private object GetValueByType(string value)
        {
            object obj = null;
            switch (varType)
            {
                case "boolean":
                    obj = !string.IsNullOrEmpty(value) && value.Equals("1");
                    break;
                case "byte":
                    obj = byte.Parse(value);
                    break;
                case "short":
                    obj = short.Parse(value);
                    break;
                case "int":
                    obj = int.Parse(value);
                    break;
                case "long":
                    obj = long.Parse(value);
                    break;
                case "double":
                    obj = double.Parse(value);
                    break;
                case "string":
                    obj = value;
                    break;
                case "String":
                    obj = value;
                    break;
            }
            return obj;
        }


        public string CreateFieldString(int index)
        {
            StringBuilder strCache = new StringBuilder();
            strCache.Append(index.ToString());
            strCache.Append(":  ");
            strCache.Append(GetThriftTypeByStr());
            strCache.Append("   ");
            strCache.Append(varName);

            return strCache.ToString();
        }

        private string GetThriftTypeByStr()
        {
            string thriftType = null;
            switch (varType)
            {
                case "boolean":
                    thriftType = "bool";
                    break;
                case "byte":
                    thriftType = "byte";
                    break;
                case "short":
                    thriftType = "i16";
                    break;
                case "int":
                    thriftType = "i32";
                    break;
                case "long":
                    thriftType = "i64";
                    break;
                case "double":
                    thriftType = "double";
                    break;
                case "string":
                    thriftType = "string";
                    break;
            }

            return thriftType;
        }

    }
}