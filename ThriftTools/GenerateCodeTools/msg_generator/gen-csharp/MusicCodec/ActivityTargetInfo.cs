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
  /// 活动目标信息
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class ActivityTargetInfo : TBase
  {
    private int _targetId;
    private string _targetTitle;
    private string _targetInfo;
    private string _icon;
    private long _curNum;
    private long _maxNum;
    private ActivityTargetStatus _targetStatus;
    private MusicCodec.PrizeInfo _prizeInfos;

    /// <summary>
    /// 目标id
    /// </summary>
    public int TargetId
    {
      get
      {
        return _targetId;
      }
      set
      {
        __isset.targetId = true;
        this._targetId = value;
      }
    }

    /// <summary>
    /// 目标标题, 有设置值则为分隔标题
    /// </summary>
    public string TargetTitle
    {
      get
      {
        return _targetTitle;
      }
      set
      {
        __isset.targetTitle = true;
        this._targetTitle = value;
      }
    }

    /// <summary>
    /// 目标信息
    /// </summary>
    public string TargetInfo
    {
      get
      {
        return _targetInfo;
      }
      set
      {
        __isset.targetInfo = true;
        this._targetInfo = value;
      }
    }

    /// <summary>
    /// 目标图标
    /// </summary>
    public string Icon
    {
      get
      {
        return _icon;
      }
      set
      {
        __isset.icon = true;
        this._icon = value;
      }
    }

    /// <summary>
    /// 当前进度
    /// </summary>
    public long CurNum
    {
      get
      {
        return _curNum;
      }
      set
      {
        __isset.curNum = true;
        this._curNum = value;
      }
    }

    /// <summary>
    /// 最大进度
    /// </summary>
    public long MaxNum
    {
      get
      {
        return _maxNum;
      }
      set
      {
        __isset.maxNum = true;
        this._maxNum = value;
      }
    }

    /// <summary>
    /// 活动目标状态
    /// 
    /// <seealso cref="ActivityTargetStatus"/>
    /// </summary>
    public ActivityTargetStatus TargetStatus
    {
      get
      {
        return _targetStatus;
      }
      set
      {
        __isset.targetStatus = true;
        this._targetStatus = value;
      }
    }

    /// <summary>
    /// 奖励
    /// </summary>
    public MusicCodec.PrizeInfo PrizeInfos
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


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool targetId;
      public bool targetTitle;
      public bool targetInfo;
      public bool icon;
      public bool curNum;
      public bool maxNum;
      public bool targetStatus;
      public bool prizeInfos;
    }

    public ActivityTargetInfo() {
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
              TargetId = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              TargetTitle = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              TargetInfo = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              Icon = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I64) {
              CurNum = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.I64) {
              MaxNum = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.I32) {
              TargetStatus = (ActivityTargetStatus)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.Struct) {
              PrizeInfos = new MusicCodec.PrizeInfo();
              PrizeInfos.Read(iprot);
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
      TStruct struc = new TStruct("ActivityTargetInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.targetId) {
        field.Name = "targetId";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(TargetId);
        oprot.WriteFieldEnd();
      }
      if (TargetTitle != null && __isset.targetTitle) {
        field.Name = "targetTitle";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(TargetTitle);
        oprot.WriteFieldEnd();
      }
      if (TargetInfo != null && __isset.targetInfo) {
        field.Name = "targetInfo";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(TargetInfo);
        oprot.WriteFieldEnd();
      }
      if (Icon != null && __isset.icon) {
        field.Name = "icon";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Icon);
        oprot.WriteFieldEnd();
      }
      if (__isset.curNum) {
        field.Name = "curNum";
        field.Type = TType.I64;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(CurNum);
        oprot.WriteFieldEnd();
      }
      if (__isset.maxNum) {
        field.Name = "maxNum";
        field.Type = TType.I64;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(MaxNum);
        oprot.WriteFieldEnd();
      }
      if (__isset.targetStatus) {
        field.Name = "targetStatus";
        field.Type = TType.I32;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)TargetStatus);
        oprot.WriteFieldEnd();
      }
      if (PrizeInfos != null && __isset.prizeInfos) {
        field.Name = "prizeInfos";
        field.Type = TType.Struct;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        PrizeInfos.Write(oprot);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("ActivityTargetInfo(");
      sb.Append("TargetId: ");
      sb.Append(TargetId);
      sb.Append(",TargetTitle: ");
      sb.Append(TargetTitle);
      sb.Append(",TargetInfo: ");
      sb.Append(TargetInfo);
      sb.Append(",Icon: ");
      sb.Append(Icon);
      sb.Append(",CurNum: ");
      sb.Append(CurNum);
      sb.Append(",MaxNum: ");
      sb.Append(MaxNum);
      sb.Append(",TargetStatus: ");
      sb.Append(TargetStatus);
      sb.Append(",PrizeInfos: ");
      sb.Append(PrizeInfos== null ? "<null>" : PrizeInfos.ToString());
      sb.Append(")");
      return sb.ToString();
    }

  }

}
