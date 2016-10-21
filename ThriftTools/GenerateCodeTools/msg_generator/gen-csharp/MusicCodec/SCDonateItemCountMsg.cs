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
  /// ����������Ʒ����
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCDonateItemCountMsg : TBase
  {
    private long _targetCharId;
    private int _itemId;
    private byte _giftTimes;
    private byte _maxGiftCount;
    private int _addRelationValLangType;

    public long TargetCharId
    {
      get
      {
        return _targetCharId;
      }
      set
      {
        __isset.targetCharId = true;
        this._targetCharId = value;
      }
    }

    public int ItemId
    {
      get
      {
        return _itemId;
      }
      set
      {
        __isset.itemId = true;
        this._itemId = value;
      }
    }

    /// <summary>
    /// ����������
    /// </summary>
    public byte GiftTimes
    {
      get
      {
        return _giftTimes;
      }
      set
      {
        __isset.giftTimes = true;
        this._giftTimes = value;
      }
    }

    /// <summary>
    /// ����������Ʒ����
    /// </summary>
    public byte MaxGiftCount
    {
      get
      {
        return _maxGiftCount;
      }
      set
      {
        __isset.maxGiftCount = true;
        this._maxGiftCount = value;
      }
    }

    /// <summary>
    /// ���ӹ�ϵֵ����
    /// </summary>
    public int AddRelationValLangType
    {
      get
      {
        return _addRelationValLangType;
      }
      set
      {
        __isset.addRelationValLangType = true;
        this._addRelationValLangType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool targetCharId;
      public bool itemId;
      public bool giftTimes;
      public bool maxGiftCount;
      public bool addRelationValLangType;
    }

    public SCDonateItemCountMsg() {
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
              TargetCharId = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              ItemId = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Byte) {
              GiftTimes = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Byte) {
              MaxGiftCount = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I32) {
              AddRelationValLangType = iprot.ReadI32();
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