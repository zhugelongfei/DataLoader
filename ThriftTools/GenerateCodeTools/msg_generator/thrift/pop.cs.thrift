include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

struct CSCharAndPopularityRewardsMsg{
	1: i32 type
}
struct CSTakeCharAndPopularityRewardsMsg{
	1: i32 type
	2: i32 level
}