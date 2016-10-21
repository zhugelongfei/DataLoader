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
  public partial class BattleDancePartData : TBase
  {
    private List<BattleDanceGroupData> _groups;
    private byte _partIndex;

    public List<BattleDanceGroupData> Groups
    {
      get
      {
        return _groups;
      }
      set
      {
        __isset.groups = true;
        this._groups = value;
      }
    }

    public byte PartIndex
    {
      get
      {
        return _partIndex;
      }
      set
      {
        __isset.partIndex = true;
        this._partIndex = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool groups;
      public bool partIndex;
    }

    public BattleDancePartData() {
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
                Groups = new List<BattleDanceGroupData>();
                TList _list186 = iprot.ReadListBegin();
                for( int _i187 = 0; _i187 < _list186.Count; ++_i187)
                {
                  BattleDanceGroupData _elem188 = new BattleDanceGroupData();
                  _elem188 = new BattleDanceGroupData();
                  _elem188.Read(iprot);
                  Groups.Add(_elem188);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Byte) {
              PartIndex = iprot.ReadByte();
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
      TStruct struc = new TStruct("BattleDancePartData");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Groups != null && __isset.groups) {
        field.Name = "groups";
        field.Type = TType.List;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, Groups.Count));
          foreach (BattleDanceGroupData _iter189 in Groups)
          {
            _iter189.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (__isset.partIndex) {
        field.Name = "partIndex";
        field.Type = TType.Byte;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(PartIndex);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("BattleDancePartData(");
      sb.Append("Groups: ");
      sb.Append(Groups);
      sb.Append(",PartIndex: ");
      sb.Append(PartIndex);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
