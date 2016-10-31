using System.IO;
using System;

public class ProgramMain
{
    public static void Main(string[] args)
    {
        string filePath = @"..\\..\\ExcelData\\ActivityLevel.bytes";

        FileStream input = new FileStream(filePath, FileMode.Open);

        byte[] bytes = new byte[input.Length];

        input.Read(bytes, 0, bytes.Length);

        ThriftStruct.ActivityLevelArray data = new ThriftStruct.ActivityLevelArray();

        ClientThriftSerialize.Instance.DeSerialize(data, bytes);

        foreach (var item in data.ValueList)
        {
            foreach (var va in item.VActivityRightDesc)
            {
            Console.WriteLine(va.ToString());

            }
        }
    }
}