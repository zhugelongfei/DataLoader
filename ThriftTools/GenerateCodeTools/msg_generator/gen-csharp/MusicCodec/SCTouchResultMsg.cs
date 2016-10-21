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
  /// ��һ�����
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCTouchResultMsg : TBase
  {
    private bool _canAddLoverVal;
    private int _incTargetPop;
    private byte _relationType;
    private int _incRelationVal;

    /// <summary>
    /// �ܷ����Ӱ���ֵ
    /// </summary>
    public bool CanAddLoverVal
    {
      get
      {
        return _canAddLoverVal;
      }
      set
      {
        __isset.canAddLoverVal = true;
        this._canAddLoverVal = value;
      }
    }

    /// <summary>
    /// ��������������ֵ
    /// </summary>
    public int IncTargetPop
    {
      get
      {
        return _incTargetPop;
      }
      set
      {
        __isset.incTargetPop = true;
        this._incTargetPop = value;
      }
    }

    /// <summary>
    /// ��ϵ���� -1�޹�ϵ 0-���� 1-���� 2-���� 3-����
    /// </summary>
    public byte RelationType
    {
      get
      {
        return _relationType;
      }
      set
      {
        __isset.relationType = true;
        this._relationType = value;
      }
    }

    /// <summary>
    /// ���ӵ��ѺöȻ�����ֵ������ֵ
    /// </summary>
    public int IncRelationVal
    {
      get
      {
        return _incRelationVal;
      }
      set
      {
        __isset.incRelationVal = true;
        this._incRelationVal = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool canAddLoverVal;
      public bool incTargetPop;
      public bool relationType;
      public bool incRelationVal;
    }

    public SCTouchResultMsg() {
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
            if (field.Type == TType.Bool) {
              CanAddLoverVal = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              IncTargetPop = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Byte) {
              RelationType = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I32) {
              IncRelationVal = iprot.ReadI32();
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