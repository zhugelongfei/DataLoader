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
  public partial class SCLimitSaleActivityMsg : TBase
  {
    private List<MusicCodec.LimitSaleActivity> _limitSaleActivity;

    public List<MusicCodec.LimitSaleActivity> LimitSaleActivity
    {
      get
      {
        return _limitSaleActivity;
      }
      set
      {
        __isset.limitSaleActivity = true;
        this._limitSaleActivity = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool limitSaleActivity;
    }

    public SCLimitSaleActivityMsg() {
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
                LimitSaleActivity = new List<MusicCodec.LimitSaleActivity>();
                TList _list28 = iprot.ReadListBegin();
                for( int _i29 = 0; _i29 < _list28.Count; ++_i29)
                {
                  MusicCodec.LimitSaleActivity _elem30 = new MusicCodec.LimitSaleActivity();
                  _elem30 = new MusicCodec.LimitSaleActivity();
                  _elem30.Read(iprot);
                  LimitSaleActivity.Add(_elem30);
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
