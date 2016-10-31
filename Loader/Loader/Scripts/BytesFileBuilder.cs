using System;
using System.Collections;
using System.Collections.Generic;
using System.Reflection;
using System.IO;
using Thrift.Protocol;

namespace Loader
{
    public class BytesFileBuilder
    {
        public static Assembly assembly;
        public static void BuildAllData(Dictionary<string, List<ExcelClass>> allExcelData)
        {
            assembly = Assembly.LoadFrom(FilePathManager.GetObsolutePathByRelativePath(FilePathManager.DLLFileName));

            foreach (var item in allExcelData)
            {
                //生成二进制数据文件
                BuildBytesData(assembly, item.Key, item.Value);
            }
        }

        private static void BuildBytesData(Assembly assembly, string fileName, List<ExcelClass> sheetList)
        {
            Type listType = typeof(List<>);

            foreach (ExcelClass sheet in sheetList)
            {
                //数据结构的类名
                string className = "ThriftStruct." + sheet.className;
                string classArrayName = "ThriftStruct." + sheet.className + "Array";

                //生成 数据结构类型的List泛型集合
                Type listTType = listType.MakeGenericType(assembly.GetType(className));
                IList listInstance = (IList)Activator.CreateInstance(listTType);

                //生成数据对象，并存储信息
                for (int i = 0; i < sheet.GetDataRowCount(); i++)
                {
                    object sheetObj = assembly.CreateInstance(className);

                    //获取数据对象的所有属性，赋值
                    PropertyInfo[] propertyInfoArray = sheetObj.GetType().GetProperties(BindingFlags.Public | BindingFlags.Instance);
                    foreach (var item in propertyInfoArray)
                    {
                        item.SetValue(sheetObj, sheet.GetVariableValueByVarNameAndRow(item.Name, i), null);
                    }
                    listInstance.Add(sheetObj);
                }

                //创建数据对象的Array对象，存储数据
                object sheetArrayObj = assembly.CreateInstance(classArrayName);
                PropertyInfo fieldCollition = sheetArrayObj.GetType().GetProperty("ValueList", BindingFlags.Public | BindingFlags.Instance);
                fieldCollition.SetValue(sheetArrayObj, listInstance, null);

                //将对象序列化
                byte[] bytes = ClientThriftSerialize.Instance.Serialize(sheetArrayObj as TBase);

                //存储到目标文件
                using (FileStream fs = new FileStream(FilePathManager.BytesFilePath + fileName + ".bytes", FileMode.OpenOrCreate))
                {
                    fs.Write(bytes, 0, bytes.Length);
                    fs.Close();
                }
            }
        }
    }
}