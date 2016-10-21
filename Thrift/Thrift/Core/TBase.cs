namespace Thrift.Protocol
{
    public interface TBase
    {
        /// <summary>
        /// Writes the objects out to the protocol
        /// </summary>
        void Write(TProtocol tProtocol);

        /// <summary>
        /// Reads the TObject from the given input protocol.
        /// </summary>
        void Read(TProtocol tProtocol);
    }
}