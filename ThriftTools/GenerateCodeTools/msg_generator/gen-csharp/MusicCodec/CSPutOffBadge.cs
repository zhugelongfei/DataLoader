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
  /// ж�»���
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSPutOffBadge : TBase
  {
    private short _position;

    /// <summary>
    /// ������λ
    /// </summary>
    public short Position
    {
      get
      {
        return _position;
      }
      set
      {
        __isset.position = true;
        this._position = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool position;
    }

    public CSPutOffBadge() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSPutOffBadge");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.position) {
        field.Name = "position";
        field.Type = TType.I16;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(Position);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}