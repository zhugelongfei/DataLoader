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
  public partial class ConstellationItemData : TBase
  {
    private int _index;
    private int _itemId;
    private short _itemNumber;
    private byte _validTimeType;
    private byte _priceType;
    private int _priceCount;
    private int _tradeFlag;

    public int Index
    {
      get
      {
        return _index;
      }
      set
      {
        __isset.index = true;
        this._index = value;
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

    public short ItemNumber
    {
      get
      {
        return _itemNumber;
      }
      set
      {
        __isset.itemNumber = true;
        this._itemNumber = value;
      }
    }

    public byte ValidTimeType
    {
      get
      {
        return _validTimeType;
      }
      set
      {
        __isset.validTimeType = true;
        this._validTimeType = value;
      }
    }

    public byte PriceType
    {
      get
      {
        return _priceType;
      }
      set
      {
        __isset.priceType = true;
        this._priceType = value;
      }
    }

    public int PriceCount
    {
      get
      {
        return _priceCount;
      }
      set
      {
        __isset.priceCount = true;
        this._priceCount = value;
      }
    }

    public int TradeFlag
    {
      get
      {
        return _tradeFlag;
      }
      set
      {
        __isset.tradeFlag = true;
        this._tradeFlag = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool index;
      public bool itemId;
      public bool itemNumber;
      public bool validTimeType;
      public bool priceType;
      public bool priceCount;
      public bool tradeFlag;
    }

    public ConstellationItemData() {
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
              Index = iprot.ReadI32();
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
            if (field.Type == TType.I16) {
              ItemNumber = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Byte) {
              ValidTimeType = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.Byte) {
              PriceType = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.I32) {
              PriceCount = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.I32) {
              TradeFlag = iprot.ReadI32();
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
      TStruct struc = new TStruct("ConstellationItemData");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.index) {
        field.Name = "index";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Index);
        oprot.WriteFieldEnd();
      }
      if (__isset.itemId) {
        field.Name = "itemId";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(ItemId);
        oprot.WriteFieldEnd();
      }
      if (__isset.itemNumber) {
        field.Name = "itemNumber";
        field.Type = TType.I16;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(ItemNumber);
        oprot.WriteFieldEnd();
      }
      if (__isset.validTimeType) {
        field.Name = "validTimeType";
        field.Type = TType.Byte;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(ValidTimeType);
        oprot.WriteFieldEnd();
      }
      if (__isset.priceType) {
        field.Name = "priceType";
        field.Type = TType.Byte;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(PriceType);
        oprot.WriteFieldEnd();
      }
      if (__isset.priceCount) {
        field.Name = "priceCount";
        field.Type = TType.I32;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(PriceCount);
        oprot.WriteFieldEnd();
      }
      if (__isset.tradeFlag) {
        field.Name = "tradeFlag";
        field.Type = TType.I32;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(TradeFlag);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("ConstellationItemData(");
      sb.Append("Index: ");
      sb.Append(Index);
      sb.Append(",ItemId: ");
      sb.Append(ItemId);
      sb.Append(",ItemNumber: ");
      sb.Append(ItemNumber);
      sb.Append(",ValidTimeType: ");
      sb.Append(ValidTimeType);
      sb.Append(",PriceType: ");
      sb.Append(PriceType);
      sb.Append(",PriceCount: ");
      sb.Append(PriceCount);
      sb.Append(",TradeFlag: ");
      sb.Append(TradeFlag);
      sb.Append(")");
      return sb.ToString();
    }

  }

}