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
  /// Period in dance.
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSDancePeriodMsg : TBase
  {
    private byte _period;
    private byte _index;
    private byte _gameType;

    /// <summary>
    /// 0-start input, 1-show time
    /// </summary>
    public byte Period
    {
      get
      {
        return _period;
      }
      set
      {
        __isset.period = true;
        this._period = value;
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

    public byte GameType
    {
      get
      {
        return _gameType;
      }
      set
      {
        __isset.gameType = true;
        this._gameType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool period;
      public bool index;
      public bool gameType;
    }

    public CSDancePeriodMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSDancePeriodMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.period) {
        field.Name = "period";
        field.Type = TType.Byte;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(Period);
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
      if (__isset.gameType) {
        field.Name = "gameType";
        field.Type = TType.Byte;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(GameType);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}