include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

struct SCMusicRecordInfoMsg{
	1: byte mode
	2: i16 musicId
	3: list<struct.MusicRecordInfo> recordInfos
	4: byte level
}

/** 套餐信息*/
struct SCAppPurchaseInfosMsg{
	/** 版本*/
	1: byte version
	/** 套餐信息*/
	2: list<struct.InAppPurchaseInfo> purchaseInfos
	/** 首充信息*/
	3: optional list<i32> firstRechargeInfo
}

struct SCChatMsg{
	1: byte	scope
	2: string	content
	3: string	soundNameKey
	4: i64 fromAccountId
	5: struct.PlayerBaseInfo fromPlayer
	/** 文字聊天时尚效果key:style val:id */
	6: optional map<byte, i32> fromChatFashionIds
	/** 是否舞团招募 */
	7: optional bool isGuildInvite
	/** 当前是否在房间中 */
	8: optional bool isInRoom
	/** 自动喇叭序号*/
	9: optional i32 sendAutoSpeakerIndex
	
}

struct SCWhisperMsg{
	1: byte	status
	2: string	content
	3: string	soundNameKey
	4: string	fromName
	5: i64 fromAccountId
	6: i64 fromCharId
	7: byte fromSex
	8: string fromHeaderIcon
	9: byte fromVipLevel	
	10: struct.PlayerBaseInfo fromPlayer
	/** 文字聊天时尚效果key:style val:id */
	11: optional map<byte, i32> fromChatFashionIds
	/** 当前是否在房间中 */
	12: optional bool isInRoom
}

struct SCBind3rdAccountResultMsg{
	1: bool result
	2: struct.BindAccountType bindType
}

struct SCQueryBind3rdInfoResultMsg{
	1: map<i64, i64> bindAccountIds
	2: i32 index
	3: struct.BindAccountType bindType
}

struct SCSelfBind3rdInfoMsg{
	1: i64 sinaWbAccountId
}

struct SCGenerateOrderMsg{
	/**订单号 */
	1: string orderId
	/** 价格档位*/
	2: i32 priceId
	/**额外参数 */
	3: string extParam
}

struct SCRechargeSuccOrderListMsg{
	1: list<string> orderIdList
}
