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
  /// Ѳ���赸ͨ����Ϣ
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCTourDancePassInfoMsg : TBase
  {
    private short _chapterId;
    private short _raidId;
    private MusicCodec.DanceCheerInitInfo _cheerPassInitInfo;

    /// <summary>
    /// �½�id
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
    /// �ؿ�id
    /// </summary>
    public short RaidId
    {
      get
      {
        return _raidId;
      }
      set
      {
        __isset.raidId = true;
        this._raidId = value;
      }
    }

    /// <summary>
    /// �赸����ֵͨ����Ϣ
    /// </summary>
    public MusicCodec.DanceCheerInitInfo CheerPassInitInfo
    {
      get
      {
        return _cheerPassInitInfo;
      }
      set
      {
        __isset.cheerPassInitInfo = true;
        this._cheerPassInitInfo = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool chapterId;
      public bool raidId;
      public bool cheerPassInitInfo;
    }

    public SCTourDancePassInfoMsg() {
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
          case 2:
            if (field.Type == TType.I16) {
              RaidId = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Struct) {
              CheerPassInitInfo = new MusicCodec.DanceCheerInitInfo();
              CheerPassInitInfo.Read(iprot);
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