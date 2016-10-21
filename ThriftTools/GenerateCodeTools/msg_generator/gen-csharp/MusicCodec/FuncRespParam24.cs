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
  public partial class FuncRespParam24 : TBase
  {
    private List<MusicCodec.ItemPrize> _itemPrizeList;

    public List<MusicCodec.ItemPrize> ItemPrizeList
    {
      get
      {
        return _itemPrizeList;
      }
      set
      {
        __isset.itemPrizeList = true;
        this._itemPrizeList = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool itemPrizeList;
    }

    public FuncRespParam24() {
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
                ItemPrizeList = new List<MusicCodec.ItemPrize>();
                TList _list4 = iprot.ReadListBegin();
                for( int _i5 = 0; _i5 < _list4.Count; ++_i5)
                {
                  MusicCodec.ItemPrize _elem6 = new MusicCodec.ItemPrize();
                  _elem6 = new MusicCodec.ItemPrize();
                  _elem6.Read(iprot);
                  ItemPrizeList.Add(_elem6);
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
      TStruct struc = new TStruct("FuncRespParam24");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (ItemPrizeList != null && __isset.itemPrizeList) {
        field.Name = "itemPrizeList";
        field.Type = TType.List;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, ItemPrizeList.Count));
          foreach (MusicCodec.ItemPrize _iter7 in ItemPrizeList)
          {
            _iter7.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("FuncRespParam24(");
      sb.Append("ItemPrizeList: ");
      sb.Append(ItemPrizeList);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
