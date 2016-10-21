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
	/** 奖励 */
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

/** 服装套装消息 */
struct SCAvatarSuitMsg{
	/** 套装id（1开始）-套装信息 */
	1: map<byte, struct.AvatarSuitInfo> suitInfos
	/** 未解锁提示，套装id（1开始）-提示 */
	2: map<byte, i32> unlockInfos
	/** 当前使用套装 */
	3: optional byte usedSuitId
}

/** 保存服装套装信息成功 */
struct SCSaveAvatarSuitSucc{
    /** 套装id */
	1: byte suitId
}

/** 更新使用中的套装 */
struct SCUpdateUsingAvatarSuit{
    /** 套装id */
	1: byte suitId
}

/** 服装套装解锁 */
struct SCAvatarSuitUnlock{
    /** 解锁套装id */
	1: list<byte> unlockSuitIds
}

/** 删除服装套装信息成功 */
struct SCDropAvatarSuitSucc{
    /** 套装id */
	1: byte suitId
}

/** 返回赠送礼品数量 */
struct SCDonateItemCountMsg{
	1: i64 targetCharId
	2: i32 itemId
	/** 已赠送数量 */
	3: byte giftTimes
	/** 最大可赠送礼品数量 */
	4: byte maxGiftCount
	/** 增加关系值类型 */
	5: optional i32 addRelationValLangType
}