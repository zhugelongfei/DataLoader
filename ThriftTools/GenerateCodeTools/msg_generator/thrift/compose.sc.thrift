include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** �ϳ����� */
struct ComposeCondInfo {
   1: i32 condMsgId
   /** �Ƿ��������� */
   2: bool isFit
}

/** ��ϳ���Ϣ */
struct ActivityComposeInfo {
   /** �˵�� */
   1: string activityDesc
   /** ���ʼʱ�� */
   2: i32 startTime
   /** �����ʱ�� */
   3: i32 endTime
   /** �Ƿ��������� */
   4: ComposeCondInfo condInfo
}

/** �ϳ�������Ϣ */
struct SCComposeCondition{
    /** 1-��װ 2-��Ʒ 3-���� */
    1: byte itemType
	/** key-messageId val-������Ϣ */
	2: map<i32, ComposeCondInfo> condInfos
}

/** ��ϳ���Ϣ */
struct SCActivityComposeInfo{
    /** 1-��װ 2-��Ʒ 3-���� */
    1: byte itemType
	2: i32 version
	/** key-messageId val-������Ϣ */
	3: map<i32, ActivityComposeInfo> composeInfos
}

/** �ϳɵ��߳ɹ� */
struct SCComposeItemSucc{

}

/** �������߳ɹ� */
struct SCEvolveItemSucc{

}