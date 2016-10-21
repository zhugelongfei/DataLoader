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
  public partial class CSBuyUnlockMusicMsg : TBase
  {
    private short _musicId;
    private byte _currencyType;
    private int _count;

    public short MusicId
    {
      get
      {
        return _musicId;
      }
      set
      {
        __isset.musicId = true;
        this._musicId = value;
      }
    }

    public byte CurrencyType
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

    public int Count
    {
      get
      {
        return _count;
      }
      set
      {
        __isset.count = true;
        this._count = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool musicId;
      public bool currencyType;
      public bool count;
    }

    public CSBuyUnlockMusicMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSBuyUnlockMusicMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.musicId) {
        field.Name = "musicId";
        field.Type = TType.I16;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(MusicId);
        oprot.WriteFieldEnd();
      }
      if (__isset.currencyType) {
        field.Name = "currencyType";
        field.Type = TType.Byte;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(CurrencyType);
        oprot.WriteFieldEnd();
      }
      if (__isset.count) {
        field.Name = "count";
        field.Type = TType.I32;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Count);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}