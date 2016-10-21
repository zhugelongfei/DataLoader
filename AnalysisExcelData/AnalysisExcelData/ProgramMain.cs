using System.IO;
using System;

public class ProgramMain
{
    public static void Main(string[] args)
    {
        string filePath = @"..\\..\\ExcelData\\RoomAction.bytes";

        FileStream input = new FileStream(filePath, FileMode.Open);

        byte[] bytes = new byte[input.Length];

        input.Read(bytes, 0, bytes.Length);

        ThriftStruct.RoomActionArray data = new ThriftStruct.RoomActionArray();

        ClientThriftSerialize.Instance.DeSerialize(data, bytes);

        foreach (var item in data.ValueList)
        {
            Console.WriteLine(item.ToString());
        }
    }
}