include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

struct SCMallItemsInfoMsg{
	1: optional byte firstCategory
	2: optional byte secondCategory
	3: optional byte thirdCategory
	4: optional byte sex
	5: optional byte sortType
	/** 商城物品分页信息 */
	6: struct.CommonDataPageInfos mallItemPageInfos
	/** 是否限时商城 */
	7: optional bool isLimitMall
}

struct SCMallVersionMsg{
	1: i16 version
	/** 是否限时商城 */
	2: optional bool isLimitMall
	/** 限时商城时间描述 */
	3: optional string limitMalltimeDesc
	/** 限时商城内容说明 */
	4: optional string limitMallContent
}

struct SCMallInfosMsg{
	/** 请求对应id的信息响应 */
	1: struct.CommonDataQueryByIdsResponse queryByIdsResponse
	/** 是否限时商城 */
	2: optional bool isLimitMall
}

struct SCBuySingleItemSuccMsg{
	1: i32 itemId
	2: byte validTimeType
	3: i16 count
	/** 是否限时商城 */
	4: optional bool isLimitMall
}

/** 限时商城购买成功 */
struct SCBuyLimitMallItemSucc{
	/** 限时商品剩余数量<itemid, 剩余数量> */
	1: map<i32, i16> remainCountInfo
}

struct SCSellItemPriceMsg{
	1: i64 instanceId
	2: byte currencyType
	3: i32 count
}

struct SCPointOrderMsg {
  1: list<struct.PointOrderInfo> orders
}

struct SCEmailCheckCodeMsg {
	1: byte result;
}

struct SCBindEmailMsg {
	1:byte result;
	2:struct.PointMallErrorCode errorCode;
}

struct SCPointOrderIdMsg {
	1: i64 orderId
}

struct SCPointOrderCheckMsg {
	1:byte result;
	2:i64 orderId;
	3:struct.PointMallErrorCode errorCode;
}

struct SCPointOrderAppealMsg {
	1: i64 orderId
	2: i16 status
	3: byte result;
}

struct SCServerPointLimitMsg {
	1: i32 limitPoint;
}