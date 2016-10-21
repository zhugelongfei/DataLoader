include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 请求即兴表演信息 */
struct CSReqImproviseInfoMsg{
	
}

/** 请求即兴表演随机任务 */
struct CSReqImproviseRandTasks{
	
}

/** 购买即兴表演次数 */
struct CSBuyImprovisePlayCount{
	/** 0-请求购买花费 1-确认购买 */
	1: byte status
}

/** 请求快速通过即兴表演 */
struct CSQuickPassImproviseTask{
	
}

/** 请求即兴表演兑换商店信息 */
struct CSReqImproviseShop{
    /** 即兴表演商店版本号， 初始为0 */
	1: i32 version
}

/** 兑换即兴表演商店商品 */
struct CSBuyImproviseShopItem{
	/** 即兴表演商店版本号， 初始为0 */
	1: i32 version
    /** 商品id */
	2: i32 shopItemId
}

/** 重置即兴表演兑换信息 */
struct CSResetImproviseShop{
    /** 0-请求重置花费 1-确认重置 */
	1: byte status
}