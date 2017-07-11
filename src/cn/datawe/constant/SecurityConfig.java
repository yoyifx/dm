/**
 * 安全加密相关摘要
 * 工程名：project-util
 * 包名：cn.datawe.constant
 */
package cn.datawe.constant;

/**
 * 类名：SecurityConfig
 * 
 * @desc
 * @author lishasha
 * @version 1.0
 * @since v1.0
 * @Date 2017-2-27下午04:11:09
 */
public interface SecurityConfig {

	/**
	 * AES
	 */
	String AES = "AES";

	/**
	 * 数字签名 密钥算法
	 */
	String RSA = "RSA";

	/**
	 * 数字签名 签名/验证算法
	 */
	String SIGNATURE_ALGORITHM = "SHA1withRSA";

	/**
	 * 加密/解密算法 / 工作模式 / 填充方式 Java 6支持PKCS5Padding填充方式 Bouncy
	 * Castle支持PKCS7Padding填充方式
	 */
	String CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";

}
