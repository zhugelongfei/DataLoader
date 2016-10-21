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
  public partial class CSInviteJoinRoomRespMsg : TBase
  {
    private byte _respResult;
    private int _roomId;
    private long _invterCharId;

    /// <summary>
    /// 0- reject 1-agree
    /// </summary>
    public byte RespResult
    {
      get
      {
        return _respResult;
      }
      set
      {
        __isset.respResult = true;
        this._respResult = value;
      }
    }

    /// <summary>
    /// the inviter char id
    /// </summary>
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

    public long InvterCharId
    {
      get
      {
        return _invterCharId;
      }
      set
      {
        __isset.invterCharId = true;
        this._invterCharId = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool respResult;
      public bool roomId;
      public bool invterCharId;
    }

    public CSInviteJoinRoomRespMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSInviteJoinRoomRespMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.respResult) {
        field.Name = "respResult";
        field.Type = TType.Byte;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(RespResult);
        oprot.WriteFieldEnd();
      }
      if (__isset.roomId) {
        field.Name = "roomId";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(RoomId);
        oprot.WriteFieldEnd();
      }
      if (__isset.invterCharId) {
        field.Name = "invterCharId";
        field.Type = TType.I64;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(InvterCharId);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}
