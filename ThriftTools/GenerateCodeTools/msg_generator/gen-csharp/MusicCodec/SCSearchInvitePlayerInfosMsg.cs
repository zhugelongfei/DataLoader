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
  public partial class SCSearchInvitePlayerInfosMsg : TBase
  {
    private byte _relation;
    private List<MusicCodec.InvitePlayerInfo> _playerInfos;

    /// <summary>
    /// 0-stranger 1-friend
    /// </summary>
    public byte Relation
    {
      get
      {
        return _relation;
      }
      set
      {
        __isset.relation = true;
        this._relation = value;
      }
    }

    public List<MusicCodec.InvitePlayerInfo> PlayerInfos
    {
      get
      {
        return _playerInfos;
      }
      set
      {
        __isset.playerInfos = true;
        this._playerInfos = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool relation;
      public bool playerInfos;
    }

    public SCSearchInvitePlayerInfosMsg() {
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
              Relation = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                PlayerInfos = new List<MusicCodec.InvitePlayerInfo>();
                TList _list16 = iprot.ReadListBegin();
                for( int _i17 = 0; _i17 < _list16.Count; ++_i17)
                {
                  MusicCodec.InvitePlayerInfo _elem18 = new MusicCodec.InvitePlayerInfo();
                  _elem18 = new MusicCodec.InvitePlayerInfo();
                  _elem18.Read(iprot);
                  PlayerInfos.Add(_elem18);
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
