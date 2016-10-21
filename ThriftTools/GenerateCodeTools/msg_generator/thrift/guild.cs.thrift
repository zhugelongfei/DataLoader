include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs


/** ��ѯ�̵���Ʒ*/
struct CSQueryGuildShop{
	1:i32	version
	2:i32 	startIndex
	3:i32 	size
}
/** ������Ʒ */
struct CSBuyGuildItem{
	1: i32	itemId
}
/** ����ˢ���̵��б�*/
struct CSRefreshGuildShop{
	1: i32	startIndex
	2: i32	size
}

/** һ������������������*/
struct CSHandleAllGuildApply{
	1: bool		allow
}

/** ��ѯ���������б�ҳ������ */
struct CSQueryGuildListMsg{
	/** ��ҳ��Ϣ��ѯ���� */
	1: struct.CommonDataPageInfoQueryParam pageInfoQueryParam
	3: struct.GuildSortType queryType;
}

/** �����Ӧid��������Ϣ */
struct CSQueryGuildByIdsMsg{
	/** �����Ӧid����Ϣ���� */
	1: struct.CommonDataQueryByIdsParam queryByIdsParam
}

/** ��ѯ�ҵ�������Ϣ */
struct CSQueryMyGuildInfoMsg{

}

/** ��ѯ������Ա�б� */
struct CSQueryGuildMemListMsg{
	1: i64 guildId;
	2: i32 startIndex;
	3: i16 count;
}

//�ų���ѯ�����б�
struct CSQueryApplyListMsg{
	1: i32 startIndex;
	2: i16 count;
}

//�ų������������
struct CSAllowJoinGuildMsg{
	1: i64 allowCharId;
}


//�ų��޸Ĺ���
struct CSModifyNoticeMsg{
	1: optional string noticeBoard;
	2: optional string headIcon
}

//�ų�ת���ų�
struct CSTransferDegreeMsg{
	1: i64 transferCharId;
}

//�ų��߳���Ա
struct CSGuildKickPlayerMsg{
	1: i64 kickCharId;
}

//������������

struct CSAddApplyListMsg{
	1: i64 guildId;
}

//��Ա�˳�����
struct CSQuitGuildMsg{
	
}


//�������
struct CSGuildCreateMsg{
	1: string guildName;
	2: string guildIcon;
	3: string noticeBoard;
}



struct CSMyApplyGuildListMsg{
}

//�ų��ܾ��������
struct CSGuildReuseApplyMsg{
	1: i64 charId;
}

//ȡ����������
struct CSGuildRemoveApplyMsg{
	1: i64 guildId;
}

//������Ҽ�������,��֪ͨ����������
struct CSInviteJoinGuildMsg{
	1: i64 charId;
}

//����������ͬ���������
struct CSAgreeJoinGuildMsg{
	1: i64 guildId;
	2: byte agreeType;
}
//ǩ����Ϣ
struct CSGuildSignInMsg{

}
/** ������Ϣ */
struct CSGuildDonateMsg{
	1:i32		gold
	2:i32		bindDiamond
}
//Ĥ�����
struct CSGuildWorshipMsg{
	1:i64 worshipPlayerId
}

struct CSSearchGuildListMsg{
	1:string	guildName
}

struct CSGuildWorldInviteMsg{
}

struct CSChangeGuildNameMsg{
	1: string guildName
}

struct CSGuildTaskListMsg{
}
struct CSGuildAcceptTaskIdsMsg{
}
struct CSAcceptGuildTaskMsg{
}

struct CSFinishGuildTaskMsg{
}

struct CSTakeGuildRewardMsg{
	1: byte type
}
struct CSAllGuildRewardsMsg{
	1: byte type
}

/** ������Ȩ���ų� */
struct CSReqAppointGuildDeputy{
	1: i64 charId
}
/** ���������ų� */
struct CSReqCancleGuildDeputy{
	1: i64 charId
}