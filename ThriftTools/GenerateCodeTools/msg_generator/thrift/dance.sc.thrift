include "struct.thrift"
include "tour.sc.thrift"
include "announce.sc.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

struct SCDanceStatusMsg{
	1: i64 charId
	2: byte	status
}

struct SCReturnDanceRoomMsg{
	
}

struct SCStartDanceMsg{
        /** 0-quick 1-create room */
	1: byte quickState
}

struct SCQuickDanceEnterInfoMsg{
    1: list<struct.QuickMatchDancer> dancerList
}

struct SCRestartDanceMsg{
	1: i32 randParam
	2: i16 startActionId
	3: list<i16> finishActionIds
	4: byte stageId
	5: byte lightId
	6: list<struct.SimplePartnerInfo> simplePartnerInfos
}
//这应该是一个过期的消息体,没用了
struct SCSyncDanceInfoMsg{
	/** dance or not */
	1: byte danceState
	/** number of song frame */
	2: byte frameNum
	3: byte songId
}
//todo:变成一条记录
struct SCSyncMarkInfoMsg{
	1: list<struct.DanceSyncMarkInfo> marks
}

//发送舞蹈结果
struct SCDanceMarkResultMsg{
	/** all dancer's rank */
	1: list<struct.DanceMarkInfo> marks
	2: i16 coupon
	3: struct.BattleFinishInfo battleInfo
	4: i16 exp
	5: i16 cup
	6: i16 appendCoupon
	7: i16 appendExp
	8: list<struct.ItemPrize> cardItemPrizes
	9: i32 totalPerfect
	10: i32 totalGreat
	11: i32 totalGood
	12: i32 totalMiss
	13: i32 totalMark
	14: i32 totalMaxPerfectCombo
	15: i32 totalMaxCombo
	16: i32 totalMarkRate
	17: i32 totalMasterPerfectRate
	18: byte avgGrade
	19: byte totalStars
	20: optional tour.sc.TourDancePassResult tourDanceResultMsg
	22: optional announce.sc.AnnouncePassInfo announcePassInfo
}

struct SCExitRoomMsg{
	1: i64 charId
	2: bool kickOut
}

struct SCReturnDanceRoomMsg{
	1: i64 charId
	/** 0:Dancing outside  1:Ready Dance  2:Dance within */
	2: byte danceState
	3: byte mode
	4: i16 songId
	5: byte	songLevel
	6: i16 startActionId
	7: list<i16> finishActionIds
	8: byte stageId
	9: byte lightId
	10: i32 curDuringTime
	11: list<struct.PartnerInfo> partners
	12: list<struct.DanceMarkInfo> marks
}

struct SCStartPrepareDanceMsg{
	1: i64 charId
	2: byte mode
	3: i16 songId
	4: byte songLevel
	5: i16 beginShowId
	7: byte stageId
	8: byte lightId
	9: i32 randParam
	10: list<struct.PartnerInfo> partners
	
}

struct SCQuickMatchCharListMsg{
	1: list<struct.QuickMatchDancer> quickMatchCharList
}

struct SCBeginShowMsg{
	
}

/** 动感模式输入数据， 由一系列的输入片段组成，适用于T台，写真等特殊玩法 */
struct SCGenerateDynamicInputMsg{
	/**  输入音乐id序列 */
	1: list<struct.DynamicSegmentInputs> inputMusicGroups;
}

/** 传统模式输入数据， 由传统模式输入id和关键点序列组成 */
struct SCGenerateTraditionalInputMsg{
	/**  一组输入片段序列 */
	1: list<struct.TradSegmentInput> inputInfos;
}

struct SCDanceInputStatusMsg{
	/** 1:all combo 2:all perfect combo */
	1: map<i64, byte> statusMap
}


struct SCAskCanWatchMsg{
	1: i32 roomId
}

struct SCLoversModeInitMsg{
	1: optional struct.LoversDynInit dynInit
	2: optional struct.LoversTrdInit trdInit
	3: i32 inputSyncSendMsgTime
	4: i32 touchHeartSendMsgTime
	5: i16 maxPower
	
	10: list<struct.LoversGame> gameList
}

struct SCLoversGameMsg{
	1: optional struct.LoversAQGameResp aqGameResp
	2: optional struct.LoversTouchHeartGameResp touchHeartGameResp
	
	10: byte gameIndex
}

struct SCSyncTeamInfoMsg{
	1: list<struct.TeamInfo> teams
}

struct SCDanceBurstMsg{
	1: i16 beginNodeIndex
	2: i16 endNodeIndex
}

struct SCSyncTouchHeartProcessMsg{
	1: byte partenerIndex
}