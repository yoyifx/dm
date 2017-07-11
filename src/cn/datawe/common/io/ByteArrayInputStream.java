package cn.datawe.common.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 非同步的ByteArrayInputStream
 * 
 * @author LiuJiaLe
 *
 */
public class ByteArrayInputStream extends InputStream {

	private byte[] buffer;
	
	private int index;
	
	private int limit;
	
	private int mark;
	
	private boolean closed;
	
	public ByteArrayInputStream(byte[] data) {
		this(data, 0, data.length);
	}
	
	public ByteArrayInputStream(byte[] data, int offset, int length) {
		if (data == null) {
			throw new NullPointerException();
		} else if (offset < 0 || (offset + length) > data.length || length < 0) {
			throw new IndexOutOfBoundsException();
		} else {
			buffer = data;
			index = offset;
			limit = offset + length;
			mark = offset;
		}
	}

	public int read() throws IOException {
		if (closed) {
			throw new IOException("stream closed");
		} else if (index >= limit) {
			return -1;// EOF
		} else {
			return buffer[index++] & 0xFF;
		}
	}
	
	public int read(byte[] data, int offset, int length) throws IOException {
		if (data == null) {
			throw new NullPointerException();
		} else if (offset < 0 || (offset + length) > data.length || length < 0) {
			throw new IndexOutOfBoundsException();
		} else if (closed) {
			throw new IOException("stream closed");
		} else if (index >= limit) {
			return -1;// EOF
		} else {
			if (length > (limit - index)) {
				length = limit - index;
			}
			System.arraycopy(buffer, index, data, offset, length);
			index += length;
			return length;
		}
	}
	
	public long skip(long amount) throws IOException {
		if (closed) {
			throw new IOException("stream closed");
		} else if (amount < 1) {
			return 0;
		} else {
			if (amount > (limit - index)) {
				amount = limit - index;
			}
			index += amount;
			return amount;
		}
	}
	
	public int available() throws IOException {
		if (closed) {
			throw new IOException("stream closed");
		} else {
			return limit - index;
		}
	}
	
	public void close() {
		//closed = true;
	}
	
	public void mark(int readLimit) {
		mark = index;
	}
	
	public void reset() throws IOException {
		if (closed) {
			throw new IOException("stream closed");
		} else {
			index = mark;
		}
	}
	
	public boolean markSupported() {
		return true;
	}
}
