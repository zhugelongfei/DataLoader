using System.Diagnostics;
using System.Text;
using System.Collections.Generic;

namespace Loader
{
    public class CSharpFileBuilder
    {
        private static Process p;

        public static void BuildAllCsharpFile(List<string> thriftFileName,System.Action<string> log)
        {
            Init();
            string args = @"-out " + GetScriptOutPath() + " -gen csharp ";

            foreach (string fileName in thriftFileName)
            {
                //生成C#文件
                BuildCsharpFile(args + fileName, log);
            }
            Close();
        }

        private static string GetScriptOutPath()
        {
            return FilePathManager.GetObsolutePathByRelativePath(FilePathManager.ScriptOutPath);
        }

        private static void Init()
        {
            p = new Process();
            p.StartInfo.FileName = FilePathManager.ThriftExeFilePath;
            p.StartInfo.UseShellExecute = false;
            p.StartInfo.RedirectStandardInput = false;
            p.StartInfo.RedirectStandardOutput = true;
            p.StartInfo.RedirectStandardError = true;
            p.StartInfo.CreateNoWindow = true;
            p.StartInfo.StandardOutputEncoding = Encoding.Default;
        }

        private static void BuildCsharpFile(string args, System.Action<string> log)
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
