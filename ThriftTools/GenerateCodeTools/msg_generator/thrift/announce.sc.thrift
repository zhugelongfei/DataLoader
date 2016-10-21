include "struct.thrift"
namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** 通告信息 */
struct SCAllAnnounceInfos{
	1: i32 announceVersion
	2: byte availableTimes
	3: i32 announceGold
	4: list<struct.AnnounceData> announceList
	/** 下次刷新时间(HHmm)*/
	5: i16 nextRefreshTime
}

/** 增加通告次数消耗 */
struct SCAddAnnounceCost{
	1: i32 amount
	2: i32 totalPrice
	3: i32 buyTimes
}

/** 刷新通告冷却时间消耗 */
struct SCRefreshAnnounceCost{
	1: i32 refreshTimes
	2: i32 cost
}

/** 刷新通告商店消耗 */
struct SCRefreshAnnounceShopCost{
	1: i32 refreshTimes
	2: i32 cost
}

/** 刷新通告成功 */
struct SCRefreshAnnounceSucc{
	/** 通告索引 */
	1:byte announceIndex
}

/** 通告商店物品信息*/
struct SCAnnounceShopItems{
	/** 通告商店版本 */
	1: i32	shopVersion
	/** key : 商品id ,val: 商品消耗 */
	2: list<struct.ItemObject> items
	/** 刷新消耗 */
	3: i32	refreshCost
	/** 剩余免费刷新次数*/
	4: i16 leftFreeTimes
}

/** 增加通告次数成功 */
struct SCAddAnnounceTimesSucc{
	1: i32	amount
}

/** 刷新商店成功 */
struct SCRefreshAnnounceShopSucc{
	/** key : 商品id ,val: 商品消耗 */
	1: list<struct.ItemObject> items
	/** 下次刷新的消耗 */
	2: i32	refreshCost
	/** 剩余免费刷新次数*/
	3: i16 leftFreeTimes
}
/** 购买物品成功 */
struct SCBuyAnnounceItemSucc{
	/** 商品id */
	1: i32 id
}

/** 通告舞蹈额外信息 */
struct SCAnnounceDanceExtraInfos{
	/** 舞蹈欢呼值通关信息 */
	1: struct.DanceCheerInitInfo cheerPassInitInfo
}

/** 通告同步欢呼值 */
struct SCSyncAnnounceCheerInfo{
	/** 同步欢呼值信息 */
    1: struct.SyncDanceCheerInfo syncDanceCheerInfo
	/** 是否触发特殊玩法 */
    2: optional bool hasSpecialVal
}

/** 通告通关信息 */
struct AnnouncePassInfo{
    /** 通告id */
	1: i32 announceId
	/** 通告索引 */
	2: byte announceIndex
	/** 通关等级 0-未通关 1-3 s, ss, sss */
	3: byte passRank
	/** 通告条件信息 */
	4: list<struct.PassCheerCondResult> condResultList
	/** 奖励 */
	5: optional struct.PrizeInfo prizeInfos
	/** 额外奖励 */
	6: optional struct.PrizeInfo extraPrizeInfos
	/** 每个成员的欢呼值结果 */
	7: optional list<struct.DanceCheerValResult> cheerValResults
}

/** 更新通告信息 */
struct SCUpdateAnnounceInfos{
	/** 通告id */
	1: optional i32 announceId;
	/** 通告索引 */
	2: optional byte announceIndex
	/** 剩余次数 */
	3: optional i32 leftTimes
	/** 通告冷却时间(距离1970.1.1的秒数) */
	4: optional i32 coldDown
	/** 通告提示id */
	5: optional i32 announceTipId;
}

/** 开始通告showTime */
struct SCStartAnnounceShowTime{
	
}