namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto

enum NumberType{
	COUPON
	IB
	FREE_IB
	EXP
	/** ����ֵ */
	POP
	/** ͨ���*/
	ANNOUNCE_IB	
	/** �ͻ��˳�ʼ��ʹ�� */
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
	SEND_EMAIL_CODE_FAILE   //������֤�뵽����ʧ��
	EMAIL_CODE_TIMEOUT      //������֤���Ѿ���ʱ
	EMAIL_CODE_ERROR        //������֤���������
	SEND_ORDER_CODE_FAILE   //������֤�뷢��ʧ��
	ORDER_CODE_TIMEOUT      //������֤�볬ʱ
	ORDER_CODE_ERROR        //������֤��У�����
	JNET_RECHARGE_FAILE     //������ֵʧ��
	SEND_CARD_PASSWORD_FAILE  //��ֵ�ɹ������Ƿ��Ϳ��ܵ��������ʧ��
}

enum OperType{
	//�汾���
	VERSION_CHECK
	//����avatar
	CHANGE_AVATAR
	//����avatar
	ADJUST_AVATAR
	//�ӹ��ﳵ����
	BUF_FROM_SHOPCART
	//����ϲ����װ
	SAVE_FAVORITES
	//����ϲ����װ
	PUT_FAVORITES
	//��ȡGM����
	GET_GM_PRIZE
	//�����ֵ��Ϣ
	QUERY_IAP
	//��ֵ
	RECHARGE
	//���������ʼ�
	SEND_VOICE_MAIL
	
}

enum OperResultType{
	FAIL
	SUCC
}

enum VipDiamond{
	RED
}

/** ����̬��Ϣ״̬ */
enum WeddingNoticeState{ 
    /** ������ʼ */
	WED_INIT
	/** ������ */
	WED_START
	/** ��� */
	WED_END
}

/** �������̲��� */
enum WeddingStep{
	/** ��ʼ */
	WEDDING_INIT = 0
	/** ��ʼ */
	WEDDING_START
	/** �����볡 */
	WEDDING_ENTRANCE
	/** �������� */
	WEDDING_SWEAR
	/** ������ָ */
	WEDDING_EXCHANGE_RING
	/** ��ɻ����Ϊ���� */
	WEDDING_BECOME_COUPLE
	/** ��л */
	WEDDING_THANKS
	/** ������ */
	WEDDING_THROW_BALL
	/** ������ */
	WEDDING_PHOTO
	/** ���̻� */
	WEDDING_FIREWORK
	/** ���� */
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

/** ʱ�н��� */
struct FashionPrize{
	1: i32 fashionId
	3: byte validTimeType
}

/** ���½��� */
struct BadgePrize{
	1: i32 badgeId
	3: byte validTimeType
}

/** ���߽��� */
struct ItemPrize{
	/** item template id */
	1: i32 itemId
	2: i32 count
	3: byte validTimeType
	4: i32 remainTime
}

/** ��Ϸ������Ϣ */
struct PrizeInfo{
    /** numberPrizes��moneyPrizes���⣬ ͬʱֻ�����һ�֣� Ϊ�˼���֮ǰ��Ϣ */
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
	/** ʱ����ȨЧ����ͷ���key:style val:id */
	11: optional map<byte, i32> baseFashionIds
}

/** ��װ��Ʒ */
struct AvatarSuitItem {
	/** ��װʵ��id */
	1: i64 instanceId
	/** ��װģ��id */
	2: i32 itemId
}

/** ��װ��װ��Ϣ */
struct AvatarSuitInfo {
	/** ��װ��Ϣ */
	1: list<AvatarSuitItem> suitItems
}

/** ������Ϣ */
struct BadgeInfo{
	/** λ�� */
    1: i16 position
    /** ����id, δ���Ϊ0, ��ʾ���������� */
	2: i32 badgeId
	/** ��Ч��ֹʱ��, 0Ϊ���� */
	3: optional i64 validTime
	/** �Ƿ��»�� */
	4: optional bool isNew
	/** �Ƿ񴩴��� */
	5: optional bool hasPutOn
	/** ���´���ʱ��(s) */
	6: i32 createTime
}

struct UserPrizeInfo{
	1: string reasonInfo
	2: string prizeName
	/** ���� */
	3: optional PrizeInfo prizeInfos
}
struct Picture{
	1:string pic
	/** ������ */
	2:i32 upCount
	/** ����ͼid */
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
	/** �Լ����׻���ֵռ��*1000ȡ�� */
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
	/** ����Ļ��� */
	12: list<BadgeInfo> putOnBadges
	/** ʹ���еĸ���չʾʱ��id key:style val:id */
	13: map<byte, i32> danceFashionIds
}

/** ��������Ϣ */
struct PlayerAppearanceInfo{
    1: PlayerBaseInfo playerBaseInfo
	2: i16 modelId
	3: list<AvatarInfo> avatarInfos
	/** ����Ļ��� */
	4: list<BadgeInfo> putOnBadges
	/** ��ǰ����ֵ�� ��ʾ������ʹ�� */
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
/** ��ֵ�ײ���Ϣ */
struct InAppPurchaseInfo{
	/** �۸�λ*/
	1: i32 id
	/** ����ID*/
	2: string itemId
	/** ���� 0->��ʵשʯ 1->���*/
	3: byte itemType
	/** ��Ʒ����*/
	4: string name
	/** ����*/
	5: string des
	/** שʯ����*/
	6: i32 ib
	/** ����*/
	7: double currency
	/** ��������*/
	8: string currencyType
	/** �����������*/
	9: i32 additionReward
	/** ͼ��*/
	10: string icon
	/** �Ƽ�����*/
	11: bool recommend
	/** ����������*/
	12: string afterByDesc
	/** �Ƽ����� */
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
	/** �����ʾ�������� */
	8: optional string partnerName
	/** �����е����Ƿ�ʹ�� */
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
	/** �����������ʾid */
	4: optional i32 extraTipId
	/** �����е����Ƿ�ʹ�� */
	5: optional bool isBagItemUsing
}

struct BuyItemInfo{
	1: i32 itemId
	2: byte validTimeType
	3: i32 count
	4: AvatarDiyArea diyareas
	5: i32 remainTime //ʣ��ʱ��
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

/** ������������ */
enum CreateRoomType{
	/** ��ͨ���� */
	NORMAL
	/** ���� */
	WEDDING
	/** Ѳ�� */
	CHAPTER
	/** ͨ�� */
	ANNOUNCE
	/** ��Ȫ�㳡 */
	GROUND
}

enum MailType{
	TEXT
	/** �̳����� */
	SHOPING_DONATE 
	REQUEST_WISH
	OVER_WISH
	GIFT
	EXCEPT_GIFT
	SYSTEM_MAIL
	/** ���������� */
	PACK_DONATE		
	/** ������ɫ */
	CREATE_PLAYER 
	/** ���а��ʼ����� */
	RANK_PRIZE    
	/** �������а����ֻ���� */
	MUSIC_PRIZE   
	/** ƽ̨ʹ�ü����� */
	USEWAN_ACTIVECODE	
	/** ʹ����Ϸ�Լ��ļ����� */
	USEGAME_ACTIVECODE 
	/** GM����� */
	GM_ACTIVE_PRIZE   
	/** �û����� */
	USERGRADE_MAIL		
	/** �����л */
	WEDDING_THANK	
	POINT_WALL	
	CHAPTER_PRIZE
	SIGN_IN_AWARD
	/** ȫ���ʼ� */
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
	/** �ʼ����ݶ�������ʾid������0ʱ����content */
	8: i32 contentId
	/** �ʼ����ݶ�������ʾ���� */
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

/** �罻��ϵ���� */
enum RelationType{
	/** ��ͨ���� */
	COMMON_FRIEND
	/**  ���� */
	CLOSE_FRIEND 
	/** ���� */
	LOVERS
}

/** ������Ϣ */
struct JewelryInfo{
	1:i32 itemId
	/** �罻��ϵ���� */
	2:byte relaionType
}

/** ��Ƭ��Ҫ��Ϣ */
struct SimpleBusinessCardInfo{
	1: i64 charId
	2: string name	
	3: byte sex
	4: string headIconId
	/** ���ѹ�ϵ, �޹�ϵΪ-1 */
	5: byte relationType
	/** ���ѹ�ϵֵ�� �����ܶ� */
	6: optional i32 relationVal
	7: optional string location
	8: optional bool open
	9: optional string moodMessage	
	10: optional string moodMessageByVoice	
	11: bool isOnline
	12: optional i32 level
	/** ������ */
	13: optional string guildName
	14: optional i16 tagId
	15: byte vipLevel
	/** ʹ���е���Ƭʱ��id, key:style val:��32λid | ��32λ��Ч�� */
	16: optional  map<byte, i64> cardFashionIds
	17: optional double longitude
	18: optional double latitude
}

/** ��Ƭ��ϸ��Ϣ����������ʹ�ã��������˲�ѯ����ʱ���ٶ�ȡ */
struct BusinessCardInfo{
	1: i64 charId
	2: string name
	/** format yyyy-MM-dd HH:mm:ss timestamp accurate to the second. (1981-06-01 00:00:00)*/
	3: string birthday
	4: byte sex
	5: string headIconId
	/** �������� */
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
	/** ���κм�Ҫ��Ϣ*/
	55: list<JewelryInfo> jewelryInfos
	/** ����ע���� */
	56: i32 beAddedFriends
	/** �罻��ϵ��Ҫ��Ϣ*/
	57: list<SimpleBusinessCardInfo> relationInfos
	58: bool online
	/** ʹ���е���Ƭʱ��id, key:style val:��32λid | ��32λ��Ч�� */
	59: optional map<byte, i64> cardFashionIds
	/** ����Ļ��� */
	60: optional list<BadgeInfo> putOnBadges
	61: i32 fashion
	62: i64 theOneCharId
	/** �û�id, ��ʾ�� */
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

/** �㳡������Ϣ */
struct GroundRoomInfo{
    /** 0-������ 1-������ */
	1: byte lockState
	2: i32 roomId
	3: string title
	4: PlayerBaseInfo leaderBaseInfo
	5: byte curMaleCount
	6: byte curFemaleCount
	7: byte maxMemeberCount
	8: bool	isStick
}

/** �赸������Ϣ */
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
	/** ����Ļ��� */
	13: list<BadgeInfo> putOnBadges
	14: double positionX
	15: double positionY
	16: double positionZ
	/** ʹ���еĸ���չʾʱ��id key:style val:id */
	17: map<byte, i32> danceFashionIds
	/** �㳡����GroundPlayerStatus */
	18: optional byte targetGroundStatus
	/** ��Ϊ״̬GroundActionStatus */
	19: optional byte actionStatus
	/** �㳡����id */
	20: optional i32 objId
	/** �㳡�������� */
	21: optional i32 objParam
	/** ���ּ��ؽ��ȣ�0-100�� */
	22: optional byte musicLoadProcess
	/** �Ƿ�׼���� */
	23: optional bool isReady
}

struct InvitePlayerInfo{
	1: byte sex
	2: i64 charId
	3: string name
	4: string headIconId
	5: byte relation
	/** ʹ���е����ֺ�ͷ���ʱ��id key:style val:id */
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
	/** ���� */
	12: optional PrizeInfo prizeInfos
	13: list<string> paramDesc
}

//GM�����
enum GMActivityType{
	DANCECOMPETION	     //ÿ�վ���
	EXCHANGE             //�һ��
	SPECIALTIMELOGIN     //�ر�ʱ�̵�¼
	FIRSTRECHARGE        //�״γ�ֵ
	RECHARGE	     //�ۼƳ�ֵ
	CONTIREACHGE	     //������ֵ
	CONSUME              //���ĳ��꣬���꣬��һ
	LOGINCONTINUE        //������¼
	LOGINCOUNT	     //�ۼƵ�¼
	COLLECT_EXCHARNGE    //�ռ��һ��
	
}

/** �赸����ֵ��� */
struct DanceCheerValResult{
	1: i64 charId
	2: i32 cheerVal
	/** 0-δͨ�� 1-ͨ�� */
	3: optional byte passStatus
}

//�������
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
	/** ��Ӻ���֪ͨ */
	ADD_FRIEND
	/** ��������֪ͨ */
	GIFT
	/** �Լ������а����֪ͨ����˫����Ѳŷ�֪ͨ�� */
	SELF_RANK
	PIC_LIKE
	/** �ҵ��齱����֪ͨ */
	DROPEGG_LOTTERY
	/** ���̳齱����֪ͨ */
	CONSTELLATION_LOTTERY
	/** ���ż���ܾ�֪ͨ */
	GUILD_ADD_REUSE
	/** ��������֪ͨ */
	GUILD_INVITE
	/** ���½��ɹ� */
	WEDDING_SUCCESS
	/** ������� */
	ADD_CLOSE_FRIEND
	/** �ܾ�������� */
	REFUSE_ADD_CLOSE_FRIEND
	/** İ���˲鿴��Ƭ */
	STRANGER_VIEW_BUSINESS_CARD
	/** ɾ������ */
	DELETE_CLOSE_FRIEND
	/** ��һ�� */
	TOUCH_FRIEND
	/** �������� */
	BE_MY_LOVER
	/** �����㲥 */
	GUILD_BROAD_LEVEL_UP
	/** ���ɹ� */
	DIVORCE_SUCCESS
}

struct Notification{
	1: i64 notificationId
	/** ��������ʾID */
	2: i32 langId
	/** ��������ʾ���� */
	3: list<string> langArgv
	/** ֪ͨ���� */
	4: NotificationType type
	/** ֪ͨ������ز���������Ӻ���֪ͨ�����жԷ���charId */
	5: list<string> notificationArgv
	6: i32 sendTime
	7: string senderHeadIcon
	/** ͷ���ʱ��id */
	8: i16 headerFashionId 
}

struct GuildRankInfo{
	1: string guildName
	2: i32 guildMemberCount
	3: i32 guildLevel
	4: string headIcon
}

struct RankInfo{
    /** ˫�˰񵥶���id */
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
	/** �Ƿ����,�ͻ�������������ݲ�����,����������һ������ */
	5: optional bool isFirstPanel
	/** �ͻ����Լ�����ʹ�� */
	6: optional byte clientParam
}

//�������ֻ���Ա��ѯ�����а�����
struct RankCommonQueryParam{
	1: byte sex
}

enum MallItemCategory{
	SUIT
	HAIR //����
	REAR //����
	EARRING //����
	MAKEUP //��ױ
	BRACELET //����
	GLASSES //�۾�
	ACC //��Ʒ
	GLOVES //����
	RING //��ָ
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

//�󶨵������ʺŵ�����
enum BindAccountType{
	SINA_WEIBO
}

/** ���׵�¼���� */
struct ChannelNeteaseLoginParam{
	/** sdk���ص��û�id������Ϊ���ͺ��ַ��� */
	1: string sdkUId
	/** �����������Ϸid */
	2: string gameId
	/** ����(�ַ������� */
	3: string appChannel
	/** ������ */
	4: string channelName
	/** ƽ̨�� */
	5: string platform
	/** ��ҵ�¼���ƶ��豸�ţ�ͨ��UniSDK�ṩ�Ľӿڻ�ȡ */
	6: string udid
	/** ��ҵ�¼���ֻ�Ӳ��id��ͨ��UniSDK�ṩ�Ľӿڻ�ȡ */
	7: string deviceId
	8: string sessionId
	/** sdk�İ汾 */
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
	/** ���� */
	5: PrizeInfo prizeInfos
	6: byte courseVersion
}

/** ͨ��������Ϣ */
struct PassCond{
	1: i32 messageId
	2: i32 intCount
}

/** ͨ������ */
struct AnnounceData{
	1: i32 announceId
	/** �����ǹ�ֵ */
	2: i32 adviceStarVal
	/** ���� */
	3: PrizeInfo prizeInfo
	/** ���⽱�� */
	4: optional PrizeInfo extraPrizeInfo
	/** ͨ����ȴʱ��(����1970.1.1������) */
	5: optional i32 coldDown
	/** 0-���� 1-���� 2-ģ�� */
	6: byte occupationType
	/** ְҵ�ȼ� */
	7: i16 occupationLvl	
	/** �Ѷ�0-�� 1-��ͨ 2-���� 3-��� */
	8: byte musicLvl
	/** ͨ������ */
	9: list<PassCond> passConds
}

enum RoomChannel{
	FREE
	WEDDING
	/** �ݳ�Ƶ�� */
	PERFORMANCE
	TOUR
	ANNOUNCE
	GROUND
}

enum RefreshType{
	Auto            //�Զ�ˢ��
	Force		//ǿ��ˢ��
}


enum StarItemState{
	Excharge	//�Ѷһ�
	NotExcharge	//δ�һ�
	EnableExcharge //�ɶһ�
	
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
	2: StarItemState itemState //�һ���־-���ø������
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


//�һ�Կ�׻�б�ṹ
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
	3: GuildDegree degree;//ְλ
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

/** �����̳���Ʒ*/
struct GuildShopItem{
	1: i32	id
	2: i32	amountLeft
	3: bool canBuy
}

//����б���Ϣ
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
	/** ���� */
	5: optional PrizeInfo prizeInfos
	6: list<CardItemInfo> cardList
	7: i32 exchangedCount
	8: i32 exchangeTotalCount

}

/** ��������Ƭ����Ϣ */
struct DynamicSegmentInputs{
	/**  һ����������id���� */
	1: list<i32> musicIds;
}

/** ��ͳ����Ƭ����Ϣ */
struct TradSegmentInput{
	/**  ��ͳ����id */
	1: i32 inputId;
	/**  �ؼ����������� */
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
	/** ���� */
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
	/** ˫�˶���id */
	6: i32 poseId
	7: string moodMessageSelf
	8: string voiceMessageSelf
	9: i32 modeId
	10: byte stature
	11: string moodMessageFriend
	12: string voiceMessageFriend
	14: PlayerBaseInfo	playerBaseInfo
	15: list<AvatarInfo> avatarListFriend
	/** ������(ʱ���/1000) */
	16: i32 specialDay
	17: bool isFirstTimeChangeNick
	18: bool isFirstTimeChangePos
	/** ��ǰ�Ƿ����� */
	19: optional bool isOnline
	/** ����Ļ��� */
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

/** �赸����ֵ��ʼ��Ϣ */
struct DanceCheerInitInfo{
	/** s,ss,sss��Ӧ����ֵ */
	1: list<i32> rankCheerVals
	/** ��ʼ����ֵ */
	2: i32 initCheerVal
	/** ����ͨ��������Ϣ */
	3: list<PassCond> extraPassConds
	/** npc��ʼ����ֵ */
	4: optional i32 npcInitCheerVal
	/** npc�ͷż������� */
	5: optional list<i32> npcSkillIds
}

/** �赸ͬ������ֵ��Ϣ */
struct SyncDanceCheerInfo{
	/** �Լ��Ƿ��������ͨ������ */
    1: optional bool selfMatchExtraPassConds
	/** ��ǰ�ܻ���ֵ */
	2: i32 totalCheerVal 
	/** �Լ����׻���ֵռ��*1000ȡ�� */
	3: i32 selfCheerValRatio
	/** npc��ǰ�ܻ���ֵ */
	4: optional i32 npcTotalCheerVal 
}

/** ����ֵͨ��������� */
struct PassCheerCondResult{
	1: list<PassCond> conds
	/** 0-δ���� 1-���� */
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

/** ʱ������ */
enum FashionType{
	/** �������� */
	WORD_CHAT
	/** ��Ƭװ�� */
	BUSINESS_CARD
	/** ����չʾ */
	PERSONAL_SHOW
	/** ��ȨЧ�� */
	SPECIAL_EFFECT
}

/** ʱ�������� */
enum FashionSubType{
	/** ������ɫ */
	NAME_COLOR
	/** ������������� */
	INVITE_ROOM
	/** ͷ���װ�� */
	HEAD_ICON_FRAME
	/** ��Ƭ��װ�� */
	BUSINESS_CARD_FRAME	
	/** ��Ƭ����Ч�� */
	BUSINESS_CARD_BG
	/** ��Ƭ��ɫչʾЧ�� */
	BUSINESS_CARD_ROLE
	/** ����������ɫ */
	CHAT_WORD_COLOR
	/** �������ݿ�װ�� */
	CHAT_BUBBLE
	/** �������װ�� */
	SPEAKER_PANEL
	/** �������� */
	CHAT_EXPRESSION_PKG
	/** �����볡Ч�� */
	DANCE_ENTER_EFFECT
	/** �����볡���� */
	DANCE_ENTER_ACTION
	/** �����ֲ���βЧ�� */
	DANCE_HAND_EFFECT
	/** �����Ų��⻷Ч�� */
	DANCE_FOOT_EFFECT
	/** �ȴ�����DJ̨ */
	DJ_DESK
	/**�������� */
	Max
}

/** �㳡����״̬ */
enum GroundPlayerStatus
{
	/** ������ */
	Free,        
	/** ����Ȫ */
	HotSpring 
	/** ��̨ */
	DanceArea    
}

/** �㳡��Ϊ״̬ */
enum GroundActionStatus
{
	/** ���� */
	None
	/** ��������ҽ����� */
	ActionPlayer   
	/** �����彻���� */
	ActionObject    
	/** ���ھ�̬������ */
	SitObject  
	/** ����Ȫ���� */
	SitSpringPoint   	
	/** ��װ�� */
	ChangeClothes   
	/** ���ڱ������������ */
	BeinvitedAction 
	/** ��ȭ�� */
	FingerGuess
	/** ���������� */
	RichPoint
	/** ���������� */
	PopularityPoint
	/** ���������� */
	CupPoint
	/** �ȼ������� */
	LevelPoint
	/** �̻��� */
	FireWorksArea
	/** ��Ȫ�������� */
	ActionInSpring
}

/** �������*/
enum LuckyMoneyType
{
	/** ���˺�� */
	PERSONAL
	/** ȫ����� */
	ALL_SERVER 
	/** �㳡��� */
	GROUND
	/** ���ź�� */
	GUILD
	/** ������ */
	ROOM
	/** �鷿��� */
	WEDDING_ROOM
}

/** ������Ȫ״̬ */
enum LoverSpringStatus{
	/** ���� */
	JOIN
	/** �˳� */
	EXIT
}

/** �̻����� */
enum FireWorksType{
	/** �ͼ� */
	LOW = 1
	/** �м� */
	MIDIUM
	/** �߼� */
	HIGH
}

/** ���񷿼���Ϣ */
struct WeddingRoomInfo{
	/** ����id */
	1: i32 roomId
	/** ���ɽ�ɫid */
	2: i64 bridegroomId
	/** ���ɽ�ɫ�� */
	3: string bridegroomName
	/** ��������ʱ��id */
	4: i32 bridegroomNameFashion
	/** ����vip�ȼ� */
	5: byte bridegroomVipLvl
	/** ���˶���id */
	6: i32 couplePosId
	/** �����ɫid */
	7: i64 brideId
	/** �����ɫ�� */
	8: string brideName
	/** ��������ʱ��id */
	9: i32 brideNameFashion
	/** ����vip�ȼ� */
	10: byte brideVipLvl
	/** ������ */
	11: string roomName
	/** ��Ա�Ա𣬰�λ��ʾλ�ú��Ա� */
	12: i32 memberSexInfo
	/** ���ɱ�ǩid */
	13: i16 bridegroomTagId
	/** �����ǩid */
	14: i16 brideTagId
}

/** ����̬ */
struct WeddingNotice{
	/** �ö�ʱ��(/1000) */
	1: i32 topTime
	/** ���ɽ�ɫid */
	2: i64 bridegroomId
	/** ���ɽ�ɫ�� */
	3: string bridegroomName
	/** ��������ʱ��id */
	4: i32 bridegroomNameFashion
	/** ���˶���id */
	5: i32 couplePosId
	/** �����ɫid */
	6: i64 brideId
	/** �����ɫ�� */
	7: string brideName
	/** ��������ʱ��id */
	8: i32 brideNameFashion
	/** ����״̬WeddingNoticeState 0-������ʼ 1-������ 1-��� */
	9: byte weddingState
	/** ����ʱ��(/1000) */
	10: i32 createTime
}

/** ��Ϸ���ݷ�ҳ��ѯ���� */
struct CommonDataPageInfoQueryParam {
	/** ÿҳ��ʼ������*/
	1: list<i32> startIndexes
}

/** ��Ϸ����ÿҳid��Ϣ */
struct CommonDataPageIds{
	1: i32 startIndex
	2: list<i64> cacheIds
}

/** ��Ϸ���ݷ�ҳ��Ϣ */
struct CommonDataPageInfos {
	1: list<CommonDataPageIds> pageIds
	/** ��Ϣ���� */
	2: i32 totalSize
	/** ������Ϣ�ܰ汾�� */
	3: optional i16 version
	/** ��δ�����ͻ��˵ģ�������Ҫ���µ���Ʒ��Ϣ */
	4: optional list<MallItem> updateMallItems
	/** ��Ҫ���µ���Ȫ�㳡��Ϣ */
	5: optional list<GroundRoomInfo> updateGroundRoomInfos
	/** ��Ҫ���µľ���������Ϣ */
	6: optional list<DanceRoomInfo> updateDanceRoomInfos
	/** ��Ҫ���µ�������Ϣ */
	7: optional list<GuildBaseInfo> updateGuildInfos
	/** ��Ҫ���µĻ���̬��Ϣ */
	8: optional list<WeddingNotice> updateWeddingNotices
	/** ��Ҫ���µĻ鷿��Ϣ */
	9: optional list<WeddingRoomInfo> updateWeddingRoomInfos
}

/** �����Ӧid����Ϣ��Ӧ */
struct CommonDataQueryByIdsResponse{
	/** �ͻ������������ */
	1: optional i16 fromType
	/** �ͻ��˴��໺����Ϣ�ܰ汾�� */
	2: optional i16 version
	/** ��Ҫ���µ���Ʒ��Ϣ */
	3: optional list<MallItem> mallItems
	/** ��Ҫ���µ���Ȫ�㳡��Ϣ */
	4: optional list<GroundRoomInfo> groundRoomInfos
	/** ��Ҫ���µľ���������Ϣ */
	5: optional list<DanceRoomInfo> danceRoomInfos
	/** ��Ҫ���µ�������Ϣ */
	6: optional list<GuildBaseInfo> guildInfos
}

/** �����Ӧid����Ϣ���� */
struct CommonDataQueryByIdsParam{
	/** �ͻ���û�л������Ϣid */
	1: list<i64> noCachedIds
	/** �ͻ����л������Ϣid */
	2: optional list<i64> cachedIds
	/** �ͻ������������ */
	3: optional i16 fromType
	/** �ͻ��˴��໺����Ϣ�ܰ汾�� */
	4: optional i16 version
}

/** ����������־ */
struct GuildeLog{
	/** ����������ID*/
	1: string tutorialId
	/** ��������������*/
	2: string tutorialName
	/** ��������������Ϣ*/
	3: string details
	/** ����������ʼʱ��*/
	4: i64 beginTime
	/** ��ɫ�Ŀ�ʼ�ȼ�*/
	5: i32 beginRoleLevel
	/** ��ɫ�Ľ����ȼ�*/
	6: i32 endRoleLevel
	/** ʹ��ʱ�䣬��λs*/
	7: i64 useTime
	/** ���������δ��ɣ�-1����ɣ�1����ʼ ��0��*/
	8: i32 stepType
}
/** ���ܰ�ť��־*/
struct PerformanceLog{
	/** ���ʱ���ڳ��������䡢��Ϸ��*/
	1: string scene
	/** �����ι�������ʱ���¼�ؿ�ID������������¼����ID��*/
	2: i32 sceneId
	/** 0��������1���ر�*/
	3: i32 close
}

/** ��ֵ�����Ϣ*/
struct RechargeLuckyMoney{
	/** ��ֵ������� */
	1: i32 luckyMoneyNumber
	/** ������� */
	2: LuckyMoneyType luckyMoneyType
	/** ������� */
	3: string words;
	/** �պ����ɫid */
	4: i64 charId;
}
/** �ϴ���Ƭ��־*/
struct UploadPhotoLog{
	/** �ϴ���Ƭ�ĵط�����Ϸ����*/
	1: i32 reason
	/** ���ա����ѡ��*/
	2: string source
	/** �ϴ����ͼƬ��ַ�����ʵ�ַ����ֱ�ӿ�����ͼƬ*/
	3: string address
}
/** �׳佱����ȡ״̬*/
enum FirstRechargeAwardState{
	/** û���׳� */
	FRIST_RECHARGE_NO
	/** �׳�û����ȡ���� */
	FRIST_RECHARGE_NOG_GET_AWARD
	/** �׳���ȡ���� */
	FRIST_RECHARGE_GET_AWARD
}

/**���߶��� */
struct ItemObject{
  /** ����id*/
 1: i32 itemId
 /** �������� */
 2: i16 count
}
