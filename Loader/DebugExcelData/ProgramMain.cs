using System.IO;
using System;
using ThriftStruct;

public class ProgramMain
{
    public static void Main(string[] args)
    {
        ActivityDataMgr dataMgr = new ActivityDataMgr();

        dataMgr.DeSerAllData();

        dataMgr.DebugData();
    }
}