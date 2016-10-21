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
  public partial class CSDeleteVoiceMailMsg : TBase
  {
    private List<string> _voiceKeyList;

    public List<string> VoiceKeyList
    {
      get
      {
        return _voiceKeyList;
      }
      set
      {
        __isset.voiceKeyList = true;
        this._voiceKeyList = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool voiceKeyList;
    }

    public CSDeleteVoiceMailMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSDeleteVoiceMailMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (VoiceKeyList != null && __isset.voiceKeyList) {
        field.Name = "voiceKeyList";
        field.Type = TType.List;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.String, VoiceKeyList.Count));
          foreach (string _iter7 in VoiceKeyList)
          {
            oprot.WriteString(_iter7);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}