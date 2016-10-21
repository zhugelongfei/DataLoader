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
  /// 婚礼祝福成功
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCWeddingBlessSucc : TBase
  {
    private int _blessVal;
    private string _fromCharName;

    /// <summary>
    /// 当前祝福值
    /// </summary>
    public int BlessVal
    {
      get
      {
        return _blessVal;
      }
      set
      {
        __isset.blessVal = true;
        this._blessVal = value;
      }
    }

    /// <summary>
    /// 来自玩家名
    /// </summary>
    public string FromCharName
    {
      get
      {
        return _fromCharName;
      }
      set
      {
        __isset.fromCharName = true;
        this._fromCharName = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool blessVal;
      public bool fromCharName;
    }

    public SCWeddingBlessSucc() {
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
              BlessVal = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              FromCharName = iprot.ReadString();
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
