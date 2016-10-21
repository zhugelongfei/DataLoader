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
  /// 使用密友或情侣间的关系等级称呼
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSUseRelationshipMsg : TBase
  {
    private byte _relationshipLvl;
    private long _toCharId;

    public byte RelationshipLvl
    {
      get
      {
        return _relationshipLvl;
      }
      set
      {
        __isset.relationshipLvl = true;
        this._relationshipLvl = value;
      }
    }

    public long ToCharId
    {
      get
      {
        return _toCharId;
      }
      set
      {
        __isset.toCharId = true;
        this._toCharId = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool relationshipLvl;
      public bool toCharId;
    }

    public CSUseRelationshipMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSUseRelationshipMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.relationshipLvl) {
        field.Name = "relationshipLvl";
        field.Type = TType.Byte;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(RelationshipLvl);
        oprot.WriteFieldEnd();
      }
      if (__isset.toCharId) {
        field.Name = "toCharId";
        field.Type = TType.I64;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(ToCharId);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}
