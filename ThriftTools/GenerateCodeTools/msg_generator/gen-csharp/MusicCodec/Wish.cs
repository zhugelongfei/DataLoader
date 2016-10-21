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
  public partial class Wish : TBase
  {
    private long _wishId;
    private List<SimpleMallItem> _items;
    private int _createTime;
    private int _overTime;
    private long _overCharId;
    private string _overCharName;
    private string _overHeadIconId;
    private byte _overSex;

    public long WishId
    {
      get
      {
        return _wishId;
      }
      set
      {
        __isset.wishId = true;
        this._wishId = value;
      }
    }

    public List<SimpleMallItem> Items
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

    public int CreateTime
    {
      get
      {
        return _createTime;
      }
      set
      {
        __isset.createTime = true;
        this._createTime = value;
      }
    }

    public int OverTime
    {
      get
      {
        return _overTime;
      }
      set
      {
        __isset.overTime = true;
        this._overTime = value;
      }
    }

    public long OverCharId
    {
      get
      {
        return _overCharId;
      }
      set
      {
        __isset.overCharId = true;
        this._overCharId = value;
      }
    }

    public string OverCharName
    {
      get
      {
        return _overCharName;
      }
      set
      {
        __isset.overCharName = true;
        this._overCharName = value;
      }
    }

    public string OverHeadIconId
    {
      get
      {
        return _overHeadIconId;
      }
      set
      {
        __isset.overHeadIconId = true;
        this._overHeadIconId = value;
      }
    }

    public byte OverSex
    {
      get
      {
        return _overSex;
      }
      set
      {
        __isset.overSex = true;
        this._overSex = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool wishId;
      public bool items;
      public bool createTime;
      public bool overTime;
      public bool overCharId;
      public bool overCharName;
      public bool overHeadIconId;
      public bool overSex;
    }

    public Wish() {
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
              WishId = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                Items = new List<SimpleMallItem>();
                TList _list86 = iprot.ReadListBegin();
                for( int _i87 = 0; _i87 < _list86.Count; ++_i87)
                {
                  SimpleMallItem _elem88 = new SimpleMallItem();
                  _elem88 = new SimpleMallItem();
                  _elem88.Read(iprot);
                  Items.Add(_elem88);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              CreateTime = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I32) {
              OverTime = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I64) {
              OverCharId = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.String) {
              OverCharName = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.String) {
              OverHeadIconId = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.Byte) {
              OverSex = iprot.ReadByte();
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
      TStruct struc = new TStruct("Wish");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.wishId) {
        field.Name = "wishId";
        field.Type = TType.I64;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(WishId);
        oprot.WriteFieldEnd();
      }
      if (Items != null && __isset.items) {
        field.Name = "items";
        field.Type = TType.List;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, Items.Count));
          foreach (SimpleMallItem _iter89 in Items)
          {
            _iter89.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (__isset.createTime) {
        field.Name = "createTime";
        field.Type = TType.I32;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(CreateTime);
        oprot.WriteFieldEnd();
      }
      if (__isset.overTime) {
        field.Name = "overTime";
        field.Type = TType.I32;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(OverTime);
        oprot.WriteFieldEnd();
      }
      if (__isset.overCharId) {
        field.Name = "overCharId";
        field.Type = TType.I64;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(OverCharId);
        oprot.WriteFieldEnd();
      }
      if (OverCharName != null && __isset.overCharName) {
        field.Name = "overCharName";
        field.Type = TType.String;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(OverCharName);
        oprot.WriteFieldEnd();
      }
      if (OverHeadIconId != null && __isset.overHeadIconId) {
        field.Name = "overHeadIconId";
        field.Type = TType.String;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(OverHeadIconId);
        oprot.WriteFieldEnd();
      }
      if (__isset.overSex) {
        field.Name = "overSex";
        field.Type = TType.Byte;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(OverSex);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("Wish(");
      sb.Append("WishId: ");
      sb.Append(WishId);
      sb.Append(",Items: ");
      sb.Append(Items);
      sb.Append(",CreateTime: ");
      sb.Append(CreateTime);
      sb.Append(",OverTime: ");
      sb.Append(OverTime);
      sb.Append(",OverCharId: ");
      sb.Append(OverCharId);
      sb.Append(",OverCharName: ");
      sb.Append(OverCharName);
      sb.Append(",OverHeadIconId: ");
      sb.Append(OverHeadIconId);
      sb.Append(",OverSex: ");
      sb.Append(OverSex);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
