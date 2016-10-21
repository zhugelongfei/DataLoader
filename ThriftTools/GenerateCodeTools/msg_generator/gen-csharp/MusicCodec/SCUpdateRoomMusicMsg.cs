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
  public partial class SCUpdateRoomMusicMsg : TBase
  {
    private byte _mode;
    private byte _songLvl;
    private short _songId;
    private string _pswd;
    private int _stageId;

    public byte Mode
    {
      get
      {
        return _mode;
      }
      set
      {
        __isset.mode = true;
        this._mode = value;
      }
    }

    public byte SongLvl
    {
      get
      {
        return _songLvl;
      }
      set
      {
        __isset.songLvl = true;
        this._songLvl = value;
      }
    }

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

    public int StageId
    {
      get
      {
        return _stageId;
      }
      set
      {
        __isset.stageId = true;
        this._stageId = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool mode;
      public bool songLvl;
      public bool songId;
      public bool pswd;
      public bool stageId;
    }

    public SCUpdateRoomMusicMsg() {
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
            if (field.Type == TType.Byte) {
              Mode = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Byte) {
              SongLvl = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I16) {
              SongId = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              Pswd = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I32) {
              StageId = iprot.ReadI32();
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