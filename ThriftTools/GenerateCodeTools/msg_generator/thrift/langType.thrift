namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto

/**  多语言提示 */
enum LangType{
  /**  对方已下线 */
  TARGET_IS_OFFLINE=20
  /** 物品已过期,请续费 */
  ITEM_IS_EXPIRE = 285
   /**  今天已经膜拜过 */
  TODAY_HAS_WORSHIIPED=347
  /**
   * 连接超时
   */
  ERR_CONN_TIMEOUT=1000
  /**
   * 用户名密码错误
   */
  ERR_PASSWD_INVALID=1001
  /**
   * 服务器未开放
   */
  ERR_SERVER_NOT_OPEN=1002
  /**
   * 玩家已经在线
   */
  ERR_PLAYER_IS_ONLINE=1003
  /**
   * 在线数达到上限
   */
  ERR_PLAYER_FULL=1004
  /**
   * 暂时无法登陆
   */
  ERR_CANT_LOGIN=1005
  /**
   * 非法登录信息
   */
  ERR_ILLEGAL_INFO=1006
  /**
   * 账号被锁定
   */
  ERR_ACCOUNT_LOCKED=1007
  /**
   * 网络延时
   */
  ERR_NETWORK_DELAY=1008
  /**
   * 被强登踢出
   */
  ERR_FORCE_KICKOF=1009
  /**
   * 已经绑定了账号
   */
  ERR_ALREADY_BIND=1010
  /**
   * 账号已经创建了角色
   */
  ERR_HAS_CHAR=1011
  /**
   * 绑定失败
   */
  ERR_BIND_FAIL=1012
  /**
   * 非法用户信息
   */
  ERR_ILEGAL_USER=1013
  /**
   * 临时用户未绑定， 不能充值
   */
  ERR_CANT_RECHARGE_FOR_TEMP_USER=1014
  /**
   * 黑名单用户， 不能充值
   */
  ERR_CANT_RECHARGE_FOR_BLACK_USER=1015
  /**
   * 充值失败
   */
  ERR_RECHARGE_FAIL=1016
  /**
   * 充值成功， 但是受到封禁， 8小时自动解封， 具体规则运营设定
   */
  ERR_RECHARGE_SUCC_WHILE_FREEZE=1017
  /**
   * 购买失败， 背包已满
   */
  ERR_CANT_BUY_FOR_FULL=1018
  /**
   * 购买失败， 金钱不足
   */
  ERR_CANT_BUY_NOT_ENOUGH_MONEY=1019
  /**
   * 物品不存在
   */
  ERR_ITEM_NOT_EXIST=1020
  /**
   * 服务器维护中 与服务器连接断开
   */
  ERR_SERVER_MAINTENANCE=1021
  /**
   * 金钱不足，不能聊天
   */
  ERR_CANT_CHAT_NOT_ENOUGH_MONEY=1022
  /**
   * 不能聊天，找不到对象
   */
  ERR_CANT_CHAT_CANT_FIND_TARGET=1023
  /**
   * 音乐不存在
   */
  ERR_MUSIC_NOT_EXIST=1024
  /**
   * 重复领取连续登录奖励
   */
  ERR_ACTIVITY_GET_CONTINUE_LOGIN_AWARD_REPEAT=1025
  /**
   * 离线积分不足
   */
  ERR_ACTIVITY_OFFLINE_SCORE_ENOUGH=1026
  /**
   * 当天的离线积分兑换点卷已达到上限
   */
  ERR_ACTIVITY_OFFLINE_SCORE_LIMIT=1027
  /**
   * 奖励领取失败， 背包已满
   */
  ERR_CANT_GET_PRIZE_FOR_FULL=1028
  /**
   * 你充值成功， 获得{0}ib
   */
  APP_PURCHASE_SUCC=1029
  /**
   * 购买成功 花费{0}ib {1}coupon
   */
  BUY_MARKET_SUCC=1030
  /**
   * 购买成功 花费{0}ib
   */
  BUY_MARKET_IB_SUCC=1031
  /**
   * 购买成功 花费{0}coupon
   */
  BUY_MARKET_COUPON_SUCC=1032
  /**
   * 当前状态不允许， 请稍后再试
   */
  ERR_STATE_NOT_ALLOWED=1033
  /**
   * 操作失败
   */
  ERR_FAIL_OPER=1034
  /**
   * 充值信息未改变
   */
  ERR_IAP_NOT_CHANGED=1035
  /**
   * 你充值成功，获得{0}点卷
   */
  APP_PURCHASE_COUPON_SUCC=1036
  /**
   * 当前服务器无房间，请建立房间
   */
  NO_DANCE_ROOM_FOR_RAND_JOIN=1037
  /**
   * 无法加入，房间未创建
   */
  CANT_JOIN_NO_DANCE_ROOM=1038
  /**
   * 无法加入，房间被锁定
   */
  CANT_JOIN_LOCKED_DANCE_ROOM=1039
  /**
   * 房间已满，请选择其他房间
   */
  CANT_JOIN_FULL_DANCE_ROOM=1040
  /**
   * 无法加入，房间正在舞蹈中
   */
  CANT_JOIN_BUSY_DANCE_ROOM=1041
  /**
   * 房主将{0}踢出了房间
   */
  KICK_OUT_DANCE_ROOM=1042
  /**
   * 请等待{0}下载完歌曲
   */
  WAIT_LOAD_MUSIC=1043
  /**
   * {0}已掉线
   */
  ROOM_MEMBER_DISCONN=1044
  /**
   * {0}已退出房间
   */
  ROOM_MEMBER_EXIT=1045
  /**
   * {0}已退出房间，房主转给了{1}
   */
  ROOM_LEADER_EXIT=1046
  /**
   * 无法邀请， {0}已在房间中
   */
  CANT_INVITE_ALREADY_IN_ROOM=1047
  /**
   * 邀请人数过多，请等待对方的答复
   */
  CANT_INVITE_OVER_LIMIT=1048
  /**
   * 邀请玩家已下线
   */
  CANT_INVITE_TARGET_OFFLINE=1049
  /**
   * 已被邀请， 等待响应
   */
  CANT_INVITE_DUP_INVITE=1050
  /**
   * {0}拒绝了你的邀请
   */
  CANT_INVITE_FOR_REJECT=1051
  /**
   * 对方房间已满
   */
  CANT_JOIN_FULL_INVITE_ROOM=1052
  /**
   * 房间准备中，请稍等
   */
  CANT_START_IN_CD_TIME=1053
  /**
   * 无法开始，{0}还在下载歌曲
   */
  CANT_START_STILL_LOAD_MUSIC=1054
  /**
   * {0}已经是你的好友了
   */
  FRIEND_ADD_REPEAT=1055
  /**
   * 三分钟内只能使用一次举报功能，请稍候再使用该功能
   */
  REPORT_TIME_IN_DELAY=1056
  /**
   * 您今日举报次数过多，请在0点后再尝试举报，感谢您对游戏的支持！
   */
  REPORT_OVER_TIMES=1057
  /**
   * 您的举报已经成功发送给GM，感谢您对游戏的支持！
   */
  REPORT_CHAT_SUCC=1058
  /**
   * 举报失败
   */
  REPORT_CHAT_FAIL=1059
  /**
   * 您的禁言已经取消
   */
  CHAT_BAN_CANCEL=1060
  /**
   * 您由于在游戏中发布了违反游戏规则的内容，被暂时禁言{0}分钟
   */
  CHAT_BAN_SUCC=1061
  /**
   * 您已经被禁言
   */
  CHAT_BAN_STATE=1062
  /**
   * 您当天所发语音留言已达上限
   */
  VOICE_MAIL_DAY_LIMIT=1063
  /**
   * 您对{0}所发语音留言已达上限
   */
  VOICE_MAIL_FRIEND_LIMIT=1064
  /**
   * 匹配失败
   */
  MATCH_FAIL=1065
  /**
   * 好友已达到上限
   */
  FRIEND_LIMIT=1066
  /**
   * 随机查询玩家次数达到上限
   */
  RANDOM_QUERY_LIMIT=1067
  /**
   * 队伍不匹配，无法开始游戏
   */
  CANT_START_NOT_ENOUGH_TEAM=1068
  /**
   * 不是VIP
   */
  IS_NOT_VIP=1069
  /**
   * 还有七天过期
   */
  VIP_EXPIRE_TO_WEEK=1070
  /**
   * 还有一天过期
   */
  VIP_EXPIRE_TO_DAY=1071
  /**
   * 第三方帐号已经被其它玩家绑定
   */
  ALREADY_BIND_3RD_ACCOUNT=1072
  /**
   * 座位已经有人了
   */
  SIT_FAIL=1073
  /**
   * 房间密码错误
   */
  ERR_ROOM_PASSWD_INVALID=1074
  /**
   * 房间不允许观战
   */
  INVITE_ROOM_CANT_WATCH=1075
  /**
   * 抽奖失败，背包空间不足
   */
  ERR_LOTTERY_BAG_SPACE_ENOUGH=1076
  MUSIC_LOCK_INFO_SET_OK=1078
  /**
   * 愿望不存在，或者是已经完成
   */
  NOT_FOUND_WISH=1079
  /**
   * 超过了许愿的道具数量限制
   */
  LIMIT_WISH_ITEM=1080
  /**
   * 邮件不存在，或者是已经过期
   */
  NOT_FOUND_MAIL=1081
  /**
   * 请求{0}帮忙完成愿望成功
   */
  REQUEST_HELP_WISH_OK=1082
  /**
   * 物品未领取，不能删除邮件
   */
  CAN_NOT_DEL_MAIL=1083
  /**
   * 请选择正确的物品有效期类型
   */
  SELECTED_RIGHT_VALITETIME=1084
  /**
   * 达到相册数量上限
   */
  LIMIT_MAX_PIC=1085
  /**
   * 放弃的历程已达上限
   */
  LIMIT_SHELVE_COURSE=1086
  /**
   * 背包空间不足
   */
  ERR_BAG_NOT_ENOUGH=1087
  /**
   * 兑换成功，请到背包查看
   */
  SUCCESS_EXCHANGE_CONSTIME_MONEY=1088
  /**
   * 对方不在邀请赛房间
   */
  ERR_OTHER_NOT_ININVITEROOM=1089
  /**
   * 有新的主线任务完成
   */
  COURSE_COMPLETE=1090
  /**
   * 更换榜单成功
   */
  SUCCESS_UPDATE_MUSIC_RANK=1091
  /**
   * 金钱不足
   */
  ERR_NOT_ENOUGH_MONEY=1092
  /**
   * 等级不足{0}级，创建失败
   */
  CREATE_FREE_ROOM_LEVEL_NOT_ENOUGH=1093
  /**
   * 该道具不能赠送
   */
  ERR_ITEM_CANT_GIVE=1094
  /**
   * 删除成功
   */
  DELETE_ITEM_SUCC=1095
  /**
   * 充值钻石不足
   */
  ERR_RECHARGE_IB_NOT_ENOUGH=1096
  /**
   * 购买vip成功
   */
  BUY_VIP_SUCCESS=1097
  /**
   * 功能未开放
   */
  FUNCTION_IS_NOT_OPEN=1098
  /**
   * 道具不存在
   */
  ITEMID_IS_NOT_EXIST=1099
  /**
   * 道具数量不足
   */
  ITEM_IS_NOT_ENOUGH=1100
  /**
   * 物品不能出售
   */
  ERR_ITEM_CANT_SELL=1101
  /**
   * 该物品不能续费
   */
  ERR_ITEM_CANT_RENEW=1102
  /**
   * 恭喜玩家{0}获得{1}{2}
   */
  NOTICE_LOTTERY=1103
  /**
   * 恭喜玩家{0}获得{1}
   */
  NOTICE_CONSTELLATION_LOTTERY=1104
  /**
   * 道具出售成功
   */
  SELL_ITEM_SUCC=1105
  /**
   * avatar性别与自身性别不符
   */
  AVATAR_SEX_NOT_MATCH=1106
  /**
   * 兑换钥匙成功提示
   */
  ACTIVITY_EXCHANGE_KEY_SUC=1107
  /**
   * 兑换钥匙物品或货币不足
   */
  ACTIVITY_EXCHANGE_KEY_NOT_ENOUGH=1108
  /**
   * 没有该VIP权限
   */
  ERR_NO_VIP_RIGHT=1109
  /** 对方是VIP{0}级玩家，只要VIP达到{1}级就无法被踢出等待房间哦 */
  ERR_CANT_KICK_VIP=1110
  /**
   * 您的好友xx在砸蛋抽奖中获得了xx，快去祝贺TA吧
   */
  SUCCUSS_DROPEGG_LOTTERY_NOTIFI=1111
  /**
   * 您的好友xx在星盘抽奖中获得了xx，快去祝贺TA吧
   */
  SUCCESS_CONSTELLATION_LOTTERY_NOTIFI=1112
  /**
   * 恭喜玩家{0}在{1}抽奖中获得一等奖{2}
   */
  SUCCUSS_LOTTERY_ONE_PRIZE=1113
  /**
   * 恭喜玩家{0}在{1}抽奖中获得二等奖{2}
   */
  SUCCUSS_LOTTERY_TOW_PRIZE=1114
  /**
   * 恭喜玩家{0}获得一等奖{1}
   */
  SUCCUSS_CONTELLATION_ONE_PRIZE=1115
  /**
   * 恭喜玩家{0}获得二等奖{1}
   */
  SUCCUSS_CONTELLATION_TWO_PRIZE=1116
  /**
   * 恭喜玩家{0}获得三等奖{1}
   */
  SUCCESS_CONTELLATION_THREE_PRIZE=1117
  /**
   * 背包内物品跨服不能赠送
   */
  DONATE_ERR_DIFF_SERVER=1118
  /**
   * 找不到玩家信息
   */
  QUERY_NOT_FIND_PLAYERINFO=1119
  /**
   * 物品不能删除
   */
  ERR_ITEM_CANT_DELETE=1120
  /**
   * 房间名不合法
   */
  ERR_ROOM_TITLE_INVALID=1121
  /**
   * 竞技中休眠时间过长，踢出房间
   */
  ERR_DANCE_DORMANCY_TOO_LONG_EXIT_ROOM=1122
  /**
   * 竞技准备中休眠，踢出房间
   */
  ERR_DORMANCY_EXIT_ROOM=1123
  /**
   * 赠送成功
   */
  DONATE_ITEM_SUCCESS=1124
  /**
   * 没有下一个历程了
   */
  NEXT_COURSE_IS_NOT_FOUND=1125
  /**
   * 领取红钻礼包重复
   */
  GET_RED_PRIZE_REPEAT=1126
  /**
   * 领取红钻礼包成功
   */
  GET_RED_PRIZE_SUCCESS=1127
  /**
   * 兑换超过次数
   */
  EXCHANGE_KEY_OVER_LIMIT=1128
  /**
   * 已经被禁言
   */
  ERR_PLAYER_BAN_CHAT=1129
  /**
   * 舞团人数满
   */
  ERR_GUILD_MEMBER_LIMIT_FULL=1130
  /**
   * 团长无法退出舞团，请先将团长转让
   */
  ERR_GUILD_CANNOT_QUIT=1131
  /**
   * 舞团人数已满，无法批准更多的申请
   */
  ERR_GUILD_NOT_ALLOW_IS_FULL_=1132
  /**
   * 创建舞团失败
   */
  ERR_GUILD_CREATE_FAIL=1133
  /**
   * 申请加入的舞团数量已达到上限，请在我的申请列表中取消部分申请
   */
  ERR_GUILD_APPLY_TIMES_TOO_MUCH=1134
  /**
   * 该舞团人数已满，请尝试加入其它舞团。
   */
  ERR_GUILD_JOIN_OTHER_IS_FULL=1135
  /**
   * 玩家已经加入其它舞团
   */
  ERR_GUILD_ALREADY_JOIN_OTHER=1136
  /**
   * 舞团名称为空，重复或含有非法字符
   */
  ERR_GUILD_CREATE_NAME=1138
  /**
   * 背包已满，无法翻牌
   */
  ERR_CARD_BAG_NOT_ENOUGH=1139
  /**
   * 包内没有改名卡
   */
  ERR_NOT_EXIST_RENAME_CARD=1140
  /**
   * 角色名不合法
   */
  ERR_NAME_INVALID=1141
  /**
   * 角色名重复
   */
  ERR_NAME_REPEAT=1142
  /**
   * 请勿频繁邀请
   */
  ERR_INVITE_TIME_TOO_SHORT=1143
  /**
   * 充值已成功的提示
   */
  IOS_TOKEN_USED=1144
  /**
   * 招募已发出
   */
  ERR_INVITE_MESSAGE_SEND=1145
  /**
   * 创建舞团成功
   */
  GUILD_CREATE_SUCCESS=1146
  /**
   * 已经退出舞团
   */
  ERR_ALREADY_QUIT_GUILD=1147
  /**
   * 你选择的兑换次数超过限制
   */
  ERR_GET_COLLECT_COUNT_LIMIT=1148
  /**
   * 舞团已满，无法邀请
   */
  ERR_INVITE_MEMBER_IS_FULL=1149
  /**
   * 对方客户端版本号太低，无法邀请
   */
  ERR_INVITE_CLINET_VERSION=1150
  /**
   * 房主已刷新房间的日常历程，如需要与房主同步，请领取或刷新日常任务
   */
  DAILY_ROOM_COURSE_SYNC_INFO=1151
  /**
   * 您的日常历程已于房间同步，不能刷新
   */
  DAILY_ROOM_COURSE_ALREADY_SYNC=1152
  /**
   * 建立情侣关系后，才能使用此卡！
   */
  DO_NOT_HAVE_PARTNER=1153
  /**
   * 情侣双方都拥有婚戒卡后，才能使用此卡！
   */
  COUPLE_NOT_HAVE_WEDDING_RING=1154
  /**
   * 你的另一半没有在结婚房间中，无法开始婚礼
   */
  PARTNER_NON_IN_WEDDING_ROOM=1155
  /**
   * 证婚人没有在场，无法开始婚礼，请点击证婚人按钮指定证婚人
   */
  WITNESS_NOT_ASSIGN=1156
  /**
   * 情侣双方都拥有婚戒卡后，才能开始婚礼！
   */
  COUPLE_DONOT_HAVE_RING=1157
  /**
   * 结婚双方或者证婚人网络出现问题，婚礼暂时中断！
   */
  COUPLE_OR_WITNESS_LEAVE=1162
  /**
   * 恭喜{0}与{1}完成婚礼成为伴侣！小舞携全体秀舞玩家对他们表示祝贺！
   */
  WEDDING_SUCCESS_BROADCAST=1163
  /**
   * {0}没有接受邀请，请重新指定证婚人！
   */
  REFUSE_WITNESS_ASK=1164
  /**
   * 充值钻石不足以完成答谢，请重新输入数额进行答谢！
   */
  WEDDING_THANKS_IB_NOT_ENOUGH=1169
  /**
   * 婚礼答谢
   */
  WEDDING_THANKS_MAIL_TITLE=1170
  /**
   * 感谢您参加{0}和{1}的婚礼，他们略备薄礼对您的到来表示感谢！
   */
  WEDDING_THANKS_MAIL_CONTENT=1171
  /**
   * 没有找到舞团
   */
  GUILD_SEARCH_NOT_FIND=1172
  /**
   * 结婚新人或证婚人资源尚未完成下载，请稍后开始婚礼！
   */
  LOAD_WEDDING_RESOURCE_NOT_FINISH=1173
  /**
   * 任务没有达到激活条件
   */
  ROOM_TASK_LIMIT_NOT_ENOUGH=1174
  /**
   * 使用道具条件未通过
   */
  USE_ITEM_LIMIT=1175
  /**
   * 舞团签到成功
   */
  GUILD_SIGNIN_SUCCESSFUL=1176
  /**
   * 签到重复信息
   */
  ERR_GUILD_SIGNIN_REPEAT=1177
  /**
   * 捐赠次数到上限
   */
  ERR_GUILD_DONATE_OUT_TIMES=1178
  /**
   * 搜索结果条数太多
   */
  ERR_GUILD_SEARCH_TOO_MUCH=1179
  /**
   * 有新的历程任务完成
   */
  EXCHANGE_COURSE_COMPELETED=1180
  /**
   * 钻石不足
   */
  GUILD_INVITE_IB_NOT_ENOUGH=1183
  INVITE_CLOSE_FRIEND_LEVEL_TOO_LOW=1184
  INVITE_CLOSE_FRIEND_INTIMACY_TOO_LOW=1185
  INVITE_CLOSE_FRIEND_AMOUNT_TOO_MANY=1186
  INVITE_LOVER_LEVEL_TOO_LOW=1187
  /** 好友友好度不足成为情侣 */
  INVITE_LOVER_FRIEND_INTIMACY_TOO_LOW=1188
  HAD_LOVER=1189
  /**
   * 邮箱格式不正确，请输入正确的邮箱格式
   */
  EMAIL_PATTERN_WRONG=1190
  /**
   * 新绑定的邮箱不能与之前绑定生效的邮箱一致
   */
  EMAIL_SAME_WITH_PREEMAIL=1191
  /**
   * 验证码已发送之您绑定的邮箱，请到相应的邮箱获取验证码
   */
  EMAIL_CHECK_CODE_SEND=1192
  /**
   * 《dance》绑定邮箱的验证码
   */
  EMAIL_CHECK_CODE_TITLE=1193
  /**
   * 亲爱的玩家您好：\n    您绑定邮箱获取的验证码如下：  {0}    \n    请返回游戏输入邮箱验证码。
   */
  EMAIL_CHECK_CODE_CONTENT=1194
  /**
   * 请重新获取邮箱验证码
   */
  GET_EMAIL_CHECK_CODE_AGAIN=1195
  /**
   * 邮箱验证码验证超时，请重新获取邮箱验证码
   */
  EMAIL_CHECK_CODE_TIMEOUT=1196
  /**
   * 邮箱验证码不正确，请重新输入
   */
  EMAIL_CHECK_CODE_WRONG=1197
  /**
   * 邮箱绑定成功！
   */
  EMAIL_BIND_SUCCESS=1198
  /**
   * 积分不足，无法兑换相应的物品
   */
  POINT_NOT_ENOUGH=1199
  /**
   * 兑换订单已生成，请到您之前绑定的邮箱 {0} 获取订单的验证码
   */
  ORDER_CHECK_CODE_SEND=1200
  /**
   * 《dance》订单{0}的验证码
   */
  ORDER_CHECK_CODE_TITLE=1201
  /**
   * 亲爱的玩家您好：\n    您在《dance》兑换积分物品时，生成的订单{0}，兑换物品时需要输入的订单验证码如下：  {1}    \n    请返回游戏输入验证码。
   */
  ORDER_CHECK_CODE_CONTENT=1202
  /**
   * 请重新获取订单验证码
   */
  ORDER_CHECK_CODE_AGAIN=1203
  /**
   * 订单验证码验证超时，请重新获取订单验证码
   */
  ORDER_CHECK_CODE_TIMEOUT=1204
  /**
   * 订单验证码不正确，请重新输入
   */
  ORDER_CHECK_CODE_WRONG=1205
  /**
   * 订单校验成功，正在进行数据交换，请等待兑换结果！
   */
  ORDER_CHECK_CODE_CORRECT=1206
  /**
   * 物品兑换成功！请您到绑定的邮箱{0}获取物品兑换的账号和密码！
   */
  ORDER_SUCCESS=1207
  /**
   * 物品兑换失败！请您到积分商城界面的订单列表中进行“申诉”或者联系客服！
   */
  ORDER_FAILE=1208
  /**
   * 《dance》订单{0}成功
   */
  ORDER_SUCCESS_TITLE=1214
  /**
   * 订单成功，卡号{2}，密码{3}
   */
  ORDER_SUCCESS_CONTENT=1215
  /**
   * 216获得了{0}的奖励
   */
  RECEIVE_AWARD=1216
  /**
   * 玩家已经结过婚
   */
  PLAYER_IS_MARRIED=1221
  /**
   * 账户余额不足，充值失败，积分已返还！
   */
  JNET_ACCOUNT_BALANCE_NOT_ENOUGH=1222
  /**
   * 恭喜{0}与{1}完成婚礼成为伴侣！小舞携全体秀舞玩家对他们表示祝贺！
   */
  WEDDING_SUCCESS_FUNC=1223
  /**
   * 无法购买，对应的商品已经下架！
   */
  LIMIT_SALE_TIMEOUT=1225
  /**
   * 无法购买，对应的商品已经售空！
   */
  LIMIT_SALE_SALE_OUT=1226
  /**
   * 无法购买，VIP等级没有达到最低要求！
   */
  LIMIT_SALE_VIP_LEVEL=1227
  /**
   * 购买成功 花费{0}绑定钻石！
   */
  BUY_MARKET_FREE_IB_SUCC=1244
  /**
   * 恭喜您下载并试玩积分墙的应用获得{0}代钻！
   */
  POINT_WALL_ACTIVE=1246
  /**
   * 舞团信息正在加载中
   */
  GUILD_DATA_LOADING=1247
  /**
   * 激活码不存在
   */
  CODE_NOT_EXIST=1248
  /**
   * 激活码已使用
   */
  CODE_USED=1249
  /**
   * 激活码已过期
   */
  CODE_EXPIRE=1250
  /**
   * 恭喜您获得激活码礼包
   */
  CODE_SUCCESS=1251
  /**
   * 激活码领取异常，请联系客服或本地运营商
   */
  CODE_ERROR=1252
  /**
   * 绑定 功能暂未开放，渠道包的信息
   */
  CHANNEL_BINDCHAR_ERROR=1253
  /**
   * 创建房间未设置关卡信息
   */
  CHAPTER_UNSET_ERROR=1254
  /**
   * 创建房间选择关卡不存在
   */
  CHAPTER_NOTFIND_ERROR=1255
  /**
   * 背包空间不足，领取失败
   */
  MAIL_PACKET_FULL_ERROR=1265
  /**
   * 染色成功
   */
   SUCCESS_DIY_AVATAR=1266
 /** 购买成功， 花费{0}钻石， {1}绑钻 */
   BUY_SUCC_COST_IB_FREE_IB=1267
    /** 购买成功， 花费{0}钻石， {1}绑钻, {2}金币 */
   BUY_SUCC_COST_IB_FREE_IB_GOLD=1268
    /** 购买成功， 花费{0}绑钻， {1}金币 */
   BUY_SUCC_COST_FREE_IB_GOLD=1269
   /** 没有需要刷新的商品 */
   GUILD_SHOP_NO_NEED_REFRESH = 1270
   /** 游戏已开始，无法进入观战模式 */
   DANCE_ALREADY_START_CANT_WATCH = 1271
   /** 婚礼已开始，无法进入观战模式 */
   WED_ALREADY_START_CANT_WATCH = 1272
   /** 角色名称中包含非法字，请修改后重试 */
   NAME_CONTAIN_ILEGAL_CHAR = 1273
   /** 角色名称过长，请修改后重试 */
   NAME_LENGTH_OVER_MAX = 1274
   /** 角色名称过短，请修改后重试 */
   NAME_LENGTH_LESS_MIN = 1275
   
  /**
   * {0}加你为好友了
   */
  NOTIFICATION_ADD_FRIENT=1800
  /**
   * {0}赠送了你一份礼物:{1}
   */
  NOTIFICATION_GIFT=1801
  /**
   * {0}在{1}中超过了你你现在排名{2}名
   */
  NOTIFICATION_SELF_RANK=1802
  /**
   * 你在{0}下{1}的{2}竞技中获得了{3}分和{4}点点卷奖励。
   */
  NOTIFICATION_SELF_DANCE=1803
  /**
   * {0}赞了你的图片
   */
  NOTIFICATION_PIC_LIKE=1804
  /**
   * 恭喜，已经通过你的申请，你已加入该舞团
   */
  NOTIFICATION_JOIN_GUILD_SUC=1806
  /**
   * 加入被拒绝
   */
  NOTIFICATION_JOIN_GUILD_REUSE=1807
  /**
   * 团长邀请通知
   */
  NOTIFICATION_INVITE_JOIN_GUILD=1808
  /**
   * 玩家接受邀请
   */
  NOTIFICATION_AGREE_JOIN_GUILD=1809
  /**
   * 玩家没有接受你的邀请
   */
  NOTIFICATION_AGREE_RESUE_GUILD=1810
  /**
   * 剔除帮会
   */
  NOTIFICATION_KICK_GUILD=1813
  /**
   * 舞团成员退出
   */
  NOTIFICATION_QUIT_GUILD=1814
  /**
   * 恭喜你与{0}成为伴侣！共同游戏，提升你们的甜蜜值将获得婚龄奖励！
   */
  WEDDING_SUCCESS=1815
  GUILD_LEVEL_UP_BROADCAST=1816
  /**
   * 不在线舞团成员升级通知
   */
  GUILD_LEVEL_UP_NOTICE=1817
  /**
   * {0}请求加您为密友
   */
  ADD_CLOSE_FRIEND=1818
  /**
   * {0}拒绝加您为密友
   */
  REFUSE_ADD_CLOSE_FRIEND=1819
  /**
   * {0}好友不在线
   */
  FRIEND_NOT_ONLINE=1820
  /**
   * {0}与您解除了密友关系
   */
  DELETE_CLOSE_FRIEND=1821
  /**
   * {0}在时间{1}摸了你{2}
   */
  TOUCH_FRIEND=1822
  /**
   * {0}密友不在线
   */
  CLOSE_FRIEND_NOT_ONLINE=1823
  /**
   * {0}请求加你为情侣
   */
  BE_MY_LOVER=1824
  /**
   * {0}拒绝加您为情侣
   */
  REFUSE_TO_BE_LOVERS=1825
  /**
   * {0}同意添加您为密友
   */
  AGREE_TO_BE_CLOSE_FRIEND=1826
  /** {0}同意添加您为情侣 */
  AGREE_TO_BE_LOVERS=1827
  /** {0}与您解除了情侣关系 */
  DELETE_LOVER=1828
  /**
   * 舞团捐赠金额错误
   */
  ERR_GUILD_DONATE_VALUE=1830
  /** {0}与您解除了婚姻关系！*/
  DIVORCE_SUCCESS=1831
  INTIMACY_COMMON_AND_CLOSE_FRIEND_GIFT_TIMES=1832
  INTIMACY_LOVERS_GIFT_TIMES=1833
  INTIMACY_COUPLES_GIFT_TIMES=1834
  /** {0}与您解除了好友关系 */
  DELETE_TWO_WAY_FRIEND=1837
   /** {0}查看了您的名片，也去拜访一下Ta吧！ */
  BE_VIEWED_BUSINESS_CARD=1838
  /**
   * 帮会荣誉等级不足,不能购买
   */
  GUILD_HONOR_LEVEL_NOT_ENOUGH=2224
  /**
   * 舞团贡献不足,购买失败
   */
  GUILD_CONTRIBUTION_NOT_ENOUGH=2225
  /**
   * 膜拜成功，获得{0} 点舞团币
   */
  GUILD_WORSHIP_SUCC=2230
    /** 捐赠成功，获得{0}贡献值和{1}舞团币 \n 舞团获得{2}点经验和{3}点荣誉 */
  GUILD_DONATE_SUCC = 2234
  /** 发布招募信息成功 */
  GUILD_WORLD_INVITE_SUCC = 2235
  /** 恭喜您获得[FF0000]{0}X{1}[-] */
  GET_ITEM_SUCC = 612
  /**
   * bag full
   */
  BAG_FULL_TO_MAIL=1835
  /** 材料不足，无法完成合成 */
  CANT_COMPOSE_LESS_MATERIAL=20083
   /** 货币不足，无法完成合成 */
  CANT_COMPOSE_LESS_MONEY=20084
   /** 材料不足，无法完成进化 */
  CANT_EVOLUTE_LESS_MATERIAL=20085
   /** 货币不足，无法完成进化 */
  CANT_EVOLUTE_LESS_MONEY=20086
 /** 恭喜玩家{0}在{1}抽奖中获得{2}，获得{3}！ */
  LUCKY_EGG_GET_TWO_PRIZE=20104
   /** 恭喜玩家{0}在{1}抽奖中获得{2}，获得{3}，获得{4}！*/
  LUCKY_EGG_GET_THREE_PRIZE=20105
   /** 恭喜玩家{0}在{1}抽奖中获得{2}，获得{3}，获得{4}}，获得{5}！ */
  LUCKY_EGG_GET_FOUR_PRIZE=20106
  /** 恭喜你完成了日常活动！ */
  FINISH_DAILY_TASK=25013
  /** 恭喜你完成了随机任务！ */
  FINISH_RAND_TASK=25014
  /** 没有激活的随机任务 */
  NO_ACTIVE_RAND_TASK=25100
  
  /**
   * 金钱不足，刷新随机任务失败
   */
  CANT_REFRESH_RAND_TASK_LESS_MONEY=25101
  /** 礼包码格式不符，请填写正确的礼包码 */
  USE_ACTIVE_CODE_FAIL_FORMAT_ILLEGAL = 28207
  /** 礼包码无效或已过期 */
  USE_ACTIVE_CODE_FAIL_INVALID = 28208
  /** 礼包码已被使用 */
  USE_ACTIVE_CODE_FAIL_OTHER_USED = 28209
  /** 成功激活礼包码，快去邮件中领取奖励吧 */
  USE_ACTIVE_CODE_SUCC = 28210
  /** 你已经领取过该礼包了 */
  USE_ACTIVE_CODE_FAIL_HAS_USED= 28211
  /** 使用失败，有相同类型的房间卡正在使用中 */
  CANT_USE_SAME_TYPE_ROOM_CARD = 29543
   /** 有未上架商品， 不能购买 */
  CANT_BUY_ITEM_NOT_ON_MARKET = 29550
  /** 购物车中物品包含绑钻或金币物品，请删除后重新赠送 */
  CANT_DONATE_FOR_NON_IB_ITEM = 29556
  /** 购物车中物品包含不可赠送的物品，请删除后重新赠送 */
  CANT_DONATE_FOR_NON_GIFT_ITEM = 29557
  /** 购物车中物品包含绑钻物品、金币物品或不可赠送的物品，请删除后重新赠送 */
  CANT_DONATE_FOR_NON_IB_OR_GIFT_ITEM = 29558
    /** 物品续费成功 */
  ITEM_RENEW_SUCC=31500
  /** 无法继续提升，请先提升星光等级 */
  TRAIN_LVL_CANT_OVER_STAR_LVL=33215
  /** 今日膜拜次数超过上限 */
  TODAY_WORSHIP_REACH_LIMIT=34057
  /** 您的密友申请消息已发出，安静的等待答复吧！ */
  REQUEST_BE_CLOSE_FRIEND=39024
  /** 恭喜您与{0}已经结为密友，希望你们的友谊天长地久！ */
  HAS_BECOME_CLOSE_FRIEND=39025
  /** 您的情侣申请消息已发出，安静的等待答复吧！ */
  REQUEST_BE_LOVER=39026
  /** 恭喜您与{0}喜结良缘，希望你们幸福美满！ */
  HAS_BE_LOVER=39027
  
   /** 您现在还是单身喔！快去寻找艳遇吧 */
  WEDDING_LESS_LOVER=39313
  /** {0}向您求婚啦！您要不要答应Ta呢 */
  WEDDING_NEED_TARGET_ACCEPT=39314
  /** 您还缺少婚礼创建卡呢 */
  WEDDING_LESS_WED_CARD=39319
	/** 您还缺少婚戒呢 */
  WEDDING_LESS_WED_RING=39320
	/** 您还缺少婚礼创建卡和婚戒呢 */
  WEDDING_LESS_WED_CARD_RING=39321
  /** 您的情侣必须要在线才可以 */
  WEDDING_NEED_TARGET_ONLINE=39322
  /** 您更改的昵称中含有非法字符，请重新输入 */
  RELATIONSHIP_NICKNAME_ILLEGAL=39361
  /** 对方还没有婚戒呢 */
  WEDDING_TARGET_LESS_WED_RING=39363
  /**只有异性可以成为情侣 */
  ONLY_DIFF_SEX_CAN_BE_LOVER = 39368
  /** 与{0}的亲密值需要达到{1}才能建立情侣关系 */
  INVITE_LOVER_CLOSE_INTIMACY_TOO_LOW=39369
  /** 您今天送出的祝福值已达上限！ */
  WEDDING_BLESS_REACH_LIMIT=39383
  /** 您今天给这对情侣送出的祝福值已达上限！ */
  WEDDING_BLESS_COUPLE_REACH_LIMIT=39384
    /** 对方正在竞技中……请稍后再试！*/
  WEDDING_TARGET_IN_DANCE=39396
  /** 领取成功，请到衣橱中查看！*/
  GET_PRIZE_SUCC=39420
  /** 等待对方回应结婚中…… */
  WAIT_OTHER_PLAYER_WED_RESPONSE=39428
  /** {0}和{1}在甜蜜殿堂中开设了喜宴，大家快去参加他们的婚礼吧！*/
  LOVER_REQ_WEDDING_SUCC=39438
  /** 恭喜{0}和{1}结为夫妻，让我们祝福他们百年好合！*/
  LOVER_WEDDING_COMPLETE=39439
    /** 您已经创建了婚礼房间喔! */
  CANT_CREATE_WEDDING_ROOM_FOR_EXIST=39441
    /** 您的求婚，被对方拒绝了 */
  WED_PROPOSAL_REJECTED=39452
    /** 恭喜您获得了{0}! */
  WED_SUCC_GET_ITEM=39454
    /** 您今日获得喜糖数量已达上限! */
  WED_GET_CANDY_REACH_LIMIT=39458
   /** 恭喜您获得了喜糖({0}/{1}) */
  WED_GET_CANDY_SUCC=39459
   /** 成功添加对方至关注列表中，对方不在线或正在竞技中，申请消息已发送至通知 */
  ADD_FRIEND_SUCC_TARGET_NOT_ONLINE_OR_DANCE=39460
    /** {0}关注了你，向你提交了好友申请，是否添加对方为好友？ */
  OTHER_ADD_YOU_FRIEND_ASK_ALSO_ADD=39461
   /** {0}已经接受了你的好友申请，你们的关系由关注变成了好友 */
  ADD_FRIEND_SUCC_TARGET_ACCEPT=39462
   /** {0}同意了你的好友申请，你们的关系由关注变成了好友 */
  OTHER_ALSO_ADD_YOU_FRIEND=39463
  /** {0}拒绝添加你为好友，但仍然在你的关注列表中 */
  OTHER_REFUSE_ADD_YOU_FRIEND=39464
  /** 成功添加{0}至关注列表中，等待对方响应 */
  ADD_FRIEND_SUCC_WAIT_TARGET_RESPONSE=39469
  /** 您的钻石不足， 置顶失败 */
  WEDDING_NOTICE_TOP_FAIL_LESS_MONEY=39473
    /** 婚房不存在 */
  WEDDING_ROOM_NOT_EXIST=39475
   /** 请求祝福或置顶已消失的婚礼动态 */
  WEDDING_NOTICE_NOT_EXIST=39476
    /** 副团长人数已满，您不可以再任命副团长了喔！*/
  ERR_GUILD_DEPUTY_OVER_LIMIT = 43667
  /** 需要等级达到10级开放 */
  FUNCTION_OPEN_NEED_LEVEL = 43684
  /** 操作失败，对方已经取消舞团申请 */
  ERR_PLAYER_CANCLE_APPLY = 43690
  /** 登录token超时 */
  ERR_LOGIN_TOKEN_TIMEOUT=44051
  /** 账号没有激活*/
  ACCOUNT_NOT_ACTIVATE=44052
  /** 已通关该关卡, 进行协助 */
  ASSIST_TOUR_ALREADY_PASSED=45102
  /** 正在进行该关卡, 进行协助 */
  ASSIST_TOUR_NOT_PASSED=45103
  /** 用户未激活该关卡, 不能协助 */
  CANT_ASSIST_TOUR_FOR_NOT_OPEN=45104
    /** 3s通关不能再玩 */
  CANT_PLAY_TOUR_FOR_ALL_PASS=45377
    /** 今天进行了{0}场竞技， 再继续没有收益 */
  TODAY_DANCE_AWARD_REACH_LIMIT=47035
  /** 公告内容为空或者超过最大长度!*/
  GUILD_NOTICEBOARD_ILLEGAL = 47046
  /** 舞团公告修改成功 */
  MODIFY_GUILD_NOTICEBOARD_SUCC = 47047
  /** 您的好友现在正在温泉广场房间内，您需要等级达到{0}级开启该功能！ */
  ERR_GROUND_LEVEL_NOT_ENOUGH = 47056
  /** 您需要达到等级{0}才能加入舞团 */
  ERR_GUILD_LEVEL_NOT_ENOUGH = 47058
  /** 您的好友现在正在通告房间内，您需要等级达到{0}级开启该功能！ */
  ERR_ANNOUNCE_LEVEL_NOT_ENOUGH = 47059
  /** (弹窗)你当前的金币数量已达到上限 */
  GOLD_COUNT_REACH_LIMIT_OPEN_PANEL = 47068
   /** (弹窗)你当前的钻石数量已达到上限 */
  IB_COUNT_REACH_LIMIT_OPEN_PANEL = 47069
   /** (弹窗)你当前的绑钻数量已达到上限 */
  FREE_IB_COUNT_REACH_LIMIT_OPEN_PANEL = 47070
  /** (普通)你当前的金币数量已达到上限 */
  GOLD_COUNT_REACH_LIMIT = 47072
   /** (普通)你当前的钻石数量已达到上限 */
  IB_COUNT_REACH_LIMIT = 47073
   /** (普通)你当前的绑钻数量已达到上限 */
  FREE_IB_COUNT_REACH_LIMIT = 47074
  /** 由于您的ID涉及违规，因此被禁止登录。如有疑问请联系客服。 */
  ERR_ACCOUNT_BANED = 47071
  /** 您今日通告次数已用完，只能帮助其他人完成喔！ */
  TODAY_ANNOUNCE_NO_MORE_TIMES=48001
   /** 现在没有此通告类型的房间喔 */
  NO_SAME_ANNOUNCE_ROOM=48002
   /** 通告已刷新，请重新接取 */
  ANNOUNCE_HAS_REFRESH=48007
     /** 通告目前正处于冷却中,只能获得好人卡奖励 */
  ANNOUNCE_IS_IN_CD=48009
  /**该物品已经卖完 */
  ANNOUNCE_GOODS_SELL_OUT = 48034
  /** 金币不足*/
  GOLD_LACK = 48035
   /** 通告币不足 */
  ERR_NOT_ENOUGH_ANNOUNCE_MONEY=48026
   /** 恭喜你!获得了{0} */
  GET_ACHIEVE_ITEM_PRIZE=48507
  /** 徽章栏位已满，无法使用 */
  BADGE_CANT_ADD_NO_EMPTY_SLOT=49218
  /** 已经拥有了此徽章，使用失败 */
  BADGE_CANT_ADD_EXIST_SAME=49219
  /** 恭喜你获得了{0}！ */
  GET_NEW_BADGE=49220
   /** 首次使用徽章免费哦，但是再次佩戴会消耗钻石！ */
  FIRST_PUT_ON_BADGE=49221


  /** 对方当前正在与其他玩家互动，无法接受你的邀请。 */
  CANT_INVITE_ACTION_TARGET_ALREADY_DO=49500
  /** 对方当前已经被其他玩家邀请了，无法接受你的邀请。 */
  CANT_INVITE_ACTION_TARGET_ALREADY_INVITED=49501
  /** 对方当前正在换装，无法接受你的邀请。 */
  CANT_INVITE_ACTION_TARGET_CHANGE_AVATAR=49502
  /** 对方当前正坐着，无法接受你的邀请。 */
  CANT_INVITE_ACTION_TARGET_SIT=49503
   /** 对方当前正在与物体交互，无法接受你的邀请。 */
  CANT_INVITE_ACTION_TARGET_ACTION_OBJECT=49504 
    /** 当前选择的动作未解锁，无法使用。 */
  ROOM_ACTION_UNLOCK=49507
     /** 在接下来的{0}分钟内，通过温泉的浸泡，会每{1}分钟增加{2}经验值。 */
  ENTER_SPRING_AWARD_INFO=49509
  /** 通过浸泡温泉，你在{0}分钟内获得了{1}经验值。 */
  OFFLINE_SPRING_AWARD_INFO=49510
   /** 对方当前正忙，无法接受你的邀请。 */
  CANT_INVITE_ACTION_TARGET_BUSY=49525
   /** 对方与你不在同一区域，无法接受你的邀请。 */
  CANT_INVITE_ACTION_TARGET_NOT_SAME_AREA=49526
  /** 经过了{0}分钟的热舞，你获得了{1}点经验，{2}点金币奖励。 */
  GROUND_DANCE_EXP_GOLD_AWARD=49535
   /** 经过了{0}分钟的热舞，你获得了{1}点经验奖励。 */
  GROUND_DANCE_EXP_AWARD=49536
  /** 经过了{0}分钟的热舞，你获得了{1}点金币奖励。 */
  GROUND_DANCE_GOLD_AWARD=49537
  /** 发送红包失败，玩家不在线 */
  SEND_LUCKY_MONEY_PLAYER_OFFLINE = 49615
  /** 红包发送失败，当前未在房间内 */
  SEND_LUCKY_MONEY_ERR_NO_ROOM =49616
  /** 红包发送失败，当前未在温泉广场内 */
  SEND_LUCKY_MONEY_ERR_NO_GROUD =49617
  /** 红包领取失败，红包不存在 */
  LUCKY_MONEY_NOT_EXIST =49618
  /** 红包发送失败 */
  LUCKY_MONEY_SEND_FAIL =49622
    /** 您发出的{0}个红包已过期， 已退回{1}钻石 */
  LUCKY_MONEY_GIVE_BACK =49623
  /** 使用失败，你已经解锁了{0}动作 */
  ERR_ACTION_ALREADY_UNLOCK =49539
  /** 恭喜你解锁了{0}动作 */
  GROUND_ACTION_UNLOCK_SUCC =49540
  /** 当前领舞者使用的香槟总价值{0}钻石，你再使用价值{1}钻石的香槟就能够超越了哦。*/
  ERR_ENTER_RICH_POINT_FAIL = 49543
  /** 当前领舞者的人气值为{0}，你还差{1}人气值就能够超越了哦。*/
  ERR_ENTER_POPULARITY_POINT_FAIL = 49544
  /** 当前领舞者的奖杯数为{0}，你还差{1}奖杯就能够超越了哦。 */
  ERR_ENTER_CUP_POINT_FAIL = 49545
  /** 当前领舞者的等级为{0}，你还差{1}级就能够领舞了哦。*/
  ERR_ENTER_LEVEL_POINT_FAIL = 49546
  /** 当前领舞者的经验值为{0}，你还差{1}经验值就能够领舞了哦。 */
  ERR_ENTER_EXP_LEVEL_POINT_FAIL = 49547
  /** 需要消费购买香槟才能够登上该领舞台 */
  ERR_NEED_USE_CHAMPAGNE = 49558
  /** 需要等级达到{0}级开启 */
  ERR_NEED_LVL_OPEN_FUNC = 49559
  /** 您要领取的红包已经被抢光啦! */
  LUCKY_MONEY_IS_GET_FINISH = 49631
  /** 由于您参与本玩法的数据异常，因此暂时关闭功能至：{0}，如有疑问请与客服联系。 */
  FUNCTION_CLOSED = 47098
  /** 您当前空闲时间过长，请重新登录。 */
  CLOSE_CONNECT_FOR_IDEL_TOO_LONG = 47099
  /** 房间名最多可输入{0}个中文字符 */
  ERR_ROOM_TITLE_LENGTH_LIMIT=49560
  /** VIP{0}玩家{1}进入房间 */
  VIP_PLAYER_ENTER_ROOM=49445
  /** VIP{0}玩家{1}登陆频道 */
  VIP_PLAYER_ENTER_CHANEL=49446
  /** VIP{0}玩家{1}登陆游戏 */
  VIP_PLAYER_ENTER_GAME=49447
  /** 好友度 */
  ADD_RELATION_VALUE_TYPE_COMMON=29562
  /** 密友度 */
  ADD_RELATION_VALUE_TYPE_CLOSED=29563
  /** 甜蜜度 */
  ADD_RELATION_VALUE_TYPE_LOVER=29564
  /** 恭喜{0}的舞团等级提升到Level{1}*/
  GUILD_LEVEL_UP=43702
  /** 恭喜{0}的舞团荣誉等级提升到Level{1}*/
  GUILD_HONOR_LEVEL_UP=43703
  /** {0}送给了你{1}，快去谢谢TA吧！*/ 
  FRIEND_SEND_YOU_A_GIFT=29565
  /** 今日你已经赢满{0}经验值啦，明天再来玩吧！*/
  TODAY_GROUND_AWARD_EXP_FULL=49561
}