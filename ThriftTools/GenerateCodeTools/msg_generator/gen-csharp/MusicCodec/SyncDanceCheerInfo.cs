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
  /// �赸ͬ������ֵ��Ϣ
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SyncDanceCheerInfo : TBase
  {
    private bool _selfMatchExtraPassConds;
    private int _totalCheerVal;
    private int _selfCheerValRatio;
    private int _npcTotalCheerVal;

    /// <summary>
    /// �Լ��Ƿ��������ͨ������
    /// </summary>
    public bool SelfMatchExtraPassConds
    {
      get
      {
        return _selfMatchExtraPassConds;
      }
      set
      {
        __isset.selfMatchExtraPassConds = true;
        this._selfMatchExtraPassConds = value;
      }
    }

    /// <summary>
    /// ��ǰ�ܻ���ֵ
    /// </summary>
    public int TotalCheerVal
    {
      get
      {
        return _totalCheerVal;
      }
      set
      {
        __isset.totalCheerVal = true;
        this._totalCheerVal = value;
      }
    }

    /// <summary>
    /// �Լ����׻���ֵռ��*1000ȡ��
    /// </summary>
    public int SelfCheerValRatio
    {
      get
      {
        return _selfCheerValRatio;
      }
      set
      {
        __isset.selfCheerValRatio = true;
        this._selfCheerValRatio = value;
      }
    }

    /// <summary>
    /// npc��ǰ�ܻ���ֵ
    /// </summary>
    public int NpcTotalCheerVal
    {
      get
      {
        return _npcTotalCheerVal;
      }
      set
      {
        __isset.npcTotalCheerVal = true;
        this._npcTotalCheerVal = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool selfMatchExtraPassConds;
      public bool totalCheerVal;
      public bool selfCheerValRatio;
      public bool npcTotalCheerVal;
    }

    public SyncDanceCheerInfo() {
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
            if (field.Type == TType.Bool) {
              SelfMatchExtraPassConds = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              TotalCheerVal = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              SelfCheerValRatio = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I32) {
              NpcTotalCheerVal = iprot.ReadI32();
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
      TStruct struc = new TStruct("SyncDanceCheerInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.selfMatchExtraPassConds) {
        field.Name = "selfMatchExtraPassConds";
        field.Type = TType.Bool;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(SelfMatchExtraPassConds);
        oprot.WriteFieldEnd();
      }
      if (__isset.totalCheerVal) {
        field.Name = "totalCheerVal";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(TotalCheerVal);
        oprot.WriteFieldEnd();
      }
      if (__isset.selfCheerValRatio) {
        field.Name = "selfCheerValRatio";
        field.Type = TType.I32;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(SelfCheerValRatio);
        oprot.WriteFieldEnd();
      }
      if (__isset.npcTotalCheerVal) {
        field.Name = "npcTotalCheerVal";
        field.Type = TType.I32;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(NpcTotalCheerVal);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("SyncDanceCheerInfo(");
      sb.Append("SelfMatchExtraPassConds: ");
      sb.Append(SelfMatchExtraPassConds);
      sb.Append(",TotalCheerVal: ");
      sb.Append(TotalCheerVal);
      sb.Append(",SelfCheerValRatio: ");
      sb.Append(SelfCheerValRatio);
      sb.Append(",NpcTotalCheerVal: ");
      sb.Append(NpcTotalCheerVal);
      sb.Append(")");
      return sb.ToString();
    }

  }

}