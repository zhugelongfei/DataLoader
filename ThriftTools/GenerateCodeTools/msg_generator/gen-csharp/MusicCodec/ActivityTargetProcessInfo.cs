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
  /// �Ŀ�������Ϣ
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class ActivityTargetProcessInfo : TBase
  {
    private int _targetId;
    private long _curNum;
    private bool _canGetPrize;

    /// <summary>
    /// Ŀ��id
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
    /// ��ǰ����
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
    /// �Ƿ����ȡ����
    /// </summary>
    public bool CanGetPrize
    {
      get
      {
        return _canGetPrize;
      }
      set
      {
        __isset.canGetPrize = true;
        this._canGetPrize = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool targetId;
      public bool curNum;
      public bool canGetPrize;
    }

    public ActivityTargetProcessInfo() {
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
            if (field.Type == TType.I64) {
              CurNum = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Bool) {
              CanGetPrize = iprot.ReadBool();
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
      TStruct struc = new TStruct("ActivityTargetProcessInfo");
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
      if (__isset.curNum) {
        field.Name = "curNum";
        field.Type = TType.I64;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(CurNum);
        oprot.WriteFieldEnd();
      }
      if (__isset.canGetPrize) {
        field.Name = "canGetPrize";
        field.Type = TType.Bool;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(CanGetPrize);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("ActivityTargetProcessInfo(");
      sb.Append("TargetId: ");
      sb.Append(TargetId);
      sb.Append(",CurNum: ");
      sb.Append(CurNum);
      sb.Append(",CanGetPrize: ");
      sb.Append(CanGetPrize);
      sb.Append(")");
      return sb.ToString();
    }

  }

}