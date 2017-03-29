using System.IO;
using System.Collections.Generic;

public abstract class ThriftDataTypeMgr<T>
    where T : Thrift.Protocol.TBase, new()
{
    protected List<T> dataList = null;

    private byte[] bytes = null;

    public ThriftDataTypeMgr()
    {
        ReadFileData();
    }

    /// <summary>
    /// 获取数据文件全名
    /// </summary>
    /// <returns>二进制文件全名</returns>
    protected abstract string GetDataFilePath();

    /// <summary>
    /// 读取文件的二进制数据
    /// </summary>
    public void ReadFileData()
    {
        using (FileStream input = new FileStream(GetDataFilePath(), FileMode.Open))
        {
            bytes = new byte[input.Length];

            input.Read(bytes, 0, bytes.Length);
        };
    }

    /// <summary>
    /// 序列化所有数据
    /// </summary>
    public void DeSerAllData()
    {
        if (bytes == null)
            return;

        //读取对象的数量
        int count = System.BitConverter.ToInt32(bytes, 0);

        dataList = new List<T>(count);

        //数据开始标志位
        int startPos = count;

        for (int i = 0; i < count; i++)
        {
            //读取对象的长度
            int length = System.BitConverter.ToInt32(bytes, startPos);
            startPos += 4;

            //反序列化为对象数据
            T data = new T();
            ClientThriftSerialize.Instance.DeSerialize(data, bytes, startPos, length);
            dataList.Add(data);

            //对象开始标志位向后移动
            startPos += length;
        }

        //清空二进制数据
        bytes = null;
    }

}
