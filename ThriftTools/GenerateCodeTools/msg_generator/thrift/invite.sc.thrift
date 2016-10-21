include "struct.thrift"
include "ground.sc.thrift"
include "announce.sc.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** 竞技房间信息 */
struct SCDanceRoomInfosMsg{
	1: i16 danceRoomCount
	2: struct.RoomChannel channel
	3: byte mode
	4: i16 curWaitRoomCount
	/** 0-全部 1-附近 */
	5: byte queryStyle
	/** 竞技房间分页信息 */
	6: struct.CommonDataPageInfos danceRoomPageInfos
}

/** 对应id的竞技房间信息 */
struct SCQueryDanceRoomByIdsResponse{
	/** 请求对应id的信息响应 */
	1: struct.CommonDataQueryByIdsResponse queryByIdsResponse
}

/** 房间内衣橱开关操作 */
struct SCWardrobeOperInRoomMsg{
    /** 0-关 1-开 */
	1: byte status
	/** 衣橱操作角色id */
	2: i64 operCharId 
}

struct SCChapterInfoResultMsg{
    1: i32 chapterTaskId
	2: i32 chapterNameId
	3: i32 musicid
	4: byte level
	5: byte mode
	6: list<struct.CourseTaskProcess> couterProcessList
	/** 1星奖励 */
	7: struct.PrizeInfo oneStarPrizeInfos
	/** 2星奖励 */
	8: struct.PrizeInfo twoStarPrizeInfos
	/** 3星奖励 */
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
	/** 等待场景 */
	13: i32 waitingScene;
	14: struct.CreateRoomType roomType;
	/** 开始场景 */
	15: i32 startingScene;
	16: optional i16 chapterId
	18: optional i16 raidId
	/** 房间名 */
	19: string roomTitle
	/**  刷新出的泉眼 */
	20: optional ground.sc.SCRefreshSpring showSpringInfo
	/** 当前婚礼祝福值 */
	21: optional i32 wedBlessVal
	/** 当前婚礼截止时间(/1000) */
	22: optional i32 weddingvalidTime
	/** 婚礼是否完成 */
	23: optional bool weddingFinish
	/** 通告信息更新 */
	24: optional announce.sc.SCUpdateAnnounceInfos updateAnnounceInfos
	/** 当前婚礼步骤 */
	25: optional byte weddingStep
	/** 婚礼新娘ID */
	26: optional i64 brideID
	/** 婚礼新郎ID */
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

/** 修改房间名 */
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

/** 等待房间修改通告 */
struct SCChangeAnnounceInRoom{
	/** 通告id */
	1: i32 announceId;
	/** 通告索引 */
	2: byte announceIndex
	/** 更新音乐和模式信息 */
	3: SCUpdateRoomMusicMsg updateMusicModeInfo
	/** 通告提示id */
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

/** 玩家当前歌曲下载进度 */
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
	/** 动作目标id */
	3: optional i64 targetCharId
}

/** 其他玩家请求对自己做动作 */
struct SCBeRequestedRoomActionMsg{
	1: i32 actionId
	/** 请求动作的角色id */
	2: i64 srcCharId
}

/** 对房间内的成员做动作请求被拒绝 */
struct SCReqRoomActionBeRefused{
	/** 动作目标角色id */
	1: i64 targetCharId
	/** 目标当前行为状态GroundActionStatus */
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
	/** 等待场景-现在等待场景不可选，预留 */
	1:optional list<i32> activeWaitingScene
	/** 开始场景 */
	2:optional list<i32> activeStartingScene
}

/** 转让房主成功 */
struct SCTransferRoomLeader{
    /** 旧房主id */
	1: i64 oldLeaderCharId
	 /** 新房主id */
	2: i64 newLeaderCharId
}

/** 更新成员的准备状态 */
struct SCUpdateRoomReadyStatus{
    1: i64 memberCharId
	2: bool isReady
}