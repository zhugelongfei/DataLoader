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
  /// �����ҷ����ĺ��
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSReqLuckyMoneySend : TBase
  {
    private short _startIndex;

    /// <summary>
    /// ��ǰ����
    /// </summary>
    public short StartIndex
    {
      get
      {
        return _startIndex;
      }
      set
      {
        __isset.startIndex = true;
        this._startIndex = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool startIndex;
    }

    public CSReqLuckyMoneySend() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSReqLuckyMoneySend");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.startIndex) {
        field.Name = "startIndex";
        field.Type = TType.I16;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(StartIndex);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}