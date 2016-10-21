namespace Thrift.Protocol
{
    public class TProtocolException : TException
    {
        public const int UNKNOWN = 0;           //δ֪
        public const int INVALID_DATA = 1;      //��Ч����
        public const int NEGATIVE_SIZE = 2;     //��������
        public const int SIZE_LIMIT = 3;        //��С��������
        public const int BAD_VERSION = 4;       //����İ汾
        public const int NOT_IMPLEMENTED = 5;   //δʵ��
        public const int DEPTH_LIMIT = 6;       //�ݹ���ȳ�������

        protected int type_ = UNKNOWN;

        public TProtocolException()
            : base()
        {
        }

        public TProtocolException(int type)
            : base()
        {
            type_ = type;
        }

        public TProtocolException(int type, string message)
            : base(message)
        {
            type_ = type;
        }

        public TProtocolException(string message)
            : base(message)
        {
        }

        public int getType()
        {
            return type_;
        }
    }
}