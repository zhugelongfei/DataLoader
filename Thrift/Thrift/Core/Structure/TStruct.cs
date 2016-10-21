namespace Thrift.Protocol
{
    public struct TStruct
    {
        private string name;

        public TStruct(string name)
            : this()
        {
            this.name = name;
        }

        public string Name
        {
            get { return name; }
            set { name = value; }
        }
    }
}