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
  public partial class QuickMatchDancer : TBase
  {
    private short _songId;
    private PlayerBaseInfo _playerBaseInfo;

    public short SongId
    {
      get
      {
        return _songId;
      }
      set
      {
        __isset.songId = true;
        this._songId = value;
      }
    }

    public PlayerBaseInfo PlayerBaseInfo
    {
      get
      {
        return _playerBaseInfo;
      }
      set
      {
        __isset.playerBaseInfo = true;
        this._playerBaseInfo = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool songId;
      public bool playerBaseInfo;
    }

    public QuickMatchDancer() {
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
              SongId = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Struct) {
              PlayerBaseInfo = new PlayerBaseInfo();
              PlayerBaseInfo.Read(iprot);
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
      TStruct struc = new TStruct("QuickMatchDancer");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.songId) {
        field.Name = "songId";
        field.Type = TType.I16;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(SongId);
        oprot.WriteFieldEnd();
      }
      if (PlayerBaseInfo != null && __isset.playerBaseInfo) {
        field.Name = "playerBaseInfo";
        field.Type = TType.Struct;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        PlayerBaseInfo.Write(oprot);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("QuickMatchDancer(");
      sb.Append("SongId: ");
      sb.Append(SongId);
      sb.Append(",PlayerBaseInfo: ");
      sb.Append(PlayerBaseInfo== null ? "<null>" : PlayerBaseInfo.ToString());
      sb.Append(")");
      return sb.ToString();
    }

  }

}