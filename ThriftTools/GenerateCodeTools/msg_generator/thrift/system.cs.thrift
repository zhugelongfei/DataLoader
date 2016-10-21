include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

//ping
struct CSClientPingMsg{

}

struct CSPurchaseTokenMsg{
	/** purchase token */
	1: string token
	2: string identifier
	3: string transcationId
}

struct CSRunStateMsg{
	/** 0-background 1-foreground */
	1: byte state
}

struct CSReportChatMsg{
	/** 1-private 2-world 3-speaker */
	1: byte scope
	2: i64 reportedCharId
	3: string content
	4: bool sound
}

struct CSDeviceTokenMsg{
	1: string token
}


/** ���鲥����� */
struct CSStoryPlayFinish{
	1: i32 storyId 
}

struct CSGetUrlInfoMsg{

}

struct CSConversionTackingMsg{
	
}

struct CSCheckClientUpdateMsg{
	
}
/**�ͷ�����־��Ϣ */
struct CSClientLogMsg{
  /**������־ */
  1: optional struct.GuildeLog guildeLog 
  /** ���ܰ�ť��־*/
  2: optional struct.PerformanceLog performanceLog
  /** �ϴ���Ƭ��־*/
  3: optional struct.UploadPhotoLog uploadPhotoLog

}
/** �ͷ��������ϴ���Ƭ ��ȡtoken����Ϣ*/
struct CSPictureUploadTokenMsg{

}
/**�ͷ�������ɾ����Ƭ ��ȡtoken����Ϣ */
struct CSPictureDeleteTokenMsg{
	/** ��Ƭ��key*/
	1: string key
}