using System.Collections.Generic;
using System.IO;
using System.Reflection;
using Thrift.Protocol;

namespace Loader
{
    public class BytesFileBuilder
    {
        private static Assembly assembly;

        public static void InitAssembly()
        {
            if (!File.Exists(FilePathManager.GetObsolutePathByRelativePath(FilePathManager.DLLFileName)))
            {
                throw new System.Exception("Can not found dll file:    " + FilePathManager.DLLFileName);
            }
            assembly = Assembly.LoadFrom(FilePathManager.GetObsolutePathByRelativePath(FilePathManager.DLLFileName));
        }

        public static System.Type GetTypeFromAssembly(string type)
        {
            return assembly.GetType(FilePathManager.ThriftNameSpace + type); ;
        }

        public static object CreateInstance(string type)
        {
            return assembly.CreateInstance(FilePathManager.ThriftNameSpace + type);
        }

        public static void BuildBytesData(string fileName, List<EClass> sheetList)
        {
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