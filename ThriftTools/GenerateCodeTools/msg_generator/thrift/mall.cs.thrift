include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 单独购买道具消息 */
struct CSBuySingleItemMsg{
	1: i32 itemId
	2: byte validTimeType
	3: i16 count
	4: struct.AvatarDiyArea diyareas
	/** 是否限时商城 */
	5: optional bool isLimitMall
}


/** 批量购买道具消息 */
struct CSBuyMultiItemsMsg{
	1: list<struct.BuyItemInfo> buyItems
	/** 是否限时商城 */
	2: optional bool isLimitMall
}

/** 查询商城消息 */
struct CSQueryMallMsg{
	1: optional byte firstCategory
	2: optional byte secondCategory
	3: optional byte thirdCategory
	4: optional byte sex
	5: optional byte sortType
	/** 分页信息查询参数 */
	6: struct.CommonDataPageInfoQueryParam pageInfoQueryParam
	/** 是否限时商城 */
	7: optional bool isLimitMall
}

struct CSQueryMallVersionMsg{
	/** 是否限时商城 */
	1: optional bool isLimitMall
}

/** 请求对应商品id的商品信息 */
struct CSQueryMallByIdsMsg{
	/** 请求对应id的信息参数 */
	1: struct.CommonDataQueryByIdsParam queryByIdsParam
	/** 是否限时商城 */
	2: optional bool isLimitMall
}

struct CSQuerySellItemPriceMsg{
	1: i64 instanceId
}

struct CSSellItemMsg{
	1: i64 instanceId
} 


struct CSQueryPointOrderMsg {

}

struct CSEmailCheckCodeMsg {
	1: string email
}

struct CSBindEmailMsg {
	1: string email
	2: string checkCode
}

struct CSBuyPointItemMsg {
	1: i32 pointItem
	2: i64 orderId
}

struct CSPointOrderCheckMsg {
	1: i64 orderId
	2: string checkCode
}

struct CSPointOrderAppealMsg {
	1: i64 orderId
}

struct CSServerPointLimitMsg {

}
//越南SOHA平台，充值成功之后发送此消息给服务器，服务器进行确认，确认成功之后，会给游戏角色加钱
struct CSSohaOrderSuccessMsg {
	1:string orderId
}
