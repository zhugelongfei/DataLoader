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
  /// 所有密友信息， 只发第一个密友详细信息
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCCloseFriendInfos : TBase
  {
    private long _charId;
    private List<MusicCodec.PlayerBaseInfo> _closeFriendBaseInfos;
    private MusicCodec.CloseFriendInfo _firstCloseFriendInfo;

    /// <summary>
    /// 密友信息所属的角色id
    /// </summary>
    public long CharId
    {
      get
      {
        return _charId;
      }
      set
      {
        __isset.charId = true;
        this._charId = value;
      }
    }

    public List<MusicCodec.PlayerBaseInfo> CloseFriendBaseInfos
    {
      get
      {
        return _closeFriendBaseInfos;
      }
      set
      {
        __isset.closeFriendBaseInfos = true;
        this._closeFriendBaseInfos = value;
      }
    }

    /// <summary>
    /// 第一个密友信息
    /// </summary>
    public MusicCodec.CloseFriendInfo FirstCloseFriendInfo
    {
      get
      {
        return _firstCloseFriendInfo;
      }
      set
      {
        __isset.firstCloseFriendInfo = true;
        this._firstCloseFriendInfo = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool charId;
      public bool closeFriendBaseInfos;
      public bool firstCloseFriendInfo;
    }

    public SCCloseFriendInfos() {
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
            if (field.Type == TType.I64) {
              CharId = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                CloseFriendBaseInfos = new List<MusicCodec.PlayerBaseInfo>();
                TList _list20 = iprot.ReadListBegin();
                for( int _i21 = 0; _i21 < _list20.Count; ++_i21)
                {
                  MusicCodec.PlayerBaseInfo _elem22 = new MusicCodec.PlayerBaseInfo();
                  _elem22 = new MusicCodec.PlayerBaseInfo();
                  _elem22.Read(iprot);
                  CloseFriendBaseInfos.Add(_elem22);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Struct) {
              FirstCloseFriendInfo = new MusicCodec.CloseFriendInfo();
              FirstCloseFriendInfo.Read(iprot);
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
