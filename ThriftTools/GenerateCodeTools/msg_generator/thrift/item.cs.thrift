include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs


struct CSDeleteItemMsg{
	1: i64 instanceId
}

struct CSUseItemConditionMsg{
	1: i32 itemId
}

/** diy染色avatar */
struct CSDiyAvatarMsg{
    /** avatar实例id */
	1: i64 avatarInstId
	/** diy染色区域 */
	2: struct.AvatarDiyArea diyAreas
}

struct CSLookTreaBoxMsg{
	1: i32 itemId
}

struct CSChangeAvatarMsg{
	1: list<i64> changedAvatarIds
}

struct CSPutFavoriteAvatarsMsg{
	/** index of favorite avatars */
	1: byte index
}

struct CSQueryPurchaseInfoMsg{
	1: byte version
}

struct CSSaveFavoriteAvatarsMsg{
	1: byte index
	2: list<i64> avatarIds
}

struct CSUseItemMsg{
	1: i64 instanceId
	2: list<i64> targetCharIds
	3: list<struct.FuncParam> funcReqParamList
	4: i32 count
}

struct CSExpandBagMsg{
	1: i16 expandCount
}

struct CSItemRenewMsg{
	1: i64 itemInstanceId
	2: byte validTimeType
}

struct CSDonateItemMsg{
	1: i64 instanceId
	2: i64 targetCharId
	4: i32 count
	5: string content
}

/** 请求服装套装信息 */
struct CSReqAvatarSuitMsg{
	
}

/** 保存服装套装信息 */
struct CSSaveAvatarSuitMsg{
    /** 套装id */
	1: byte suitId
	/** 套装内的服装实例id */
	2: list<i64> avatarIds
}

/** 穿上服装套装 */
struct CSPutOnAvatarSuitMsg{
    /** 套装id */
	1: byte suitId
}

/** 删除服装套装 */
struct CSDropAvatarSuitMsg{
    /** 套装id */
	1: byte suitId
}

/** 请求赠送礼品数量 */
struct CSDonateItemCountMsg{
	1: i64 targetCharId
	2: i32 itemId
}