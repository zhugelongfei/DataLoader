include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 通过charId来添加好友 */
struct CSAddFriendMsg{
	/** 添加好友id */
	1: i64 friendCharId
	2: byte source
}

/** 查询好友信息 */
struct CSQueryFriendListMsg{
    /** 查询类型 */
	1: struct.QueryFriendType queryFriendType
}

/** 通过charId删除好友 */
struct CSDeleteFriendMsg{
	/** 删除好友id */
	1: i64 friendCharId
}

/** 名片详情类型 */
enum BusinessCardDetailType {
    /** 首饰盒详情 */
    JEWELRY
	/** 关系详情 */
	RELATION
}

/** 显示玩家外观信息 */
struct CSShowPlayerAppearanceInfo{
     1: i64 firstCharId
	 2: i16 tid
	 3: optional i64 secCharId
}

/** 显示名片 */
struct CSShowBusinessCardInfo{
	1: i64 friendCharId
	2: i16 tid
	3: string findPlayName
	4: i32 version
}

/** 显示名片指定信息类型详情 */
struct CSShowBusinessCardDetailMsg{
	1: i64 friendCharId
	/** 名片详情类型BusinessCardDetailType */
	2: byte detailType
	/** 显示第几页详情 */
	3: i16 pageNum
}

/** 请求成为密友 */
struct CSAddCloseFriendMsg{
	1: i64 friendCharId
	2: string friendName
}

/** 响应成为密友请求 */
struct CSAcceptCloseFriendMsg{
    /** 请求方角色id */
	1: i64 charId
	/** 是否同意 */
	2: bool agreed 
}

/** 请求所有密友信息 */
struct CSGetCloseFriendInfos{
	/** 密友信息所属的角色id */
	1: i64 charId
}

/** 请求密友信息 */
struct CSGetCloseFriendInfo{
	/** 密友信息所属的角色id */
	1: i64 charId
	/** 密友角色id */
	2: i64 closeFriendCharId
}

/** 请求删除密友 */
struct CSReqDeleteCloseFriend{
	1: i64 charId
}

/** 请求密友关系奖励信息 */
struct CSReqCloseFriendGiftInfos{
	/** 密友id */
	1: i64 charId
}

/** 领取密友奖励 */
struct CSGetCloseFriendGiftMsg{
	/** 密友id */
	1: i64 charId
	/** 领取的密友关系等级 */
	2: byte closeLvl
}

struct CSSendVoiceMailMsg{
	1: i64 receiveCharId
	2: string voiceKey
}

struct CSQueryConversationListMsg{
	
}

struct CSQueryVoiceMailListMsg{
	1: i64 friendCharId
}

struct CSQueryNotificationListMsg{
	
}

struct CSDeleteNotificationMsg{
	1: list<i64> notificationIdList
}

struct CSDeleteVoiceMailMsg{
	1: list<string> voiceKeyList
}

struct CSRandomQueryCharacterMsg{
	1: i16 tagId
	/** 查询性别 0-男 1-女 2-全部 */
	2: byte sex
}
struct CSSaveBusinessCardInfoMsg{
	1:struct.BusinessCardInfo info
}
struct CSPicUploadMsg{
	1:string pic	
	/** 缩略图 */
	2:string thumbnails
}

struct CSPicActionMsg{
	1:struct.PicAction action
	2:string pic
	3:i64 charId
}

struct CSPicShowMsg{
	1:i64 charId
	2:i32 startIndex
	3:i32 endIndex
}

struct CSSearchPlayerMsg{
	1: string name
}

struct CSFollowFriendMsg{
	1: i64 charId
}

struct CSClickUploadPicButtonMsg{
	
}

struct CSClickUploadHeadButtonMsg{

}

struct CSNearQueryCharacterMsg{
	1: i32 startIndex
	2: i32 pageSize
	/** 查询性别 0-男 1-女 2-全部 */
	3: byte sex
}

struct CSUpdateGeoInfoMsg{
	1: double longitude
	2: double latitude
	3: string location
}

/** 摸一摸其他玩家 */
struct CSTouchFriendMsg{
    /** 摸身体部位 */ 
	1: byte touchPosition
	2: i64 targetCharid
	 /** 是否今天第一次摸 0-否 1-是 */ 
	3: byte isTodayFirst
}

struct CSTouchRecordsMsg{
	1: i64 charid
}

/** 修改密友或情侣间的关系称呼 */
struct CSSaveRelationshipMsg{
	1: string relationship
	2: i64 toCharId
}

/** 使用密友或情侣间的关系等级称呼 */
struct CSUseRelationshipMsg{
	1: byte relationshipLvl
	2: i64 toCharId
}

/** 修改密友或情侣间的宣言 */
struct CSSaveMoodWordsMsg{
	1: optional string textWords
	2: optional string soundId
	3: i64 toCharId
}

struct CSSavePoseMsg{
	1: i32 poseId
	2: i64 toCharId
}

/** 请求成为情侣 */
struct CSBeMyLoverMsg{
	1: i64 charId
	2: string name
}

/** 响应成为情侣请求 */
struct CSAcceptLoverMsg{
	1: i64 charId
	2: string name
	3: bool agreed 
}

/** 请求情侣信息 */
struct CSLoverInfoMsg{
	1: i64 charId
}

/** 请求情侣关系奖励信息 */
struct CSReqLoverGiftInfos{
	/** 情侣id */
	1: i64 charId
}

/** 领取情侣奖励 */
struct CSGetLoverGiftMsg{
	/** 情侣id */
	1: i64 charId
	/** 领取的情侣关系等级 */
	2: byte loverLvl
}

struct CSSpecialDaysMsg{
	1: i64 charId
}

struct CSTakeRingMsg{
	1: i32 ringId
}
struct CSYearsOfMarriedMsg{
}

struct CSQueryCurFriendAmount{
	/** 0: 普通好友 1： 密友 */
	1: byte friendType
}

/** 拒绝好友申请 */
struct CSRefuseFriendApplyMsg{
    /** 请求方角色id */
	1: i64 charId
}