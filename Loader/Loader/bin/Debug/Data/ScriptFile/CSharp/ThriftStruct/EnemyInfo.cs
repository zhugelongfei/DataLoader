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
  /// <para>Autho ZhuGeLongFei</para>
  /// 
  /// <para>Do not edit unless you are sure that you know what you are doning</para>
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class EnemyInfo : TBase
  {
    private int _ID;
    private string _Name;
    private int _Type;
    private int _ResId;
    private int _AttackRange;
    private int _MaxBlood;
    private int _Damage;
    private int _Defence;

    /// <summary>
    /// Id
    /// </summary>
    public int ID
    {
      get
      {
        return _ID;
      }
      set
      {
        __isset.ID = true;
        this._ID = value;
      }
    }

    /// <summary>
    /// 怪物名称
    /// </summary>
    public string Name
    {
      get
      {
        return _Name;
      }
      set
      {
        __isset.Name = true;
        this._Name = value;
      }
    }

    /// <summary>
    /// 类型
    /// </summary>
    public int Type
    {
      get
      {
        return _Type;
      }
      set
      {
        __isset.Type = true;
        this._Type = value;
      }
    }

    /// <summary>
    /// 资源id
    /// </summary>
    public int ResId
    {
      get
      {
        return _ResId;
      }
      set
      {
        __isset.ResId = true;
        this._ResId = value;
      }
    }

    /// <summary>
    /// 攻击范围
    /// </summary>
    public int AttackRange
    {
      get
      {
        return _AttackRange;
      }
      set
      {
        __isset.AttackRange = true;
        this._AttackRange = value;
      }
    }

    /// <summary>
    /// 最大血量
    /// </summary>
    public int MaxBlood
    {
      get
      {
        return _MaxBlood;
      }
      set
      {
        __isset.MaxBlood = true;
        this._MaxBlood = value;
      }
    }

    /// <summary>
    /// 攻击力
    /// </summary>
    public int Damage
    {
      get
      {
        return _Damage;
      }
      set
      {
        __isset.Damage = true;
        this._Damage = value;
      }
    }

    /// <summary>
    /// 防御力
    /// </summary>
    public int Defence
    {
      get
      {
        return _Defence;
      }
      set
      {
        __isset.Defence = true;
        this._Defence = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool ID;
      public bool Name;
      public bool Type;
      public bool ResId;
      public bool AttackRange;
      public bool MaxBlood;
      public bool Damage;
      public bool Defence;
    }

    public EnemyInfo() {
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
                ID = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.String) {
                Name = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.I32) {
                Type = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.I32) {
                ResId = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.I32) {
                AttackRange = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.I32) {
                MaxBlood = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.I32) {
                Damage = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 8:
              if (field.Type == TType.I32) {
                Defence = iprot.ReadI32();
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
        TStruct struc = new TStruct("EnemyInfo");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (__isset.ID) {
          field.Name = "ID";
          field.Type = TType.I32;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(ID);
          oprot.WriteFieldEnd();
        }
        if (Name != null && __isset.Name) {
          field.Name = "Name";
          field.Type = TType.String;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Name);
          oprot.WriteFieldEnd();
        }
        if (__isset.Type) {
          field.Name = "Type";
          field.Type = TType.I32;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(Type);
          oprot.WriteFieldEnd();
        }
        if (__isset.ResId) {
          field.Name = "ResId";
          field.Type = TType.I32;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(ResId);
          oprot.WriteFieldEnd();
        }
        if (__isset.AttackRange) {
          field.Name = "AttackRange";
          field.Type = TType.I32;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(AttackRange);
          oprot.WriteFieldEnd();
        }
        if (__isset.MaxBlood) {
          field.Name = "MaxBlood";
          field.Type = TType.I32;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(MaxBlood);
          oprot.WriteFieldEnd();
        }
        if (__isset.Damage) {
          field.Name = "Damage";
          field.Type = TType.I32;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(Damage);
          oprot.WriteFieldEnd();
        }
        if (__isset.Defence) {
          field.Name = "Defence";
          field.Type = TType.I32;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(Defence);
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
      StringBuilder __sb = new StringBuilder("EnemyInfo(");
      bool __first = true;
      if (__isset.ID) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ID: ");
        __sb.Append(ID);
      }
      if (Name != null && __isset.Name) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Name: ");
        __sb.Append(Name);
      }
      if (__isset.Type) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Type: ");
        __sb.Append(Type);
      }
      if (__isset.ResId) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ResId: ");
        __sb.Append(ResId);
      }
      if (__isset.AttackRange) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AttackRange: ");
        __sb.Append(AttackRange);
      }
      if (__isset.MaxBlood) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("MaxBlood: ");
        __sb.Append(MaxBlood);
      }
      if (__isset.Damage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Damage: ");
        __sb.Append(Damage);
      }
      if (__isset.Defence) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Defence: ");
        __sb.Append(Defence);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
