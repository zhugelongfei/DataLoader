using System;
using System.Collections.Generic;
using System.Reflection;

namespace Loader
{
    /// <summary>
    /// DLL动态加载管理器
    /// </summary>
    public class DLLDynamicLoad
    {
        public static void Init()
        {
            AppDomain.CurrentDomain.AssemblyResolve += AssemblyResolve;
        }

        private static Dictionary<string, Assembly> allAss = new Dictionary<string, Assembly>();

        /// <summary>
        /// 程序集加载失败的回调
        /// </summary>
        private static Assembly AssemblyResolve(object sender, ResolveEventArgs args)
        {
            //获取加载失败的程序集名字
            string dllName = new AssemblyName(args.Name).Name;

            if (allAss.ContainsKey(dllName))
            {
                return allAss[dllName];
            }
            else
            {
                //读取资源
                using (var stream = Assembly.GetExecutingAssembly().GetManifestResourceStream("Loader.Lib." + dllName + ".dll"))
                {
                    if (stream != null)
                    {
                        var bytes = new byte[stream.Length];
                        stream.Read(bytes, 0, (int)stream.Length);
                        allAss.Add(dllName, Assembly.Load(bytes));
                        return allAss[dllName];//加载资源文件中的dll,代替加载失败的程序集
                    }
                }
                throw new DllNotFoundException(dllName);
            }
        }

    }
}
