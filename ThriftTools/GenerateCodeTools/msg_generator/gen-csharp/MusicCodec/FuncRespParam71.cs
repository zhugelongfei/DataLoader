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
  public partial class FuncRespParam71 : TBase
  {
    private short _durationTime;
    private short _cd;

    public short DurationTime
    {
      get
      {
        return _durationTime;
      }
      set
      {
        __isset.durationTime = true;
        this._durationTime = value;
      }
    }

    public short Cd
    {
      get
      {
        return _cd;
      }
      set
      {
        __isset.cd = true;
        this._cd = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool durationTime;
      public bool cd;
    }

    public FuncRespParam71() {
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
            if (field.Type == TType.I16) {
              DurationTime = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I16) {
              Cd = iprot.ReadI16();
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
      TStruct struc = new TStruct("FuncRespParam71");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.durationTime) {
        field.Name = "durationTime";
        field.Type = TType.I16;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(DurationTime);
        oprot.WriteFieldEnd();
      }
      if (__isset.cd) {
        field.Name = "cd";
        field.Type = TType.I16;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(Cd);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("FuncRespParam71(");
      sb.Append("DurationTime: ");
      sb.Append(DurationTime);
      sb.Append(",Cd: ");
      sb.Append(Cd);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
