include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 请求发红包 */
struct CSReqMakeLuckyMoney{
	/** 红包金额大小 */
	1: i32 luckyMoneyAmount
	/** 红包个数 */
	2: i32 luckyMoneyNumber
	/** 红包类型 */
	3: struct.LuckyMoneyType luckyMoneyType
	/** 红包寄语 */
	4: string words
	/** 收红包角色id */
	5: optional i64 charId
	/** 货币数量*/
	6: i32 currenyAmount
}

/** 请求最早红包信息 */
struct CSReqFirstLuckyMoneyInfo{

}

/** 请求抢红包 */
struct CSReqGetLuckyMoney{
	/** 红包ID */
	1: i64 luckyMoneyID
}

/** 请求我发出的红包 */
struct CSReqLuckyMoneySend{
	/** 当前索引 */
	1: i16 startIndex
}

/** 请求我收到的红包 */
struct CSReqLuckyMoneyReceive{
	/** 当前索引 */
	1: i16 startIndex
}

/** 请求红包详细信息 */
struct CSReqLuckyMoneyDetial{
	/** 红包ID */
	1: i64 luckyMoneyID
}

/** 请求红包领取信息 */
struct CSReqLuckyMoneyReceivers {
	/** 红包ID */
	1: i64 luckyMoneyID
    /** 当前索引 */
	2: i16 startIndex
}