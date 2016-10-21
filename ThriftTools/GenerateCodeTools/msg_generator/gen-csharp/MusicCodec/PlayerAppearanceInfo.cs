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
  /// 玩家外观信息
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class PlayerAppearanceInfo : TBase
  {
    private PlayerBaseInfo _playerBaseInfo;
    private short _modelId;
    private List<AvatarInfo> _avatarInfos;
    private List<BadgeInfo> _putOnBadges;
    private int _exp;

    public PlayerBaseInfo PlayerBaseInfo
    {
      get
      {
        return _playerBaseInfo;
      }
      set
      {
        __isset.playerBaseInfo = true;
        this._playerBaseInfo = value;
      }
    }

    public short ModelId
    {
      get
      {
        return _modelId;
      }
      set
      {
        __isset.modelId = true;
        this._modelId = value;
      }
    }

    public List<AvatarInfo> AvatarInfos
    {
      get
      {
        return _avatarInfos;
      }
      set
      {
        __isset.avatarInfos = true;
        this._avatarInfos = value;
      }
    }

    /// <summary>
    /// 佩戴的徽章
    /// </summary>
    public List<BadgeInfo> PutOnBadges
    {
      get
      {
        return _putOnBadges;
      }
      set
      {
        __isset.putOnBadges = true;
        this._putOnBadges = value;
      }
    }

    /// <summary>
    /// 当前经验值， 显示经验条使用
    /// </summary>
    public int Exp
    {
      get
      {
        return _exp;
      }
      set
      {
        __isset.exp = true;
        this._exp = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool playerBaseInfo;
      public bool modelId;
      public bool avatarInfos;
      public bool putOnBadges;
      public bool exp;
    }

    public PlayerAppearanceInfo() {
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
            if (field.Type == TType.Struct) {
              PlayerBaseInfo = new PlayerBaseInfo();
              PlayerBaseInfo.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I16) {
              ModelId = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.List) {
              {
                AvatarInfos = new List<AvatarInfo>();
                TList _list70 = iprot.ReadListBegin();
                for( int _i71 = 0; _i71 < _list70.Count; ++_i71)
                {
                  AvatarInfo _elem72 = new AvatarInfo();
                  _elem72 = new AvatarInfo();
                  _elem72.Read(iprot);
                  AvatarInfos.Add(_elem72);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.List) {
              {
                PutOnBadges = new List<BadgeInfo>();
                TList _list73 = iprot.ReadListBegin();
                for( int _i74 = 0; _i74 < _list73.Count; ++_i74)
                {
                  BadgeInfo _elem75 = new BadgeInfo();
                  _elem75 = new BadgeInfo();
                  _elem75.Read(iprot);
                  PutOnBadges.Add(_elem75);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I32) {
              Exp = iprot.ReadI32();
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
      TStruct struc = new TStruct("PlayerAppearanceInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (PlayerBaseInfo != null && __isset.playerBaseInfo) {
        field.Name = "playerBaseInfo";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        PlayerBaseInfo.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (__isset.modelId) {
        field.Name = "modelId";
        field.Type = TType.I16;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(ModelId);
        oprot.WriteFieldEnd();
      }
      if (AvatarInfos != null && __isset.avatarInfos) {
        field.Name = "avatarInfos";
        field.Type = TType.List;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, AvatarInfos.Count));
          foreach (AvatarInfo _iter76 in AvatarInfos)
          {
            _iter76.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (PutOnBadges != null && __isset.putOnBadges) {
        field.Name = "putOnBadges";
        field.Type = TType.List;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, PutOnBadges.Count));
          foreach (BadgeInfo _iter77 in PutOnBadges)
          {
            _iter77.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (__isset.exp) {
        field.Name = "exp";
        field.Type = TType.I32;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Exp);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("PlayerAppearanceInfo(");
      sb.Append("PlayerBaseInfo: ");
      sb.Append(PlayerBaseInfo== null ? "<null>" : PlayerBaseInfo.ToString());
      sb.Append(",ModelId: ");
      sb.Append(ModelId);
      sb.Append(",AvatarInfos: ");
      sb.Append(AvatarInfos);
      sb.Append(",PutOnBadges: ");
      sb.Append(PutOnBadges);
      sb.Append(",Exp: ");
      sb.Append(Exp);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
