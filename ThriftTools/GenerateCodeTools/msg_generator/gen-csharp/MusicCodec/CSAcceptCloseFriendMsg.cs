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
  /// 响应成为密友请求
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSAcceptCloseFriendMsg : TBase
  {
    private long _charId;
    private bool _agreed;

    /// <summary>
    /// 请求方角色id
    /// </summary>
    public long CharId
    {
      get
      {
        return _charId;
      }
      set
      {
        __isset.charId = true;
        this._charId = value;
      }
    }

    /// <summary>
    /// 是否同意
    /// </summary>
    public bool Agreed
    {
      get
      {
        return _agreed;
      }
      set
      {
        __isset.agreed = true;
        this._agreed = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool charId;
      public bool agreed;
    }

    public CSAcceptCloseFriendMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSAcceptCloseFriendMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.charId) {
        field.Name = "charId";
        field.Type = TType.I64;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(CharId);
        oprot.WriteFieldEnd();
      }
      if (__isset.agreed) {
        field.Name = "agreed";
        field.Type = TType.Bool;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(Agreed);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}
