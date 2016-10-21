include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** �������������Ϣ */
struct CSBuySingleItemMsg{
	1: i32 itemId
	2: byte validTimeType
	3: i16 count
	4: struct.AvatarDiyArea diyareas
	/** �Ƿ���ʱ�̳� */
	5: optional bool isLimitMall
}


/** �������������Ϣ */
struct CSBuyMultiItemsMsg{
	1: list<struct.BuyItemInfo> buyItems
	/** �Ƿ���ʱ�̳� */
	2: optional bool isLimitMall
}

/** ��ѯ�̳���Ϣ */
struct CSQueryMallMsg{
	1: optional byte firstCategory
	2: optional byte secondCategory
	3: optional byte thirdCategory
	4: optional byte sex
	5: optional byte sortType
	/** ��ҳ��Ϣ��ѯ���� */
	6: struct.CommonDataPageInfoQueryParam pageInfoQueryParam
	/** �Ƿ���ʱ�̳� */
	7: optional bool isLimitMall
}

struct CSQueryMallVersionMsg{
	/** �Ƿ���ʱ�̳� */
	1: optional bool isLimitMall
}

/** �����Ӧ��Ʒid����Ʒ��Ϣ */
struct CSQueryMallByIdsMsg{
	/** �����Ӧid����Ϣ���� */
	1: struct.CommonDataQueryByIdsParam queryByIdsParam
	/** �Ƿ���ʱ�̳� */
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
//Խ��SOHAƽ̨����ֵ�ɹ�֮���ʹ���Ϣ��������������������ȷ�ϣ�ȷ�ϳɹ�֮�󣬻����Ϸ��ɫ��Ǯ
struct CSSohaOrderSuccessMsg {
	1:string orderId
}
