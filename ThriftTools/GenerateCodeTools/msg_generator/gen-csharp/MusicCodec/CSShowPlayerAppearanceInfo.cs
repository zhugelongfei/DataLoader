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
  /// ��ʾ��������Ϣ
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSShowPlayerAppearanceInfo : TBase
  {
    private long _firstCharId;
    private short _tid;
    private long _secCharId;

    public long FirstCharId
    {
      get
      {
        return _firstCharId;
      }
      set
      {
        __isset.firstCharId = true;
        this._firstCharId = value;
      }
    }

    public short Tid
    {
      get
      {
        return _tid;
      }
      set
      {
        __isset.tid = true;
        this._tid = value;
      }
    }

    public long SecCharId
    {
      get
      {
        return _secCharId;
      }
      set
      {
        __isset.secCharId = true;
        this._secCharId = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool firstCharId;
      public bool tid;
      public bool secCharId;
    }

    public CSShowPlayerAppearanceInfo() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSShowPlayerAppearanceInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.firstCharId) {
        field.Name = "firstCharId";
        field.Type = TType.I64;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(FirstCharId);
        oprot.WriteFieldEnd();
      }
      if (__isset.tid) {
        field.Name = "tid";
        field.Type = TType.I16;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(Tid);
        oprot.WriteFieldEnd();
      }
      if (__isset.secCharId) {
        field.Name = "secCharId";
        field.Type = TType.I64;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(SecCharId);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}