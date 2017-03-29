using System;
using System.Collections.Generic;

public class ActivityDataMgr : ThriftDataTypeMgr<ThriftStruct.ActivityLevel>
{
    protected override string GetDataFilePath()
    {
        return @"..\\..\\ExcelData\\ActivityLevel.bytes";
    }

    public void DebugData()
    {
        foreach (var data in dataList)
        {
            //Console.WriteLine(data.ToString());
            foreach (var va in data.VActivityRightDesc)
            {
                Console.WriteLine(va.ToString());
            }
        }
    }
}