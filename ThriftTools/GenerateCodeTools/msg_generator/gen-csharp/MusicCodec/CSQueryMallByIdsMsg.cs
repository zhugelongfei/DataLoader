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
  /// �����Ӧ��Ʒid����Ʒ��Ϣ
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSQueryMallByIdsMsg : TBase
  {
    private MusicCodec.CommonDataQueryByIdsParam _queryByIdsParam;
    private bool _isLimitMall;

    /// <summary>
    /// �����Ӧid����Ϣ����
    /// </summary>
    public MusicCodec.CommonDataQueryByIdsParam QueryByIdsParam
    {
      get
      {
        return _queryByIdsParam;
      }
      set
      {
        __isset.queryByIdsParam = true;
        this._queryByIdsParam = value;
      }
    }

    /// <summary>
    /// �Ƿ���ʱ�̳�
    /// </summary>
    public bool IsLimitMall
    {
      get
      {
        return _isLimitMall;
      }
      set
      {
        __isset.isLimitMall = true;
        this._isLimitMall = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool queryByIdsParam;
      public bool isLimitMall;
    }

    public CSQueryMallByIdsMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSQueryMallByIdsMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (QueryByIdsParam != null && __isset.queryByIdsParam) {
        field.Name = "queryByIdsParam";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        QueryByIdsParam.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (__isset.isLimitMall) {
        field.Name = "isLimitMall";
        field.Type = TType.Bool;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(IsLimitMall);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}