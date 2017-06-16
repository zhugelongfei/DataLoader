using System.Diagnostics;
using System.Text;
using System.Collections.Generic;

namespace Loader
{
    public class CodeFileBuilder
    {
        private static Process p;

        public static void BuildAllCsharpFile(List<string> thriftFileName, System.Action<string> log)
        {
            Init();
            string csharpArgs = @"-out " + FilePathManager.CSharpScriptOutPath + " -gen csharp ";
            string cppArgs = @"-out " + FilePathManager.CPlusPlusScriptOutPath + " -gen cpp ";
            string javaArgs = @"-out " + FilePathManager.JavaScriptOutPath + " -gen java ";

            foreach (string fileName in thriftFileName)
            {
                //生成C#文件
                BuildCodeFile(csharpArgs + fileName, log);
                //生成C++文件
                BuildCodeFile(cppArgs + fileName, log);
                //生成java文件
                BuildCodeFile(javaArgs + fileName, log);
            }
            Close();
        }

        private static void Init()
        {
            p = new Process();
            p.StartInfo.WorkingDirectory = System.Environment.CurrentDirectory;
            p.StartInfo.FileName = FilePathManager.ThriftExeFilePath;
            p.StartInfo.UseShellExecute = false;
            p.StartInfo.RedirectStandardInput = false;
            p.StartInfo.RedirectStandardOutput = true;
            p.StartInfo.RedirectStandardError = true;
            p.StartInfo.CreateNoWindow = true;
            p.StartInfo.StandardOutputEncoding = Encoding.Default;
        }

        private static void BuildCodeFile(string args, System.Action<string> log)
        {
            p.StartInfo.Arguments = args;

            if (!p.Start())
            {
                System.Console.WriteLine("Thrift start error");
                Close();
                return;
            }

            p.WaitForExit();

            if (log != null)
            {
                //程序输出
                string outputStr = p.StandardOutput.ReadToEnd();
                if (!string.IsNullOrEmpty(outputStr))
                {
                    log("Thrift -- Output :");
                    log(outputStr);
                }

                //程序错误
                string errorStr = p.StandardError.ReadToEnd();
                if (!string.IsNullOrEmpty(errorStr))
                {
                    log("Thrift -- Error :");
                    log(errorStr);
                }
            }
        }

        private static void Close()
        {
            p.Close();
            p = null;
        }

    }
}
