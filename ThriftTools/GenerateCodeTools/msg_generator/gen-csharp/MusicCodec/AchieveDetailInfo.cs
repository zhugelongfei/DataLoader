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
  /// �ɾ���ϸ��Ϣ
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class AchieveDetailInfo : TBase
  {
    private int _achieveId;
    private long _curNum;
    private long _maxNum;
    private bool _hasGetPrized;

    /// <summary>
    /// �ɾ�id
    /// </summary>
    public int AchieveId
    {
      get
      {
        return _achieveId;
      }
      set
      {
        __isset.achieveId = true;
        this._achieveId = value;
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
    /// ������
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
    /// �Ƿ��Ѿ���ȡ������
    /// </summary>
    public bool HasGetPrized
    {
      get
      {
        return _hasGetPrized;
      }
      set
      {
        __isset.hasGetPrized = true;
        this._hasGetPrized = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool achieveId;
      public bool curNum;
      public bool maxNum;
      public bool hasGetPrized;
    }

    public AchieveDetailInfo() {
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
              AchieveId = iprot.ReadI32();
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
            if (field.Type == TType.I64) {
              MaxNum = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Bool) {
              HasGetPrized = iprot.ReadBool();
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
      TStruct struc = new TStruct("AchieveDetailInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.achieveId) {
        field.Name = "achieveId";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(AchieveId);
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
      if (__isset.maxNum) {
        field.Name = "maxNum";
        field.Type = TType.I64;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(MaxNum);
        oprot.WriteFieldEnd();
      }
      if (__isset.hasGetPrized) {
        field.Name = "hasGetPrized";
        field.Type = TType.Bool;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(HasGetPrized);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("AchieveDetailInfo(");
      sb.Append("AchieveId: ");
      sb.Append(AchieveId);
      sb.Append(",CurNum: ");
      sb.Append(CurNum);
      sb.Append(",MaxNum: ");
      sb.Append(MaxNum);
      sb.Append(",HasGetPrized: ");
      sb.Append(HasGetPrized);
      sb.Append(")");
      return sb.ToString();
    }

  }

}