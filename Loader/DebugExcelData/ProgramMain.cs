using System.IO;
using System;

public class ProgramMain
{
    public static void Main(string[] args)
    {
        ActivityDataMgr dataMgr = new ActivityDataMgr();

        dataMgr.DeSerAllData();

        dataMgr.DebugData();
    }
}