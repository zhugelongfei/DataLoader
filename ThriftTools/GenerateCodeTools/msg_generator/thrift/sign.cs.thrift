include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** ����ǩ����Ϣ */
struct CSReqSignInInfoMsg{
	/** ǩ����Ϣ�汾�� */
	1: i32 version
}

/** ����ǩ�� */
struct CSReqSignIn{
	/** ǩ���·� */
    1: byte month
	/** ǩ���ڼ��� */
	2: byte dayIndex
}