//using System.Text;
//using System.Collections;
//using System.Collections.Generic;
//using System;
//using System.Reflection;

//namespace Loader
//{
//    public class ExcelVariable
//    {
//        public bool isListStruct = false;

//        public bool isBaseType = false;

//        /// <summary>
//        /// 变量名
//        /// </summary>
//        public string varName;

//        /// <summary>
//        /// 变量类型
//        /// </summary>
//        public string varType;

//        /// <summary>
//        /// 变量注释
//        /// </summary>
//        public string varNote;

//        /// <summary>
//        /// 所有的值
//        /// </summary>
//        public List<string> values = new List<string>();

//        /// <summary>
//        /// 自定义数据结构
//        /// </summary>
//        public List<ExcelClass> diyVarType = new List<ExcelClass>();

//        #region NVelocity 使用的属性和函数

//        public string VarName { get { return varName; } }
//        public string VarType { get { return varType; } }
//        public string VarNote { get { return varNote; } }
//        public ExcelClass DiyVarType { get { return diyVarType[0]; } }

//        /// <summary>
//        /// 创建字段声明的字符串
//        /// </summary>
//        /// <param name="index">字段索引</param>
//        public string CreateFieldString(int index)
//        {
//            StringBuilder strCache = new StringBuilder(20);

//            //1：变量ID
//            strCache.Append(index.ToString());
//            strCache.Append(":  ");

//            //2：变量类型
//            if (diyVarType.Count > 0)
//            {
//                strCache.Append("list<");
//                //List自定义数据是结构
//                if (isBaseType)
//                {
//                    strCache.Append(ConvertThriftTypeByVarType());
//                }
//                else
//                {
//                    strCache.Append("public.");
//                    strCache.Append(varType);
//                }
//                strCache.Append(">");
//            }
//            else
//            {
//                strCache.Append(ConvertThriftTypeByVarType());
//            }

//            //3：变量名
//            strCache.Append("   ");
//            strCache.Append(varName);

//            return strCache.ToString();
//        }

//        /// <summary>
//        /// 转换Excel里填写的类型为Thrift类型
//        /// </summary>
//        private string ConvertThriftTypeByVarType()
//        {
//            string thriftType = null;
//            switch (varType)
//            {
//                case "boolean":
//                    thriftType = "bool";
//                    break;
//                case "byte":
//                    thriftType = "byte";
//                    break;
//                case "short":
//                    thriftType = "i16";
//                    break;
//                case "int":
//                    thriftType = "i32";
//                    break;
//                case "long":
//                    thriftType = "i64";
//                    break;
//                case "double":
//                    thriftType = "double";
//                    break;
//                case "string":
//                case "String":
//                    thriftType = "string";
//                    break;
//            }
//            return thriftType;
//        }

//        #endregion

//        /// <summary>
//        /// 根据行号获取该行的数据
//        /// </summary>
//        public object GetValueByRowCount(int index)
//        {
//            if (!isListStruct)
//            {
//                //普通变量
//                if (values != null && values.Count > index)
//                {
//                    return ConvertValueByType(values[index]);
//                }
//            }
//            else
//            {
//                //List数据结构
//                Type listType = typeof(List<>);
//                Type listTypeInstance = null;
//                IList listInstance = null;

//                if (isBaseType)
//                {
//                    listTypeInstance = listType.MakeGenericType(GetThisVariableType());
//                    listInstance = (IList)Activator.CreateInstance(listTypeInstance);

//                    //生成数据对象，并存储信息
//                    foreach (var item in diyVarType)
//                    {
//                        foreach (ExcelVariable var in item.variablesDic.Values)
//                        {
//                            listInstance.Add(var.GetValueByRowCount(index));
//                        }
//                    }
//                }
//                else
//                {
//                    string className = "ThriftStruct." + varType;
//                    listTypeInstance = listType.MakeGenericType(BytesFileBuilder.assembly.GetType(className));
//                    listInstance = (IList)Activator.CreateInstance(listTypeInstance);

//                    //生成数据对象，并存储信息
//                    foreach (var classData in diyVarType)
//                    {
//                        object diyClassObj = BytesFileBuilder.assembly.CreateInstance(className);
//                        //获取数据对象的所有属性，赋值
//                        PropertyInfo[] propertyInfoArray = diyClassObj.GetType().GetProperties(BindingFlags.Public | BindingFlags.Instance);
//                        foreach (var item in propertyInfoArray)
//                        {
//                            item.SetValue(diyClassObj, classData.GetVariableValueByVarNameAndRow(item.Name, index), null);
//                        }
//                        listInstance.Add(diyClassObj);
//                    }
//                }

//                return listInstance;
//            }

//            return null;
//        }

//        /// <summary>
//        /// 根据数据类型，转换为数据对象
//        /// </summary>
//        private object ConvertValueByType(string value)
//        {
//            object obj = null;
//            switch (varType)
//            {
//                case "boolean":
//                    obj = !string.IsNullOrEmpty(value) || value.Equals("0");
//                    break;
//                case "byte":
//                    obj = byte.Parse(value);
//                    break;
//                case "short":
//                    obj = short.Parse(value);
//                    break;
//                case "int":
//                    obj = int.Parse(value);
//                    break;
//                case "long":
//                    obj = long.Parse(value);
//                    break;
//                case "double":
//                    obj = double.Parse(value);
//                    break;
//                case "string":
//                    obj = value == null ? value : value.ToLower();
//                    break;
//                case "String":
//                    obj = value;
//                    break;
//            }
//            return obj;
//        }

//        /// <summary>
//        /// 获取这个变量的基本数据类型
//        /// </summary>
//        private Type GetThisVariableType()
//        {
//            Type type = null;
//            switch (varType)
//            {
//                case "boolean":
//                    type = typeof(bool);
//                    break;
//                case "byte":
//                    type = typeof(byte);
//                    break;
//                case "short":
//                    type = typeof(short);
//                    break;
//                case "int":
//                    type = typeof(int);
//                    break;
//                case "long":
//                    type = typeof(long);
//                    break;
//                case "double":
//                    type = typeof(double);
//                    break;
//                case "string":
//                case "String":
//                    type = typeof(string);
//                    break;
//            }
//            return type;
//        }

//        /// <summary>
//        /// 克隆变量的结构信息（不包括值）
//        /// </summary>
//        public ExcelVariable Clone()
//        {
//            ExcelVariable var = new ExcelVariable();

//            var.varName = varName;
//            var.varType = varType;
//            var.varNote = varNote;

//            return var;
//        }
//    }
//}