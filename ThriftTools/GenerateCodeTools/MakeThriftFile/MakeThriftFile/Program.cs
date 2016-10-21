namespace MakeThriftFile
{
    using System;
    using System.Collections.Generic;
    using System.IO;
    using System.Linq;
    using System.Text;

    internal class Program
    {
        private static int ERROR = 3;
        private static int fixCount = 1;
        private static string fixToRead = "public void Read (TProtocol iprot)";
        private static string fixToString = "public override string ToString()";
        private static string fixToWrite = "public void Write(TProtocol oprot)";
        private static int iniCount = 300;
        private static int ONLYREAD = 1;
        private static int ONLYWRITE = 0;
        private static string replaceStr = "\n";
        private static string replaceWriteOrReader = "\nClientLog.Instance.LogError(\"This function is deleted.\");\n";
        private static int WRITEANDREAD = 2;

        private static int[] GetIndexArray(int startIndex, string text)
        {
            int[] numArray = new int[2];
            if ((text == null) || (text == ""))
            {
                return null;
            }
            char[] chArray = text.ToCharArray();
            List<char> list = null;
            int index = startIndex;
            int length = chArray.Length;
            while (index < length)
            {
                char item = chArray[index];
                switch (item)
                {
                    case '{':
                    case '}':
                        if (list == null)
                        {
                            list = new List<char>();
                        }
                        if (item == '{')
                        {
                            if (list.Count == 0)
                            {
                                numArray[0] = index;
                            }
                            list.Add(item);
                        }
                        else if (list.Count > 0)
                        {
                            list.RemoveAt(0);
                        }
                        break;
                }
                if ((list != null) && (list.Count == 0))
                {
                    numArray[1] = index;
                    return numArray;
                }
                index++;
            }
            return numArray;
        }

        private static List<string> GetNoNeedMakeFiles()
        {
            List<string> list = new List<string>();
            IniReader reader = new IniReader();
            FileStream stream = File.Open(Directory.GetCurrentDirectory() + @"\MakeThriftFileSetUp.ini", FileMode.Open);
            byte[] buffer = new byte[stream.Length];
            stream.Read(buffer, 0, buffer.Length);
            string strInfo = Encoding.Default.GetString(buffer);
            reader.Parse(strInfo);
            for (int i = 0; i < iniCount; i++)
            {
                string item = reader.GetString("Dispose", (i + 1).ToString(), "");
                if (item != "")
                {
                    list.Add(item);
                }
            }
            return list;
        }

        private static string GetReaderString(string text)
        {
            if (text == null)
            {
                return null;
            }
            try
            {
                int index = text.IndexOf(fixToRead);
                if (index == -1)
                {
                    return null;
                }
                int[] indexArray = GetIndexArray(index, text);
                if (indexArray == null)
                {
                    return null;
                }
                return text.Substring(indexArray[0] + fixCount, indexArray[1] - (indexArray[0] + fixCount));
            }
            catch (Exception exception)
            {
                Console.WriteLine(exception.Message);
                return null;
            }
        }

        private static string GetToStringString(string text)
        {
            if (text == null)
            {
                return null;
            }
            try
            {
                int index = text.IndexOf(fixToString);
                if (index == -1)
                {
                    return null;
                }
                int[] indexArray = GetIndexArray(index, text);
                if (indexArray == null)
                {
                    return null;
                }
                return text.Substring(index, (indexArray[1] - index) + fixCount);
            }
            catch (Exception exception)
            {
                Console.WriteLine(exception.Message);
                return null;
            }
        }

        private static string GetWriteString(string text)
        {
            if (text == null)
            {
                return null;
            }
            try
            {
                int index = text.IndexOf(fixToWrite);
                if (index == -1)
                {
                    return null;
                }
                int[] indexArray = GetIndexArray(index, text);
                if (indexArray == null)
                {
                    return null;
                }
                return text.Substring(indexArray[0] + fixCount, indexArray[1] - (indexArray[0] + fixCount));
            }
            catch (Exception exception)
            {
                Console.WriteLine(exception.Message);
                return null;
            }
        }

        private static void InitLoadData()
        {
            IniReader reader = new IniReader();
            string path = Directory.GetCurrentDirectory() + @"\MakeThriftFileSetUp.ini";
            if (File.Exists(path))
            {
                FileStream stream = File.Open(path, FileMode.Open);
                byte[] buffer = new byte[stream.Length];
                stream.Read(buffer, 0, buffer.Length);
                stream.Flush();
                stream.Close();
                stream.Dispose();
                string strInfo = Encoding.Default.GetString(buffer);
                reader.Parse(strInfo);
                int type = reader.GetInt("config", "type", -1);
                if (type == -1)
                {
                    Console.WriteLine("配置表操作类型读取失败");
                }
                else
                {
                    string str3 = reader.GetString("config", "path", "");
                    MessageDispose(type, str3);
                }
            }
        }

        private static void Main(string[] args)
        {
            Console.WriteLine("begin");
            InitLoadData();
            Console.WriteLine("success");
            Console.ReadKey();
        }

        private static void MakeFileByType(MakeFileInfo info)
        {
            if (info != null)
            {
                MakeType type = info.type;
                FileInfo fileInfo = info.fileInfo;
                Console.WriteLine(fileInfo.FullName);
                if (fileInfo != null)
                {
                    switch (type)
                    {
                        case MakeType.ONLYWRITE:
                            MakeOnlyWriteFile(fileInfo);
                            break;

                        case MakeType.ONLYREAD:
                            MakeOnlyReadFile(fileInfo);
                            break;

                        case MakeType.WRITEANDREAD:
                            MakeWriteAndReadFile(fileInfo);
                            break;
                    }
                }
            }
        }

        private static void MakeFilesByType(List<MakeFileInfo> infoArray)
        {
            if ((infoArray != null) && (infoArray.Count != 0))
            {
                int num = 0;
                int count = infoArray.Count;
                while (num < count)
                {
                    MakeFileInfo info = infoArray[num];
                    if (info != null)
                    {
                        MakeFileByType(info);
                    }
                    num++;
                }
            }
        }

        private static void MakeOnlyReadFile(FileInfo info)
        {
            string fullName = info.FullName;
            string text = null;
            FileStream stream = File.Open(fullName, FileMode.Open);
            byte[] buffer = new byte[stream.Length];
            stream.Read(buffer, 0, buffer.Count<byte>());
            text = Encoding.Default.GetString(buffer);
            string toStringString = GetToStringString(text);
            if ((toStringString != null) && (toStringString != ""))
            {
                text = text.Replace(toStringString, replaceStr);
            }
            string writeString = GetWriteString(text);
            if ((writeString != null) && (writeString != ""))
            {
                text = text.Replace(writeString, replaceWriteOrReader);
            }
            byte[] bytes = Encoding.Default.GetBytes(text);
            stream.Flush();
            stream.Close();
            stream.Dispose();
            stream = File.Open(fullName, FileMode.Create);
            stream.Write(bytes, 0, bytes.Length);
            stream.Flush();
            stream.Close();
            stream.Dispose();
        }

        private static void MakeOnlyWriteFile(FileInfo info)
        {
            string fullName = info.FullName;
            string text = null;
            FileStream stream = File.Open(fullName, FileMode.Open);
            byte[] buffer = new byte[stream.Length];
            stream.Read(buffer, 0, buffer.Count<byte>());
            text = Encoding.Default.GetString(buffer);
            string toStringString = GetToStringString(text);
            if ((toStringString != null) && (toStringString != ""))
            {
                text = text.Replace(toStringString, replaceStr);
            }
            string readerString = GetReaderString(text);
            if ((readerString != null) && (readerString != ""))
            {
                text = text.Replace(readerString, replaceWriteOrReader);
            }
            byte[] bytes = Encoding.Default.GetBytes(text);
            stream.Flush();
            stream.Close();
            stream.Dispose();
            stream = File.Open(fullName, FileMode.Create);
            stream.Write(bytes, 0, bytes.Length);
            stream.Flush();
            stream.Close();
            stream.Dispose();
        }

        private static void MakeWriteAndReadFile(FileInfo info)
        {
            string fullName = info.FullName;
            string text = null;
            FileStream stream = File.Open(fullName, FileMode.Open);
            byte[] buffer = new byte[stream.Length];
            stream.Read(buffer, 0, buffer.Count<byte>());
            text = Encoding.Default.GetString(buffer);
            string toStringString = GetToStringString(text);
            if ((toStringString != null) && (toStringString != ""))
            {
                text = text.Replace(toStringString, replaceStr);
            }
            byte[] bytes = Encoding.Default.GetBytes(text);
            stream.Flush();
            stream.Close();
            stream.Dispose();
            stream = File.Open(fullName, FileMode.Create);
            stream.Write(bytes, 0, bytes.Length);
            stream.Flush();
            stream.Close();
            stream.Dispose();
        }

        private static void MessageDispose(int type, string path)
        {
            List<string> noNeedMakeFiles = GetNoNeedMakeFiles();
            List<MakeFileInfo> infoArray = new List<MakeFileInfo>();
            DirectoryInfo info = new DirectoryInfo(path);
            if (info != null)
            {
                List<FileInfo> list3 = info.GetFiles("*.cs").ToList<FileInfo>();
                int num = 0;
                int count = list3.Count;
                while (num < count)
                {
                    FileInfo info2 = list3[num];
                    string name = info2.Name;
                    if (name.Contains(".cs"))
                    {
                        name = name.Replace(".cs", "");
                    }
                    if ((noNeedMakeFiles == null) || !noNeedMakeFiles.Contains(name))
                    {
                        MakeFileInfo item = new MakeFileInfo {
                            fileInfo = info2
                        };
                        if (type != ERROR)
                        {
                            item.type = (MakeType) type;
                            infoArray.Add(item);
                        }
                        else
                        {
                            string str2 = info2.Name;
                            if (str2.StartsWith("SC"))
                            {
                                item.type = MakeType.ONLYREAD;
                                infoArray.Add(item);
                            }
                            else if (str2.StartsWith("CS"))
                            {
                                item.type = MakeType.ONLYWRITE;
                                infoArray.Add(item);
                            }
                        }
                    }
                    num++;
                }
                MakeFilesByType(infoArray);
            }
        }

        private class MakeFileInfo
        {
            public FileInfo fileInfo;
            public MakeType type;
        }
    }
}

