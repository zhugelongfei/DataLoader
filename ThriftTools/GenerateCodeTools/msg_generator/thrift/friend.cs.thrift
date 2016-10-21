include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** ͨ��charId����Ӻ��� */
struct CSAddFriendMsg{
	/** ��Ӻ���id */
	1: i64 friendCharId
	2: byte source
}

/** ��ѯ������Ϣ */
struct CSQueryFriendListMsg{
    /** ��ѯ���� */
	1: struct.QueryFriendType queryFriendType
}

/** ͨ��charIdɾ������ */
struct CSDeleteFriendMsg{
	/** ɾ������id */
	1: i64 friendCharId
}

/** ��Ƭ�������� */
enum BusinessCardDetailType {
    /** ���κ����� */
    JEWELRY
	/** ��ϵ���� */
	RELATION
}

/** ��ʾ��������Ϣ */
struct CSShowPlayerAppearanceInfo{
     1: i64 firstCharId
	 2: i16 tid
	 3: optional i64 secCharId
}

/** ��ʾ��Ƭ */
struct CSShowBusinessCardInfo{
	1: i64 friendCharId
	2: i16 tid
	3: string findPlayName
	4: i32 version
}

/** ��ʾ��Ƭָ����Ϣ�������� */
struct CSShowBusinessCardDetailMsg{
	1: i64 friendCharId
	/** ��Ƭ��������BusinessCardDetailType */
	2: byte detailType
	/** ��ʾ�ڼ�ҳ���� */
	3: i16 pageNum
}

/** �����Ϊ���� */
struct CSAddCloseFriendMsg{
	1: i64 friendCharId
	2: string friendName
}

/** ��Ӧ��Ϊ�������� */
struct CSAcceptCloseFriendMsg{
    /** ���󷽽�ɫid */
	1: i64 charId
	/** �Ƿ�ͬ�� */
	2: bool agreed 
}

/** ��������������Ϣ */
struct CSGetCloseFriendInfos{
	/** ������Ϣ�����Ľ�ɫid */
	1: i64 charId
}

/** ����������Ϣ */
struct CSGetCloseFriendInfo{
	/** ������Ϣ�����Ľ�ɫid */
	1: i64 charId
	/** ���ѽ�ɫid */
	2: i64 closeFriendCharId
}

/** ����ɾ������ */
struct CSReqDeleteCloseFriend{
	1: i64 charId
}

/** �������ѹ�ϵ������Ϣ */
struct CSReqCloseFriendGiftInfos{
	/** ����id */
	1: i64 charId
}

/** ��ȡ���ѽ��� */
struct CSGetCloseFriendGiftMsg{
	/** ����id */
	1: i64 charId
	/** ��ȡ�����ѹ�ϵ�ȼ� */
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
	/** ��ѯ�Ա� 0-�� 1-Ů 2-ȫ�� */
	2: byte sex
}
struct CSSaveBusinessCardInfoMsg{
	1:struct.BusinessCardInfo info
}
struct CSPicUploadMsg{
	1:string pic	
	/** ����ͼ */
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
	/** ��ѯ�Ա� 0-�� 1-Ů 2-ȫ�� */
	3: byte sex
}

struct CSUpdateGeoInfoMsg{
	1: double longitude
	2: double latitude
	3: string location
}

/** ��һ��������� */
struct CSTouchFriendMsg{
    /** �����岿λ */ 
	1: byte touchPosition
	2: i64 targetCharid
	 /** �Ƿ�����һ���� 0-�� 1-�� */ 
	3: byte isTodayFirst
}

struct CSTouchRecordsMsg{
	1: i64 charid
}

/** �޸����ѻ����¼�Ĺ�ϵ�ƺ� */
struct CSSaveRelationshipMsg{
	1: string relationship
	2: i64 toCharId
}

/** ʹ�����ѻ����¼�Ĺ�ϵ�ȼ��ƺ� */
struct CSUseRelationshipMsg{
	1: byte relationshipLvl
	2: i64 toCharId
}

/** �޸����ѻ����¼������ */
struct CSSaveMoodWordsMsg{
	1: optional string textWords
	2: optional string soundId
	3: i64 toCharId
}

struct CSSavePoseMsg{
	1: i32 poseId
	2: i64 toCharId
}

/** �����Ϊ���� */
struct CSBeMyLoverMsg{
	1: i64 charId
	2: string name
}

/** ��Ӧ��Ϊ�������� */
struct CSAcceptLoverMsg{
	1: i64 charId
	2: string name
	3: bool agreed 
}

/** ����������Ϣ */
struct CSLoverInfoMsg{
	1: i64 charId
}

/** �������¹�ϵ������Ϣ */
struct CSReqLoverGiftInfos{
	/** ����id */
	1: i64 charId
}

/** ��ȡ���½��� */
struct CSGetLoverGiftMsg{
	/** ����id */
	1: i64 charId
	/** ��ȡ�����¹�ϵ�ȼ� */
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
	/** 0: ��ͨ���� 1�� ���� */
	1: byte friendType
}

/** �ܾ��������� */
struct CSRefuseFriendApplyMsg{
    /** ���󷽽�ɫid */
	1: i64 charId
}