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
  /// ����Э��Ѳ��״̬
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCUpdateAssistTourStatusMsg : TBase
  {
    private Dictionary<long, byte> _updateAssistStatuss;

    public Dictionary<long, byte> UpdateAssistStatuss
    {
      get
      {
        return _updateAssistStatuss;
      }
      set
      {
        __isset.updateAssistStatuss = true;
        this._updateAssistStatuss = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool updateAssistStatuss;
    }

    public SCUpdateAssistTourStatusMsg() {
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
            if (field.Type == TType.Map) {
              {
                UpdateAssistStatuss = new Dictionary<long, byte>();
                TMap _map40 = iprot.ReadMapBegin();
                for( int _i41 = 0; _i41 < _map40.Count; ++_i41)
                {
                  long _key42;
                  byte _val43;
                  _key42 = iprot.ReadI64();
                  _val43 = iprot.ReadByte();
                  UpdateAssistStatuss[_key42] = _val43;
                }
                iprot.ReadMapEnd();
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
ClientLog.Instance.LogError("This function is deleted.");
}

    


  }

}