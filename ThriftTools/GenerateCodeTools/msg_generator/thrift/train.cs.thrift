include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 请求训练信息 */
struct CSReqTrainInfo{
	/** 从0开始， 收到服务器返回信息更新版本 */
	1: i32 version
}

/** 请求开始训练 */
struct CSReqStartTrain{
    /** 职业ETrainOccupation */
    1: byte occupation
}

/** 请求购买训练次数 */
struct CSBuyTrainCount{

}