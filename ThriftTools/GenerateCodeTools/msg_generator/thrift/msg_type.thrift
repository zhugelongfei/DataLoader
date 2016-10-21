namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto

enum MessageType{
//�ͻ��˷�����������Ϣ���忪ʼ,��Χ101~2000
	CS_BEGIN=100
	/** ��¼��Ϣ */
	CS_USER_PASSWD
	/** ���ٿ�ʼ��Ϸ */
	CS_QUICK_START
	/** �赸������ȷ״̬ */
	CS_DANCE_STATUS
	/** �㲥������Ϣ */
	CS_BROADCAST_CHAT
	/** �������¿�ʼ�������赸 */
	CS_RESTART_DANCE
	/** �˳����� */
	CS_EXIT_ROOM
	/** �ͻ�������״̬(ǰ�˻���) */
	CS_RUN_STATE
	/** �ͻ��˷��ص�Ping��Ϣ */
	CS_CLIENT_PING
	/** ͬ���赸��� */
	CS_SYNC_DANCE_INFO
	/** ���ٵ�¼ */
	CS_QUICK_LOGIN
	/** ��װ */
	CS_CHANGE_CLOTHES
	/** ������λϵ�� */
	CS_ADJUST_AVATAR_VAL
	/** ��װ */
	CS_CHANGE_AVATAR
	/** ���³� */
	CS_OPEN_ALMIRAH
	/** �赸׼�������Ϣ */
	CS_PREPARE_DANCE_FINISH
	/** �赸�����Ϣ */
	CS_DANCE_FINISH
	/** ʹ����Ʒ */
	CS_USE_ITEM
	/** �赸�����Ϣ */
	CS_PUT_ATHLETICS_ITEM
	/** ���򵥸���Ʒ */
	CS_BUY_SINGLE_ITEM
	/** ��������Ʒ */
	CS_BUY_MULTI_ITEMS
	/** ��ѯ��ֵ�ײ� */
	CS_QUERY_PURCHASE_INFO
	/** ���ͳ�ֵtoken */
	CS_PURCHASE_TOKEN
	/** ����������� */
	CS_RAND_CHAR_NAME
	/** ������ɫ */
	CS_CREATE_NEW_CHAR
	/** ��ʱ�˺Ű� */
	CS_TEMP_USER_BIND
	/** ˽�� */
	CS_WHISPER
	/** ɾ����Ʒ */
	CS_DELETE_ITEM
	/** �赸�׶� */
	CS_DANCE_PERIOD
	/** ����ϲ������װ */
	CS_SAVE_FAVORITE_AVATARS
	/** ����ϲ������װ */
	CS_PUT_FAVORITE_AVATARS
	/** ��ѯ���ּ�¼��Ϣ */
	CS_QUERY_MUSIC_RECORD
	/** ��ȡ������¼������ȡ��Ϣ */
	CS_GET_LOGIN_AWARD_INFO
	/** ��ȡ���ӵ�¼���� */
	CS_GET_LOGIN_AWARD
	/** ��ȡ���ߵ�ȯ���� */
	CS_GET_OFFLINE_COUPON
	/** ��ҷ��ͷ�����Ϣ */
	CS_SEND_FEED_BACK
	/** ��Ҳ�ѯ�����б� */
	CS_QUERY_COMMON_PRIZE
	/** �����ȡ���� */
	CS_GET_GM_PRIZE
	/** ��Ӻ��� */
	CS_ADD_FRIEND
	/** ��ѯ�����б� */
	CS_QUERY_FRIEND_LIST
	/** ��ʾ���ѵ���Ƭ��Ϣ */
	CS_SHOW_BUSINESS_CARD_INFO
	/** ɾ������ */
	CS_DELETE_FRIEND
	/** ��ѯ����������Ϣ */
    CS_QUERY_DANCE_ROOM_INFOS
	/** �������뷿�� */
	CS_CREATE_DANCE_ROOM
	/** ����������뷿�� */
	CS_RAND_JOIN_DANCE_ROOM
	/** ���÷������� */
	CS_SET_ROOM_MUSIC
	/** ���뷿�� */
	CS_JOIN_DANCE_ROOM
	/** �߳���Ա */
	CS_KICK_OUT_ROOM_MEMBER
	/** ����ʼ������ */
	CS_REQ_START_ROOM_DANCE
	/** �ȴ���������״̬ */
	CS_PREPARE_DANCE_STATUS
	/** �������� */
	CS_DANCE_ROOM_LOCK_OPER
	/** ��ѯ���������Ϣ */
	CS_QUERY_INVITE_PLAYER_INFOS
	/** ������뷿�� */
	CS_INVITE_JOIN_DANCE_ROOM
	/** ��Ӧ���� */
	CS_INVITE_JOIN_ROOM_RESP
	/** ��ѯ��� */
	CS_SEARCH_PLAYER
	/** ͬ���������ֽ��� */
	CS_ROOM_LOAD_MUSIC_PROCESS
	/** �ٱ����� */
	CS_REPORT_CHAT
	/** ��ѯGM� */
	CS_QUERY_GM_ACTIVITY
	/** ���뷿���������� */
	CS_ROOM_ACTION
	/** ����һ�������ʼ� */
	CS_SEND_VOICE_MAIL
	/** ��ѯ�Լ��ĻỰ�б� */
	CS_QUERY_CONVERSATION_LIST
	/** ͬ�������赸������Ϣ */
	CS_BATTLE_DANCE_SYNC_INFO
	CS_QUERY_MALL
	CS_QUERY_MALL_VERSION
	/** ��ѯ�����ʼ��б� */
	CS_QUERY_VOICE_MAIL_LIST
	/** ��ȡ֪ͨ���� */
	CS_QUERY_NOTIFICATION_LIST
	/** ɾ��֪ͨ */
	CS_DELETE_NOTIFICATION
	/** ����id��ѯ�̳���Ʒ��Ϣ */
	CS_QUERY_MALL_BY_IDS
	/** ɾ�������ʼ� */
	CS_DELETE_VOICE_MAIL
	/** ��ѯ���ֵĽ�����Ϣ */
	CS_QUERY_MUSIC_LOCK_INFO
	/** ����������� */
	CS_APPLY_UNLOCK_MUSIC
	/** ����������� */
	CS_BUY_UNLOCK_MUSIC
	/** �����ѯ���߽�ɫ */
	CS_RANDOM_QUERY_CHARACTER
	/** ��ѯ����Ƿ����� */
	CS_QUERY_ONLINE_CHAR
	/** ��ѯ��Ϸ���� */
	CS_QUERY_ACTIVITY_NOTICE
	/** ������Ƭ��Ϣ */
	CS_SAVE_BUSINESS_CARD_INFO
	/** �ı䶷��Ķ�����Ϣ */
	CS_BATTLE_CHANGE_TEAM
	/** �ͻ��˴��ڵ������б� */
	CS_EXIST_MUSIC_LIST
	/** ��ѯ���а���Ϣ */
	CS_QUERY_RANK_LIST
	/** �����ѯһ����ɫ */
	CS_RAND_QUICK_MATCH_CHAR_LIST
	/** ������� */
	CS_COMPLETE_COURSE_TASK
	/** ��ѯ���ֵ���߷� */
	CS_QUERY_MUSIC_HIGH_SCORE
	/** ͼƬ�Ĳ��� */
	CS_PIC_ACTION
	/** ��ʾͼƬ */
	CS_PIC_SHOW
	/** �ϴ�ͼƬ */
	CS_PIC_UPLOAD
	/** ���䱳�� */
	CS_EXPAND_BAG
	/** ���� */
	CS_DONATE
	/** ��ѯ�ռ��� */
	CS_QUERY_RECIVE_MAIL
	/** �ҵ�������ʷ */
	CS_MY_DONATES
	/** ���յ���������ʷ */
	CS_MY_GIFTS
	/** ��ȡ�ʼ����� */
	CS_GET_REWARD_BY_MAIL
	/** ���������� */
	CS_SIT_DOWN
	/** ������վ�� */
	CS_STAND_UP
	/** ��Ը */
	CS_MAKE_WISH
	/** ��ѯԸ�� */
	CS_QUERY_WISH
	/** ɾ��Ը�� */
	CS_DEL_WISH
	/** ���Ը�� */
	CS_OVER_WISH
	/** �󶨵������ʺ� */
	CS_BIND_3RD_ACCOUNT
	/** ��ѯ�󶨵������ʺ���Ϣ���Ƿ�����Ϸ�а󶨹� */
	CS_QUERY_BIND_3RD_INFO
	/** ���������ʺ� */
	CS_UNBIND_3RD_ACCOUNT
	/** ʹ�ü������콱* */
	CS_USE_ACTIVE_CODE
	/** �����ö���Ҫ�󼤻��� */
	CS_GET_SMS_INVITE_CODE
	/** ���漤���룬�ֻ��� */
	CS_SAVE_SMS_INVITE_CODE
	/** ʹ�ö������뼤���� */
	CS_USE_SMS_INVITE_CODE
	/** ���Ͷ�����֤�� */
	CS_SEND_SMS_VALIDATE_CODE
	/** ��ȡ�������뼤���뽱�� */
	CS_GET_SMS_INVITE_PRIZE
	/** �齱 */
	CS_LOTTERY
	/** ����ʵ��Ը�� */
	CS_REQUEST_HELP_WISH
	/** ��ʾ�ʼ���ϸ���� */
	CS_SHOW_MAIL_INFO
	/** ɾ���ʼ� */
	CS_DEL_MAIL
	/** �鿴ÿ�վ���� */
	CS_QUERY_GM_ACTIVITY_INFO
	/** ��ȡGM����� */
	CS_GET_GM_ACTIVITY_PRIZE
	/** ����ƽ̨�ʺŵ�¼ */
	CS_CHANNEL_USER_LOGIN
	/** ��ҵ���ʱ���� */
	CS_SETTINGS
	/** �������� */
	CS_ITEM_RENEW
	/** �豸��token */
	CS_DEVICE_TOKEN
	/** ���ɳ�ֵ���� */
	CS_GENERATE_ORDER
	/** ��ѯ�ɹ���ֵ���� */
	CS_QUERY_RECHARGE_SUCC_ORDER
	/** ��ʼ�赸ǰ�ı��ݽ��� */
	CS_SHOW_FINISH
	/** ������������ */
	CS_REFRESH_DAILY_COURSE_TASK
	/** ˢ��ͼ����Ʒ�б� */
	CS_REF_CONSTELLATION_ITEMS
	/** ����ǰ����ͼ����Ʒ�б� */
	CS_REQ_CONSTELLATION_ITEMS
	/** �һ�ͼ����Ʒ */
	CS_CONSTELLATION_SWAP_ITEM
	/** �������̳齱 */
	CS_REQ_CONSTELLATION_LOTTERY
	/** �������� */
	CS_SHELVE_COURSE_TASK
	/** ͬ�����̽��� */
	CS_SYNC_COURSE_TASK_PROCESS
	/** ׷�ٺ��� */
	CS_FOLLOW_FRIEND
	/** �������� */
	CS_ACTIVE_COURSE_TASK
	/** ���������Ϣ */
	CS_QUERY_MUSIC_ACTIVITY
	/** ������ */
	CS_UPDATE_MUSIC_RANK
	/** ��ѯ�����б� */
	CS_QUERY_HOT_MUSIC_LIST
	/** ��ѯ��һ��������Ϣ */
	CS_QUERY_NEXT_COURSE
	/** ��ѯ���߿��Գ��۵ļ۸� */
	CS_QUERY_SELL_ITEM_PRICE
	/** �������� */
	CS_SELL_ITEM
	/** ȡ��Կ�׻�б� */
	CS_GET_KEY_ACTIVE
	/** �һ�Կ�� */
	CS_EXCHANGE_ACTIVITY_KEY
	/** ��ս���佻��λ�� */
	CS_EXCHANGE_POS
	/** �����ǩ */
	CS_SAVE_TAG_ID
	/** ���������� */
	CS_DONATE_ITEM
	/** ��ȡ���������б� */
	CS_GET_CONSTELLATION_IDS
	/** ��ѯ��ֵ�����ǻ */
	CS_QUERY_RECHARGE_AND_SUGNIN_INFO
	/** VIP�ȼ�������Ϣ */
	CS_VIP_LEVEL_PRIZE
	/** ���VIP�ȼ�������Ϣ */
	CS_GET_VIP_LEVEL_PRIZE
	/** ��ȡ����� */
	CS_GET_ACTIVITY_PRIZE
	/** ��ȡ�������ַ��Ϣ */
	CS_GET_URL_INFO
	/** ��ҵ��DIY��ť����Ϣ�����ڴ���������� */
	CS_CLICK_DIY_BUTTON
	/** AppStore���� */
	CS_APP_STORE_RATE
	/** ������ */
	CS_CHANNEL_ADDICTION
	/** ׷��ת����Ϣ */
	CS_CONVERSION_TACKING
	/** ѯ���Ƿ���Խ����ս�б�����1.2.5.0����ʾ��С�ڵ�����Ź� */
	CS_REPONSE_WATCH
	/** ����ϴ���Ƭ��ť */
	CS_CLICK_UPLOAD_PIC_BUTTON
	/** ����ϴ�ͷ��ť */
	CS_CLICK_UPLOAD_HEAD_BUTTON
	/** Ĥ���������*/
	CS_GUILD_WORSHIP
	/** ��ѯ�����б� */
	CS_QUERY_GUILD_LIST
	/** ��ѯ�ҵ�������Ϣ */
	CS_QUERY_MY_GUILD_INFO
	/** ��ѯ�ҵ����ų�Ա�б� */
	CS_QUERY_GUILD_MEM_LIST
	/** �ų���ѯ�����б� */
	CS_QUERY_APPLY_LIST
	/** �ų������������ */
	CS_ALLOW_JOIN_GUILD
	/** �ų��޸Ĺ��� */
	CS_MODIFY_NOTICE
	/** ת���ų� */
	CS_TRANSFER_DEGREE
	/** �޳���Ա */
	CS_GUILD_KICK_PLAYER
	/** �������������б� */
	CS_ADD_APPLY_LIST
	/** ��Ա�˳����� */
	CS_QUIT_GUILD
	/** �������� */
	CS_GUILD_CREATE
	/** ��Ҹ��� */
	CS_CHANGE_CHAR_NAME
	/** ��ѯ����������б� */
	CS_MY_APPLY_GUILD_LIST
	/** �ų��ܾ�������� */
	CS_GUILD_REUSE_APPLY
	/** ���ȡ������������� */
	CS_GUILD_REMOVE_APPLY
	/** ��ѯ�ռ��һ����Ϣ */
	CS_GET_COLLECT_EXCHANGE_INFO
	/** �һ��ռ������ */
	CS_GET_COLLECT_EXCHANGE_PRIZE
	/** �ų������������ */
	CS_INVITE_JOIN_GUILD
	/** ���ͬ��������� */
	CS_AGREE_JOIN_GUILD
	/** ���ͻ����Ƿ���Ҫ���� */
	CS_CHECK_CLIENT_UPDATE
	/** ��ȡ�ʼ���ҳ��С */
	CS_GET_MAIL_PAGE_SIZE
	/** ��ø������� */
	CS_NEAR_QUERY_CHARACTER
	/** ���µ���λ����Ϣ */
	CS_UPDATE_GEO_INFO
	/** ����ģʽС��Ϸͬ�� */
	CS_LOVERS_GAME
	/** �������� */
	CS_CHANGE_TEAM
	/** ��ȡ�������� */
	CS_GET_POP_LEVEL_PRIZE
	/** ��ʼ������ */
	CS_NEXT_WEDDING_STEP
	/** ��һ���������� */
	CS_TOUCH_FRIEND
	/** ��һ����¼���� */
	CS_TOUCH_RECORDS
	/** ���ؽ����Դ */
	CS_FINISH_LOAD_WEDDING_RESOURCE
	/** ������� */
	CS_ADD_CLOSE_FRIEND
	/** ͬ����Ӻ��� */
	CS_ACCEPT_CLOSE_FRIEND
	/** �������ѹ�ϵ���� */
	CS_SAVE_RELATIONSHIP
	/** ������������ */
	CS_SAVE_MOOD_WORDS
	/** ����pose */
	CS_SAVE_POSE
	/** �һ�� */
	CS_GET_COMPOSE_ACTIVITY
	/** �һ�����Զһ�����Ʒ */
	CS_GET_COMPOSE_ACTIVITY_DETAIL
	/** �һ���汾 */
	CS_COMPOSE_ACTIVITY_VERSION
	/** ��������������Ϣ */
	CS_GET_CLOSE_FRIEND_INFOS
	/** ����ɾ������ */
	CS_REQ_DELETE_CLOSE_FRIEND
	/** �����л */
	CS_WEDDING_THANK
	/** �������� */
	CS_GET_ACTIVITY_COURSE_TASK
	/** ����ǩ�� */
	CS_GUILD_SIGN_IN
	/** ���ž��� */
	CS_GUILD_DONATE
	/** ��ѯ�����б� */
	CS_SEARCH_GUILD_LIST
	/** ��ȡ������� */
	CS_GET_CLOSE_FRIEND_GIFT
	/** ��Ϊ���� */
	CS_BE_MY_LOVER
	/** ͬ���Ϊ���� */
	CS_ACCEPT_LOVER
	/** ��ȡ������Ϣ */
	CS_LOVER_INFO
	/** ��ȡ������ */
	CS_SPECIAL_DAYS
	/** ����������ļ */
	CS_GUILD_WORLD_INVITE
	/** �����̳ǰ����� */
	CS_BIND_EMAIL
	/** ��ȡ����У���� */
	CS_BUY_POINT_ITEM
	/** ����ȷ�� */
	CS_POINT_ORDER_CHECK
	/** ��ѯ���� */
	CS_QUERY_POINT_ORDER
	/** ��ȡ��������֤�� */
	CS_EMAIL_CHECK_CODE
	/** �����̳Ƕ������� */
	CS_POINT_ORDER_APPEAL
	/** ��ȡ��� */
	CS_TAKE_RING
	/** �����б� */
	CS_YEARS_OF_MARRIED
	/** ��� */
	CS_DIVORCE
	/** �������ܹ��һ��Ļ������� */
	CS_SERVER_POINT_LIMIT
	/** ����ƽ̨�ĵ�½��֤��Ϣ */
	CS_AGENT_USER_LOGIN
	/** SOHAƽ̨��ֵ�ɹ��ͻ��˵��÷�������Ϣ */
	CS_SOHA_ORDER_SUCCESS
	/** �ϻ���ʣ������� */
	CS_SLOT_PRIZE_POOL
	/** �ϻ�����ʼ�齱 */
	CS_SLOT_DO_DRAW
	/** ���Ÿ��� */
	CS_CHANGE_GUILD_NAME
	/** ��ʱ����� */
	CS_LIMIT_SALE_ACTIVITY
	/** ��ʱ��������� */
	CS_LIMIT_SALE_ACTIVITY_ITEM
	/** ��ʱ��������߹��� */
	CS_LIMIT_SALE_ACTIVITY_BUY
	/** ���û� */
	CS_BIND_USER_NAME
	/** ѡ���ɫ */
	CS_SELECT_CHAR
	/** ���������б� */
	CS_GUILD_TASK_LIST
	/** ���Ž����� */
	CS_ACCEPT_GUILD_TASK
	/** ���������� */
	CS_FINISH_GUILD_TASK
	/** ��ȡ���Ž��� */
	CS_TAKE_GUILD_REWARD
	/** �ɽ����������� */
	CS_GUILD_ACCEPT_TASK_IDS
	/** ���Ž����б� */
	CS_ALL_GUILD_REWARDS
	/** ��ȡ���ӻ����� */
	CS_TAKE_SLOT_PRIZE
	/** ʹ�õ������� */
	CS_USE_ITEM_CONDITION
	/** ��ȡ��ʱ�齱�Ļ */
	CS_GET_TIMING_LOTTERY
	/** ��ȡ��ʱ�齱�Ĵ��� */
	CS_GET_FREE_LOTTERY_COUNT
	/** �����ȼ������б� */
	CS_CHAR_AND_POPULARITY_REWARDS
	/** ��ȡ�����ȼ����� */
	CS_TAKE_CHAR_AND_POPULARITY_REWARDS
	/** ��ѯ���ؽ�����Ϣ */
	CS_CHAPTER_OPER_INFO
	/** ƥ�䴳�ط��� */
	CS_RAND_JOIN_CHAPTER_ROOM
	/** �鿴���佱�� */
	CS_LOOK_TREA_BOX
	/** ��ѯ�����̵���Ʒ */
	CS_QUERY_MYSTERY_ITEM
	/** ���������̵���Ʒ */
	CS_BUY_MYSTERY_ITEM
	/** ˢ�������̵���Ʒ */
	CS_RAND_MYSTERY_ITEM
	/** �������̵��� */
	CS_OPEN_MYSTERY_COL	
	/** ����������Ϣ */
	CS_REQ_COURSE_TASK_INFOS
	/** ����ˢ��������� */
	CS_REFRESH_RAND_COURSE_TASK	
	/** ����Ѳ���½���Ϣ */
	CS_REQ_TOUR_CHAPTER_INFO
	/** ����Ѳ�ݹؿ���ϸ��Ϣ */
	CS_REQ_TOUR_RAID_DETAIL
	/** ���·���Ѳ�ݹؿ���Ϣ */
	CS_UPDATE_ROOM_TOUR_RAID
	/** ����ͨ����Ϣ */
	CS_REQ_ANNOUNCE_INFO
	/** ����ʼͨ�� */
	CS_REQ_START_ANNOUNCE
	/** ����ˢ��ͨ����ȴʱ�� */
	CS_REFRESH_ANNOUNCE
	/** ��������ͨ����� */
	CS_ADD_ANNOUNCE_TIMES
	/** ����ˢ��ͨ���̵� */
	CS_REFRESH_ANNOUNCE_SHOP
	/** ��������ͨ��������� */
	CS_ADD_ANNOUNCE_COST
	/** ��Ϸ�ڻ��� */
	CS_CHANGE_GAME_LINE
	/** ����ɾͽ�����Ϣ */
	CS_REQ_ACHIEVE_PROCESS_INFO
	/** ����ɾ���ϸ��Ϣ */
	CS_REQ_ACHIEVE_DETAIL_INFO
	/** ��ȡ�ɾͽ��� */
	CS_GET_ACHIEVE_PRIZE
	/** һ����ȡ�ɾͽ��� */
	CS_GET_ALL_ACHIEVE_PRIZE
	/** �������ƶ� */
	CS_CLICK_MOVE
	/** ����ϳ���Ϣ */
	CS_REQ_COMPOSE_INFO
	/** ����ϳɵ��� */
	CS_REQ_COMPOSE_ITEM
	/** ����������� */
	CS_REQ_EVOLVE_ITEM
	/** ��ѯѲ����������״̬��Ϣ */
	CS_GET_TOUR_STAR_PRIZE_STATUS
	/** ��ȡѲ���������� */
	CS_GET_TOUR_STAR_PRIZE
	/** Ѳ�ݲ������� */
	CS_STEP_IN_TOUR_TRAP
	/** �����˱�����Ϣ */
	CS_REQ_IMPROVISE_INFO
	/** �����˱���������� */
	CS_REQ_IMPROVISE_RAND_TASKS
	/** �����˱��ݴ��� */
	CS_BUY_IMPROVISE_PLAY_COUNT
	/** �������ͨ�����˱��� */
	CS_QUICK_PASS_IMPROVISE_TASK
	/** �����˱��ݶһ��̵���Ϣ */
	CS_REQ_IMPROVISE_SHOP
	/** �һ����˱����̵���Ʒ */
	CS_BUY_IMPROVISE_SHOP_ITEM
	/** ���ü��˱��ݶһ���Ϣ */
	CS_RESET_IMPROVISE_SHOP
	/** �����������Ϣ */
	CS_REQ_BADGE_BAG_INFO
	/** ж�»��� */
	CS_PUT_OFF_BADGE
	/** ���ϻ��� */
	CS_PUT_ON_BADGE
	/** ������½�����Ϣ */
	CS_REQ_BADGE_UNLOCK_INFO
	/** ����ѵ����Ϣ */
	CS_REQ_TRAIN_INFO
	/** ����ʼѵ�� */
	CS_REQ_START_TRAIN
	/** ������ѵ������ */
	CS_BUY_TRAIN_COUNT
	/** ��ѯ��Ϸ����Ϣ */
	CS_QUERY_GAME_LINE_INFO	
	/** ��ʾ��Ƭָ����Ϣ�������� */
	CS_SHOW_BUSINESS_CARD_DETAIL
	/** ��ѯ�ϰ����Ϣ */
	CS_QUERY_ON_RANK_INFO
	/** ����Է����ڵĳ�Ա���������� */
	CS_REQUEST_ROOM_ACTION
	/** ��Ӧ���������� */
	CS_RESPONSE_ROOM_ACTION
	/** ����ʱ������Ϣ */
	CS_REQ_FASHION_BAG_INFO
	/** Ӧ��ʱ����Ϣ */
	CS_APPLY_FASHION_INFO
	/** �������³����ز��� */
	CS_WARDROBE_OPER_IN_ROOM
	/** diyȾɫavatar */
	CS_DIY_AVATAR
	/** ��ѯ���а��һ����Ϣ */
	CS_QUERY_TOP_ONE_RANKS
	/** Ĥ�����а��ϰ���� */
	CS_WORSHIP_ON_RANK
	/** ������Ĥ���ϰ������Ϣ */
	CS_QUERY_WORSHIP_ON_RANK_INFOS
	/** ��ѯ����̬��Ϣ */
	CS_QUERY_WEDDING_NOTICES
	/** ����ף���»���� */
	CS_REQ_WEDING_BLESS
	/** ��ѯ�»������Ϣ */
	CS_QUERY_NEWLY_WEDS_INFO
	/** ��ѯ���񷿼� */
	CS_QUERY_WEDDING_ROOMS
	/** �����ö��Լ��Ļ���̬ */
	CS_REQ_TOP_SELF_WEDDING_NOTICE
	/** ����������Ϣ */
	CS_GET_CLOSE_FRIEND_INFO
	/** �������ѹ�ϵ������Ϣ */
	CS_REQ_CLOSE_FRIEND_GIFT_INFOS
	/** �������¹�ϵ������Ϣ */
	CS_REQ_LOVER_GIFT_INFOS
	/** ��ȡ���½��� */
	CS_GET_LOVER_GIFT
	/** ʹ�����ѻ����¼�Ĺ�ϵ�ȼ��ƺ� */
	CS_USE_RELATIONSHIP
	/** ��Ӧ��� */
	CS_ACCEPT_LOVER_PROPOSAL
	/** ������ټ���ͨ�淿�� */
	CS_QUICK_JOIN_ANNOUNCE_ROOM
	/** �л��㳡���� */
	CS_CHANGE_GROUND_AREA
	/** ����㳡��Ϊ״̬ */
	CS_ENTER_GROUND_ACTION_STATUS
	/** ����㳡��������������Ϣ */
	CS_REQ_GROUND_ACTION_OPEN_INFO
	/** �����ȭ��Ϸ */
	CS_INVITE_FINGER_GUESS
	/** ��Ӧ��ȭ���� */
	CS_RESP_INVITE_FINGER_GUESS
	/** ��ȭ��Ϸ���� */
	CS_FINGER_GUESS_CHOICE
	/** �㳡�赸��ʹ������ */
	CS_USE_CHAMPAGNE
	/** ���������̵���Ϣ */
	CS_QUERY_GUILD_SHOP
	/** ���������̵���Ʒ */
	CS_BUY_GUILD_ITEM
	/** ˢ���̵���Ʒ */
	CS_REFRESH_GUILD_SHOP
	/** ��ѯ�㳡���� */
	CS_QUERY_GROUND_ROOMS
	/** ���������������� */
	CS_HANDLE_ALL_GUILD_APPLY
	/** ����ˢ��ͨ���̵����� */
	CS_REFRESH_ANNOUNCE_SHOP_COST
	/** ����ˢ��ͨ����ȴʱ������ */
	CS_REFRESH_ANNOUNCE_COST
	/** ���������̻� */
	CS_REQ_WED_FIREWORKS
	/** ����ǩ����Ϣ */
	CS_REQ_SIGN_IN_INFO
	/** ����ǩ�� */
	CS_REQ_SIGN_IN
	/** ����ͨ���̵���Ʒ */
	CS_REQ_ANNOUNCE_SHOP_ITEMS
	/** ������ͨ���̵���Ʒ */
	CS_BUY_ANNOUNCE_SHOP_ITEM
	/** ��ѯ�����ȼ�����״̬ */
	CS_POP_LEVEL_PRIZED_STATUS
	/** ���󷢺�� */
	CS_REQ_MAKE_LUCKY_MONEY
	/** ��������� */
	CS_REQ_GET_LUCKY_MONEY
	/** �����ҷ����ĺ�� */
	CS_REQ_LUCKY_MONEY_SEND
	/** �������յ��ĺ�� */
	CS_REQ_LUCKY_MONEY_RECEIVE
	/** ��������ϸ��Ϣ */
	CS_REQ_LUCKY_MONEY_DETIAL
	/** д��ͨ�������淨ֵ */
	CS_ANNOUNCE_SPECIAL_VAL
	/** ����ʼͨ��showTime */
	CS_REQ_START_ANNOUNCE_SHOW_TIME
	/** ���������Ȫ�㳡���� */
	CS_REQ_UNLOCK_ACTION
	/** ��������ȡ��Ϣ */
	CS_REQ_LUCKY_MONEY_RECEIVERS
	/** ������������Ϣ */
	CS_REQ_FIRST_LUCKY_MONEY_INFO
	/** ���鲥����� */
	CS_STORY_PLAY_FINISH
	/** ������̻� */
	CS_REQ_LIGHT_FIRE_WORKS
	/** �����װ��װ��Ϣ */
	CS_REQ_AVATAR_SUIT
	/** �����װ��װ��Ϣ */
	CS_SAVE_AVATAR_SUIT
	/** ���Ϸ�װ��װ */
	CS_PUT_ON_AVATAR_SUIT
	/** ������Ȩ���ų� */
	CS_REQ_APPOINT_GUILD_DEPUTY
	/** ���������ų� */
	CS_REQ_CANCLE_GUILD_DEPUTY
	/** ɾ��ʱ����Ϣ */
	CS_DEL_FASHION_INFO
	/** ����ʱ����Ϣ */
	CS_RENEW_FASHION_INFO
	/** ɾ����װ��װ */
	CS_DROP_AVATAR_SUIT
	/** ������Ѳ�ݴ��� */
	CS_REQ_BUY_TOUR_TIMES
	/** �ͻ�����login_gate��֤ͨ����ƾ���ص�gameSession����Ϸ����֤��¼ */
	CS_TOKEN_LOGIN
	/** �����Ӧid�Ĺ㳡��Ϣ */
	CS_QUERY_GROUND_ROOM_BY_IDS
	/** �����Ӧid�ľ���������Ϣ */
	CS_QUERY_DANCE_ROOM_BY_IDS
	/** �����Ӧid��������Ϣ */
	CS_QUERY_GUILD_BY_IDS	
	/** �������� */
	CS_GET_ACTIVITY_DETAIL
    /** �����б� */
	CS_GET_ACTIVITY_LIST	
	/** ��ȡ�Ŀ�꽱�� */
	CS_GET_ACTIVITY_TARGET_PRIZE
	/** �л��˺� */
	CS_CHANGE_ACCOUNT	
	/** ����˺����� */
	CS_CHECK_ACCOUNT_TYPE
	/** �����޸ķ����� */
	CS_CHANGE_ROOM_TITLE
	/** ת�÷��� */
	CS_TRANSFER_ROOM_LEADER
	/** �������״̬Ϊ��ս */
	CS_SET_ROOM_WATCHER
	/** ����Ҵӹ�ս��Ϊ��ս */
	CS_SET_WATCHER_TO_DANCER
	/** �����Լ���׼��״̬ */
	CS_SET_ROOM_READY_STATUS
	/** ��ֵ������֤ */
	CS_CHECK_RECHARGE_RESULT
	/** ����������� */
	CS_QUERY_CUR_FRIEND_AMOUNT
	/** ��ʾ��������Ϣ */
	CS_SHOW_PLAYER_APPEARANCE_INFO
	/** ��ѯĬ�ϲʵ�id */
	CS_QUERY_DEFAULT_LOTTERY_ID
	/** ��ѯ����ʹ�õĲʵ� */
	CS_QUERY_CAN_USE_LOTTERY_ITEMS
	/** �ͷ�����־ */
	CS_CLIENT_LOG
	/** �����ϴ�ͼƬ��ȡtoken*/
	CS_PICTURE_UPLOAD_TOKEN
	/** ����ɾ����Ƭ��ȡtoken*/
	CS_PICTURE_DELETE_TOKEN
	/** ����ĳ��ҵ������� */
	CS_DONATE_ITEM_COUNT
	/** �ܾ��������� */
	CS_REFUSE_FRIEND_APPLY
	/** ��ȡ�׳���Ϣ*/
	CS_GET_FIRST_RECHARGE_INFO
	/** ������ȡ�׳佱��*/
	CS_FIRST_RECHARGE_AWARD
	CS_END
	//�ͻ��˷�����������Ϣ�������
	
	//�����������ͻ�����Ϣ���忪ʼ,��Χ
	SC_BEGIN=2000
	/** �û���¼�󷵻ص��ʺ���Ϣ */
	SC_USER_INFO
	/** ϵͳ��Ϣ */
	SC_SYSTEM_INFO
	/** ��ʼ׼�������赸 */
	SC_START_PREPARE_DANCE
	/** �赸������Ϣ */
	SC_DANCE_STATUS
	/** ��������˹��˵�������Ϣ */
	SC_CHAT
	/** ���¿�ʼ�������赸 */
	SC_RESTART_DANCE
	/** �˳����� */
	SC_EXIT_ROOM
	/** �赸��ս����ʱͳ�Ƶķ������� */
	SC_DANCE_MARK_RESULT
	/** �˳���Ϸ�����½��뷿�� */
	SC_RETURN_DANCE_ROOM
	/** ������ʱ��У�� */
	SC_SERVER_PING
	/** �赸��ͬ���赸��Ϣ */
	SC_SYNC_DANCE_INFO
	/** �赸��ͬ��������Ϣ */
	SC_SYNC_MARK_INFO
	/** ���������Ϣ */
	SC_OPER_RESULT
	/** ������Ʒ��Ϣ */
	SC_BAG_ITEMS_INFO
	/** ����avatar��Ϣ */
	SC_BODY_ITEMS_INFO
	/** ׼����ϣ���ʼ�赸��Ϣ */
	SC_START_DANCE
	/** ���þ������߽�� */
	SC_PUT_ATHLETICS_ITEM_RESULT
	/** ʹ����Ʒ��� */
	SC_USE_ITEM_RESULT
	/** ��ǰ���õľ���������Ϣ */
	SC_ATHLETICS_ITEM_INFO
	/** ���ӱ�����Ʒ */
	SC_ADD_BAG_ITEMS
	/** ɾ����Ʒ */
	SC_DELETE_ITEM
	/** ��ֵ�ײ���Ϣ */
	SC_APP_PURCHASE_INFOS
	/** ��ʼ������ɫ */
	SC_CREATE_NEW_CHAR
	/** ����½�ɫ�� */
	SC_NEW_CHAR_RAND_NAME
	/** ������ɫ��� */
	SC_CREATE_CHAR_RESULT
	/** ���˺Ž�� */
	SC_TEMP_USER_BIND_RES
	/** ��ɫ���Ը��� */
	SC_UPDATE_CHAR_PROPERTY
	/** ���� */
	SC_WHISPER
	/** ������Ʒ��Ϣ */
	SC_UPDATE_ITEM_INFO
	/** ϲ������װ��Ϣ */
	SC_FAVORITE_AVATARS_INFO
	/** ���ּ�¼��Ϣ */
	SC_MUSIC_RECORD_INFO
	/** ��������Ϣ */
	SC_SERVER_INFO
	/** ��������Ϣ */
	SC_CHECK_BIND_USER_PASSWD
	/** ��ȡ������¼��ȡ������Ϣ�Ľ�� */
	SC_GET_LOGIN_AWARD_INFO_RESULT
	/** ��ȡ��¼�����Ľ�� */
	SC_GET_LOGIN_AWARD_RESULT
	/** �����Ƿ���û����ȡ���Ľ�����Ϣ */
	SC_NEW_LOGIN_AWARD
	/** ��ȡ���ߵ�ȯ������Ϣ */
	SC_GET_OFFLINE_COUPON_RESULT
	/** ��ҷ��ͷ�����Ϣ */
	SC_SEND_FEED_BACK_RESULT
	/** ��ҷ��ͷ�����Ϣ */
	SC_GAME_NOTICE
	/** ��ѯ��Ϸ���������б� */
	SC_USER_PRIZE_INFOS
	/** ���µ�GM����������Ϣ */
	SC_NEW_GM_PRIZES
	/** ��Ϊ������Ϣ */
	SC_BECOME_FRIEND
	/** �����б� */
	SC_FRIEND_LIST
	/** ��ʾ����avatar */
	SC_SHOW_BUSINESS_CARD_INFO_RESULT
	/** ɾ������ */
	SC_DELETE_FRIEND
	/** ��Ӻ��ѵ�֪ͨ */
	SC_ADD_FRIEND_NOTIFY
	/** ����������֪ͨ */
	SC_FRIEND_STATE_NOTIFY
	/** ����������Ϣ */
	SC_DANCE_ROOM_INFOS
	/** ���뷿����Ϣ */
	SC_JOIN_DANCE_ROOM
	/** ���¸��� */
	SC_UPDATE_ROOM_MUSIC
	/** ��ӳ�Ա */
	SC_ADD_ROOM_MEMBER
	/** ������֪ͨ */
	SC_DANCE_ROOM_NOTICE
	/** ���������Ϣ */
	SC_INVITE_PLAYER_INFOS
	/** �������뷿�� */
	SC_INVITED_JOIN_DANCE_ROOM
	/** ��������������Ϣ */
	SC_SEARCH_INVITE_PLAYER_INFOS
	/** �˳����������� */
	SC_EXIT_INVITE_ROOM
	/** ���·�������״̬ */
	SC_UPDATE_ROOM_LOCK_STATE
	/** ���ѵ�charId�б� */
	SC_FRIEND_CHAR_ID_LIST
	/** ���ߺ����б� */
	SC_ONLINE_FRIEND_LIST
	/** ׼���赸״̬ */
	SC_PREPARE_DANCE_STATUS
	/** ͬ���������ֽ��� */
	SC_ROOM_LOAD_MUSIC_PROCESS
	/** ��ʼ�������� */
	SC_BEGIN_LOAD_MUSIC
	/** ��б� */
	SC_GM_ACTIVITY_LIST
	/** ��ʼ����������ʱ */
	SC_BEGIN_COUNT_DOWN
	/** ���뷿���ڹ㲥���� */
	SC_ROOM_ACTION
	/** ���ٿ�ʼ���뷿����Ϣ */
	SC_QUICK_DANCE_ENTER_INFO
	/** ��ȡGM�������� */
	SC_GET_GM_ACTIVITY_PRIZE_RESULT
	/** �Ự�б� */
	SC_CONVERSATION_LIST
	/** һ���Ự�е������ʼ��б� */
	SC_VOICE_MAIL_LIST
	/** ���赸��Ϣ */
	SC_BATTLE_DANCE_SYNC_INFO
	/** ���赸�׶η��� */
	SC_BATTLE_DANCE_PART_RESULT_INFO
	/** ���赸�����׶� */
	SC_BATTLE_DANCE_COMPETE
	/** ���赸���� */
	SC_BATTLE_DANCE_FINISH_INFO
	SC_MALL_ITEMS_INFO
	SC_MALL_VERSION
	SC_MALL_XXXXXXXXXXX
	/** ���������ʼ��Ľ�� */
	SC_SEND_VOICE_MAIL_RESULT
	/** ֪ͨ�б� */
	SC_NOTIFICATION_LIST
	/** ���Ͷ������������ */
	SC_BATTLE_DANCE_INPUT_INFO
	/** ����id��ѯ�̳���Ʒ��Ϣ�ķ��ؽ�� */
	SC_MALL_INFOS
	/** �������ֵĽ�����Ϣ */
	SC_MUSIC_LOCK_INFO
	/** ���ֽ�����Ϣ */
	SC_UNLOCK_MUSIC
	/** �����ѯ���߽�ɫ */
	SC_RANDOM_CHARACTER
	/** ��Ϸ���� */
	SC_ACTIVITY_NOTICE
	/** ������Ƭ��Ϣ�ɹ� */
	SC_SAVE_BUSINESS_CARD_INFO_OK
	/** ����Ķ�����Ϣ */
	SC_BATTLE_DANCE_TEAM_INFO
	/** ���а��б� */
	SC_RANK_LIST
	/** �����ɫ�б����ڿ��ٿ�ʼ����� */
	SC_QUICK_MATCH_CHAR_LIST
	/** ���������Ӧ */
	SC_COMPLETE_COURSE_TASK_RESULT
	/** ���ֵ���߷� */
	SC_MUSIC_HIGH_SCORE
	/** ͼƬ�Ĳ������ */
	SC_PIC_ACTION_RESULT
	/** ͼƬ�б� */
	SC_PICTURES
	/** �ϴ�ͼƬ�ɹ� */
	SC_PIC_UPLOAD_OK
	/** ���䱳����� */
	SC_EXPAND_BAG_RESULT
	/** ���µ��������ֵ */
	SC_STATURE_MODIFY
	/** ���ͳɹ� */
	SC_DONATE_OK
	/** �ռ������Ϣ */
	SC_RECIVE_MAIL
	/** �ҵ�������Ϣ */
	SC_MY_DONATES
	/** �ҵ�������Ϣ */
	SC_MY_GIFTS
	/** ��ȡ�����ɹ� */
	SC_GET_REWARD_BY_MAIL_OK
	/** ������Ӧ */
	SC_SIT_DOWN
	/** վ����Ӧ */
	SC_STAND_UP
	/** �����ӳ� */
	SC_REPLACE_LEADER
	/** ��Ը�ɹ� */
	SC_MAKE_WISH_OK
	/** ��Ը�б� */
	SC_WISH_LIST
	/** ɾ��Ը�� */
	SC_DEL_WISH_OK
	/** ���Ը�� */
	SC_OVER_WISH_OK
	/** ��ѯ�������ʺŰ���Ϣ */
	SC_QUERY_BIND_3RD_INFO_RESULT
	/** �󶨵������ʺŽ�� */
	SC_BIND_3RD_ACCOUNT_RESULT
	/** �����Լ��İ���Ϣ */
	SC_SELF_BIND_3RD_INFO
	/** ʹ�ü����뷵�ز���״̬ */
	SC_ACTIVE_USE_CODE_RESULT
	/** �������ɵļ����� */
	SC_GET_SMS_INVITE_CODE
	/** �����ֻ��� */
	SC_USE_SMS_INVITE_CODE
	/** �齱��� */
	SC_LOTTERY_RESULT
	/** �����ȼ����� */
	SC_POPULARITY_LEVEL_UP
	/** ������������Ӧ */
	SC_INPUT_ROOM_PASSWORD
	/** ֪ͨ�����û������ʼ� */
	SC_NEW_MAIL
	/** ��ʾ�ʼ�����ϸ��Ϣ */
	SC_SHOW_MAIL_INFO
	/** ��ɫ���� */
	SC_LEVEL_UP
	/** ɾ���ʼ��ɹ� */
	SC_DEL_MAIL_OK
	/** ����GM������Ϣ */
	SC_GET_GM_ACTIVITY_INFO
	/** ��ȡgm�������� */
	SC_GET_GM_ACTIVITY_PRIZE
	/** ����gm��콱֪ͨ */
	SC_NEW_AWARD_NOTIFICATION
	/** ���ɳ�ֵ���� */
	SC_GENERATE_ORDER
	/** ��ֵ�ɹ��������б� */
	SC_RECHARGE_SUCC_ORDER_LIST
	/** ����cookie */
	SC_SET_COOKIE
	/** ��ʱ�󶨵��˺����� */
	SC_BIND_USER_NAME
	/** ֪ͨ�ͻ��˿�ʼ�赸ǰ�ı��� */
	SC_BEGIN_SHOW
	/** ����������Ӧ */
	SC_ACCEPT_COURSE_TASK
	/** ������������ɹ� */
	SC_REFRESH_DAILY_COURSE_TASK_RESULT
	/** ��װ */
	SC_CHANGE_AVATAR
	/** ����ͼ����Ʒ�б� */
	SC_CONSTELLATION_ITEMS
	/** �һ���Ʒ��� */
	SC_CONSTELLATION_SWAP_ITEM
	/** �齱�õ�����Ʒid */
	SC_REQ_CONSTELLATION_LOTTERY
	/** �������� */
	SC_SHELVE_COURSE_TASK_RESULT
	/** ͬ�����̽��� */
	SC_SYNC_COURSE_TASK_PROCESS
	/** �������̽�� */
	SC_ACTIVE_COURSE_TASK_RESULT
	/** �������а���Ϣ */
	SC_QUERY_MUSIC_ACTIVITY
	/** �񵥸���ʱ���� */
	SC_UPDATE_MUSIC_RANK_INFO
	/** ֪ͨ�ͻ����˳� */
	SC_EXIT_CLIENT
	/** ���뱻�ޣ������뱻���� */
	SC_ADD_ACTION_LIST
	/** ���ͻ��˰汾�� */
	SC_CHECK_CLIENT_VERSION
	/** �����б� */
	SC_HOT_MUSIC_LIST
	/** ���򵥸����߳ɹ� */
	SC_BUY_SINGLE_ITEM_SUCC
	/** ���ɴ�ͳģʽ������ */
	SC_GENERATE_TRADITIONAL_INPUT
	/** ��������Ϣ */
	SC_SERVER_MESSAGE
	/** ��xx����ɾ����֪ͨ��Ϣ */
	SC_DELETED_BY_FRIEND
	/** ��һ�����̵���Ϣ */
	SC_NEXT_COURSE
	/** ��Ծ��������Ϣ */
	SC_ACTIVE_LEVEL_UP
	/** ����ƽ̨3kwan����token��Ϣ */
	SC_LOCAL_TOKEN
	/** ������Ϣ���� */
	SC_DONTE_GIFT
	/** ����״̬ͬ�� */
	SC_DANCE_INPUT_STATUS
	/** ȫ��֪ͨ */
	SC_WORLD_NOTICE
	/** ���߿ɳ���ļ۸� */
	SC_SELL_ITEM_PRICE
	/** ȡ�öһ�Կ�׻�б��� */
	SC_GET_KEY_ACTIVE
	/** ͬ���������µ�avatar */
	SC_SYNC_BODY_AVATAR
	/** ����������״̬��֪ͨ */
	SC_FRIEND_ONLINE_STATUS
	/** ���䵹��ʱʣ������ */
	SC_ROOM_COUNT_DOWN_PROCESS
	/** ͬ������ʱ�� */
	SC_SYNC_DANCE_PROCESS
	/** ���������б� */
	SC_GET_CONSTELLATION_IDS
	/** VIP�ȼ�������Ϣ */
	SC_VIP_LEVEL_PRIZE
	/** ���VIP�ȼ�������Ϣ */
	SC_VIP_GET_LEVEL_PRIZE
	/** VIP�ȼ�������Ϣ */
	SC_VIP_LEVEL_UP	
	SC_URL_INFO	
	SC_APP_STORE_RATE	
	/** ������ʾ��Ϣ */
	SC_ACTIVITY_UPDATE
	/** vip������Ϣ */
	SC_VIP_PRIZE_UPDATE
	/** ѯ���Ƿ���Խ����ս�б�����1.2.5.0����ʾ��С�ڵ�����Ź� */
	SC_ASK_CAN_WATCH
	/** �����б��� */
	SC_GUILD_LIST_RESULT
	/** �ҵ�������Ϣ */
	SC_MY_GUILD_INFO_RESULT
	/** �ҵ����ų�Ա�б� */
	SC_GUILD_MEM_LIST_RESULT
	/** �ų���ѯ�����б��� */
	SC_APPLY_LIST_RESULT
	/** ���ų�Ա���� */
	SC_GUILD_MEMBER_JOIN
	/** ���ų�Ա�˳� */
	SC_GUILD_MEMBER_QUIT
	/** ֪ͨ�ͻ���ɾ�����ر����token */
	SC_RECHARGE_RESULT
	/** ��ѯ�ռ��һ����Ϣ���� */
	SC_COLLECT_EXCHARNGE_ACTIVITY_INFO
	/** ���ƶһ���� */
	SC_GET_COLLECT_EXCHANGE_PRIZE_RESULT
	/** ������������� */
	SC_APPLY_GUILD_RESULT
	/** Ĥ��������ҳɹ�*/
	SC_GUILD_WORSHIP_SUCC
	/** �ų�ת�� */
	SC_GUILD_TRANSFER_LEADER
	/** ��Ա��Ϣ���� */
	SC_GUILD_UPDATE_MEMBER_STATUS
	/** �ʼ���ҳ��С */
	SC_MAIL_PAGE_SIZE
	/** ���������б� */
	SC_NEAR_CHARACTER
	/** ����ģʽ��ʼ�� */
	SC_LOVERS_MODE_INIT
	/** ����ģʽС��Ϸͬ�� */
	SC_LOVERS_GAME
	/** ͬ�������ڶ�����Ϣ */
	SC_SYNC_TEAM_INFO
	/** ��ȡ�������������Ϣ */
	SC_GET_POP_LEVEL_PRIZE_RESULT
	/** ��һ����¼ */
	SC_TOUCHING_RECORDS
	/** ��鲽�� */
	SC_WEDDING_STEP
	/** ���������Ϊ���� */
	SC_ADD_CLOSE_FRIEND_REQUEST
	/** ������ѽ�� */
	SC_ADD_CLOSE_FRIEND_RESULT	
	/** ������ѽ�� */
	SC_COMPOSE_ACTIVITY
	/** ������ѽ�� */
	SC_COMPOSE_ACTIVITY_DETAIL
	/** ������ѽ�� */
	SC_ASK_WEDDING_WITNESS
	/** ���� */
	SC_DANCE_BURST
	/** ������ѽ�� */
	SC_COMPOSE_ACTIVITY_VESION
	/** ���������б� */
	SC_CLOSE_FRIEND_INFO
	/** ɾ�����ѽ�� */
	SC_DELETE_CLOSE_FRIEND_RESULT
	/** ɾ���������� */
	SC_DELETE_CLOSE_FRIEND_NOTIFY
	/** ���������� */
	SC_GET_ACTIVITY_COURSE_TASK_RESULT	
	SC_SAVE_RELATIONSHIP_RESULT	
	SC_SAVE_MOOD_MESSAGE_RESULT
	/** ��������������е����� */
	SC_UPDATE_GUILD_PROPERTY
	SC_SAVE_POSE_RESULT	
	/** ͬ������Ľ��� */
	SC_SYNC_TOUCH_HEART_PROCESS
	/** �����Ϊ���� */
	SC_BE_MY_LOVER_REQUEST
	/** ���������� */
	SC_BE_LOVERS_RESULT
	/** ���Ż�����Ϣ���� */
	SC_UPDATE_GUILD_BASE_INFO
	/** ������ */
	SC_SPECIAL_DAYS
	/** ������Ϣ */
	SC_LOVER_INFO
	/** �������� */
	SC_GUILD_LEVEL_UP
	/** ��ѯ���ֶ��� */
	SC_POINT_ORDER
	/** ���ɰ�������֤�� */
	SC_EMAIL_CHECK_CODE
	/** ������ */
	SC_BIND_EMAIL
	/** ���ɶ�����֤�� */
	SC_POINT_ORDER_ID
	/** ȷ������ */
	SC_POINT_ORDER_CHECK
	/** ���ӷ�����Ч */
	SC_ADD_COUPLE_EFFECT
	/** ȡ��������Ч */
	SC_CANCEL_COUPLE_EFFECT
	/** ���ֶ������� */
	SC_POINT_ORDER_APPEAL
	/** ��ȡ����� */
	SC_TAKE_RING
	/** ��ȡ����� */
	SC_YEARS_OF_MARRIED
	/** ��ȡ����� */
	SC_CURRENT_INTIMACY
	/** �������һ��������� */
	SC_SERVER_POINT_LIMIT
	/** �ϻ���ʣ������� */
	SC_SLOT_PRIZE_POOL
	/** �ϻ����齱��� */
	SC_SLOT_DO_DRAW
	/** ��ʱ����� */
	SC_LIMIT_SALE_ACTIVITY
	/** ��ʱ��������� */
	SC_LIMIT_SALE_ACTIVITY_ITEM
	/** ��ʱ��������߹��� */
	SC_LIMIT_SALE_ACTIVITY_BUY
	/** ���û����� */
	SC_BIND_USER_NAME_RES
	/** �����û��б���ͻ��� */
	SC_USER_CHAR_LIST
	/** ���������б� */
	SC_GUILD_TASK_LIST
	/** ���������� */
	SC_ACCEPT_GUILD_TASK
	/** ���������� */
	SC_FINISH_GUILD_TASK
	/** ��ȡ���Ž��� */
	SC_TAKE_GUILD_REWARD
	/** ���ſ���ȡ����id */
	SC_GUILD_ACCEPT_TASK_IDS
	/** �������Ž��� */
	SC_ALL_GUILD_REWARDS
	/** ͬ������������� */
	SC_GUILD_SYNC_COURSE_TASK_PROCESS
	/** ʹ�õ������� */
	SC_USE_ITEM_CONDITION
	/** ǩ������ */
	SC_SIGN_IN_AWARDS
	/** ǩ��״̬ */
	SC_SIGN_IN_STATE
	/** ǩ����� */
	SC_SIGN_IN_RESULT
	/** ��ʱ�齱� */
	SC_GET_TIMING_LOTTERY
	/** ��ʱ�齱��ʼ� */
	SC_START_FREE_LOTTERY
	/** ��ʱ�齱ʣ����� */
	SC_GET_FREE_LOTTERY_COUNT
	/** �����ȼ������б� */
	SC_CHAR_AND_POPULARITY_REWARDS
	/** ���ؽ������� */
	SC_CHAPTER_INFO_RESULT
	/** ����鿴�������� */
	SC_TREA_BOX_RESULT
	/** ������Ѵ������� */
	SC_CHAPTER_BUY_TIMES_RESULT
	/** �����̵���Ʒ���� */
	SC_MYSTERY_ITEM	
	/** ��������������Ϣ */
	SC_ALL_COURSE_TASKS
	/** ����������Ϣ */
	SC_UPDATE_COURSE_TASK
	/** ɾ������ */
	SC_DEL_COURSE_TASK
	/** ˢ�����������Ϣ */
	SC_REFRESH_RAND_COURSE_TASK	
	/** Ѳ���½���Ϣ */
	SC_TOUR_CHAPTER_INFO
	/** ����Ѳ�ݹؿ���Ϣ */
	SC_UPDATE_TOUR_RAID
	/** Ѳ�ݹؿ���ϸ��Ϣ */
	SC_TOUR_RAID_DETAIL
	/** ����Ѳ�ݷ�����Ϣ */
	SC_UPDATE_ROOM_TOUR_RAID
	/** Ѳ���赸ͨ����Ϣ */
	SC_TOUR_DANCE_PASS_INFO
	/** Ѳ���赸ͬ������ֵ */
	SC_SYNC_TOUR_DANCE_CHEER_INFO
	/** ���ž��� */
	SC_PLAY_STORY
	/** ͨ����Ϣ */
	SC_ALL_ANNOUNCE_INFOS
	/** ��ʼͨ�� */
	SC_START_ANNOUNCE
	/** ͨ���赸������Ϣ */
	SC_ANNOUNCE_DANCE_EXTRA_INFOS
	/** ����ͨ��������� */
	SC_ADD_ANNOUNCE_COST
	/** ͨ��ͬ������ֵ */
	SC_SYNC_ANNOUNCE_CHEER_INFO
	/** ˢ��ͨ����ȴʱ��ɹ� */
	SC_REFRESH_ANNOUNCE_SUCC
	/** ����ͨ������ɹ� */
	SC_ADD_ANNOUNCE_TIMES_SUCC
	/** ˢ��ͨ���̵�ɹ� */
	SC_REFRESH_ANNOUNCE_SHOP_SUCC
	/** ��Ϸ�ڻ��߽�� */
	SC_CHANGE_GAME_LINE
	/** �ɾͽ�����Ϣ */
	SC_ACHIEVE_PROCESS_INFO
	/** �ɾ���ϸ��Ϣ */
	SC_ACHIEVE_DETAIL_INFOS
	/** ���³ɾ���ϸ��Ϣ */
	SC_UPDATE_ACHIEVE_DETAIL_INFOS
	/** �������ƶ� */
	SC_CLICK_MOVE
	/** ���³ɾ��콱״̬ */
    SC_UPDATE_ACHIEVE_PRIZE_STATUS
	/** �ϳ�������Ϣ */
	SC_COMPOSE_CONDITION
	/** ��ϳ���Ϣ */
	SC_ACTIVITY_COMPOSE_INFO
	/** �ϳɵ��߳ɹ� */
	SC_COMPOSE_ITEM_SUCC
	/** �������߳ɹ� */
	SC_EVOLVE_ITEM_SUCC
	/** Ѳ����������״̬��Ϣ */
	SC_TOUR_STAR_PRIZE_STATUS
	/** ������ȡѲ����������״̬ */
	SC_UPDATE_TOUR_STAR_PRIZE_STATUS
	/** ���˱�����Ϣ */
	SC_IMPROVISE_INFO
	/** ���˱���������� */
	SC_IMPROVISE_RAND_TASKS
	/** �����˱��ݴ�����Ϣ */
	SC_BUY_IMPROVISE_PLAY_COUNT_INFO
	/** �ɹ�����ͨ�����˱��� */
	SC_QUICK_PASS_IMPROVISE_TASK_SUCC
	/** ���˱��ݶһ��̵���Ϣ */
	SC_IMPROVISE_SHOP
	/** �ɹ��һ����˱����̵���Ʒ */
	SC_BUY_IMPROVISE_SHOP_ITEM_SUCC
	/** ���ü��˱��ݶһ�������Ϣ */
	SC_RESET_IMPROVISE_SHOP_COST
	/** �ɹ����ü��˱��ݶһ���Ϣ */
	SC_RESET_IMPROVISE_SHOP_SUCC
	/** ���¼��˱���������� */
	SC_UPDATE_IMPROVISE_TASK_STATE
	/** ��������Ϣ */
	SC_BADGE_BAG_INFO
	/** ���»�����Ϣ */
	SC_UPDATE_BADGE_INFO
	/** ���ӻ�����Ϣ */
	SC_ADD_BADGE_INFO
	/** ���½�����Ϣ */
	SC_BADGE_UNLOCK_INFO
	/** ����Э��Ѳ��״̬ */
	SC_UPDATE_ASSIST_TOUR_STATUS
	/** ѵ����Ϣ */
	SC_TRAIN_INFO
	/** ����ѵ��������Ϣ */
	SC_UPDATE_TRAIN_COUNT_INFO
	/** ѵ����� */
	SC_TRAIN_RESULT
	/** ��ѯ��Ϸ����Ϣ */
	SC_GAME_LINE_INFO
	/** ��ʾ��Ƭָ����Ϣ�������� */
	SC_SHOW_BUSINESS_CARD_DETAIL
	/** �����а��������Ϣ */
	SC_ON_RANK_INFO
	/** �������������Լ������� */
	SC_BE_REQUESTED_ROOM_ACTION
	/** �Է����ڵĳ�Ա���������󱻾ܾ� */
	SC_REQ_ROOM_ACTION_BE_REFUSED
	/** ʱ������Ϣ */
	SC_FASHION_BAG_INFO
	/** Ӧ��ʱ����Ϣ�ɹ� */
	SC_APPLY_FASHION_INFO_SUCC
	/** ����ʱ����Ϣ */
	SC_ADD_FASHION_INFO
	/** �������³����ز��� */
	SC_WARDROBE_OPER_IN_ROOM
	/** ��һ����� */
	SC_TOUCH_RESULT
	/** ��������¼�֪ͨ */
	SC_UPDATE_PLAYER_EVENT_NOTICE
	/** �����ڹ㲥���¸�����Ϣ */
	SC_BROADCAST_BADGE_UPDATE_INFO
	/** ���а��һ����Ϣ */
	SC_TOP_ONE_RANKS
	/** �ɹ�Ĥ�����а��ϰ���� */
	SC_WORSHIP_ON_RANK_SUCC
	/** ��Ĥ���ϰ������Ϣ */
	SC_WORSHIP_ON_RANK_INFOS
	/** Ⱦɫ��Ϣ */
	SC_DIY_AVATAR
	/** ����̬��Ϣ */
	SC_WEDDING_NOTICES
	/** ף���»���޳ɹ� */
	SC_WEDING_BLESS_SUCC
	/** �»������Ϣ */
	SC_NEWLY_WEDS_INFO
	/** ��ѯ���񷿼� */
	SC_WEDDING_ROOM_INFOS
	/** ����������Ϣ�� ֻ����һ��������ϸ��Ϣ */
	SC_CLOSE_FRIEND_INFOS
	/** ���ѹ�ϵ������Ϣ */
	SC_CLOSE_FRIEND_GIFT_INFOS
	/** ��ȡ���ѽ����ɹ� */
	SC_GET_CLOSE_FRIEND_GIFT_SUCC
	/** ���¹�ϵ������Ϣ */
	SC_LOVER_GIFT_INFOS
	/** ��ȡ���½����ɹ� */
	SC_GET_LOVER_GIFT_SUCC
	/** ʹ�����ѻ����¼�Ĺ�ϵ�ȼ��ƺ� */
	SC_USE_RELATIONSHIP_RESULT
	/** ������ɹ� */
	SC_REQ_WEDDING_SUCC
	/** ������� */
	SC_LOVER_PROPOSAL
	/** �����ö��Լ��Ļ���̬�ɹ� */
	SC_TOP_SELF_WEDDING_NOTICE_SUCC
	/** ������ҹ㳡����״̬ */
	SC_UPDATE_GROUND_AREA
	/** ����㳡��Ϊ״̬ */
	SC_ENTER_GROUND_ACTION_STATUS
	/** ���¹㳡��������������Ϣ */
	SC_UPDATE_GROUND_ACTION_INFO
	/** ������Ȫ������Ϣ */
	SC_UPDATE_SPRING_REWARD
	/** ˢ����ȪȪ�� */
	SC_REFRESH_SPRING
	/** �������ȭ��Ϸ */
	SC_BE_INVITED_FINGER_GUESS
	/** ��ʼ��ȭ��Ϸ */
	SC_START_FINGER_GUESS
	/** ��ȭ��Ϸ��� */
	SC_FINGER_GUESS_RESULT
	/** ���¹㳡�赸������ֵ */
	SC_UPDATE_GROUND_HOT_BAR
	/** �㳡�赸��ʹ�����ĳɹ� */
	SC_USE_CHAMPAGNE_SUCC
	/** �����̵���Ϣ*/
	SC_GUILD_SHOP
	/** ������Ʒ�ɹ�*/
	SC_GUILD_BUY_ITEM_SUCC
	/** ���������ȼ����� */
	SC_GUILD_HONOR_LEVEL_UP
	/** �㳡������Ϣ */
	SC_GROUND_ROOM_INFOS
	/** �����л�ɹ� */
	SC_WEDDING_THANK_SUCC
	/** ����ף���ɹ� */
	SC_DYNAMIC_WEDDING_BLESS_SUCC
	/** ����ף���ɹ� */
	SC_WEDDING_BLESS_SUCC
	/** ˢ��ͨ����ȴʱ������ */
	SC_REFRESH_ANNOUNCE_COST
	/** ˢ��ͨ���̵����� */
	SC_REFRESH_ANNOUNCE_SHOP_COST
	/** ������̻� */
	SC_WED_FIREWORKS
	/** ͨ���̵���Ʒ��Ϣ */
	SC_ANNOUNCE_SHOP_ITEMS
	/** ����ͨ���̵���Ʒ�ɹ� */
	SC_BUY_ANNOUNCE_ITEM_SUCC
	/** ǩ����Ϣ */
	SC_SIGN_IN_INFO
	/** ǩ���ɹ� */
	SC_SIGN_IN_SUCC
	/** ����ͨ����Ϣ */
	SC_UPDATE_ANNOUNCE_INFOS
	/** �����ȼ�����״̬ */
	SC_POP_LEVEL_PRIZED_STATUS
	/** �ȴ������޸�ͨ�� */
	SC_CHANGE_ANNOUNCE_IN_ROOM
	/** �ҷ����ĺ��������Ϣ */
	SC_SEND_LUCKY_MONEY_BASIC_INFO
	/** ���յ�����Ļ�����Ϣ */
	SC_RECEIVE_LUCKY_MONEY_BASIC_INFO
	/** �������� */
	SC_GET_LUCKY_MONEY_RESULT
	/** �����ϸ��Ϣ */
	SC_LUCKY_MONEY_DETIAL_INFO
	/** ������Һ������ */
	SC_UPDATE_LUCKY_MONEY_PROP
	/** ��ʼͨ��showTime */
	SC_START_ANNOUNCE_SHOW_TIME
	/** ��Ȫ�㳡���������ɹ� */
	SC_REQ_UNLOCK_ACTION_SUCC
	/** ����Ȫʣ��ʱ����Ϣ */
	SC_SPRING_LEFT_TIMES
	/** �����ȡ��Ϣ */
	SC_LUCKY_MONEY_RECEIVER_INFOS
	/** ����������Ȫ״̬ */
	SC_UPDATE_SPRING_LOVER
	/** �յ��º�� */
	SC_RECEIVE_LUCKY_MONEY
	/** ���º������ */
	SC_UPDATE_LUCKY_MONEY_COUNT
	/** �����������Ϣ */
	SC_FIRST_LUCKY_MONEY_INFO
	/** ��ȭ��Ϸ��ɣ��㲥�����������ˣ� */
	SC_FINGER_GUESS_FINISH
	/** Ѳ�ݾ��鲥��״̬ */
	SC_TOUR_STORY_PLAY_STATUS
	/** �ȴ�������Ѳ�ݾ��鲥�� */
	SC_WAIT_TOUR_STORY_PLAY
	/** ���̻�ɹ� */
	SC_LIGHT_FIRE_WORKS_SUCC
	/** ��װ��װ��Ϣ */
	SC_AVATAR_SUIT
	/** �����װ��װ��Ϣ�ɹ� */
	SC_SAVE_AVATAR_SUIT_SUCC
	/** ����ʹ���е���װ */
	SC_UPDATE_USING_AVATAR_SUIT
	/** ��װ��װ���� */
	SC_AVATAR_SUIT_UNLOCK
	/** ���³�ԱȨ�޳ɹ�*/
	SC_UPDATE_GUILD_DEGREE
	/** ɾ��ʱ����Ϣ�ɹ� */
	SC_DEL_FASHION_SUCC
	/** ����ʱ����Ϣ�ɹ� */
	SC_RENEW_FASHION_SUCC
	/** ɾ����װ��װ��Ϣ�ɹ� */
	SC_DROP_AVATAR_SUIT_SUCC
	/** ���·��䳡����Ϣ */
	SC_UPDATE_ROOM_SCENE
	/** ����Ѳ������ */
	SC_UPDATE_TOUR_PROP
	/** ����ģʽ�������ݣ� ��һϵ�е�����Ƭ����ɣ�������T̨��д��������淨 */
	SC_GENERATE_DYNAMIC_INPUT
	/** ��Ӧid�Ĺ㳡��Ϣ */
	SC_QUERY_GROUND_ROOM_BY_IDS_RESPONSE
	/** ��Ӧid�ľ���������Ϣ */
	SC_QUERY_DANCE_ROOM_BY_IDS_RESPONSE
	/** ��Ӧid���赸��Ϣ */
	SC_QUERY_GUILD_BY_IDS_RESPONSE
	/** ��б� */
	SC_ACTIVITY_LIST
	/** ����� */
	SC_ACTIVITY_DETAIL
	/** �ɹ���ȡ�Ŀ�꽱�� */
	SC_GET_ACTIVITY_TARGET_PRIZE_SUCC
	/** ���»Ŀ�������Ϣ */
	SC_UPDATE_ACTIVITY_PROCESS_INFOS
	/** �л��˺ųɹ� */
	SC_CHANGE_ACCOUNT_SUCC
	/** �˺����� */
	SC_ACCOUNT_TYPE
	/** ���ۻ��� */
	SC_RETRIEVE_WORDS
	/** �޸ķ����� */
	SC_CHANGE_ROOM_TITLE
	/** ת�÷����ɹ� */
	SC_TRANSFER_ROOM_LEADER
	/** ���³�Ա��׼��״̬ */
	SC_UPDATE_ROOM_READY_STATUS
	/** �������� */
	SC_CUR_FRIEND_AMOUNT
	/** ��ʾ��������Ϣ */
	SC_SHOW_PLAYER_APPEARANCE_INFO
	/** ����ʹ�õĲʵ���Ϣ */
	SC_CAN_USE_LOTTERY_ITEMS
	/** Ĭ�ϲʵ�id */
	SC_DEFAULT_LOTTERY_ID
	/** ��ǰ������id */
	SC_CURRENT_NOVICE_GUIDE
	/** ��ʱ�̳ǹ���ɹ� */
	SC_BUY_LIMIT_MALL_ITEM_SUCC
	/** �ϴ���Ƭ������token��Ϣ*/
	SC_PICTURE_TOKEN
	/** Vip�볡��ʾ��Ϣ */
	SC_VIP_ENTER_NOTICE
	/** ����ɾ����Ƭ�󣬷��ص�token����Ϣ*/
	SC_PICTURE_DELETE_TOKEN
	/** ����ĳ��ҵ������� */
	SC_DONATE_ITEM_COUNT
	/** ���������Ϣ */
	SC_SEARCH_PLAYER
	/** ���Ѹ���֪ͨ */
	SC_FRIEND_CHANGE_NAME
	/** ��Ҹ��ĸ���ǩ�� */
	SC_UPDATE_MOOD_MESSAGE
	/** �����׳���Ϣ*/
	SC_FIRST_RECHARGE_INFO
	/** �����׳��콱��Ϣ*/
	SC_GET_FIRST_RECHARGE_PRIZE_SUCC
	SC_END
	//�����������ͻ�����Ϣ�������
}
