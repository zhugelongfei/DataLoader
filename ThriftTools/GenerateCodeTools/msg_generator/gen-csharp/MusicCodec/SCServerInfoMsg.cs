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
  public partial class SCServerInfoMsg : TBase
  {
    private short _maleNum;
    private short _femaleNum;
    private int _activitySwitch;
    private short _marketSwitch;
    private long _systemSwitch;
    private byte _voiceServerId;
    private int _serverTime;
    private long _rankSwitch;

    public short MaleNum
    {
      get
      {
        return _maleNum;
      }
      set
      {
        __isset.maleNum = true;
        this._maleNum = value;
      }
    }

    public short FemaleNum
    {
      get
      {
        return _femaleNum;
      }
      set
      {
        __isset.femaleNum = true;
        this._femaleNum = value;
      }
    }

    public int ActivitySwitch
    {
      get
      {
        return _activitySwitch;
      }
      set
      {
        __isset.activitySwitch = true;
        this._activitySwitch = value;
      }
    }

    public short MarketSwitch
    {
      get
      {
        return _marketSwitch;
      }
      set
      {
        __isset.marketSwitch = true;
        this._marketSwitch = value;
      }
    }

    public long SystemSwitch
    {
      get
      {
        return _systemSwitch;
      }
      set
      {
        __isset.systemSwitch = true;
        this._systemSwitch = value;
      }
    }

    public byte VoiceServerId
    {
      get
      {
        return _voiceServerId;
      }
      set
      {
        __isset.voiceServerId = true;
        this._voiceServerId = value;
      }
    }

    public int ServerTime
    {
      get
      {
        return _serverTime;
      }
      set
      {
        __isset.serverTime = true;
        this._serverTime = value;
      }
    }

    public long RankSwitch
    {
      get
      {
        return _rankSwitch;
      }
      set
      {
        __isset.rankSwitch = true;
        this._rankSwitch = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool maleNum;
      public bool femaleNum;
      public bool activitySwitch;
      public bool marketSwitch;
      public bool systemSwitch;
      public bool voiceServerId;
      public bool serverTime;
      public bool rankSwitch;
    }

    public SCServerInfoMsg() {
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
              MaleNum = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I16) {
              FemaleNum = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              ActivitySwitch = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I16) {
              MarketSwitch = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I64) {
              SystemSwitch = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.Byte) {
              VoiceServerId = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.I32) {
              ServerTime = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.I64) {
              RankSwitch = iprot.ReadI64();
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