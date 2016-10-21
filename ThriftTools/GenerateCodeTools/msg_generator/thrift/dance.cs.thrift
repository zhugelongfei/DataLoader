include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

struct CSDanceStatusMsg{
	1: byte status
}


struct CSQuickStartMsg{
	1: byte	mode
	2: i16	songId
	3: byte	songLevel
	//4: byte	pNum
	/** bit 1、skip invite   2、diff music   3、diff level */
	5: byte quickStartConfig
}

struct CSPrepareDanceFinishMsg{
	
}

/** Period in dance. */
struct CSDancePeriodMsg{
	/** 0-start input, 1-show time */
	1: byte period
	2: byte index
	3: optional byte gameType
}
//同步舞蹈信息
struct CSSyncDanceInfoMsg{
	1: i16 duringTime
	2: list<byte> keyResult
	3: i16 combos
	4: i32 totalMark
	
	5: struct.DynamicInput dynamicInput
	6: struct.TraditionalInput traditionalInput
	7: struct.LoversDynInput loversDynInput
	8: struct.LoversTrdInput loversTrdInput
}

/** Finsh dancing, notice server to broadcast ranking. */
struct CSDanceFinishMsg{
	1: i32 totalMark
	2: struct.DanceGrade danceGrade
}

//重新开始舞蹈
struct CSRestartDanceMsg{

}

//退出房间
struct CSExitRoomMsg{
	
}

struct CSRandQuickMatchCharListMsg{
	
}

struct CSShowFinishMsg{
	
}

struct CSExchangePosMsg{
	1: i64 watchCharId
	2: i64 danceCharId
}


struct CSReponseWatchMsg{
	1: i32 roomId
}

struct CSLoversGameMsg{
	1: optional struct.LoversAQGameReq aqGameReq
	2: optional struct.LoversAQGameReq touchHeartGameReq
	
	10: byte gameIndex
}

struct CSChangeTeamMsg{
	1: i64 charId
}