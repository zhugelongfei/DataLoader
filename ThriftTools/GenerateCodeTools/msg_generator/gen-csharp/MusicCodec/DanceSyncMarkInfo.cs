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
  public partial class DanceSyncMarkInfo : TBase
  {
    private long _charId;
    private byte _keyResult;
    private short _combos;
    private int _mark;
    private short _index;
    private LoversDynSyncMarkInfo _loversDynSyncMarkInfo;
    private LoversTrdSyncMarkInfo _loversTrdSyncMarkInfo;
    private int _cheerValRatio;
    private short _perfectCombos;

    public long CharId
    {
      get
      {
        return _charId;
      }
      set
      {
        __isset.charId = true;
        this._charId = value;
      }
    }

    public byte KeyResult
    {
      get
      {
        return _keyResult;
      }
      set
      {
        __isset.keyResult = true;
        this._keyResult = value;
      }
    }

    public short Combos
    {
      get
      {
        return _combos;
      }
      set
      {
        __isset.combos = true;
        this._combos = value;
      }
    }

    public int Mark
    {
      get
      {
        return _mark;
      }
      set
      {
        __isset.mark = true;
        this._mark = value;
      }
    }

    public short Index
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

    public LoversDynSyncMarkInfo LoversDynSyncMarkInfo
    {
      get
      {
        return _loversDynSyncMarkInfo;
      }
      set
      {
        __isset.loversDynSyncMarkInfo = true;
        this._loversDynSyncMarkInfo = value;
      }
    }

    public LoversTrdSyncMarkInfo LoversTrdSyncMarkInfo
    {
      get
      {
        return _loversTrdSyncMarkInfo;
      }
      set
      {
        __isset.loversTrdSyncMarkInfo = true;
        this._loversTrdSyncMarkInfo = value;
      }
    }

    /// <summary>
    /// 自己贡献欢呼值占比*1000取整
    /// </summary>
    public int CheerValRatio
    {
      get
      {
        return _cheerValRatio;
      }
      set
      {
        __isset.cheerValRatio = true;
        this._cheerValRatio = value;
      }
    }

    public short PerfectCombos
    {
      get
      {
        return _perfectCombos;
      }
      set
      {
        __isset.perfectCombos = true;
        this._perfectCombos = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool charId;
      public bool keyResult;
      public bool combos;
      public bool mark;
      public bool index;
      public bool loversDynSyncMarkInfo;
      public bool loversTrdSyncMarkInfo;
      public bool cheerValRatio;
      public bool perfectCombos;
    }

    public DanceSyncMarkInfo() {
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
              CharId = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Byte) {
              KeyResult = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I16) {
              Combos = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I32) {
              Mark = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I16) {
              Index = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.Struct) {
              LoversDynSyncMarkInfo = new LoversDynSyncMarkInfo();
              LoversDynSyncMarkInfo.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.Struct) {
              LoversTrdSyncMarkInfo = new LoversTrdSyncMarkInfo();
              LoversTrdSyncMarkInfo.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.I32) {
              CheerValRatio = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 9:
            if (field.Type == TType.I16) {
              PerfectCombos = iprot.ReadI16();
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
      TStruct struc = new TStruct("DanceSyncMarkInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.charId) {
        field.Name = "charId";
        field.Type = TType.I64;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(CharId);
        oprot.WriteFieldEnd();
      }
      if (__isset.keyResult) {
        field.Name = "keyResult";
        field.Type = TType.Byte;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(KeyResult);
        oprot.WriteFieldEnd();
      }
      if (__isset.combos) {
        field.Name = "combos";
        field.Type = TType.I16;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(Combos);
        oprot.WriteFieldEnd();
      }
      if (__isset.mark) {
        field.Name = "mark";
        field.Type = TType.I32;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Mark);
        oprot.WriteFieldEnd();
      }
      if (__isset.index) {
        field.Name = "index";
        field.Type = TType.I16;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(Index);
        oprot.WriteFieldEnd();
      }
      if (LoversDynSyncMarkInfo != null && __isset.loversDynSyncMarkInfo) {
        field.Name = "loversDynSyncMarkInfo";
        field.Type = TType.Struct;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        LoversDynSyncMarkInfo.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (LoversTrdSyncMarkInfo != null && __isset.loversTrdSyncMarkInfo) {
        field.Name = "loversTrdSyncMarkInfo";
        field.Type = TType.Struct;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        LoversTrdSyncMarkInfo.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (__isset.cheerValRatio) {
        field.Name = "cheerValRatio";
        field.Type = TType.I32;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(CheerValRatio);
        oprot.WriteFieldEnd();
      }
      if (__isset.perfectCombos) {
        field.Name = "perfectCombos";
        field.Type = TType.I16;
        field.ID = 9;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(PerfectCombos);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("DanceSyncMarkInfo(");
      sb.Append("CharId: ");
      sb.Append(CharId);
      sb.Append(",KeyResult: ");
      sb.Append(KeyResult);
      sb.Append(",Combos: ");
      sb.Append(Combos);
      sb.Append(",Mark: ");
      sb.Append(Mark);
      sb.Append(",Index: ");
      sb.Append(Index);
      sb.Append(",LoversDynSyncMarkInfo: ");
      sb.Append(LoversDynSyncMarkInfo== null ? "<null>" : LoversDynSyncMarkInfo.ToString());
      sb.Append(",LoversTrdSyncMarkInfo: ");
      sb.Append(LoversTrdSyncMarkInfo== null ? "<null>" : LoversTrdSyncMarkInfo.ToString());
      sb.Append(",CheerValRatio: ");
      sb.Append(CheerValRatio);
      sb.Append(",PerfectCombos: ");
      sb.Append(PerfectCombos);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
