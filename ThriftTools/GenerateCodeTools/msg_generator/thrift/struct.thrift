namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto

enum NumberType{
	COUPON
	IB
	FREE_IB
	EXP
	/** 人气值 */
	POP
	/** 通告币*/
	ANNOUNCE_IB	
	/** 客户端初始化使用 */
	NONE=1000
}

enum VersionUpdateType{
	None
	NoForce
	Force
}

enum PicAction{
	UP
	DOWN
	DEL
	GIFT
	SHARE
	HEAD
	MAX
	
}
enum DanceGrade {
	SSS
	SS
	S
	A
	B
	C
}

enum LotteryType {
	FRUITSLOT
	LOTTERY
}

enum Constellation{
	ARIES
	TAURUS
	GEMINI
	CANCER
	LEO
	VIRGO
	LIBRA
	SCORPIO
	SAGITTARIUS
	CAPRICORN
	AQUARIUS
	PISCES
	MAX
}

enum LuckDay{
	MONDAY
	TUESDAY
	WEDNESDAY
	THURSDAY
	FRIDAY
	SATURDAY
	SUNDAY
}

enum PointOrderStatus {
	INIT
	SUCCESS 
	RECHARGE_FAILE
	SEND_MAIL_FAILE
	DISCARD
	APPEAL
	DEALED
	SEND_CHECK_CODE_FAILE
}

enum PointMallErrorCode {
	SEND_EMAIL_CODE_FAILE   //发送验证码到邮箱失败
	EMAIL_CODE_TIMEOUT      //邮箱验证码已经超时
	EMAIL_CODE_ERROR        //邮箱验证码输入错误
	SEND_ORDER_CODE_FAILE   //订单验证码发送失败
	ORDER_CODE_TIMEOUT      //订单验证码超时
	ORDER_CODE_ERROR        //订单验证码校验错误
	JNET_RECHARGE_FAILE     //骏网充值失败
	SEND_CARD_PASSWORD_FAILE  //充值成功，但是发送卡密到玩家邮箱失败
}

enum OperType{
	//版本检测
	VERSION_CHECK
	//更新avatar
	CHANGE_AVATAR
	//调节avatar
	ADJUST_AVATAR
	//从购物车购买
	BUF_FROM_SHOPCART
	//保存喜爱套装
	SAVE_FAVORITES
	//穿上喜爱套装
	PUT_FAVORITES
	//领取GM奖励
	GET_GM_PRIZE
	//请求充值信息
	QUERY_IAP
	//充值
	RECHARGE
	//发送语音邮件
	SEND_VOICE_MAIL
	
}

enum OperResultType{
	FAIL
	SUCC
}

enum VipDiamond{
	RED
}

/** 婚礼动态信息状态 */
enum WeddingNoticeState{ 
    /** 即将开始 */
	WED_INIT
	/** 进行中 */
	WED_START
	/** 完成 */
	WED_END
}

/** 婚礼流程步骤 */
enum WeddingStep{
	/** 初始 */
	WEDDING_INIT = 0
	/** 开始 */
	WEDDING_START
	/** 新人入场 */
	WEDDING_ENTRANCE
	/** 爱情宣誓 */
	WEDDING_SWEAR
	/** 交换戒指 */
	WEDDING_EXCHANGE_RING
	/** 完成婚礼成为夫妻 */
	WEDDING_BECOME_COUPLE
	/** 答谢 */
	WEDDING_THANKS
	/** 抛绣球 */
	WEDDING_THROW_BALL
	/** 集体照 */
	WEDDING_PHOTO
	/** 放烟火 */
	WEDDING_FIREWORK
	/** 结束 */
	WEDDING_END
}

enum WorldNoticeType{
	DEFALUT
	Slot
}

struct NumberPrize{
	1: i32 messageId
	2: NumberType numbertype
	3: i32 count
}

struct MoneyPrize{
	/** 0- ib 1-coupon */
	1: byte currencyType
	2: i32 count
}

/** 时尚奖励 */
struct FashionPrize{
	1: i32 fashionId
	3: byte validTimeType
}

/** 徽章奖励 */
struct BadgePrize{
	1: i32 badgeId
	3: byte validTimeType
}

/** 道具奖励 */
struct ItemPrize{
	/** item template id */
	1: i32 itemId
	2: i32 count
	3: byte validTimeType
	4: i32 remainTime
}

/** 游戏奖励信息 */
struct PrizeInfo{
    /** numberPrizes和moneyPrizes互斥， 同时只会存在一种， 为了兼容之前消息 */
	1: optional list<NumberPrize> numberPrizes
	2: optional list<MoneyPrize> MoneyPrizes
	3: optional list<BadgePrize> badgePrizes
	4: optional list<FashionPrize> fashionPrizes
	5: optional list<ItemPrize> itemPrizes
}

struct PlayerBaseInfo{
	1: i64 charId
	2: optional string name
	3: optional byte sex
	4: optional string headIcon
	5: optional i32 level
	6: optional i16 popLevel
	7: optional byte vipLevel
	8: optional i16 tagId
	9: optional i64 guildId;
	10: optional string guildName;
	/** 时尚特权效果及头像框key:style val:id */
	11: optional map<byte, i32> baseFashionIds
}

/** 套装物品 */
struct AvatarSuitItem {
	/** 服装实例id */
	1: i64 instanceId
	/** 服装模板id */
	2: i32 itemId
}

/** 服装套装信息 */
struct AvatarSuitInfo {
	/** 套装信息 */
	1: list<AvatarSuitItem> suitItems
}

/** 徽章信息 */
struct BadgeInfo{
	/** 位置 */
    1: i16 position
    /** 徽章id, 未佩戴为0, 表示徽章栏解锁 */
	2: i32 badgeId
	/** 有效截止时间, 0为永久 */
	3: optional i64 validTime
	/** 是否新获得 */
	4: optional bool isNew
	/** 是否穿戴过 */
	5: optional bool hasPutOn
	/** 徽章创建时间(s) */
	6: i32 createTime
}

struct UserPrizeInfo{
	1: string reasonInfo
	2: string prizeName
	/** 奖励 */
	3: optional PrizeInfo prizeInfos
}
struct Picture{
	1:string pic
	/** 被赞数 */
	2:i32 upCount
	/** 缩略图id */
	4:optional string thumbnails
}

struct SimplePartnerInfo{
	1: i64 charId
	2: i16 startActionId
	3: list<i16> finishActionIds
}

struct DynamicInputInfo{
	1: byte inputType
	2: byte result
	3: byte combo
}

struct DynamicInput{
	1: list<DynamicInputInfo> inputInfoList
}

struct TraditionalInput {
	1: byte result
	2: bool isMiss
}

struct LoversDynInputInfo{
	1: byte inputType
	2: byte result
	3: byte combo
}

struct LoversDynInput{
	1: list<LoversDynInputInfo> inputInfoList
}

struct LoversTrdInput{
	1: byte result
	2: bool isMiss
}

struct LoversDynSyncMarkInfo{
	1: byte teamId
	2: i64 charId
	3: bool miss
	4: i32 mark
	5: i16 currentEnery
}

struct LoversTrdSyncMarkInfo{
	1: byte teamId
	2: i64 charId
	3: byte keyResult
	4: i32 mark
	5: i16 currentEnery
}

struct DanceSyncMarkInfo{
	1: optional i64 charId
	2: optional byte keyResult
	3: optional i16 combos
	4: optional i32 mark
	5: optional i16 index
	6: optional LoversDynSyncMarkInfo loversDynSyncMarkInfo
	7: optional LoversTrdSyncMarkInfo loversTrdSyncMarkInfo
	/** 自己贡献欢呼值占比*1000取整 */
	8: optional i32 cheerValRatio
	9: optional i16 perfectCombos
}

struct DanceMarkInfo{
	1: string name
	2: i32 mark
	3: byte grade
	4: string location
	5: double longitude
	6: double latitude
	7: optional i16 perfectCount
	8: optional i16 greatCount
	9: optional i16 goodCount
	10: optional i16 missCount
	11: optional i16 maxCombo
	12: optional i16 maxPerfectCombo
	13: i16 masterPerfectCount
	14: i32 appendMasterPerfectMark
	15: PlayerBaseInfo playerBaseInfo
	16: byte rank
}
struct BattleTeamMemberInfo{
	1:i64 charId
	2:i32 score
}
struct BattleTeamResult{
	1:byte teamId
	2:byte grade
	3:byte top
	4:list<BattleTeamMemberInfo> data
}
struct BattleFinishInfo{
	1: i16 maxPerfectCombo
	2: i16 maxCombo
	3: i16 perfect
	4: i16 great
	5: i16 good
	6: i16 mss
	7: i16 coupon
	8: list<BattleTeamResult> teams 
}

struct AvatarDiyAreaItem{
	1: i32 colorId
	2: double aplha
	3: double brightness
	4: byte area;
}

struct AvatarDiyArea{
	1: optional list<AvatarDiyAreaItem> diyAreas
}

struct AvatarInfo{
	1: i32 templateId
	2: optional AvatarDiyArea diyAreas
}

struct PartnerInfo{
	1: i16 modelId
	2: byte bodyAdjVal
	3: list<AvatarInfo> avatarInfos
	4: bool robot
	5: i32 robotScore
	/** only traditional mode */
	6: list<byte> robotKeyResultList
	7: byte stature
	8: i16 rank
	10: PlayerBaseInfo playerBaseInfo
	11: i32 skinColor
	/** 佩戴的徽章 */
	12: list<BadgeInfo> putOnBadges
	/** 使用中的个人展示时尚id key:style val:id */
	13: map<byte, i32> danceFashionIds
}

/** 玩家外观信息 */
struct PlayerAppearanceInfo{
    1: PlayerBaseInfo playerBaseInfo
	2: i16 modelId
	3: list<AvatarInfo> avatarInfos
	/** 佩戴的徽章 */
	4: list<BadgeInfo> putOnBadges
	/** 当前经验值， 显示经验条使用 */
	5: i32 exp
}

struct BattleDanceTeamInfo{
	1:i64 charId
	2:byte teamId
	3:byte index
}
struct MusicRecordInfo{
	1: i32 maxScore
	2: PlayerBaseInfo playerBaseInfo
}
/** 充值套餐信息 */
struct InAppPurchaseInfo{
	/** 价格档位*/
	1: i32 id
	/** 道具ID*/
	2: string itemId
	/** 类型 0->真实砖石 1->红包*/
	3: byte itemType
	/** 物品名称*/
	4: string name
	/** 描述*/
	5: string des
	/** 砖石数量*/
	6: i32 ib
	/** 货币*/
	7: double currency
	/** 货币类型*/
	8: string currencyType
	/** 额外货币数量*/
	9: i32 additionReward
	/** 图标*/
	10: string icon
	/** 推荐描述*/
	11: bool recommend
	/** 购买完描述*/
	12: string afterByDesc
	/** 推荐描述 */
	13: string adviseDesc
}


struct BaseItemInfo{
	1: byte type
	2: i32 templateId
	3: i64 instanceId
	4: i32 count
	5: i32 validTime
	6: AvatarDiyArea diyAreas
	7: byte bind;
	/** 婚戒显示伴侣名字 */
	8: optional string partnerName
	/** 背包中道具是否使用 */
	9: optional bool isBagItemUsing
}

struct AvatarItemInfo{
	1: byte type
	2: i32 templateId
	3: i64 instanceId
	4: i32 count
	5: i32 validTime
	6: AvatarDiyArea diyAreas
	7: byte bind;
}

struct FavoriteAvatars{
	1: list<i64> avatarIds
}

struct UpdateItemInfo{
	1: i64 instanceId
	2: optional i32 count
	3: optional i32 validTime
	/** 额外多语言提示id */
	4: optional i32 extraTipId
	/** 背包中道具是否使用 */
	5: optional bool isBagItemUsing
}

struct BuyItemInfo{
	1: i32 itemId
	2: byte validTimeType
	3: i32 count
	4: AvatarDiyArea diyareas
	5: i32 remainTime //剩余时间
}

enum QueryFriendType{
	QUERY_ONLINE_LIST
	QUERY_FRIEND_INFO_LIST
	QUERY_FRIEND_CHARID_LIST
}




struct AddFriendNotify{
	1: i64 charId
	2: string name
	3: i32 reqTimestamp
}
enum WishType{
	NOT_OVER
	OVER
	DONATE
}

/** 创建房间类型 */
enum CreateRoomType{
	/** 普通竞技 */
	NORMAL
	/** 婚礼 */
	WEDDING
	/** 巡演 */
	CHAPTER
	/** 通告 */
	ANNOUNCE
	/** 温泉广场 */
	GROUND
}

enum MailType{
	TEXT
	/** 商城赠送 */
	SHOPING_DONATE 
	REQUEST_WISH
	OVER_WISH
	GIFT
	EXCEPT_GIFT
	SYSTEM_MAIL
	/** 背包内赠送 */
	PACK_DONATE		
	/** 创建角色 */
	CREATE_PLAYER 
	/** 排行榜邮件奖励 */
	RANK_PRIZE    
	/** 单曲排行榜音乐活动奖励 */
	MUSIC_PRIZE   
	/** 平台使用激活码 */
	USEWAN_ACTIVECODE	
	/** 使用游戏自己的激活码 */
	USEGAME_ACTIVECODE 
	/** GM活动奖励 */
	GM_ACTIVE_PRIZE   
	/** 用户评价 */
	USERGRADE_MAIL		
	/** 婚礼答谢 */
	WEDDING_THANK	
	POINT_WALL	
	CHAPTER_PRIZE
	SIGN_IN_AWARD
	/** 全服邮件 */
	GLOBAL_MAIL
}
struct SimpleMallItem{
	1: i32 itemId
	2: i32 price
	3: byte currencyType
	4: i32 count
	5: byte validTimeType
	6: i32 remainTime;
}
struct Mail{
	1:i64 charId
	2:string headIconId
	3:string name
	4:MailType type
	5:i32 createTime
	6:string title
	7:string content
	/** 邮件内容多语言提示id，大于0时忽略content */
	8: i32 contentId
	/** 邮件内容多语言提示参数 */
	9: list<string> contentParams
	10:i64 mailId
	11:byte sex
}

struct Wish{
	1:i64 wishId
	2:list<SimpleMallItem> items
	3:i32 createTime
	4:i32 overTime
	5:i64 overCharId
	6:string overCharName
	7:string overHeadIconId
	8:byte overSex
}

struct BuyItemInfos{
	1: list<BuyItemInfo> items
	2: list<MoneyPrize> moneyPrizeList
}
struct Donate{
	1:i64 charId
	2:string name
	3:string headIconId
	4:i32 coupon
	5:i32 ib
	6:byte sex
	7:i32 point
}
struct Donates{
	1:list<Donate> data
}

/** 社交关系类型 */
enum RelationType{
	/** 普通好友 */
	COMMON_FRIEND
	/**  密友 */
	CLOSE_FRIEND 
	/** 情侣 */
	LOVERS
}

/** 首饰信息 */
struct JewelryInfo{
	1:i32 itemId
	/** 社交关系类型 */
	2:byte relaionType
}

/** 名片简要信息 */
struct SimpleBusinessCardInfo{
	1: i64 charId
	2: string name	
	3: byte sex
	4: string headIconId
	/** 好友关系, 无关系为-1 */
	5: byte relationType
	/** 好友关系值， 如亲密度 */
	6: optional i32 relationVal
	7: optional string location
	8: optional bool open
	9: optional string moodMessage	
	10: optional string moodMessageByVoice	
	11: bool isOnline
	12: optional i32 level
	/** 舞团名 */
	13: optional string guildName
	14: optional i16 tagId
	15: byte vipLevel
	/** 使用中的名片时尚id, key:style val:高32位id | 低32位有效期 */
	16: optional  map<byte, i64> cardFashionIds
	17: optional double longitude
	18: optional double latitude
}

/** 名片详细信息，用做缓存使用，方便有人查询好友时快速读取 */
struct BusinessCardInfo{
	1: i64 charId
	2: string name
	/** format yyyy-MM-dd HH:mm:ss timestamp accurate to the second. (1981-06-01 00:00:00)*/
	3: string birthday
	4: byte sex
	5: string headIconId
	/** 星座索引 */
	6: optional byte constellationId
	7: optional string location
	8: i64 popularityTotal
	9: i64 charmTotal
	10: optional string moodMessage
	11: list<AvatarInfo> avatarList
	12: i32 vipDiamond
	13: i32 level
	16: i32 dynamicCount
	17: i32 dynamicWinCount
	18: i32 traditionalCount
	19: i32 traditionalWinCount
	20: i32 battleCount
	21: i32 battleWinCount
	22: optional string moodMessageByVoice
	23: optional i32 point
	24: optional double longitude
	25: optional double latitude
	28: optional byte modelId
	29: optional bool open
	31: optional byte stature
	32: optional i32 height
	33: optional i32 weight
	34: i32 financialTotal
	35: i32 giftTotal
	36: i32 praiseTotal
	37: i32 cupTotal
	38: i16 popularityLevel
	42: i32 largesse
	43: i32 charm
	44: optional i16 tagId
	45: string gsId
	46: byte vipLevel
	47: i64 guildId;
	48: string guildName
	49: i32 vipExp
	50: i32 skinColor
    51: i32 starLights
	52: i32 starLightLvl
	53: i32 exp
	54: i64 popularityLvl
	/** 首饰盒简要信息*/
	55: list<JewelryInfo> jewelryInfos
	/** 被关注数量 */
	56: i32 beAddedFriends
	/** 社交关系简要信息*/
	57: list<SimpleBusinessCardInfo> relationInfos
	58: bool online
	/** 使用中的名片时尚id, key:style val:高32位id | 低32位有效期 */
	59: optional map<byte, i64> cardFashionIds
	/** 佩戴的徽章 */
	60: optional list<BadgeInfo> putOnBadges
	61: i32 fashion
	62: i64 theOneCharId
	/** 用户id, 显示用 */
	63: optional i64 userId
}

struct FriendInfo{
	1: SimpleBusinessCardInfo simpleCardInfo
	2: bool twoWay
	3: i32 intimacy
}

enum RoomState{
	WAIT = 1
	COUNTDOWN = 2
	PREPARE = 3
	SHOW = 4
	DANCE = 5
}

/** 广场房间信息 */
struct GroundRoomInfo{
    /** 0-无密码 1-有密码 */
	1: byte lockState
	2: i32 roomId
	3: string title
	4: PlayerBaseInfo leaderBaseInfo
	5: byte curMaleCount
	6: byte curFemaleCount
	7: byte maxMemeberCount
	8: bool	isStick
}

/** 舞蹈房间信息 */
struct DanceRoomInfo{
	1: byte lockState
	2: byte mode
	3: byte memberSexInfo
	4: i32 roomId
	5: string title
	6: bool watch
	7: i16 curDanceSize
	8: i16 curWatchSize
	9: i16 songId
	10: byte lvl
	11: PlayerBaseInfo leaderBaseInfo
	12: RoomState state
	13: i16 maxWatchSize
	14: CreateRoomType roomType
	15: bool  isStick
}

struct RoomMemberInfo{
	1: byte prepareStatus
	2: i16 modelId
	3: byte bodyAdjVal
	4: list<AvatarInfo> avatarInfos
	/** 0-strange 1-friend */
	5: byte relation
	6: byte stature
	/** -1 watch */
	7: i16 seatId
	10: PlayerBaseInfo playerBaseInfo
	11: i32 skinColor
	12: i64 theOneCharId
	/** 佩戴的徽章 */
	13: list<BadgeInfo> putOnBadges
	14: double positionX
	15: double positionY
	16: double positionZ
	/** 使用中的个人展示时尚id key:style val:id */
	17: map<byte, i32> danceFashionIds
	/** 广场区域GroundPlayerStatus */
	18: optional byte targetGroundStatus
	/** 行为状态GroundActionStatus */
	19: optional byte actionStatus
	/** 广场部件id */
	20: optional i32 objId
	/** 广场部件参数 */
	21: optional i32 objParam
	/** 音乐加载进度（0-100） */
	22: optional byte musicLoadProcess
	/** 是否准备好 */
	23: optional bool isReady
}

struct InvitePlayerInfo{
	1: byte sex
	2: i64 charId
	3: string name
	4: string headIconId
	5: byte relation
	/** 使用中的名字和头像框时尚id key:style val:id */
	6: map<byte, i32> nameHeadFashionIds
	7: byte vipLvl
	8: i16 tagId
}

enum PrizeType{
	CONTINUE_LOGIN = 0
	GM_PRIZE = 1
	GM_PUBILSH = 2
	PLATFORM_PRIZE = 3
}


struct GMActivityInfo{
	1: i16 activiyId
	2: string activityName
	3: string icon
	4: string content
	5: byte state
	6: byte type 
	7: byte subType
	8: i64 beginTime
	9: i64 endTime
	10: list<string> completedParam 
	11: list<string> param
	/** 奖励 */
	12: optional PrizeInfo prizeInfos
	13: list<string> paramDesc
}

//GM活动类型
enum GMActivityType{
	DANCECOMPETION	     //每日竞技
	EXCHANGE             //兑换活动
	SPECIALTIMELOGIN     //特别时刻登录
	FIRSTRECHARGE        //首次充值
	RECHARGE	     //累计充值
	CONTIREACHGE	     //连续充值
	CONSUME              //消耗充钻，绑钻，金币活动
	LOGINCONTINUE        //连续登录
	LOGINCOUNT	     //累计登录
	COLLECT_EXCHARNGE    //收集兑换活动
	
}

/** 舞蹈欢呼值结果 */
struct DanceCheerValResult{
	1: i64 charId
	2: i32 cheerVal
	/** 0-未通关 1-通关 */
	3: optional byte passStatus
}

//活动子类型
enum GMActivitySubType{
	IB
	COUPON
	FREEIB
}

struct ActivityPrizeInfo{
	1: byte index 
	2: bool canGetPrize
	3: list<string> completedParam
	4: list<string> param
	5: string content          
	6: PrizeInfo prizeInfos
}

struct RechargeAndSignInfo{
	1: GMActivityType type 
	2: GMActivitySubType subType
	3: i64 beginTime
	4: i64 endTime
	5: list<ActivityPrizeInfo> prizeList
	6: string content
}

 

struct PrizeFieldInfo{
	1: PrizeType prizeType
	2: i64 id
	3: i64 param
}

struct Conversation{
	1: i64 friendCharId
	2: i16 unreadCount
	3: i32 lastTime
}

struct VoiceMailInfo{
	1: i64 sendCharId
	2: string voiceKey
	/** timestamp, accurate to seconds*/
	3: i32 sendTime
}

enum NotificationType{
	/** 添加好友通知 */
	ADD_FRIEND
	/** 赠送礼物通知 */
	GIFT
	/** 自己的排行榜相关通知：（双向好友才发通知） */
	SELF_RANK
	PIC_LIKE
	/** 砸蛋抽奖好友通知 */
	DROPEGG_LOTTERY
	/** 星盘抽奖好友通知 */
	CONSTELLATION_LOTTERY
	/** 舞团加入拒绝通知 */
	GUILD_ADD_REUSE
	/** 舞团邀请通知 */
	GUILD_INVITE
	/** 情侣结婚成功 */
	WEDDING_SUCCESS
	/** 添加密友 */
	ADD_CLOSE_FRIEND
	/** 拒绝添加密友 */
	REFUSE_ADD_CLOSE_FRIEND
	/** 陌生人查看名片 */
	STRANGER_VIEW_BUSINESS_CARD
	/** 删除密友 */
	DELETE_CLOSE_FRIEND
	/** 摸一摸 */
	TOUCH_FRIEND
	/** 情侣邀请 */
	BE_MY_LOVER
	/** 升级广播 */
	GUILD_BROAD_LEVEL_UP
	/** 离婚成功 */
	DIVORCE_SUCCESS
}

struct Notification{
	1: i64 notificationId
	/** 多语言提示ID */
	2: i32 langId
	/** 多语言提示参数 */
	3: list<string> langArgv
	/** 通知类型 */
	4: NotificationType type
	/** 通知类型相关参数，如添加好友通知，会有对方的charId */
	5: list<string> notificationArgv
	6: i32 sendTime
	7: string senderHeadIcon
	/** 头像框时尚id */
	8: i16 headerFashionId 
}

struct GuildRankInfo{
	1: string guildName
	2: i32 guildMemberCount
	3: i32 guildLevel
	4: string headIcon
}

struct RankInfo{
    /** 双人榜单动作id */
	1: optional i32 poseId
	2: i64 score
	3: list<PlayerBaseInfo> playerBaseInfos
	4: optional GuildRankInfo guildInfo
}
struct RankMusicQueryParam{
	1: byte mode
	2: i16 musicId
	3: byte level
	4: optional byte lastLevel
	/** 是否封面,客户端请求封面数据不存在,服务器会随一个发送 */
	5: optional bool isFirstPanel
	/** 客户端自己区分使用 */
	6: optional byte clientParam
}

//这个仅限只有性别查询的排行榜类型
struct RankCommonQueryParam{
	1: byte sex
}

enum MallItemCategory{
	SUIT
	HAIR //发型
	REAR //背面
	EARRING //耳环
	MAKEUP //彩妆
	BRACELET //手镯
	GLASSES //眼镜
	ACC //饰品
	GLOVES //手套
	RING //戒指
	MAX
}
enum MallItemState{
	NEW 
	VIP 
	HOT 
	DISCOUNT 
	POINT
	GIFT
	MAX
}
enum Sex{
	ALL
	MALE
	FEMALE
	MAX
}
enum MallShowIndex{
	NEW
	CLOTHING
	ACCESSORY
	PROP
	VIP
	POINT
	GIFT
	MAX
}
enum MallItemStyle{
	ALL
	COSPLAY
	STAGE
	JK
	EA
	MAX
}
enum MallMsg{
	SUCCESS
	NOT_MONEY
	NOT_COUNT
	NOT_OPEN
	NOT_ITEM
}
struct MallItem{
	1: i32 itemId
	2: i32 itemType
	3: i32 state
	4: optional string itemName
	5: i32 foreverCurrencyCount
	6: i32 foreverCurrencyType
	7: i32 monthCurrencyCount
	8: i32 monthCurrencyType
	9: i32 weekCurrencyCount
	10: i32 weekCurrencyType
	11: bool limit
	12: i32 remainCount
	13: byte sex
	14: byte discount
	15: bool useBindIb
	16: i32 returnPoint
}
struct MusicalNote{
	1:byte index
	2:byte type
	3:byte continueCount
}
struct BattleDanceGroupData{
	1:list<MusicalNote> notes
	2:byte index
}
struct BattleDancePartData{
	1: list<BattleDanceGroupData> groups
	2: byte partIndex
}

struct MusicLockInfo{
	2: map<i16, byte> mLockInfo
}

enum UnlockType{
	OFFLINE
	AFTER_DANCE
	BUY 
}


struct QuickMatchDancer {
	1: i16 songId
	2: PlayerBaseInfo playerBaseInfo
}

enum BagExpandType{
	LEVEL_UP
	BUY
}

//绑定第三方帐号的类型
enum BindAccountType{
	SINA_WEIBO
}

/** 网易登录参数 */
struct ChannelNeteaseLoginParam{
	/** sdk返回的用户id，可能为整型和字符串 */
	1: string sdkUId
	/** 渠道分配的游戏id */
	2: string gameId
	/** 发行(分发）渠道 */
	3: string appChannel
	/** 渠道名 */
	4: string channelName
	/** 平台名 */
	5: string platform
	/** 玩家登录的移动设备号，通过UniSDK提供的接口获取 */
	6: string udid
	/** 玩家登录的手机硬件id，通过UniSDK提供的接口获取 */
	7: string deviceId
	8: string sessionId
	/** sdk的版本 */
	9: string sdkVersion
}

enum CourseTaskState{
	NotActive
	Active
	Complete
	PRIZED
	Faild
}

struct CourseTaskProcess{
	1: i32 messageId
	2: i32 intCount
	3: i32 maxIntCount
	4: double doubleCount
	5: double maxDoubleCount
}

struct CourseTaskData{
	1: i32 courseId
	2: CourseTaskState state
	3: list<CourseTaskProcess> couterProcessList
	4: list<CourseTaskProcess> otherProcessList
	/** 奖励 */
	5: PrizeInfo prizeInfos
	6: byte courseVersion
}

/** 通用条件信息 */
struct PassCond{
	1: i32 messageId
	2: i32 intCount
}

/** 通告数据 */
struct AnnounceData{
	1: i32 announceId
	/** 建议星光值 */
	2: i32 adviceStarVal
	/** 奖励 */
	3: PrizeInfo prizeInfo
	/** 额外奖励 */
	4: optional PrizeInfo extraPrizeInfo
	/** 通告冷却时间(距离1970.1.1的秒数) */
	5: optional i32 coldDown
	/** 0-歌手 1-舞者 2-模特 */
	6: byte occupationType
	/** 职业等级 */
	7: i16 occupationLvl	
	/** 难度0-简单 1-普通 2-困难 3-疯狂 */
	8: byte musicLvl
	/** 通关条件 */
	9: list<PassCond> passConds
}

enum RoomChannel{
	FREE
	WEDDING
	/** 演出频道 */
	PERFORMANCE
	TOUR
	ANNOUNCE
	GROUND
}

enum RefreshType{
	Auto            //自动刷新
	Force		//强制刷新
}


enum StarItemState{
	Excharge	//已兑换
	NotExcharge	//未兑换
	EnableExcharge //可兑换
	
}

struct ConstellationItemData{
	1: i32 index
	2: i32 itemId		   
	3: i16 itemNumber
	4: byte validTimeType    
	5: byte priceType	   
	6: i32 priceCount 
	7: i32 tradeFlag		
}


struct ConstellationData{
	1: i32 star                
	2: StarItemState itemState //兑换标志-设置个人旗标
}

struct MusicRankPrize{
	1: string rankDesc
	2: BuyItemInfos buyItemInfos
}

struct FuncParam {
	1: i32 funcId
	2: binary param
}


struct ConstellationLotteryItem{
	1: i32 itemId
	2: byte validTime
	3: i32 count
	4: i32 rare
}

struct ActivityTask{
	1: i32 id
	2: string desc
	3: i32 counterId
	4: i32 completeCount
	5: i32 isReward
}


//兑换钥匙活动列表结构
struct ActiveKeyData 
{
	1: i16 activiyId;
	2: string activityName;
	3: string content;
	4: MoneyPrize moneyCost;
	5: ItemPrize itemPrize;
	6: i32 numberRemain;
	7: i32 numberMax;
}


struct DeviceTokenInfo
{
	1: string deviceToken
	2: i64 updateTime;
	3: byte upPicLimitCount;
	4: byte giftLimitCount;	
	5: i64 lastUpdateTime;
}



enum GMPushType{
	VERSION_UPDATE = 1,
	ACTIVE_MESSAGE = 2,
	UPLOAD_PIC = 3,
	RECEIVE_GIFT = 4,
	OFFLINE_TIME = 5
}

struct URLInfo{
	1: string title;
	2: string url
	3: byte id
}

enum GuildDegree{
	DegreeMember = 0,
	DegreeLeader = 1,
	DegreeAssistance = 2
}


enum GuildSortType{
	MyApply = 0
	MemberCount = 1
	MemberLevel = 2
	MemberPopularity = 3
	VipExp = 4
	GuildLevel = 5
	Search = 6
	Honor = 7
	Max = 8
}

enum GuildQuitReason{
	KickGuild = 0,
	QuitGuild = 1
}


struct GuildMemInfo{
	1: PlayerBaseInfo playBaseInfo;
	2: optional string moodMessage
	3: GuildDegree degree;//职位
	4: double longitude
	5: double latitude
	6: bool online
	7:i32		lastSignInDate
	8:i32		donateValue
  9: bool open
  10: string location	
  11: i32	lastWeekDonation
  12: i32	signInDays
}

/** 舞团商城物品*/
struct GuildShopItem{
	1: i32	id
	2: i32	amountLeft
	3: bool canBuy
}

//帮会列表信息
struct GuildBaseInfo{
	1: i64 guildId;
	2: string guildName;
	3: GuildMemInfo leaderInfo
	4: string guildIcon;
	5: string noticeBoard;
	6: i16 memberCount;
	7: i16 averageLevel;
	8: i64 popularityCount;
	9: i32 vipExpCount;
	10: byte applyFlag;
	11: i16 limitCount;
	12: i32		honor
	13: i32		level
	14: i32		assistantCount
	15: i32		assistantMaxCount
	16: optional binary flags
	17: optional list<byte> byteDayLoopCounterList
	18: optional list<i16> shortDayLoopCounterList
	19: optional list<i32> intDayLoopCounterList
	20: optional list<i32> intCounterList
	21: optional i32	guildExp
	22: optional i32		honorLevel
}

struct CardItemInfo{
	1: i32 itemId
	2: i16 limitCount
}

struct CardExchangePrizeInfo{
	1: string title
	2: string content
	3: byte index
	4: string prizeName
	/** 奖励 */
	5: optional PrizeInfo prizeInfos
	6: list<CardItemInfo> cardList
	7: i32 exchangedCount
	8: i32 exchangeTotalCount

}

/** 动感输入片段信息 */
struct DynamicSegmentInputs{
	/**  一组输入音乐id序列 */
	1: list<i32> musicIds;
}

/** 传统输入片段信息 */
struct TradSegmentInput{
	/**  传统输入id */
	1: i32 inputId;
	/**  关键点输入类型 */
	2: optional byte keyInputType
}

struct CollectExchangeInfo{
	1: list<CardExchangePrizeInfo> prizeList
}

struct LoversDynInit{
	1: list<i16> heartPos
}

struct LoversTrdHeartPos{
	1: byte sectionIndex
	2: byte inputIndex
}

struct LoversTrdInit{
	1: list<LoversTrdHeartPos> heartPos
}

struct LoversGame{
	1: byte gameType
	2: i16 gameId
	3: optional map<i64, byte> aqIndexMap
	4: optional list<byte> answerIndexList
}

struct LoversAQGameReq{
	1: byte index
}

struct LoversTouchHeartGameReq{
	1: byte index
}

struct LoversAQGameResp{
	1: optional map<i64, byte> indexMap
	2: byte result
	3: i32 mark
}

struct LoversTouchHeartGameResp{
	1: byte result
	2: i32 mark
}

struct TeamInfo{
	1: byte teamId
	2: list<i64> charIds
}

struct TouchRecordInfo{
	1: string personTouching
	2: string personTouched
	3: i32 touchingTime
	4: byte touchingPosition
}



struct ComposeActivityTime {
	1:i16  beginHour
	2:i16  beginMinute
	3:i16  endHour
	4:i16  endMinute
}


struct ComposeRequireItem {
	1:i32  itemId
	2:i16  itemCount
}

struct ComposeActivityDetail {
	1:string   composeDesc
	2:byte      index
	3:i16      totalCount
	4:i16      total
	5:i16      dayCount
	6:i16      dayTotal
	/** 奖励 */
	7: optional PrizeInfo prizeInfos
	8:list<ComposeRequireItem>  requireItems
}

struct ComposeActivityDetailInfo {
	1:i16   activityId
	2:list<ComposeActivityDetail>   acitivityDetails
}

struct ComposeItemIndex{
	1:i32 itemId
	2:byte index
}

struct ComposeActivity {
	1:i16 activityId
	2:string activityName
	3:string description
	4:CourseTaskData exchangeCourse
	5:i64 beginTime
	6:i64 endTime
	7:list<ComposeActivityTime> dayLimitTime
	8:list<ComposeItemIndex> itemIds		
	9:byte type
}

struct FriendIntimacy{
	1: i32 intimacyPoints
}

struct TouchedRecords{
	1: list<TouchRecordInfo> records
}

struct SpecialDay{
	1: i32 dayName
	2: i32 time
}

struct CloseFriendInfo{
	1: string relationshipSelf
	2: byte useLvlRelationShipSelf
	3: string relationshipFriend
	4: byte useLvlRelationShipFriend
	5: i32 intimacyVal
	/** 双人动作id */
	6: i32 poseId
	7: string moodMessageSelf
	8: string voiceMessageSelf
	9: i32 modeId
	10: byte stature
	11: string moodMessageFriend
	12: string voiceMessageFriend
	14: PlayerBaseInfo	playerBaseInfo
	15: list<AvatarInfo> avatarListFriend
	/** 纪念日(时间戳/1000) */
	16: i32 specialDay
	17: bool isFirstTimeChangeNick
	18: bool isFirstTimeChangePos
	/** 当前是否在线 */
	19: optional bool isOnline
	/** 佩戴的徽章 */
	20: list<BadgeInfo> putOnBadges
}

struct PointOrderInfo {
	1:i64 orderId
	2:i32 costPoint
	3:i64 createTime
	4:i16 status
}

struct AgentSohaLoginParam {
  1:string accessToken
  2:string userId
}

struct SlotData {
	1: map<i64, i32> fixedPrizeTime
	2: i32 diamondPoolSize
	3: i32 bindDiamondPoolSize
	4: i32 goldPoolSize
}

struct SlotDrawResult{
	1: i32 position
	2: i32 diamondAmount
	3: i32 bindDiamondAmount

}

struct LimitSaleTime {
	1: string startTime
	2: string endTime
}

struct LimitSaleActivity {
  1:i32 sortId
  2:i32 activityId
  3:string name
  4:string description
  5:i32 limitVipLevel
  6:list<LimitSaleTime> limitTime
}

struct LimitSaleItem {
  1:i32 sortId
  2:i32 itemId
  3:i32 count
  4:i32 sex
  5:i32 remainTime
  6:i32 bind
  7:i32 priceType
  8:i32 price
  9:i32 saleCount
}

struct GuildTask{
	1: i32 taskId
	2: string taskName
	3: byte state
}

struct GameNotice{
	1: string pageUrl
	2: string buttonName
	3: string detailUrl
	4: string name
}

/** 舞蹈欢呼值初始信息 */
struct DanceCheerInitInfo{
	/** s,ss,sss对应欢呼值 */
	1: list<i32> rankCheerVals
	/** 初始欢呼值 */
	2: i32 initCheerVal
	/** 额外通关条件信息 */
	3: list<PassCond> extraPassConds
	/** npc初始欢呼值 */
	4: optional i32 npcInitCheerVal
	/** npc释放技能序列 */
	5: optional list<i32> npcSkillIds
}

/** 舞蹈同步欢呼值信息 */
struct SyncDanceCheerInfo{
	/** 自己是否满足额外通关条件 */
    1: optional bool selfMatchExtraPassConds
	/** 当前总欢呼值 */
	2: i32 totalCheerVal 
	/** 自己贡献欢呼值占比*1000取整 */
	3: i32 selfCheerValRatio
	/** npc当前总欢呼值 */
	4: optional i32 npcTotalCheerVal 
}

/** 欢呼值通关条件结果 */
struct PassCheerCondResult{
	1: list<PassCond> conds
	/** 0-未满足 1-满足 */
	2: byte passStatus
}

enum ChapterOperType{
	GETCHAPTER,
	REFRESH
	NEXT
	REPEAT
	PASSCHAPTER
	BUYFREETIMES
}

/** 时尚类型 */
enum FashionType{
	/** 文字聊天 */
	WORD_CHAT
	/** 名片装饰 */
	BUSINESS_CARD
	/** 个人展示 */
	PERSONAL_SHOW
	/** 特权效果 */
	SPECIAL_EFFECT
}

/** 时尚子类型 */
enum FashionSubType{
	/** 名字颜色 */
	NAME_COLOR
	/** 邀请赛房间面板 */
	INVITE_ROOM
	/** 头像框装饰 */
	HEAD_ICON_FRAME
	/** 名片框装饰 */
	BUSINESS_CARD_FRAME	
	/** 名片背景效果 */
	BUSINESS_CARD_BG
	/** 名片角色展示效果 */
	BUSINESS_CARD_ROLE
	/** 聊天字体颜色 */
	CHAT_WORD_COLOR
	/** 聊天泡泡框装饰 */
	CHAT_BUBBLE
	/** 喇叭面板装饰 */
	SPEAKER_PANEL
	/** 聊天表情包 */
	CHAT_EXPRESSION_PKG
	/** 竞技入场效果 */
	DANCE_ENTER_EFFECT
	/** 竞技入场动作 */
	DANCE_ENTER_ACTION
	/** 竞技手部拖尾效果 */
	DANCE_HAND_EFFECT
	/** 竞技脚部光环效果 */
	DANCE_FOOT_EFFECT
	/** 等待房间DJ台 */
	DJ_DESK
	/**类型上限 */
	Max
}

/** 广场区域状态 */
enum GroundPlayerStatus
{
	/** 自由区 */
	Free,        
	/** 泡温泉 */
	HotSpring 
	/** 舞台 */
	DanceArea    
}

/** 广场行为状态 */
enum GroundActionStatus
{
	/** 空闲 */
	None
	/** 与其它玩家交互中 */
	ActionPlayer   
	/** 与物体交互中 */
	ActionObject    
	/** 坐在静态物体上 */
	SitObject  
	/** 坐在泉眼上 */
	SitSpringPoint   	
	/** 换装中 */
	ChangeClothes   
	/** 正在被其他玩家邀请 */
	BeinvitedAction 
	/** 猜拳中 */
	FingerGuess
	/** 富豪领舞区 */
	RichPoint
	/** 人气领舞区 */
	PopularityPoint
	/** 技术领舞区 */
	CupPoint
	/** 等级领舞区 */
	LevelPoint
	/** 烟花区 */
	FireWorksArea
	/** 温泉中做动作 */
	ActionInSpring
}

/** 红包类型*/
enum LuckyMoneyType
{
	/** 个人红包 */
	PERSONAL
	/** 全服红包 */
	ALL_SERVER 
	/** 广场红包 */
	GROUND
	/** 舞团红包 */
	GUILD
	/** 房间红包 */
	ROOM
	/** 婚房红包 */
	WEDDING_ROOM
}

/** 情侣温泉状态 */
enum LoverSpringStatus{
	/** 进入 */
	JOIN
	/** 退出 */
	EXIT
}

/** 烟花类型 */
enum FireWorksType{
	/** 低级 */
	LOW = 1
	/** 中级 */
	MIDIUM
	/** 高级 */
	HIGH
}

/** 婚礼房间信息 */
struct WeddingRoomInfo{
	/** 房间id */
	1: i32 roomId
	/** 新郎角色id */
	2: i64 bridegroomId
	/** 新郎角色名 */
	3: string bridegroomName
	/** 新郎名字时尚id */
	4: i32 bridegroomNameFashion
	/** 新郎vip等级 */
	5: byte bridegroomVipLvl
	/** 新人动作id */
	6: i32 couplePosId
	/** 新娘角色id */
	7: i64 brideId
	/** 新娘角色名 */
	8: string brideName
	/** 新娘名字时尚id */
	9: i32 brideNameFashion
	/** 新娘vip等级 */
	10: byte brideVipLvl
	/** 房间名 */
	11: string roomName
	/** 成员性别，按位表示位置和性别 */
	12: i32 memberSexInfo
	/** 新郎标签id */
	13: i16 bridegroomTagId
	/** 新娘标签id */
	14: i16 brideTagId
}

/** 婚礼动态 */
struct WeddingNotice{
	/** 置顶时间(/1000) */
	1: i32 topTime
	/** 新郎角色id */
	2: i64 bridegroomId
	/** 新郎角色名 */
	3: string bridegroomName
	/** 新郎名字时尚id */
	4: i32 bridegroomNameFashion
	/** 新人动作id */
	5: i32 couplePosId
	/** 新娘角色id */
	6: i64 brideId
	/** 新娘角色名 */
	7: string brideName
	/** 新娘名字时尚id */
	8: i32 brideNameFashion
	/** 婚礼状态WeddingNoticeState 0-即将开始 1-进行中 1-完成 */
	9: byte weddingState
	/** 创建时间(/1000) */
	10: i32 createTime
}

/** 游戏数据分页查询参数 */
struct CommonDataPageInfoQueryParam {
	/** 每页开始的索引*/
	1: list<i32> startIndexes
}

/** 游戏数据每页id信息 */
struct CommonDataPageIds{
	1: i32 startIndex
	2: list<i64> cacheIds
}

/** 游戏数据分页信息 */
struct CommonDataPageInfos {
	1: list<CommonDataPageIds> pageIds
	/** 信息总数 */
	2: i32 totalSize
	/** 此类信息总版本号 */
	3: optional i16 version
	/** 从未发给客户端的，或者需要更新的商品信息 */
	4: optional list<MallItem> updateMallItems
	/** 需要更新的温泉广场信息 */
	5: optional list<GroundRoomInfo> updateGroundRoomInfos
	/** 需要更新的竞技房间信息 */
	6: optional list<DanceRoomInfo> updateDanceRoomInfos
	/** 需要更新的舞团信息 */
	7: optional list<GuildBaseInfo> updateGuildInfos
	/** 需要更新的婚礼动态信息 */
	8: optional list<WeddingNotice> updateWeddingNotices
	/** 需要更新的婚房信息 */
	9: optional list<WeddingRoomInfo> updateWeddingRoomInfos
}

/** 请求对应id的信息响应 */
struct CommonDataQueryByIdsResponse{
	/** 客户端请求的类型 */
	1: optional i16 fromType
	/** 客户端此类缓存信息总版本号 */
	2: optional i16 version
	/** 需要更新的商品信息 */
	3: optional list<MallItem> mallItems
	/** 需要更新的温泉广场信息 */
	4: optional list<GroundRoomInfo> groundRoomInfos
	/** 需要更新的竞技房间信息 */
	5: optional list<DanceRoomInfo> danceRoomInfos
	/** 需要更新的舞团信息 */
	6: optional list<GuildBaseInfo> guildInfos
}

/** 请求对应id的信息参数 */
struct CommonDataQueryByIdsParam{
	/** 客户端没有缓存的信息id */
	1: list<i64> noCachedIds
	/** 客户端有缓存的信息id */
	2: optional list<i64> cachedIds
	/** 客户端请求的类型 */
	3: optional i16 fromType
	/** 客户端此类缓存信息总版本号 */
	4: optional i16 version
}

/** 新手引导日志 */
struct GuildeLog{
	/** 新手引导的ID*/
	1: string tutorialId
	/** 新手引导的名称*/
	2: string tutorialName
	/** 新手引导其它信息*/
	3: string details
	/** 新手引导开始时间*/
	4: i64 beginTime
	/** 角色的开始等级*/
	5: i32 beginRoleLevel
	/** 角色的结束等级*/
	6: i32 endRoleLevel
	/** 使用时间，单位s*/
	7: i64 useTime
	/** 引导情况（未完成：-1，完成：1，开始 ：0）*/
	8: i32 stepType
}
/** 性能按钮日志*/
struct PerformanceLog{
	/** 点击时所在场景：房间、游戏中*/
	1: string scene
	/** 生涯梦工厂闯关时则记录关卡ID、劲舞大厅则记录房间ID等*/
	2: i32 sceneId
	/** 0：正常；1：关闭*/
	3: i32 close
}

/** 充值红包信息*/
struct RechargeLuckyMoney{
	/** 充值红包个数 */
	1: i32 luckyMoneyNumber
	/** 红包类型 */
	2: LuckyMoneyType luckyMoneyType
	/** 红包寄语 */
	3: string words;
	/** 收红包角色id */
	4: i64 charId;
}
/** 上传照片日志*/
struct UploadPhotoLog{
	/** 上传照片的地方，游戏场景*/
	1: i32 reason
	/** 拍照、相册选择*/
	2: string source
	/** 上传后的图片地址，访问地址可以直接看到该图片*/
	3: string address
}
/** 首充奖励领取状态*/
enum FirstRechargeAwardState{
	/** 没有首充 */
	FRIST_RECHARGE_NO
	/** 首充没有领取奖励 */
	FRIST_RECHARGE_NOG_GET_AWARD
	/** 首充领取奖励 */
	FRIST_RECHARGE_GET_AWARD
}

/**道具对象 */
struct ItemObject{
  /** 道具id*/
 1: i32 itemId
 /** 道具数量 */
 2: i16 count
}
