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
  /// 竞技房间信息
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCDanceRoomInfosMsg : TBase
  {
    private short _danceRoomCount;
    private MusicCodec.RoomChannel _channel;
    private byte _mode;
    private short _curWaitRoomCount;
    private byte _queryStyle;
    private MusicCodec.CommonDataPageInfos _danceRoomPageInfos;

    public short DanceRoomCount
    {
      get
      {
        return _danceRoomCount;
      }
      set
      {
        __isset.danceRoomCount = true;
        this._danceRoomCount = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="MusicCodec.RoomChannel"/>
    /// </summary>
    public MusicCodec.RoomChannel Channel
    {
      get
      {
        return _channel;
      }
      set
      {
        __isset.channel = true;
        this._channel = value;
      }
    }

    public byte Mode
    {
      get
      {
        return _mode;
      }
      set
      {
        __isset.mode = true;
        this._mode = value;
      }
    }

    public short CurWaitRoomCount
    {
      get
      {
        return _curWaitRoomCount;
      }
      set
      {
        __isset.curWaitRoomCount = true;
        this._curWaitRoomCount = value;
      }
    }

    /// <summary>
    /// 0-全部 1-附近
    /// </summary>
    public byte QueryStyle
    {
      get
      {
        return _queryStyle;
      }
      set
      {
        __isset.queryStyle = true;
        this._queryStyle = value;
      }
    }

    /// <summary>
    /// 竞技房间分页信息
    /// </summary>
    public MusicCodec.CommonDataPageInfos DanceRoomPageInfos
    {
      get
      {
        return _danceRoomPageInfos;
      }
      set
      {
        __isset.danceRoomPageInfos = true;
        this._danceRoomPageInfos = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool danceRoomCount;
      public bool channel;
      public bool mode;
      public bool curWaitRoomCount;
      public bool queryStyle;
      public bool danceRoomPageInfos;
    }

    public SCDanceRoomInfosMsg() {
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
            if (field.Type == TType.I16) {
              DanceRoomCount = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              Channel = (MusicCodec.RoomChannel)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Byte) {
              Mode = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I16) {
              CurWaitRoomCount = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.Byte) {
              QueryStyle = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.Struct) {
              DanceRoomPageInfos = new MusicCodec.CommonDataPageInfos();
              DanceRoomPageInfos.Read(iprot);
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
