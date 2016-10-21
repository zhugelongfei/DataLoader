include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

struct CSQueryMysteryItemMsg{
	1: i32 type
}

struct CSBuyMysteryItemMsg{
	1: i32 itemId
	2: i16 count
}