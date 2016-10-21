namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc
include "struct.thrift"
struct SCTempUserBindResMsg{
	/** 0-fail 1-succ */
	1: byte result
	/** 0-ilegal uer 1-already bind 2-binded user has char 3-bind fail */	
	2: byte errorCode
}

struct SCCheckBindUserPasswdMsg{
	/** quick login bind user name */
	1: string bindUserName
}

struct SCSetCookieMsg{
	1:string cookie
	2: i64 accountId
}

struct SCExitClientMsg{
	1: byte remainTimes
	2: i32 tipId
}

/** �л��˺ųɹ� */
struct SCChangeAccountSucc{

}

/** ƽ̨��¼���ص�token��Ϣ */
struct SCLocalTokenMsg{
	1: optional string token
	/** sdk���ص��û�id�� ���˺�id */
	2: optional string userId
	/** ��������Ҫ������Կ����360 */
	3: optional string clientSecret
	/** ��Ϸ�Լ�ά����session */
	4: string gameSession
}

struct SCBindUserNameResMsg{/** 0-fail 1-succ */
	1: byte result
	/** 0-ilegal uer 1-already bind 2-binded user has char 3-bind fail */	
	2: byte errorCode
	3: i64 bindCharId;
}
struct SCUserCharListMsg{
	1: i64 bindCharId;
	2: list<struct.SimpleBusinessCardInfo> charList;
}

/** ��Ϸ��״̬ */
enum GameLineStatusType{
	/** ˳�� */
	NORMAL
	/** ��æ */
	BUSY
	/** ӵ�� */
	FULL
	/** ά�� */
	MAINT
}

/** ��Ϸ����Ϣ */
struct GameLineInfo{
    /** ��Ϸ��id */
	1: string serverId
	/** ��Ϸ������ */
	2: string serverName
	/** ��Ϸ��״̬ */
	3: GameLineStatusType status
	/** ����ռ���ޱ���(0-100) */
	4: byte onlineRatio
}

/** ��ѯ��Ϸ����Ϣ */
struct SCGameLineInfo{
	/** �汾�� */
	1: i32 version
	2: list<GameLineInfo> gameLineInfos
}

/** ��Ϸ�ڻ��߽�� */
struct SCChangeGameLineMsg{
	/** ��ҵ�ǰ��Ϸ��id */
	1: string gameServerId
}

/** �˺����� */
struct SCAccountTypeMsg{
    /** �Ƿ�gm */
	1: optional bool isGM
}

