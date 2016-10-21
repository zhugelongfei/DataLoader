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
  /// 最早可领红包信息
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCFirstLuckyMoneyInfo : TBase
  {
    private SCUpdateLuckyMoneyProp _firstMoneyInfo;

    public SCUpdateLuckyMoneyProp FirstMoneyInfo
    {
      get
      {
        return _firstMoneyInfo;
      }
      set
      {
        __isset.firstMoneyInfo = true;
        this._firstMoneyInfo = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool firstMoneyInfo;
    }

    public SCFirstLuckyMoneyInfo() {
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
              FirstMoneyInfo = new SCUpdateLuckyMoneyProp();
              FirstMoneyInfo.Read(iprot);
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
