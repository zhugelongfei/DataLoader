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
  public partial class SCChangeAvatarMsg : TBase
  {
    private long _charId;
    private List<MusicCodec.AvatarInfo> _avatarItems;

    public long CharId
    {
      get
      {
        return _charId;
      }
      set
      {
        __isset.charId = true;
        this._charId = value;
      }
    }

    public List<MusicCodec.AvatarInfo> AvatarItems
    {
      get
      {
        return _avatarItems;
      }
      set
      {
        __isset.avatarItems = true;
        this._avatarItems = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool charId;
      public bool avatarItems;
    }

    public SCChangeAvatarMsg() {
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
            if (field.Type == TType.I64) {
              CharId = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                AvatarItems = new List<MusicCodec.AvatarInfo>();
                TList _list36 = iprot.ReadListBegin();
                for( int _i37 = 0; _i37 < _list36.Count; ++_i37)
                {
                  MusicCodec.AvatarInfo _elem38 = new MusicCodec.AvatarInfo();
                  _elem38 = new MusicCodec.AvatarInfo();
                  _elem38.Read(iprot);
                  AvatarItems.Add(_elem38);
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
