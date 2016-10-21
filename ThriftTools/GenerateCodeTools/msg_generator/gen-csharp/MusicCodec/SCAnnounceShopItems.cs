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
  /// ͨ���̵���Ʒ��Ϣ
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCAnnounceShopItems : TBase
  {
    private int _shopVersion;
    private List<MusicCodec.ItemObject> _items;
    private int _refreshCost;
    private short _leftFreeTimes;

    /// <summary>
    /// ͨ���̵�汾
    /// </summary>
    public int ShopVersion
    {
      get
      {
        return _shopVersion;
      }
      set
      {
        __isset.shopVersion = true;
        this._shopVersion = value;
      }
    }

    /// <summary>
    /// key : ��Ʒid ,val: ��Ʒ����
    /// </summary>
    public List<MusicCodec.ItemObject> Items
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

    /// <summary>
    /// ˢ������
    /// </summary>
    public int RefreshCost
    {
      get
      {
        return _refreshCost;
      }
      set
      {
        __isset.refreshCost = true;
        this._refreshCost = value;
      }
    }

    /// <summary>
    /// ʣ�����ˢ�´���
    /// </summary>
    public short LeftFreeTimes
    {
      get
      {
        return _leftFreeTimes;
      }
      set
      {
        __isset.leftFreeTimes = true;
        this._leftFreeTimes = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool shopVersion;
      public bool items;
      public bool refreshCost;
      public bool leftFreeTimes;
    }

    public SCAnnounceShopItems() {
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
              ShopVersion = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                Items = new List<MusicCodec.ItemObject>();
                TList _list4 = iprot.ReadListBegin();
                for( int _i5 = 0; _i5 < _list4.Count; ++_i5)
                {
                  MusicCodec.ItemObject _elem6 = new MusicCodec.ItemObject();
                  _elem6 = new MusicCodec.ItemObject();
                  _elem6.Read(iprot);
                  Items.Add(_elem6);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              RefreshCost = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I16) {
              LeftFreeTimes = iprot.ReadI16();
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