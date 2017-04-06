using System;
using System.IO;
using System.Collections.Generic;
using System.Diagnostics;

namespace Loader
{
    class ProgramMain
    {
        private static Stopwatch stopWatch = new Stopwatch();

        public static void Main(string[] args)
        {
            //设置Exe运行的目录为当前目录
            System.Environment.CurrentDirectory = System.AppDomain.CurrentDomain.SetupInformation.ApplicationBase;

            bool needReBuildSruct = true;

            string[] excelFiles = null;

            #region 取参数
            if (args.Length == 0)
            {
                excelFiles = Directory.GetFiles("..\\..\\Data\\ExcelFile\\", "*.xlsx");
            }
            else if (args[0].Equals("/d"))
            {
                needReBuildSruct = false;
                if (args.Length > 1)
                {
                    excelFiles = new string[args.Length - 1];

                    Array.Copy(args, 1, excelFiles, 0, excelFiles.Length);
                }
            }
            else
            {
                excelFiles = args;
            }

            #endregion

            FilePathManager.InitAllPath();

            try
            {
                DataTableParser dataTabelTools = new DataTableParser();

                if (needReBuildSruct)
                {
                    List<string> thriftFileName = new List<string>(excelFiles.Length);

                    NVelocityHelper velocity = NVelocityHelper.LoadTemplate(FilePathManager.templateFilePath);

                    foreach (var excelFile in excelFiles)
                    {
                        Console.WriteLine("文件名：" + excelFile);

                        //解析Excel数据为DataSet，然后解析为自定义结构
                        stopWatch.Start();
                        System.Data.DataSet dataSet = AnalysisExcelData.LoadFile(excelFile, 3);
                        List<EClass> sheetList = dataTabelTools.AnalysisDataSetToSheetList(dataSet);
                        StopAndOutputTime("Read Excel File & Get Class Struct");

                        //向模板引擎中注册键
                        velocity.AddKeyValue("sheetList", sheetList);

                        //生成thrift文件
                        stopWatch.Start();
                        string thriftName = velocity.ExecuteFile(GetFileNameFromFullName(excelFile));
                        thriftFileName.Add(thriftName);
                        StopAndOutputTime("Generate Thrift File");

                        velocity.ClearKeyValue();

                        Console.WriteLine();
                    }

                    velocity = null;

                    //生成Csharp文件
                    CSharpFileBuilder.BuildAllCsharpFile(thriftFileName, Console.WriteLine);

                    Console.WriteLine();

                    //编译DLL
                    stopWatch.Start();
                    CompileCSharpDll.Compile(FilePathManager.GetCompileConfigInfo(), Console.WriteLine);
                    StopAndOutputTime("Compile Dll File");

                    Console.WriteLine();
                }

                //生成二进制数据文件
                BytesFileBuilder.InitAssembly();
                stopWatch.Start();
                foreach (var excelFile in excelFiles)
                {
                    //解析Excel数据为DataSet，然后解析为自定义结构
                    System.Data.DataSet dataSet = AnalysisExcelData.LoadFile(excelFile);
                    List<EClass> sheetList = dataTabelTools.AnalysisDataSetToSheetList(dataSet);
                    BytesFileBuilder.BuildBytesData(GetFileNameFromFullName(excelFile), sheetList);
                }
                StopAndOutputTime("Read Excel All Data & Generate Bytes File");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.ToString());
            }

            Console.WriteLine("请按任意键继续. . .");
            Console.ReadKey(true);
        }

        private static string GetFileNameFromFullName(string fullName)
        {
            if (string.IsNullOrEmpty(fullName))
                return "";

            //文件名字，不包含路径，后缀
            int index = fullName.LastIndexOf("\\");
            return fullName.Substring(index + 1, fullName.Length - index - 1 - 5);
        }

        private static void StopAndOutputTime(string operation)
        {
            stopWatch.Stop();
            Console.WriteLine(operation + " \t\t: " + stopWatch.ElapsedMilliseconds + "ms");
            stopWatch.Reset();
        }

    }
}