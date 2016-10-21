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
  /// ˫�˰������Ϣ
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class DoubleRankPlayInfo : TBase
  {
    private long _onRankFirstPlayerId;
    private long _onRankSecondPlayerId;

    /// <summary>
    /// �ϰ��һ����ҽ�ɫid
    /// </summary>
    public long OnRankFirstPlayerId
    {
      get
      {
        return _onRankFirstPlayerId;
      }
      set
      {
        __isset.onRankFirstPlayerId = true;
        this._onRankFirstPlayerId = value;
      }
    }

    /// <summary>
    /// �ϰ�ڶ�����ҽ�ɫid
    /// </summary>
    public long OnRankSecondPlayerId
    {
      get
      {
        return _onRankSecondPlayerId;
      }
      set
      {
        __isset.onRankSecondPlayerId = true;
        this._onRankSecondPlayerId = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool onRankFirstPlayerId;
      public bool onRankSecondPlayerId;
    }

    public DoubleRankPlayInfo() {
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
              OnRankFirstPlayerId = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I64) {
              OnRankSecondPlayerId = iprot.ReadI64();
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
      TStruct struc = new TStruct("DoubleRankPlayInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.onRankFirstPlayerId) {
        field.Name = "onRankFirstPlayerId";
        field.Type = TType.I64;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(OnRankFirstPlayerId);
        oprot.WriteFieldEnd();
      }
      if (__isset.onRankSecondPlayerId) {
        field.Name = "onRankSecondPlayerId";
        field.Type = TType.I64;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(OnRankSecondPlayerId);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("DoubleRankPlayInfo(");
      sb.Append("OnRankFirstPlayerId: ");
      sb.Append(OnRankFirstPlayerId);
      sb.Append(",OnRankSecondPlayerId: ");
      sb.Append(OnRankSecondPlayerId);
      sb.Append(")");
      return sb.ToString();
    }

  }

}