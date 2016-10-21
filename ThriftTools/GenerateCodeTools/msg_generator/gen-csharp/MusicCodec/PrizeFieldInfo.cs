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
  public partial class PrizeFieldInfo : TBase
  {
    private PrizeType _prizeType;
    private long _id;
    private long _param;

    /// <summary>
    /// 
    /// <seealso cref="PrizeType"/>
    /// </summary>
    public PrizeType PrizeType
    {
      get
      {
        return _prizeType;
      }
      set
      {
        __isset.prizeType = true;
        this._prizeType = value;
      }
    }

    public long Id
    {
      get
      {
        return _id;
      }
      set
      {
        __isset.id = true;
        this._id = value;
      }
    }

    public long Param
    {
      get
      {
        return _param;
      }
      set
      {
        __isset.param = true;
        this._param = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool prizeType;
      public bool id;
      public bool param;
    }

    public PrizeFieldInfo() {
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
              PrizeType = (PrizeType)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I64) {
              Id = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I64) {
              Param = iprot.ReadI64();
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
      TStruct struc = new TStruct("PrizeFieldInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.prizeType) {
        field.Name = "prizeType";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)PrizeType);
        oprot.WriteFieldEnd();
      }
      if (__isset.id) {
        field.Name = "id";
        field.Type = TType.I64;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(Id);
        oprot.WriteFieldEnd();
      }
      if (__isset.param) {
        field.Name = "param";
        field.Type = TType.I64;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(Param);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("PrizeFieldInfo(");
      sb.Append("PrizeType: ");
      sb.Append(PrizeType);
      sb.Append(",Id: ");
      sb.Append(Id);
      sb.Append(",Param: ");
      sb.Append(Param);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
