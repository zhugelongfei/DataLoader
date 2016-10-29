/**
 * Autogenerated by Thrift Compiler (0.9.3)
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

namespace ThriftStruct
{

  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class ActivityLevelArray : TBase
  {
    private List<ActivityLevel> _valueList;

    public List<ActivityLevel> ValueList
    {
      get
      {
        return _valueList;
      }
      set
      {
        __isset.valueList = true;
        this._valueList = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool valueList;
    }

    public ActivityLevelArray() {
    }

    public void Read (TProtocol iprot)
    {
      iprot.IncrementRecursionDepth();
      try
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
                  ValueList = new List<ActivityLevel>();
                  TList _list4 = iprot.ReadListBegin();
                  for( int _i5 = 0; _i5 < _list4.Count; ++_i5)
                  {
                    ActivityLevel _elem6;
                    _elem6 = new ActivityLevel();
                    _elem6.Read(iprot);
                    ValueList.Add(_elem6);
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
      finally
      {
        iprot.DecrementRecursionDepth();
      }
    }

    public void Write(TProtocol oprot) {
      oprot.IncrementRecursionDepth();
      try
      {
        TStruct struc = new TStruct("ActivityLevelArray");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (ValueList != null && __isset.valueList) {
          field.Name = "valueList";
          field.Type = TType.List;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, ValueList.Count));
            foreach (ActivityLevel _iter7 in ValueList)
            {
              _iter7.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        oprot.WriteFieldStop();
        oprot.WriteStructEnd();
      }
      finally
      {
        oprot.DecrementRecursionDepth();
      }
    }

    public override string ToString() {
      StringBuilder __sb = new StringBuilder("ActivityLevelArray(");
      bool __first = true;
      if (ValueList != null && __isset.valueList) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ValueList: ");
        __sb.Append(ValueList);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}