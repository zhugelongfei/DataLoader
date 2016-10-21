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
  public partial class CSDonateMsg : TBase
  {
    private long _reciveCharId;
    private List<MusicCodec.BuyItemInfo> _donateItems;
    private string _content;
    private bool _isGiftMarket;
    private bool _isLimitMarket;

    public long ReciveCharId
    {
      get
      {
        return _reciveCharId;
      }
      set
      {
        __isset.reciveCharId = true;
        this._reciveCharId = value;
      }
    }

    public List<MusicCodec.BuyItemInfo> DonateItems
    {
      get
      {
        return _donateItems;
      }
      set
      {
        __isset.donateItems = true;
        this._donateItems = value;
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

    /// <summary>
    /// 是否来自礼物商城
    /// </summary>
    public bool IsGiftMarket
    {
      get
      {
        return _isGiftMarket;
      }
      set
      {
        __isset.isGiftMarket = true;
        this._isGiftMarket = value;
      }
    }

    /// <summary>
    /// 是否来自限时商城
    /// </summary>
    public bool IsLimitMarket
    {
      get
      {
        return _isLimitMarket;
      }
      set
      {
        __isset.isLimitMarket = true;
        this._isLimitMarket = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool reciveCharId;
      public bool donateItems;
      public bool content;
      public bool isGiftMarket;
      public bool isLimitMarket;
    }

    public CSDonateMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSDonateMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.reciveCharId) {
        field.Name = "reciveCharId";
        field.Type = TType.I64;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(ReciveCharId);
        oprot.WriteFieldEnd();
      }
      if (DonateItems != null && __isset.donateItems) {
        field.Name = "donateItems";
        field.Type = TType.List;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, DonateItems.Count));
          foreach (MusicCodec.BuyItemInfo _iter3 in DonateItems)
          {
            _iter3.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (Content != null && __isset.content) {
        field.Name = "content";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Content);
        oprot.WriteFieldEnd();
      }
      if (__isset.isGiftMarket) {
        field.Name = "isGiftMarket";
        field.Type = TType.Bool;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(IsGiftMarket);
        oprot.WriteFieldEnd();
      }
      if (__isset.isLimitMarket) {
        field.Name = "isLimitMarket";
        field.Type = TType.Bool;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(IsLimitMarket);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}
