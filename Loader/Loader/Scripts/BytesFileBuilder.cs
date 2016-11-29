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
        public static void BuildAllData(Dictionary<string, List<EClass>> allExcelData)
        {
            assembly = Assembly.LoadFrom(FilePathManager.GetObsolutePathByRelativePath(FilePathManager.DLLFileName));

            foreach (var item in allExcelData)
            {
                //生成二进制数据文件
                BuildBytesData(assembly, item.Key, item.Value);
            }
        }

        private static void BuildBytesData(Assembly assembly, string fileName, List<EClass> sheetList)
        {
            Type listType = typeof(List<>);

            foreach (EClass sheet in sheetList)
            {
                //数据结构的类名
                string className = "ThriftStruct." + sheet.name;
                string classArrayName = "ThriftStruct." + sheet.name + "Array";

                //生成 数据结构类型的List泛型集合
                Type listTType = listType.MakeGenericType(assembly.GetType(className));
                IList listInstance = (IList)Activator.CreateInstance(listTType);

                //生成数据对象，并存储信息
                for (int i = 0; i < sheet.rowDataCount; i++)
                {
                    //生成对象数据，存储到List中
                    listInstance.Add(sheet.GetDataByRowIndex(i));
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
                }
            }
        }
    }
}