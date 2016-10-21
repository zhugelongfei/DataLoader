include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

//查询音乐记录消息
struct CSQueryMusicRecordMsg{
	1: byte mode
	2: i16 musicId
	3: byte level
	4: i32 startIndex
	5: i32 endIndex
}

//聊天相关
struct CSWhisperMsg{
	1: string	content
	2: string	soundNameKey
	3: string	targetName
	4: i64 targetCharId
}

/** 聊天广播*/
struct CSBroadcastChatMsg{
	/** 聊天类型的索引*/
	1: byte	scope
	/** 聊天内容*/
	2: optional string	content
	/** 语音聊天key*/
	3: optional string	soundNameKey
	/** 自动喇叭索引*/
	4: optional i32 sendAutoSpeakerIndex
	
}

struct CSTakeSlotPrizeMsg{

}

//绑定第三方帐号
struct CSBind3rdAccountMsg{
	1: struct.BindAccountType bindType
	2: i64 bind3rdAccountId
	3: bool force
}

struct CSUnBind3rdAccountMsg{
	1: struct.BindAccountType bindType
}

//查询第三方帐号在游戏中绑定信息
struct CSQueryBind3rdInfoMsg{
	1: struct.BindAccountType bindType
	/** 3rd account */
	2: list<i64> accountIds
	3: i32 index
}

struct CSGenerateOrderMsg{
	/**价格档位 */
	1: i32  priceID
	/**支付渠道 */
	2: string payChannel
	/** 充值红包数据*/
	3: optional struct.RechargeLuckyMoney rechargeLuckyMoney

}

struct CSQueryRechargeSuccOrderMsg{
	
}

struct CSCheckRechargeResultMsg{

	/** cp订单号，也即游戏订单号*/
	1: string sn
	/** 玩家购买游戏商品id*/
	2: i32 goodsId
	/**支付渠道 */
	3: string payChannel;
	/** 额外参数*/
	4: string extraParam
		
}