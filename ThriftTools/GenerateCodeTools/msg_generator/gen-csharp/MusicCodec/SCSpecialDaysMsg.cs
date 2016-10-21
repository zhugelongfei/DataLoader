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
  public partial class SCSpecialDaysMsg : TBase
  {
    private List<MusicCodec.SpecialDay> _days;
    private long _charId;

    public List<MusicCodec.SpecialDay> Days
    {
      get
      {
        return _days;
      }
      set
      {
        __isset.days = true;
        this._days = value;
      }
    }

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


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool days;
      public bool charId;
    }

    public SCSpecialDaysMsg() {
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
                Days = new List<MusicCodec.SpecialDay>();
                TList _list60 = iprot.ReadListBegin();
                for( int _i61 = 0; _i61 < _list60.Count; ++_i61)
                {
                  MusicCodec.SpecialDay _elem62 = new MusicCodec.SpecialDay();
                  _elem62 = new MusicCodec.SpecialDay();
                  _elem62.Read(iprot);
                  Days.Add(_elem62);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I64) {
              CharId = iprot.ReadI64();
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
