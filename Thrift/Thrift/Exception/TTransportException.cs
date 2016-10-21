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
            /// ����δʵ��
            /// </summary>
            Unknown,

            /// <summary>
            /// ������δ����
            /// </summary>
            NotOpen,
            AlreadyOpen,

            /// <summary>
            /// ��ʱ
            /// </summary>
            TimedOut,

            /// <summary>
            /// �ļ���ȡ��ĩβ
            /// </summary>
            EndOfFile,
            Interrupted
        }
    }
}
