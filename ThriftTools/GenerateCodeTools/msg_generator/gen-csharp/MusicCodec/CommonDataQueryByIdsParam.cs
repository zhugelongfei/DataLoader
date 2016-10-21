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
  /// �����Ӧid����Ϣ����
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CommonDataQueryByIdsParam : TBase
  {
    private List<long> _noCachedIds;
    private List<long> _cachedIds;
    private short _fromType;
    private short _version;

    /// <summary>
    /// �ͻ���û�л������Ϣid
    /// </summary>
    public List<long> NoCachedIds
    {
      get
      {
        return _noCachedIds;
      }
      set
      {
        __isset.noCachedIds = true;
        this._noCachedIds = value;
      }
    }

    /// <summary>
    /// �ͻ����л������Ϣid
    /// </summary>
    public List<long> CachedIds
    {
      get
      {
        return _cachedIds;
      }
      set
      {
        __isset.cachedIds = true;
        this._cachedIds = value;
      }
    }

    /// <summary>
    /// �ͻ������������
    /// </summary>
    public short FromType
    {
      get
      {
        return _fromType;
      }
      set
      {
        __isset.fromType = true;
        this._fromType = value;
      }
    }

    /// <summary>
    /// �ͻ��˴��໺����Ϣ�ܰ汾��
    /// </summary>
    public short Version
    {
      get
      {
        return _version;
      }
      set
      {
        __isset.version = true;
        this._version = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool noCachedIds;
      public bool cachedIds;
      public bool fromType;
      public bool version;
    }

    public CommonDataQueryByIdsParam() {
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
            if (field.Type == TType.List) {
              {
                NoCachedIds = new List<long>();
                TList _list366 = iprot.ReadListBegin();
                for( int _i367 = 0; _i367 < _list366.Count; ++_i367)
                {
                  long _elem368 = 0;
                  _elem368 = iprot.ReadI64();
                  NoCachedIds.Add(_elem368);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                CachedIds = new List<long>();
                TList _list369 = iprot.ReadListBegin();
                for( int _i370 = 0; _i370 < _list369.Count; ++_i370)
                {
                  long _elem371 = 0;
                  _elem371 = iprot.ReadI64();
                  CachedIds.Add(_elem371);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I16) {
              FromType = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I16) {
              Version = iprot.ReadI16();
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
      TStruct struc = new TStruct("CommonDataQueryByIdsParam");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (NoCachedIds != null && __isset.noCachedIds) {
        field.Name = "noCachedIds";
        field.Type = TType.List;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.I64, NoCachedIds.Count));
          foreach (long _iter372 in NoCachedIds)
          {
            oprot.WriteI64(_iter372);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (CachedIds != null && __isset.cachedIds) {
        field.Name = "cachedIds";
        field.Type = TType.List;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.I64, CachedIds.Count));
          foreach (long _iter373 in CachedIds)
          {
            oprot.WriteI64(_iter373);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (__isset.fromType) {
        field.Name = "fromType";
        field.Type = TType.I16;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(FromType);
        oprot.WriteFieldEnd();
      }
      if (__isset.version) {
        field.Name = "version";
        field.Type = TType.I16;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(Version);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("CommonDataQueryByIdsParam(");
      sb.Append("NoCachedIds: ");
      sb.Append(NoCachedIds);
      sb.Append(",CachedIds: ");
      sb.Append(CachedIds);
      sb.Append(",FromType: ");
      sb.Append(FromType);
      sb.Append(",Version: ");
      sb.Append(Version);
      sb.Append(")");
      return sb.ToString();
    }

  }

}