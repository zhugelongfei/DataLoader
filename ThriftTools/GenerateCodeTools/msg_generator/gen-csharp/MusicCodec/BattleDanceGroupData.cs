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
  public partial class BattleDanceGroupData : TBase
  {
    private List<MusicalNote> _notes;
    private byte _index;

    public List<MusicalNote> Notes
    {
      get
      {
        return _notes;
      }
      set
      {
        __isset.notes = true;
        this._notes = value;
      }
    }

    public byte Index
    {
      get
      {
        return _index;
      }
      set
      {
        __isset.index = true;
        this._index = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool notes;
      public bool index;
    }

    public BattleDanceGroupData() {
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
                Notes = new List<MusicalNote>();
                TList _list182 = iprot.ReadListBegin();
                for( int _i183 = 0; _i183 < _list182.Count; ++_i183)
                {
                  MusicalNote _elem184 = new MusicalNote();
                  _elem184 = new MusicalNote();
                  _elem184.Read(iprot);
                  Notes.Add(_elem184);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Byte) {
              Index = iprot.ReadByte();
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
      TStruct struc = new TStruct("BattleDanceGroupData");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Notes != null && __isset.notes) {
        field.Name = "notes";
        field.Type = TType.List;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, Notes.Count));
          foreach (MusicalNote _iter185 in Notes)
          {
            _iter185.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (__isset.index) {
        field.Name = "index";
        field.Type = TType.Byte;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(Index);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("BattleDanceGroupData(");
      sb.Append("Notes: ");
      sb.Append(Notes);
      sb.Append(",Index: ");
      sb.Append(Index);
      sb.Append(")");
      return sb.ToString();
    }

  }

}