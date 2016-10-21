using System.Diagnostics;
using System.Text;
using System.Collections.Generic;

namespace Loader
{
    public class CSharpFileBuilder
    {
        private static Process p;

        public static void BuildAllCsharpFile(List<string> thriftFileName)
        {
            Init();
            string args = @"-out " + FilePathManager.GetObsolutePathByRelativePath(FilePathManager.ScriptOutPath)
                + " -gen csharp ";

            foreach (string fileName in thriftFileName)
            {
                //生成C#文件
                BuildCsharpFile(args + fileName);
            }
            Close();
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

        private static void BuildCsharpFile(string args)
        {
            p.StartInfo.Arguments = args;

            if (!p.Start())
            {
                System.Console.WriteLine("Thrift start error");
                Close();
                return;
            }

            string outputStr = p.StandardError.ReadToEnd();

            if (!string.IsNullOrEmpty(outputStr))
            {
                System.Console.WriteLine("Thrift Error is :" + outputStr);
            }

            p.WaitForExit();
        }

        private static void Close()
        {
            p.Close();
            p.Dispose();
            p = null;
        }

    }
}
