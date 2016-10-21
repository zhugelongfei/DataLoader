include "struct.thrift"
include "ground.sc.thrift"
include "announce.sc.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** ����������Ϣ */
struct SCDanceRoomInfosMsg{
	1: i16 danceRoomCount
	2: struct.RoomChannel channel
	3: byte mode
	4: i16 curWaitRoomCount
	/** 0-ȫ�� 1-���� */
	5: byte queryStyle
	/** ���������ҳ��Ϣ */
	6: struct.CommonDataPageInfos danceRoomPageInfos
}

/** ��Ӧid�ľ���������Ϣ */
struct SCQueryDanceRoomByIdsResponse{
	/** �����Ӧid����Ϣ��Ӧ */
	1: struct.CommonDataQueryByIdsResponse queryByIdsResponse
}

/** �������³����ز��� */
struct SCWardrobeOperInRoomMsg{
    /** 0-�� 1-�� */
	1: byte status
	/** �³�������ɫid */
	2: i64 operCharId 
}

struct SCChapterInfoResultMsg{
    1: i32 chapterTaskId
	2: i32 chapterNameId
	3: i32 musicid
	4: byte level
	5: byte mode
	6: list<struct.CourseTaskProcess> couterProcessList
	/** 1�ǽ��� */
	7: struct.PrizeInfo oneStarPrizeInfos
	/** 2�ǽ��� */
	8: struct.PrizeInfo twoStarPrizeInfos
	/** 3�ǽ��� */
	9: struct.PrizeInfo threeStarPrizeInfos
	10: struct.ChapterOperType operType
}

struct SCJoinDanceRoomMsg{
    1: string passwd 
	2: byte mode
	3: byte songLvl
	4: i16 songId
	5: list<struct.RoomMemberInfo> members	
	6: bool quickStart
	7: i32 roomId
	8: i64 leaderCharId
	9: bool vip
	10: bool watch
	11: struct.RoomChannel channel
	12: i16 maxMemberSize;
	/** �ȴ����� */
	13: i32 waitingScene;
	14: struct.CreateRoomType roomType;
	/** ��ʼ���� */
	15: i32 startingScene;
	16: optional i16 chapterId
	18: optional i16 raidId
	/** ������ */
	19: string roomTitle
	/**  ˢ�³���Ȫ�� */
	20: optional ground.sc.SCRefreshSpring showSpringInfo
	/** ��ǰ����ף��ֵ */
	21: optional i32 wedBlessVal
	/** ��ǰ�����ֹʱ��(/1000) */
	22: optional i32 weddingvalidTime
	/** �����Ƿ���� */
	23: optional bool weddingFinish
	/** ͨ����Ϣ���� */
	24: optional announce.sc.SCUpdateAnnounceInfos updateAnnounceInfos
	/** ��ǰ������ */
	25: optional byte weddingStep
	/** ��������ID */
	26: optional i64 brideID
	/** ��������ID */
	27: optional i64 bridegroomID
}

struct SCUpdateRoomLockStateMsg{
	1: byte lockState
	2: bool watch
	3: string pswd
	4: i32 stageId
}

struct SCExitInviteRoomMsg{
	1: i64 charId
}

/** �޸ķ����� */
struct SCChangeRoomTitleMsg{
	1: string roomTitle
}

struct SCUpdateRoomMusicMsg{
	1: optional byte mode
	2: optional byte songLvl
	3: optional i16 songId
	4: optional string pswd
	5: optional i32 stageId
}

/** �ȴ������޸�ͨ�� */
struct SCChangeAnnounceInRoom{
	/** ͨ��id */
	1: i32 announceId;
	/** ͨ������ */
	2: byte announceIndex
	/** �������ֺ�ģʽ��Ϣ */
	3: SCUpdateRoomMusicMsg updateMusicModeInfo
	/** ͨ����ʾid */
	4: optional i32 announceTipId;
}

struct SCAddRoomMemberMsg{
	1: struct.RoomMemberInfo memberInfo
}

struct SCDanceRoomNoticeMsg{
	1: i32 tipId
	2: list<string> argv
}

struct SCInvitePlayerInfosMsg{
	/** 0-stranger 1-friend */
	1: byte relation
	2: list<struct.InvitePlayerInfo> playerInfos
}

struct SCInvitedJoinDanceRoomMsg{
    1: struct.CreateRoomType roomType;
	2: i32 roomId
	3: string inviterName
	4: i64 inviterCharId
}

struct SCSearchInvitePlayerInfosMsg{
	/** 0-stranger 1-friend */
	1: byte relation
	2: list<struct.InvitePlayerInfo> playerInfos
}


struct SCPrepareDanceStatusMsg{
	/** 0-load music 1-load finish 2-*/
	1: byte status
	2: i64 charId
}

/** ��ҵ�ǰ�������ؽ��� */
struct SCRoomLoadMusicProcessMsg{
    /** 0-100 */
	1: byte process
	2: i64 charId
}

struct SCBeginLoadMusicMsg{

}

struct SCBeginCountDownMsg{

}

struct SCRoomActionMsg{
	1: i64 charId
	2: i32 actionId
	/** ����Ŀ��id */
	3: optional i64 targetCharId
}

/** �������������Լ������� */
struct SCBeRequestedRoomActionMsg{
	1: i32 actionId
	/** �������Ľ�ɫid */
	2: i64 srcCharId
}

/** �Է����ڵĳ�Ա���������󱻾ܾ� */
struct SCReqRoomActionBeRefused{
	/** ����Ŀ���ɫid */
	1: i64 targetCharId
	/** Ŀ�굱ǰ��Ϊ״̬GroundActionStatus */
	2: optional byte targetActionStatus
}

struct SCSitDownMsg{
	1: i64 charId
	2: i16 seatId
}

struct SCStandUpMsg{
	1: i64 charId
	2: i16 seatId
}

struct SCReplaceLeaderMsg{
	1: i64 oldLeaderCharId
	2: i64 newLeaderCharId
}

struct SCInputRoomPasswordMsg{
	1: i32 roomId
}

struct SCRoomCountDownProcessMsg{
	1: byte remainTimes
}

struct SCSyncDanceProcessMsg{
	1: i16 musicProcess
	2: struct.RoomState state
}

struct SCUpdateRoomScene{
	/** �ȴ�����-���ڵȴ���������ѡ��Ԥ�� */
	1:optional list<i32> activeWaitingScene
	/** ��ʼ���� */
	2:optional list<i32> activeStartingScene
}

/** ת�÷����ɹ� */
struct SCTransferRoomLeader{
    /** �ɷ���id */
	1: i64 oldLeaderCharId
	 /** �·���id */
	2: i64 newLeaderCharId
}

/** ���³�Ա��׼��״̬ */
struct SCUpdateRoomReadyStatus{
    1: i64 memberCharId
	2: bool isReady
}