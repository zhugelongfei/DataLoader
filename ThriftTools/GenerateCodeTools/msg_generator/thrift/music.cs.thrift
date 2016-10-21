include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

struct CSQueryMusicLockInfoMsg{
	1: byte model
	2: list<i16> ids
}
struct CSApplyUnlockMusicMsg{
	1: list<i16> musices
	2: struct.UnlockType unlockType
}

struct CSBuyUnlockMusicMsg{
	1: i16 musicId
	2: byte currencyType
	3: i32 count
}

struct CSExistMusicListMsg{
	/** 0、overwrite   1、append */
	1: byte type
	2: list<i16> existMusicList
}

struct CSQueryMusicHighScoreMsg{
	1: byte mode
	2: byte level
	3: i16 musicId
}

//请求单曲活动信息
struct CSQueryMusicActivityMsg{
	
}

//更换榜单
struct CSUpdateMusicRankMsg{
	1: i32 musicId
	2: byte musicLevel
	3: byte mode
	4: i32 score
	5: byte lastMusicLevel

}

struct CSQueryHotMusicListMsg{
	
}