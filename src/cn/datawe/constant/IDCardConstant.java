/**
 * 工程名：project-util
 * 包名：cn.datawe.constant
 */
package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

import cn.datawe.constant.CredittoneConstant.VerifyResult;

/**
 * 类名：IDCardConstant
 * 
 * @desc
 * @author lishasha
 * @version 1.0
 * @since v1.0
 * @Date 2017-3-8下午04:17:31
 */
public class IDCardConstant {
	/**
	 * 身份证实名认证不返照
	 * */
	public static final String IDENTIFY_IDCARD = "identifyIdcard";

	/**
	 * 身份证实名认证返照
	 * */
	public static final String IDENTIFY_IDCARD_PHOTO = "identifyIdcardPhoto";

	/**
	 * 不一致
	 * */
	public static final String CONSISTENT = "0";
	/**
	 * 一致
	 * */
	public static final String INCONSISTENT = "1";
	/**
	 * 无法验证
	 * */
	public static final String NOT_VERIFIED = "2";

	public static final Map<String, String> DATATANG_MAP = new HashMap<String, String>();//数据堂
	
	public static final Map<String, String> CREDITTONE_MAP = new HashMap<String, String>();//增信通

	static {
		DATATANG_MAP.put(DatatangConstant.DATATANG_SUCCESS, INCONSISTENT);
		DATATANG_MAP.put(DatatangConstant.DATATANG_ERROR_ID_NAME, CONSISTENT);
		DATATANG_MAP.put(DatatangConstant.DATATANG_ERROR_IDCARD, NOT_VERIFIED);

		CREDITTONE_MAP.put(VerifyResult.NOT_FOUND, NOT_VERIFIED);
		CREDITTONE_MAP.put(VerifyResult.MATCHED, INCONSISTENT);
		CREDITTONE_MAP.put(VerifyResult.NO_MATCHED, CONSISTENT);
	}

}
