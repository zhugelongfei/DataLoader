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
  /// ��ѯ����̬��Ϣ
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSQueryWeddingNotices : TBase
  {
    private MusicCodec.CommonDataPageInfoQueryParam _pageInfoQueryParam;

    /// <summary>
    /// ��ҳ��Ϣ��ѯ����
    /// </summary>
    public MusicCodec.CommonDataPageInfoQueryParam PageInfoQueryParam
    {
      get
      {
        return _pageInfoQueryParam;
      }
      set
      {
        __isset.pageInfoQueryParam = true;
        this._pageInfoQueryParam = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool pageInfoQueryParam;
    }

    public CSQueryWeddingNotices() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSQueryWeddingNotices");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (PageInfoQueryParam != null && __isset.pageInfoQueryParam) {
        field.Name = "pageInfoQueryParam";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        PageInfoQueryParam.Write(oprot);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}