namespace Thrift.Protocol
{
    public class TProtocolException : TException
    {
        public const int UNKNOWN = 0;           //未知
        public const int INVALID_DATA = 1;      //无效数据
        public const int NEGATIVE_SIZE = 2;     //负数索引
        public const int SIZE_LIMIT = 3;        //大小超出限制
        public const int BAD_VERSION = 4;       //错误的版本
        public const int NOT_IMPLEMENTED = 5;   //未实现
        public const int DEPTH_LIMIT = 6;       //递归深度超出限制

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