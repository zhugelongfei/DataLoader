using System;
using System.IO;
using System.Collections.Generic;
using Loader.ExcelStruct;
using System.Diagnostics;

namespace Loader
{
    class ProgramMain
    {
        private static Stopwatch stopWatch = new Stopwatch();

        public static void Main(string[] args)
        {
            try
            {
                string[] excelFiles = Directory.GetFiles("..\\..\\ExcelFile\\", "*.xlsx");
                List<string> thriftFileName = new List<string>(excelFiles.Length);
                Dictionary<string, List<ExcelSheet>> allExcelData = new Dictionary<string, List<ExcelSheet>>(excelFiles.Length);

                AnalysisExcelData analysisExcelTools = new AnalysisExcelData();

                NVelocityHelper velocity = new NVelocityHelper();

                stopWatch.Start();
                velocity.InitTemplateEngine();
                StopAndOutputTime("Init Template Engine");

                foreach (var excelFile in excelFiles)
                {
                    Console.WriteLine();

                    //文件名字，不包含路径，后缀
                    int index = excelFile.LastIndexOf("\\");
                    string outputFileName = excelFile.Substring(index + 1, excelFile.Length - index - 1 - 5);
                    Console.WriteLine(outputFileName);

                    //解析Excel数据为DataSet，然后解析为自定义结构
                    stopWatch.Start();
                    List<ExcelSheet> sheetList = DataTableUtils.AnalysisDataSetToSheetList(analysisExcelTools.LoadFile(excelFile));
                    StopAndOutputTime("Read Excel File & Get All Data");

                    //像模板引擎中注册键
                    velocity.ClearKeyValue();
                    velocity.AddKeyValue("sheetList", sheetList);

                    //生成thrift文件
                    stopWatch.Start();
                    string thriftName = velocity.ExecuteFile(outputFileName);
                    thriftFileName.Add(thriftName);
                    allExcelData.Add(outputFileName, sheetList);
                    StopAndOutputTime("Generate Thrift File");
                }

                //生成Csharp文件
                Console.WriteLine();
                CSharpFileBuilder.BuildAllCsharpFile(thriftFileName);
                Console.WriteLine();

                //编译DLL
                stopWatch.Start();
                CompileCSharpDll.Compile(FilePathManager.GetCompileConfigInfo(), null);
                StopAndOutputTime("Compile Dll File");

                Console.WriteLine();

                //生成二进制数据文件
                stopWatch.Start();
                BytesFileBuilder.BuildAllData(allExcelData);
                StopAndOutputTime("Generate Bytes File");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.ToString());
                throw;
            }
        }

        private static void StopAndOutputTime(string operation)
        {
            stopWatch.Stop();
            Console.WriteLine(operation + " : " + stopWatch.ElapsedMilliseconds + "ms");
            stopWatch.Reset();
        }
    }
}