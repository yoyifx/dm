package cn.datawe.util;

import java.io.UnsupportedEncodingException;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * 工具类:摘要算法
 * 
 * @author LiuJiaLe
 *
 */
public final class DigestUtil {
	
	public static final String MD5 = "md5";
	public static final String SHA1 = "sha1";
	public static final String SHA256 = "sha256";
	public static final String SHA384 = "sha384";
	public static final String SHA512 = "sha512";
	public static final String HMAC_MD5 = "HmacMD5";
	public static final String HMAC_SHA1 = "HmacSHA1";
	public static final String HMAC_SHA256 = "HmacSHA256";
	public static final String HMAC_SHA384 = "HmacSHA384";
	public static final String HMAC_SHA512 = "HmacSHA512";

	/**
	 * 通过MD5摘要算法，返回32位十六进制字符串
	 * 
	 * @param data
	 * @return
	 */
	public static String md5(byte[] data) {
		
		return DigestUtils.md5Hex(data);
	}
	
	/**
	 * 通过MD5摘要算法，返回32位十六进制字符串
	 * 
	 * @param data
	 * @return
	 */
	public static String md5(String data) {
		
		return DigestUtils.md5Hex(data);
	}
	
	/**
	 * 通过MD5摘要算法，返回32位十六进制字符串
	 * 
	 * @param data
	 * @param charset
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String md5(String data, String charset) throws UnsupportedEncodingException {
		
		return DigestUtils.md5Hex(data.getBytes(charset));
	}
	
	/**
	 * 通过SHA1摘要算法，返回40位十六进制字符串
	 * 
	 * @param data
	 * @return
	 */
	public static String sha1(byte[] data) {
		
		return DigestUtils.shaHex(data);
	}
	
	/**
	 * 通过SHA1摘要算法，返回40位十六进制字符串
	 * 
	 * @param data
	 * @return
	 */
	public static String sha1(String data) {
		
		return DigestUtils.shaHex(data);
	}
	
	/**
	 * 通过SHA1摘要算法，返回40位十六进制字符串
	 * 
	 * @param data
	 * @param charset
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String sha1(String data, String charset) throws UnsupportedEncodingException {
		
		return DigestUtils.shaHex(data.getBytes(charset));
	}
	
	/**
	 * 通过SHA256摘要算法，返回64位十六进制字符串
	 * 
	 * @param data
	 * @return
	 */
	public static String sha256(byte[] data) {
		
		return DigestUtils.sha256Hex(data);
	}
	
	/**
	 * 通过SHA256摘要算法，返回64位十六进制字符串
	 * 
	 * @param data
	 * @return
	 */
	public static String sha256(String data) {
		
		return DigestUtils.sha256Hex(data);
	}
	
	/**
	 * 通过SHA256摘要算法，返回64位十六进制字符串
	 * 
	 * @param data
	 * @param charset
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String sha256(String data, String charset) throws UnsupportedEncodingException {
		
		return DigestUtils.sha256Hex(data.getBytes(charset));
	}
	
	/**
	 * 通过SHA384摘要算法，返回96位十六进制字符串
	 * 
	 * @param data
	 * @return
	 */
	public static String sha384(byte[] data) {
		
		return DigestUtils.sha384Hex(data);
	}
	
	/**
	 * 通过SHA384摘要算法，返回96位十六进制字符串
	 * 
	 * @param data
	 * @return
	 */
	public static String sha384(String data) {
		
		return DigestUtils.sha384Hex(data);
	}
	
	/**
	 * 通过SHA384摘要算法，返回96位十六进制字符串
	 * 
	 * @param data
	 * @param charset
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String sha384(String data, String charset) throws UnsupportedEncodingException {
		
		return DigestUtils.sha384Hex(data.getBytes(charset));
	}
	
	/**
	 * 通过SHA512摘要算法，返回128位十六进制字符串
	 * 
	 * @param data
	 * @return
	 */
	public static String sha512(byte[] data) {
		
		return DigestUtils.sha512Hex(data);
	}
	
	/**
	 * 通过SHA512摘要算法，返回128位十六进制字符串
	 * 
	 * @param data
	 * @return
	 */
	public static String sha512(String data) {
		
		return DigestUtils.sha512Hex(data);
	}
	
	/**
	 * 通过SHA512摘要算法，返回128位十六进制字符串
	 * 
	 * @param data
	 * @param charset
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String sha512(String data, String charset) throws UnsupportedEncodingException {
		
		return DigestUtils.sha512Hex(data.getBytes(charset));
	}
	
	/**
	 * 通过HmacMD5摘要算法，返回32位十六进制字符串
	 * 
	 * @param data
	 * @param secretKey
	 * @return
	 * @throws Exception
	 */
	public static String hmacMD5(byte[] data, String secretKey) throws Exception {
		
		return toHexString(hmac(data, secretKey, HMAC_MD5));
	}
	
	/**
	 * 通过HmacMD5摘要算法，返回32位十六进制字符串
	 * 
	 * @param data
	 * @param secretKey
	 * @return
	 * @throws Exception
	 */
	public static String hmacMD5(String data, String secretKey) throws Exception {
		
		return toHexString(hmac(data, secretKey, HMAC_MD5));
	}
	
	/**
	 * 通过HmacMD5摘要算法，返回32位十六进制字符串
	 * 
	 * @param data
	 * @param charset
	 * @param secretKey
	 * @return
	 * @throws Exception
	 */
	public static String hmacMD5(String data, String charset, String secretKey) throws Exception {
		
		return toHexString(hmac(data, charset, secretKey, HMAC_MD5));
	}
	
	/**
	 * 通过HmacSHA1摘要算法，返回40位十六进制字符串
	 * 
	 * @param data
	 * @param secretKey
	 * @return
	 * @throws Exception
	 */
	public static String hmacSHA1(byte[] data, String secretKey) throws Exception {
		
		return toHexString(hmac(data, secretKey, HMAC_SHA1));
	}
	
	/**
	 * 通过HmacSHA1摘要算法，返回40位十六进制字符串
	 * 
	 * @param data
	 * @param secretKey
	 * @return
	 * @throws Exception
	 */
	public static String hmacSHA1(String data, String secretKey) throws Exception {
		
		return toHexString(hmac(data, secretKey, HMAC_SHA1));
	}
	
	/**
	 * 通过HmacSHA1摘要算法，返回40位十六进制字符串
	 * 
	 * @param data
	 * @param charset
	 * @param secretKey
	 * @return
	 * @throws Exception
	 */
	public static String hmacSHA1(String data, String charset, String secretKey) throws Exception {
		
		return toHexString(hmac(data, charset, secretKey, HMAC_SHA1));
	}
	
	/**
	 * 通过HmacSHA256摘要算法，返回64位十六进制字符串
	 * 
	 * @param data
	 * @param secretKey
	 * @return
	 * @throws Exception
	 */
	public static String hmacSHA256(byte[] data, String secretKey) throws Exception {
		
		return toHexString(hmac(data, secretKey, HMAC_SHA256));
	}
	
	/**
	 * 通过HmacSHA256摘要算法，返回64位十六进制字符串
	 * 
	 * @param data
	 * @param secretKey
	 * @return
	 * @throws Exception
	 */
	public static String hmacSHA256(String data, String secretKey) throws Exception {
		
		return toHexString(hmac(data, secretKey, HMAC_SHA256));
	}
	
	/**
	 * 通过HmacSHA256摘要算法，返回64位十六进制字符串
	 * 
	 * @param data
	 * @param charset
	 * @param secretKey
	 * @return
	 * @throws Exception
	 */
	public static String hmacSHA256(String data, String charset, String secretKey) throws Exception {
		
		return toHexString(hmac(data, charset, secretKey, HMAC_SHA256));
	}
	
	/**
	 * 通过HmacSHA384摘要算法，返回96位十六进制字符串
	 * 
	 * @param data
	 * @param secretKey
	 * @return
	 * @throws Exception
	 */
	public static String hmacSHA384(byte[] data, String secretKey) throws Exception {
		
		return toHexString(hmac(data, secretKey, HMAC_SHA384));
	}
	
	/**
	 * 通过HmacSHA384摘要算法，返回96位十六进制字符串
	 * 
	 * @param data
	 * @param secretKey
	 * @return
	 * @throws Exception
	 */
	public static String hmacSHA384(String data, String secretKey) throws Exception {
		
		return toHexString(hmac(data, secretKey, HMAC_SHA384));
	}
	
	/**
	 * 通过HmacSHA384摘要算法，返回96位十六进制字符串
	 * 
	 * @param data
	 * @param charset
	 * @param secretKey
	 * @return
	 * @throws Exception
	 */
	public static String hmacSHA384(String data, String charset, String secretKey) throws Exception {
		
		return toHexString(hmac(data, charset, secretKey, HMAC_SHA384));
	}
	
	/**
	 * 通过HmacSHA512摘要算法，返回128位十六进制字符串
	 * 
	 * @param data
	 * @param secretKey
	 * @return
	 * @throws Exception
	 */
	public static String hmacSHA512(byte[] data, String secretKey) throws Exception {
		
		return toHexString(hmac(data, secretKey, HMAC_SHA512));
	}
	
	/**
	 * 通过HmacSHA512摘要算法，返回128位十六进制字符串
	 * 
	 * @param data
	 * @param secretKey
	 * @return
	 * @throws Exception
	 */
	public static String hmacSHA512(String data, String secretKey) throws Exception {
		
		return toHexString(hmac(data, secretKey, HMAC_SHA512));
	}
	
	/**
	 * 通过HmacSHA512摘要算法，返回128位十六进制字符串
	 * 
	 * @param data
	 * @param charset
	 * @param secretKey
	 * @return
	 * @throws Exception
	 */
	public static String hmacSHA512(String data, String charset, String secretKey) throws Exception {
		
		return toHexString(hmac(data, charset, secretKey, HMAC_SHA512));
	}
	
	/**
	 * 获取加密数据摘要算法
	 * 
	 * @param data
	 * @param result
	 * @return
	 */
	public static String getDigest(String data, String result) {
		
		if (md5(data).equals(result)) {
			
			return MD5;
		} else if (sha1(data).equals(result)) {
			
			return SHA1;
		} else if (sha256(data).equals(result)) {
			
			return SHA256;
		} else if (sha384(data).equals(result)) {
			
			return SHA384;
		} else if (sha512(data).equals(result)) {
			
			return SHA512;
		}
		return null;
	}
	
	/**
	 * 获取加密数据摘要算法
	 * 
	 * @param data
	 * @param charset
	 * @param result
	 * @return
	 * @throws Exception
	 */
	public static String getDigest(String data, String charset, String result) throws Exception {
		
		if (md5(data, charset).equals(result)) {
			
			return MD5;
		} else if (sha1(data, charset).equals(result)) {
			
			return SHA1;
		} else if (sha256(data, charset).equals(result)) {
			
			return SHA256;
		} else if (sha384(data, charset).equals(result)) {
			
			return SHA384;
		} else if (sha512(data, charset).equals(result)) {
			
			return SHA512;
		}
		return null;
	}
	
	/**
	 * 获取有密钥的加密数据摘要算法
	 * 
	 * @param data
	 * @param secretKey
	 * @param result
	 * @return
	 * @throws Exception
	 */
	public static String getDigestSecretKey(String data, String secretKey, String result) throws Exception {
		
		if (hmacMD5(data, secretKey).equals(result)) {
			
			return HMAC_MD5;
		} else if (hmacSHA1(data, secretKey).equals(result)) {
			
			return HMAC_SHA1;
		} else if (hmacSHA256(data, secretKey).equals(result)) {
			
			return HMAC_SHA256;
		} else if (hmacSHA384(data, secretKey).equals(result)) {
			
			return HMAC_SHA384;
		} else if (hmacSHA512(data, secretKey).equals(result)) {
			
			return HMAC_SHA512;
		}
		return null;
	}
	
	/**
	 * 获取有密钥的加密数据摘要算法
	 * 
	 * @param data
	 * @param charset
	 * @param secretKey
	 * @param result
	 * @return
	 * @throws Exception
	 */
	public static String getDigestSecretKey(String data, String charset, String secretKey, String result) throws Exception {
		
		if (hmacMD5(data, charset, secretKey).equals(result)) {
			
			return HMAC_MD5;
		} else if (hmacSHA1(data, charset, secretKey).equals(result)) {
			
			return HMAC_SHA1;
		} else if (hmacSHA256(data, charset, secretKey).equals(result)) {
			
			return HMAC_SHA256;
		} else if (hmacSHA384(data, charset, secretKey).equals(result)) {
			
			return HMAC_SHA384;
		} else if (hmacSHA512(data, charset, secretKey).equals(result)) {
			
			return HMAC_SHA512;
		}
		return null;
	}
	
	private static byte[] hmac(byte[] data, String key, String algorithm) throws Exception {
		
		SecretKey secretKey = new SecretKeySpec(Base64.decodeBase64(key), algorithm);
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		mac.init(secretKey);
		return mac.doFinal(data);
	}
	
	private static byte[] hmac(String data, String key, String algorithm) throws Exception {
		
		return hmac(data.getBytes(), key, algorithm);
	}
	
	private static byte[] hmac(String data, String charset, String key, String algorithm) throws Exception {
		
		return hmac(data.getBytes(charset), key, algorithm);
	}
	
	private static String toHexString(byte[] array) {
		
		StringBuilder sb = new StringBuilder();
		for (byte b : array) {
			
			sb.append(Integer.toHexString((b & 0xFF) | 0x100).substring(1, 3));
		}
		return sb.toString().toUpperCase();
	}
	
	private DigestUtil() {}
	
	public static void main(String[] args) {
		
//		String data = "data2";
		String data = "130622198411290214";
		System.out.println("--data:"+data);
		
		try {
			System.out.println(md5(data));
			/*
			System.out.println(md5(data));
			System.out.println(sha1(data));
			System.out.println(sha256(data));
			System.out.println(sha384(data));
			System.out.println(sha512(data));
			System.out.println(getDigest(data, "ff9cf2d690d888cb337f6bf4526b6130"));
			
	        String secretKey = "secretKey2";
	        System.out.println(hmacMD5(data, secretKey));
	        System.out.println(hmacSHA1(data, secretKey));
	        System.out.println(hmacSHA256(data, secretKey));
	        System.out.println(hmacSHA384(data, secretKey));
	        System.out.println(hmacSHA512(data, secretKey));
	        
	        System.out.println(getDigestSecretKey(data, secretKey, "92EA2BB75B2D41C2924E9BE6D89ADA81469680888123A46CA48C5444759D1173"));
		*/
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
