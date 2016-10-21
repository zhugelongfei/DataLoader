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

  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCGuildLevelUpMsg : TBase
  {
    private byte _sourceLevel;
    private byte _currentLevel;

    public byte SourceLevel
    {
      get
      {
        return _sourceLevel;
      }
      set
      {
        __isset.sourceLevel = true;
        this._sourceLevel = value;
      }
    }

    public byte CurrentLevel
    {
      get
      {
        return _currentLevel;
      }
      set
      {
        __isset.currentLevel = true;
        this._currentLevel = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool sourceLevel;
      public bool currentLevel;
    }

    public SCGuildLevelUpMsg() {
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
              SourceLevel = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Byte) {
              CurrentLevel = iprot.ReadByte();
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
