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
  public partial class SCLoversGameMsg : TBase
  {
    private MusicCodec.LoversAQGameResp _aqGameResp;
    private MusicCodec.LoversTouchHeartGameResp _touchHeartGameResp;
    private byte _gameIndex;

    public MusicCodec.LoversAQGameResp AqGameResp
    {
      get
      {
        return _aqGameResp;
      }
      set
      {
        __isset.aqGameResp = true;
        this._aqGameResp = value;
      }
    }

    public MusicCodec.LoversTouchHeartGameResp TouchHeartGameResp
    {
      get
      {
        return _touchHeartGameResp;
      }
      set
      {
        __isset.touchHeartGameResp = true;
        this._touchHeartGameResp = value;
      }
    }

    public byte GameIndex
    {
      get
      {
        return _gameIndex;
      }
      set
      {
        __isset.gameIndex = true;
        this._gameIndex = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool aqGameResp;
      public bool touchHeartGameResp;
      public bool gameIndex;
    }

    public SCLoversGameMsg() {
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
            if (field.Type == TType.Struct) {
              AqGameResp = new MusicCodec.LoversAQGameResp();
              AqGameResp.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Struct) {
              TouchHeartGameResp = new MusicCodec.LoversTouchHeartGameResp();
              TouchHeartGameResp.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 10:
            if (field.Type == TType.Byte) {
              GameIndex = iprot.ReadByte();
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