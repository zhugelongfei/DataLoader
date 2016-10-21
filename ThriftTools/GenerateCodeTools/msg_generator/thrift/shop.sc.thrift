include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

struct MysteryItemInfo{
	1:i32 id  
	2: i32 itemId   
	3: i32 weight   
	4: byte priceType   
	5: i32 price   
	6: byte timeType   
	7: byte bind   
	8: byte sex   
	9: byte itemType   
}

struct SCMysteryItemMsg{
	1: list<MysteryItemInfo> itemList
}