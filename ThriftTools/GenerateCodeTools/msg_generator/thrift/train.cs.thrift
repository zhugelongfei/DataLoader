include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** ����ѵ����Ϣ */
struct CSReqTrainInfo{
	/** ��0��ʼ�� �յ�������������Ϣ���°汾 */
	1: i32 version
}

/** ����ʼѵ�� */
struct CSReqStartTrain{
    /** ְҵETrainOccupation */
    1: byte occupation
}

/** ������ѵ������ */
struct CSBuyTrainCount{

}