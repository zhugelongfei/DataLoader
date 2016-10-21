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
  /// vip等级奖励信息
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCVipLevelPrizeMsg : TBase
  {
    private byte _vipLvl;
    private MusicCodec.PrizeInfo _prizeInfos;

    /// <summary>
    /// vip等级
    /// </summary>
    public byte VipLvl
    {
      get
      {
        return _vipLvl;
      }
      set
      {
        __isset.vipLvl = true;
        this._vipLvl = value;
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


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool vipLvl;
      public bool prizeInfos;
    }

    public SCVipLevelPrizeMsg() {
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
            if (field.Type == TType.Byte) {
              VipLvl = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Struct) {
              PrizeInfos = new MusicCodec.PrizeInfo();
              PrizeInfos.Read(iprot);
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
