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
  /// 领取首充返回消息
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCGetFirstRechargePrizeSucc : TBase
  {
    private MusicCodec.FirstRechargeAwardState _state;
    private bool _isPrize;

    /// <summary>
    /// 领取状态
    /// 
    /// <seealso cref="MusicCodec.FirstRechargeAwardState"/>
    /// </summary>
    public MusicCodec.FirstRechargeAwardState State
    {
      get
      {
        return _state;
      }
      set
      {
        __isset.state = true;
        this._state = value;
      }
    }

    /// <summary>
    /// 是否是领取奖励
    /// </summary>
    public bool IsPrize
    {
      get
      {
        return _isPrize;
      }
      set
      {
        __isset.isPrize = true;
        this._isPrize = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool state;
      public bool isPrize;
    }

    public SCGetFirstRechargePrizeSucc() {
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
              State = (MusicCodec.FirstRechargeAwardState)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Bool) {
              IsPrize = iprot.ReadBool();
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
