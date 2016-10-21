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
  public partial class SCLoversModeInitMsg : TBase
  {
    private MusicCodec.LoversDynInit _dynInit;
    private MusicCodec.LoversTrdInit _trdInit;
    private int _inputSyncSendMsgTime;
    private int _touchHeartSendMsgTime;
    private short _maxPower;
    private List<MusicCodec.LoversGame> _gameList;

    public MusicCodec.LoversDynInit DynInit
    {
      get
      {
        return _dynInit;
      }
      set
      {
        __isset.dynInit = true;
        this._dynInit = value;
      }
    }

    public MusicCodec.LoversTrdInit TrdInit
    {
      get
      {
        return _trdInit;
      }
      set
      {
        __isset.trdInit = true;
        this._trdInit = value;
      }
    }

    public int InputSyncSendMsgTime
    {
      get
      {
        return _inputSyncSendMsgTime;
      }
      set
      {
        __isset.inputSyncSendMsgTime = true;
        this._inputSyncSendMsgTime = value;
      }
    }

    public int TouchHeartSendMsgTime
    {
      get
      {
        return _touchHeartSendMsgTime;
      }
      set
      {
        __isset.touchHeartSendMsgTime = true;
        this._touchHeartSendMsgTime = value;
      }
    }

    public short MaxPower
    {
      get
      {
        return _maxPower;
      }
      set
      {
        __isset.maxPower = true;
        this._maxPower = value;
      }
    }

    public List<MusicCodec.LoversGame> GameList
    {
      get
      {
        return _gameList;
      }
      set
      {
        __isset.gameList = true;
        this._gameList = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool dynInit;
      public bool trdInit;
      public bool inputSyncSendMsgTime;
      public bool touchHeartSendMsgTime;
      public bool maxPower;
      public bool gameList;
    }

    public SCLoversModeInitMsg() {
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
              DynInit = new MusicCodec.LoversDynInit();
              DynInit.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Struct) {
              TrdInit = new MusicCodec.LoversTrdInit();
              TrdInit.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              InputSyncSendMsgTime = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I32) {
              TouchHeartSendMsgTime = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I16) {
              MaxPower = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 10:
            if (field.Type == TType.List) {
              {
                GameList = new List<MusicCodec.LoversGame>();
                TList _list57 = iprot.ReadListBegin();
                for( int _i58 = 0; _i58 < _list57.Count; ++_i58)
                {
                  MusicCodec.LoversGame _elem59 = new MusicCodec.LoversGame();
                  _elem59 = new MusicCodec.LoversGame();
                  _elem59.Read(iprot);
                  GameList.Add(_elem59);
                }
                iprot.ReadListEnd();
              }
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