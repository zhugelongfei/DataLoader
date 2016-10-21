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
  public partial class CSBindUserNameMsg : TBase
  {
    private string _userName;
    private string _pswd;
    private long _bindCharId;

    public string UserName
    {
      get
      {
        return _userName;
      }
      set
      {
        __isset.userName = true;
        this._userName = value;
      }
    }

    public string Pswd
    {
      get
      {
        return _pswd;
      }
      set
      {
        __isset.pswd = true;
        this._pswd = value;
      }
    }

    public long BindCharId
    {
      get
      {
        return _bindCharId;
      }
      set
      {
        __isset.bindCharId = true;
        this._bindCharId = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool userName;
      public bool pswd;
      public bool bindCharId;
    }

    public CSBindUserNameMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSBindUserNameMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (UserName != null && __isset.userName) {
        field.Name = "userName";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(UserName);
        oprot.WriteFieldEnd();
      }
      if (Pswd != null && __isset.pswd) {
        field.Name = "pswd";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Pswd);
        oprot.WriteFieldEnd();
      }
      if (__isset.bindCharId) {
        field.Name = "bindCharId";
        field.Type = TType.I64;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(BindCharId);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}
