include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

struct SCSlotDoDrawMsg{
	1: list<struct.SlotDrawResult> result
}

struct SCSlotPrizePoolMsg{
	1: i32 diamondPoolSize
	2: i32 bindDiamondPoolSize
	
}