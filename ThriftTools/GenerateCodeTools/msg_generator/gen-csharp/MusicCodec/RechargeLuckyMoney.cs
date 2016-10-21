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
  /// ��ֵ�����Ϣ
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class RechargeLuckyMoney : TBase
  {
    private int _luckyMoneyNumber;
    private LuckyMoneyType _luckyMoneyType;
    private string _words;
    private long _charId;

    /// <summary>
    /// ��ֵ�������
    /// </summary>
    public int LuckyMoneyNumber
    {
      get
      {
        return _luckyMoneyNumber;
      }
      set
      {
        __isset.luckyMoneyNumber = true;
        this._luckyMoneyNumber = value;
      }
    }

    /// <summary>
    /// �������
    /// 
    /// <seealso cref="LuckyMoneyType"/>
    /// </summary>
    public LuckyMoneyType LuckyMoneyType
    {
      get
      {
        return _luckyMoneyType;
      }
      set
      {
        __isset.luckyMoneyType = true;
        this._luckyMoneyType = value;
      }
    }

    /// <summary>
    /// �������
    /// </summary>
    public string Words
    {
      get
      {
        return _words;
      }
      set
      {
        __isset.words = true;
        this._words = value;
      }
    }

    /// <summary>
    /// �պ����ɫid
    /// </summary>
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


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool luckyMoneyNumber;
      public bool luckyMoneyType;
      public bool words;
      public bool charId;
    }

    public RechargeLuckyMoney() {
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
              LuckyMoneyNumber = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              LuckyMoneyType = (LuckyMoneyType)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              Words = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I64) {
              CharId = iprot.ReadI64();
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
      TStruct struc = new TStruct("RechargeLuckyMoney");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.luckyMoneyNumber) {
        field.Name = "luckyMoneyNumber";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(LuckyMoneyNumber);
        oprot.WriteFieldEnd();
      }
      if (__isset.luckyMoneyType) {
        field.Name = "luckyMoneyType";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)LuckyMoneyType);
        oprot.WriteFieldEnd();
      }
      if (Words != null && __isset.words) {
        field.Name = "words";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Words);
        oprot.WriteFieldEnd();
      }
      if (__isset.charId) {
        field.Name = "charId";
        field.Type = TType.I64;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(CharId);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("RechargeLuckyMoney(");
      sb.Append("LuckyMoneyNumber: ");
      sb.Append(LuckyMoneyNumber);
      sb.Append(",LuckyMoneyType: ");
      sb.Append(LuckyMoneyType);
      sb.Append(",Words: ");
      sb.Append(Words);
      sb.Append(",CharId: ");
      sb.Append(CharId);
      sb.Append(")");
      return sb.ToString();
    }

  }

}