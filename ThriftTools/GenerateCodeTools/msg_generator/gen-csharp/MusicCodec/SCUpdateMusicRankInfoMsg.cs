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
  public partial class SCUpdateMusicRankInfoMsg : TBase
  {
    private int _lastMusicId;
    private byte _musicLevel;
    private short _curretRank;
    private int _score;

    public int LastMusicId
    {
      get
      {
        return _lastMusicId;
      }
      set
      {
        __isset.lastMusicId = true;
        this._lastMusicId = value;
      }
    }

    public byte MusicLevel
    {
      get
      {
        return _musicLevel;
      }
      set
      {
        __isset.musicLevel = true;
        this._musicLevel = value;
      }
    }

    public short CurretRank
    {
      get
      {
        return _curretRank;
      }
      set
      {
        __isset.curretRank = true;
        this._curretRank = value;
      }
    }

    public int Score
    {
      get
      {
        return _score;
      }
      set
      {
        __isset.score = true;
        this._score = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool lastMusicId;
      public bool musicLevel;
      public bool curretRank;
      public bool score;
    }

    public SCUpdateMusicRankInfoMsg() {
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
              LastMusicId = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Byte) {
              MusicLevel = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I16) {
              CurretRank = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I32) {
              Score = iprot.ReadI32();
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
ClientLog.Instance.LogError("This function is deleted.");
}

    


  }

}
