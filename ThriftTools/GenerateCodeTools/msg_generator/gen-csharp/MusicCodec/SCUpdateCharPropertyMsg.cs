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
  public partial class SCUpdateCharPropertyMsg : TBase
  {
    private int _ib;
    private int _gold;
    private int _point;
    private long _popularity;
    private int _exp;
    private int _cup;
    private int _praise;
    private int _freeIb;
    private List<byte> _byteCounterList;
    private List<short> _shortCounterList;
    private List<int> _intCounterList;
    private int _rechargeIb;
    private List<int> _intDayLoopCounterList;
    private byte[] _flags;
    private int _activeVal;
    private byte _activeLevel;
    private List<short> _shortDayLoopCounterList;
    private List<byte> _byteDayLoopCounterList;
    private int _largesse;
    private int _charm;
    private byte _vipLevel;
    private int _totalRecharge;
    private short _tagId;
    private int _nonPointIb;
    private string _bindEmail;
    private int _friendType;
    private int _skinColor;
    private int _starLights;
    private short _dailyLeftImproviseCount;
    private int _improviseCoupon;
    private int _starLightLvlPrizeCoupon;
    private byte _incTouchLoveTimes;
    private int _loverVal;
    private int _announceIb;
    private int _guildGold;
    private int _fashionVal;

    public int Ib
    {
      get
      {
        return _ib;
      }
      set
      {
        __isset.ib = true;
        this._ib = value;
      }
    }

    public int Gold
    {
      get
      {
        return _gold;
      }
      set
      {
        __isset.gold = true;
        this._gold = value;
      }
    }

    public int Point
    {
      get
      {
        return _point;
      }
      set
      {
        __isset.point = true;
        this._point = value;
      }
    }

    public long Popularity
    {
      get
      {
        return _popularity;
      }
      set
      {
        __isset.popularity = true;
        this._popularity = value;
      }
    }

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

    public int Cup
    {
      get
      {
        return _cup;
      }
      set
      {
        __isset.cup = true;
        this._cup = value;
      }
    }

    public int Praise
    {
      get
      {
        return _praise;
      }
      set
      {
        __isset.praise = true;
        this._praise = value;
      }
    }

    public int FreeIb
    {
      get
      {
        return _freeIb;
      }
      set
      {
        __isset.freeIb = true;
        this._freeIb = value;
      }
    }

    public List<byte> ByteCounterList
    {
      get
      {
        return _byteCounterList;
      }
      set
      {
        __isset.byteCounterList = true;
        this._byteCounterList = value;
      }
    }

    public List<short> ShortCounterList
    {
      get
      {
        return _shortCounterList;
      }
      set
      {
        __isset.shortCounterList = true;
        this._shortCounterList = value;
      }
    }

    public List<int> IntCounterList
    {
      get
      {
        return _intCounterList;
      }
      set
      {
        __isset.intCounterList = true;
        this._intCounterList = value;
      }
    }

    public int RechargeIb
    {
      get
      {
        return _rechargeIb;
      }
      set
      {
        __isset.rechargeIb = true;
        this._rechargeIb = value;
      }
    }

    public List<int> IntDayLoopCounterList
    {
      get
      {
        return _intDayLoopCounterList;
      }
      set
      {
        __isset.intDayLoopCounterList = true;
        this._intDayLoopCounterList = value;
      }
    }

    public byte[] Flags
    {
      get
      {
        return _flags;
      }
      set
      {
        __isset.flags = true;
        this._flags = value;
      }
    }

    public int ActiveVal
    {
      get
      {
        return _activeVal;
      }
      set
      {
        __isset.activeVal = true;
        this._activeVal = value;
      }
    }

    public byte ActiveLevel
    {
      get
      {
        return _activeLevel;
      }
      set
      {
        __isset.activeLevel = true;
        this._activeLevel = value;
      }
    }

    public List<short> ShortDayLoopCounterList
    {
      get
      {
        return _shortDayLoopCounterList;
      }
      set
      {
        __isset.shortDayLoopCounterList = true;
        this._shortDayLoopCounterList = value;
      }
    }

    public List<byte> ByteDayLoopCounterList
    {
      get
      {
        return _byteDayLoopCounterList;
      }
      set
      {
        __isset.byteDayLoopCounterList = true;
        this._byteDayLoopCounterList = value;
      }
    }

    public int Largesse
    {
      get
      {
        return _largesse;
      }
      set
      {
        __isset.largesse = true;
        this._largesse = value;
      }
    }

    public int Charm
    {
      get
      {
        return _charm;
      }
      set
      {
        __isset.charm = true;
        this._charm = value;
      }
    }

    public byte VipLevel
    {
      get
      {
        return _vipLevel;
      }
      set
      {
        __isset.vipLevel = true;
        this._vipLevel = value;
      }
    }

    public int TotalRecharge
    {
      get
      {
        return _totalRecharge;
      }
      set
      {
        __isset.totalRecharge = true;
        this._totalRecharge = value;
      }
    }

    public short TagId
    {
      get
      {
        return _tagId;
      }
      set
      {
        __isset.tagId = true;
        this._tagId = value;
      }
    }

    public int NonPointIb
    {
      get
      {
        return _nonPointIb;
      }
      set
      {
        __isset.nonPointIb = true;
        this._nonPointIb = value;
      }
    }

    public string BindEmail
    {
      get
      {
        return _bindEmail;
      }
      set
      {
        __isset.bindEmail = true;
        this._bindEmail = value;
      }
    }

    public int FriendType
    {
      get
      {
        return _friendType;
      }
      set
      {
        __isset.friendType = true;
        this._friendType = value;
      }
    }

    public int SkinColor
    {
      get
      {
        return _skinColor;
      }
      set
      {
        __isset.skinColor = true;
        this._skinColor = value;
      }
    }

    public int StarLights
    {
      get
      {
        return _starLights;
      }
      set
      {
        __isset.starLights = true;
        this._starLights = value;
      }
    }

    public short DailyLeftImproviseCount
    {
      get
      {
        return _dailyLeftImproviseCount;
      }
      set
      {
        __isset.dailyLeftImproviseCount = true;
        this._dailyLeftImproviseCount = value;
      }
    }

    public int ImproviseCoupon
    {
      get
      {
        return _improviseCoupon;
      }
      set
      {
        __isset.improviseCoupon = true;
        this._improviseCoupon = value;
      }
    }

    public int StarLightLvlPrizeCoupon
    {
      get
      {
        return _starLightLvlPrizeCoupon;
      }
      set
      {
        __isset.starLightLvlPrizeCoupon = true;
        this._starLightLvlPrizeCoupon = value;
      }
    }

    /// <summary>
    /// ����������һ������ֵ����
    /// </summary>
    public byte IncTouchLoveTimes
    {
      get
      {
        return _incTouchLoveTimes;
      }
      set
      {
        __isset.incTouchLoveTimes = true;
        this._incTouchLoveTimes = value;
      }
    }

    /// <summary>
    /// ��ǰ����ֵ
    /// </summary>
    public int LoverVal
    {
      get
      {
        return _loverVal;
      }
      set
      {
        __isset.loverVal = true;
        this._loverVal = value;
      }
    }

    public int AnnounceIb
    {
      get
      {
        return _announceIb;
      }
      set
      {
        __isset.announceIb = true;
        this._announceIb = value;
      }
    }

    public int GuildGold
    {
      get
      {
        return _guildGold;
      }
      set
      {
        __isset.guildGold = true;
        this._guildGold = value;
      }
    }

    /// <summary>
    /// ��ǰʱ��ֵ
    /// </summary>
    public int FashionVal
    {
      get
      {
        return _fashionVal;
      }
      set
      {
        __isset.fashionVal = true;
        this._fashionVal = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool ib;
      public bool gold;
      public bool point;
      public bool popularity;
      public bool exp;
      public bool cup;
      public bool praise;
      public bool freeIb;
      public bool byteCounterList;
      public bool shortCounterList;
      public bool intCounterList;
      public bool rechargeIb;
      public bool intDayLoopCounterList;
      public bool flags;
      public bool activeVal;
      public bool activeLevel;
      public bool shortDayLoopCounterList;
      public bool byteDayLoopCounterList;
      public bool largesse;
      public bool charm;
      public bool vipLevel;
      public bool totalRecharge;
      public bool tagId;
      public bool nonPointIb;
      public bool bindEmail;
      public bool friendType;
      public bool skinColor;
      public bool starLights;
      public bool dailyLeftImproviseCount;
      public bool improviseCoupon;
      public bool starLightLvlPrizeCoupon;
      public bool incTouchLoveTimes;
      public bool loverVal;
      public bool announceIb;
      public bool guildGold;
      public bool fashionVal;
    }

    public SCUpdateCharPropertyMsg() {
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
              Ib = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              Gold = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              Point = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I64) {
              Popularity = iprot.ReadI64();
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
          case 6:
            if (field.Type == TType.I32) {
              Cup = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.I32) {
              Praise = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.I32) {
              FreeIb = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 9:
            if (field.Type == TType.List) {
              {
                ByteCounterList = new List<byte>();
                TList _list0 = iprot.ReadListBegin();
                for( int _i1 = 0; _i1 < _list0.Count; ++_i1)
                {
                  byte _elem2 = 0;
                  _elem2 = iprot.ReadByte();
                  ByteCounterList.Add(_elem2);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 10:
            if (field.Type == TType.List) {
              {
                ShortCounterList = new List<short>();
                TList _list3 = iprot.ReadListBegin();
                for( int _i4 = 0; _i4 < _list3.Count; ++_i4)
                {
                  short _elem5 = 0;
                  _elem5 = iprot.ReadI16();
                  ShortCounterList.Add(_elem5);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 11:
            if (field.Type == TType.List) {
              {
                IntCounterList = new List<int>();
                TList _list6 = iprot.ReadListBegin();
                for( int _i7 = 0; _i7 < _list6.Count; ++_i7)
                {
                  int _elem8 = 0;
                  _elem8 = iprot.ReadI32();
                  IntCounterList.Add(_elem8);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 12:
            if (field.Type == TType.I32) {
              RechargeIb = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 13:
            if (field.Type == TType.List) {
              {
                IntDayLoopCounterList = new List<int>();
                TList _list9 = iprot.ReadListBegin();
                for( int _i10 = 0; _i10 < _list9.Count; ++_i10)
                {
                  int _elem11 = 0;
                  _elem11 = iprot.ReadI32();
                  IntDayLoopCounterList.Add(_elem11);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 14:
            if (field.Type == TType.String) {
              Flags = iprot.ReadBinary();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 15:
            if (field.Type == TType.I32) {
              ActiveVal = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 16:
            if (field.Type == TType.Byte) {
              ActiveLevel = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 17:
            if (field.Type == TType.List) {
              {
                ShortDayLoopCounterList = new List<short>();
                TList _list12 = iprot.ReadListBegin();
                for( int _i13 = 0; _i13 < _list12.Count; ++_i13)
                {
                  short _elem14 = 0;
                  _elem14 = iprot.ReadI16();
                  ShortDayLoopCounterList.Add(_elem14);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 18:
            if (field.Type == TType.List) {
              {
                ByteDayLoopCounterList = new List<byte>();
                TList _list15 = iprot.ReadListBegin();
                for( int _i16 = 0; _i16 < _list15.Count; ++_i16)
                {
                  byte _elem17 = 0;
                  _elem17 = iprot.ReadByte();
                  ByteDayLoopCounterList.Add(_elem17);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 19:
            if (field.Type == TType.I32) {
              Largesse = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 20:
            if (field.Type == TType.I32) {
              Charm = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 22:
            if (field.Type == TType.Byte) {
              VipLevel = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 23:
            if (field.Type == TType.I32) {
              TotalRecharge = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 24:
            if (field.Type == TType.I16) {
              TagId = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 25:
            if (field.Type == TType.I32) {
              NonPointIb = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 26:
            if (field.Type == TType.String) {
              BindEmail = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 27:
            if (field.Type == TType.I32) {
              FriendType = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 28:
            if (field.Type == TType.I32) {
              SkinColor = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 29:
            if (field.Type == TType.I32) {
              StarLights = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 31:
            if (field.Type == TType.I16) {
              DailyLeftImproviseCount = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 32:
            if (field.Type == TType.I32) {
              ImproviseCoupon = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 33:
            if (field.Type == TType.I32) {
              StarLightLvlPrizeCoupon = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 34:
            if (field.Type == TType.Byte) {
              IncTouchLoveTimes = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 35:
            if (field.Type == TType.I32) {
              LoverVal = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 36:
            if (field.Type == TType.I32) {
              AnnounceIb = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 37:
            if (field.Type == TType.I32) {
              GuildGold = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 38:
            if (field.Type == TType.I32) {
              FashionVal = iprot.ReadI32();
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
ClientLog.Instance.LogError("This function is deleted.");
}

    


  }

}