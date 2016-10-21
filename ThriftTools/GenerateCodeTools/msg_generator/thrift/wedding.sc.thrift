include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** 婚礼动态信息 */
struct SCWeddingNotices{
	/** 婚礼动态分页信息 */
	1: struct.CommonDataPageInfos wedNoticePageInfos
	/** 当前自己是否有婚房 */
	2: optional bool hasWeddingRoom
}

/** 婚礼动态祝福新婚夫妻成功 */
struct SCDynamicWeddingBlessSucc{
	/** 新郎角色id */
	1: i64 bridegroomId
	/** 新娘角色id */
	2: i64 brideId
	/** 当前祝福值 */
	3: i32 blessVal
}

/** 新婚夫妻信息 */
struct SCNewlyWedsInfo{
	/** 新郎角色id */
	1: i64 bridegroomId
	/** 新娘角色id */
	2: i64 brideId
	/** 祝福值 */
	3: i32 weddingbless
	/** 祝福值排名 */
	4: i32 weddingblessRank
}

/** 婚礼房间信息 */
struct SCWeddingRoomInfos{
	/** 婚礼房间分页信息 */
	1: struct.CommonDataPageInfos wedRoomPageInfos
}

/** 申请结婚成功 */
struct SCReqWeddingSucc{
	/** 婚房id */
	1: i32 roomId
}

/** 情侣求婚 */
struct SCLoverProposal {
	1: i64 loverCharId
	2: string loverName
}

/** 请求置顶自己的婚礼动态成功 */
struct SCTopSelfWeddingNoticeSucc{
	/** 置顶时间(/1000) */
	1: i32 topTime
}

/** 开始婚礼下一步 */
struct SCWeddingStepMsg {
	1: struct.WeddingStep nextWeddingStep;
	/** 抛绣球接收玩家角色id, 步骤为抛绣球环节才发， 为0或找不到玩家时抛给npc */
	2: optional i64 loveBallReceiveCharId
}

/** 婚礼答谢成功 */
struct SCWeddingThankSucc{
	1: i32 itemId
	2: i16 itemCount
	3: i64 charId
	/** 执行的特效参数 */
	4: list<struct.FuncParam> funcParams
	5: string content
}

/** 婚礼祝福成功 */
struct SCWeddingBlessSucc {
    /** 当前祝福值 */
	1: i32 blessVal
	/** 来自玩家名 */
	2: string fromCharName
}

/** 婚礼放烟火 */
struct SCWedFireworks {
	/** 烟火id */
	1: i32 fireworksId
	/** 放烟火角色名 */
	2: string charName
	/** 幸福值*/
	3: i32 blessVal
}