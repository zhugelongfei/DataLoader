/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "Counter_types.h"

#include <algorithm>
#include <ostream>

#include <thrift/TToString.h>

namespace ThriftStruct {


Counter::~Counter() throw() {
}


void Counter::__set_ID(const int32_t val) {
  this->ID = val;
}

void Counter::__set_GameTimesIntCountID(const int32_t val) {
  this->GameTimesIntCountID = val;
}

void Counter::__set_DailyIBGiftIntCountID(const int32_t val) {
  this->DailyIBGiftIntCountID = val;
}

uint32_t Counter::read(::apache::thrift::protocol::TProtocol* iprot) {

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
          xfer += iprot->readI32(this->ID);
          this->__isset.ID = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->GameTimesIntCountID);
          this->__isset.GameTimesIntCountID = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->DailyIBGiftIntCountID);
          this->__isset.DailyIBGiftIntCountID = true;
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

uint32_t Counter::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("Counter");

  xfer += oprot->writeFieldBegin("ID", ::apache::thrift::protocol::T_I32, 1);
  xfer += oprot->writeI32(this->ID);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("GameTimesIntCountID", ::apache::thrift::protocol::T_I32, 2);
  xfer += oprot->writeI32(this->GameTimesIntCountID);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("DailyIBGiftIntCountID", ::apache::thrift::protocol::T_I32, 3);
  xfer += oprot->writeI32(this->DailyIBGiftIntCountID);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(Counter &a, Counter &b) {
  using ::std::swap;
  swap(a.ID, b.ID);
  swap(a.GameTimesIntCountID, b.GameTimesIntCountID);
  swap(a.DailyIBGiftIntCountID, b.DailyIBGiftIntCountID);
  swap(a.__isset, b.__isset);
}

Counter::Counter(const Counter& other0) {
  ID = other0.ID;
  GameTimesIntCountID = other0.GameTimesIntCountID;
  DailyIBGiftIntCountID = other0.DailyIBGiftIntCountID;
  __isset = other0.__isset;
}
Counter& Counter::operator=(const Counter& other1) {
  ID = other1.ID;
  GameTimesIntCountID = other1.GameTimesIntCountID;
  DailyIBGiftIntCountID = other1.DailyIBGiftIntCountID;
  __isset = other1.__isset;
  return *this;
}
void Counter::printTo(std::ostream& out) const {
  using ::apache::thrift::to_string;
  out << "Counter(";
  out << "ID=" << to_string(ID);
  out << ", " << "GameTimesIntCountID=" << to_string(GameTimesIntCountID);
  out << ", " << "DailyIBGiftIntCountID=" << to_string(DailyIBGiftIntCountID);
  out << ")";
}

} // namespace
