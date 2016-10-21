include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 请求签到信息 */
struct CSReqSignInInfoMsg{
	/** 签到信息版本号 */
	1: i32 version
}

/** 请求签到 */
struct CSReqSignIn{
	/** 签到月份 */
    1: byte month
	/** 签到第几天 */
	2: byte dayIndex
}