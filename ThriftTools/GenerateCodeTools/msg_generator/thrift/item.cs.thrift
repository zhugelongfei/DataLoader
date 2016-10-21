include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs


struct CSDeleteItemMsg{
	1: i64 instanceId
}

struct CSUseItemConditionMsg{
	1: i32 itemId
}

/** diyȾɫavatar */
struct CSDiyAvatarMsg{
    /** avatarʵ��id */
	1: i64 avatarInstId
	/** diyȾɫ���� */
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

/** �����װ��װ��Ϣ */
struct CSReqAvatarSuitMsg{
	
}

/** �����װ��װ��Ϣ */
struct CSSaveAvatarSuitMsg{
    /** ��װid */
	1: byte suitId
	/** ��װ�ڵķ�װʵ��id */
	2: list<i64> avatarIds
}

/** ���Ϸ�װ��װ */
struct CSPutOnAvatarSuitMsg{
    /** ��װid */
	1: byte suitId
}

/** ɾ����װ��װ */
struct CSDropAvatarSuitMsg{
    /** ��װid */
	1: byte suitId
}

/** ����������Ʒ���� */
struct CSDonateItemCountMsg{
	1: i64 targetCharId
	2: i32 itemId
}