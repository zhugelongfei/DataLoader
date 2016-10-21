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
  /// ��ȭ��Ϸ��ɣ��㲥�����������ˣ�
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCFingerGuessFinish : TBase
  {
    private long _inviterCharId;
    private byte _inviterChoice;
    private long _beInvitedCharId;
    private byte _beInvitedChoice;
    private int _actionId;

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
    /// �����߳�ȭ0-ʯͷ 1-���� 2-��
    /// </summary>
    public byte InviterChoice
    {
      get
      {
        return _inviterChoice;
      }
      set
      {
        __isset.inviterChoice = true;
        this._inviterChoice = value;
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

    /// <summary>
    /// �������߳�ȭ0-ʯͷ 1-���� 2-��
    /// </summary>
    public byte BeInvitedChoice
    {
      get
      {
        return _beInvitedChoice;
      }
      set
      {
        __isset.beInvitedChoice = true;
        this._beInvitedChoice = value;
      }
    }

    /// <summary>
    /// ����id
    /// </summary>
    public int ActionId
    {
      get
      {
        return _actionId;
      }
      set
      {
        __isset.actionId = true;
        this._actionId = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool inviterCharId;
      public bool inviterChoice;
      public bool beInvitedCharId;
      public bool beInvitedChoice;
      public bool actionId;
    }

    public SCFingerGuessFinish() {
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
            if (field.Type == TType.Byte) {
              InviterChoice = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I64) {
              BeInvitedCharId = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Byte) {
              BeInvitedChoice = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I32) {
              ActionId = iprot.ReadI32();
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