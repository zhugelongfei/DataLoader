/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "RoomAction_types.h"

#include <algorithm>
#include <ostream>

#include <thrift/TToString.h>

namespace ThriftStruct {


RoomAction::~RoomAction() throw() {
}


void RoomAction::__set_Id(const int32_t val) {
  this->Id = val;
}

void RoomAction::__set_ActionName(const std::string& val) {
  this->ActionName = val;
}

void RoomAction::__set_ActionType(const int32_t val) {
  this->ActionType = val;
}

void RoomAction::__set_ActionSex(const int32_t val) {
  this->ActionSex = val;
}

void RoomAction::__set_ActionMessage(const int32_t val) {
  this->ActionMessage = val;
}

void RoomAction::__set_ActionIconPkg(const std::string& val) {
  this->ActionIconPkg = val;
}

void RoomAction::__set_MainAction(const int32_t val) {
  this->MainAction = val;
}

void RoomAction::__set_TargetAction(const int32_t val) {
  this->TargetAction = val;
}

void RoomAction::__set_DefaultOpen(const int32_t val) {
  this->DefaultOpen = val;
}

void RoomAction::__set_ActionShow(const int32_t val) {
  this->ActionShow = val;
}

void RoomAction::__set_UnlockType(const int32_t val) {
  this->UnlockType = val;
}

void RoomAction::__set_TriggerScene(const int32_t val) {
  this->TriggerScene = val;
}

void RoomAction::__set_Limit(const int32_t val) {
  this->Limit = val;
}

void RoomAction::__set_MoneyType(const int32_t val) {
  this->MoneyType = val;
}

void RoomAction::__set_MoneyCost(const int32_t val) {
  this->MoneyCost = val;
}

void RoomAction::__set_UnlockMessage(const std::string& val) {
  this->UnlockMessage = val;
}

uint32_t RoomAction::read(::apache::thrift::protocol::TProtocol* iprot) {

  apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;


  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->Id);
          this->__isset.Id = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->ActionName);
          this->__isset.ActionName = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->ActionType);
          this->__isset.ActionType = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->ActionSex);
          this->__isset.ActionSex = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 5:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->ActionMessage);
          this->__isset.ActionMessage = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 6:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->ActionIconPkg);
          this->__isset.ActionIconPkg = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 7:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->MainAction);
          this->__isset.MainAction = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 8:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->TargetAction);
          this->__isset.TargetAction = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 9:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->DefaultOpen);
          this->__isset.DefaultOpen = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 10:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->ActionShow);
          this->__isset.ActionShow = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 11:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->UnlockType);
          this->__isset.UnlockType = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 12:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->TriggerScene);
          this->__isset.TriggerScene = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 13:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->Limit);
          this->__isset.Limit = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 14:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->MoneyType);
          this->__isset.MoneyType = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 15:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->MoneyCost);
          this->__isset.MoneyCost = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 16:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->UnlockMessage);
          this->__isset.UnlockMessage = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  return xfer;
}

uint32_t RoomAction::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("RoomAction");

  xfer += oprot->writeFieldBegin("Id", ::apache::thrift::protocol::T_I32, 1);
  xfer += oprot->writeI32(this->Id);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("ActionName", ::apache::thrift::protocol::T_STRING, 2);
  xfer += oprot->writeString(this->ActionName);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("ActionType", ::apache::thrift::protocol::T_I32, 3);
  xfer += oprot->writeI32(this->ActionType);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("ActionSex", ::apache::thrift::protocol::T_I32, 4);
  xfer += oprot->writeI32(this->ActionSex);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("ActionMessage", ::apache::thrift::protocol::T_I32, 5);
  xfer += oprot->writeI32(this->ActionMessage);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("ActionIconPkg", ::apache::thrift::protocol::T_STRING, 6);
  xfer += oprot->writeString(this->ActionIconPkg);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("MainAction", ::apache::thrift::protocol::T_I32, 7);
  xfer += oprot->writeI32(this->MainAction);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("TargetAction", ::apache::thrift::protocol::T_I32, 8);
  xfer += oprot->writeI32(this->TargetAction);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("DefaultOpen", ::apache::thrift::protocol::T_I32, 9);
  xfer += oprot->writeI32(this->DefaultOpen);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("ActionShow", ::apache::thrift::protocol::T_I32, 10);
  xfer += oprot->writeI32(this->ActionShow);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("UnlockType", ::apache::thrift::protocol::T_I32, 11);
  xfer += oprot->writeI32(this->UnlockType);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("TriggerScene", ::apache::thrift::protocol::T_I32, 12);
  xfer += oprot->writeI32(this->TriggerScene);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("Limit", ::apache::thrift::protocol::T_I32, 13);
  xfer += oprot->writeI32(this->Limit);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("MoneyType", ::apache::thrift::protocol::T_I32, 14);
  xfer += oprot->writeI32(this->MoneyType);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("MoneyCost", ::apache::thrift::protocol::T_I32, 15);
  xfer += oprot->writeI32(this->MoneyCost);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("UnlockMessage", ::apache::thrift::protocol::T_STRING, 16);
  xfer += oprot->writeString(this->UnlockMessage);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(RoomAction &a, RoomAction &b) {
  using ::std::swap;
  swap(a.Id, b.Id);
  swap(a.ActionName, b.ActionName);
  swap(a.ActionType, b.ActionType);
  swap(a.ActionSex, b.ActionSex);
  swap(a.ActionMessage, b.ActionMessage);
  swap(a.ActionIconPkg, b.ActionIconPkg);
  swap(a.MainAction, b.MainAction);
  swap(a.TargetAction, b.TargetAction);
  swap(a.DefaultOpen, b.DefaultOpen);
  swap(a.ActionShow, b.ActionShow);
  swap(a.UnlockType, b.UnlockType);
  swap(a.TriggerScene, b.TriggerScene);
  swap(a.Limit, b.Limit);
  swap(a.MoneyType, b.MoneyType);
  swap(a.MoneyCost, b.MoneyCost);
  swap(a.UnlockMessage, b.UnlockMessage);
  swap(a.__isset, b.__isset);
}

RoomAction::RoomAction(const RoomAction& other0) {
  Id = other0.Id;
  ActionName = other0.ActionName;
  ActionType = other0.ActionType;
  ActionSex = other0.ActionSex;
  ActionMessage = other0.ActionMessage;
  ActionIconPkg = other0.ActionIconPkg;
  MainAction = other0.MainAction;
  TargetAction = other0.TargetAction;
  DefaultOpen = other0.DefaultOpen;
  ActionShow = other0.ActionShow;
  UnlockType = other0.UnlockType;
  TriggerScene = other0.TriggerScene;
  Limit = other0.Limit;
  MoneyType = other0.MoneyType;
  MoneyCost = other0.MoneyCost;
  UnlockMessage = other0.UnlockMessage;
  __isset = other0.__isset;
}
RoomAction& RoomAction::operator=(const RoomAction& other1) {
  Id = other1.Id;
  ActionName = other1.ActionName;
  ActionType = other1.ActionType;
  ActionSex = other1.ActionSex;
  ActionMessage = other1.ActionMessage;
  ActionIconPkg = other1.ActionIconPkg;
  MainAction = other1.MainAction;
  TargetAction = other1.TargetAction;
  DefaultOpen = other1.DefaultOpen;
  ActionShow = other1.ActionShow;
  UnlockType = other1.UnlockType;
  TriggerScene = other1.TriggerScene;
  Limit = other1.Limit;
  MoneyType = other1.MoneyType;
  MoneyCost = other1.MoneyCost;
  UnlockMessage = other1.UnlockMessage;
  __isset = other1.__isset;
  return *this;
}
void RoomAction::printTo(std::ostream& out) const {
  using ::apache::thrift::to_string;
  out << "RoomAction(";
  out << "Id=" << to_string(Id);
  out << ", " << "ActionName=" << to_string(ActionName);
  out << ", " << "ActionType=" << to_string(ActionType);
  out << ", " << "ActionSex=" << to_string(ActionSex);
  out << ", " << "ActionMessage=" << to_string(ActionMessage);
  out << ", " << "ActionIconPkg=" << to_string(ActionIconPkg);
  out << ", " << "MainAction=" << to_string(MainAction);
  out << ", " << "TargetAction=" << to_string(TargetAction);
  out << ", " << "DefaultOpen=" << to_string(DefaultOpen);
  out << ", " << "ActionShow=" << to_string(ActionShow);
  out << ", " << "UnlockType=" << to_string(UnlockType);
  out << ", " << "TriggerScene=" << to_string(TriggerScene);
  out << ", " << "Limit=" << to_string(Limit);
  out << ", " << "MoneyType=" << to_string(MoneyType);
  out << ", " << "MoneyCost=" << to_string(MoneyCost);
  out << ", " << "UnlockMessage=" << to_string(UnlockMessage);
  out << ")";
}

} // namespace
