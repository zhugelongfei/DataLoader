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
  public partial class Conversation : TBase
  {
    private long _friendCharId;
    private short _unreadCount;
    private int _lastTime;

    public long FriendCharId
    {
      get
      {
        return _friendCharId;
      }
      set
      {
        __isset.friendCharId = true;
        this._friendCharId = value;
      }
    }

    public short UnreadCount
    {
      get
      {
        return _unreadCount;
      }
      set
      {
        __isset.unreadCount = true;
        this._unreadCount = value;
      }
    }

    public int LastTime
    {
      get
      {
        return _lastTime;
      }
      set
      {
        __isset.lastTime = true;
        this._lastTime = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool friendCharId;
      public bool unreadCount;
      public bool lastTime;
    }

    public Conversation() {
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
            if (field.Type == TType.I64) {
              FriendCharId = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I16) {
              UnreadCount = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              LastTime = iprot.ReadI32();
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
      TStruct struc = new TStruct("Conversation");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.friendCharId) {
        field.Name = "friendCharId";
        field.Type = TType.I64;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(FriendCharId);
        oprot.WriteFieldEnd();
      }
      if (__isset.unreadCount) {
        field.Name = "unreadCount";
        field.Type = TType.I16;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(UnreadCount);
        oprot.WriteFieldEnd();
      }
      if (__isset.lastTime) {
        field.Name = "lastTime";
        field.Type = TType.I32;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(LastTime);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("Conversation(");
      sb.Append("FriendCharId: ");
      sb.Append(FriendCharId);
      sb.Append(",UnreadCount: ");
      sb.Append(UnreadCount);
      sb.Append(",LastTime: ");
      sb.Append(LastTime);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
