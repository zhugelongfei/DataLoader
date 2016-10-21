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
  /// �����̵���Ϣ
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCGuildShopMsg : TBase
  {
    private List<MusicCodec.GuildShopItem> _items;
    private int _version;
    private int _startIndex;
    private int _totalCount;

    public List<MusicCodec.GuildShopItem> Items
    {
      get
      {
        return _items;
      }
      set
      {
        __isset.items = true;
        this._items = value;
      }
    }

    public int Version
    {
      get
      {
        return _version;
      }
      set
      {
        __isset.version = true;
        this._version = value;
      }
    }

    public int StartIndex
    {
      get
      {
        return _startIndex;
      }
      set
      {
        __isset.startIndex = true;
        this._startIndex = value;
      }
    }

    public int TotalCount
    {
      get
      {
        return _totalCount;
      }
      set
      {
        __isset.totalCount = true;
        this._totalCount = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool items;
      public bool version;
      public bool startIndex;
      public bool totalCount;
    }

    public SCGuildShopMsg() {
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
            if (field.Type == TType.List) {
              {
                Items = new List<MusicCodec.GuildShopItem>();
                TList _list0 = iprot.ReadListBegin();
                for( int _i1 = 0; _i1 < _list0.Count; ++_i1)
                {
                  MusicCodec.GuildShopItem _elem2 = new MusicCodec.GuildShopItem();
                  _elem2 = new MusicCodec.GuildShopItem();
                  _elem2.Read(iprot);
                  Items.Add(_elem2);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              Version = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              StartIndex = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I32) {
              TotalCount = iprot.ReadI32();
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
