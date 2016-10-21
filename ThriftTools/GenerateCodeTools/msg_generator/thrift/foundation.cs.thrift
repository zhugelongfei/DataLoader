include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

//��ѯ���ּ�¼��Ϣ
struct CSQueryMusicRecordMsg{
	1: byte mode
	2: i16 musicId
	3: byte level
	4: i32 startIndex
	5: i32 endIndex
}

//�������
struct CSWhisperMsg{
	1: string	content
	2: string	soundNameKey
	3: string	targetName
	4: i64 targetCharId
}

/** ����㲥*/
struct CSBroadcastChatMsg{
	/** �������͵�����*/
	1: byte	scope
	/** ��������*/
	2: optional string	content
	/** ��������key*/
	3: optional string	soundNameKey
	/** �Զ���������*/
	4: optional i32 sendAutoSpeakerIndex
	
}

struct CSTakeSlotPrizeMsg{

}

//�󶨵������ʺ�
struct CSBind3rdAccountMsg{
	1: struct.BindAccountType bindType
	2: i64 bind3rdAccountId
	3: bool force
}

struct CSUnBind3rdAccountMsg{
	1: struct.BindAccountType bindType
}

//��ѯ�������ʺ�����Ϸ�а���Ϣ
struct CSQueryBind3rdInfoMsg{
	1: struct.BindAccountType bindType
	/** 3rd account */
	2: list<i64> accountIds
	3: i32 index
}

struct CSGenerateOrderMsg{
	/**�۸�λ */
	1: i32  priceID
	/**֧������ */
	2: string payChannel
	/** ��ֵ�������*/
	3: optional struct.RechargeLuckyMoney rechargeLuckyMoney

}

struct CSQueryRechargeSuccOrderMsg{
	
}

struct CSCheckRechargeResultMsg{

	/** cp�����ţ�Ҳ����Ϸ������*/
	1: string sn
	/** ��ҹ�����Ϸ��Ʒid*/
	2: i32 goodsId
	/**֧������ */
	3: string payChannel;
	/** �������*/
	4: string extraParam
		
}