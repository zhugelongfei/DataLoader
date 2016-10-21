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
  public partial class ConstellationData : TBase
  {
    private int _star;
    private StarItemState _itemState;

    public int Star
    {
      get
      {
        return _star;
      }
      set
      {
        __isset.star = true;
        this._star = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="StarItemState"/>
    /// </summary>
    public StarItemState ItemState
    {
      get
      {
        return _itemState;
      }
      set
      {
        __isset.itemState = true;
        this._itemState = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool star;
      public bool itemState;
    }

    public ConstellationData() {
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
              Star = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              ItemState = (StarItemState)iprot.ReadI32();
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
      TStruct struc = new TStruct("ConstellationData");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.star) {
        field.Name = "star";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Star);
        oprot.WriteFieldEnd();
      }
      if (__isset.itemState) {
        field.Name = "itemState";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)ItemState);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("ConstellationData(");
      sb.Append("Star: ");
      sb.Append(Star);
      sb.Append(",ItemState: ");
      sb.Append(ItemState);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
