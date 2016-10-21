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
  public partial class SCSyncTeamInfoMsg : TBase
  {
    private List<MusicCodec.TeamInfo> _teams;

    public List<MusicCodec.TeamInfo> Teams
    {
      get
      {
        return _teams;
      }
      set
      {
        __isset.teams = true;
        this._teams = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool teams;
    }

    public SCSyncTeamInfoMsg() {
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
                Teams = new List<MusicCodec.TeamInfo>();
                TList _list61 = iprot.ReadListBegin();
                for( int _i62 = 0; _i62 < _list61.Count; ++_i62)
                {
                  MusicCodec.TeamInfo _elem63 = new MusicCodec.TeamInfo();
                  _elem63 = new MusicCodec.TeamInfo();
                  _elem63.Read(iprot);
                  Teams.Add(_elem63);
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
