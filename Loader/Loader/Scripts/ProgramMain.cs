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
            try
            {
                string[] excelFiles = Directory.GetFiles("..\\..\\Data\\ExcelFile\\", "*.xlsx");
                List<string> thriftFileName = new List<string>(excelFiles.Length);
                Dictionary<string, List<ExcelClass>> allExcelData = new Dictionary<string, List<ExcelClass>>(excelFiles.Length);

                AnalysisExcelData analysisExcelTools = new AnalysisExcelData();
                DataTableParser dataTabelTools = new DataTableParser();

                stopWatch.Start();
                NVelocityHelper velocity = NVelocityHelper.LoadTemplate(FilePathManager.templateFilePath);
                StopAndOutputTime("Init Template Engine");

                Dictionary<string, ExcelVariable> diyStructDic = new Dictionary<string, ExcelVariable>();

                foreach (var excelFile in excelFiles)
                {
                    Console.WriteLine();

                    //文件名字，不包含路径，后缀
                    int index = excelFile.LastIndexOf("\\");
                    string outputFileName = excelFile.Substring(index + 1, excelFile.Length - index - 1 - 5);
                    Console.WriteLine("文件名（无路径，无后缀）："+outputFileName);

                    //解析Excel数据为DataSet，然后解析为自定义结构
                    System.Data.DataSet dataSet = analysisExcelTools.LoadFile(excelFile);
                    stopWatch.Start();
                    List<ExcelClass> sheetList = dataTabelTools.AnalysisDataSetToSheetList(dataSet, diyStructDic);
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

                //生成public.thrift文件
                stopWatch.Start();
                NVelocityHelper pubVelocity = NVelocityHelper.LoadTemplate("..\\..\\Data\\TemplateFile\\PublicStructTemplate.velocity");
                StopAndOutputTime("Second load template");
                pubVelocity.AddKeyValue("varList", diyStructDic);
                string pubThriftName = pubVelocity.ExecuteFile("public");
                CSharpFileBuilder.BuildAllCsharpFile(pubThriftName);

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