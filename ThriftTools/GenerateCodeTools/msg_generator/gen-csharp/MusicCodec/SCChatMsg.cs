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
  public partial class SCChatMsg : TBase
  {
    private byte _scope;
    private string _content;
    private string _soundNameKey;
    private long _fromAccountId;
    private MusicCodec.PlayerBaseInfo _fromPlayer;
    private Dictionary<byte, int> _fromChatFashionIds;
    private bool _isGuildInvite;
    private bool _isInRoom;
    private int _sendAutoSpeakerIndex;

    public byte Scope
    {
      get
      {
        return _scope;
      }
      set
      {
        __isset.scope = true;
        this._scope = value;
      }
    }

    public string Content
    {
      get
      {
        return _content;
      }
      set
      {
        __isset.content = true;
        this._content = value;
      }
    }

    public string SoundNameKey
    {
      get
      {
        return _soundNameKey;
      }
      set
      {
        __isset.soundNameKey = true;
        this._soundNameKey = value;
      }
    }

    public long FromAccountId
    {
      get
      {
        return _fromAccountId;
      }
      set
      {
        __isset.fromAccountId = true;
        this._fromAccountId = value;
      }
    }

    public MusicCodec.PlayerBaseInfo FromPlayer
    {
      get
      {
        return _fromPlayer;
      }
      set
      {
        __isset.fromPlayer = true;
        this._fromPlayer = value;
      }
    }

    /// <summary>
    /// ��������ʱ��Ч��key:style val:id
    /// </summary>
    public Dictionary<byte, int> FromChatFashionIds
    {
      get
      {
        return _fromChatFashionIds;
      }
      set
      {
        __isset.fromChatFashionIds = true;
        this._fromChatFashionIds = value;
      }
    }

    /// <summary>
    /// �Ƿ�������ļ
    /// </summary>
    public bool IsGuildInvite
    {
      get
      {
        return _isGuildInvite;
      }
      set
      {
        __isset.isGuildInvite = true;
        this._isGuildInvite = value;
      }
    }

    /// <summary>
    /// ��ǰ�Ƿ��ڷ�����
    /// </summary>
    public bool IsInRoom
    {
      get
      {
        return _isInRoom;
      }
      set
      {
        __isset.isInRoom = true;
        this._isInRoom = value;
      }
    }

    /// <summary>
    /// �Զ��������
    /// </summary>
    public int SendAutoSpeakerIndex
    {
      get
      {
        return _sendAutoSpeakerIndex;
      }
      set
      {
        __isset.sendAutoSpeakerIndex = true;
        this._sendAutoSpeakerIndex = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool scope;
      public bool content;
      public bool soundNameKey;
      public bool fromAccountId;
      public bool fromPlayer;
      public bool fromChatFashionIds;
      public bool isGuildInvite;
      public bool isInRoom;
      public bool sendAutoSpeakerIndex;
    }

    public SCChatMsg() {
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
              Scope = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              Content = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              SoundNameKey = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I64) {
              FromAccountId = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.Struct) {
              FromPlayer = new MusicCodec.PlayerBaseInfo();
              FromPlayer.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.Map) {
              {
                FromChatFashionIds = new Dictionary<byte, int>();
                TMap _map12 = iprot.ReadMapBegin();
                for( int _i13 = 0; _i13 < _map12.Count; ++_i13)
                {
                  byte _key14;
                  int _val15;
                  _key14 = iprot.ReadByte();
                  _val15 = iprot.ReadI32();
                  FromChatFashionIds[_key14] = _val15;
                }
                iprot.ReadMapEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.Bool) {
              IsGuildInvite = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.Bool) {
              IsInRoom = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 9:
            if (field.Type == TType.I32) {
              SendAutoSpeakerIndex = iprot.ReadI32();
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