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
  public partial class SCGuildMemListResultMsg : TBase
  {
    private long _guildId;
    private int _startIndex;
    private short _count;
    private List<MusicCodec.GuildMemInfo> _memList;
    private short _totalCount;

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

    public int StartIndex
    {
      get
      {
        return _startIndex;
      }
      set
      {
        __isset.startIndex = true;
        this._startIndex = value;
      }
    }

    public short Count
    {
      get
      {
        return _count;
      }
      set
      {
        __isset.count = true;
        this._count = value;
      }
    }

    public List<MusicCodec.GuildMemInfo> MemList
    {
      get
      {
        return _memList;
      }
      set
      {
        __isset.memList = true;
        this._memList = value;
      }
    }

    public short TotalCount
    {
      get
      {
        return _totalCount;
      }
      set
      {
        __isset.totalCount = true;
        this._totalCount = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool guildId;
      public bool startIndex;
      public bool count;
      public bool memList;
      public bool totalCount;
    }

    public SCGuildMemListResultMsg() {
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
              GuildId = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              StartIndex = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I16) {
              Count = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.List) {
              {
                MemList = new List<MusicCodec.GuildMemInfo>();
                TList _list4 = iprot.ReadListBegin();
                for( int _i5 = 0; _i5 < _list4.Count; ++_i5)
                {
                  MusicCodec.GuildMemInfo _elem6 = new MusicCodec.GuildMemInfo();
                  _elem6 = new MusicCodec.GuildMemInfo();
                  _elem6.Read(iprot);
                  MemList.Add(_elem6);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I16) {
              TotalCount = iprot.ReadI16();
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
