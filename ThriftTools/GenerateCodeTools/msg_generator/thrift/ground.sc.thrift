include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** 广场房间信息 */
struct SCGroundRoomInfos{
	/** 0-全部 1-附近 */
	1: byte queryType
	/** 广场分页信息 */
	2: struct.CommonDataPageInfos groundRoomPageInfos
}

/** 对应id的广场信息 */
struct SCQueryGroundRoomByIdsResponse{
	/** 请求对应id的信息响应 */
	1: struct.CommonDataQueryByIdsResponse queryByIdsResponse
}

/** 更新玩家广场区域状态 */
struct SCUpdateGroundArea{
	1: i64 charId
	/** 区域GroundPlayerStatus */
	2: byte groundStatus
	/** 新的坐标 */
	3: double posX
	4: double posY
	5: double posZ
}

/** 进入广场行为状态 */
struct SCEnterGroundActionStatus{
	1: i64 charId
	/** 行为状态GroundActionStatus */
	2: byte actionStatus
	/** 广场部件id */
	3: optional i32 objId
	/** 广场部件参数 */
	4: optional i32 objParam
}

/** 广场交互动作解锁信息 */
struct GroundRoomAction
{
	/** 交互动作id */
	1: byte id;
	/** 是否解锁 */
	2: bool isOpen;
}

/** 更新广场交互动作解锁信息 */
struct SCUpdateGroundActionInfo{
	/** 开放的广场交互动作信息 */
	1: list<GroundRoomAction> actionOpenInfos
}

/** 更新温泉广场奖励信息 */
struct SCUpdateSpringReward{
	/** 总共获得经验 */
	1: optional i32 rewardExp
	/** 总共获得甜蜜值 */
	2: optional i32 rewardSweet
	/** 总共获得金币 */
	3: optional i32 rewardCoin
}

/** 刷新温泉泉眼 */
struct SCRefreshSpring{
	/** 泉眼id */
	1: i32 springId
	/** 0-隐藏 1-显示 */
	2: byte showOrHide
}

/** 被邀请猜拳游戏 */
struct SCBeInvitedFingerGuess{
	1: i64 srcCharId
}

/** 开始猜拳游戏 */
struct SCStartFingerGuess{
    /** 邀请者角色id */
    1: i64 inviterCharId
	/** 被邀请者角色id */
    2: i64 beInvitedCharId
}

/** 猜拳游戏完成（广播给房间其他人） */
struct SCFingerGuessFinish{
	/** 邀请者角色id */
    1: i64 inviterCharId
	/** 邀请者出拳0-石头 1-剪刀 2-布 */
    2: byte inviterChoice
	/** 被邀请者角色id */
    3: i64 beInvitedCharId
	/** 被邀请者出拳0-石头 1-剪刀 2-布 */
    4: byte beInvitedChoice
	/** 动作id */
	5: optional i32 actionId	
}

/** 猜拳游戏结果（游戏双方接收） */
struct SCFingerGuessResult{
	/** 0-输 1-赢 2-平局 */
	1: byte result
	/** 奖励经验 */
    2: i32 awardExp
	/** 色子随到面 0 - 5 */
	3: optional byte actionIndex	
}

/** 更新广场舞蹈区热力值 */
struct SCUpdateGroundHotBar{
    1: i32 hotVal
}

/** 广场舞蹈区使用香槟成功 */
struct SCUseChampagneSucc {
    1: i64 usedCharId
    /** 香槟id */
    2: i32 ChampagneId
    /** 更新的热力值 */
    3: i32 hotVal
}

/** 温泉广场动作解锁成功 */
struct SCReqUnlockActionSucc{
    /** 动作id */
    1: i32 actionId
}

/** 泡温泉剩余时间信息 */
struct SCSpringLeftTimes{
	/** 增加经验剩余时间 */
	1: optional i32 expLeftTime
	/** 增加甜蜜值剩余时间 */
	2: optional i32 sweetLeftTime
	/** 舞蹈区增加金币剩余时间 */
	3: optional i32 coinLeftTime
}

/** 更新情侣温泉状态 */
struct SCUpdateSpringLover{
	/** 情侣状态 */
	1: struct.LoverSpringStatus status
	/** 剩余甜蜜值加成时间 */
	2: optional i32 sweetLeftTime
}

/** 放烟火成功 */
struct SCLightFireWorksSucc{
	/** 烟花道具id */
	1: i32 fireworkItemId
	/**场景特效-放烟火地点 */
	2: byte location
	/** 发送者 */
	3: i64 sender;
}