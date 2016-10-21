include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** 即兴表演信息 */
struct SCImproviseInfoMsg{
	/** 进入剩余完成次数 */
	1: i16 dailyLeftPlayCount
	/** 随机任务id, 为0表示还未领取 */
	2: i32 randTaskId
	/** 完成状态0-未完成 1-已完成*/
	3: byte finishStatus
	/** 演出奖励 */
	4: i32 perfPrizeCoupon
	/** 星光等级奖励 */
	5: i32 starLightLvlPrizeCoupon
	/** 当前演出券 */
	6: i32 perfCoupon
}

/** 更新即兴表演随机任务 */
struct SCUpdateImproviseTaskState {
	/** 随机任务id */
	1: i32 randTaskId
	/** 完成状态0-未完成 1-已完成*/
	2: byte finishStatus
}

/** 即兴表演随机任务 */
struct SCImproviseRandTasks{
    /** 随机任务id列表 */
	1: list<i32> randTaskIds
	/** 选择的随机任务id */
	2: i32 choicedTaskId
	/** 演出奖励 */
	3:i32 perfPrizeCoupon
}

/** 购买即兴表演次数信息 */
struct SCBuyImprovisePlayCountInfo{
	/** 花费绑钻 */
	1: i32 cost
	/** 增加次数 */
	2: i32 addedCount
	/** 今日购买次数 */
	3:i32 todayBuyTimes
}

/** 成功快速通过即兴表演 */
struct SCQuickPassImproviseTaskSucc{
	
}

/** 即兴表演兑换商店信息 */
struct SCImproviseShop{
    /** 即兴表演商店版本号 */
	1: i32 version
	/** 商品信息 key:商品id， val:可兑换次数 */
	2: map<i32, byte> shopItems
}

/** 成功兑换即兴表演商店商品 */
struct SCBuyImproviseShopItemSucc{
    /** 商品id */
	1: i32 shopItemId
}

/** 重置即兴表演兑换花费信息 */
struct SCResetImproviseShopCost{
	/** 花费绑钻 */
	1: i32 cost
}

/** 成功重置即兴表演兑换信息 */
struct SCResetImproviseShopSucc{

}