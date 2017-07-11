package cn.datawe.common.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 非同步的ByteArrayOutputStream
 * 
 * @author LiuJiaLe
 *
 */
public class ByteArrayOutputStream extends OutputStream {

	private static final int BUFFER_SIZE = 1024 * 150;
	
	private byte[] buffer;
	
	private int index;
	
	private int capacity;
	
	private boolean closed;
	
	private boolean shared;
	
	public ByteArrayOutputStream() {
		this(BUFFER_SIZE);
	}
	
	public ByteArrayOutputStream(int bufferSize) {
		capacity = bufferSize;
		buffer = new byte[capacity];
	}

	public void write(int datum) throws IOException {
		if (closed) {
			throw new IOException("stream closed");
		} else {
			if (index >= capacity) {
				capacity = (capacity * 2) + 1;
				byte[] tmp = new byte[capacity];
				System.arraycopy(buffer, 0, tmp, 0, index);
				buffer = tmp;
				shared = false;
			}
			buffer[index++] = (byte) datum;
		}
	}

	public void write(byte[] data, int offset, int length) throws IOException {
		if (data == null) {
			throw new NullPointerException();
		} else if (offset < 0 || (offset + length) > data.length || length < 0) {
			throw new IndexOutOfBoundsException();
		} else if (closed) {
			throw new IOException("stream closed");
		} else {
			if ((index + length) > capacity) {
				capacity = (capacity * 2) + length;
				byte[] tmp = new byte[capacity];
				System.arraycopy(buffer, 0, tmp, 0, index);
				buffer = tmp;
				shared = false;
			}
			System.arraycopy(data, offset, buffer, index, length);
			index += length;
		}
	}
	
	public void close() {
		//closed = true;
	}
	
	public void writeTo(OutputStream out) throws IOException {
		out.write(buffer, 0, index);
	}
	
	public ByteArray toByteArray() {
		shared = true;
		return new ByteArray(buffer, 0, index);
	}
	
	public InputStream toInputStream() {
		shared = true;
		return new ByteArrayInputStream(buffer, 0, index);
	}
	
	public void reset() throws IOException {
		if (closed) {
			throw new IOException("stream closed");
		} else {
			if (shared) {
				buffer = new byte[capacity];
				shared = false;
			}
			index = 0;
		}
	}
}
