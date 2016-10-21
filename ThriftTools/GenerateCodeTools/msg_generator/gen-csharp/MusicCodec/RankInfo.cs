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
  public partial class RankInfo : TBase
  {
    private int _poseId;
    private long _score;
    private List<PlayerBaseInfo> _playerBaseInfos;
    private GuildRankInfo _guildInfo;

    /// <summary>
    /// ˫�˰񵥶���id
    /// </summary>
    public int PoseId
    {
      get
      {
        return _poseId;
      }
      set
      {
        __isset.poseId = true;
        this._poseId = value;
      }
    }

    public long Score
    {
      get
      {
        return _score;
      }
      set
      {
        __isset.score = true;
        this._score = value;
      }
    }

    public List<PlayerBaseInfo> PlayerBaseInfos
    {
      get
      {
        return _playerBaseInfos;
      }
      set
      {
        __isset.playerBaseInfos = true;
        this._playerBaseInfos = value;
      }
    }

    public GuildRankInfo GuildInfo
    {
      get
      {
        return _guildInfo;
      }
      set
      {
        __isset.guildInfo = true;
        this._guildInfo = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool poseId;
      public bool score;
      public bool playerBaseInfos;
      public bool guildInfo;
    }

    public RankInfo() {
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
              PoseId = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I64) {
              Score = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.List) {
              {
                PlayerBaseInfos = new List<PlayerBaseInfo>();
                TList _list178 = iprot.ReadListBegin();
                for( int _i179 = 0; _i179 < _list178.Count; ++_i179)
                {
                  PlayerBaseInfo _elem180 = new PlayerBaseInfo();
                  _elem180 = new PlayerBaseInfo();
                  _elem180.Read(iprot);
                  PlayerBaseInfos.Add(_elem180);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Struct) {
              GuildInfo = new GuildRankInfo();
              GuildInfo.Read(iprot);
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
      TStruct struc = new TStruct("RankInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.poseId) {
        field.Name = "poseId";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(PoseId);
        oprot.WriteFieldEnd();
      }
      if (__isset.score) {
        field.Name = "score";
        field.Type = TType.I64;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(Score);
        oprot.WriteFieldEnd();
      }
      if (PlayerBaseInfos != null && __isset.playerBaseInfos) {
        field.Name = "playerBaseInfos";
        field.Type = TType.List;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, PlayerBaseInfos.Count));
          foreach (PlayerBaseInfo _iter181 in PlayerBaseInfos)
          {
            _iter181.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (GuildInfo != null && __isset.guildInfo) {
        field.Name = "guildInfo";
        field.Type = TType.Struct;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        GuildInfo.Write(oprot);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("RankInfo(");
      sb.Append("PoseId: ");
      sb.Append(PoseId);
      sb.Append(",Score: ");
      sb.Append(Score);
      sb.Append(",PlayerBaseInfos: ");
      sb.Append(PlayerBaseInfos);
      sb.Append(",GuildInfo: ");
      sb.Append(GuildInfo== null ? "<null>" : GuildInfo.ToString());
      sb.Append(")");
      return sb.ToString();
    }

  }

}
