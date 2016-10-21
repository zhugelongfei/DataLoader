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
  public partial class SCActivityUpdateMsg : TBase
  {
    private List<MusicCodec.GMActivityType> _typeList;

    public List<MusicCodec.GMActivityType> TypeList
    {
      get
      {
        return _typeList;
      }
      set
      {
        __isset.typeList = true;
        this._typeList = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool typeList;
    }

    public SCActivityUpdateMsg() {
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
                TypeList = new List<MusicCodec.GMActivityType>();
                TList _list20 = iprot.ReadListBegin();
                for( int _i21 = 0; _i21 < _list20.Count; ++_i21)
                {
                  MusicCodec.GMActivityType _elem22 = (MusicCodec.GMActivityType)0;
                  _elem22 = (MusicCodec.GMActivityType)iprot.ReadI32();
                  TypeList.Add(_elem22);
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
