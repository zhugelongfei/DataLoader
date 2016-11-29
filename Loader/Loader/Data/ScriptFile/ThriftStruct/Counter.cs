/**
 * Autogenerated by Thrift Compiler (0.9.3)
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

namespace ThriftStruct
{

  /// <summary>
  /// Autogenerated by program
  /// 
  /// <para>Autho ZhuGeLongFei</para>
  /// 
  /// <para>Do not edit unless you are sure that you know what you are doning</para>
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class Counter : TBase
  {
    private int _ID;
    private int _GameTimesIntCountID;
    private int _DailyIBGiftIntCountID;

    public int ID
    {
      get
      {
        return _ID;
      }
      set
      {
        __isset.ID = true;
        this._ID = value;
      }
    }

    public int GameTimesIntCountID
    {
      get
      {
        return _GameTimesIntCountID;
      }
      set
      {
        __isset.GameTimesIntCountID = true;
        this._GameTimesIntCountID = value;
      }
    }

    public int DailyIBGiftIntCountID
    {
      get
      {
        return _DailyIBGiftIntCountID;
      }
      set
      {
        __isset.DailyIBGiftIntCountID = true;
        this._DailyIBGiftIntCountID = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool ID;
      public bool GameTimesIntCountID;
      public bool DailyIBGiftIntCountID;
    }

    public Counter() {
    }

    public void Read (TProtocol iprot)
    {
      iprot.IncrementRecursionDepth();
      try
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
                ID = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I32) {
                GameTimesIntCountID = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.I32) {
                DailyIBGiftIntCountID = iprot.ReadI32();
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
      finally
      {
        iprot.DecrementRecursionDepth();
      }
    }

    public void Write(TProtocol oprot) {
      oprot.IncrementRecursionDepth();
      try
      {
        TStruct struc = new TStruct("Counter");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (__isset.ID) {
          field.Name = "ID";
          field.Type = TType.I32;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(ID);
          oprot.WriteFieldEnd();
        }
        if (__isset.GameTimesIntCountID) {
          field.Name = "GameTimesIntCountID";
          field.Type = TType.I32;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(GameTimesIntCountID);
          oprot.WriteFieldEnd();
        }
        if (__isset.DailyIBGiftIntCountID) {
          field.Name = "DailyIBGiftIntCountID";
          field.Type = TType.I32;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(DailyIBGiftIntCountID);
          oprot.WriteFieldEnd();
        }
        oprot.WriteFieldStop();
        oprot.WriteStructEnd();
      }
      finally
      {
        oprot.DecrementRecursionDepth();
      }
    }

    public override string ToString() {
      StringBuilder __sb = new StringBuilder("Counter(");
      bool __first = true;
      if (__isset.ID) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ID: ");
        __sb.Append(ID);
      }
      if (__isset.GameTimesIntCountID) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("GameTimesIntCountID: ");
        __sb.Append(GameTimesIntCountID);
      }
      if (__isset.DailyIBGiftIntCountID) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("DailyIBGiftIntCountID: ");
        __sb.Append(DailyIBGiftIntCountID);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
