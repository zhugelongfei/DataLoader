using System.IO;

namespace Loader
{
    public class FilePathManager
    {
        public const string excelFilePath = "..\\..\\ExcelFile\\ActivityLevel.xlsx";

        //DLL编译使用
        private const string CscPath = @"C:\Windows\Microsoft.NET\Framework\v3.5\csc.exe";      //CSC编译工具的路径
        public const string DLLFileName = "Result\\ThriftScript.dll";                           //生成的DLL文件名称
        private const string DLLScriptPath = "ScriptFile\\ThriftStruct\\";                      //代码生成路径-编译为DLL的脚本存放路径
        private const string SearchScriptPattern = "*.cs";                                      //寻找编译脚本的通配符
        private const string ReferenceLibFilePath = "Lib\\";                                    //依赖DLL的路径
        private const string SearchDLLPattern = "*.dll";                                        //寻找依赖DLL的通配符

        //thrift执行使用路径
        public const string ThriftExeFilePath = "..\\..\\Tools\\thrift-0.9.3.exe";
        public const string ScriptOutPath = "\\ScriptFile\\";
        public const string ThriftFilePath = "..\\..\\ThriftFile\\Activity.thrift";
        public const string BytesFilePath = "..\\..\\Bytes\\";                       //输出二进制数据文件路径

        //NVelocity生成thrift文件使用路径
        public const string templateFilePath = "..\\..\\TemplateFile\\ThriftStructTemplate.velocity";
        public const string outputFilePath = "..\\..\\ThriftFile\\";
        public const string outputFileName = "Activity";
        public const string outputFileExtension = ".thrift";

        /// <summary>
        /// 根据相对路径，获取绝对路径
        /// </summary>
        public static string GetObsolutePathByRelativePath(string relPath)
        {
            return Directory.GetParent(Directory.GetCurrentDirectory()).Parent.FullName + "\\" + relPath;
        }

        /// <summary>
        /// 获取编译信息
        /// </summary>
        public static CompileCSharpDll.CompileFileInfo GetCompileConfigInfo()
        {
            CompileCSharpDll.CompileFileInfo info = new CompileCSharpDll.CompileFileInfo();
            info.compileFilePath = GetObsolutePathByRelativePath(DLLScriptPath);
            info.searchPattern = SearchScriptPattern;

            info.utilFilePath = CscPath;

            info.dllOutPath = GetObsolutePathByRelativePath(DLLFileName);

            string libPath = GetObsolutePathByRelativePath(ReferenceLibFilePath);
            info.referenceDllFilePath = Directory.GetFiles(libPath, SearchDLLPattern);

            return info;
        }
    }
}