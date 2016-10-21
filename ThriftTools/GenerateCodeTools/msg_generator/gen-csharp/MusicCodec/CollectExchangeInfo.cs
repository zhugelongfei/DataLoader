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
  public partial class CollectExchangeInfo : TBase
  {
    private List<CardExchangePrizeInfo> _prizeList;

    public List<CardExchangePrizeInfo> PrizeList
    {
      get
      {
        return _prizeList;
      }
      set
      {
        __isset.prizeList = true;
        this._prizeList = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool prizeList;
    }

    public CollectExchangeInfo() {
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
                PrizeList = new List<CardExchangePrizeInfo>();
                TList _list231 = iprot.ReadListBegin();
                for( int _i232 = 0; _i232 < _list231.Count; ++_i232)
                {
                  CardExchangePrizeInfo _elem233 = new CardExchangePrizeInfo();
                  _elem233 = new CardExchangePrizeInfo();
                  _elem233.Read(iprot);
                  PrizeList.Add(_elem233);
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
      TStruct struc = new TStruct("CollectExchangeInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (PrizeList != null && __isset.prizeList) {
        field.Name = "prizeList";
        field.Type = TType.List;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, PrizeList.Count));
          foreach (CardExchangePrizeInfo _iter234 in PrizeList)
          {
            _iter234.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("CollectExchangeInfo(");
      sb.Append("PrizeList: ");
      sb.Append(PrizeList);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
