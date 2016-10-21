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
  /// ��ѯ���������б�ҳ������
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSQueryGuildListMsg : TBase
  {
    private MusicCodec.CommonDataPageInfoQueryParam _pageInfoQueryParam;
    private MusicCodec.GuildSortType _queryType;

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

    /// <summary>
    /// 
    /// <seealso cref="MusicCodec.GuildSortType"/>
    /// </summary>
    public MusicCodec.GuildSortType QueryType
    {
      get
      {
        return _queryType;
      }
      set
      {
        __isset.queryType = true;
        this._queryType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool pageInfoQueryParam;
      public bool queryType;
    }

    public CSQueryGuildListMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSQueryGuildListMsg");
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
      if (__isset.queryType) {
        field.Name = "queryType";
        field.Type = TType.I32;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)QueryType);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}