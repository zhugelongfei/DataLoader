include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 查询广场房间 */
struct CSQueryGroundRooms{
	/** 0-全部 1-附近 */
	1: byte queryType
	/** 缓存信息查询参数 */
	2: struct.CommonDataPageInfoQueryParam pageInfoQueryParam
}

/** 请求对应id的广场信息 */
struct CSQueryGroundRoomByIdsMsg{
	/** 请求对应id的信息参数 */
	1: struct.CommonDataQueryByIdsParam queryByIdsParam
}

/** 切换广场区域 */
struct CSChangeGroundArea{
	/** 目标区域GroundPlayerStatus */
	1: byte targetGroundStatus
	/** 新的坐标 */
	2: double posX
	3: double posY
	4: double posZ
}

/** 进入广场行为状态 */
struct CSEnterGroundActionStatus{
	/** 行为状态GroundActionStatus */
	1: byte actionStatus
	/** 广场部件id */
	2: optional i32 objId
	/** 广场部件参数 */
	3: optional i32 objParam
}

/** 请求广场解锁交互动作信息 */
struct CSReqGroundActionOpenInfo{

}

/** 邀请猜拳游戏 */
struct CSInviteFingerGuess{
	1: i64 targetCharId
}

/** 响应猜拳邀请 */
struct CSRespInviteFingerGuess{
	1: i64 srcCharId
	2: bool isAgreed
}

/** 猜拳游戏出手 */
struct CSFingerGuessChoice{
    /** 0-石头 1-剪刀 2-布 */
    1: byte choice
}

/** 广场舞蹈区使用香槟 */
struct CSUseChampagne{
    /** 香槟id */
    1: i32 ChampagneId
}

/** 请求解锁动作*/
struct CSReqUnlockAction{
    /** 动作ID */
    1: i32 actionId
}

/** 请求放烟花 */
struct CSReqLightFireWorks{
	/** 烟花播放位置 */
	1: byte location
	/** 烟花道具 */
	2: i32 itemId
}
