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
  /// ��Ӧ���
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSAcceptLoverProposal : TBase
  {
    private long _loverCharId;
    private bool _isAccept;

    public long LoverCharId
    {
      get
      {
        return _loverCharId;
      }
      set
      {
        __isset.loverCharId = true;
        this._loverCharId = value;
      }
    }

    public bool IsAccept
    {
      get
      {
        return _isAccept;
      }
      set
      {
        __isset.isAccept = true;
        this._isAccept = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool loverCharId;
      public bool isAccept;
    }

    public CSAcceptLoverProposal() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSAcceptLoverProposal");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.loverCharId) {
        field.Name = "loverCharId";
        field.Type = TType.I64;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(LoverCharId);
        oprot.WriteFieldEnd();
      }
      if (__isset.isAccept) {
        field.Name = "isAccept";
        field.Type = TType.Bool;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(IsAccept);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}
