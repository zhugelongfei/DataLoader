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
  public partial class ComposeActivityDetailInfo : TBase
  {
    private short _activityId;
    private List<ComposeActivityDetail> _acitivityDetails;

    public short ActivityId
    {
      get
      {
        return _activityId;
      }
      set
      {
        __isset.activityId = true;
        this._activityId = value;
      }
    }

    public List<ComposeActivityDetail> AcitivityDetails
    {
      get
      {
        return _acitivityDetails;
      }
      set
      {
        __isset.acitivityDetails = true;
        this._acitivityDetails = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool activityId;
      public bool acitivityDetails;
    }

    public ComposeActivityDetailInfo() {
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
            if (field.Type == TType.I16) {
              ActivityId = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                AcitivityDetails = new List<ComposeActivityDetail>();
                TList _list265 = iprot.ReadListBegin();
                for( int _i266 = 0; _i266 < _list265.Count; ++_i266)
                {
                  ComposeActivityDetail _elem267 = new ComposeActivityDetail();
                  _elem267 = new ComposeActivityDetail();
                  _elem267.Read(iprot);
                  AcitivityDetails.Add(_elem267);
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
      TStruct struc = new TStruct("ComposeActivityDetailInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.activityId) {
        field.Name = "activityId";
        field.Type = TType.I16;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(ActivityId);
        oprot.WriteFieldEnd();
      }
      if (AcitivityDetails != null && __isset.acitivityDetails) {
        field.Name = "acitivityDetails";
        field.Type = TType.List;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, AcitivityDetails.Count));
          foreach (ComposeActivityDetail _iter268 in AcitivityDetails)
          {
            _iter268.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("ComposeActivityDetailInfo(");
      sb.Append("ActivityId: ");
      sb.Append(ActivityId);
      sb.Append(",AcitivityDetails: ");
      sb.Append(AcitivityDetails);
      sb.Append(")");
      return sb.ToString();
    }

  }

}