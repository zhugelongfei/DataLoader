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

  /// <summary>
  /// Autogenerated by program
  /// 
  /// Autho ZhuGeLongFei
  /// 
  /// Do not edit unless you are sure that you know what you are doning
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class ActivityLevel : TBase
  {
    private int _Level;
    private int _Exp;
    private int _ActivityNormalShopSale;
    private int _ActivityAddDanceReward;
    private int _VipPriceSale;
    private List<int> _VActivityRightDesc;

    public int Level
    {
      get
      {
        return _Level;
      }
      set
      {
        __isset.Level = true;
        this._Level = value;
      }
    }

    public int Exp
    {
      get
      {
        return _Exp;
      }
      set
      {
        __isset.Exp = true;
        this._Exp = value;
      }
    }

    public int ActivityNormalShopSale
    {
      get
      {
        return _ActivityNormalShopSale;
      }
      set
      {
        __isset.ActivityNormalShopSale = true;
        this._ActivityNormalShopSale = value;
      }
    }

    public int ActivityAddDanceReward
    {
      get
      {
        return _ActivityAddDanceReward;
      }
      set
      {
        __isset.ActivityAddDanceReward = true;
        this._ActivityAddDanceReward = value;
      }
    }

    public int VipPriceSale
    {
      get
      {
        return _VipPriceSale;
      }
      set
      {
        __isset.VipPriceSale = true;
        this._VipPriceSale = value;
      }
    }

    public List<int> VActivityRightDesc
    {
      get
      {
        return _VActivityRightDesc;
      }
      set
      {
        __isset.VActivityRightDesc = true;
        this._VActivityRightDesc = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool Level;
      public bool Exp;
      public bool ActivityNormalShopSale;
      public bool ActivityAddDanceReward;
      public bool VipPriceSale;
      public bool VActivityRightDesc;
    }

    public ActivityLevel() {
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
              if (field.Type == TType.I32) {
                Level = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I32) {
                Exp = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.I32) {
                ActivityNormalShopSale = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.I32) {
                ActivityAddDanceReward = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.I32) {
                VipPriceSale = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.List) {
                {
                  VActivityRightDesc = new List<int>();
                  TList _list0 = iprot.ReadListBegin();
                  for( int _i1 = 0; _i1 < _list0.Count; ++_i1)
                  {
                    int _elem2;
                    _elem2 = iprot.ReadI32();
                    VActivityRightDesc.Add(_elem2);
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
        TStruct struc = new TStruct("ActivityLevel");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (__isset.Level) {
          field.Name = "Level";
          field.Type = TType.I32;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(Level);
          oprot.WriteFieldEnd();
        }
        if (__isset.Exp) {
          field.Name = "Exp";
          field.Type = TType.I32;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(Exp);
          oprot.WriteFieldEnd();
        }
        if (__isset.ActivityNormalShopSale) {
          field.Name = "ActivityNormalShopSale";
          field.Type = TType.I32;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(ActivityNormalShopSale);
          oprot.WriteFieldEnd();
        }
        if (__isset.ActivityAddDanceReward) {
          field.Name = "ActivityAddDanceReward";
          field.Type = TType.I32;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(ActivityAddDanceReward);
          oprot.WriteFieldEnd();
        }
        if (__isset.VipPriceSale) {
          field.Name = "VipPriceSale";
          field.Type = TType.I32;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(VipPriceSale);
          oprot.WriteFieldEnd();
        }
        if (VActivityRightDesc != null && __isset.VActivityRightDesc) {
          field.Name = "VActivityRightDesc";
          field.Type = TType.List;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.I32, VActivityRightDesc.Count));
            foreach (int _iter3 in VActivityRightDesc)
            {
              oprot.WriteI32(_iter3);
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
      StringBuilder __sb = new StringBuilder("ActivityLevel(");
      bool __first = true;
      if (__isset.Level) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Level: ");
        __sb.Append(Level);
      }
      if (__isset.Exp) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Exp: ");
        __sb.Append(Exp);
      }
      if (__isset.ActivityNormalShopSale) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ActivityNormalShopSale: ");
        __sb.Append(ActivityNormalShopSale);
      }
      if (__isset.ActivityAddDanceReward) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ActivityAddDanceReward: ");
        __sb.Append(ActivityAddDanceReward);
      }
      if (__isset.VipPriceSale) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("VipPriceSale: ");
        __sb.Append(VipPriceSale);
      }
      if (VActivityRightDesc != null && __isset.VActivityRightDesc) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("VActivityRightDesc: ");
        __sb.Append(VActivityRightDesc);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
