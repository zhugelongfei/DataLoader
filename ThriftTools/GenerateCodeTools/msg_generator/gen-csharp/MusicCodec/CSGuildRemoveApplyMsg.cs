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
  public partial class CSGuildRemoveApplyMsg : TBase
  {
    private long _guildId;

    public long GuildId
    {
      get
      {
        return _guildId;
      }
      set
      {
        __isset.guildId = true;
        this._guildId = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool guildId;
    }

    public CSGuildRemoveApplyMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSGuildRemoveApplyMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.guildId) {
        field.Name = "guildId";
        field.Type = TType.I64;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(GuildId);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}
