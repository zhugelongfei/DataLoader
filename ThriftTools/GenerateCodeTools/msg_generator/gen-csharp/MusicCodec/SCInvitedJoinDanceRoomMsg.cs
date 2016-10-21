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

  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCInvitedJoinDanceRoomMsg : TBase
  {
    private MusicCodec.CreateRoomType _roomType;
    private int _roomId;
    private string _inviterName;
    private long _inviterCharId;

    /// <summary>
    /// 
    /// <seealso cref="MusicCodec.CreateRoomType"/>
    /// </summary>
    public MusicCodec.CreateRoomType RoomType
    {
      get
      {
        return _roomType;
      }
      set
      {
        __isset.roomType = true;
        this._roomType = value;
      }
    }

    public int RoomId
    {
      get
      {
        return _roomId;
      }
      set
      {
        __isset.roomId = true;
        this._roomId = value;
      }
    }

    public string InviterName
    {
      get
      {
        return _inviterName;
      }
      set
      {
        __isset.inviterName = true;
        this._inviterName = value;
      }
    }

    public long InviterCharId
    {
      get
      {
        return _inviterCharId;
      }
      set
      {
        __isset.inviterCharId = true;
        this._inviterCharId = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool roomType;
      public bool roomId;
      public bool inviterName;
      public bool inviterCharId;
    }

    public SCInvitedJoinDanceRoomMsg() {
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
            if (field.Type == TType.I32) {
              RoomType = (MusicCodec.CreateRoomType)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              RoomId = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              InviterName = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I64) {
              InviterCharId = iprot.ReadI64();
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