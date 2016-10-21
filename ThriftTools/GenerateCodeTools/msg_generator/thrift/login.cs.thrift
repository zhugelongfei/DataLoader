include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

//���ٵ�¼��Ϣ
struct CSQuickLoginMsg{
	1: string fVal
	2: string deviceId
	3: string macId
	4: string deviceType
	5: string deviceVersion
	6: string version
	7: string deviceMode
	8: i16 resourceVersion
	9: string device
	
	100: string gsId
}

//ʹ���û��������¼��Ϣ
struct CSUserPasswdMsg{
	1: string name
	2: string passwd
	3: string deviceId
	4: string macId
	5: string deviceType
	6: string deviceVersion
	7: string version
	8: string deviceMode
	9: string fVal
	10: i16 resourceVersion
	11: string device
	12: bool reconnect
	13: string gsId
}

/** �ͻ��˽�������sdk��֤��¼�� �޸�login_gateʱ���޸ĸ���Ϣ�� ɾ�������ֶ� */
struct CSChannelUserLoginMsg{
    /** �豸uuid */
	1: string deviceId
	2: string macId
	3: string deviceType
	4: string deviceVersion
	/** �豸ƽ̨ */
	5: string devicePlatform
	/** �豸�ͺ� */
	6: string deviceModel
	/** �ͻ��˰汾�� */
	7: string version
	8: string fVal
	/** ��¼����Ϸ��id���޸�login_gateʱɾ����*/
	9: string gsId
	/** ������¼��sdk���� */
	10: struct.ChannelNeteaseLoginParam neteaseParam
}

/** �ͻ�����login_gate��֤ͨ����ƾ���ص�gameSession����Ϸ����֤��¼ */
struct CSTokenLoginMsg{
    /** �豸uuid */
	1: string deviceId
	2: string macId
	3: string deviceType
	4: string deviceVersion
	/** �豸ƽ̨ */
	5: string devicePlatform
	/** �豸�ͺ� */
	6: string deviceModel
	/** �ͻ��˰汾�� */
	7: string version
	/** ��Ӫ���� */
	8: string appChannel
	/** ��¼���� */
	9: string channelName
	/** ����sdk��õ�ƽ̨ */
	10: string channelPlatform
	/** ��ҵ�¼���ƶ��豸�ţ�ͨ��UniSDK�ṩ�Ľӿڻ�ȡ */
	11: string channelUdid
	/** ��Ϸ�Լ�ά����session */
	12: string gameSession
	/** �Ƿ�������� */
	13: optional bool isReconnect
	/** ��¼����Ϸ��id */
	14: optional string gsId
	/** ������Ӫ�� */
	15: string networkIsp
	/** �������� */
	16: string networkType
	17: i32 deviceHeight
	18: i32 deviceWidth
	/** root Խ����� 0Ϊ��Խ��(��׿root),1ΪԽ��(��׿rootroot),2Ϊģ���� */
	19: i16 rootMark
	/** sdk �汾*/
	20: string sdkVersion
	/** cpid*/
	21: string cpid
}

/** Temp user bind normal user passportId. */
struct CSTempUserBindMsg{
	/** normal user name */
	1: string userName
	/** normal user password */
	2: string pswd
}

/** �л��˺� */
struct CSChangeAccountMsg{

}

/** ����˺����� */
struct CSCheckAccountTypeMsg{

}

struct CSChannelAddictionMsg{
	1: bool isAddiction
}


struct CSAgentUserLoginMsg{
	1: string deviceId
	2: string macId
	3: string deviceType
	4: string deviceVersion
	5: string version
	6: string deviceMode
	7: struct.AgentSohaLoginParam sohaParam

	30: string fVal
	31: i16 resourceVersion
	32: string device
	
	100: string gsId
}

struct CSBindUserNameMsg{
	1: string userName
	2: string pswd
	3: i64 bindCharId
}

struct CSSelectCharMsg{
	1: i64 selectCharId
}

/** ��ѯ��Ϸ����Ϣ */
struct CSQueryGameLineInfo{
	/** �汾�� */
	1: i32 version
}

/** ��Ϸ�ڻ��� */
struct CSChangeGameLineMsg{
	/** �л�����Ŀ����Ϸ��id */
	1: string targetGameServerId
}

