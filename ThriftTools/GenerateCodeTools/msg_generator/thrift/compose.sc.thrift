include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** 合成条件 */
struct ComposeCondInfo {
   1: i32 condMsgId
   /** 是否满足条件 */
   2: bool isFit
}

/** 活动合成信息 */
struct ActivityComposeInfo {
   /** 活动说明 */
   1: string activityDesc
   /** 活动开始时间 */
   2: i32 startTime
   /** 活动结束时间 */
   3: i32 endTime
   /** 是否满足条件 */
   4: ComposeCondInfo condInfo
}

/** 合成条件信息 */
struct SCComposeCondition{
    /** 1-服装 2-饰品 3-道具 */
    1: byte itemType
	/** key-messageId val-条件信息 */
	2: map<i32, ComposeCondInfo> condInfos
}

/** 活动合成信息 */
struct SCActivityComposeInfo{
    /** 1-服装 2-饰品 3-道具 */
    1: byte itemType
	2: i32 version
	/** key-messageId val-条件信息 */
	3: map<i32, ActivityComposeInfo> composeInfos
}

/** 合成道具成功 */
struct SCComposeItemSucc{

}

/** 进化道具成功 */
struct SCEvolveItemSucc{

}