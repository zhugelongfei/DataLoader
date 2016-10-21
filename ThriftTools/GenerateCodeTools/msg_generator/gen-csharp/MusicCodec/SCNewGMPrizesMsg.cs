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
  public partial class SCNewGMPrizesMsg : TBase
  {
    private List<MusicCodec.PrizeFieldInfo> _prizeFieldInfos;

    public List<MusicCodec.PrizeFieldInfo> PrizeFieldInfos
    {
      get
      {
        return _prizeFieldInfos;
      }
      set
      {
        __isset.prizeFieldInfos = true;
        this._prizeFieldInfos = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool prizeFieldInfos;
    }

    public SCNewGMPrizesMsg() {
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
                PrizeFieldInfos = new List<MusicCodec.PrizeFieldInfo>();
                TList _list0 = iprot.ReadListBegin();
                for( int _i1 = 0; _i1 < _list0.Count; ++_i1)
                {
                  MusicCodec.PrizeFieldInfo _elem2 = new MusicCodec.PrizeFieldInfo();
                  _elem2 = new MusicCodec.PrizeFieldInfo();
                  _elem2.Read(iprot);
                  PrizeFieldInfos.Add(_elem2);
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
