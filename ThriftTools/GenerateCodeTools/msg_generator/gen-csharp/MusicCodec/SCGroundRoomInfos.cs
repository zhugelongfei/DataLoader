/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;

namespace MusicCodec
{

  /// <summary>
  /// 广场房间信息
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCGroundRoomInfos : TBase
  {
    private byte _queryType;
    private MusicCodec.CommonDataPageInfos _groundRoomPageInfos;

    /// <summary>
    /// 0-全部 1-附近
    /// </summary>
    public byte QueryType
    {
      get
      {
        return _queryType;
      }
      set
      {
        __isset.queryType = true;
        this._queryType = value;
      }
    }

    /// <summary>
    /// 广场分页信息
    /// </summary>
    public MusicCodec.CommonDataPageInfos GroundRoomPageInfos
    {
      get
      {
        return _groundRoomPageInfos;
      }
      set
      {
        __isset.groundRoomPageInfos = true;
        this._groundRoomPageInfos = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool queryType;
      public bool groundRoomPageInfos;
    }

    public SCGroundRoomInfos() {
    }

    public void Read (TProtocol iprot)
    {
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.Byte) {
              QueryType = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Struct) {
              GroundRoomPageInfos = new MusicCodec.CommonDataPageInfos();
              GroundRoomPageInfos.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
    }

    public void Write(TProtocol oprot) {
ClientLog.Instance.LogError("This function is deleted.");
}

    


  }

}
