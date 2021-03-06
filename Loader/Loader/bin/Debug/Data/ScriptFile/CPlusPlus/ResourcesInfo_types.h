/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef ResourcesInfo_TYPES_H
#define ResourcesInfo_TYPES_H

#include <iosfwd>

#include <thrift/Thrift.h>
#include <thrift/TApplicationException.h>
#include <thrift/protocol/TProtocol.h>
#include <thrift/transport/TTransport.h>

#include <thrift/cxxfunctional.h>


namespace ThriftStruct {

class ResourcesInfo;

typedef struct _ResourcesInfo__isset {
  _ResourcesInfo__isset() : ID(false), Name(false), ResPath(false) {}
  bool ID :1;
  bool Name :1;
  bool ResPath :1;
} _ResourcesInfo__isset;

class ResourcesInfo {
 public:

  ResourcesInfo(const ResourcesInfo&);
  ResourcesInfo& operator=(const ResourcesInfo&);
  ResourcesInfo() : ID(0), Name(), ResPath() {
  }

  virtual ~ResourcesInfo() throw();
  int32_t ID;
  std::string Name;
  std::string ResPath;

  _ResourcesInfo__isset __isset;

  void __set_ID(const int32_t val);

  void __set_Name(const std::string& val);

  void __set_ResPath(const std::string& val);

  bool operator == (const ResourcesInfo & rhs) const
  {
    if (!(ID == rhs.ID))
      return false;
    if (!(Name == rhs.Name))
      return false;
    if (!(ResPath == rhs.ResPath))
      return false;
    return true;
  }
  bool operator != (const ResourcesInfo &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const ResourcesInfo & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(ResourcesInfo &a, ResourcesInfo &b);

inline std::ostream& operator<<(std::ostream& out, const ResourcesInfo& obj)
{
  obj.printTo(out);
  return out;
}

} // namespace

#endif
