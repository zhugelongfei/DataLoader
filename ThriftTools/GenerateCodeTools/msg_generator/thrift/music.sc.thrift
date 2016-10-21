include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

struct SCMusicLockInfoMsg{
	1: map<i16,byte> data
}
struct SCUnlockMusicMsg{
	1: map<i16,byte> unlockMusices
	2: struct.UnlockType unlockType
}

struct SCMusicHighScoreMsg{
	1: byte mode
	2: byte level
	3: i16 musicId
	4: i32 score
}

struct SCQueryMusicActivityMsg{
	1: string title
	2: i64 startTime
	3: i64 endTime
	4: list<i16> musicIdList				//¸èÇúidÁÐ±í
	5: list<list<struct.MusicRankPrize>> prizes			
	
}

struct SCUpdateMusicRankInfoMsg{
	1: i32 lastMusicId
	2: byte musicLevel
	3: i16 curretRank
	4: i32 score

}

struct SCHotMusicListMsg{
	1: list<i16> hotMusicList
}