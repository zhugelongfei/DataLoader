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
  public partial class ComposeActivityDetail : TBase
  {
    private string _composeDesc;
    private byte _index;
    private short _totalCount;
    private short _total;
    private short _dayCount;
    private short _dayTotal;
    private PrizeInfo _prizeInfos;
    private List<ComposeRequireItem> _requireItems;

    public string ComposeDesc
    {
      get
      {
        return _composeDesc;
      }
      set
      {
        __isset.composeDesc = true;
        this._composeDesc = value;
      }
    }

    public byte Index
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

    public short TotalCount
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

    public short Total
    {
      get
      {
        return _total;
      }
      set
      {
        __isset.total = true;
        this._total = value;
      }
    }

    public short DayCount
    {
      get
      {
        return _dayCount;
      }
      set
      {
        __isset.dayCount = true;
        this._dayCount = value;
      }
    }

    public short DayTotal
    {
      get
      {
        return _dayTotal;
      }
      set
      {
        __isset.dayTotal = true;
        this._dayTotal = value;
      }
    }

    /// <summary>
    /// ����
    /// </summary>
    public PrizeInfo PrizeInfos
    {
      get
      {
        return _prizeInfos;
      }
      set
      {
        __isset.prizeInfos = true;
        this._prizeInfos = value;
      }
    }

    public List<ComposeRequireItem> RequireItems
    {
      get
      {
        return _requireItems;
      }
      set
      {
        __isset.requireItems = true;
        this._requireItems = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool composeDesc;
      public bool index;
      public bool totalCount;
      public bool total;
      public bool dayCount;
      public bool dayTotal;
      public bool prizeInfos;
      public bool requireItems;
    }

    public ComposeActivityDetail() {
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
            if (field.Type == TType.String) {
              ComposeDesc = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Byte) {
              Index = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I16) {
              TotalCount = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I16) {
              Total = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I16) {
              DayCount = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.I16) {
              DayTotal = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.Struct) {
              PrizeInfos = new PrizeInfo();
              PrizeInfos.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.List) {
              {
                RequireItems = new List<ComposeRequireItem>();
                TList _list261 = iprot.ReadListBegin();
                for( int _i262 = 0; _i262 < _list261.Count; ++_i262)
                {
                  ComposeRequireItem _elem263 = new ComposeRequireItem();
                  _elem263 = new ComposeRequireItem();
                  _elem263.Read(iprot);
                  RequireItems.Add(_elem263);
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
      TStruct struc = new TStruct("ComposeActivityDetail");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (ComposeDesc != null && __isset.composeDesc) {
        field.Name = "composeDesc";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ComposeDesc);
        oprot.WriteFieldEnd();
      }
      if (__isset.index) {
        field.Name = "index";
        field.Type = TType.Byte;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(Index);
        oprot.WriteFieldEnd();
      }
      if (__isset.totalCount) {
        field.Name = "totalCount";
        field.Type = TType.I16;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(TotalCount);
        oprot.WriteFieldEnd();
      }
      if (__isset.total) {
        field.Name = "total";
        field.Type = TType.I16;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(Total);
        oprot.WriteFieldEnd();
      }
      if (__isset.dayCount) {
        field.Name = "dayCount";
        field.Type = TType.I16;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(DayCount);
        oprot.WriteFieldEnd();
      }
      if (__isset.dayTotal) {
        field.Name = "dayTotal";
        field.Type = TType.I16;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(DayTotal);
        oprot.WriteFieldEnd();
      }
      if (PrizeInfos != null && __isset.prizeInfos) {
        field.Name = "prizeInfos";
        field.Type = TType.Struct;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        PrizeInfos.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (RequireItems != null && __isset.requireItems) {
        field.Name = "requireItems";
        field.Type = TType.List;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, RequireItems.Count));
          foreach (ComposeRequireItem _iter264 in RequireItems)
          {
            _iter264.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("ComposeActivityDetail(");
      sb.Append("ComposeDesc: ");
      sb.Append(ComposeDesc);
      sb.Append(",Index: ");
      sb.Append(Index);
      sb.Append(",TotalCount: ");
      sb.Append(TotalCount);
      sb.Append(",Total: ");
      sb.Append(Total);
      sb.Append(",DayCount: ");
      sb.Append(DayCount);
      sb.Append(",DayTotal: ");
      sb.Append(DayTotal);
      sb.Append(",PrizeInfos: ");
      sb.Append(PrizeInfos== null ? "<null>" : PrizeInfos.ToString());
      sb.Append(",RequireItems: ");
      sb.Append(RequireItems);
      sb.Append(")");
      return sb.ToString();
    }

  }

}