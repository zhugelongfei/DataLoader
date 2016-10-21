include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** ��ѯ����������Ϣ */
struct CSQueryDanceRoomInfosMsg{
	/** ��ҳ��Ϣ��ѯ���� */
	1: struct.CommonDataPageInfoQueryParam pageInfoQueryParam
	2: struct.RoomChannel channel
	/** ģʽ */
	3: byte mode
	/** 0,all rooms   1,wait rooms*/
	4: byte queryType
	/** 0-ȫ�� 1-���� */
	5: byte queryStyle
}

/** �����Ӧid�ľ���������Ϣ */
struct CSQueryDanceRoomByIdsMsg{
	/** �����Ӧid����Ϣ���� */
	1: struct.CommonDataQueryByIdsParam queryByIdsParam
}

struct CSCreateDanceRoomMsg{
	1: optional string password
	2: optional byte mode
	3: optional i16 musicId
	4: optional struct.RoomChannel channel
	5: optional byte lvl
	6: optional bool watch
	7: string title 
	8: struct.CreateRoomType roomType
	9: optional i16 tourRaidId
}

struct CSRandJoinDanceRoomMsg{
	1: byte mode
	2: struct.RoomChannel channel
}

/** ��ҵ�ǰ�������ؽ��� */
struct CSRoomLoadMusicProcessMsg{
        /** 0-100 */
	1: byte process
}

struct CSSetRoomMusicMsg{
	1: byte mode
	2: byte songLvl
	3: i16 songId
	4: string pswd
	5: i32 stageId
}

/** �����޸ķ����� */
struct CSChangeRoomTitleMsg{
	1: string roomTitle
}

struct CSJoinDanceRoomMsg{
	1: i32 roomId
	2: string password
}

/** �������³����ز��� */
struct CSWardrobeOperInRoomMsg{
    /** 0-�� 1-�� */
	1: byte status
}

struct CSKickOutRoomMemberMsg{
	1: i64 memberCharId
}

struct CSReqStartRoomDanceMsg{

}

struct CSRandJoinChapterRoomMsg{

}

struct CSPrepareDanceStatusMsg{
	/** 0-load music 1-load finish 2-*/
	1: byte status 
}

struct CSDanceRoomLockOperMsg{
	1: string password
	2: bool watch
}

struct CSQueryInvitePlayerInfosMsg{
	/** 0-stranger 1-friend */
	1: byte relation
}

struct CSInviteJoinDanceRoomMsg{
	1: i64 inviteCharId
}

struct CSInviteJoinRoomRespMsg{
	/** 0- reject 1-agree */
	1: byte respResult
	/** the inviter char id */
	2: i32 roomId
	3: i64 invterCharId
}

/** ����Է����ڵĳ�Ա������ */
struct CSRequestRoomActionMsg{
	1: i32 actionId
	/** ����Ŀ���ɫid */
	2: i64 targetCharId
}

/** ��Ӧ���������� */
struct CSResponseRoomActionMsg{
	1: i32 actionId
	/** ��������ɫid */
	2: i64 srcCharId
	/** ͬ��-1 �ܾ�-0 */
	3: byte result
}

struct CSRoomActionMsg{
	1: i32 actionId
}

struct CSSitDownMsg{
	1: byte seatId
}

struct CSStandUpMsg{
	
}

/** ת�÷��� */
struct CSTransferRoomLeader{
    /** ת�õĳ�Աid */
	1: i64 memberCharId
}

/** �������״̬Ϊ��ս */
struct CSSetRoomWatcher{
    /** ��Աid */
	1: i64 memberCharId
}

/** ����Ҵӹ�ս��Ϊ��ս */
struct CSSetWatcherToDancer{
    /** ��ս��id */
	1: i64 watcherCharId
}

struct CSDivorceMsg {

}

/** �����Լ���׼��״̬ */
struct CSSetRoomReadyStatus{
	1: bool isReady
}
