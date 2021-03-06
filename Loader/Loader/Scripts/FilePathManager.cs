﻿using System.IO;

namespace Loader
{
    public class FilePathManager
    {
        //DLL编译使用
        private const string CscPath = @"C:\Windows\Microsoft.NET\Framework\v3.5\csc.exe";      //CSC编译工具的路径
        private const string DLLFilePath = "Result\\Assembly\\";
        private const string DLLScriptPath = "Data\\ScriptFile\\CSharp\\ThriftStruct\\";        //代码生成路径-编译为DLL的脚本存放路径
        private const string ReferenceLibFilePath = "Tools\\Lib\\";                             //依赖DLL的路径
		public const string DLLName = "ThriftScript.dll";
		public const string DLLFileName = DLLFilePath + DLLName;								//生成的DLL文件名称
        private const string SearchDLLPattern = "*.dll";                                        //寻找依赖DLL的通配符
        private const string SearchScriptPattern = "*.cs";                                      //寻找编译脚本的通配符

        //thrift执行使用路径
        public const string ThriftExeFilePath = "Tools\\thrift-0.9.3.exe";
        public const string CSharpScriptOutPath = "Data\\ScriptFile\\CSharp\\";
        public const string CPlusPlusScriptOutPath = "Data\\ScriptFile\\CPlusPlus\\";
        public const string JavaScriptOutPath = "Data\\ScriptFile\\Java\\";
        public const string BytesFilePath = "Result\\Bytes\\";                                    //输出二进制数据文件路径

        //NVelocity生成thrift文件使用路径
        public const string templateFilePath = "Tools\\TemplateFile\\CommonStructThriftTemplate.velocity";
        public const string publicTmpFilePath = "Tools\\TemplateFile\\PublicStructTemplate.velocity";
        public const string outputFilePath = "Data\\ThriftFile\\";
        public const string outputFileExtension = ".thrift";

		public const string configFilePath = "Data\\Config.ini";

        public const string ThriftNameSpace = "ThriftStruct.";

		public static string extOutputBytesPath = null;
		public static string extOutputAssemblyPath = null;

        /// <summary>
        /// 保证所有输出路径存在
        /// </summary>
        public static void InitAllPath()
        {
            CreateFile(CSharpScriptOutPath);
            CreateFile(CPlusPlusScriptOutPath);
            CreateFile(JavaScriptOutPath);
            CreateFile(BytesFilePath);
            CreateFile(outputFilePath);
            CreateFile(DLLFilePath);

			DeleteFileByDir(CSharpScriptOutPath);
			DeleteFileByDir(CPlusPlusScriptOutPath);
			DeleteFileByDir(JavaScriptOutPath);
			DeleteFileByDir(BytesFilePath);
			DeleteFileByDir(outputFilePath);

			if (File.Exists(configFilePath))
			{
				extOutputBytesPath = HandleINI.INIHelper.Read("PathConfig", "OuputBytesPath", "", configFilePath);
				extOutputAssemblyPath = HandleINI.INIHelper.Read("PathConfig", "OuputAssemblyPath", "", configFilePath);
			}
		}

		/// <summary>
		/// 删除文件夹内所有文件
		/// </summary>
		private static void DeleteFileByDir(string path)
		{
			DirectoryInfo root = new DirectoryInfo(path);
			FileInfo[] fileArr = root.GetFiles();
			for (int i = 0; i < fileArr.Length; i++)
			{
				fileArr[i].Delete();
			}
			DirectoryInfo[] dirArr = root.GetDirectories();
			for (int i = 0; i < dirArr.Length; i++)
			{
				dirArr[i].Delete(true);
			}
		}

        /// <summary>
        /// 创建文件夹，保证输出路径存在
        /// </summary>
        private static void CreateFile(string filePath)
        {
            if (!Directory.Exists(filePath))
            {
                Directory.CreateDirectory(filePath);
            }
        }

        /// <summary>
        /// 获取编译信息
        /// </summary>
        public static CompileCSharpDll.CompileFileInfo GetCompileConfigInfo()
        {
            CompileCSharpDll.CompileFileInfo info = new CompileCSharpDll.CompileFileInfo();
            info.compileFilePath = DLLScriptPath;
            info.searchPattern = SearchScriptPattern;

            info.utilFilePath = CscPath;

            info.dllOutPath = DLLFileName;

            string libPath = ReferenceLibFilePath;
            info.referenceDllFilePath = Directory.GetFiles(libPath, SearchDLLPattern);

            return info;
        }
    }
}
