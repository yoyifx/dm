package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 常量类：融360响应码
 * @author ChenYunyu
 *
 */
public class Rong360CodeConstant {
	
	/**
	 * 访问成功
	 */
	public static final String ERROR_CODE_OK = "200";
	
	/**
	 * 系统错误
	 */
	public static final String ERROR_CODE_1000 = "1000";
	
	/**
	 * HTTPS请求的方法不正确
	 */
	public static final String ERROR_CODE_1001 = "1001";
	
	/**
	 * 无效的app_id
	 */
	public static final String ERROR_CODE_1002 = "1002";
	
	/**
	 * IP禁止访问API
	 */
	public static final String ERROR_CODE_1003 = "1003";
	
	/**
	 * 验证签名失败
	 */
	public static final String ERROR_CODE_1004 = "1004";
	
	/**
	 * 无效的产品线
	 */
	public static final String ERROR_CODE_1005 = "1005";
	
	/**
	 * 没有该方法的访问权限
	 */
	public static final String ERROR_CODE_1006 = "1006";
	
	/**
	 * 传入参数不完整，缺少method
	 */
	public static final String ERROR_CODE_2001 = "2001";
	
	/**
	 * 传入参数不完整，缺少sign
	 */
	public static final String ERROR_CODE_2002 = "2002";
	
	/**
	 * 传入参数不完整，缺少sign_type
	 */
	public static final String ERROR_CODE_2003 = "2003";
	
	/**
	 * 传入参数不完整，缺少biz_data
	 */
	public static final String ERROR_CODE_2004 = "2004";
	
	/**
	 * 传入参数不完整，缺少app_id
	 */
	public static final String ERROR_CODE_2007 = "2007";
	
	/**
	 * 传入参数不完整，缺少version
	 */
	public static final String ERROR_CODE_2008 = "2008";
	
	/**
	 * 传入参数不完整，缺少format
	 */
	public static final String ERROR_CODE_2009 = "2009";
	
	/**
	 * 传入参数不完整，缺少timestamp
	 */
	public static final String ERROR_CODE_2010 = "2010";
	
	public static final Map<String, String> MAP = new HashMap<String, String>();

	static {
		MAP.put(ERROR_CODE_OK, "访问成功");
		MAP.put(ERROR_CODE_1000, "系统错误");
		MAP.put(ERROR_CODE_1001, "HTTPS请求的方法不正确");
		MAP.put(ERROR_CODE_1002, "无效的app_id");
		MAP.put(ERROR_CODE_1003, "IP禁止访问API");
		MAP.put(ERROR_CODE_1004, "验证签名失败");
		MAP.put(ERROR_CODE_1005, "无效的产品线");
		MAP.put(ERROR_CODE_1006, "没有该方法的访问权限");
		MAP.put(ERROR_CODE_2001, "传入参数不完整，缺少method");
		MAP.put(ERROR_CODE_2002, "传入参数不完整，缺少sign");
		MAP.put(ERROR_CODE_2003, "传入参数不完整，缺少sign_type");
		MAP.put(ERROR_CODE_2004, "传入参数不完整，缺少biz_data");
		MAP.put(ERROR_CODE_2007, "传入参数不完整，缺少app_id");
		MAP.put(ERROR_CODE_2008, "传入参数不完整，缺少version");
		MAP.put(ERROR_CODE_2009, "传入参数不完整，缺少format");
		MAP.put(ERROR_CODE_2010, "传入参数不完整，缺少timestamp");
	}
	
}
