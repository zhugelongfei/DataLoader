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
  public partial class RoomAction : TBase
  {
    private int _Id;
    private string _ActionName;
    private int _ActionType;
    private int _ActionSex;
    private int _ActionMessage;
    private string _ActionIconPkg;
    private int _MainAction;
    private int _TargetAction;
    private int _DefaultOpen;
    private int _ActionShow;
    private int _UnlockType;
    private int _TriggerScene;
    private int _Limit;
    private int _MoneyType;
    private int _MoneyCost;
    private string _UnlockMessage;

    public int Id
    {
      get
      {
        return _Id;
      }
      set
      {
        __isset.Id = true;
        this._Id = value;
      }
    }

    public string ActionName
    {
      get
      {
        return _ActionName;
      }
      set
      {
        __isset.ActionName = true;
        this._ActionName = value;
      }
    }

    public int ActionType
    {
      get
      {
        return _ActionType;
      }
      set
      {
        __isset.ActionType = true;
        this._ActionType = value;
      }
    }

    public int ActionSex
    {
      get
      {
        return _ActionSex;
      }
      set
      {
        __isset.ActionSex = true;
        this._ActionSex = value;
      }
    }

    public int ActionMessage
    {
      get
      {
        return _ActionMessage;
      }
      set
      {
        __isset.ActionMessage = true;
        this._ActionMessage = value;
      }
    }

    public string ActionIconPkg
    {
      get
      {
        return _ActionIconPkg;
      }
      set
      {
        __isset.ActionIconPkg = true;
        this._ActionIconPkg = value;
      }
    }

    public int MainAction
    {
      get
      {
        return _MainAction;
      }
      set
      {
        __isset.MainAction = true;
        this._MainAction = value;
      }
    }

    public int TargetAction
    {
      get
      {
        return _TargetAction;
      }
      set
      {
        __isset.TargetAction = true;
        this._TargetAction = value;
      }
    }

    public int DefaultOpen
    {
      get
      {
        return _DefaultOpen;
      }
      set
      {
        __isset.DefaultOpen = true;
        this._DefaultOpen = value;
      }
    }

    public int ActionShow
    {
      get
      {
        return _ActionShow;
      }
      set
      {
        __isset.ActionShow = true;
        this._ActionShow = value;
      }
    }

    public int UnlockType
    {
      get
      {
        return _UnlockType;
      }
      set
      {
        __isset.UnlockType = true;
        this._UnlockType = value;
      }
    }

    public int TriggerScene
    {
      get
      {
        return _TriggerScene;
      }
      set
      {
        __isset.TriggerScene = true;
        this._TriggerScene = value;
      }
    }

    public int Limit
    {
      get
      {
        return _Limit;
      }
      set
      {
        __isset.Limit = true;
        this._Limit = value;
      }
    }

    public int MoneyType
    {
      get
      {
        return _MoneyType;
      }
      set
      {
        __isset.MoneyType = true;
        this._MoneyType = value;
      }
    }

    public int MoneyCost
    {
      get
      {
        return _MoneyCost;
      }
      set
      {
        __isset.MoneyCost = true;
        this._MoneyCost = value;
      }
    }

    public string UnlockMessage
    {
      get
      {
        return _UnlockMessage;
      }
      set
      {
        __isset.UnlockMessage = true;
        this._UnlockMessage = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool Id;
      public bool ActionName;
      public bool ActionType;
      public bool ActionSex;
      public bool ActionMessage;
      public bool ActionIconPkg;
      public bool MainAction;
      public bool TargetAction;
      public bool DefaultOpen;
      public bool ActionShow;
      public bool UnlockType;
      public bool TriggerScene;
      public bool Limit;
      public bool MoneyType;
      public bool MoneyCost;
      public bool UnlockMessage;
    }

    public RoomAction() {
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
                Id = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.String) {
                ActionName = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.I32) {
                ActionType = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.I32) {
                ActionSex = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.I32) {
                ActionMessage = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.String) {
                ActionIconPkg = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.I32) {
                MainAction = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 8:
              if (field.Type == TType.I32) {
                TargetAction = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 9:
              if (field.Type == TType.I32) {
                DefaultOpen = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 10:
              if (field.Type == TType.I32) {
                ActionShow = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 11:
              if (field.Type == TType.I32) {
                UnlockType = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 12:
              if (field.Type == TType.I32) {
                TriggerScene = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 13:
              if (field.Type == TType.I32) {
                Limit = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 14:
              if (field.Type == TType.I32) {
                MoneyType = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 15:
              if (field.Type == TType.I32) {
                MoneyCost = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 16:
              if (field.Type == TType.String) {
                UnlockMessage = iprot.ReadString();
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
        TStruct struc = new TStruct("RoomAction");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (__isset.Id) {
          field.Name = "Id";
          field.Type = TType.I32;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(Id);
          oprot.WriteFieldEnd();
        }
        if (ActionName != null && __isset.ActionName) {
          field.Name = "ActionName";
          field.Type = TType.String;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(ActionName);
          oprot.WriteFieldEnd();
        }
        if (__isset.ActionType) {
          field.Name = "ActionType";
          field.Type = TType.I32;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(ActionType);
          oprot.WriteFieldEnd();
        }
        if (__isset.ActionSex) {
          field.Name = "ActionSex";
          field.Type = TType.I32;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(ActionSex);
          oprot.WriteFieldEnd();
        }
        if (__isset.ActionMessage) {
          field.Name = "ActionMessage";
          field.Type = TType.I32;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(ActionMessage);
          oprot.WriteFieldEnd();
        }
        if (ActionIconPkg != null && __isset.ActionIconPkg) {
          field.Name = "ActionIconPkg";
          field.Type = TType.String;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(ActionIconPkg);
          oprot.WriteFieldEnd();
        }
        if (__isset.MainAction) {
          field.Name = "MainAction";
          field.Type = TType.I32;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(MainAction);
          oprot.WriteFieldEnd();
        }
        if (__isset.TargetAction) {
          field.Name = "TargetAction";
          field.Type = TType.I32;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(TargetAction);
          oprot.WriteFieldEnd();
        }
        if (__isset.DefaultOpen) {
          field.Name = "DefaultOpen";
          field.Type = TType.I32;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(DefaultOpen);
          oprot.WriteFieldEnd();
        }
        if (__isset.ActionShow) {
          field.Name = "ActionShow";
          field.Type = TType.I32;
          field.ID = 10;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(ActionShow);
          oprot.WriteFieldEnd();
        }
        if (__isset.UnlockType) {
          field.Name = "UnlockType";
          field.Type = TType.I32;
          field.ID = 11;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(UnlockType);
          oprot.WriteFieldEnd();
        }
        if (__isset.TriggerScene) {
          field.Name = "TriggerScene";
          field.Type = TType.I32;
          field.ID = 12;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(TriggerScene);
          oprot.WriteFieldEnd();
        }
        if (__isset.Limit) {
          field.Name = "Limit";
          field.Type = TType.I32;
          field.ID = 13;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(Limit);
          oprot.WriteFieldEnd();
        }
        if (__isset.MoneyType) {
          field.Name = "MoneyType";
          field.Type = TType.I32;
          field.ID = 14;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(MoneyType);
          oprot.WriteFieldEnd();
        }
        if (__isset.MoneyCost) {
          field.Name = "MoneyCost";
          field.Type = TType.I32;
          field.ID = 15;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(MoneyCost);
          oprot.WriteFieldEnd();
        }
        if (UnlockMessage != null && __isset.UnlockMessage) {
          field.Name = "UnlockMessage";
          field.Type = TType.String;
          field.ID = 16;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(UnlockMessage);
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
      StringBuilder __sb = new StringBuilder("RoomAction(");
      bool __first = true;
      if (__isset.Id) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Id: ");
        __sb.Append(Id);
      }
      if (ActionName != null && __isset.ActionName) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ActionName: ");
        __sb.Append(ActionName);
      }
      if (__isset.ActionType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ActionType: ");
        __sb.Append(ActionType);
      }
      if (__isset.ActionSex) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ActionSex: ");
        __sb.Append(ActionSex);
      }
      if (__isset.ActionMessage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ActionMessage: ");
        __sb.Append(ActionMessage);
      }
      if (ActionIconPkg != null && __isset.ActionIconPkg) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ActionIconPkg: ");
        __sb.Append(ActionIconPkg);
      }
      if (__isset.MainAction) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("MainAction: ");
        __sb.Append(MainAction);
      }
      if (__isset.TargetAction) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("TargetAction: ");
        __sb.Append(TargetAction);
      }
      if (__isset.DefaultOpen) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("DefaultOpen: ");
        __sb.Append(DefaultOpen);
      }
      if (__isset.ActionShow) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ActionShow: ");
        __sb.Append(ActionShow);
      }
      if (__isset.UnlockType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UnlockType: ");
        __sb.Append(UnlockType);
      }
      if (__isset.TriggerScene) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("TriggerScene: ");
        __sb.Append(TriggerScene);
      }
      if (__isset.Limit) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Limit: ");
        __sb.Append(Limit);
      }
      if (__isset.MoneyType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("MoneyType: ");
        __sb.Append(MoneyType);
      }
      if (__isset.MoneyCost) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("MoneyCost: ");
        __sb.Append(MoneyCost);
      }
      if (UnlockMessage != null && __isset.UnlockMessage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UnlockMessage: ");
        __sb.Append(UnlockMessage);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}