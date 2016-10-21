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
  public partial class SCUserCharListMsg : TBase
  {
    private long _bindCharId;
    private List<MusicCodec.SimpleBusinessCardInfo> _charList;

    public long BindCharId
    {
      get
      {
        return _bindCharId;
      }
      set
      {
        __isset.bindCharId = true;
        this._bindCharId = value;
      }
    }

    public List<MusicCodec.SimpleBusinessCardInfo> CharList
    {
      get
      {
        return _charList;
      }
      set
      {
        __isset.charList = true;
        this._charList = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool bindCharId;
      public bool charList;
    }

    public SCUserCharListMsg() {
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
              BindCharId = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                CharList = new List<MusicCodec.SimpleBusinessCardInfo>();
                TList _list0 = iprot.ReadListBegin();
                for( int _i1 = 0; _i1 < _list0.Count; ++_i1)
                {
                  MusicCodec.SimpleBusinessCardInfo _elem2 = new MusicCodec.SimpleBusinessCardInfo();
                  _elem2 = new MusicCodec.SimpleBusinessCardInfo();
                  _elem2.Read(iprot);
                  CharList.Add(_elem2);
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
ClientLog.Instance.LogError("This function is deleted.");
}

    


  }

}
