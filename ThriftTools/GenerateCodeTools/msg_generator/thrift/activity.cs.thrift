include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

//��ȡ������¼�콱���
struct CSGetLoginAwardInfoMsg{
	
}

//��ȡ������¼����
struct CSGetLoginAwardMsg{
	1: byte whichDay
}

//ʹ�����߻��ֶһ����
struct CSGetOfflineCouponMsg{
	1: i32 score
}

//���ͷ�����Ϣ
struct CSSendFeedBackMsg{
	1: string mobile
	2: string email
	3: string content
}

//��ȡGM����
struct CSGetGMPrizeMsg{
	1: struct.PrizeType prizeType
	2: i64 id
	3: i64 param
}

//��ѯ������Ϣ
struct CSQueryCommonPrizeMsg{
	1: struct.PrizeFieldInfo prizeFieldInfo
}

struct CSQueryGMActivityMsg{
	
}

struct CSQueryActivityNoticeMsg{
	
}

//ʹ�ü������콱
struct CSUseActiveCodeMsg{
	1: string code
}

struct CSGetSMSInviteCodeMsg{
	
}

struct CSSaveSMSInviteCodeMsg{
	1: i64 code
	2: i64 mobile
}

struct CSUseSMSInviteCodeMsg{
	1: i64 code
}

struct CSSendSMSValidateCodeMsg{
	1: i64 mobile
}

struct CSGetSMSInvitePrizeMsg{
	1: i64 mobile
	2: string captcharcode
	3: i64 code
}

/** ��ѯĬ�ϲʵ�id */
struct CSQueryDefaultLotteryId{

}

/** ��ѯ����ʹ�õĲʵ� */
struct CSQueryCanUseLotteryItems{

}

struct CSLotteryMsg{
	1: i32 lotteryItemId
	2: i16 useItemCount
	3: i16 lotteryCount
}

//�鿴gm�
struct CSQueryGMActivityInfoMsg{
	1: struct.GMActivityType type
	2: struct.GMActivitySubType subType
}

//��ѯ��ֵ�����ǻ��Ϣ
struct CSQueryRechargeAndSignInActivityInfoMsg{
	
}


//��ȡÿ�վ��������
struct CSGetGMActivityPrizeMsg{
	1: i16 activityId
}


//ȡ�û�б�
struct CSGetKeyActiveMsg{
}

//�һ�Կ��
struct CSExchangeActivityKeyMsg{
	1: i32 id
	2: i32 count
}

struct CSGetActivityPrizeMsg{
	1: struct.GMActivityType type
	2: struct.GMActivitySubType subType
	3: byte index
}

struct CSGetCollectExchangeInfoMsg{
	1: struct.GMActivityType type
	
}


struct CSGetCollectExchangePrizeMsg{
	1: i16 activityId
	2: byte index
	3: i16 count
}

struct CSGetComposeActivityMsg {
	1: byte index
	2: i16  count
	3: byte type
}

struct CSGetComposeActivityDetailMsg {
	1: i16 activityId
	2: byte index
	
}

struct CSComposeActivityVersionMsg{

}

struct CSGetActivityCourseTaskMsg{
	1:i32 courseId
}

struct CSLimitSaleActivityMsg {

}

struct CSLimitSaleActivityItemMsg {
  1:i32 activityId
}


struct CSLimitSaleActivityBuyMsg {
	1:i32 activityId
	2:i32 itemId
	3:i32 count
}

struct CSGetFreeLotteryCountMsg {
	1:struct.LotteryType type
	2:i32 itemId
}

/** �����׳���Ϣ*/
struct CSGetFirstRechargeInfoMsg{
	/** �汾*/
	1:byte version
}
/** �����ȡ�׳佱����Ϣ*/
struct CSFirstRechargeAwardMsg{

}