package cn.datawe.util;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * 工具类: AES
 * 
 * @author LiuJiaLe
 *
 */
public final class AESUtil {

	private static final String AES = "AES";
	
	private static final String CHARSET = "UTF-8";
	
	private static final String PASSWORD = "0123456789";
	
	private static final int KEY_SIZE = 128;
	
	/**
	 * 加密
	 * 
	 * @param content
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String encrypt(String content) throws UnsupportedEncodingException {
		
		if (null == content || content.trim().length() < 1) {
			
			throw new IllegalArgumentException("content missing");
		}
		// 注意密钥组成方式
		byte[] result = encrypt(content.getBytes(CHARSET), PASSWORD);
		return toHexString(result);
	}
	
	/**
	 * 加密
	 * 
	 * @param content
	 * @param password
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String encrypt(String content, String password) throws UnsupportedEncodingException {
		
		if (null == content || content.trim().length() < 1) {
			
			throw new IllegalArgumentException("content missing");
		}
		if (null == password || password.trim().length() < 1) {
			
			throw new IllegalArgumentException("password missing");
		}
		// 注意密钥组成方式
		byte[] result = encrypt(content.getBytes(CHARSET), createPassword(password));
		return toHexString(result);
	}
	
	/**
	 * 加密
	 * 
	 * @param content
	 * @param password
	 * @return
	 */
	public static byte[] encrypt(byte[] content, String password) {
		
		try {
			
			SecretKeySpec key = getAesKey(password);
			Cipher cipher = Cipher.getInstance(AES);
			cipher.init(Cipher.ENCRYPT_MODE, key);
			return cipher.doFinal(content);
		} catch (Exception e) {
			
			throw new RuntimeException("AES加密出错了，系统异常，".concat(e.getMessage()));
		}
	}
	
	/**
	 * 解密
	 * 
	 * @param content
	 * @return
	 */
	public static String decrypt(String content) {
		
		if (null == content || content.trim().length() < 1) {
			
			throw new IllegalArgumentException("content missing");
		}
		byte[] hexByteArray = toHexByteArray(content);
		byte[] result = decrypt(hexByteArray, PASSWORD);
		return null == result ? null : new String(result);
	}
	
	/**
	 * 解密
	 * 
	 * @param content
	 * @param password
	 * @return
	 */
	public static String decrypt(String content, String password) {
		
		if (null == content || content.trim().length() < 1) {
			
			throw new IllegalArgumentException("content missing");
		}
		if (null == password || password.trim().length() < 1) {
			
			throw new IllegalArgumentException("password missing");
		}
		byte[] hexByteArray = toHexByteArray(content);
		byte[] result = decrypt(hexByteArray, createPassword(password));
		String str = null;
		if (null != result) {
			
			try {
				
				str = new String(result, CHARSET);
			} catch (UnsupportedEncodingException e) {
				
				e.printStackTrace();
			}
		}
		return str;
	}
	
	/**
	 * 解密
	 * 
	 * @param content
	 * @param password
	 * @return
	 */
	public static byte[] decrypt(byte[] content, String password) {
		
		try {
			
			SecretKeySpec key = getAesKey(password);
			Cipher cipher = Cipher.getInstance(AES);
			cipher.init(Cipher.DECRYPT_MODE, key);
			return cipher.doFinal(content);
		} catch (Exception e) {
			
			throw new RuntimeException("AES解密出错了，系统异常，".concat(e.getMessage()));
		}
	}
	
	private static SecretKeySpec getAesKey(String password) throws NoSuchAlgorithmException {
		
		KeyGenerator keyGenerator = KeyGenerator.getInstance(AES);
		SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
		secureRandom.setSeed(password.getBytes());
		keyGenerator.init(KEY_SIZE, secureRandom);
		SecretKey secretKey = keyGenerator.generateKey();
		return new SecretKeySpec(secretKey.getEncoded(), AES);
	}
	
	private static byte[] toHexByteArray(String content) {
		
		if (null == content || content.trim().length() < 1) {
			
			return null;
		}
		int len = content.length() / 2;
		byte[] result = new byte[len];
		for (int i=0; i<len; i++) {
			
			int high = Integer.parseInt(content.substring(i*2, i*2+1), 16);
			int low = Integer.parseInt(content.substring(i*2+1, i*2+2), 16);
			result[i] = (byte) (high * 16 + low);
		}
		return result;
	}
	
	
	public static String decryptUtf(String content) throws UnsupportedEncodingException {
		
		if (null == content || content.trim().length() < 1) {
			
			throw new IllegalArgumentException("content missing");
		}
		byte[] hexByteArray = toHexByteArray(content);
		byte[] result = decrypt(hexByteArray, PASSWORD);
		return null == result ? null : new String(result, "UTF-8");
	}
	
	private static String toHexString(byte[] array) {
		
		StringBuilder sb = new StringBuilder();
		for (byte b : array) {
			
			sb.append(Integer.toHexString((b & 0xFF) | 0x100).substring(1, 3));
		}
		return sb.toString().toUpperCase();
		
//		StringBuffer sb = new StringBuffer();
//		for (int i=0; i<array.length; i++) {
//			
//			String hex = Integer.toHexString(array[i] & 0xff);
//			if (hex.length() == 1) {
//				
//				hex = "0" + hex;
//			}
//			sb.append(hex.toUpperCase());
//		}
//		return sb.toString();
	}
	
	private static String createPassword(String password) {
		
		return AESUtil.PASSWORD.concat(password);
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.err.println(encrypt("123456"));
		System.err.println(decrypt("5F87C716DF9D6B649F83FFAB80C3FCF5"));
		//String str = "CTA5bgd7";
//		String str = encrypt("{MD5}eI8c+DcdfwR8QtElGzvMVw==");
//		String ret = decrypt(str);
//		System.out.println(str);
//		System.out.println(ret);
//		
//		System.out.println("mobile:"+"15625297829");
//		String enString = encrypt("15625297829");
//		String deString = decrypt(enString);
//		System.out.println("AES encrypt mobile:"+enString);
//		System.out.println("AES decrypt mobile:"+deString);
		System.err.println(decrypt("D8B654BE288965691072BB97E7CEC5618EE7022C11B31403565686782F61E8EF"));
		
	}
}
