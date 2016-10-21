using System.IO;

namespace Thrift.Transport
{
    /// <summary>
    /// 数据流传输
    /// </summary>
    public class TStreamTransport : TTransport
    {
        protected Stream inputStream;
        protected Stream outputStream;

        protected TStreamTransport()
        {

        }

        public TStreamTransport(Stream inputStream, Stream outputStream)
        {
            this.inputStream = inputStream;
            this.outputStream = outputStream;
        }

        public Stream OutputStream
        {
            get { return outputStream; }
        }

        public Stream InputStream
        {
            get { return inputStream; }
        }

        public override bool IsOpen
        {
            get { return true; }
        }

        public override void Open()
        {

        }

        public override void Close()
        {
            if (inputStream != null)
            {
                inputStream.Close();
                inputStream = null;
            }
            if (outputStream != null)
            {
                outputStream.Close();
                outputStream = null;
            }
        }

        public override int Read(byte[] buf, int off, int len)
        {
            if (inputStream == null)
            {
                throw new TTransportException(TTransportException.ExceptionType.NotOpen, "Cannot read from null inputstream");
            }

            return inputStream.Read(buf, off, len);
        }

        public override void Write(byte[] buf, int off, int len)
        {
            if (outputStream == null)
            {
                throw new TTransportException(TTransportException.ExceptionType.NotOpen, "Cannot write to null outputstream");
            }

            outputStream.Write(buf, off, len);
        }

        public override void Flush()
        {
            if (outputStream == null)
            {
                throw new TTransportException(TTransportException.ExceptionType.NotOpen, "Cannot flush null outputstream");
            }

            outputStream.Flush();
        }


        #region " IDisposable Support "
        private bool _IsDisposed;

        // IDisposable
        protected override void Dispose(bool disposing)
        {
            if (!_IsDisposed)
            {
                if (disposing)
                {
                    if (InputStream != null)
                        InputStream.Dispose();
                    if (OutputStream != null)
                        OutputStream.Dispose();
                }
            }
            _IsDisposed = true;
        }
        #endregion
    }
}