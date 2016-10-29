using System.Collections.Generic;
using Loader;

namespace Loader
{
    public class DiyStructInfo
    {
        public Dictionary<int, ExcelVariable> varDic = new Dictionary<int, ExcelVariable>();

        public Dictionary<int, ExcelVariable> VarDic { get { return varDic; } }
    }
}