namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto

/**  ��������ʾ */
enum LangType{
  /**  �Է������� */
  TARGET_IS_OFFLINE=20
  /** ��Ʒ�ѹ���,������ */
  ITEM_IS_EXPIRE = 285
   /**  �����Ѿ�Ĥ�ݹ� */
  TODAY_HAS_WORSHIIPED=347
  /**
   * ���ӳ�ʱ
   */
  ERR_CONN_TIMEOUT=1000
  /**
   * �û����������
   */
  ERR_PASSWD_INVALID=1001
  /**
   * ������δ����
   */
  ERR_SERVER_NOT_OPEN=1002
  /**
   * ����Ѿ�����
   */
  ERR_PLAYER_IS_ONLINE=1003
  /**
   * �������ﵽ����
   */
  ERR_PLAYER_FULL=1004
  /**
   * ��ʱ�޷���½
   */
  ERR_CANT_LOGIN=1005
  /**
   * �Ƿ���¼��Ϣ
   */
  ERR_ILLEGAL_INFO=1006
  /**
   * �˺ű�����
   */
  ERR_ACCOUNT_LOCKED=1007
  /**
   * ������ʱ
   */
  ERR_NETWORK_DELAY=1008
  /**
   * ��ǿ���߳�
   */
  ERR_FORCE_KICKOF=1009
  /**
   * �Ѿ������˺�
   */
  ERR_ALREADY_BIND=1010
  /**
   * �˺��Ѿ������˽�ɫ
   */
  ERR_HAS_CHAR=1011
  /**
   * ��ʧ��
   */
  ERR_BIND_FAIL=1012
  /**
   * �Ƿ��û���Ϣ
   */
  ERR_ILEGAL_USER=1013
  /**
   * ��ʱ�û�δ�󶨣� ���ܳ�ֵ
   */
  ERR_CANT_RECHARGE_FOR_TEMP_USER=1014
  /**
   * �������û��� ���ܳ�ֵ
   */
  ERR_CANT_RECHARGE_FOR_BLACK_USER=1015
  /**
   * ��ֵʧ��
   */
  ERR_RECHARGE_FAIL=1016
  /**
   * ��ֵ�ɹ��� �����ܵ������ 8Сʱ�Զ���⣬ ���������Ӫ�趨
   */
  ERR_RECHARGE_SUCC_WHILE_FREEZE=1017
  /**
   * ����ʧ�ܣ� ��������
   */
  ERR_CANT_BUY_FOR_FULL=1018
  /**
   * ����ʧ�ܣ� ��Ǯ����
   */
  ERR_CANT_BUY_NOT_ENOUGH_MONEY=1019
  /**
   * ��Ʒ������
   */
  ERR_ITEM_NOT_EXIST=1020
  /**
   * ������ά���� ����������ӶϿ�
   */
  ERR_SERVER_MAINTENANCE=1021
  /**
   * ��Ǯ���㣬��������
   */
  ERR_CANT_CHAT_NOT_ENOUGH_MONEY=1022
  /**
   * �������죬�Ҳ�������
   */
  ERR_CANT_CHAT_CANT_FIND_TARGET=1023
  /**
   * ���ֲ�����
   */
  ERR_MUSIC_NOT_EXIST=1024
  /**
   * �ظ���ȡ������¼����
   */
  ERR_ACTIVITY_GET_CONTINUE_LOGIN_AWARD_REPEAT=1025
  /**
   * ���߻��ֲ���
   */
  ERR_ACTIVITY_OFFLINE_SCORE_ENOUGH=1026
  /**
   * ��������߻��ֶһ�����Ѵﵽ����
   */
  ERR_ACTIVITY_OFFLINE_SCORE_LIMIT=1027
  /**
   * ������ȡʧ�ܣ� ��������
   */
  ERR_CANT_GET_PRIZE_FOR_FULL=1028
  /**
   * ���ֵ�ɹ��� ���{0}ib
   */
  APP_PURCHASE_SUCC=1029
  /**
   * ����ɹ� ����{0}ib {1}coupon
   */
  BUY_MARKET_SUCC=1030
  /**
   * ����ɹ� ����{0}ib
   */
  BUY_MARKET_IB_SUCC=1031
  /**
   * ����ɹ� ����{0}coupon
   */
  BUY_MARKET_COUPON_SUCC=1032
  /**
   * ��ǰ״̬������ ���Ժ�����
   */
  ERR_STATE_NOT_ALLOWED=1033
  /**
   * ����ʧ��
   */
  ERR_FAIL_OPER=1034
  /**
   * ��ֵ��Ϣδ�ı�
   */
  ERR_IAP_NOT_CHANGED=1035
  /**
   * ���ֵ�ɹ������{0}���
   */
  APP_PURCHASE_COUPON_SUCC=1036
  /**
   * ��ǰ�������޷��䣬�뽨������
   */
  NO_DANCE_ROOM_FOR_RAND_JOIN=1037
  /**
   * �޷����룬����δ����
   */
  CANT_JOIN_NO_DANCE_ROOM=1038
  /**
   * �޷����룬���䱻����
   */
  CANT_JOIN_LOCKED_DANCE_ROOM=1039
  /**
   * ������������ѡ����������
   */
  CANT_JOIN_FULL_DANCE_ROOM=1040
  /**
   * �޷����룬���������赸��
   */
  CANT_JOIN_BUSY_DANCE_ROOM=1041
  /**
   * ������{0}�߳��˷���
   */
  KICK_OUT_DANCE_ROOM=1042
  /**
   * ��ȴ�{0}���������
   */
  WAIT_LOAD_MUSIC=1043
  /**
   * {0}�ѵ���
   */
  ROOM_MEMBER_DISCONN=1044
  /**
   * {0}���˳�����
   */
  ROOM_MEMBER_EXIT=1045
  /**
   * {0}���˳����䣬����ת����{1}
   */
  ROOM_LEADER_EXIT=1046
  /**
   * �޷����룬 {0}���ڷ�����
   */
  CANT_INVITE_ALREADY_IN_ROOM=1047
  /**
   * �����������࣬��ȴ��Է��Ĵ�
   */
  CANT_INVITE_OVER_LIMIT=1048
  /**
   * �������������
   */
  CANT_INVITE_TARGET_OFFLINE=1049
  /**
   * �ѱ����룬 �ȴ���Ӧ
   */
  CANT_INVITE_DUP_INVITE=1050
  /**
   * {0}�ܾ����������
   */
  CANT_INVITE_FOR_REJECT=1051
  /**
   * �Է���������
   */
  CANT_JOIN_FULL_INVITE_ROOM=1052
  /**
   * ����׼���У����Ե�
   */
  CANT_START_IN_CD_TIME=1053
  /**
   * �޷���ʼ��{0}�������ظ���
   */
  CANT_START_STILL_LOAD_MUSIC=1054
  /**
   * {0}�Ѿ�����ĺ�����
   */
  FRIEND_ADD_REPEAT=1055
  /**
   * ��������ֻ��ʹ��һ�ξٱ����ܣ����Ժ���ʹ�øù���
   */
  REPORT_TIME_IN_DELAY=1056
  /**
   * �����վٱ��������࣬����0����ٳ��Ծٱ�����л������Ϸ��֧�֣�
   */
  REPORT_OVER_TIMES=1057
  /**
   * ���ľٱ��Ѿ��ɹ����͸�GM����л������Ϸ��֧�֣�
   */
  REPORT_CHAT_SUCC=1058
  /**
   * �ٱ�ʧ��
   */
  REPORT_CHAT_FAIL=1059
  /**
   * ���Ľ����Ѿ�ȡ��
   */
  CHAT_BAN_CANCEL=1060
  /**
   * ����������Ϸ�з�����Υ����Ϸ��������ݣ�����ʱ����{0}����
   */
  CHAT_BAN_SUCC=1061
  /**
   * ���Ѿ�������
   */
  CHAT_BAN_STATE=1062
  /**
   * �������������������Ѵ�����
   */
  VOICE_MAIL_DAY_LIMIT=1063
  /**
   * ����{0}�������������Ѵ�����
   */
  VOICE_MAIL_FRIEND_LIMIT=1064
  /**
   * ƥ��ʧ��
   */
  MATCH_FAIL=1065
  /**
   * �����Ѵﵽ����
   */
  FRIEND_LIMIT=1066
  /**
   * �����ѯ��Ҵ����ﵽ����
   */
  RANDOM_QUERY_LIMIT=1067
  /**
   * ���鲻ƥ�䣬�޷���ʼ��Ϸ
   */
  CANT_START_NOT_ENOUGH_TEAM=1068
  /**
   * ����VIP
   */
  IS_NOT_VIP=1069
  /**
   * �����������
   */
  VIP_EXPIRE_TO_WEEK=1070
  /**
   * ����һ�����
   */
  VIP_EXPIRE_TO_DAY=1071
  /**
   * �������ʺ��Ѿ���������Ұ�
   */
  ALREADY_BIND_3RD_ACCOUNT=1072
  /**
   * ��λ�Ѿ�������
   */
  SIT_FAIL=1073
  /**
   * �����������
   */
  ERR_ROOM_PASSWD_INVALID=1074
  /**
   * ���䲻�����ս
   */
  INVITE_ROOM_CANT_WATCH=1075
  /**
   * �齱ʧ�ܣ������ռ䲻��
   */
  ERR_LOTTERY_BAG_SPACE_ENOUGH=1076
  MUSIC_LOCK_INFO_SET_OK=1078
  /**
   * Ը�������ڣ��������Ѿ����
   */
  NOT_FOUND_WISH=1079
  /**
   * ��������Ը�ĵ�����������
   */
  LIMIT_WISH_ITEM=1080
  /**
   * �ʼ������ڣ��������Ѿ�����
   */
  NOT_FOUND_MAIL=1081
  /**
   * ����{0}��æ���Ը���ɹ�
   */
  REQUEST_HELP_WISH_OK=1082
  /**
   * ��Ʒδ��ȡ������ɾ���ʼ�
   */
  CAN_NOT_DEL_MAIL=1083
  /**
   * ��ѡ����ȷ����Ʒ��Ч������
   */
  SELECTED_RIGHT_VALITETIME=1084
  /**
   * �ﵽ�����������
   */
  LIMIT_MAX_PIC=1085
  /**
   * �����������Ѵ�����
   */
  LIMIT_SHELVE_COURSE=1086
  /**
   * �����ռ䲻��
   */
  ERR_BAG_NOT_ENOUGH=1087
  /**
   * �һ��ɹ����뵽�����鿴
   */
  SUCCESS_EXCHANGE_CONSTIME_MONEY=1088
  /**
   * �Է���������������
   */
  ERR_OTHER_NOT_ININVITEROOM=1089
  /**
   * ���µ������������
   */
  COURSE_COMPLETE=1090
  /**
   * �����񵥳ɹ�
   */
  SUCCESS_UPDATE_MUSIC_RANK=1091
  /**
   * ��Ǯ����
   */
  ERR_NOT_ENOUGH_MONEY=1092
  /**
   * �ȼ�����{0}��������ʧ��
   */
  CREATE_FREE_ROOM_LEVEL_NOT_ENOUGH=1093
  /**
   * �õ��߲�������
   */
  ERR_ITEM_CANT_GIVE=1094
  /**
   * ɾ���ɹ�
   */
  DELETE_ITEM_SUCC=1095
  /**
   * ��ֵ��ʯ����
   */
  ERR_RECHARGE_IB_NOT_ENOUGH=1096
  /**
   * ����vip�ɹ�
   */
  BUY_VIP_SUCCESS=1097
  /**
   * ����δ����
   */
  FUNCTION_IS_NOT_OPEN=1098
  /**
   * ���߲�����
   */
  ITEMID_IS_NOT_EXIST=1099
  /**
   * ������������
   */
  ITEM_IS_NOT_ENOUGH=1100
  /**
   * ��Ʒ���ܳ���
   */
  ERR_ITEM_CANT_SELL=1101
  /**
   * ����Ʒ��������
   */
  ERR_ITEM_CANT_RENEW=1102
  /**
   * ��ϲ���{0}���{1}{2}
   */
  NOTICE_LOTTERY=1103
  /**
   * ��ϲ���{0}���{1}
   */
  NOTICE_CONSTELLATION_LOTTERY=1104
  /**
   * ���߳��۳ɹ�
   */
  SELL_ITEM_SUCC=1105
  /**
   * avatar�Ա��������Ա𲻷�
   */
  AVATAR_SEX_NOT_MATCH=1106
  /**
   * �һ�Կ�׳ɹ���ʾ
   */
  ACTIVITY_EXCHANGE_KEY_SUC=1107
  /**
   * �һ�Կ����Ʒ����Ҳ���
   */
  ACTIVITY_EXCHANGE_KEY_NOT_ENOUGH=1108
  /**
   * û�и�VIPȨ��
   */
  ERR_NO_VIP_RIGHT=1109
  /** �Է���VIP{0}����ң�ֻҪVIP�ﵽ{1}�����޷����߳��ȴ�����Ŷ */
  ERR_CANT_KICK_VIP=1110
  /**
   * ���ĺ���xx���ҵ��齱�л����xx����ȥף��TA��
   */
  SUCCUSS_DROPEGG_LOTTERY_NOTIFI=1111
  /**
   * ���ĺ���xx�����̳齱�л����xx����ȥף��TA��
   */
  SUCCESS_CONSTELLATION_LOTTERY_NOTIFI=1112
  /**
   * ��ϲ���{0}��{1}�齱�л��һ�Ƚ�{2}
   */
  SUCCUSS_LOTTERY_ONE_PRIZE=1113
  /**
   * ��ϲ���{0}��{1}�齱�л�ö��Ƚ�{2}
   */
  SUCCUSS_LOTTERY_TOW_PRIZE=1114
  /**
   * ��ϲ���{0}���һ�Ƚ�{1}
   */
  SUCCUSS_CONTELLATION_ONE_PRIZE=1115
  /**
   * ��ϲ���{0}��ö��Ƚ�{1}
   */
  SUCCUSS_CONTELLATION_TWO_PRIZE=1116
  /**
   * ��ϲ���{0}������Ƚ�{1}
   */
  SUCCESS_CONTELLATION_THREE_PRIZE=1117
  /**
   * ��������Ʒ�����������
   */
  DONATE_ERR_DIFF_SERVER=1118
  /**
   * �Ҳ��������Ϣ
   */
  QUERY_NOT_FIND_PLAYERINFO=1119
  /**
   * ��Ʒ����ɾ��
   */
  ERR_ITEM_CANT_DELETE=1120
  /**
   * ���������Ϸ�
   */
  ERR_ROOM_TITLE_INVALID=1121
  /**
   * ����������ʱ��������߳�����
   */
  ERR_DANCE_DORMANCY_TOO_LONG_EXIT_ROOM=1122
  /**
   * ����׼�������ߣ��߳�����
   */
  ERR_DORMANCY_EXIT_ROOM=1123
  /**
   * ���ͳɹ�
   */
  DONATE_ITEM_SUCCESS=1124
  /**
   * û����һ��������
   */
  NEXT_COURSE_IS_NOT_FOUND=1125
  /**
   * ��ȡ��������ظ�
   */
  GET_RED_PRIZE_REPEAT=1126
  /**
   * ��ȡ��������ɹ�
   */
  GET_RED_PRIZE_SUCCESS=1127
  /**
   * �һ���������
   */
  EXCHANGE_KEY_OVER_LIMIT=1128
  /**
   * �Ѿ�������
   */
  ERR_PLAYER_BAN_CHAT=1129
  /**
   * ����������
   */
  ERR_GUILD_MEMBER_LIMIT_FULL=1130
  /**
   * �ų��޷��˳����ţ����Ƚ��ų�ת��
   */
  ERR_GUILD_CANNOT_QUIT=1131
  /**
   * ���������������޷���׼���������
   */
  ERR_GUILD_NOT_ALLOW_IS_FULL_=1132
  /**
   * ��������ʧ��
   */
  ERR_GUILD_CREATE_FAIL=1133
  /**
   * �����������������Ѵﵽ���ޣ������ҵ������б���ȡ����������
   */
  ERR_GUILD_APPLY_TIMES_TOO_MUCH=1134
  /**
   * �����������������볢�Լ����������š�
   */
  ERR_GUILD_JOIN_OTHER_IS_FULL=1135
  /**
   * ����Ѿ�������������
   */
  ERR_GUILD_ALREADY_JOIN_OTHER=1136
  /**
   * ��������Ϊ�գ��ظ����зǷ��ַ�
   */
  ERR_GUILD_CREATE_NAME=1138
  /**
   * �����������޷�����
   */
  ERR_CARD_BAG_NOT_ENOUGH=1139
  /**
   * ����û�и�����
   */
  ERR_NOT_EXIST_RENAME_CARD=1140
  /**
   * ��ɫ�����Ϸ�
   */
  ERR_NAME_INVALID=1141
  /**
   * ��ɫ���ظ�
   */
  ERR_NAME_REPEAT=1142
  /**
   * ����Ƶ������
   */
  ERR_INVITE_TIME_TOO_SHORT=1143
  /**
   * ��ֵ�ѳɹ�����ʾ
   */
  IOS_TOKEN_USED=1144
  /**
   * ��ļ�ѷ���
   */
  ERR_INVITE_MESSAGE_SEND=1145
  /**
   * �������ųɹ�
   */
  GUILD_CREATE_SUCCESS=1146
  /**
   * �Ѿ��˳�����
   */
  ERR_ALREADY_QUIT_GUILD=1147
  /**
   * ��ѡ��Ķһ�������������
   */
  ERR_GET_COLLECT_COUNT_LIMIT=1148
  /**
   * �����������޷�����
   */
  ERR_INVITE_MEMBER_IS_FULL=1149
  /**
   * �Է��ͻ��˰汾��̫�ͣ��޷�����
   */
  ERR_INVITE_CLINET_VERSION=1150
  /**
   * ������ˢ�·�����ճ����̣�����Ҫ�뷿��ͬ��������ȡ��ˢ���ճ�����
   */
  DAILY_ROOM_COURSE_SYNC_INFO=1151
  /**
   * �����ճ��������ڷ���ͬ��������ˢ��
   */
  DAILY_ROOM_COURSE_ALREADY_SYNC=1152
  /**
   * �������¹�ϵ�󣬲���ʹ�ô˿���
   */
  DO_NOT_HAVE_PARTNER=1153
  /**
   * ����˫����ӵ�л�俨�󣬲���ʹ�ô˿���
   */
  COUPLE_NOT_HAVE_WEDDING_RING=1154
  /**
   * �����һ��û���ڽ�鷿���У��޷���ʼ����
   */
  PARTNER_NON_IN_WEDDING_ROOM=1155
  /**
   * ֤����û���ڳ����޷���ʼ��������֤���˰�ťָ��֤����
   */
  WITNESS_NOT_ASSIGN=1156
  /**
   * ����˫����ӵ�л�俨�󣬲��ܿ�ʼ����
   */
  COUPLE_DONOT_HAVE_RING=1157
  /**
   * ���˫������֤��������������⣬������ʱ�жϣ�
   */
  COUPLE_OR_WITNESS_LEAVE=1162
  /**
   * ��ϲ{0}��{1}��ɻ����Ϊ���£�С��Яȫ��������Ҷ����Ǳ�ʾף�أ�
   */
  WEDDING_SUCCESS_BROADCAST=1163
  /**
   * {0}û�н������룬������ָ��֤���ˣ�
   */
  REFUSE_WITNESS_ASK=1164
  /**
   * ��ֵ��ʯ��������ɴ�л������������������д�л��
   */
  WEDDING_THANKS_IB_NOT_ENOUGH=1169
  /**
   * �����л
   */
  WEDDING_THANKS_MAIL_TITLE=1170
  /**
   * ��л���μ�{0}��{1}�Ļ��������Ա���������ĵ�����ʾ��л��
   */
  WEDDING_THANKS_MAIL_CONTENT=1171
  /**
   * û���ҵ�����
   */
  GUILD_SEARCH_NOT_FIND=1172
  /**
   * ������˻�֤������Դ��δ������أ����Ժ�ʼ����
   */
  LOAD_WEDDING_RESOURCE_NOT_FINISH=1173
  /**
   * ����û�дﵽ��������
   */
  ROOM_TASK_LIMIT_NOT_ENOUGH=1174
  /**
   * ʹ�õ�������δͨ��
   */
  USE_ITEM_LIMIT=1175
  /**
   * ����ǩ���ɹ�
   */
  GUILD_SIGNIN_SUCCESSFUL=1176
  /**
   * ǩ���ظ���Ϣ
   */
  ERR_GUILD_SIGNIN_REPEAT=1177
  /**
   * ��������������
   */
  ERR_GUILD_DONATE_OUT_TIMES=1178
  /**
   * �����������̫��
   */
  ERR_GUILD_SEARCH_TOO_MUCH=1179
  /**
   * ���µ������������
   */
  EXCHANGE_COURSE_COMPELETED=1180
  /**
   * ��ʯ����
   */
  GUILD_INVITE_IB_NOT_ENOUGH=1183
  INVITE_CLOSE_FRIEND_LEVEL_TOO_LOW=1184
  INVITE_CLOSE_FRIEND_INTIMACY_TOO_LOW=1185
  INVITE_CLOSE_FRIEND_AMOUNT_TOO_MANY=1186
  INVITE_LOVER_LEVEL_TOO_LOW=1187
  /** �����ѺöȲ����Ϊ���� */
  INVITE_LOVER_FRIEND_INTIMACY_TOO_LOW=1188
  HAD_LOVER=1189
  /**
   * �����ʽ����ȷ����������ȷ�������ʽ
   */
  EMAIL_PATTERN_WRONG=1190
  /**
   * �°󶨵����䲻����֮ǰ����Ч������һ��
   */
  EMAIL_SAME_WITH_PREEMAIL=1191
  /**
   * ��֤���ѷ���֮���󶨵����䣬�뵽��Ӧ�������ȡ��֤��
   */
  EMAIL_CHECK_CODE_SEND=1192
  /**
   * ��dance�����������֤��
   */
  EMAIL_CHECK_CODE_TITLE=1193
  /**
   * �װ���������ã�\n    ���������ȡ����֤�����£�  {0}    \n    �뷵����Ϸ����������֤�롣
   */
  EMAIL_CHECK_CODE_CONTENT=1194
  /**
   * �����»�ȡ������֤��
   */
  GET_EMAIL_CHECK_CODE_AGAIN=1195
  /**
   * ������֤����֤��ʱ�������»�ȡ������֤��
   */
  EMAIL_CHECK_CODE_TIMEOUT=1196
  /**
   * ������֤�벻��ȷ������������
   */
  EMAIL_CHECK_CODE_WRONG=1197
  /**
   * ����󶨳ɹ���
   */
  EMAIL_BIND_SUCCESS=1198
  /**
   * ���ֲ��㣬�޷��һ���Ӧ����Ʒ
   */
  POINT_NOT_ENOUGH=1199
  /**
   * �һ����������ɣ��뵽��֮ǰ�󶨵����� {0} ��ȡ��������֤��
   */
  ORDER_CHECK_CODE_SEND=1200
  /**
   * ��dance������{0}����֤��
   */
  ORDER_CHECK_CODE_TITLE=1201
  /**
   * �װ���������ã�\n    ���ڡ�dance���һ�������Ʒʱ�����ɵĶ���{0}���һ���Ʒʱ��Ҫ����Ķ�����֤�����£�  {1}    \n    �뷵����Ϸ������֤�롣
   */
  ORDER_CHECK_CODE_CONTENT=1202
  /**
   * �����»�ȡ������֤��
   */
  ORDER_CHECK_CODE_AGAIN=1203
  /**
   * ������֤����֤��ʱ�������»�ȡ������֤��
   */
  ORDER_CHECK_CODE_TIMEOUT=1204
  /**
   * ������֤�벻��ȷ������������
   */
  ORDER_CHECK_CODE_WRONG=1205
  /**
   * ����У��ɹ������ڽ������ݽ�������ȴ��һ������
   */
  ORDER_CHECK_CODE_CORRECT=1206
  /**
   * ��Ʒ�һ��ɹ����������󶨵�����{0}��ȡ��Ʒ�һ����˺ź����룡
   */
  ORDER_SUCCESS=1207
  /**
   * ��Ʒ�һ�ʧ�ܣ������������̳ǽ���Ķ����б��н��С����ߡ�������ϵ�ͷ���
   */
  ORDER_FAILE=1208
  /**
   * ��dance������{0}�ɹ�
   */
  ORDER_SUCCESS_TITLE=1214
  /**
   * �����ɹ�������{2}������{3}
   */
  ORDER_SUCCESS_CONTENT=1215
  /**
   * 216�����{0}�Ľ���
   */
  RECEIVE_AWARD=1216
  /**
   * ����Ѿ������
   */
  PLAYER_IS_MARRIED=1221
  /**
   * �˻����㣬��ֵʧ�ܣ������ѷ�����
   */
  JNET_ACCOUNT_BALANCE_NOT_ENOUGH=1222
  /**
   * ��ϲ{0}��{1}��ɻ����Ϊ���£�С��Яȫ��������Ҷ����Ǳ�ʾף�أ�
   */
  WEDDING_SUCCESS_FUNC=1223
  /**
   * �޷����򣬶�Ӧ����Ʒ�Ѿ��¼ܣ�
   */
  LIMIT_SALE_TIMEOUT=1225
  /**
   * �޷����򣬶�Ӧ����Ʒ�Ѿ��ۿգ�
   */
  LIMIT_SALE_SALE_OUT=1226
  /**
   * �޷�����VIP�ȼ�û�дﵽ���Ҫ��
   */
  LIMIT_SALE_VIP_LEVEL=1227
  /**
   * ����ɹ� ����{0}����ʯ��
   */
  BUY_MARKET_FREE_IB_SUCC=1244
  /**
   * ��ϲ�����ز��������ǽ��Ӧ�û��{0}���꣡
   */
  POINT_WALL_ACTIVE=1246
  /**
   * ������Ϣ���ڼ�����
   */
  GUILD_DATA_LOADING=1247
  /**
   * �����벻����
   */
  CODE_NOT_EXIST=1248
  /**
   * ��������ʹ��
   */
  CODE_USED=1249
  /**
   * �������ѹ���
   */
  CODE_EXPIRE=1250
  /**
   * ��ϲ����ü��������
   */
  CODE_SUCCESS=1251
  /**
   * ��������ȡ�쳣������ϵ�ͷ��򱾵���Ӫ��
   */
  CODE_ERROR=1252
  /**
   * �� ������δ���ţ�����������Ϣ
   */
  CHANNEL_BINDCHAR_ERROR=1253
  /**
   * ��������δ���ùؿ���Ϣ
   */
  CHAPTER_UNSET_ERROR=1254
  /**
   * ��������ѡ��ؿ�������
   */
  CHAPTER_NOTFIND_ERROR=1255
  /**
   * �����ռ䲻�㣬��ȡʧ��
   */
  MAIL_PACKET_FULL_ERROR=1265
  /**
   * Ⱦɫ�ɹ�
   */
   SUCCESS_DIY_AVATAR=1266
 /** ����ɹ��� ����{0}��ʯ�� {1}���� */
   BUY_SUCC_COST_IB_FREE_IB=1267
    /** ����ɹ��� ����{0}��ʯ�� {1}����, {2}��� */
   BUY_SUCC_COST_IB_FREE_IB_GOLD=1268
    /** ����ɹ��� ����{0}���꣬ {1}��� */
   BUY_SUCC_COST_FREE_IB_GOLD=1269
   /** û����Ҫˢ�µ���Ʒ */
   GUILD_SHOP_NO_NEED_REFRESH = 1270
   /** ��Ϸ�ѿ�ʼ���޷������սģʽ */
   DANCE_ALREADY_START_CANT_WATCH = 1271
   /** �����ѿ�ʼ���޷������սģʽ */
   WED_ALREADY_START_CANT_WATCH = 1272
   /** ��ɫ�����а����Ƿ��֣����޸ĺ����� */
   NAME_CONTAIN_ILEGAL_CHAR = 1273
   /** ��ɫ���ƹ��������޸ĺ����� */
   NAME_LENGTH_OVER_MAX = 1274
   /** ��ɫ���ƹ��̣����޸ĺ����� */
   NAME_LENGTH_LESS_MIN = 1275
   
  /**
   * {0}����Ϊ������
   */
  NOTIFICATION_ADD_FRIENT=1800
  /**
   * {0}��������һ������:{1}
   */
  NOTIFICATION_GIFT=1801
  /**
   * {0}��{1}�г�����������������{2}��
   */
  NOTIFICATION_SELF_RANK=1802
  /**
   * ����{0}��{1}��{2}�����л����{3}�ֺ�{4}��������
   */
  NOTIFICATION_SELF_DANCE=1803
  /**
   * {0}�������ͼƬ
   */
  NOTIFICATION_PIC_LIKE=1804
  /**
   * ��ϲ���Ѿ�ͨ��������룬���Ѽ��������
   */
  NOTIFICATION_JOIN_GUILD_SUC=1806
  /**
   * ���뱻�ܾ�
   */
  NOTIFICATION_JOIN_GUILD_REUSE=1807
  /**
   * �ų�����֪ͨ
   */
  NOTIFICATION_INVITE_JOIN_GUILD=1808
  /**
   * ��ҽ�������
   */
  NOTIFICATION_AGREE_JOIN_GUILD=1809
  /**
   * ���û�н����������
   */
  NOTIFICATION_AGREE_RESUE_GUILD=1810
  /**
   * �޳����
   */
  NOTIFICATION_KICK_GUILD=1813
  /**
   * ���ų�Ա�˳�
   */
  NOTIFICATION_QUIT_GUILD=1814
  /**
   * ��ϲ����{0}��Ϊ���£���ͬ��Ϸ���������ǵ�����ֵ����û��佱����
   */
  WEDDING_SUCCESS=1815
  GUILD_LEVEL_UP_BROADCAST=1816
  /**
   * ���������ų�Ա����֪ͨ
   */
  GUILD_LEVEL_UP_NOTICE=1817
  /**
   * {0}�������Ϊ����
   */
  ADD_CLOSE_FRIEND=1818
  /**
   * {0}�ܾ�����Ϊ����
   */
  REFUSE_ADD_CLOSE_FRIEND=1819
  /**
   * {0}���Ѳ�����
   */
  FRIEND_NOT_ONLINE=1820
  /**
   * {0}������������ѹ�ϵ
   */
  DELETE_CLOSE_FRIEND=1821
  /**
   * {0}��ʱ��{1}������{2}
   */
  TOUCH_FRIEND=1822
  /**
   * {0}���Ѳ�����
   */
  CLOSE_FRIEND_NOT_ONLINE=1823
  /**
   * {0}�������Ϊ����
   */
  BE_MY_LOVER=1824
  /**
   * {0}�ܾ�����Ϊ����
   */
  REFUSE_TO_BE_LOVERS=1825
  /**
   * {0}ͬ�������Ϊ����
   */
  AGREE_TO_BE_CLOSE_FRIEND=1826
  /** {0}ͬ�������Ϊ���� */
  AGREE_TO_BE_LOVERS=1827
  /** {0}������������¹�ϵ */
  DELETE_LOVER=1828
  /**
   * ���ž���������
   */
  ERR_GUILD_DONATE_VALUE=1830
  /** {0}��������˻�����ϵ��*/
  DIVORCE_SUCCESS=1831
  INTIMACY_COMMON_AND_CLOSE_FRIEND_GIFT_TIMES=1832
  INTIMACY_LOVERS_GIFT_TIMES=1833
  INTIMACY_COUPLES_GIFT_TIMES=1834
  /** {0}��������˺��ѹ�ϵ */
  DELETE_TWO_WAY_FRIEND=1837
   /** {0}�鿴��������Ƭ��Ҳȥ�ݷ�һ��Ta�ɣ� */
  BE_VIEWED_BUSINESS_CARD=1838
  /**
   * ��������ȼ�����,���ܹ���
   */
  GUILD_HONOR_LEVEL_NOT_ENOUGH=2224
  /**
   * ���Ź��ײ���,����ʧ��
   */
  GUILD_CONTRIBUTION_NOT_ENOUGH=2225
  /**
   * Ĥ�ݳɹ������{0} �����ű�
   */
  GUILD_WORSHIP_SUCC=2230
    /** �����ɹ������{0}����ֵ��{1}���ű� \n ���Ż��{2}�㾭���{3}������ */
  GUILD_DONATE_SUCC = 2234
  /** ������ļ��Ϣ�ɹ� */
  GUILD_WORLD_INVITE_SUCC = 2235
  /** ��ϲ�����[FF0000]{0}X{1}[-] */
  GET_ITEM_SUCC = 612
  /**
   * bag full
   */
  BAG_FULL_TO_MAIL=1835
  /** ���ϲ��㣬�޷���ɺϳ� */
  CANT_COMPOSE_LESS_MATERIAL=20083
   /** ���Ҳ��㣬�޷���ɺϳ� */
  CANT_COMPOSE_LESS_MONEY=20084
   /** ���ϲ��㣬�޷���ɽ��� */
  CANT_EVOLUTE_LESS_MATERIAL=20085
   /** ���Ҳ��㣬�޷���ɽ��� */
  CANT_EVOLUTE_LESS_MONEY=20086
 /** ��ϲ���{0}��{1}�齱�л��{2}�����{3}�� */
  LUCKY_EGG_GET_TWO_PRIZE=20104
   /** ��ϲ���{0}��{1}�齱�л��{2}�����{3}�����{4}��*/
  LUCKY_EGG_GET_THREE_PRIZE=20105
   /** ��ϲ���{0}��{1}�齱�л��{2}�����{3}�����{4}}�����{5}�� */
  LUCKY_EGG_GET_FOUR_PRIZE=20106
  /** ��ϲ��������ճ���� */
  FINISH_DAILY_TASK=25013
  /** ��ϲ�������������� */
  FINISH_RAND_TASK=25014
  /** û�м����������� */
  NO_ACTIVE_RAND_TASK=25100
  
  /**
   * ��Ǯ���㣬ˢ���������ʧ��
   */
  CANT_REFRESH_RAND_TASK_LESS_MONEY=25101
  /** ������ʽ����������д��ȷ������� */
  USE_ACTIVE_CODE_FAIL_FORMAT_ILLEGAL = 28207
  /** �������Ч���ѹ��� */
  USE_ACTIVE_CODE_FAIL_INVALID = 28208
  /** ������ѱ�ʹ�� */
  USE_ACTIVE_CODE_FAIL_OTHER_USED = 28209
  /** �ɹ���������룬��ȥ�ʼ�����ȡ������ */
  USE_ACTIVE_CODE_SUCC = 28210
  /** ���Ѿ���ȡ��������� */
  USE_ACTIVE_CODE_FAIL_HAS_USED= 28211
  /** ʹ��ʧ�ܣ�����ͬ���͵ķ��俨����ʹ���� */
  CANT_USE_SAME_TYPE_ROOM_CARD = 29543
   /** ��δ�ϼ���Ʒ�� ���ܹ��� */
  CANT_BUY_ITEM_NOT_ON_MARKET = 29550
  /** ���ﳵ����Ʒ�������������Ʒ����ɾ������������ */
  CANT_DONATE_FOR_NON_IB_ITEM = 29556
  /** ���ﳵ����Ʒ�����������͵���Ʒ����ɾ������������ */
  CANT_DONATE_FOR_NON_GIFT_ITEM = 29557
  /** ���ﳵ����Ʒ����������Ʒ�������Ʒ�򲻿����͵���Ʒ����ɾ������������ */
  CANT_DONATE_FOR_NON_IB_OR_GIFT_ITEM = 29558
    /** ��Ʒ���ѳɹ� */
  ITEM_RENEW_SUCC=31500
  /** �޷��������������������ǹ�ȼ� */
  TRAIN_LVL_CANT_OVER_STAR_LVL=33215
  /** ����Ĥ�ݴ����������� */
  TODAY_WORSHIP_REACH_LIMIT=34057
  /** ��������������Ϣ�ѷ����������ĵȴ��𸴰ɣ� */
  REQUEST_BE_CLOSE_FRIEND=39024
  /** ��ϲ����{0}�Ѿ���Ϊ���ѣ�ϣ�����ǵ������쳤�ؾã� */
  HAS_BECOME_CLOSE_FRIEND=39025
  /** ��������������Ϣ�ѷ����������ĵȴ��𸴰ɣ� */
  REQUEST_BE_LOVER=39026
  /** ��ϲ����{0}ϲ����Ե��ϣ�������Ҹ������� */
  HAS_BE_LOVER=39027
  
   /** �����ڻ��ǵ���ร���ȥѰ�������� */
  WEDDING_LESS_LOVER=39313
  /** {0}�������������Ҫ��Ҫ��ӦTa�� */
  WEDDING_NEED_TARGET_ACCEPT=39314
  /** ����ȱ�ٻ��񴴽����� */
  WEDDING_LESS_WED_CARD=39319
	/** ����ȱ�ٻ���� */
  WEDDING_LESS_WED_RING=39320
	/** ����ȱ�ٻ��񴴽����ͻ���� */
  WEDDING_LESS_WED_CARD_RING=39321
  /** �������±���Ҫ���߲ſ��� */
  WEDDING_NEED_TARGET_ONLINE=39322
  /** �����ĵ��ǳ��к��зǷ��ַ������������� */
  RELATIONSHIP_NICKNAME_ILLEGAL=39361
  /** �Է���û�л���� */
  WEDDING_TARGET_LESS_WED_RING=39363
  /**ֻ�����Կ��Գ�Ϊ���� */
  ONLY_DIFF_SEX_CAN_BE_LOVER = 39368
  /** ��{0}������ֵ��Ҫ�ﵽ{1}���ܽ������¹�ϵ */
  INVITE_LOVER_CLOSE_INTIMACY_TOO_LOW=39369
  /** �������ͳ���ף��ֵ�Ѵ����ޣ� */
  WEDDING_BLESS_REACH_LIMIT=39383
  /** ���������������ͳ���ף��ֵ�Ѵ����ޣ� */
  WEDDING_BLESS_COUPLE_REACH_LIMIT=39384
    /** �Է����ھ����С������Ժ����ԣ�*/
  WEDDING_TARGET_IN_DANCE=39396
  /** ��ȡ�ɹ����뵽�³��в鿴��*/
  GET_PRIZE_SUCC=39420
  /** �ȴ��Է���Ӧ����С��� */
  WAIT_OTHER_PLAYER_WED_RESPONSE=39428
  /** {0}��{1}�����۵����п�����ϲ�磬��ҿ�ȥ�μ����ǵĻ���ɣ�*/
  LOVER_REQ_WEDDING_SUCC=39438
  /** ��ϲ{0}��{1}��Ϊ���ޣ�������ף�����ǰ���úϣ�*/
  LOVER_WEDDING_COMPLETE=39439
    /** ���Ѿ������˻��񷿼��! */
  CANT_CREATE_WEDDING_ROOM_FOR_EXIST=39441
    /** ������飬���Է��ܾ��� */
  WED_PROPOSAL_REJECTED=39452
    /** ��ϲ�������{0}! */
  WED_SUCC_GET_ITEM=39454
    /** �����ջ��ϲ�������Ѵ�����! */
  WED_GET_CANDY_REACH_LIMIT=39458
   /** ��ϲ�������ϲ��({0}/{1}) */
  WED_GET_CANDY_SUCC=39459
   /** �ɹ���ӶԷ�����ע�б��У��Է������߻����ھ����У�������Ϣ�ѷ�����֪ͨ */
  ADD_FRIEND_SUCC_TARGET_NOT_ONLINE_OR_DANCE=39460
    /** {0}��ע���㣬�����ύ�˺������룬�Ƿ���ӶԷ�Ϊ���ѣ� */
  OTHER_ADD_YOU_FRIEND_ASK_ALSO_ADD=39461
   /** {0}�Ѿ���������ĺ������룬���ǵĹ�ϵ�ɹ�ע����˺��� */
  ADD_FRIEND_SUCC_TARGET_ACCEPT=39462
   /** {0}ͬ������ĺ������룬���ǵĹ�ϵ�ɹ�ע����˺��� */
  OTHER_ALSO_ADD_YOU_FRIEND=39463
  /** {0}�ܾ������Ϊ���ѣ�����Ȼ����Ĺ�ע�б��� */
  OTHER_REFUSE_ADD_YOU_FRIEND=39464
  /** �ɹ����{0}����ע�б��У��ȴ��Է���Ӧ */
  ADD_FRIEND_SUCC_WAIT_TARGET_RESPONSE=39469
  /** ������ʯ���㣬 �ö�ʧ�� */
  WEDDING_NOTICE_TOP_FAIL_LESS_MONEY=39473
    /** �鷿������ */
  WEDDING_ROOM_NOT_EXIST=39475
   /** ����ף�����ö�����ʧ�Ļ���̬ */
  WEDDING_NOTICE_NOT_EXIST=39476
    /** ���ų����������������������������ų���ร�*/
  ERR_GUILD_DEPUTY_OVER_LIMIT = 43667
  /** ��Ҫ�ȼ��ﵽ10������ */
  FUNCTION_OPEN_NEED_LEVEL = 43684
  /** ����ʧ�ܣ��Է��Ѿ�ȡ���������� */
  ERR_PLAYER_CANCLE_APPLY = 43690
  /** ��¼token��ʱ */
  ERR_LOGIN_TOKEN_TIMEOUT=44051
  /** �˺�û�м���*/
  ACCOUNT_NOT_ACTIVATE=44052
  /** ��ͨ�ظùؿ�, ����Э�� */
  ASSIST_TOUR_ALREADY_PASSED=45102
  /** ���ڽ��иùؿ�, ����Э�� */
  ASSIST_TOUR_NOT_PASSED=45103
  /** �û�δ����ùؿ�, ����Э�� */
  CANT_ASSIST_TOUR_FOR_NOT_OPEN=45104
    /** 3sͨ�ز������� */
  CANT_PLAY_TOUR_FOR_ALL_PASS=45377
    /** ���������{0}�������� �ټ���û������ */
  TODAY_DANCE_AWARD_REACH_LIMIT=47035
  /** ��������Ϊ�ջ��߳�����󳤶�!*/
  GUILD_NOTICEBOARD_ILLEGAL = 47046
  /** ���Ź����޸ĳɹ� */
  MODIFY_GUILD_NOTICEBOARD_SUCC = 47047
  /** ���ĺ�������������Ȫ�㳡�����ڣ�����Ҫ�ȼ��ﵽ{0}�������ù��ܣ� */
  ERR_GROUND_LEVEL_NOT_ENOUGH = 47056
  /** ����Ҫ�ﵽ�ȼ�{0}���ܼ������� */
  ERR_GUILD_LEVEL_NOT_ENOUGH = 47058
  /** ���ĺ�����������ͨ�淿���ڣ�����Ҫ�ȼ��ﵽ{0}�������ù��ܣ� */
  ERR_ANNOUNCE_LEVEL_NOT_ENOUGH = 47059
  /** (����)�㵱ǰ�Ľ�������Ѵﵽ���� */
  GOLD_COUNT_REACH_LIMIT_OPEN_PANEL = 47068
   /** (����)�㵱ǰ����ʯ�����Ѵﵽ���� */
  IB_COUNT_REACH_LIMIT_OPEN_PANEL = 47069
   /** (����)�㵱ǰ�İ��������Ѵﵽ���� */
  FREE_IB_COUNT_REACH_LIMIT_OPEN_PANEL = 47070
  /** (��ͨ)�㵱ǰ�Ľ�������Ѵﵽ���� */
  GOLD_COUNT_REACH_LIMIT = 47072
   /** (��ͨ)�㵱ǰ����ʯ�����Ѵﵽ���� */
  IB_COUNT_REACH_LIMIT = 47073
   /** (��ͨ)�㵱ǰ�İ��������Ѵﵽ���� */
  FREE_IB_COUNT_REACH_LIMIT = 47074
  /** ��������ID�漰Υ�棬��˱���ֹ��¼��������������ϵ�ͷ��� */
  ERR_ACCOUNT_BANED = 47071
  /** ������ͨ����������ֻ꣬�ܰ������������ร� */
  TODAY_ANNOUNCE_NO_MORE_TIMES=48001
   /** ����û�д�ͨ�����͵ķ���� */
  NO_SAME_ANNOUNCE_ROOM=48002
   /** ͨ����ˢ�£������½�ȡ */
  ANNOUNCE_HAS_REFRESH=48007
     /** ͨ��Ŀǰ��������ȴ��,ֻ�ܻ�ú��˿����� */
  ANNOUNCE_IS_IN_CD=48009
  /**����Ʒ�Ѿ����� */
  ANNOUNCE_GOODS_SELL_OUT = 48034
  /** ��Ҳ���*/
  GOLD_LACK = 48035
   /** ͨ��Ҳ��� */
  ERR_NOT_ENOUGH_ANNOUNCE_MONEY=48026
   /** ��ϲ��!�����{0} */
  GET_ACHIEVE_ITEM_PRIZE=48507
  /** ������λ�������޷�ʹ�� */
  BADGE_CANT_ADD_NO_EMPTY_SLOT=49218
  /** �Ѿ�ӵ���˴˻��£�ʹ��ʧ�� */
  BADGE_CANT_ADD_EXIST_SAME=49219
  /** ��ϲ������{0}�� */
  GET_NEW_BADGE=49220
   /** �״�ʹ�û������Ŷ�������ٴ������������ʯ�� */
  FIRST_PUT_ON_BADGE=49221


  /** �Է���ǰ������������һ������޷�����������롣 */
  CANT_INVITE_ACTION_TARGET_ALREADY_DO=49500
  /** �Է���ǰ�Ѿ���������������ˣ��޷�����������롣 */
  CANT_INVITE_ACTION_TARGET_ALREADY_INVITED=49501
  /** �Է���ǰ���ڻ�װ���޷�����������롣 */
  CANT_INVITE_ACTION_TARGET_CHANGE_AVATAR=49502
  /** �Է���ǰ�����ţ��޷�����������롣 */
  CANT_INVITE_ACTION_TARGET_SIT=49503
   /** �Է���ǰ���������彻�����޷�����������롣 */
  CANT_INVITE_ACTION_TARGET_ACTION_OBJECT=49504 
    /** ��ǰѡ��Ķ���δ�������޷�ʹ�á� */
  ROOM_ACTION_UNLOCK=49507
     /** �ڽ�������{0}�����ڣ�ͨ����Ȫ�Ľ��ݣ���ÿ{1}��������{2}����ֵ�� */
  ENTER_SPRING_AWARD_INFO=49509
  /** ͨ��������Ȫ������{0}�����ڻ����{1}����ֵ�� */
  OFFLINE_SPRING_AWARD_INFO=49510
   /** �Է���ǰ��æ���޷�����������롣 */
  CANT_INVITE_ACTION_TARGET_BUSY=49525
   /** �Է����㲻��ͬһ�����޷�����������롣 */
  CANT_INVITE_ACTION_TARGET_NOT_SAME_AREA=49526
  /** ������{0}���ӵ����裬������{1}�㾭�飬{2}���ҽ����� */
  GROUND_DANCE_EXP_GOLD_AWARD=49535
   /** ������{0}���ӵ����裬������{1}�㾭�齱���� */
  GROUND_DANCE_EXP_AWARD=49536
  /** ������{0}���ӵ����裬������{1}���ҽ����� */
  GROUND_DANCE_GOLD_AWARD=49537
  /** ���ͺ��ʧ�ܣ���Ҳ����� */
  SEND_LUCKY_MONEY_PLAYER_OFFLINE = 49615
  /** �������ʧ�ܣ���ǰδ�ڷ����� */
  SEND_LUCKY_MONEY_ERR_NO_ROOM =49616
  /** �������ʧ�ܣ���ǰδ����Ȫ�㳡�� */
  SEND_LUCKY_MONEY_ERR_NO_GROUD =49617
  /** �����ȡʧ�ܣ���������� */
  LUCKY_MONEY_NOT_EXIST =49618
  /** �������ʧ�� */
  LUCKY_MONEY_SEND_FAIL =49622
    /** ��������{0}������ѹ��ڣ� ���˻�{1}��ʯ */
  LUCKY_MONEY_GIVE_BACK =49623
  /** ʹ��ʧ�ܣ����Ѿ�������{0}���� */
  ERR_ACTION_ALREADY_UNLOCK =49539
  /** ��ϲ�������{0}���� */
  GROUND_ACTION_UNLOCK_SUCC =49540
  /** ��ǰ������ʹ�õ������ܼ�ֵ{0}��ʯ������ʹ�ü�ֵ{1}��ʯ�����ľ��ܹ���Խ��Ŷ��*/
  ERR_ENTER_RICH_POINT_FAIL = 49543
  /** ��ǰ�����ߵ�����ֵΪ{0}���㻹��{1}����ֵ���ܹ���Խ��Ŷ��*/
  ERR_ENTER_POPULARITY_POINT_FAIL = 49544
  /** ��ǰ�����ߵĽ�����Ϊ{0}���㻹��{1}�������ܹ���Խ��Ŷ�� */
  ERR_ENTER_CUP_POINT_FAIL = 49545
  /** ��ǰ�����ߵĵȼ�Ϊ{0}���㻹��{1}�����ܹ�������Ŷ��*/
  ERR_ENTER_LEVEL_POINT_FAIL = 49546
  /** ��ǰ�����ߵľ���ֵΪ{0}���㻹��{1}����ֵ���ܹ�������Ŷ�� */
  ERR_ENTER_EXP_LEVEL_POINT_FAIL = 49547
  /** ��Ҫ���ѹ������Ĳ��ܹ����ϸ�����̨ */
  ERR_NEED_USE_CHAMPAGNE = 49558
  /** ��Ҫ�ȼ��ﵽ{0}������ */
  ERR_NEED_LVL_OPEN_FUNC = 49559
  /** ��Ҫ��ȡ�ĺ���Ѿ���������! */
  LUCKY_MONEY_IS_GET_FINISH = 49631
  /** ���������뱾�淨�������쳣�������ʱ�رչ�������{0}��������������ͷ���ϵ�� */
  FUNCTION_CLOSED = 47098
  /** ����ǰ����ʱ������������µ�¼�� */
  CLOSE_CONNECT_FOR_IDEL_TOO_LONG = 47099
  /** ��������������{0}�������ַ� */
  ERR_ROOM_TITLE_LENGTH_LIMIT=49560
  /** VIP{0}���{1}���뷿�� */
  VIP_PLAYER_ENTER_ROOM=49445
  /** VIP{0}���{1}��½Ƶ�� */
  VIP_PLAYER_ENTER_CHANEL=49446
  /** VIP{0}���{1}��½��Ϸ */
  VIP_PLAYER_ENTER_GAME=49447
  /** ���Ѷ� */
  ADD_RELATION_VALUE_TYPE_COMMON=29562
  /** ���Ѷ� */
  ADD_RELATION_VALUE_TYPE_CLOSED=29563
  /** ���۶� */
  ADD_RELATION_VALUE_TYPE_LOVER=29564
  /** ��ϲ{0}�����ŵȼ�������Level{1}*/
  GUILD_LEVEL_UP=43702
  /** ��ϲ{0}�����������ȼ�������Level{1}*/
  GUILD_HONOR_LEVEL_UP=43703
  /** {0}�͸�����{1}����ȥллTA�ɣ�*/ 
  FRIEND_SEND_YOU_A_GIFT=29565
  /** �������Ѿ�Ӯ��{0}����ֵ��������������ɣ�*/
  TODAY_GROUND_AWARD_EXP_FULL=49561
}