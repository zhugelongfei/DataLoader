include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

//刷新图鉴
struct CSRefConstellationItemsMsg{
	1: struct.RefreshType type      //刷新类型 1自动刷新 2强制刷新消耗货币
	2: byte constellationId		//星座id
}

//请求星座物品列表
struct CSReqConstellationItemsMsg{
	1: byte constellationId
}

//兑换xx星位xx物品id
struct CSConstellationSwapItemMsg{
	1: byte constellationId		//星座id
  2: i16 star			//星位
  3: byte sex
  4: i32 itemIndex
  5: i64 targetCharId	// -1 : 兑换  否则目标charID
}

//停止星盘转动，请求确认物品id
struct CSReqConstellationLotteryMsg{
	1: byte constellationId
	2: i16 count
}


//struct CSConstellationLotteryCostMsg{
//	1: byte priceType
//	2: i32 priceCount
//}

struct CSGetConstellationIdsMsg{
}

struct CSGetTimingLotteryMsg{
}

