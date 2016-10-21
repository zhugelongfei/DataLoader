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
  /// 成就详细信息
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCAchieveDetailInfos : TBase
  {
    private byte _achieveType;
    private List<AchieveDetailInfo> _achieveDetailInfos;
    private int _achieveDetailVersion;

    /// <summary>
    /// 成就类型EAchieveType
    /// </summary>
    public byte AchieveType
    {
      get
      {
        return _achieveType;
      }
      set
      {
        __isset.achieveType = true;
        this._achieveType = value;
      }
    }

    /// <summary>
    /// 成就详细信息列表
    /// </summary>
    public List<AchieveDetailInfo> AchieveDetailInfos
    {
      get
      {
        return _achieveDetailInfos;
      }
      set
      {
        __isset.achieveDetailInfos = true;
        this._achieveDetailInfos = value;
      }
    }

    public int AchieveDetailVersion
    {
      get
      {
        return _achieveDetailVersion;
      }
      set
      {
        __isset.achieveDetailVersion = true;
        this._achieveDetailVersion = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool achieveType;
      public bool achieveDetailInfos;
      public bool achieveDetailVersion;
    }

    public SCAchieveDetailInfos() {
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
            if (field.Type == TType.Byte) {
              AchieveType = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                AchieveDetailInfos = new List<AchieveDetailInfo>();
                TList _list4 = iprot.ReadListBegin();
                for( int _i5 = 0; _i5 < _list4.Count; ++_i5)
                {
                  AchieveDetailInfo _elem6 = new AchieveDetailInfo();
                  _elem6 = new AchieveDetailInfo();
                  _elem6.Read(iprot);
                  AchieveDetailInfos.Add(_elem6);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              AchieveDetailVersion = iprot.ReadI32();
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
