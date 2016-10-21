include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 查询竞技房间信息 */
struct CSQueryDanceRoomInfosMsg{
	/** 分页信息查询参数 */
	1: struct.CommonDataPageInfoQueryParam pageInfoQueryParam
	2: struct.RoomChannel channel
	/** 模式 */
	3: byte mode
	/** 0,all rooms   1,wait rooms*/
	4: byte queryType
	/** 0-全部 1-附近 */
	5: byte queryStyle
}

/** 请求对应id的竞技房间信息 */
struct CSQueryDanceRoomByIdsMsg{
	/** 请求对应id的信息参数 */
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

/** 玩家当前歌曲下载进度 */
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

/** 请求修改房间名 */
struct CSChangeRoomTitleMsg{
	1: string roomTitle
}

struct CSJoinDanceRoomMsg{
	1: i32 roomId
	2: string password
}

/** 房间内衣橱开关操作 */
struct CSWardrobeOperInRoomMsg{
    /** 0-关 1-开 */
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

/** 请求对房间内的成员做动作 */
struct CSRequestRoomActionMsg{
	1: i32 actionId
	/** 动作目标角色id */
	2: i64 targetCharId
}

/** 响应做动作请求 */
struct CSResponseRoomActionMsg{
	1: i32 actionId
	/** 请求动作角色id */
	2: i64 srcCharId
	/** 同意-1 拒绝-0 */
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

/** 转让房主 */
struct CSTransferRoomLeader{
    /** 转让的成员id */
	1: i64 memberCharId
}

/** 设置玩家状态为观战 */
struct CSSetRoomWatcher{
    /** 成员id */
	1: i64 memberCharId
}

/** 将玩家从观战改为参战 */
struct CSSetWatcherToDancer{
    /** 观战者id */
	1: i64 watcherCharId
}

struct CSDivorceMsg {

}

/** 设置自己的准备状态 */
struct CSSetRoomReadyStatus{
	1: bool isReady
}
