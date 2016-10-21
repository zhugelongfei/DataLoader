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
  /// ��ʼ��ȭ��Ϸ
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCStartFingerGuess : TBase
  {
    private long _inviterCharId;
    private long _beInvitedCharId;

    /// <summary>
    /// �����߽�ɫid
    /// </summary>
    public long InviterCharId
    {
      get
      {
        return _inviterCharId;
      }
      set
      {
        __isset.inviterCharId = true;
        this._inviterCharId = value;
      }
    }

    /// <summary>
    /// �������߽�ɫid
    /// </summary>
    public long BeInvitedCharId
    {
      get
      {
        return _beInvitedCharId;
      }
      set
      {
        __isset.beInvitedCharId = true;
        this._beInvitedCharId = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool inviterCharId;
      public bool beInvitedCharId;
    }

    public SCStartFingerGuess() {
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
            if (field.Type == TType.I64) {
              InviterCharId = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I64) {
              BeInvitedCharId = iprot.ReadI64();
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