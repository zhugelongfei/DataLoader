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
  public partial class SCSignInAwardsMsg : TBase
  {
    private List<ConmmonSignInAward> _commonAwards;
    private List<CollectiveSignInAward> _collectiveAwards;

    public List<ConmmonSignInAward> CommonAwards
    {
      get
      {
        return _commonAwards;
      }
      set
      {
        __isset.commonAwards = true;
        this._commonAwards = value;
      }
    }

    public List<CollectiveSignInAward> CollectiveAwards
    {
      get
      {
        return _collectiveAwards;
      }
      set
      {
        __isset.collectiveAwards = true;
        this._collectiveAwards = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool commonAwards;
      public bool collectiveAwards;
    }

    public SCSignInAwardsMsg() {
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
          case 2:
            if (field.Type == TType.List) {
              {
                CommonAwards = new List<ConmmonSignInAward>();
                TList _list16 = iprot.ReadListBegin();
                for( int _i17 = 0; _i17 < _list16.Count; ++_i17)
                {
                  ConmmonSignInAward _elem18 = new ConmmonSignInAward();
                  _elem18 = new ConmmonSignInAward();
                  _elem18.Read(iprot);
                  CommonAwards.Add(_elem18);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.List) {
              {
                CollectiveAwards = new List<CollectiveSignInAward>();
                TList _list19 = iprot.ReadListBegin();
                for( int _i20 = 0; _i20 < _list19.Count; ++_i20)
                {
                  CollectiveSignInAward _elem21 = new CollectiveSignInAward();
                  _elem21 = new CollectiveSignInAward();
                  _elem21.Read(iprot);
                  CollectiveAwards.Add(_elem21);
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
