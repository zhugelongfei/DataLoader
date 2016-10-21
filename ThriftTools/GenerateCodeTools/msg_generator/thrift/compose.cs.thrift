include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 请求合成信息 */
struct CSReqComposeInfo{
    /** 合成类型 0-日常 1-活动 */
    1: byte type
    /** 1-服装 2-饰品 3-道具 */
    2: byte itemType
	/** 版本号，从0开始 */
	3: optional i32 version
}

/** 请求合成道具 */
struct CSReqComposeItem{
	/** 0-7天 1-30天 2-永久 */
	1: byte validTimeType
	2: i32 itemId
}

/** 请求进化道具 */
struct CSReqEvolveItem{
	/** 0-7天 1-30天 2-永久 */
	1: byte validTimeType
	2: i64 instanceId
}
