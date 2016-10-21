include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

//快速登录消息
struct CSQuickLoginMsg{
	1: string fVal
	2: string deviceId
	3: string macId
	4: string deviceType
	5: string deviceVersion
	6: string version
	7: string deviceMode
	8: i16 resourceVersion
	9: string device
	
	100: string gsId
}

//使用用户名密码登录消息
struct CSUserPasswdMsg{
	1: string name
	2: string passwd
	3: string deviceId
	4: string macId
	5: string deviceType
	6: string deviceVersion
	7: string version
	8: string deviceMode
	9: string fVal
	10: i16 resourceVersion
	11: string device
	12: bool reconnect
	13: string gsId
}

/** 客户端进行渠道sdk验证登录， 修改login_gate时再修改该消息， 删除多余字段 */
struct CSChannelUserLoginMsg{
    /** 设备uuid */
	1: string deviceId
	2: string macId
	3: string deviceType
	4: string deviceVersion
	/** 设备平台 */
	5: string devicePlatform
	/** 设备型号 */
	6: string deviceModel
	/** 客户端版本号 */
	7: string version
	8: string fVal
	/** 登录的游戏服id（修改login_gate时删除）*/
	9: string gsId
	/** 正常登录的sdk参数 */
	10: struct.ChannelNeteaseLoginParam neteaseParam
}

/** 客户端在login_gate验证通过后，凭返回的gameSession到游戏服验证登录 */
struct CSTokenLoginMsg{
    /** 设备uuid */
	1: string deviceId
	2: string macId
	3: string deviceType
	4: string deviceVersion
	/** 设备平台 */
	5: string devicePlatform
	/** 设备型号 */
	6: string deviceModel
	/** 客户端版本号 */
	7: string version
	/** 运营渠道 */
	8: string appChannel
	/** 登录渠道 */
	9: string channelName
	/** 渠道sdk获得的平台 */
	10: string channelPlatform
	/** 玩家登录的移动设备号，通过UniSDK提供的接口获取 */
	11: string channelUdid
	/** 游戏自己维护的session */
	12: string gameSession
	/** 是否断线重连 */
	13: optional bool isReconnect
	/** 登录的游戏服id */
	14: optional string gsId
	/** 网络运营商 */
	15: string networkIsp
	/** 网络类型 */
	16: string networkType
	17: i32 deviceHeight
	18: i32 deviceWidth
	/** root 越狱标记 0为非越狱(安卓root),1为越狱(安卓rootroot),2为模拟器 */
	19: i16 rootMark
	/** sdk 版本*/
	20: string sdkVersion
	/** cpid*/
	21: string cpid
}

/** Temp user bind normal user passportId. */
struct CSTempUserBindMsg{
	/** normal user name */
	1: string userName
	/** normal user password */
	2: string pswd
}

/** 切换账号 */
struct CSChangeAccountMsg{

}

/** 检查账号类型 */
struct CSCheckAccountTypeMsg{

}

struct CSChannelAddictionMsg{
	1: bool isAddiction
}


struct CSAgentUserLoginMsg{
	1: string deviceId
	2: string macId
	3: string deviceType
	4: string deviceVersion
	5: string version
	6: string deviceMode
	7: struct.AgentSohaLoginParam sohaParam

	30: string fVal
	31: i16 resourceVersion
	32: string device
	
	100: string gsId
}

struct CSBindUserNameMsg{
	1: string userName
	2: string pswd
	3: i64 bindCharId
}

struct CSSelectCharMsg{
	1: i64 selectCharId
}

/** 查询游戏线信息 */
struct CSQueryGameLineInfo{
	/** 版本号 */
	1: i32 version
}

/** 游戏内换线 */
struct CSChangeGameLineMsg{
	/** 切换到的目标游戏服id */
	1: string targetGameServerId
}

