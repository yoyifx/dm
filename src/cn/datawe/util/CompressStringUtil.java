package cn.datawe.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * 工具类:解压缩字符串
 * 
 * @author LiuJiaLe
 *
 */
public class CompressStringUtil {

	public static final String CHARSET = "GBK";
	
	public static final int BUFFER_SIZE = 1024;
	
	/**
	 * 压缩字符串
	 * 
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static final String compress(String str) throws Exception {
		
		return compress(str, CHARSET);
	}
	
	/**
	 * 压缩字符串
	 * 
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static final String compress(String str, String charset) throws Exception {
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ZipOutputStream zipOut = new ZipOutputStream(out);
		zipOut.putNextEntry(new ZipEntry(""));
		zipOut.write(str.getBytes(charset));
		zipOut.closeEntry();
		zipOut.close();
		return new Base64().encode(out.toByteArray());
	}
	
	/**
	 * 解压缩字符串
	 * 
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static final String decompress(String str) throws Exception {
		
		return decompress(str, CHARSET, BUFFER_SIZE);
	}
	
	/**
	 * 解压缩字符串
	 * 
	 * @param str
	 * @param charset
	 * @return
	 * @throws Exception
	 */
	public static final String decompress(String str, String charset) throws Exception {
		
		return decompress(str, charset, BUFFER_SIZE);
	}
	
	/**
	 * 解压缩字符串
	 * 
	 * @param str
	 * @param charset
	 * @param bufferSize
	 * @return
	 * @throws Exception
	 */
	public static final String decompress(String str, String charset, int bufferSize) throws Exception {
		
		if (null == str || str.trim().length() < 1) {
			
			return null;
		}
		ZipInputStream in = new ZipInputStream(new ByteArrayInputStream(new Base64().decode(str)));
		ZipEntry entry = in.getNextEntry();
		if (null== entry || entry.isDirectory()) {
			
			throw new Exception("解压缩字符串，失败，数据无效！");
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] buffer = new byte[bufferSize];
		int len = 0;
		while ((len=in.read(buffer)) > 0) {
			
			out.write(buffer, 0, len);
		}
		in.close();
		out.close();
		return new String(out.toByteArray(), charset);
	}
	
	public static void main(String[] args) {
		
		try {
			
			//String xml = "UEsDBBQACAAIAF1ZikYAAAAAAAAAAAAAAAALAAAAcmVwb3J0cy54bWydVVtvG0UUfg4S/2G1UiWQqPfqOK7WU6lJQRU0SGl5rjb2xF3h7Jqd tZvwbxIjKI4rFYJpHKSIJLabi+NsHSepjNQHKDxUFVIF6oUIxJy9emObB/yw3vnOd77znTOesXJ5YT7HFLFJNENPsUKMZxmsp42MpmdT7AdX PmSZy+jtt5S0RmZw3jAtwjCzqjVtpFiRF+K8zCfpEz5JlinomjWtzuMU23p+uGU3jrYPXrMMKcx+bGZVqm43DpdPbLvOMp8VsLn4CcHmtakU ay3cIQ7g4ZNGQbeoF5YxcRprRXxTA02/HiPEL0nSJTHBRoxRMnyB4KCz2YKWy1zVM6HSRV6+2K/llp7BKjF00EgmHeeu9s3FPCY0T5R4Oh/L xKo1g0kh57qM0m7cpm+Tat5yB7q03PyjU924d1Q+Wdv7m4Ge5qIeRTlOZcf5CYllbqvkxiKx8PxV0zTMFDun5ghmGY28bxqfY90HaONjijcr PaNBKQLYmKLRXOdtTNHpTqC0YeZhSxTOWbqRtOsOgbPts9WmwvmIGy+quQJGjT+75eNXdBftwye1lf0NhXNxpw7nF1K4QR8KVL2u6moWX9Mz eCE6oWCOEXTSINbICWOYxnVMCFVMsc6+B/X9Dof4DULAM8zspJHBKJEQE7IgyZLC+RCETZzV6ODNaQPJMi/xgsBLCSkuxycUri/mKOWxPqVa GIk8D3tIGQEEcWKpVoGg2uPTZYXzFiHu0PgYL3ECfQo+I8gG0zAQ1Dw+uAs7VLq7Xll72fq19sVu64evSl+7fTkU4OdNo6jpaYxqv3y/srek cAHgqGnWItr9/afenk3zYAGoZaoZ7LT+UUJMxhUuBIIwDE5Apz9vPlk/2G21Xzz4p/2iU/WobjDCFdFQlhhlSaj5dP9sKFOKMmUEFwiw+jiy P8i5Ob0wf8tU9SxGzjF35tiPRoiOwK2ckVZzsGv97P7QYM5Q9khtKP0penhf4C8Mr+AShqT/R2KQohazhJr02vVWYSDSicAnQtJAj4MwrUJP LxJi8rAkLzoyNfQ+Knw+FY2Pn/c3KO9WFWNi4pzwCDsjjQQWNLiOnN/5FXrywlUQm8Ikjda24dyt7m4uH/XgjNefyd0tfmLnuFTpPDqyBb7+ TFh72d2q1n/8a+9BqVL95uF9uOFPv2tV2mU496UKPH2s82jj3uqJ/XpzX4K0d8LTnxJj8sSFd5dKbklIqP1WL7XLziaXKs2nsOz26KF50+1V H9t2p3piNxrbZ+2y02ip0u3trAzAvuDO/reNjfXjN5tfguR7nmaI/h9lb27OpOhF7P8TuNdS363vYv7fc3RF0L9QSwcIl/Vt1uQDAAB5CAAA UEsBAhQAFAAIAAgAXVmKRpf1bdbkAwAAeQgAAAsAAAAAAAAAAAAAAAAAAAAAAHJlcG9ydHMueG1sUEsFBgAAAAABAAEAOQAAAB0EAAAAAA==";
			
			String str = "hello中文";
			String ret = compress(str);
			str = decompress(ret);
			System.out.println(str);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
