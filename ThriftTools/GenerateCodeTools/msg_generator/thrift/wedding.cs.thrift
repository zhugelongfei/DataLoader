include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 查询婚礼动态信息 */
struct CSQueryWeddingNotices{
	/** 分页信息查询参数 */
	1: struct.CommonDataPageInfoQueryParam pageInfoQueryParam
}

/** 请求置顶自己的婚礼动态 */
struct CSReqTopSelfWeddingNotice{

}

/** 请求祝福新婚夫妻 */
struct CSReqWedingBless{
	/** 新郎角色id */
	1: i64 bridegroomId
	/** 新娘角色id */
	2: i64 brideId
}

/** 查询新婚夫妻信息 */
struct CSQueryNewlyWedsInfo{
	/** 新郎角色id */
	1: i64 bridegroomId
	/** 新娘角色id */
	2: i64 brideId
}

/** 查询婚礼房间 */
struct CSQueryWeddingRooms{
	/** 分页信息查询参数 */
	1: struct.CommonDataPageInfoQueryParam pageInfoQueryParam
}

/** 响应求婚 */
struct CSAcceptLoverProposal{
	1: i64 loverCharId
	2: bool isAccept
}

/** 完成婚礼资源加载 */
struct CSFinishLoadWeddingResourceMsg {

}

/** 开始婚礼下一步 */
struct CSNextWeddingStepMsg {
  1: struct.WeddingStep nextWeddingStep;
}

/** 婚礼答谢 */
struct CSWeddingThank {
	/** 每位答谢喜糖档位id */
	1: i32 candyBagId
	/** 答谢词 */
	2: string thankContent
}

/** 请求婚礼放烟火 */
struct CSReqWedFireworks {
	/** 烟火id */
	1: i32 fireworksId
}