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
  /// ����ֵͨ���������
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class PassCheerCondResult : TBase
  {
    private List<PassCond> _conds;
    private byte _passStatus;

    public List<PassCond> Conds
    {
      get
      {
        return _conds;
      }
      set
      {
        __isset.conds = true;
        this._conds = value;
      }
    }

    /// <summary>
    /// 0-δ���� 1-����
    /// </summary>
    public byte PassStatus
    {
      get
      {
        return _passStatus;
      }
      set
      {
        __isset.passStatus = true;
        this._passStatus = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool conds;
      public bool passStatus;
    }

    public PassCheerCondResult() {
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
            if (field.Type == TType.List) {
              {
                Conds = new List<PassCond>();
                TList _list310 = iprot.ReadListBegin();
                for( int _i311 = 0; _i311 < _list310.Count; ++_i311)
                {
                  PassCond _elem312 = new PassCond();
                  _elem312 = new PassCond();
                  _elem312.Read(iprot);
                  Conds.Add(_elem312);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Byte) {
              PassStatus = iprot.ReadByte();
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
      TStruct struc = new TStruct("PassCheerCondResult");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Conds != null && __isset.conds) {
        field.Name = "conds";
        field.Type = TType.List;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, Conds.Count));
          foreach (PassCond _iter313 in Conds)
          {
            _iter313.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (__isset.passStatus) {
        field.Name = "passStatus";
        field.Type = TType.Byte;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(PassStatus);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("PassCheerCondResult(");
      sb.Append("Conds: ");
      sb.Append(Conds);
      sb.Append(",PassStatus: ");
      sb.Append(PassStatus);
      sb.Append(")");
      return sb.ToString();
    }

  }

}