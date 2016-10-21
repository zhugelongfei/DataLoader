using System;
using System.Collections.Generic;
using NVelocity;
using NVelocity.App;
using NVelocity.Runtime;
using System.IO;

namespace Loader
{
    public class NVelocityHelper
    {
        private VelocityContext context = null;
        private Template template = null;

        private Dictionary<string, object> keyObjDic = new Dictionary<string, object>();

        public void ClearKeyValue()
        {
            keyObjDic.Clear();
        }

        /// <summary>
        /// 添加数据
        /// </summary>
        public void AddKeyValue(string key, object value)
        {
            if (!keyObjDic.ContainsKey(key))
            {
                keyObjDic[key] = value;
            }
        }

        /// <summary>
        /// 初始化模板引擎
        /// </summary>
        public void InitTemplateEngine()
        {
            try
            {
                VelocityEngine templateEngine = new VelocityEngine();
                templateEngine.SetProperty(RuntimeConstants.RESOURCE_LOADER, "file");

                templateEngine.SetProperty(RuntimeConstants.INPUT_ENCODING, "utf-8");
                templateEngine.SetProperty(RuntimeConstants.OUTPUT_ENCODING, "utf-8");

                //如果设置了FILE_RESOURCE_LOADER_PATH属性，那么模板文件的基础路径就是基于这个设置的目录，否则默认当前运行目录
                templateEngine.SetProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, AppDomain.CurrentDomain.BaseDirectory);

                templateEngine.Init();

                template = templateEngine.GetTemplate(FilePathManager.templateFilePath);
            }
            catch (NVelocity.Exception.ResourceNotFoundException re)
            {
                string error = string.Format("Cannot find template " + FilePathManager.templateFilePath);

                Console.WriteLine(error);
                throw new Exception(error, re);
            }
            catch (NVelocity.Exception.ParseErrorException pee)
            {
                string error = string.Format("Syntax error in template " + FilePathManager.templateFilePath + ":" + pee.StackTrace);
                Console.WriteLine(error);
                throw new Exception(error, pee);
            }
        }

        /// <summary>
        /// 初始化上下文的内容
        /// </summary>
        private void InitContext()
        {
            context = new VelocityContext();
            foreach (string key in keyObjDic.Keys)
            {
                context.Put(key, keyObjDic[key]);
            }
        }

        /// <summary>
        ///根据模板创建输出的文件,并返回生成的文件路径
        /// </summary>
        public string ExecuteFile(string outputFileName)
        {
            string fileName = "";
            if (template != null)
            {
                fileName = FilePathManager.outputFilePath + outputFileName + FilePathManager.outputFileExtension;

                if (!string.IsNullOrEmpty(FilePathManager.outputFilePath) && !Directory.Exists(FilePathManager.outputFilePath))
                {
                    Directory.CreateDirectory(FilePathManager.outputFilePath);
                }

                InitContext();
                using (StreamWriter writer = new StreamWriter(fileName, false))
                {
                    template.Merge(context, writer);
                }
            }

            return new FileInfo(fileName).FullName;
        }

        /// <summary>
        /// 根据模板输出字符串内容
        /// </summary>
        public string ExecuteString()
        {
            InitContext();
            StringWriter writer = new StringWriter();
            template.Merge(context, writer);
            return writer.GetStringBuilder().ToString();
        }

        /// <summary>
        /// 合并字符串的内容
        /// </summary>
        /// <returns></returns>
        public string ExecuteMergeString(string inputString)
        {
            VelocityEngine templateEngine = new VelocityEngine();
            templateEngine.Init();

            InitContext();

            StringWriter writer = new StringWriter();
            templateEngine.Evaluate(context, writer, "mystring", inputString);

            return writer.GetStringBuilder().ToString();
        }
    }
}