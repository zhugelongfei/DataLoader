include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** ��Ӻ��ѳɹ���Ӧ�ó����ں��������� */
struct SCBecomeFriendMsg{
    /** ���Ѽ�Ҫ��Ϣ */
	1: struct.SimpleBusinessCardInfo cardInfo
	/** �Ƿ�˫����� */
	2: bool twoWay
}

/** �����б� */
struct SCFriendListMsg{
	1: i16 totalCount
	2: list<struct.FriendInfo> friendInfoList
}

/** ����charId�б� */
struct SCFriendCharIdListMsg{
	2: list<i64> friendCharIdList
}

/** ���ߺ�����Ϣ */
struct OnlineFriendInfo{
	1: i64 friendCharId
	/** �������ڷ���id */
	2: optional i32 friendRoomId
}

/** ���ߺ����б� */
struct SCOnlineFriendListMsg{
	1: byte tid
	/** ���ߺ��ѷ���id��Ϣ */
	2: list<OnlineFriendInfo> onlineFriendInfos
}

/** ɾ�����ѳɹ���Ӧ�Ӻ����б����Ƴ� */
struct SCDeleteFriendMsg{
	1: i64 friendCharId
}

/** ������ɾ�� */
struct SCDeletedByFriendMsg{
	1: i64 friendCharId
}

/** ��ʾ��Ƭָ����Ϣ�������� */
struct SCShowBusinessCardDetailMsg{
	1: i64 charId
	2: optional i16 totalJewelryCount
	3: optional i16 curJewelryPageNum
	/** ���κ���Ϣ*/
	4: optional list<struct.JewelryInfo> jewelryInfos
	5: optional i16 totalRelationCount
	6: optional i16 curRelationPageNum
	/** �罻��ϵ��Ϣ*/
	7: optional list<struct.SimpleBusinessCardInfo> relationInfos
}

/** ��ʾ��Ƭ��Ϣ */
struct SCShowBusinessCardInfoResultMsg{
	1: struct.BusinessCardInfo cardInfo
	2: i16 tid
	3: optional struct.CloseFriendInfo loverInfo
	4: i32 version
}

/** ��ʾ��������Ϣ */
struct SCShowPlayerAppearanceInfo{
	1: struct.PlayerAppearanceInfo firstAppearInfo
	2: i16 tid
	3: optional struct.PlayerAppearanceInfo secAppearInfo
}

/** �����Ϊ���� */
struct SCAddCloseFriendRequestMsg{
	/** ����id */
	1: i64 charId
	/** �������� */
	2: string name
}

/** ��Ϊ����������Ӧ��� */
struct SCAddCloseFriendResultMsg{
	1: struct.CloseFriendInfo info
	/** �Է����� */
	2: string name
	/** 1-ͬ�� 2-�ܾ� */
	3: byte result
}

/** ����������Ϣ�� ֻ����һ��������ϸ��Ϣ */
struct SCCloseFriendInfos{
	/** ������Ϣ�����Ľ�ɫid */
	1: i64 charId
	2: optional list<struct.PlayerBaseInfo> closeFriendBaseInfos
	/** ��һ��������Ϣ */
	3: optional struct.CloseFriendInfo firstCloseFriendInfo
}

/** ������Ϣ */
struct SCCloseFriendInfoMsg{
	/** ������Ϣ�����Ľ�ɫid */
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
	/** ����ͼid */
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
	/** �Ƿ���Ҫ�ͻ��˽������� */
	2: bool needClientSort
}

struct SCSearchPlayerMsg{
	1: struct.SimpleBusinessCardInfo cardInfo
}

/** ��һ����� */
struct SCTouchResultMsg{
    /** �ܷ����Ӱ���ֵ */
    1: bool canAddLoverVal
	/** ��������������ֵ */
	2: i32 incTargetPop
	/** ��ϵ���� -1�޹�ϵ 0-���� 1-���� 2-���� 3-���� */
	3: byte relationType
	 /** ���ӵ��ѺöȻ�����ֵ������ֵ */
	4: optional i32 incRelationVal
}

struct SCTouchingRecordsMsg{
	1: list<struct.TouchRecordInfo> touchingRecords
}

/** �޸����ѻ����¼������ */
struct SCSaveMoodMessageResultMsg{
	1: string textWords
	2: string soundId
	3: i64 toCharId
	4: bool isSelf
}

/** �޸����ѻ����¼�Ĺ�ϵ�ƺ� */
struct SCSaveRelationshipResultMsg{
	/** �¹�ϵ�ǳ� */
	1: string newNickName
	2: i64 toCharId
	3: bool isSelf
}

/** ʹ�����ѻ����¼�Ĺ�ϵ�ȼ��ƺ� */
struct SCUseRelationshipResultMsg{
	/** ��ϵ�ǳƵȼ� */
	1: byte relationshipLvl
	2: i64 toCharId
	3: bool isSelf
}

/** ���ѹ�ϵ�ȼ�������Ϣ */
struct FriendShipLvlPrize{
	/** ���� */
	1: optional struct.PrizeInfo prizeInfos
	/** 0-δ�콱 1-���콱 */
	3: byte getStatus
}

/** ���ѹ�ϵ������Ϣ */
struct SCCloseFriendGiftInfos{
    1: i64 closeFriendId
	/** ���ȼ�˳������Ϣ */
	2: list<FriendShipLvlPrize> LvlPrizes
}

/** ��ȡ���ѽ����ɹ� */
struct SCGetCloseFriendGiftSucc{
	/** ����id */
	1: i64 charId
	/** ��ȡ�����ѹ�ϵ�ȼ� */
	2: byte closeLvl
}

struct SCSavePoseResultMsg{
	1: i32 poseId
	2: i64 targetCharId
}

/** �����Ϊ���� */
struct SCBeMyLoverRequestMsg{
	1: i64 charId
	2: string name
}

/** ��Ϊ���½�� */
struct SCBeLoversResultMsg{
	1: struct.CloseFriendInfo info
	2: string name
	/** 1-ͬ�� 2-�ܾ� */
	3: byte result
}

/** ������Ϣ */
struct SCLoverInfoMsg{
	1: struct.CloseFriendInfo loverInfo
	2: i64 charId
}

/** ���¹�ϵ������Ϣ */
struct SCLoverGiftInfos{
    1: i64 loverId
	/** ���ȼ�˳������Ϣ */
	2: list<FriendShipLvlPrize> LvlPrizes
}

/** ��ȡ���½����ɹ� */
struct SCGetLoverGiftSucc{
	/** ����id */
	1: i64 charId
	/** ��ȡ�����¹�ϵ�ȼ� */
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

/** ������ָı����Ҫ֪ͨ�����������������Ϣ */
struct SCFriendChangeNameMsg{
	1: i64 charId;
	2: string charName;
}

/** ��Ҹı����ǩ�� */
struct SCUpdateMoodMessage{
	1: string moodMessage;
}