namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc
include "struct.thrift"
struct SCTempUserBindResMsg{
	/** 0-fail 1-succ */
	1: byte result
	/** 0-ilegal uer 1-already bind 2-binded user has char 3-bind fail */	
	2: byte errorCode
}

struct SCCheckBindUserPasswdMsg{
	/** quick login bind user name */
	1: string bindUserName
}

struct SCSetCookieMsg{
	1:string cookie
	2: i64 accountId
}

struct SCExitClientMsg{
	1: byte remainTimes
	2: i32 tipId
}

/** 切换账号成功 */
struct SCChangeAccountSucc{

}

/** 平台登录返回的token信息 */
struct SCLocalTokenMsg{
	1: optional string token
	/** sdk返回的用户id， 非账号id */
	2: optional string userId
	/** 部分渠道要返回秘钥，如360 */
	3: optional string clientSecret
	/** 游戏自己维护的session */
	4: string gameSession
}

struct SCBindUserNameResMsg{/** 0-fail 1-succ */
	1: byte result
	/** 0-ilegal uer 1-already bind 2-binded user has char 3-bind fail */	
	2: byte errorCode
	3: i64 bindCharId;
}
struct SCUserCharListMsg{
	1: i64 bindCharId;
	2: list<struct.SimpleBusinessCardInfo> charList;
}

/** 游戏服状态 */
enum GameLineStatusType{
	/** 顺畅 */
	NORMAL
	/** 繁忙 */
	BUSY
	/** 拥挤 */
	FULL
	/** 维护 */
	MAINT
}

/** 游戏线信息 */
struct GameLineInfo{
    /** 游戏线id */
	1: string serverId
	/** 游戏线名称 */
	2: string serverName
	/** 游戏线状态 */
	3: GameLineStatusType status
	/** 在线占上限比例(0-100) */
	4: byte onlineRatio
}

/** 查询游戏线信息 */
struct SCGameLineInfo{
	/** 版本号 */
	1: i32 version
	2: list<GameLineInfo> gameLineInfos
}

/** 游戏内换线结果 */
struct SCChangeGameLineMsg{
	/** 玩家当前游戏服id */
	1: string gameServerId
}

/** 账号类型 */
struct SCAccountTypeMsg{
    /** 是否gm */
	1: optional bool isGM
}

