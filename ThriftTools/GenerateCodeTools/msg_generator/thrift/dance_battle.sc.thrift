include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

struct SCBattleDanceInputInfoMsg{
	1: list<struct.BattleDancePartData> data
}
struct SCBattleDanceTeamInfoMsg{
	1:list<struct.BattleDanceTeamInfo> teamInfo
}

struct SCBattleDanceSyncInfoMsg{
	1: byte partIndex
	2: byte inputIndex
	3: i64 charId
	/** 1-miss 2-good 3-great 4-perfect */
	4:byte keyResult
	5:i32 totalMark
	6:byte inputDataIndex
	7:i32 partMark
	8:i16 curCombo
}

struct SCBattleDancePartResultInfoMsg{
	1:optional byte winTeamId
	2:map<i64,i32> actions
}


