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
  public partial class RankMusicQueryParam : TBase
  {
    private byte _mode;
    private short _musicId;
    private byte _level;
    private byte _lastLevel;
    private bool _isFirstPanel;
    private byte _clientParam;

    public byte Mode
    {
      get
      {
        return _mode;
      }
      set
      {
        __isset.mode = true;
        this._mode = value;
      }
    }

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

    public byte Level
    {
      get
      {
        return _level;
      }
      set
      {
        __isset.level = true;
        this._level = value;
      }
    }

    public byte LastLevel
    {
      get
      {
        return _lastLevel;
      }
      set
      {
        __isset.lastLevel = true;
        this._lastLevel = value;
      }
    }

    /// <summary>
    /// 是否封面,客户端请求封面数据不存在,服务器会随一个发送
    /// </summary>
    public bool IsFirstPanel
    {
      get
      {
        return _isFirstPanel;
      }
      set
      {
        __isset.isFirstPanel = true;
        this._isFirstPanel = value;
      }
    }

    /// <summary>
    /// 客户端自己区分使用
    /// </summary>
    public byte ClientParam
    {
      get
      {
        return _clientParam;
      }
      set
      {
        __isset.clientParam = true;
        this._clientParam = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool mode;
      public bool musicId;
      public bool level;
      public bool lastLevel;
      public bool isFirstPanel;
      public bool clientParam;
    }

    public RankMusicQueryParam() {
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
            if (field.Type == TType.Byte) {
              Mode = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I16) {
              MusicId = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Byte) {
              Level = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Byte) {
              LastLevel = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.Bool) {
              IsFirstPanel = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.Byte) {
              ClientParam = iprot.ReadByte();
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
      TStruct struc = new TStruct("RankMusicQueryParam");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.mode) {
        field.Name = "mode";
        field.Type = TType.Byte;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(Mode);
        oprot.WriteFieldEnd();
      }
      if (__isset.musicId) {
        field.Name = "musicId";
        field.Type = TType.I16;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(MusicId);
        oprot.WriteFieldEnd();
      }
      if (__isset.level) {
        field.Name = "level";
        field.Type = TType.Byte;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(Level);
        oprot.WriteFieldEnd();
      }
      if (__isset.lastLevel) {
        field.Name = "lastLevel";
        field.Type = TType.Byte;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(LastLevel);
        oprot.WriteFieldEnd();
      }
      if (__isset.isFirstPanel) {
        field.Name = "isFirstPanel";
        field.Type = TType.Bool;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(IsFirstPanel);
        oprot.WriteFieldEnd();
      }
      if (__isset.clientParam) {
        field.Name = "clientParam";
        field.Type = TType.Byte;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(ClientParam);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("RankMusicQueryParam(");
      sb.Append("Mode: ");
      sb.Append(Mode);
      sb.Append(",MusicId: ");
      sb.Append(MusicId);
      sb.Append(",Level: ");
      sb.Append(Level);
      sb.Append(",LastLevel: ");
      sb.Append(LastLevel);
      sb.Append(",IsFirstPanel: ");
      sb.Append(IsFirstPanel);
      sb.Append(",ClientParam: ");
      sb.Append(ClientParam);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
