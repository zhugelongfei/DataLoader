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
  /// 巡演章节信息
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class TourChapterInfo : TBase
  {
    private short _chapterId;
    private List<TourChapterRaidInfo> _activeRaidInfos;

    /// <summary>
    /// 章节id
    /// </summary>
    public short ChapterId
    {
      get
      {
        return _chapterId;
      }
      set
      {
        __isset.chapterId = true;
        this._chapterId = value;
      }
    }

    /// <summary>
    /// 已激活关卡信息
    /// </summary>
    public List<TourChapterRaidInfo> ActiveRaidInfos
    {
      get
      {
        return _activeRaidInfos;
      }
      set
      {
        __isset.activeRaidInfos = true;
        this._activeRaidInfos = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool chapterId;
      public bool activeRaidInfos;
    }

    public TourChapterInfo() {
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
            if (field.Type == TType.I16) {
              ChapterId = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.List) {
              {
                ActiveRaidInfos = new List<TourChapterRaidInfo>();
                TList _list0 = iprot.ReadListBegin();
                for( int _i1 = 0; _i1 < _list0.Count; ++_i1)
                {
                  TourChapterRaidInfo _elem2 = new TourChapterRaidInfo();
                  _elem2 = new TourChapterRaidInfo();
                  _elem2.Read(iprot);
                  ActiveRaidInfos.Add(_elem2);
                }
                iprot.ReadListEnd();
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
      TStruct struc = new TStruct("TourChapterInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.chapterId) {
        field.Name = "chapterId";
        field.Type = TType.I16;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(ChapterId);
        oprot.WriteFieldEnd();
      }
      if (ActiveRaidInfos != null && __isset.activeRaidInfos) {
        field.Name = "activeRaidInfos";
        field.Type = TType.List;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, ActiveRaidInfos.Count));
          foreach (TourChapterRaidInfo _iter3 in ActiveRaidInfos)
          {
            _iter3.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("TourChapterInfo(");
      sb.Append("ChapterId: ");
      sb.Append(ChapterId);
      sb.Append(",ActiveRaidInfos: ");
      sb.Append(ActiveRaidInfos);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
