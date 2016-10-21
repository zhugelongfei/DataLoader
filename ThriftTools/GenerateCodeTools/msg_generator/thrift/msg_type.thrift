namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto

enum MessageType{
//客户端发往服务器消息定义开始,范围101~2000
	CS_BEGIN=100
	/** 登录信息 */
	CS_USER_PASSWD
	/** 快速开始游戏 */
	CS_QUICK_START
	/** 舞蹈动作正确状态 */
	CS_DANCE_STATUS
	/** 广播聊天信息 */
	CS_BROADCAST_CHAT
	/** 请求重新开始房间内舞蹈 */
	CS_RESTART_DANCE
	/** 退出房间 */
	CS_EXIT_ROOM
	/** 客户端运行状态(前端或后端) */
	CS_RUN_STATE
	/** 客户端返回的Ping消息 */
	CS_CLIENT_PING
	/** 同步舞蹈结果 */
	CS_SYNC_DANCE_INFO
	/** 快速登录 */
	CS_QUICK_LOGIN
	/** 换装 */
	CS_CHANGE_CLOTHES
	/** 调整部位系数 */
	CS_ADJUST_AVATAR_VAL
	/** 换装 */
	CS_CHANGE_AVATAR
	/** 打开衣橱 */
	CS_OPEN_ALMIRAH
	/** 舞蹈准备完毕消息 */
	CS_PREPARE_DANCE_FINISH
	/** 舞蹈完毕消息 */
	CS_DANCE_FINISH
	/** 使用物品 */
	CS_USE_ITEM
	/** 舞蹈完毕消息 */
	CS_PUT_ATHLETICS_ITEM
	/** 购买单个商品 */
	CS_BUY_SINGLE_ITEM
	/** 购买多个商品 */
	CS_BUY_MULTI_ITEMS
	/** 查询充值套餐 */
	CS_QUERY_PURCHASE_INFO
	/** 发送充值token */
	CS_PURCHASE_TOKEN
	/** 请求随机名字 */
	CS_RAND_CHAR_NAME
	/** 创建角色 */
	CS_CREATE_NEW_CHAR
	/** 临时账号绑定 */
	CS_TEMP_USER_BIND
	/** 私聊 */
	CS_WHISPER
	/** 删除物品 */
	CS_DELETE_ITEM
	/** 舞蹈阶段 */
	CS_DANCE_PERIOD
	/** 保存喜欢的套装 */
	CS_SAVE_FAVORITE_AVATARS
	/** 穿上喜爱的套装 */
	CS_PUT_FAVORITE_AVATARS
	/** 查询音乐记录信息 */
	CS_QUERY_MUSIC_RECORD
	/** 获取连续登录奖励领取信息 */
	CS_GET_LOGIN_AWARD_INFO
	/** 获取连接登录奖励 */
	CS_GET_LOGIN_AWARD
	/** 获取离线点券奖励 */
	CS_GET_OFFLINE_COUPON
	/** 玩家发送反馈信息 */
	CS_SEND_FEED_BACK
	/** 玩家查询奖励列表 */
	CS_QUERY_COMMON_PRIZE
	/** 玩家领取奖励 */
	CS_GET_GM_PRIZE
	/** 添加好友 */
	CS_ADD_FRIEND
	/** 查询好友列表 */
	CS_QUERY_FRIEND_LIST
	/** 显示好友的名片信息 */
	CS_SHOW_BUSINESS_CARD_INFO
	/** 删除好友 */
	CS_DELETE_FRIEND
	/** 查询竞技房间信息 */
    CS_QUERY_DANCE_ROOM_INFOS
	/** 创建邀请房间 */
	CS_CREATE_DANCE_ROOM
	/** 随机进入邀请房间 */
	CS_RAND_JOIN_DANCE_ROOM
	/** 设置房间音乐 */
	CS_SET_ROOM_MUSIC
	/** 加入房间 */
	CS_JOIN_DANCE_ROOM
	/** 踢出成员 */
	CS_KICK_OUT_ROOM_MEMBER
	/** 请求开始邀请赛 */
	CS_REQ_START_ROOM_DANCE
	/** 等待加载音乐状态 */
	CS_PREPARE_DANCE_STATUS
	/** 锁定房间 */
	CS_DANCE_ROOM_LOCK_OPER
	/** 查询邀请玩家信息 */
	CS_QUERY_INVITE_PLAYER_INFOS
	/** 邀请加入房间 */
	CS_INVITE_JOIN_DANCE_ROOM
	/** 响应邀请 */
	CS_INVITE_JOIN_ROOM_RESP
	/** 查询玩家 */
	CS_SEARCH_PLAYER
	/** 同步下载音乐进度 */
	CS_ROOM_LOAD_MUSIC_PROCESS
	/** 举报聊天 */
	CS_REPORT_CHAT
	/** 查询GM活动 */
	CS_QUERY_GM_ACTIVITY
	/** 邀请房间内做动作 */
	CS_ROOM_ACTION
	/** 发送一个语音邮件 */
	CS_SEND_VOICE_MAIL
	/** 查询自己的会话列表 */
	CS_QUERY_CONVERSATION_LIST
	/** 同步情侣舞蹈输入信息 */
	CS_BATTLE_DANCE_SYNC_INFO
	CS_QUERY_MALL
	CS_QUERY_MALL_VERSION
	/** 查询语音邮件列表 */
	CS_QUERY_VOICE_MAIL_LIST
	/** 获取通知内容 */
	CS_QUERY_NOTIFICATION_LIST
	/** 删除通知 */
	CS_DELETE_NOTIFICATION
	/** 根据id查询商城物品信息 */
	CS_QUERY_MALL_BY_IDS
	/** 删除语音邮件 */
	CS_DELETE_VOICE_MAIL
	/** 查询音乐的解锁信息 */
	CS_QUERY_MUSIC_LOCK_INFO
	/** 申请解锁音乐 */
	CS_APPLY_UNLOCK_MUSIC
	/** 购买解锁音乐 */
	CS_BUY_UNLOCK_MUSIC
	/** 随机查询在线角色 */
	CS_RANDOM_QUERY_CHARACTER
	/** 查询玩家是否在线 */
	CS_QUERY_ONLINE_CHAR
	/** 查询游戏公告 */
	CS_QUERY_ACTIVITY_NOTICE
	/** 保存名片信息 */
	CS_SAVE_BUSINESS_CARD_INFO
	/** 改变斗舞的队伍信息 */
	CS_BATTLE_CHANGE_TEAM
	/** 客户端存在的音乐列表 */
	CS_EXIST_MUSIC_LIST
	/** 查询排行榜信息 */
	CS_QUERY_RANK_LIST
	/** 随机查询一批角色 */
	CS_RAND_QUICK_MATCH_CHAR_LIST
	/** 完成历程 */
	CS_COMPLETE_COURSE_TASK
	/** 查询音乐的最高分 */
	CS_QUERY_MUSIC_HIGH_SCORE
	/** 图片的操作 */
	CS_PIC_ACTION
	/** 显示图片 */
	CS_PIC_SHOW
	/** 上传图片 */
	CS_PIC_UPLOAD
	/** 扩充背包 */
	CS_EXPAND_BAG
	/** 赠送 */
	CS_DONATE
	/** 查询收件箱 */
	CS_QUERY_RECIVE_MAIL
	/** 我的赠送历史 */
	CS_MY_DONATES
	/** 我收到的礼物历史 */
	CS_MY_GIFTS
	/** 领取邮件奖励 */
	CS_GET_REWARD_BY_MAIL
	/** 房间内坐下 */
	CS_SIT_DOWN
	/** 房间内站起 */
	CS_STAND_UP
	/** 许愿 */
	CS_MAKE_WISH
	/** 查询愿望 */
	CS_QUERY_WISH
	/** 删除愿望 */
	CS_DEL_WISH
	/** 完成愿望 */
	CS_OVER_WISH
	/** 绑定第三方帐号 */
	CS_BIND_3RD_ACCOUNT
	/** 查询绑定第三方帐号信息，是否在游戏中绑定过 */
	CS_QUERY_BIND_3RD_INFO
	/** 解绑第三方帐号 */
	CS_UNBIND_3RD_ACCOUNT
	/** 使用激活码领奖* */
	CS_USE_ACTIVE_CODE
	/** 请求获得短信要求激活码 */
	CS_GET_SMS_INVITE_CODE
	/** 保存激活码，手机号 */
	CS_SAVE_SMS_INVITE_CODE
	/** 使用短信邀请激活码 */
	CS_USE_SMS_INVITE_CODE
	/** 发送短信验证码 */
	CS_SEND_SMS_VALIDATE_CODE
	/** 领取短信邀请激活码奖励 */
	CS_GET_SMS_INVITE_PRIZE
	/** 抽奖 */
	CS_LOTTERY
	/** 找人实现愿望 */
	CS_REQUEST_HELP_WISH
	/** 显示邮件详细内容 */
	CS_SHOW_MAIL_INFO
	/** 删除邮件 */
	CS_DEL_MAIL
	/** 查看每日竞技活动 */
	CS_QUERY_GM_ACTIVITY_INFO
	/** 领取GM活动奖励 */
	CS_GET_GM_ACTIVITY_PRIZE
	/** 联运平台帐号登录 */
	CS_CHANNEL_USER_LOGIN
	/** 玩家的临时设置 */
	CS_SETTINGS
	/** 道具续费 */
	CS_ITEM_RENEW
	/** 设备的token */
	CS_DEVICE_TOKEN
	/** 生成充值订单 */
	CS_GENERATE_ORDER
	/** 查询成功充值订单 */
	CS_QUERY_RECHARGE_SUCC_ORDER
	/** 开始舞蹈前的表演结束 */
	CS_SHOW_FINISH
	/** 接受历程任务 */
	CS_REFRESH_DAILY_COURSE_TASK
	/** 刷新图鉴物品列表 */
	CS_REF_CONSTELLATION_ITEMS
	/** 请求当前星座图鉴物品列表 */
	CS_REQ_CONSTELLATION_ITEMS
	/** 兑换图鉴物品 */
	CS_CONSTELLATION_SWAP_ITEM
	/** 幸运星盘抽奖 */
	CS_REQ_CONSTELLATION_LOTTERY
	/** 放弃历程 */
	CS_SHELVE_COURSE_TASK
	/** 同步历程进度 */
	CS_SYNC_COURSE_TASK_PROCESS
	/** 追踪好友 */
	CS_FOLLOW_FRIEND
	/** 激活历程 */
	CS_ACTIVE_COURSE_TASK
	/** 请求单曲活动信息 */
	CS_QUERY_MUSIC_ACTIVITY
	/** 更换榜单 */
	CS_UPDATE_MUSIC_RANK
	/** 查询热曲列表 */
	CS_QUERY_HOT_MUSIC_LIST
	/** 查询下一个历程信息 */
	CS_QUERY_NEXT_COURSE
	/** 查询道具可以出售的价格 */
	CS_QUERY_SELL_ITEM_PRICE
	/** 卖出道具 */
	CS_SELL_ITEM
	/** 取得钥匙活动列表 */
	CS_GET_KEY_ACTIVE
	/** 兑换钥匙 */
	CS_EXCHANGE_ACTIVITY_KEY
	/** 观战房间交换位置 */
	CS_EXCHANGE_POS
	/** 保存标签 */
	CS_SAVE_TAG_ID
	/** 背包内赠送 */
	CS_DONATE_ITEM
	/** 获取星座开放列表 */
	CS_GET_CONSTELLATION_IDS
	/** 查询充值，连登活动 */
	CS_QUERY_RECHARGE_AND_SUGNIN_INFO
	/** VIP等级奖励信息 */
	CS_VIP_LEVEL_PRIZE
	/** 获得VIP等级奖励信息 */
	CS_GET_VIP_LEVEL_PRIZE
	/** 领取活动奖励 */
	CS_GET_ACTIVITY_PRIZE
	/** 获取浏览器网址信息 */
	CS_GET_URL_INFO
	/** 玩家点击DIY按钮的消息，用于触发完成任务 */
	CS_CLICK_DIY_BUTTON
	/** AppStore评价 */
	CS_APP_STORE_RATE
	/** 防沉迷 */
	CS_CHANNEL_ADDICTION
	/** 追踪转换消息 */
	CS_CONVERSION_TACKING
	/** 询问是否可以进入观战列表：大于1.2.5.0才提示，小于等于则放过 */
	CS_REPONSE_WATCH
	/** 点击上传照片按钮 */
	CS_CLICK_UPLOAD_PIC_BUTTON
	/** 点击上传头像按钮 */
	CS_CLICK_UPLOAD_HEAD_BUTTON
	/** 膜拜舞团玩家*/
	CS_GUILD_WORSHIP
	/** 查询舞团列表 */
	CS_QUERY_GUILD_LIST
	/** 查询我的舞团信息 */
	CS_QUERY_MY_GUILD_INFO
	/** 查询我的舞团成员列表 */
	CS_QUERY_GUILD_MEM_LIST
	/** 团长查询申请列表 */
	CS_QUERY_APPLY_LIST
	/** 团长允许申请加入 */
	CS_ALLOW_JOIN_GUILD
	/** 团长修改公告 */
	CS_MODIFY_NOTICE
	/** 转让团长 */
	CS_TRANSFER_DEGREE
	/** 剔除成员 */
	CS_GUILD_KICK_PLAYER
	/** 加入申请舞团列表 */
	CS_ADD_APPLY_LIST
	/** 团员退出舞团 */
	CS_QUIT_GUILD
	/** 创建舞团 */
	CS_GUILD_CREATE
	/** 玩家改名 */
	CS_CHANGE_CHAR_NAME
	/** 查询玩家申请帮会列表 */
	CS_MY_APPLY_GUILD_LIST
	/** 团长拒绝玩家申请 */
	CS_GUILD_REUSE_APPLY
	/** 玩家取消申请加入舞团 */
	CS_GUILD_REMOVE_APPLY
	/** 查询收集兑换活动信息 */
	CS_GET_COLLECT_EXCHANGE_INFO
	/** 兑换收集活动奖励 */
	CS_GET_COLLECT_EXCHANGE_PRIZE
	/** 团长邀请加入舞团 */
	CS_INVITE_JOIN_GUILD
	/** 玩家同意加入舞团 */
	CS_AGREE_JOIN_GUILD
	/** 检查客户端是否需要更新 */
	CS_CHECK_CLIENT_UPDATE
	/** 获取邮件分页大小 */
	CS_GET_MAIL_PAGE_SIZE
	/** 获得附近的人 */
	CS_NEAR_QUERY_CHARACTER
	/** 更新地理位置信息 */
	CS_UPDATE_GEO_INFO
	/** 情侣模式小游戏同步 */
	CS_LOVERS_GAME
	/** 更换队伍 */
	CS_CHANGE_TEAM
	/** 领取人气奖励 */
	CS_GET_POP_LEVEL_PRIZE
	/** 开始婚礼步骤 */
	CS_NEXT_WEDDING_STEP
	/** 摸一摸好友请求 */
	CS_TOUCH_FRIEND
	/** 摸一摸记录请求 */
	CS_TOUCH_RECORDS
	/** 加载结婚资源 */
	CS_FINISH_LOAD_WEDDING_RESOURCE
	/** 添加密友 */
	CS_ADD_CLOSE_FRIEND
	/** 同意添加好友 */
	CS_ACCEPT_CLOSE_FRIEND
	/** 保存密友关系描述 */
	CS_SAVE_RELATIONSHIP
	/** 保存心情留言 */
	CS_SAVE_MOOD_WORDS
	/** 保存pose */
	CS_SAVE_POSE
	/** 兑换活动 */
	CS_GET_COMPOSE_ACTIVITY
	/** 兑换活动可以兑换的物品 */
	CS_GET_COMPOSE_ACTIVITY_DETAIL
	/** 兑换活动版本 */
	CS_COMPOSE_ACTIVITY_VERSION
	/** 请求所有密友信息 */
	CS_GET_CLOSE_FRIEND_INFOS
	/** 请求删除密友 */
	CS_REQ_DELETE_CLOSE_FRIEND
	/** 婚礼答谢 */
	CS_WEDDING_THANK
	/** 接领活动任务 */
	CS_GET_ACTIVITY_COURSE_TASK
	/** 舞团签到 */
	CS_GUILD_SIGN_IN
	/** 舞团捐赠 */
	CS_GUILD_DONATE
	/** 查询舞团列表 */
	CS_SEARCH_GUILD_LIST
	/** 领取密友礼包 */
	CS_GET_CLOSE_FRIEND_GIFT
	/** 加为情侣 */
	CS_BE_MY_LOVER
	/** 同意加为情侣 */
	CS_ACCEPT_LOVER
	/** 获取情侣信息 */
	CS_LOVER_INFO
	/** 获取纪念日 */
	CS_SPECIAL_DAYS
	/** 舞团世界招募 */
	CS_GUILD_WORLD_INVITE
	/** 积分商城绑定邮箱 */
	CS_BIND_EMAIL
	/** 获取订单校验码 */
	CS_BUY_POINT_ITEM
	/** 订单确定 */
	CS_POINT_ORDER_CHECK
	/** 查询订单 */
	CS_QUERY_POINT_ORDER
	/** 获取绑定邮箱验证码 */
	CS_EMAIL_CHECK_CODE
	/** 积分商城订单申诉 */
	CS_POINT_ORDER_APPEAL
	/** 领取婚戒 */
	CS_TAKE_RING
	/** 婚龄列表 */
	CS_YEARS_OF_MARRIED
	/** 离婚 */
	CS_DIVORCE
	/** 服务器能够兑换的积分上限 */
	CS_SERVER_POINT_LIMIT
	/** 代理平台的登陆验证消息 */
	CS_AGENT_USER_LOGIN
	/** SOHA平台充值成功客户端调用服务器消息 */
	CS_SOHA_ORDER_SUCCESS
	/** 老虎机剩余角子数 */
	CS_SLOT_PRIZE_POOL
	/** 老虎机开始抽奖 */
	CS_SLOT_DO_DRAW
	/** 舞团改名 */
	CS_CHANGE_GUILD_NAME
	/** 限时抢购活动 */
	CS_LIMIT_SALE_ACTIVITY
	/** 限时抢购活动道具 */
	CS_LIMIT_SALE_ACTIVITY_ITEM
	/** 限时抢购活动道具购买 */
	CS_LIMIT_SALE_ACTIVITY_BUY
	/** 绑定用户 */
	CS_BIND_USER_NAME
	/** 选择角色 */
	CS_SELECT_CHAR
	/** 舞团任务列表 */
	CS_GUILD_TASK_LIST
	/** 舞团接任务 */
	CS_ACCEPT_GUILD_TASK
	/** 交舞团任务 */
	CS_FINISH_GUILD_TASK
	/** 领取舞团奖励 */
	CS_TAKE_GUILD_REWARD
	/** 可接受舞团任务 */
	CS_GUILD_ACCEPT_TASK_IDS
	/** 舞团奖励列表 */
	CS_ALL_GUILD_REWARDS
	/** 领取角子机奖励 */
	CS_TAKE_SLOT_PRIZE
	/** 使用道具条件 */
	CS_USE_ITEM_CONDITION
	/** 获取定时抽奖的活动 */
	CS_GET_TIMING_LOTTERY
	/** 获取定时抽奖的次数 */
	CS_GET_FREE_LOTTERY_COUNT
	/** 人气等级奖励列表 */
	CS_CHAR_AND_POPULARITY_REWARDS
	/** 领取人气等级奖励 */
	CS_TAKE_CHAR_AND_POPULARITY_REWARDS
	/** 查询闯关奖励信息 */
	CS_CHAPTER_OPER_INFO
	/** 匹配闯关房间 */
	CS_RAND_JOIN_CHAPTER_ROOM
	/** 查看宝箱奖励 */
	CS_LOOK_TREA_BOX
	/** 查询神秘商店物品 */
	CS_QUERY_MYSTERY_ITEM
	/** 购买神秘商店物品 */
	CS_BUY_MYSTERY_ITEM
	/** 刷新神秘商店物品 */
	CS_RAND_MYSTERY_ITEM
	/** 打开神秘商店列 */
	CS_OPEN_MYSTERY_COL	
	/** 请求任务信息 */
	CS_REQ_COURSE_TASK_INFOS
	/** 请求刷新随机任务 */
	CS_REFRESH_RAND_COURSE_TASK	
	/** 请求巡演章节信息 */
	CS_REQ_TOUR_CHAPTER_INFO
	/** 请求巡演关卡详细信息 */
	CS_REQ_TOUR_RAID_DETAIL
	/** 更新房间巡演关卡信息 */
	CS_UPDATE_ROOM_TOUR_RAID
	/** 请求通告信息 */
	CS_REQ_ANNOUNCE_INFO
	/** 请求开始通告 */
	CS_REQ_START_ANNOUNCE
	/** 请求刷新通告冷却时间 */
	CS_REFRESH_ANNOUNCE
	/** 请求增加通告次数 */
	CS_ADD_ANNOUNCE_TIMES
	/** 请求刷新通告商店 */
	CS_REFRESH_ANNOUNCE_SHOP
	/** 请求增加通告次数消耗 */
	CS_ADD_ANNOUNCE_COST
	/** 游戏内换线 */
	CS_CHANGE_GAME_LINE
	/** 请求成就进度信息 */
	CS_REQ_ACHIEVE_PROCESS_INFO
	/** 请求成就详细信息 */
	CS_REQ_ACHIEVE_DETAIL_INFO
	/** 领取成就奖励 */
	CS_GET_ACHIEVE_PRIZE
	/** 一键领取成就奖励 */
	CS_GET_ALL_ACHIEVE_PRIZE
	/** 房间内移动 */
	CS_CLICK_MOVE
	/** 请求合成信息 */
	CS_REQ_COMPOSE_INFO
	/** 请求合成道具 */
	CS_REQ_COMPOSE_ITEM
	/** 请求进化道具 */
	CS_REQ_EVOLVE_ITEM
	/** 查询巡演星数奖励状态信息 */
	CS_GET_TOUR_STAR_PRIZE_STATUS
	/** 领取巡演星数奖励 */
	CS_GET_TOUR_STAR_PRIZE
	/** 巡演踩中陷阱 */
	CS_STEP_IN_TOUR_TRAP
	/** 请求即兴表演信息 */
	CS_REQ_IMPROVISE_INFO
	/** 请求即兴表演随机任务 */
	CS_REQ_IMPROVISE_RAND_TASKS
	/** 购买即兴表演次数 */
	CS_BUY_IMPROVISE_PLAY_COUNT
	/** 请求快速通过即兴表演 */
	CS_QUICK_PASS_IMPROVISE_TASK
	/** 请求即兴表演兑换商店信息 */
	CS_REQ_IMPROVISE_SHOP
	/** 兑换即兴表演商店商品 */
	CS_BUY_IMPROVISE_SHOP_ITEM
	/** 重置即兴表演兑换信息 */
	CS_RESET_IMPROVISE_SHOP
	/** 请求徽章栏信息 */
	CS_REQ_BADGE_BAG_INFO
	/** 卸下徽章 */
	CS_PUT_OFF_BADGE
	/** 穿上徽章 */
	CS_PUT_ON_BADGE
	/** 请求徽章解锁信息 */
	CS_REQ_BADGE_UNLOCK_INFO
	/** 请求训练信息 */
	CS_REQ_TRAIN_INFO
	/** 请求开始训练 */
	CS_REQ_START_TRAIN
	/** 请求购买训练次数 */
	CS_BUY_TRAIN_COUNT
	/** 查询游戏线信息 */
	CS_QUERY_GAME_LINE_INFO	
	/** 显示名片指定信息类型详情 */
	CS_SHOW_BUSINESS_CARD_DETAIL
	/** 查询上榜的信息 */
	CS_QUERY_ON_RANK_INFO
	/** 请求对房间内的成员做交互动作 */
	CS_REQUEST_ROOM_ACTION
	/** 响应做动作请求 */
	CS_RESPONSE_ROOM_ACTION
	/** 请求时尚栏信息 */
	CS_REQ_FASHION_BAG_INFO
	/** 应用时尚信息 */
	CS_APPLY_FASHION_INFO
	/** 房间内衣橱开关操作 */
	CS_WARDROBE_OPER_IN_ROOM
	/** diy染色avatar */
	CS_DIY_AVATAR
	/** 查询排行榜第一名信息 */
	CS_QUERY_TOP_ONE_RANKS
	/** 膜拜排行榜上榜玩家 */
	CS_WORSHIP_ON_RANK
	/** 请求已膜拜上榜玩家信息 */
	CS_QUERY_WORSHIP_ON_RANK_INFOS
	/** 查询婚礼动态信息 */
	CS_QUERY_WEDDING_NOTICES
	/** 请求祝福新婚夫妻 */
	CS_REQ_WEDING_BLESS
	/** 查询新婚夫妻信息 */
	CS_QUERY_NEWLY_WEDS_INFO
	/** 查询婚礼房间 */
	CS_QUERY_WEDDING_ROOMS
	/** 请求置顶自己的婚礼动态 */
	CS_REQ_TOP_SELF_WEDDING_NOTICE
	/** 请求密友信息 */
	CS_GET_CLOSE_FRIEND_INFO
	/** 请求密友关系奖励信息 */
	CS_REQ_CLOSE_FRIEND_GIFT_INFOS
	/** 请求情侣关系奖励信息 */
	CS_REQ_LOVER_GIFT_INFOS
	/** 领取情侣奖励 */
	CS_GET_LOVER_GIFT
	/** 使用密友或情侣间的关系等级称呼 */
	CS_USE_RELATIONSHIP
	/** 响应求婚 */
	CS_ACCEPT_LOVER_PROPOSAL
	/** 请求快速加入通告房间 */
	CS_QUICK_JOIN_ANNOUNCE_ROOM
	/** 切换广场区域 */
	CS_CHANGE_GROUND_AREA
	/** 进入广场行为状态 */
	CS_ENTER_GROUND_ACTION_STATUS
	/** 请求广场解锁交互动作信息 */
	CS_REQ_GROUND_ACTION_OPEN_INFO
	/** 邀请猜拳游戏 */
	CS_INVITE_FINGER_GUESS
	/** 响应猜拳邀请 */
	CS_RESP_INVITE_FINGER_GUESS
	/** 猜拳游戏出手 */
	CS_FINGER_GUESS_CHOICE
	/** 广场舞蹈区使用香槟 */
	CS_USE_CHAMPAGNE
	/** 请求舞团商店信息 */
	CS_QUERY_GUILD_SHOP
	/** 购买舞团商店物品 */
	CS_BUY_GUILD_ITEM
	/** 刷新商店物品 */
	CS_REFRESH_GUILD_SHOP
	/** 查询广场房间 */
	CS_QUERY_GROUND_ROOMS
	/** 批量处理入团申请 */
	CS_HANDLE_ALL_GUILD_APPLY
	/** 请求刷新通告商店消耗 */
	CS_REFRESH_ANNOUNCE_SHOP_COST
	/** 请求刷新通告冷却时间消耗 */
	CS_REFRESH_ANNOUNCE_COST
	/** 请求婚礼放烟火 */
	CS_REQ_WED_FIREWORKS
	/** 请求签到信息 */
	CS_REQ_SIGN_IN_INFO
	/** 请求签到 */
	CS_REQ_SIGN_IN
	/** 请求通告商店物品 */
	CS_REQ_ANNOUNCE_SHOP_ITEMS
	/** 请求购买通告商店物品 */
	CS_BUY_ANNOUNCE_SHOP_ITEM
	/** 查询人气等级奖励状态 */
	CS_POP_LEVEL_PRIZED_STATUS
	/** 请求发红包 */
	CS_REQ_MAKE_LUCKY_MONEY
	/** 请求抢红包 */
	CS_REQ_GET_LUCKY_MONEY
	/** 请求我发出的红包 */
	CS_REQ_LUCKY_MONEY_SEND
	/** 请求我收到的红包 */
	CS_REQ_LUCKY_MONEY_RECEIVE
	/** 请求红包详细信息 */
	CS_REQ_LUCKY_MONEY_DETIAL
	/** 写真通告特殊玩法值 */
	CS_ANNOUNCE_SPECIAL_VAL
	/** 请求开始通告showTime */
	CS_REQ_START_ANNOUNCE_SHOW_TIME
	/** 请求解锁温泉广场动作 */
	CS_REQ_UNLOCK_ACTION
	/** 请求红包领取信息 */
	CS_REQ_LUCKY_MONEY_RECEIVERS
	/** 请求最早红包信息 */
	CS_REQ_FIRST_LUCKY_MONEY_INFO
	/** 剧情播放完成 */
	CS_STORY_PLAY_FINISH
	/** 请求放烟花 */
	CS_REQ_LIGHT_FIRE_WORKS
	/** 请求服装套装信息 */
	CS_REQ_AVATAR_SUIT
	/** 保存服装套装信息 */
	CS_SAVE_AVATAR_SUIT
	/** 穿上服装套装 */
	CS_PUT_ON_AVATAR_SUIT
	/** 请求授权副团长 */
	CS_REQ_APPOINT_GUILD_DEPUTY
	/** 请求撤销副团长 */
	CS_REQ_CANCLE_GUILD_DEPUTY
	/** 删除时尚信息 */
	CS_DEL_FASHION_INFO
	/** 续费时尚信息 */
	CS_RENEW_FASHION_INFO
	/** 删除服装套装 */
	CS_DROP_AVATAR_SUIT
	/** 请求购买巡演次数 */
	CS_REQ_BUY_TOUR_TIMES
	/** 客户端在login_gate验证通过后，凭返回的gameSession到游戏服验证登录 */
	CS_TOKEN_LOGIN
	/** 请求对应id的广场信息 */
	CS_QUERY_GROUND_ROOM_BY_IDS
	/** 请求对应id的竞技房间信息 */
	CS_QUERY_DANCE_ROOM_BY_IDS
	/** 请求对应id的舞团信息 */
	CS_QUERY_GUILD_BY_IDS	
	/** 请求活动详情 */
	CS_GET_ACTIVITY_DETAIL
    /** 请求活动列表 */
	CS_GET_ACTIVITY_LIST	
	/** 领取活动目标奖励 */
	CS_GET_ACTIVITY_TARGET_PRIZE
	/** 切换账号 */
	CS_CHANGE_ACCOUNT	
	/** 检查账号类型 */
	CS_CHECK_ACCOUNT_TYPE
	/** 请求修改房间名 */
	CS_CHANGE_ROOM_TITLE
	/** 转让房主 */
	CS_TRANSFER_ROOM_LEADER
	/** 设置玩家状态为观战 */
	CS_SET_ROOM_WATCHER
	/** 将玩家从观战改为参战 */
	CS_SET_WATCHER_TO_DANCER
	/** 设置自己的准备状态 */
	CS_SET_ROOM_READY_STATUS
	/** 充值订单认证 */
	CS_CHECK_RECHARGE_RESULT
	/** 请求好友数量 */
	CS_QUERY_CUR_FRIEND_AMOUNT
	/** 显示玩家外观信息 */
	CS_SHOW_PLAYER_APPEARANCE_INFO
	/** 查询默认彩蛋id */
	CS_QUERY_DEFAULT_LOTTERY_ID
	/** 查询可以使用的彩蛋 */
	CS_QUERY_CAN_USE_LOTTERY_ITEMS
	/** 客服端日志 */
	CS_CLIENT_LOG
	/** 请求上传图片获取token*/
	CS_PICTURE_UPLOAD_TOKEN
	/** 请求删除照片获取token*/
	CS_PICTURE_DELETE_TOKEN
	/** 赠送某玩家道具数量 */
	CS_DONATE_ITEM_COUNT
	/** 拒绝好友申请 */
	CS_REFUSE_FRIEND_APPLY
	/** 获取首充活动信息*/
	CS_GET_FIRST_RECHARGE_INFO
	/** 请求领取首充奖励*/
	CS_FIRST_RECHARGE_AWARD
	CS_END
	//客户端发往服务器消息定义结束
	
	//服务器发往客户端消息定义开始,范围
	SC_BEGIN=2000
	/** 用户登录后返回的帐号信息 */
	SC_USER_INFO
	/** 系统信息 */
	SC_SYSTEM_INFO
	/** 开始准备进入舞蹈 */
	SC_START_PREPARE_DANCE
	/** 舞蹈动作消息 */
	SC_DANCE_STATUS
	/** 经过服务端过滤的聊天消息 */
	SC_CHAT
	/** 重新开始房间内舞蹈 */
	SC_RESTART_DANCE
	/** 退出房间 */
	SC_EXIT_ROOM
	/** 舞蹈对战结束时统计的分数排名 */
	SC_DANCE_MARK_RESULT
	/** 退出游戏后重新进入房间 */
	SC_RETURN_DANCE_ROOM
	/** 服务器时间校验 */
	SC_SERVER_PING
	/** 舞蹈中同步舞蹈信息 */
	SC_SYNC_DANCE_INFO
	/** 舞蹈中同步分数消息 */
	SC_SYNC_MARK_INFO
	/** 操作结果消息 */
	SC_OPER_RESULT
	/** 背包物品消息 */
	SC_BAG_ITEMS_INFO
	/** 身上avatar消息 */
	SC_BODY_ITEMS_INFO
	/** 准备完毕，开始舞蹈消息 */
	SC_START_DANCE
	/** 设置竞技道具结果 */
	SC_PUT_ATHLETICS_ITEM_RESULT
	/** 使用物品结果 */
	SC_USE_ITEM_RESULT
	/** 当前设置的竞技道具信息 */
	SC_ATHLETICS_ITEM_INFO
	/** 增加背包物品 */
	SC_ADD_BAG_ITEMS
	/** 删除物品 */
	SC_DELETE_ITEM
	/** 充值套餐信息 */
	SC_APP_PURCHASE_INFOS
	/** 开始创建角色 */
	SC_CREATE_NEW_CHAR
	/** 随机新角色名 */
	SC_NEW_CHAR_RAND_NAME
	/** 创建角色结果 */
	SC_CREATE_CHAR_RESULT
	/** 绑定账号结果 */
	SC_TEMP_USER_BIND_RES
	/** 角色属性更新 */
	SC_UPDATE_CHAR_PROPERTY
	/** 密语 */
	SC_WHISPER
	/** 更新物品信息 */
	SC_UPDATE_ITEM_INFO
	/** 喜欢的套装信息 */
	SC_FAVORITE_AVATARS_INFO
	/** 音乐记录信息 */
	SC_MUSIC_RECORD_INFO
	/** 服务器信息 */
	SC_SERVER_INFO
	/** 服务器信息 */
	SC_CHECK_BIND_USER_PASSWD
	/** 获取连续登录领取奖励信息的结果 */
	SC_GET_LOGIN_AWARD_INFO_RESULT
	/** 领取登录奖励的结果 */
	SC_GET_LOGIN_AWARD_RESULT
	/** 当天是否有没有领取过的奖励信息 */
	SC_NEW_LOGIN_AWARD
	/** 获取离线点券奖励信息 */
	SC_GET_OFFLINE_COUPON_RESULT
	/** 玩家发送反馈信息 */
	SC_SEND_FEED_BACK_RESULT
	/** 玩家发送反馈信息 */
	SC_GAME_NOTICE
	/** 查询游戏补偿名称列表 */
	SC_USER_PRIZE_INFOS
	/** 有新的GM补偿奖励消息 */
	SC_NEW_GM_PRIZES
	/** 成为好友消息 */
	SC_BECOME_FRIEND
	/** 好友列表 */
	SC_FRIEND_LIST
	/** 显示好友avatar */
	SC_SHOW_BUSINESS_CARD_INFO_RESULT
	/** 删除好友 */
	SC_DELETE_FRIEND
	/** 添加好友的通知 */
	SC_ADD_FRIEND_NOTIFY
	/** 好友上下线通知 */
	SC_FRIEND_STATE_NOTIFY
	/** 竞技房间信息 */
	SC_DANCE_ROOM_INFOS
	/** 加入房间信息 */
	SC_JOIN_DANCE_ROOM
	/** 更新歌曲 */
	SC_UPDATE_ROOM_MUSIC
	/** 添加成员 */
	SC_ADD_ROOM_MEMBER
	/** 房间内通知 */
	SC_DANCE_ROOM_NOTICE
	/** 邀请玩家信息 */
	SC_INVITE_PLAYER_INFOS
	/** 被邀请入房间 */
	SC_INVITED_JOIN_DANCE_ROOM
	/** 搜索邀请的玩家信息 */
	SC_SEARCH_INVITE_PLAYER_INFOS
	/** 退出邀请赛房间 */
	SC_EXIT_INVITE_ROOM
	/** 更新房间锁定状态 */
	SC_UPDATE_ROOM_LOCK_STATE
	/** 好友的charId列表 */
	SC_FRIEND_CHAR_ID_LIST
	/** 在线好友列表 */
	SC_ONLINE_FRIEND_LIST
	/** 准备舞蹈状态 */
	SC_PREPARE_DANCE_STATUS
	/** 同步下载音乐进度 */
	SC_ROOM_LOAD_MUSIC_PROCESS
	/** 开始下载音乐 */
	SC_BEGIN_LOAD_MUSIC
	/** 活动列表 */
	SC_GM_ACTIVITY_LIST
	/** 开始邀请赛倒计时 */
	SC_BEGIN_COUNT_DOWN
	/** 邀请房间内广播动作 */
	SC_ROOM_ACTION
	/** 快速开始进入房间信息 */
	SC_QUICK_DANCE_ENTER_INFO
	/** 领取GM活动奖励结果 */
	SC_GET_GM_ACTIVITY_PRIZE_RESULT
	/** 会话列表 */
	SC_CONVERSATION_LIST
	/** 一个会话中的语音邮件列表 */
	SC_VOICE_MAIL_LIST
	/** 斗舞蹈信息 */
	SC_BATTLE_DANCE_SYNC_INFO
	/** 斗舞蹈阶段分数 */
	SC_BATTLE_DANCE_PART_RESULT_INFO
	/** 斗舞蹈竞赛阶段 */
	SC_BATTLE_DANCE_COMPETE
	/** 斗舞蹈结束 */
	SC_BATTLE_DANCE_FINISH_INFO
	SC_MALL_ITEMS_INFO
	SC_MALL_VERSION
	SC_MALL_XXXXXXXXXXX
	/** 发送语音邮件的结果 */
	SC_SEND_VOICE_MAIL_RESULT
	/** 通知列表 */
	SC_NOTIFICATION_LIST
	/** 推送斗舞的音乐数据 */
	SC_BATTLE_DANCE_INPUT_INFO
	/** 根据id查询商城物品信息的返回结果 */
	SC_MALL_INFOS
	/** 推送音乐的解锁信息 */
	SC_MUSIC_LOCK_INFO
	/** 音乐解锁信息 */
	SC_UNLOCK_MUSIC
	/** 随机查询在线角色 */
	SC_RANDOM_CHARACTER
	/** 游戏公告 */
	SC_ACTIVITY_NOTICE
	/** 保存名片信息成功 */
	SC_SAVE_BUSINESS_CARD_INFO_OK
	/** 斗舞的队伍信息 */
	SC_BATTLE_DANCE_TEAM_INFO
	/** 排行榜列表 */
	SC_RANK_LIST
	/** 随机角色列表，用于快速开始跑马灯 */
	SC_QUICK_MATCH_CHAR_LIST
	/** 完成历程响应 */
	SC_COMPLETE_COURSE_TASK_RESULT
	/** 音乐的最高分 */
	SC_MUSIC_HIGH_SCORE
	/** 图片的操作结果 */
	SC_PIC_ACTION_RESULT
	/** 图片列表 */
	SC_PICTURES
	/** 上传图片成功 */
	SC_PIC_UPLOAD_OK
	/** 扩充背包结果 */
	SC_EXPAND_BAG_RESULT
	/** 最新的身体调节值 */
	SC_STATURE_MODIFY
	/** 赠送成功 */
	SC_DONATE_OK
	/** 收件箱的信息 */
	SC_RECIVE_MAIL
	/** 我的赠送信息 */
	SC_MY_DONATES
	/** 我的礼物信息 */
	SC_MY_GIFTS
	/** 领取奖励成功 */
	SC_GET_REWARD_BY_MAIL_OK
	/** 坐下响应 */
	SC_SIT_DOWN
	/** 站起响应 */
	SC_STAND_UP
	/** 更换队长 */
	SC_REPLACE_LEADER
	/** 许愿成功 */
	SC_MAKE_WISH_OK
	/** 许愿列表 */
	SC_WISH_LIST
	/** 删除愿望 */
	SC_DEL_WISH_OK
	/** 完成愿望 */
	SC_OVER_WISH_OK
	/** 查询第三方帐号绑定信息 */
	SC_QUERY_BIND_3RD_INFO_RESULT
	/** 绑定第三方帐号结果 */
	SC_BIND_3RD_ACCOUNT_RESULT
	/** 返回自己的绑定信息 */
	SC_SELF_BIND_3RD_INFO
	/** 使用激活码返回操作状态 */
	SC_ACTIVE_USE_CODE_RESULT
	/** 返回生成的激活码 */
	SC_GET_SMS_INVITE_CODE
	/** 返回手机号 */
	SC_USE_SMS_INVITE_CODE
	/** 抽奖结果 */
	SC_LOTTERY_RESULT
	/** 人气等级提升 */
	SC_POPULARITY_LEVEL_UP
	/** 房间带密码的响应 */
	SC_INPUT_ROOM_PASSWORD
	/** 通知在线用户有新邮件 */
	SC_NEW_MAIL
	/** 显示邮件的详细信息 */
	SC_SHOW_MAIL_INFO
	/** 角色升级 */
	SC_LEVEL_UP
	/** 删除邮件成功 */
	SC_DEL_MAIL_OK
	/** 返回GM活动相关信息 */
	SC_GET_GM_ACTIVITY_INFO
	/** 领取gm活动奖励结果 */
	SC_GET_GM_ACTIVITY_PRIZE
	/** 推送gm活动领奖通知 */
	SC_NEW_AWARD_NOTIFICATION
	/** 生成充值订单 */
	SC_GENERATE_ORDER
	/** 充值成功订单的列表 */
	SC_RECHARGE_SUCC_ORDER_LIST
	/** 设置cookie */
	SC_SET_COOKIE
	/** 临时绑定的账号名字 */
	SC_BIND_USER_NAME
	/** 通知客户端开始舞蹈前的表演 */
	SC_BEGIN_SHOW
	/** 接受任务响应 */
	SC_ACCEPT_COURSE_TASK
	/** 接受历程任务成功 */
	SC_REFRESH_DAILY_COURSE_TASK_RESULT
	/** 换装 */
	SC_CHANGE_AVATAR
	/** 星座图鉴物品列表 */
	SC_CONSTELLATION_ITEMS
	/** 兑换物品结果 */
	SC_CONSTELLATION_SWAP_ITEM
	/** 抽奖得到的物品id */
	SC_REQ_CONSTELLATION_LOTTERY
	/** 放弃历程 */
	SC_SHELVE_COURSE_TASK_RESULT
	/** 同步历程进度 */
	SC_SYNC_COURSE_TASK_PROCESS
	/** 激活历程结果 */
	SC_ACTIVE_COURSE_TASK_RESULT
	/** 单曲排行榜活动信息 */
	SC_QUERY_MUSIC_ACTIVITY
	/** 榜单更新时发送 */
	SC_UPDATE_MUSIC_RANK_INFO
	/** 通知客户端退出 */
	SC_EXIT_CLIENT
	/** 赞与被赞，送礼与被送礼 */
	SC_ADD_ACTION_LIST
	/** 检查客户端版本号 */
	SC_CHECK_CLIENT_VERSION
	/** 热曲列表 */
	SC_HOT_MUSIC_LIST
	/** 购买单个道具成功 */
	SC_BUY_SINGLE_ITEM_SUCC
	/** 生成传统模式的音符 */
	SC_GENERATE_TRADITIONAL_INPUT
	/** 服务器消息 */
	SC_SERVER_MESSAGE
	/** 被xx好友删除的通知消息 */
	SC_DELETED_BY_FRIEND
	/** 下一个历程的信息 */
	SC_NEXT_COURSE
	/** 活跃度升级消息 */
	SC_ACTIVE_LEVEL_UP
	/** 联运平台3kwan返回token消息 */
	SC_LOCAL_TOKEN
	/** 礼物消息发送 */
	SC_DONTE_GIFT
	/** 输入状态同步 */
	SC_DANCE_INPUT_STATUS
	/** 全服通知 */
	SC_WORLD_NOTICE
	/** 道具可出格的价格 */
	SC_SELL_ITEM_PRICE
	/** 取得兑换钥匙活动列表返回 */
	SC_GET_KEY_ACTIVE
	/** 同步身上最新的avatar */
	SC_SYNC_BODY_AVATAR
	/** 好友上下线状态的通知 */
	SC_FRIEND_ONLINE_STATUS
	/** 房间倒计时剩余秒数 */
	SC_ROOM_COUNT_DOWN_PROCESS
	/** 同步竞技时间 */
	SC_SYNC_DANCE_PROCESS
	/** 星座开放列表 */
	SC_GET_CONSTELLATION_IDS
	/** VIP等级奖励信息 */
	SC_VIP_LEVEL_PRIZE
	/** 获得VIP等级奖励信息 */
	SC_VIP_GET_LEVEL_PRIZE
	/** VIP等级升级消息 */
	SC_VIP_LEVEL_UP	
	SC_URL_INFO	
	SC_APP_STORE_RATE	
	/** 活动完成提示消息 */
	SC_ACTIVITY_UPDATE
	/** vip奖励信息 */
	SC_VIP_PRIZE_UPDATE
	/** 询问是否可以进入观战列表：大于1.2.5.0才提示，小于等于则放过 */
	SC_ASK_CAN_WATCH
	/** 舞团列表返回 */
	SC_GUILD_LIST_RESULT
	/** 我的舞团信息 */
	SC_MY_GUILD_INFO_RESULT
	/** 我的舞团成员列表 */
	SC_GUILD_MEM_LIST_RESULT
	/** 团长查询申请列表返回 */
	SC_APPLY_LIST_RESULT
	/** 舞团成员加入 */
	SC_GUILD_MEMBER_JOIN
	/** 舞团成员退出 */
	SC_GUILD_MEMBER_QUIT
	/** 通知客户端删除本地保存的token */
	SC_RECHARGE_RESULT
	/** 查询收集兑换活动信息返回 */
	SC_COLLECT_EXCHARNGE_ACTIVITY_INFO
	/** 卡牌兑换结果 */
	SC_GET_COLLECT_EXCHANGE_PRIZE_RESULT
	/** 申请加入结果返回 */
	SC_APPLY_GUILD_RESULT
	/** 膜拜舞团玩家成功*/
	SC_GUILD_WORSHIP_SUCC
	/** 团长转让 */
	SC_GUILD_TRANSFER_LEADER
	/** 团员信息更新 */
	SC_GUILD_UPDATE_MEMBER_STATUS
	/** 邮件分页大小 */
	SC_MAIL_PAGE_SIZE
	/** 附近的人列表 */
	SC_NEAR_CHARACTER
	/** 情侣模式初始化 */
	SC_LOVERS_MODE_INIT
	/** 情侣模式小游戏同步 */
	SC_LOVERS_GAME
	/** 同步房间内队伍信息 */
	SC_SYNC_TEAM_INFO
	/** 领取人气奖励结果消息 */
	SC_GET_POP_LEVEL_PRIZE_RESULT
	/** 摸一摸记录 */
	SC_TOUCHING_RECORDS
	/** 结婚步骤 */
	SC_WEDDING_STEP
	/** 请求添加您为密友 */
	SC_ADD_CLOSE_FRIEND_REQUEST
	/** 添加密友结果 */
	SC_ADD_CLOSE_FRIEND_RESULT	
	/** 添加密友结果 */
	SC_COMPOSE_ACTIVITY
	/** 添加密友结果 */
	SC_COMPOSE_ACTIVITY_DETAIL
	/** 添加密友结果 */
	SC_ASK_WEDDING_WITNESS
	/** 暴气 */
	SC_DANCE_BURST
	/** 添加密友结果 */
	SC_COMPOSE_ACTIVITY_VESION
	/** 请求密友列表 */
	SC_CLOSE_FRIEND_INFO
	/** 删除密友结果 */
	SC_DELETE_CLOSE_FRIEND_RESULT
	/** 删除密友提醒 */
	SC_DELETE_CLOSE_FRIEND_NOTIFY
	/** 接领活动任务反馈 */
	SC_GET_ACTIVITY_COURSE_TASK_RESULT	
	SC_SAVE_RELATIONSHIP_RESULT	
	SC_SAVE_MOOD_MESSAGE_RESULT
	/** 更新玩家在舞团中的属性 */
	SC_UPDATE_GUILD_PROPERTY
	SC_SAVE_POSE_RESULT	
	/** 同步搓红心进度 */
	SC_SYNC_TOUCH_HEART_PROCESS
	/** 请求加为情侣 */
	SC_BE_MY_LOVER_REQUEST
	/** 情侣请求结果 */
	SC_BE_LOVERS_RESULT
	/** 舞团基本信息更新 */
	SC_UPDATE_GUILD_BASE_INFO
	/** 纪念日 */
	SC_SPECIAL_DAYS
	/** 情侣信息 */
	SC_LOVER_INFO
	/** 舞团升级 */
	SC_GUILD_LEVEL_UP
	/** 查询积分订单 */
	SC_POINT_ORDER
	/** 生成绑定邮箱验证码 */
	SC_EMAIL_CHECK_CODE
	/** 绑定邮箱 */
	SC_BIND_EMAIL
	/** 生成订单验证码 */
	SC_POINT_ORDER_ID
	/** 确定购买 */
	SC_POINT_ORDER_CHECK
	/** 增加夫妻特效 */
	SC_ADD_COUPLE_EFFECT
	/** 取消夫妻特效 */
	SC_CANCEL_COUPLE_EFFECT
	/** 积分订单申诉 */
	SC_POINT_ORDER_APPEAL
	/** 领取婚戒结果 */
	SC_TAKE_RING
	/** 领取婚戒结果 */
	SC_YEARS_OF_MARRIED
	/** 领取婚戒结果 */
	SC_CURRENT_INTIMACY
	/** 服务器兑换积分上限 */
	SC_SERVER_POINT_LIMIT
	/** 老虎机剩余角子数 */
	SC_SLOT_PRIZE_POOL
	/** 老虎机抽奖结果 */
	SC_SLOT_DO_DRAW
	/** 限时抢购活动 */
	SC_LIMIT_SALE_ACTIVITY
	/** 限时抢购活动道具 */
	SC_LIMIT_SALE_ACTIVITY_ITEM
	/** 限时抢购活动道具购买 */
	SC_LIMIT_SALE_ACTIVITY_BUY
	/** 绑定用户返回 */
	SC_BIND_USER_NAME_RES
	/** 返回用户列表给客户端 */
	SC_USER_CHAR_LIST
	/** 舞团任务列表 */
	SC_GUILD_TASK_LIST
	/** 接舞团任务 */
	SC_ACCEPT_GUILD_TASK
	/** 交舞团任务 */
	SC_FINISH_GUILD_TASK
	/** 领取舞团奖励 */
	SC_TAKE_GUILD_REWARD
	/** 舞团可领取任务id */
	SC_GUILD_ACCEPT_TASK_IDS
	/** 所有舞团奖励 */
	SC_ALL_GUILD_REWARDS
	/** 同步舞团任务进度 */
	SC_GUILD_SYNC_COURSE_TASK_PROCESS
	/** 使用道具条件 */
	SC_USE_ITEM_CONDITION
	/** 签到奖励 */
	SC_SIGN_IN_AWARDS
	/** 签到状态 */
	SC_SIGN_IN_STATE
	/** 签到结果 */
	SC_SIGN_IN_RESULT
	/** 定时抽奖活动 */
	SC_GET_TIMING_LOTTERY
	/** 定时抽奖开始活动 */
	SC_START_FREE_LOTTERY
	/** 定时抽奖剩余次数 */
	SC_GET_FREE_LOTTERY_COUNT
	/** 人气等级奖励列表 */
	SC_CHAR_AND_POPULARITY_REWARDS
	/** 闯关奖励返回 */
	SC_CHAPTER_INFO_RESULT
	/** 宝箱查看奖励返回 */
	SC_TREA_BOX_RESULT
	/** 购买免费次数返回 */
	SC_CHAPTER_BUY_TIMES_RESULT
	/** 神秘商店物品返回 */
	SC_MYSTERY_ITEM	
	/** 返回所有任务信息 */
	SC_ALL_COURSE_TASKS
	/** 更新任务信息 */
	SC_UPDATE_COURSE_TASK
	/** 删除任务 */
	SC_DEL_COURSE_TASK
	/** 刷新随机任务信息 */
	SC_REFRESH_RAND_COURSE_TASK	
	/** 巡演章节信息 */
	SC_TOUR_CHAPTER_INFO
	/** 更新巡演关卡信息 */
	SC_UPDATE_TOUR_RAID
	/** 巡演关卡详细信息 */
	SC_TOUR_RAID_DETAIL
	/** 更新巡演房间信息 */
	SC_UPDATE_ROOM_TOUR_RAID
	/** 巡演舞蹈通关信息 */
	SC_TOUR_DANCE_PASS_INFO
	/** 巡演舞蹈同步欢呼值 */
	SC_SYNC_TOUR_DANCE_CHEER_INFO
	/** 播放剧情 */
	SC_PLAY_STORY
	/** 通告信息 */
	SC_ALL_ANNOUNCE_INFOS
	/** 开始通告 */
	SC_START_ANNOUNCE
	/** 通告舞蹈额外信息 */
	SC_ANNOUNCE_DANCE_EXTRA_INFOS
	/** 增加通告次数消耗 */
	SC_ADD_ANNOUNCE_COST
	/** 通告同步欢呼值 */
	SC_SYNC_ANNOUNCE_CHEER_INFO
	/** 刷新通告冷却时间成功 */
	SC_REFRESH_ANNOUNCE_SUCC
	/** 增加通告次数成功 */
	SC_ADD_ANNOUNCE_TIMES_SUCC
	/** 刷新通告商店成功 */
	SC_REFRESH_ANNOUNCE_SHOP_SUCC
	/** 游戏内换线结果 */
	SC_CHANGE_GAME_LINE
	/** 成就进度信息 */
	SC_ACHIEVE_PROCESS_INFO
	/** 成就详细信息 */
	SC_ACHIEVE_DETAIL_INFOS
	/** 更新成就详细信息 */
	SC_UPDATE_ACHIEVE_DETAIL_INFOS
	/** 房间内移动 */
	SC_CLICK_MOVE
	/** 更新成就领奖状态 */
    SC_UPDATE_ACHIEVE_PRIZE_STATUS
	/** 合成条件信息 */
	SC_COMPOSE_CONDITION
	/** 活动合成信息 */
	SC_ACTIVITY_COMPOSE_INFO
	/** 合成道具成功 */
	SC_COMPOSE_ITEM_SUCC
	/** 进化道具成功 */
	SC_EVOLVE_ITEM_SUCC
	/** 巡演星数奖励状态信息 */
	SC_TOUR_STAR_PRIZE_STATUS
	/** 更新领取巡演星数奖励状态 */
	SC_UPDATE_TOUR_STAR_PRIZE_STATUS
	/** 即兴表演信息 */
	SC_IMPROVISE_INFO
	/** 即兴表演随机任务 */
	SC_IMPROVISE_RAND_TASKS
	/** 购买即兴表演次数信息 */
	SC_BUY_IMPROVISE_PLAY_COUNT_INFO
	/** 成功快速通过即兴表演 */
	SC_QUICK_PASS_IMPROVISE_TASK_SUCC
	/** 即兴表演兑换商店信息 */
	SC_IMPROVISE_SHOP
	/** 成功兑换即兴表演商店商品 */
	SC_BUY_IMPROVISE_SHOP_ITEM_SUCC
	/** 重置即兴表演兑换花费信息 */
	SC_RESET_IMPROVISE_SHOP_COST
	/** 成功重置即兴表演兑换信息 */
	SC_RESET_IMPROVISE_SHOP_SUCC
	/** 更新即兴表演随机任务 */
	SC_UPDATE_IMPROVISE_TASK_STATE
	/** 徽章栏信息 */
	SC_BADGE_BAG_INFO
	/** 更新徽章信息 */
	SC_UPDATE_BADGE_INFO
	/** 增加徽章信息 */
	SC_ADD_BADGE_INFO
	/** 徽章解锁信息 */
	SC_BADGE_UNLOCK_INFO
	/** 更新协助巡演状态 */
	SC_UPDATE_ASSIST_TOUR_STATUS
	/** 训练信息 */
	SC_TRAIN_INFO
	/** 更新训练次数信息 */
	SC_UPDATE_TRAIN_COUNT_INFO
	/** 训练结果 */
	SC_TRAIN_RESULT
	/** 查询游戏线信息 */
	SC_GAME_LINE_INFO
	/** 显示名片指定信息类型详情 */
	SC_SHOW_BUSINESS_CARD_DETAIL
	/** 上排行榜的排名信息 */
	SC_ON_RANK_INFO
	/** 其他玩家请求对自己做动作 */
	SC_BE_REQUESTED_ROOM_ACTION
	/** 对房间内的成员做动作请求被拒绝 */
	SC_REQ_ROOM_ACTION_BE_REFUSED
	/** 时尚栏信息 */
	SC_FASHION_BAG_INFO
	/** 应用时尚信息成功 */
	SC_APPLY_FASHION_INFO_SUCC
	/** 增加时尚信息 */
	SC_ADD_FASHION_INFO
	/** 房间内衣橱开关操作 */
	SC_WARDROBE_OPER_IN_ROOM
	/** 摸一摸结果 */
	SC_TOUCH_RESULT
	/** 更新玩家事件通知 */
	SC_UPDATE_PLAYER_EVENT_NOTICE
	/** 房间内广播徽章更新信息 */
	SC_BROADCAST_BADGE_UPDATE_INFO
	/** 排行榜第一名信息 */
	SC_TOP_ONE_RANKS
	/** 成功膜拜排行榜上榜玩家 */
	SC_WORSHIP_ON_RANK_SUCC
	/** 已膜拜上榜玩家信息 */
	SC_WORSHIP_ON_RANK_INFOS
	/** 染色消息 */
	SC_DIY_AVATAR
	/** 婚礼动态信息 */
	SC_WEDDING_NOTICES
	/** 祝福新婚夫妻成功 */
	SC_WEDING_BLESS_SUCC
	/** 新婚夫妻信息 */
	SC_NEWLY_WEDS_INFO
	/** 查询婚礼房间 */
	SC_WEDDING_ROOM_INFOS
	/** 所有密友信息， 只发第一个密友详细信息 */
	SC_CLOSE_FRIEND_INFOS
	/** 密友关系奖励信息 */
	SC_CLOSE_FRIEND_GIFT_INFOS
	/** 领取密友奖励成功 */
	SC_GET_CLOSE_FRIEND_GIFT_SUCC
	/** 情侣关系奖励信息 */
	SC_LOVER_GIFT_INFOS
	/** 领取情侣奖励成功 */
	SC_GET_LOVER_GIFT_SUCC
	/** 使用密友或情侣间的关系等级称呼 */
	SC_USE_RELATIONSHIP_RESULT
	/** 申请结婚成功 */
	SC_REQ_WEDDING_SUCC
	/** 情侣求婚 */
	SC_LOVER_PROPOSAL
	/** 请求置顶自己的婚礼动态成功 */
	SC_TOP_SELF_WEDDING_NOTICE_SUCC
	/** 更新玩家广场区域状态 */
	SC_UPDATE_GROUND_AREA
	/** 进入广场行为状态 */
	SC_ENTER_GROUND_ACTION_STATUS
	/** 更新广场交互动作解锁信息 */
	SC_UPDATE_GROUND_ACTION_INFO
	/** 更新温泉奖励信息 */
	SC_UPDATE_SPRING_REWARD
	/** 刷新温泉泉眼 */
	SC_REFRESH_SPRING
	/** 被邀请猜拳游戏 */
	SC_BE_INVITED_FINGER_GUESS
	/** 开始猜拳游戏 */
	SC_START_FINGER_GUESS
	/** 猜拳游戏结果 */
	SC_FINGER_GUESS_RESULT
	/** 更新广场舞蹈区热力值 */
	SC_UPDATE_GROUND_HOT_BAR
	/** 广场舞蹈区使用香槟成功 */
	SC_USE_CHAMPAGNE_SUCC
	/** 舞团商店消息*/
	SC_GUILD_SHOP
	/** 购买商品成功*/
	SC_GUILD_BUY_ITEM_SUCC
	/** 舞团荣誉等级提升 */
	SC_GUILD_HONOR_LEVEL_UP
	/** 广场房间信息 */
	SC_GROUND_ROOM_INFOS
	/** 婚礼答谢成功 */
	SC_WEDDING_THANK_SUCC
	/** 婚礼祝福成功 */
	SC_DYNAMIC_WEDDING_BLESS_SUCC
	/** 婚礼祝福成功 */
	SC_WEDDING_BLESS_SUCC
	/** 刷新通告冷却时间消耗 */
	SC_REFRESH_ANNOUNCE_COST
	/** 刷新通告商店消耗 */
	SC_REFRESH_ANNOUNCE_SHOP_COST
	/** 婚礼放烟火 */
	SC_WED_FIREWORKS
	/** 通告商店物品信息 */
	SC_ANNOUNCE_SHOP_ITEMS
	/** 购买通告商店物品成功 */
	SC_BUY_ANNOUNCE_ITEM_SUCC
	/** 签到信息 */
	SC_SIGN_IN_INFO
	/** 签到成功 */
	SC_SIGN_IN_SUCC
	/** 更新通告信息 */
	SC_UPDATE_ANNOUNCE_INFOS
	/** 人气等级奖励状态 */
	SC_POP_LEVEL_PRIZED_STATUS
	/** 等待房间修改通告 */
	SC_CHANGE_ANNOUNCE_IN_ROOM
	/** 我发出的红包基本信息 */
	SC_SEND_LUCKY_MONEY_BASIC_INFO
	/** 我收到红包的基本信息 */
	SC_RECEIVE_LUCKY_MONEY_BASIC_INFO
	/** 抢红包结果 */
	SC_GET_LUCKY_MONEY_RESULT
	/** 红包详细信息 */
	SC_LUCKY_MONEY_DETIAL_INFO
	/** 更新玩家红包队列 */
	SC_UPDATE_LUCKY_MONEY_PROP
	/** 开始通告showTime */
	SC_START_ANNOUNCE_SHOW_TIME
	/** 温泉广场动作解锁成功 */
	SC_REQ_UNLOCK_ACTION_SUCC
	/** 泡温泉剩余时间信息 */
	SC_SPRING_LEFT_TIMES
	/** 红包领取信息 */
	SC_LUCKY_MONEY_RECEIVER_INFOS
	/** 更新情侣温泉状态 */
	SC_UPDATE_SPRING_LOVER
	/** 收到新红包 */
	SC_RECEIVE_LUCKY_MONEY
	/** 更新红包数量 */
	SC_UPDATE_LUCKY_MONEY_COUNT
	/** 最早可领红包信息 */
	SC_FIRST_LUCKY_MONEY_INFO
	/** 猜拳游戏完成（广播给房间其他人） */
	SC_FINGER_GUESS_FINISH
	/** 巡演剧情播放状态 */
	SC_TOUR_STORY_PLAY_STATUS
	/** 等待其他人巡演剧情播放 */
	SC_WAIT_TOUR_STORY_PLAY
	/** 放烟火成功 */
	SC_LIGHT_FIRE_WORKS_SUCC
	/** 服装套装消息 */
	SC_AVATAR_SUIT
	/** 保存服装套装信息成功 */
	SC_SAVE_AVATAR_SUIT_SUCC
	/** 更新使用中的套装 */
	SC_UPDATE_USING_AVATAR_SUIT
	/** 服装套装解锁 */
	SC_AVATAR_SUIT_UNLOCK
	/** 更新成员权限成功*/
	SC_UPDATE_GUILD_DEGREE
	/** 删除时尚信息成功 */
	SC_DEL_FASHION_SUCC
	/** 续费时尚信息成功 */
	SC_RENEW_FASHION_SUCC
	/** 删除服装套装信息成功 */
	SC_DROP_AVATAR_SUIT_SUCC
	/** 更新房间场景信息 */
	SC_UPDATE_ROOM_SCENE
	/** 更新巡演属性 */
	SC_UPDATE_TOUR_PROP
	/** 动感模式输入数据， 由一系列的输入片段组成，适用于T台，写真等特殊玩法 */
	SC_GENERATE_DYNAMIC_INPUT
	/** 对应id的广场信息 */
	SC_QUERY_GROUND_ROOM_BY_IDS_RESPONSE
	/** 对应id的竞技房间信息 */
	SC_QUERY_DANCE_ROOM_BY_IDS_RESPONSE
	/** 对应id的舞蹈信息 */
	SC_QUERY_GUILD_BY_IDS_RESPONSE
	/** 活动列表 */
	SC_ACTIVITY_LIST
	/** 活动详情 */
	SC_ACTIVITY_DETAIL
	/** 成功领取活动目标奖励 */
	SC_GET_ACTIVITY_TARGET_PRIZE_SUCC
	/** 更新活动目标进度信息 */
	SC_UPDATE_ACTIVITY_PROCESS_INFOS
	/** 切换账号成功 */
	SC_CHANGE_ACCOUNT_SUCC
	/** 账号类型 */
	SC_ACCOUNT_TYPE
	/** 言论回收 */
	SC_RETRIEVE_WORDS
	/** 修改房间名 */
	SC_CHANGE_ROOM_TITLE
	/** 转让房主成功 */
	SC_TRANSFER_ROOM_LEADER
	/** 更新成员的准备状态 */
	SC_UPDATE_ROOM_READY_STATUS
	/** 好友数量 */
	SC_CUR_FRIEND_AMOUNT
	/** 显示玩家外观信息 */
	SC_SHOW_PLAYER_APPEARANCE_INFO
	/** 可以使用的彩蛋信息 */
	SC_CAN_USE_LOTTERY_ITEMS
	/** 默认彩蛋id */
	SC_DEFAULT_LOTTERY_ID
	/** 当前可引导id */
	SC_CURRENT_NOVICE_GUIDE
	/** 限时商城购买成功 */
	SC_BUY_LIMIT_MALL_ITEM_SUCC
	/** 上传照片，返回token消息*/
	SC_PICTURE_TOKEN
	/** Vip入场提示信息 */
	SC_VIP_ENTER_NOTICE
	/** 请求删除照片后，返回的token的消息*/
	SC_PICTURE_DELETE_TOKEN
	/** 赠送某玩家道具数量 */
	SC_DONATE_ITEM_COUNT
	/** 搜索玩家信息 */
	SC_SEARCH_PLAYER
	/** 好友改名通知 */
	SC_FRIEND_CHANGE_NAME
	/** 玩家更改个性签名 */
	SC_UPDATE_MOOD_MESSAGE
	/** 返回首充活动信息*/
	SC_FIRST_RECHARGE_INFO
	/** 返回首充领奖消息*/
	SC_GET_FIRST_RECHARGE_PRIZE_SUCC
	SC_END
	//服务器发往客户端消息定义结束
}
