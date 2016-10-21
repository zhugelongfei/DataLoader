namespace Thrift.Transport
{
    public class TTransportException : TException
    {
        protected ExceptionType type;

        public TTransportException()
            : base()
        {
        }

        public TTransportException(ExceptionType type)
            : this()
        {
            this.type = type;
        }

        public TTransportException(ExceptionType type, string message)
            : base(message)
        {
            this.type = type;
        }

        public TTransportException(string message)
            : base(message)
        {
        }

        public ExceptionType Type
        {
            get { return type; }
        }

        public enum ExceptionType
        {
            /// <summary>
            /// 函数未实现
            /// </summary>
            Unknown,

            /// <summary>
            /// 数据流未开启
            /// </summary>
            NotOpen,
            AlreadyOpen,

            /// <summary>
            /// 超时
            /// </summary>
            TimedOut,

            /// <summary>
            /// 文件读取到末尾
            /// </summary>
            EndOfFile,
            Interrupted
        }
    }
}
