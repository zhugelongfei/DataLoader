include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

struct SCMallItemsInfoMsg{
	1: optional byte firstCategory
	2: optional byte secondCategory
	3: optional byte thirdCategory
	4: optional byte sex
	5: optional byte sortType
	/** �̳���Ʒ��ҳ��Ϣ */
	6: struct.CommonDataPageInfos mallItemPageInfos
	/** �Ƿ���ʱ�̳� */
	7: optional bool isLimitMall
}

struct SCMallVersionMsg{
	1: i16 version
	/** �Ƿ���ʱ�̳� */
	2: optional bool isLimitMall
	/** ��ʱ�̳�ʱ������ */
	3: optional string limitMalltimeDesc
	/** ��ʱ�̳�����˵�� */
	4: optional string limitMallContent
}

struct SCMallInfosMsg{
	/** �����Ӧid����Ϣ��Ӧ */
	1: struct.CommonDataQueryByIdsResponse queryByIdsResponse
	/** �Ƿ���ʱ�̳� */
	2: optional bool isLimitMall
}

struct SCBuySingleItemSuccMsg{
	1: i32 itemId
	2: byte validTimeType
	3: i16 count
	/** �Ƿ���ʱ�̳� */
	4: optional bool isLimitMall
}

/** ��ʱ�̳ǹ���ɹ� */
struct SCBuyLimitMallItemSucc{
	/** ��ʱ��Ʒʣ������<itemid, ʣ������> */
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