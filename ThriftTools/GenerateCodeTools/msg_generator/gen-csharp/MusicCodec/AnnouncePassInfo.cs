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
  /// 通告通关信息
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class AnnouncePassInfo : TBase
  {
    private int _announceId;
    private byte _announceIndex;
    private byte _passRank;
    private List<MusicCodec.PassCheerCondResult> _condResultList;
    private MusicCodec.PrizeInfo _prizeInfos;
    private MusicCodec.PrizeInfo _extraPrizeInfos;
    private List<MusicCodec.DanceCheerValResult> _cheerValResults;

    /// <summary>
    /// 通告id
    /// </summary>
    public int AnnounceId
    {
      get
      {
        return _announceId;
      }
      set
      {
        __isset.announceId = true;
        this._announceId = value;
      }
    }

    /// <summary>
    /// 通告索引
    /// </summary>
    public byte AnnounceIndex
    {
      get
      {
        return _announceIndex;
      }
      set
      {
        __isset.announceIndex = true;
        this._announceIndex = value;
      }
    }

    /// <summary>
    /// 通关等级 0-未通关 1-3 s, ss, sss
    /// </summary>
    public byte PassRank
    {
      get
      {
        return _passRank;
      }
      set
      {
        __isset.passRank = true;
        this._passRank = value;
      }
    }

    /// <summary>
    /// 通告条件信息
    /// </summary>
    public List<MusicCodec.PassCheerCondResult> CondResultList
    {
      get
      {
        return _condResultList;
      }
      set
      {
        __isset.condResultList = true;
        this._condResultList = value;
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

    /// <summary>
    /// 额外奖励
    /// </summary>
    public MusicCodec.PrizeInfo ExtraPrizeInfos
    {
      get
      {
        return _extraPrizeInfos;
      }
      set
      {
        __isset.extraPrizeInfos = true;
        this._extraPrizeInfos = value;
      }
    }

    /// <summary>
    /// 每个成员的欢呼值结果
    /// </summary>
    public List<MusicCodec.DanceCheerValResult> CheerValResults
    {
      get
      {
        return _cheerValResults;
      }
      set
      {
        __isset.cheerValResults = true;
        this._cheerValResults = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool announceId;
      public bool announceIndex;
      public bool passRank;
      public bool condResultList;
      public bool prizeInfos;
      public bool extraPrizeInfos;
      public bool cheerValResults;
    }

    public AnnouncePassInfo() {
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
              AnnounceId = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Byte) {
              AnnounceIndex = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Byte) {
              PassRank = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.List) {
              {
                CondResultList = new List<MusicCodec.PassCheerCondResult>();
                TList _list12 = iprot.ReadListBegin();
                for( int _i13 = 0; _i13 < _list12.Count; ++_i13)
                {
                  MusicCodec.PassCheerCondResult _elem14 = new MusicCodec.PassCheerCondResult();
                  _elem14 = new MusicCodec.PassCheerCondResult();
                  _elem14.Read(iprot);
                  CondResultList.Add(_elem14);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.Struct) {
              PrizeInfos = new MusicCodec.PrizeInfo();
              PrizeInfos.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.Struct) {
              ExtraPrizeInfos = new MusicCodec.PrizeInfo();
              ExtraPrizeInfos.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.List) {
              {
                CheerValResults = new List<MusicCodec.DanceCheerValResult>();
                TList _list15 = iprot.ReadListBegin();
                for( int _i16 = 0; _i16 < _list15.Count; ++_i16)
                {
                  MusicCodec.DanceCheerValResult _elem17 = new MusicCodec.DanceCheerValResult();
                  _elem17 = new MusicCodec.DanceCheerValResult();
                  _elem17.Read(iprot);
                  CheerValResults.Add(_elem17);
                }
                iprot.ReadListEnd();
              }
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
      TStruct struc = new TStruct("AnnouncePassInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.announceId) {
        field.Name = "announceId";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(AnnounceId);
        oprot.WriteFieldEnd();
      }
      if (__isset.announceIndex) {
        field.Name = "announceIndex";
        field.Type = TType.Byte;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(AnnounceIndex);
        oprot.WriteFieldEnd();
      }
      if (__isset.passRank) {
        field.Name = "passRank";
        field.Type = TType.Byte;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(PassRank);
        oprot.WriteFieldEnd();
      }
      if (CondResultList != null && __isset.condResultList) {
        field.Name = "condResultList";
        field.Type = TType.List;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, CondResultList.Count));
          foreach (MusicCodec.PassCheerCondResult _iter18 in CondResultList)
          {
            _iter18.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (PrizeInfos != null && __isset.prizeInfos) {
        field.Name = "prizeInfos";
        field.Type = TType.Struct;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        PrizeInfos.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (ExtraPrizeInfos != null && __isset.extraPrizeInfos) {
        field.Name = "extraPrizeInfos";
        field.Type = TType.Struct;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        ExtraPrizeInfos.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (CheerValResults != null && __isset.cheerValResults) {
        field.Name = "cheerValResults";
        field.Type = TType.List;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, CheerValResults.Count));
          foreach (MusicCodec.DanceCheerValResult _iter19 in CheerValResults)
          {
            _iter19.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("AnnouncePassInfo(");
      sb.Append("AnnounceId: ");
      sb.Append(AnnounceId);
      sb.Append(",AnnounceIndex: ");
      sb.Append(AnnounceIndex);
      sb.Append(",PassRank: ");
      sb.Append(PassRank);
      sb.Append(",CondResultList: ");
      sb.Append(CondResultList);
      sb.Append(",PrizeInfos: ");
      sb.Append(PrizeInfos== null ? "<null>" : PrizeInfos.ToString());
      sb.Append(",ExtraPrizeInfos: ");
      sb.Append(ExtraPrizeInfos== null ? "<null>" : ExtraPrizeInfos.ToString());
      sb.Append(",CheerValResults: ");
      sb.Append(CheerValResults);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
