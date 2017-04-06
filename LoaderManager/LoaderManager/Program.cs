using System;
using System.Text;
using System.Diagnostics;
using Microsoft.Win32;

namespace LoaderManager
{
    class Program
    {
        static void Main(string[] args)
        {
            bool isCanRegister = CheckIsReg();

            bool ask = false;

            do
            {
                Console.WriteLine(string.Format("要执行{0}DLL吗？(Y/N)", isCanRegister ? "注册" : "注销"));
                ConsoleKeyInfo keyInfo = Console.ReadKey();
                switch (keyInfo.Key)
                {
                    case ConsoleKey.Y:
                        ask = true;
                        break;
                    case ConsoleKey.N:
                        Console.WriteLine();
                        return;
                    default:
                        break;
                }
                Console.WriteLine();
            } while (!ask);


            //启动RegSvr32
            StartRegsvr32(isCanRegister, Console.WriteLine);

            if (isCanRegister)
            {
                //注册：添加一个存储路径的键值对
                string loaderExePath = AppDomain.CurrentDomain.SetupInformation.ApplicationBase + "Loader\\bin\\Loader.exe";

                RegistryKey loader = Registry.ClassesRoot.OpenSubKey("*\\shellex\\ContextMenuHandlers\\longfeiloader", true);

                loader.SetValue("path", loaderExePath, RegistryValueKind.String);

                loader.Close();
            }

            Console.WriteLine(isCanRegister ? "注册DLL成功" : "注销DLL成功");

            Console.WriteLine("请按任意键退出. . .");

            Console.ReadKey(true);
        }

        /// <summary>
        /// 检测是否需要注册
        /// </summary>
        private static bool CheckIsReg()
        {
            RegistryKey loader = Registry.ClassesRoot.OpenSubKey("*\\shellex\\ContextMenuHandlers\\longfeiloader", true);

            bool isReg = loader == null;
            if (loader != null) loader.Close();

            return isReg;
        }

        /// <summary>
        /// 启动Regsvr32，注册或注销DLL
        /// </summary>
        /// <param name="regster">是否是注册</param>
        /// <param name="log">日志输出委托</param>
        public static void StartRegsvr32(bool regster,System.Action<string> log)
        {
            StringBuilder strCache = new StringBuilder(300);

            if (!regster)
                strCache.Append(" /u");

            strCache.Append(" LoaderRegKey.dll");

            Process p = new Process();
            p.StartInfo.FileName = @"C:\Windows\System32\regsvr32";
            p.StartInfo.UseShellExecute = false;
            p.StartInfo.RedirectStandardInput = false;
            p.StartInfo.RedirectStandardOutput = true;
            p.StartInfo.RedirectStandardError = true;
            p.StartInfo.CreateNoWindow = true;
            p.StartInfo.Arguments = strCache.ToString();
            p.StartInfo.StandardOutputEncoding = Encoding.Default;

            if (!p.Start())
            {
                if (log != null)
                    log("CSC 启动失败");
            }

            p.WaitForExit();

            if (log != null)
            {
                //程序输出
                string outputStr = p.StandardOutput.ReadToEnd();
                if (!string.IsNullOrEmpty(outputStr))
                {
                    log("Compile CSharp Dll -- Output :");
                    log(outputStr);
                }

                //程序错误
                string errorStr = p.StandardError.ReadToEnd();
                if (!string.IsNullOrEmpty(errorStr))
                {
                    log("Compile CSharp Dll -- Error :" + errorStr);
                }
            }

            p.Close();
        }
    }
}
