include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

struct SCMusicRecordInfoMsg{
	1: byte mode
	2: i16 musicId
	3: list<struct.MusicRecordInfo> recordInfos
	4: byte level
}

/** �ײ���Ϣ*/
struct SCAppPurchaseInfosMsg{
	/** �汾*/
	1: byte version
	/** �ײ���Ϣ*/
	2: list<struct.InAppPurchaseInfo> purchaseInfos
	/** �׳���Ϣ*/
	3: optional list<i32> firstRechargeInfo
}

struct SCChatMsg{
	1: byte	scope
	2: string	content
	3: string	soundNameKey
	4: i64 fromAccountId
	5: struct.PlayerBaseInfo fromPlayer
	/** ��������ʱ��Ч��key:style val:id */
	6: optional map<byte, i32> fromChatFashionIds
	/** �Ƿ�������ļ */
	7: optional bool isGuildInvite
	/** ��ǰ�Ƿ��ڷ����� */
	8: optional bool isInRoom
	/** �Զ��������*/
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
	/** ��������ʱ��Ч��key:style val:id */
	11: optional map<byte, i32> fromChatFashionIds
	/** ��ǰ�Ƿ��ڷ����� */
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
	/**������ */
	1: string orderId
	/** �۸�λ*/
	2: i32 priceId
	/**������� */
	3: string extParam
}

struct SCRechargeSuccOrderListMsg{
	1: list<string> orderIdList
}
