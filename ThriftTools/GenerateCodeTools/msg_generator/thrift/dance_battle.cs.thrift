namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs


struct CSBattleDanceSyncInfoMsg{
	1: byte partIndex
	2:byte inputIndex
	3:byte inputType
	/** 1-miss 2-good 3-great 4-perfect */
	4:byte keyResult
	5:byte inputDataIndex
	6:byte continueCount
}
struct CSBattleChangeTeamMsg{
	1:i64 charId
}
