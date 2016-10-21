include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** ѵ��ְҵ���� */
struct TrainOccupationData{
    /** ��ǰ�ȼ� */
	1: i32 level
	/** ��ǰ����ֵ */
	2: i32 exp
}

/** ѵ����Ϣ */
struct SCTrainInfo{
	/** ���¿ͻ��˰汾�� */
	1: i32 version
    /** ��ǰ�ǹ�ȼ� */
	2: i16 starLvl
    /** ����ʣ��ѵ������ */
	3: i16 todayLeftTrainCount
	/** ���칺��ѵ������ */
	4: i16 todayBuyTrainCount
	/** ��ְҵETrainOccupation�ȼ��������� */
	5: map<byte, TrainOccupationData> occuptionDatas
}

/** ����ѵ��������Ϣ */
struct SCUpdateTrainCountInfo{
    /** ����ʣ��ѵ������ */
	1: optional i16 todayLeftTrainCount
	/** ���칺��ѵ������ */
	2: optional i16 todayBuyTrainCount
}

/** ѵ����� */
struct SCTrainResultMsg{
    /** ְҵETrainOccupation */
    1: byte occupation
    /** ��ǰ�ȼ� */
	2: i32 level
	/** ���Ӿ��� */
	3: i32 occuptionAddExp
	/** ��������(��Ҫ/100) */
	4: optional i32 critVal
	/** ��ǰ�ǹ�ȼ� */
	5: optional i16 starLvl
}