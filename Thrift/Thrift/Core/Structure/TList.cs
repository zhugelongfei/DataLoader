namespace Thrift.Protocol
{
    public struct TList
    {
        private TType elementType;
        private int count;

        public TList(TType elementType, int count)
            : this()
        {
            this.elementType = elementType;
            this.count = count;
        }

        public TType ElementType
        {
            get { return elementType; }
            set { elementType = value; }
        }

        public int Count
        {
            get { return count; }
            set { count = value; }
        }
    }
}