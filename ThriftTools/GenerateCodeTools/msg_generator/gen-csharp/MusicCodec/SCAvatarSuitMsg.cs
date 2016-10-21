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
  /// ��װ��װ��Ϣ
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCAvatarSuitMsg : TBase
  {
    private Dictionary<byte, MusicCodec.AvatarSuitInfo> _suitInfos;
    private Dictionary<byte, int> _unlockInfos;
    private byte _usedSuitId;

    /// <summary>
    /// ��װid��1��ʼ��-��װ��Ϣ
    /// </summary>
    public Dictionary<byte, MusicCodec.AvatarSuitInfo> SuitInfos
    {
      get
      {
        return _suitInfos;
      }
      set
      {
        __isset.suitInfos = true;
        this._suitInfos = value;
      }
    }

    /// <summary>
    /// δ������ʾ����װid��1��ʼ��-��ʾ
    /// </summary>
    public Dictionary<byte, int> UnlockInfos
    {
      get
      {
        return _unlockInfos;
      }
      set
      {
        __isset.unlockInfos = true;
        this._unlockInfos = value;
      }
    }

    /// <summary>
    /// ��ǰʹ����װ
    /// </summary>
    public byte UsedSuitId
    {
      get
      {
        return _usedSuitId;
      }
      set
      {
        __isset.usedSuitId = true;
        this._usedSuitId = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool suitInfos;
      public bool unlockInfos;
      public bool usedSuitId;
    }

    public SCAvatarSuitMsg() {
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
            if (field.Type == TType.Map) {
              {
                SuitInfos = new Dictionary<byte, MusicCodec.AvatarSuitInfo>();
                TMap _map48 = iprot.ReadMapBegin();
                for( int _i49 = 0; _i49 < _map48.Count; ++_i49)
                {
                  byte _key50;
                  MusicCodec.AvatarSuitInfo _val51;
                  _key50 = iprot.ReadByte();
                  _val51 = new MusicCodec.AvatarSuitInfo();
                  _val51.Read(iprot);
                  SuitInfos[_key50] = _val51;
                }
                iprot.ReadMapEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Map) {
              {
                UnlockInfos = new Dictionary<byte, int>();
                TMap _map52 = iprot.ReadMapBegin();
                for( int _i53 = 0; _i53 < _map52.Count; ++_i53)
                {
                  byte _key54;
                  int _val55;
                  _key54 = iprot.ReadByte();
                  _val55 = iprot.ReadI32();
                  UnlockInfos[_key54] = _val55;
                }
                iprot.ReadMapEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Byte) {
              UsedSuitId = iprot.ReadByte();
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