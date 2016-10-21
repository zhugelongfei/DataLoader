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
  /// ��Ӧ����������
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSResponseRoomActionMsg : TBase
  {
    private int _actionId;
    private long _srcCharId;
    private byte _result;

    public int ActionId
    {
      get
      {
        return _actionId;
      }
      set
      {
        __isset.actionId = true;
        this._actionId = value;
      }
    }

    /// <summary>
    /// ��������ɫid
    /// </summary>
    public long SrcCharId
    {
      get
      {
        return _srcCharId;
      }
      set
      {
        __isset.srcCharId = true;
        this._srcCharId = value;
      }
    }

    /// <summary>
    /// ͬ��-1 �ܾ�-0
    /// </summary>
    public byte Result
    {
      get
      {
        return _result;
      }
      set
      {
        __isset.result = true;
        this._result = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool actionId;
      public bool srcCharId;
      public bool result;
    }

    public CSResponseRoomActionMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSResponseRoomActionMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.actionId) {
        field.Name = "actionId";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(ActionId);
        oprot.WriteFieldEnd();
      }
      if (__isset.srcCharId) {
        field.Name = "srcCharId";
        field.Type = TType.I64;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(SrcCharId);
        oprot.WriteFieldEnd();
      }
      if (__isset.result) {
        field.Name = "result";
        field.Type = TType.Byte;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(Result);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}