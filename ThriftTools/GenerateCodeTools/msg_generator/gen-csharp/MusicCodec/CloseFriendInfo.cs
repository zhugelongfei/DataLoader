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
  public partial class CloseFriendInfo : TBase
  {
    private string _relationshipSelf;
    private byte _useLvlRelationShipSelf;
    private string _relationshipFriend;
    private byte _useLvlRelationShipFriend;
    private int _intimacyVal;
    private int _poseId;
    private string _moodMessageSelf;
    private string _voiceMessageSelf;
    private int _modeId;
    private byte _stature;
    private string _moodMessageFriend;
    private string _voiceMessageFriend;
    private PlayerBaseInfo _playerBaseInfo;
    private List<AvatarInfo> _avatarListFriend;
    private int _specialDay;
    private bool _isFirstTimeChangeNick;
    private bool _isFirstTimeChangePos;
    private bool _isOnline;
    private List<BadgeInfo> _putOnBadges;

    public string RelationshipSelf
    {
      get
      {
        return _relationshipSelf;
      }
      set
      {
        __isset.relationshipSelf = true;
        this._relationshipSelf = value;
      }
    }

    public byte UseLvlRelationShipSelf
    {
      get
      {
        return _useLvlRelationShipSelf;
      }
      set
      {
        __isset.useLvlRelationShipSelf = true;
        this._useLvlRelationShipSelf = value;
      }
    }

    public string RelationshipFriend
    {
      get
      {
        return _relationshipFriend;
      }
      set
      {
        __isset.relationshipFriend = true;
        this._relationshipFriend = value;
      }
    }

    public byte UseLvlRelationShipFriend
    {
      get
      {
        return _useLvlRelationShipFriend;
      }
      set
      {
        __isset.useLvlRelationShipFriend = true;
        this._useLvlRelationShipFriend = value;
      }
    }

    public int IntimacyVal
    {
      get
      {
        return _intimacyVal;
      }
      set
      {
        __isset.intimacyVal = true;
        this._intimacyVal = value;
      }
    }

    /// <summary>
    /// 双人动作id
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

    public string MoodMessageSelf
    {
      get
      {
        return _moodMessageSelf;
      }
      set
      {
        __isset.moodMessageSelf = true;
        this._moodMessageSelf = value;
      }
    }

    public string VoiceMessageSelf
    {
      get
      {
        return _voiceMessageSelf;
      }
      set
      {
        __isset.voiceMessageSelf = true;
        this._voiceMessageSelf = value;
      }
    }

    public int ModeId
    {
      get
      {
        return _modeId;
      }
      set
      {
        __isset.modeId = true;
        this._modeId = value;
      }
    }

    public byte Stature
    {
      get
      {
        return _stature;
      }
      set
      {
        __isset.stature = true;
        this._stature = value;
      }
    }

    public string MoodMessageFriend
    {
      get
      {
        return _moodMessageFriend;
      }
      set
      {
        __isset.moodMessageFriend = true;
        this._moodMessageFriend = value;
      }
    }

    public string VoiceMessageFriend
    {
      get
      {
        return _voiceMessageFriend;
      }
      set
      {
        __isset.voiceMessageFriend = true;
        this._voiceMessageFriend = value;
      }
    }

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

    public List<AvatarInfo> AvatarListFriend
    {
      get
      {
        return _avatarListFriend;
      }
      set
      {
        __isset.avatarListFriend = true;
        this._avatarListFriend = value;
      }
    }

    /// <summary>
    /// 纪念日(时间戳/1000)
    /// </summary>
    public int SpecialDay
    {
      get
      {
        return _specialDay;
      }
      set
      {
        __isset.specialDay = true;
        this._specialDay = value;
      }
    }

    public bool IsFirstTimeChangeNick
    {
      get
      {
        return _isFirstTimeChangeNick;
      }
      set
      {
        __isset.isFirstTimeChangeNick = true;
        this._isFirstTimeChangeNick = value;
      }
    }

    public bool IsFirstTimeChangePos
    {
      get
      {
        return _isFirstTimeChangePos;
      }
      set
      {
        __isset.isFirstTimeChangePos = true;
        this._isFirstTimeChangePos = value;
      }
    }

    /// <summary>
    /// 当前是否在线
    /// </summary>
    public bool IsOnline
    {
      get
      {
        return _isOnline;
      }
      set
      {
        __isset.isOnline = true;
        this._isOnline = value;
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


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool relationshipSelf;
      public bool useLvlRelationShipSelf;
      public bool relationshipFriend;
      public bool useLvlRelationShipFriend;
      public bool intimacyVal;
      public bool poseId;
      public bool moodMessageSelf;
      public bool voiceMessageSelf;
      public bool modeId;
      public bool stature;
      public bool moodMessageFriend;
      public bool voiceMessageFriend;
      public bool playerBaseInfo;
      public bool avatarListFriend;
      public bool specialDay;
      public bool isFirstTimeChangeNick;
      public bool isFirstTimeChangePos;
      public bool isOnline;
      public bool putOnBadges;
    }

    public CloseFriendInfo() {
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
            if (field.Type == TType.String) {
              RelationshipSelf = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Byte) {
              UseLvlRelationShipSelf = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              RelationshipFriend = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Byte) {
              UseLvlRelationShipFriend = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I32) {
              IntimacyVal = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.I32) {
              PoseId = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.String) {
              MoodMessageSelf = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.String) {
              VoiceMessageSelf = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 9:
            if (field.Type == TType.I32) {
              ModeId = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 10:
            if (field.Type == TType.Byte) {
              Stature = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 11:
            if (field.Type == TType.String) {
              MoodMessageFriend = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 12:
            if (field.Type == TType.String) {
              VoiceMessageFriend = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 14:
            if (field.Type == TType.Struct) {
              PlayerBaseInfo = new PlayerBaseInfo();
              PlayerBaseInfo.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 15:
            if (field.Type == TType.List) {
              {
                AvatarListFriend = new List<AvatarInfo>();
                TList _list281 = iprot.ReadListBegin();
                for( int _i282 = 0; _i282 < _list281.Count; ++_i282)
                {
                  AvatarInfo _elem283 = new AvatarInfo();
                  _elem283 = new AvatarInfo();
                  _elem283.Read(iprot);
                  AvatarListFriend.Add(_elem283);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 16:
            if (field.Type == TType.I32) {
              SpecialDay = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 17:
            if (field.Type == TType.Bool) {
              IsFirstTimeChangeNick = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 18:
            if (field.Type == TType.Bool) {
              IsFirstTimeChangePos = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 19:
            if (field.Type == TType.Bool) {
              IsOnline = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 20:
            if (field.Type == TType.List) {
              {
                PutOnBadges = new List<BadgeInfo>();
                TList _list284 = iprot.ReadListBegin();
                for( int _i285 = 0; _i285 < _list284.Count; ++_i285)
                {
                  BadgeInfo _elem286 = new BadgeInfo();
                  _elem286 = new BadgeInfo();
                  _elem286.Read(iprot);
                  PutOnBadges.Add(_elem286);
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
      TStruct struc = new TStruct("CloseFriendInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (RelationshipSelf != null && __isset.relationshipSelf) {
        field.Name = "relationshipSelf";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(RelationshipSelf);
        oprot.WriteFieldEnd();
      }
      if (__isset.useLvlRelationShipSelf) {
        field.Name = "useLvlRelationShipSelf";
        field.Type = TType.Byte;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(UseLvlRelationShipSelf);
        oprot.WriteFieldEnd();
      }
      if (RelationshipFriend != null && __isset.relationshipFriend) {
        field.Name = "relationshipFriend";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(RelationshipFriend);
        oprot.WriteFieldEnd();
      }
      if (__isset.useLvlRelationShipFriend) {
        field.Name = "useLvlRelationShipFriend";
        field.Type = TType.Byte;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(UseLvlRelationShipFriend);
        oprot.WriteFieldEnd();
      }
      if (__isset.intimacyVal) {
        field.Name = "intimacyVal";
        field.Type = TType.I32;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(IntimacyVal);
        oprot.WriteFieldEnd();
      }
      if (__isset.poseId) {
        field.Name = "poseId";
        field.Type = TType.I32;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(PoseId);
        oprot.WriteFieldEnd();
      }
      if (MoodMessageSelf != null && __isset.moodMessageSelf) {
        field.Name = "moodMessageSelf";
        field.Type = TType.String;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(MoodMessageSelf);
        oprot.WriteFieldEnd();
      }
      if (VoiceMessageSelf != null && __isset.voiceMessageSelf) {
        field.Name = "voiceMessageSelf";
        field.Type = TType.String;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(VoiceMessageSelf);
        oprot.WriteFieldEnd();
      }
      if (__isset.modeId) {
        field.Name = "modeId";
        field.Type = TType.I32;
        field.ID = 9;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(ModeId);
        oprot.WriteFieldEnd();
      }
      if (__isset.stature) {
        field.Name = "stature";
        field.Type = TType.Byte;
        field.ID = 10;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(Stature);
        oprot.WriteFieldEnd();
      }
      if (MoodMessageFriend != null && __isset.moodMessageFriend) {
        field.Name = "moodMessageFriend";
        field.Type = TType.String;
        field.ID = 11;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(MoodMessageFriend);
        oprot.WriteFieldEnd();
      }
      if (VoiceMessageFriend != null && __isset.voiceMessageFriend) {
        field.Name = "voiceMessageFriend";
        field.Type = TType.String;
        field.ID = 12;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(VoiceMessageFriend);
        oprot.WriteFieldEnd();
      }
      if (PlayerBaseInfo != null && __isset.playerBaseInfo) {
        field.Name = "playerBaseInfo";
        field.Type = TType.Struct;
        field.ID = 14;
        oprot.WriteFieldBegin(field);
        PlayerBaseInfo.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (AvatarListFriend != null && __isset.avatarListFriend) {
        field.Name = "avatarListFriend";
        field.Type = TType.List;
        field.ID = 15;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, AvatarListFriend.Count));
          foreach (AvatarInfo _iter287 in AvatarListFriend)
          {
            _iter287.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (__isset.specialDay) {
        field.Name = "specialDay";
        field.Type = TType.I32;
        field.ID = 16;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(SpecialDay);
        oprot.WriteFieldEnd();
      }
      if (__isset.isFirstTimeChangeNick) {
        field.Name = "isFirstTimeChangeNick";
        field.Type = TType.Bool;
        field.ID = 17;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(IsFirstTimeChangeNick);
        oprot.WriteFieldEnd();
      }
      if (__isset.isFirstTimeChangePos) {
        field.Name = "isFirstTimeChangePos";
        field.Type = TType.Bool;
        field.ID = 18;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(IsFirstTimeChangePos);
        oprot.WriteFieldEnd();
      }
      if (__isset.isOnline) {
        field.Name = "isOnline";
        field.Type = TType.Bool;
        field.ID = 19;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(IsOnline);
        oprot.WriteFieldEnd();
      }
      if (PutOnBadges != null && __isset.putOnBadges) {
        field.Name = "putOnBadges";
        field.Type = TType.List;
        field.ID = 20;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, PutOnBadges.Count));
          foreach (BadgeInfo _iter288 in PutOnBadges)
          {
            _iter288.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("CloseFriendInfo(");
      sb.Append("RelationshipSelf: ");
      sb.Append(RelationshipSelf);
      sb.Append(",UseLvlRelationShipSelf: ");
      sb.Append(UseLvlRelationShipSelf);
      sb.Append(",RelationshipFriend: ");
      sb.Append(RelationshipFriend);
      sb.Append(",UseLvlRelationShipFriend: ");
      sb.Append(UseLvlRelationShipFriend);
      sb.Append(",IntimacyVal: ");
      sb.Append(IntimacyVal);
      sb.Append(",PoseId: ");
      sb.Append(PoseId);
      sb.Append(",MoodMessageSelf: ");
      sb.Append(MoodMessageSelf);
      sb.Append(",VoiceMessageSelf: ");
      sb.Append(VoiceMessageSelf);
      sb.Append(",ModeId: ");
      sb.Append(ModeId);
      sb.Append(",Stature: ");
      sb.Append(Stature);
      sb.Append(",MoodMessageFriend: ");
      sb.Append(MoodMessageFriend);
      sb.Append(",VoiceMessageFriend: ");
      sb.Append(VoiceMessageFriend);
      sb.Append(",PlayerBaseInfo: ");
      sb.Append(PlayerBaseInfo== null ? "<null>" : PlayerBaseInfo.ToString());
      sb.Append(",AvatarListFriend: ");
      sb.Append(AvatarListFriend);
      sb.Append(",SpecialDay: ");
      sb.Append(SpecialDay);
      sb.Append(",IsFirstTimeChangeNick: ");
      sb.Append(IsFirstTimeChangeNick);
      sb.Append(",IsFirstTimeChangePos: ");
      sb.Append(IsFirstTimeChangePos);
      sb.Append(",IsOnline: ");
      sb.Append(IsOnline);
      sb.Append(",PutOnBadges: ");
      sb.Append(PutOnBadges);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
