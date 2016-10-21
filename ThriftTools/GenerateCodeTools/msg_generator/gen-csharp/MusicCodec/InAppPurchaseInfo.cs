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
  /// 充值套餐信息
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class InAppPurchaseInfo : TBase
  {
    private int _id;
    private string _itemId;
    private byte _itemType;
    private string _name;
    private string _des;
    private int _ib;
    private double _currency;
    private string _currencyType;
    private int _additionReward;
    private string _icon;
    private bool _recommend;
    private string _afterByDesc;
    private string _adviseDesc;

    /// <summary>
    /// 价格档位
    /// </summary>
    public int Id
    {
      get
      {
        return _id;
      }
      set
      {
        __isset.id = true;
        this._id = value;
      }
    }

    /// <summary>
    /// 道具ID
    /// </summary>
    public string ItemId
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
    /// 类型 0->真实砖石 1->红包
    /// </summary>
    public byte ItemType
    {
      get
      {
        return _itemType;
      }
      set
      {
        __isset.itemType = true;
        this._itemType = value;
      }
    }

    /// <summary>
    /// 物品名称
    /// </summary>
    public string Name
    {
      get
      {
        return _name;
      }
      set
      {
        __isset.name = true;
        this._name = value;
      }
    }

    /// <summary>
    /// 描述
    /// </summary>
    public string Des
    {
      get
      {
        return _des;
      }
      set
      {
        __isset.des = true;
        this._des = value;
      }
    }

    /// <summary>
    /// 砖石数量
    /// </summary>
    public int Ib
    {
      get
      {
        return _ib;
      }
      set
      {
        __isset.ib = true;
        this._ib = value;
      }
    }

    /// <summary>
    /// 货币
    /// </summary>
    public double Currency
    {
      get
      {
        return _currency;
      }
      set
      {
        __isset.currency = true;
        this._currency = value;
      }
    }

    /// <summary>
    /// 货币类型
    /// </summary>
    public string CurrencyType
    {
      get
      {
        return _currencyType;
      }
      set
      {
        __isset.currencyType = true;
        this._currencyType = value;
      }
    }

    /// <summary>
    /// 额外货币数量
    /// </summary>
    public int AdditionReward
    {
      get
      {
        return _additionReward;
      }
      set
      {
        __isset.additionReward = true;
        this._additionReward = value;
      }
    }

    /// <summary>
    /// 图标
    /// </summary>
    public string Icon
    {
      get
      {
        return _icon;
      }
      set
      {
        __isset.icon = true;
        this._icon = value;
      }
    }

    /// <summary>
    /// 推荐描述
    /// </summary>
    public bool Recommend
    {
      get
      {
        return _recommend;
      }
      set
      {
        __isset.recommend = true;
        this._recommend = value;
      }
    }

    /// <summary>
    /// 购买完描述
    /// </summary>
    public string AfterByDesc
    {
      get
      {
        return _afterByDesc;
      }
      set
      {
        __isset.afterByDesc = true;
        this._afterByDesc = value;
      }
    }

    /// <summary>
    /// 推荐描述
    /// </summary>
    public string AdviseDesc
    {
      get
      {
        return _adviseDesc;
      }
      set
      {
        __isset.adviseDesc = true;
        this._adviseDesc = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool id;
      public bool itemId;
      public bool itemType;
      public bool name;
      public bool des;
      public bool ib;
      public bool currency;
      public bool currencyType;
      public bool additionReward;
      public bool icon;
      public bool recommend;
      public bool afterByDesc;
      public bool adviseDesc;
    }

    public InAppPurchaseInfo() {
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
              Id = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              ItemId = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Byte) {
              ItemType = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              Name = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.String) {
              Des = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.I32) {
              Ib = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.Double) {
              Currency = iprot.ReadDouble();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.String) {
              CurrencyType = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 9:
            if (field.Type == TType.I32) {
              AdditionReward = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 10:
            if (field.Type == TType.String) {
              Icon = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 11:
            if (field.Type == TType.Bool) {
              Recommend = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 12:
            if (field.Type == TType.String) {
              AfterByDesc = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 13:
            if (field.Type == TType.String) {
              AdviseDesc = iprot.ReadString();
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
      TStruct struc = new TStruct("InAppPurchaseInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.id) {
        field.Name = "id";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Id);
        oprot.WriteFieldEnd();
      }
      if (ItemId != null && __isset.itemId) {
        field.Name = "itemId";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ItemId);
        oprot.WriteFieldEnd();
      }
      if (__isset.itemType) {
        field.Name = "itemType";
        field.Type = TType.Byte;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(ItemType);
        oprot.WriteFieldEnd();
      }
      if (Name != null && __isset.name) {
        field.Name = "name";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Name);
        oprot.WriteFieldEnd();
      }
      if (Des != null && __isset.des) {
        field.Name = "des";
        field.Type = TType.String;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Des);
        oprot.WriteFieldEnd();
      }
      if (__isset.ib) {
        field.Name = "ib";
        field.Type = TType.I32;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Ib);
        oprot.WriteFieldEnd();
      }
      if (__isset.currency) {
        field.Name = "currency";
        field.Type = TType.Double;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        oprot.WriteDouble(Currency);
        oprot.WriteFieldEnd();
      }
      if (CurrencyType != null && __isset.currencyType) {
        field.Name = "currencyType";
        field.Type = TType.String;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(CurrencyType);
        oprot.WriteFieldEnd();
      }
      if (__isset.additionReward) {
        field.Name = "additionReward";
        field.Type = TType.I32;
        field.ID = 9;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(AdditionReward);
        oprot.WriteFieldEnd();
      }
      if (Icon != null && __isset.icon) {
        field.Name = "icon";
        field.Type = TType.String;
        field.ID = 10;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Icon);
        oprot.WriteFieldEnd();
      }
      if (__isset.recommend) {
        field.Name = "recommend";
        field.Type = TType.Bool;
        field.ID = 11;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(Recommend);
        oprot.WriteFieldEnd();
      }
      if (AfterByDesc != null && __isset.afterByDesc) {
        field.Name = "afterByDesc";
        field.Type = TType.String;
        field.ID = 12;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(AfterByDesc);
        oprot.WriteFieldEnd();
      }
      if (AdviseDesc != null && __isset.adviseDesc) {
        field.Name = "adviseDesc";
        field.Type = TType.String;
        field.ID = 13;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(AdviseDesc);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("InAppPurchaseInfo(");
      sb.Append("Id: ");
      sb.Append(Id);
      sb.Append(",ItemId: ");
      sb.Append(ItemId);
      sb.Append(",ItemType: ");
      sb.Append(ItemType);
      sb.Append(",Name: ");
      sb.Append(Name);
      sb.Append(",Des: ");
      sb.Append(Des);
      sb.Append(",Ib: ");
      sb.Append(Ib);
      sb.Append(",Currency: ");
      sb.Append(Currency);
      sb.Append(",CurrencyType: ");
      sb.Append(CurrencyType);
      sb.Append(",AdditionReward: ");
      sb.Append(AdditionReward);
      sb.Append(",Icon: ");
      sb.Append(Icon);
      sb.Append(",Recommend: ");
      sb.Append(Recommend);
      sb.Append(",AfterByDesc: ");
      sb.Append(AfterByDesc);
      sb.Append(",AdviseDesc: ");
      sb.Append(AdviseDesc);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
