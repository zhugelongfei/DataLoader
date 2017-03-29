using System;
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
                //存储到目标文件
                using (FileStream fs = new FileStream(FilePathManager.BytesFilePath + fileName + ".bytes", FileMode.OpenOrCreate))
                {
                    //写入对象数量 int
                    byte[] objCount = System.BitConverter.GetBytes(sheet.rowDataCount);
                    fs.Write(objCount, 0, objCount.Length);

                    //生成数据对象，并存储信息
                    for (int i = 0; i < sheet.rowDataCount; i++)
                    {
                        //生成对象数据
                        TBase dataObj = sheet.GetDataByRowIndex(i) as TBase;

                        byte[] dataBytes = ClientThriftSerialize.Instance.Serialize(dataObj);

                        //写入此对象的长度 int
                        byte[] objLength = System.BitConverter.GetBytes(dataBytes.Length);
                        fs.Write(objLength, 0, objLength.Length);

                        fs.Write(dataBytes, 0, dataBytes.Length);
                        fs.Flush();
                    }
                }
            }
        }
    }
}