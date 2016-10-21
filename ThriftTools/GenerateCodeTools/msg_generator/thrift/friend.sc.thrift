include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** 添加好友成功，应该出现在好友名单中 */
struct SCBecomeFriendMsg{
    /** 好友简要信息 */
	1: struct.SimpleBusinessCardInfo cardInfo
	/** 是否双向好友 */
	2: bool twoWay
}

/** 好友列表 */
struct SCFriendListMsg{
	1: i16 totalCount
	2: list<struct.FriendInfo> friendInfoList
}

/** 好友charId列表 */
struct SCFriendCharIdListMsg{
	2: list<i64> friendCharIdList
}

/** 在线好友信息 */
struct OnlineFriendInfo{
	1: i64 friendCharId
	/** 好友所在房间id */
	2: optional i32 friendRoomId
}

/** 在线好友列表 */
struct SCOnlineFriendListMsg{
	1: byte tid
	/** 在线好友房间id信息 */
	2: list<OnlineFriendInfo> onlineFriendInfos
}

/** 删除好友成功，应从好友列表中移除 */
struct SCDeleteFriendMsg{
	1: i64 friendCharId
}

/** 被好友删除 */
struct SCDeletedByFriendMsg{
	1: i64 friendCharId
}

/** 显示名片指定信息类型详情 */
struct SCShowBusinessCardDetailMsg{
	1: i64 charId
	2: optional i16 totalJewelryCount
	3: optional i16 curJewelryPageNum
	/** 首饰盒信息*/
	4: optional list<struct.JewelryInfo> jewelryInfos
	5: optional i16 totalRelationCount
	6: optional i16 curRelationPageNum
	/** 社交关系信息*/
	7: optional list<struct.SimpleBusinessCardInfo> relationInfos
}

/** 显示名片信息 */
struct SCShowBusinessCardInfoResultMsg{
	1: struct.BusinessCardInfo cardInfo
	2: i16 tid
	3: optional struct.CloseFriendInfo loverInfo
	4: i32 version
}

/** 显示玩家外观信息 */
struct SCShowPlayerAppearanceInfo{
	1: struct.PlayerAppearanceInfo firstAppearInfo
	2: i16 tid
	3: optional struct.PlayerAppearanceInfo secAppearInfo
}

/** 请求加为密友 */
struct SCAddCloseFriendRequestMsg{
	/** 密友id */
	1: i64 charId
	/** 密友名字 */
	2: string name
}

/** 加为密友请求响应结果 */
struct SCAddCloseFriendResultMsg{
	1: struct.CloseFriendInfo info
	/** 对方名字 */
	2: string name
	/** 1-同意 2-拒绝 */
	3: byte result
}

/** 所有密友信息， 只发第一个密友详细信息 */
struct SCCloseFriendInfos{
	/** 密友信息所属的角色id */
	1: i64 charId
	2: optional list<struct.PlayerBaseInfo> closeFriendBaseInfos
	/** 第一个密友信息 */
	3: optional struct.CloseFriendInfo firstCloseFriendInfo
}

/** 密友信息 */
struct SCCloseFriendInfoMsg{
	/** 密友信息所属的角色id */
	1: i64 charId
	2: optional struct.CloseFriendInfo closeFriendInfo
}

struct SCDeleteCloseFriendResultMsg{
	1: i64 charId
}

struct SCDeleteCloseFriendNotifyMsg{
	1: i64 charId
}

struct SCSendVoiceMailResultMsg{
	1: i64 receiveCharId
	2: string voiceKey
	3: i32 sendTime
}

struct SCConversationListMsg{
	1: list<struct.Conversation> conversationList
}

struct SCVoiceMailListMsg{
	1: i64 friendCharId
	2: list<struct.VoiceMailInfo> voiceMailInfos
}

struct SCNotificationListMsg{
	1: list<struct.Notification> notificationList
}

struct SCAddFriendNotifyMsg{
	1: i64 reqCharId
	2: string reqName
}

struct SCRandomCharacterMsg{
	1: list<struct.SimpleBusinessCardInfo> cardInfos 
	2: byte remainCount
}
struct SCSaveBusinessCardInfoOKMsg{
}

struct SCPicturesMsg{
	1:i64 charId
	2:string charName
	3:list<struct.Picture> ps
	4:i32 startIndex
	5:i32 endIndex
	6:i32 total
}
struct SCPicActionResultMsg{
	1:string pic
	2:struct.PicAction action
	3:byte state
	/** 缩略图id */
	4: optional string picThumId
}
struct SCPicUploadOkMsg{
	1:struct.Picture pic
}

struct SCAddActionListMsg{
	1: struct.SimpleBusinessCardInfo targetCardInfo
}

struct SCFriendOnlineStatusMsg{
	1: i64 friendCharId
	/** true=online  false=offline*/
	2: bool online
}

struct SCNearCharacterMsg{
	1: list<struct.SimpleBusinessCardInfo> cardInfos
	/** 是否需要客户端进行排序 */
	2: bool needClientSort
}

struct SCSearchPlayerMsg{
	1: struct.SimpleBusinessCardInfo cardInfo
}

/** 摸一摸结果 */
struct SCTouchResultMsg{
    /** 能否增加爱心值 */
    1: bool canAddLoverVal
	/** 被摸者增加人气值 */
	2: i32 incTargetPop
	/** 关系类型 -1无关系 0-好友 1-密友 2-情侣 3-夫妻 */
	3: byte relationType
	 /** 增加的友好度或亲密值或甜蜜值 */
	4: optional i32 incRelationVal
}

struct SCTouchingRecordsMsg{
	1: list<struct.TouchRecordInfo> touchingRecords
}

/** 修改密友或情侣间的宣言 */
struct SCSaveMoodMessageResultMsg{
	1: string textWords
	2: string soundId
	3: i64 toCharId
	4: bool isSelf
}

/** 修改密友或情侣间的关系称呼 */
struct SCSaveRelationshipResultMsg{
	/** 新关系昵称 */
	1: string newNickName
	2: i64 toCharId
	3: bool isSelf
}

/** 使用密友或情侣间的关系等级称呼 */
struct SCUseRelationshipResultMsg{
	/** 关系昵称等级 */
	1: byte relationshipLvl
	2: i64 toCharId
	3: bool isSelf
}

/** 好友关系等级奖励信息 */
struct FriendShipLvlPrize{
	/** 奖励 */
	1: optional struct.PrizeInfo prizeInfos
	/** 0-未领奖 1-已领奖 */
	3: byte getStatus
}

/** 密友关系奖励信息 */
struct SCCloseFriendGiftInfos{
    1: i64 closeFriendId
	/** 按等级顺序奖励信息 */
	2: list<FriendShipLvlPrize> LvlPrizes
}

/** 领取密友奖励成功 */
struct SCGetCloseFriendGiftSucc{
	/** 密友id */
	1: i64 charId
	/** 领取的密友关系等级 */
	2: byte closeLvl
}

struct SCSavePoseResultMsg{
	1: i32 poseId
	2: i64 targetCharId
}

/** 请求成为情侣 */
struct SCBeMyLoverRequestMsg{
	1: i64 charId
	2: string name
}

/** 成为情侣结果 */
struct SCBeLoversResultMsg{
	1: struct.CloseFriendInfo info
	2: string name
	/** 1-同意 2-拒绝 */
	3: byte result
}

/** 情侣信息 */
struct SCLoverInfoMsg{
	1: struct.CloseFriendInfo loverInfo
	2: i64 charId
}

/** 情侣关系奖励信息 */
struct SCLoverGiftInfos{
    1: i64 loverId
	/** 按等级顺序奖励信息 */
	2: list<FriendShipLvlPrize> LvlPrizes
}

/** 领取情侣奖励成功 */
struct SCGetLoverGiftSucc{
	/** 情侣id */
	1: i64 charId
	/** 领取的情侣关系等级 */
	2: byte loverLvl
}

struct SCSpecialDaysMsg{
	1: list<struct.SpecialDay> days
	2: i64 charId
}

struct SCCurrentIntimacyMsg{
	1: i64 charId;
	2: i32 intimacy;
}
struct SCTakeRingMsg{
	1: i32 ringId
}

struct SCYearsOfMarriedMsg{
	1: i32 idHadTaken;
}

struct SCCurFriendAmount{
	1: byte friendType
	2: i32	curAmount
}

/** 玩家名字改变后，需要通知所有在线玩家名字信息 */
struct SCFriendChangeNameMsg{
	1: i64 charId;
	2: string charName;
}

/** 玩家改变个性签名 */
struct SCUpdateMoodMessage{
	1: string moodMessage;
}