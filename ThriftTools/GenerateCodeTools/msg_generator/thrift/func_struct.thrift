include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto

struct FuncReqParam25 {
	1: list<byte> indexList
}

struct FuncRespParam24 {
	1: list<struct.ItemPrize> itemPrizeList
}

struct FuncRespParam25 {
	1: list<struct.ItemPrize> itemPrizeList
}

struct FuncRespParam26 {
	1: string sendCharName
	2: string recvCharName
	3: byte senderSex;
	4: byte recvSex;
	5: list<struct.ItemPrize> itemPrizeList
}

struct FuncRespParam26Old{
	1: string sendCharName
 	2: string recvCharName
 	3: list<struct.ItemPrize> itemPrizeList
}

struct FuncRespParam63 {
	1: i16 durationTime
	2: i16 cd
}

struct FuncRespParam64 {
	1: i16 durationTime
	2: i16 cd
}

struct FuncRespParam71 {
	1: i16 durationTime
	2: i16 cd
}

/** 烟花释放参数 */
struct FuncRespParam103 {
	1: string charName
	2: byte charSex
	/** 烟花道具id */
	3: i32 fireworkItemId
	/** 祝福语 */
	4: string content
}