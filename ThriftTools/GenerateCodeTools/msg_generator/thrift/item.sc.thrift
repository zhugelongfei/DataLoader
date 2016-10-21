include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

struct SCDeleteItemMsg{
	1: i64 instanceId
}

struct SCBagItemsInfoMsg{
	1: list<struct.BaseItemInfo> items
	2: i16 bagCount
	3: i16 maxBagCount
}

struct SCAddBagItemsMsg{
	1: list<struct.BaseItemInfo> baseItems
}

struct SCBodyItemsInfoMsg{
	1: list<struct.AvatarItemInfo> avatarItems
	2: list<struct.AvatarInfo> vipAvatarInfoList
}

struct SCFavoriteAvatarsInfoMsg{
	1: list<struct.FavoriteAvatars> avatars
}

struct SCUpdateItemInfoMsg{
	1: list<struct.UpdateItemInfo> updateItems
}

struct SCUseItemResultMsg{
	1: i64 instanceId
	2: bool result
	3: list<i64> targetCharIds
	4: i64 userCharId
	5: list<struct.FuncParam> funcRespParamList
	6: i32 failMessageId
	7: list<string> argv
}

struct SCExpandBagResultMsg{
	1: i16 bagCount
	2: struct.BagExpandType bagExpandType
}

struct SCChangeAvatarMsg{
	1: i64 charId
	2: list<struct.AvatarInfo> avatarItems
}

struct SCSyncBodyAvatarMsg{
	1: list<struct.AvatarItemInfo> bodyAvatars
}

struct SCTreaBoxResultMsg{
	1: i32 itemId
	/** ���� */
	2: struct.PrizeInfo prizeInfos
}

struct UseItemCondition{
	1: i32 msgId
	2: i32 itemId
	3: i32 currentValue
	4: i32 conditionValue
}

struct SCUseItemConditionMsg{
	1: list<UseItemCondition> conditions
}

struct SCDiyAvatarMsg{
	1: bool result
	2: i32 msgIndex
}

/** ��װ��װ��Ϣ */
struct SCAvatarSuitMsg{
	/** ��װid��1��ʼ��-��װ��Ϣ */
	1: map<byte, struct.AvatarSuitInfo> suitInfos
	/** δ������ʾ����װid��1��ʼ��-��ʾ */
	2: map<byte, i32> unlockInfos
	/** ��ǰʹ����װ */
	3: optional byte usedSuitId
}

/** �����װ��װ��Ϣ�ɹ� */
struct SCSaveAvatarSuitSucc{
    /** ��װid */
	1: byte suitId
}

/** ����ʹ���е���װ */
struct SCUpdateUsingAvatarSuit{
    /** ��װid */
	1: byte suitId
}

/** ��װ��װ���� */
struct SCAvatarSuitUnlock{
    /** ������װid */
	1: list<byte> unlockSuitIds
}

/** ɾ����װ��װ��Ϣ�ɹ� */
struct SCDropAvatarSuitSucc{
    /** ��װid */
	1: byte suitId
}

/** ����������Ʒ���� */
struct SCDonateItemCountMsg{
	1: i64 targetCharId
	2: i32 itemId
	/** ���������� */
	3: byte giftTimes
	/** ����������Ʒ���� */
	4: byte maxGiftCount
	/** ���ӹ�ϵֵ���� */
	5: optional i32 addRelationValLangType
}