using System.Diagnostics;
using System.Text;

public class CompileCSharpDll
{
    public delegate void Logger(string log);
    public class CompileFileInfo
    {
        //编译工具路径
        public string utilFilePath;

        //编译的文件路径
        public string compileFilePath;

        //在编译文件路径下，寻找脚本的通配符
        public string searchPattern;

        //引用的DLL路径
        public string[] referenceDllFilePath;

        //DLL输出路径
        public string dllOutPath;
    }

    public static void Compile(CompileFileInfo compInfo, Logger log)
    {
        if (compInfo == null)
        {
            return;
        }
        StringBuilder strCache = new StringBuilder(300);
        //编译类型
        strCache.Append("/t:library ");
        //DLL输出路径
        strCache.Append("/out:");
        strCache.Append(compInfo.dllOutPath);
        strCache.Append(" ");
        //依赖DLL
        if (compInfo.referenceDllFilePath != null && compInfo.referenceDllFilePath.Length > 0)
        {
            foreach (string path in compInfo.referenceDllFilePath)
            {
                strCache.Append(@"/reference:");
                strCache.Append(path);
                strCache.Append(" ");
            }
        }
        //编译文件路径
        strCache.Append(compInfo.compileFilePath + compInfo.searchPattern);

        Process p = new Process();
        p.StartInfo.FileName = compInfo.utilFilePath;
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

        string outputStr = p.StandardOutput.ReadToEnd();

        p.WaitForExit();
        p.Close();

        if (log != null)
            log(outputStr);
    }
}