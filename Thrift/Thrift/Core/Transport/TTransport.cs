using System;
using System.IO;

namespace Thrift.Transport
{
    public abstract class TTransport : IDisposable
    {
        public abstract bool IsOpen
        {
            get;
        }

        private byte[] _peekBuffer = new byte[1];
        private bool _hasPeekByte = false;

        public bool Peek()
        {
            //If we already have a byte read but not consumed, do nothing.
            if (_hasPeekByte)
                return true;

            //If transport closed we can't peek.
            if (!IsOpen)
                return false;

            //Try to read one byte. If succeeds we will need to store it for the next read.
            try
            {
                int bytes = Read(_peekBuffer, 0, 1);
                if (bytes == 0)
                    return false;
            }
            catch (IOException)
            {
                return false;
            }

            _hasPeekByte = true;
            return true;
        }

        public abstract void Open();

        public abstract void Close();

        public abstract int Read(byte[] buf, int off, int len);

        public int ReadAll(byte[] buf, int off, int len)
        {
            int got = 0;

            //If we previously peeked a byte, we need to use that first.
            if (_hasPeekByte)
            {
                buf[off + got++] = _peekBuffer[0];
                _hasPeekByte = false;
            }

            while (got < len)
            {
                // TODO： 这里是不是buff长度不够读取，才会执行第二次？
                int ret = Read(buf, off + got, len - got);
                if (ret <= 0)
                {
                    throw new TTransportException(
                        TTransportException.ExceptionType.EndOfFile,
                        "Cannot read, Remote side has closed");
                }
                got += ret;
            }
            return got;
        }

        public virtual void Write(byte[] buf)
        {
            Write(buf, 0, buf.Length);
        }

        public abstract void Write(byte[] buf, int off, int len);

        public virtual void Flush()
        {

        }

        public virtual IAsyncResult BeginFlush(AsyncCallback callback, object state)
        {
            throw new TTransportException(
                TTransportException.ExceptionType.Unknown,
                "Asynchronous operations are not supported by this transport.");
        }

        public virtual void EndFlush(IAsyncResult asyncResult)
        {
            throw new TTransportException(
                TTransportException.ExceptionType.Unknown,
                "Asynchronous operations are not supported by this transport.");
        }

        #region " IDisposable Support "

        // IDisposable
        public void Dispose()
        {
            // Do not change this code.  Put cleanup code in Dispose(ByVal disposing As Boolean) above.
            Dispose(true);
            GC.SuppressFinalize(this);
        }

        protected abstract void Dispose(bool disposing);

        #endregion
    }
}