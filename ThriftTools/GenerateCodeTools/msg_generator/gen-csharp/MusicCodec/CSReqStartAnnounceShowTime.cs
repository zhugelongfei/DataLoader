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
  /// ����ʼͨ��showTime
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSReqStartAnnounceShowTime : TBase
  {

    public CSReqStartAnnounceShowTime() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSReqStartAnnounceShowTime");
      oprot.WriteStructBegin(struc);
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}