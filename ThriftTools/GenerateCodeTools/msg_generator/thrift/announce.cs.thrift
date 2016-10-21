include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 请求通告信息 */
struct CSReqAnnounceInfoMsg{
	1: i32 announceVersion
}

/** 请求开始通告 */
struct CSReqStartAnnounce{
	/** 通告索引 */
	1:byte announceIndex
}

/** 请求刷新通告冷却时间 */
struct CSRefreshAnnounceMsg{
	/** 通告索引 */
	1:byte announceIndex
}

/** 请求增加通告次数 */
struct CSAddAnnounceTimesMsg{
}

/** 请求刷新通告商店 */
struct CSRefreshAnnounceShopMsg{
}

/** 请求刷新通告商店消耗 */
struct CSRefreshAnnounceShopCost{
}
/** 请求通告商店物品 */
struct CSReqAnnounceShopItems{
	/** 商店物品版本 */
	1:i32	version
}
/** 请求刷新通告冷却时间消耗 */
struct CSRefreshAnnounceCost{
	/** 通告索引 */
	1:byte announceIndex
}

/** 请求购买通告商店物品 */
struct CSBuyAnnounceShopItem{
	/** 格子id */
	1: i32	index
}

/** 请求增加通告次数消耗 */
struct CSAddAnnounceCost{
}

/** 请求快速加入通告房间 */
struct CSQuickJoinAnnounceRoom{
	/** 通告索引 */
	1:byte announceIndex
}

/** 通告特殊玩法值 */
struct CSAnnounceSpecialVal{
	/** 特殊玩法值(百分制的分子) */
	1: i16 specialVal
}

/** 请求开始通告showTime */
struct CSReqStartAnnounceShowTime{
	
}
