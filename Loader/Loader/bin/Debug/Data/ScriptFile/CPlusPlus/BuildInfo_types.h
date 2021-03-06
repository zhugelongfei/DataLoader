/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef BuildInfo_TYPES_H
#define BuildInfo_TYPES_H

#include <iosfwd>

#include <thrift/Thrift.h>
#include <thrift/TApplicationException.h>
#include <thrift/protocol/TProtocol.h>
#include <thrift/transport/TTransport.h>

#include <thrift/cxxfunctional.h>


namespace ThriftStruct {

class BuildInfo;

typedef struct _BuildInfo__isset {
  _BuildInfo__isset() : ID(false), Name(false), ResId(false), SizeX(false), SizeY(false) {}
  bool ID :1;
  bool Name :1;
  bool ResId :1;
  bool SizeX :1;
  bool SizeY :1;
} _BuildInfo__isset;

class BuildInfo {
 public:

  BuildInfo(const BuildInfo&);
  BuildInfo& operator=(const BuildInfo&);
  BuildInfo() : ID(0), Name(), ResId(0), SizeX(0), SizeY(0) {
  }

  virtual ~BuildInfo() throw();
  int32_t ID;
  std::string Name;
  int32_t ResId;
  int32_t SizeX;
  int32_t SizeY;

  _BuildInfo__isset __isset;

  void __set_ID(const int32_t val);

  void __set_Name(const std::string& val);

  void __set_ResId(const int32_t val);

  void __set_SizeX(const int32_t val);

  void __set_SizeY(const int32_t val);

  bool operator == (const BuildInfo & rhs) const
  {
    if (!(ID == rhs.ID))
      return false;
    if (!(Name == rhs.Name))
      return false;
    if (!(ResId == rhs.ResId))
      return false;
    if (!(SizeX == rhs.SizeX))
      return false;
    if (!(SizeY == rhs.SizeY))
      return false;
    return true;
  }
  bool operator != (const BuildInfo &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const BuildInfo & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(BuildInfo &a, BuildInfo &b);

inline std::ostream& operator<<(std::ostream& out, const BuildInfo& obj)
{
  obj.printTo(out);
  return out;
}

} // namespace

#endif
