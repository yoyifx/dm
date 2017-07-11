/**
 * 工程名：project-util
 * 包名：cn.datawe.constant
 */
package cn.datawe.constant;

/**
 * 类名：MobileConstant
 * @desc 手机查询常量
 * @author lishasha
 * @version 1.0
 * @since v1.0
 * @Date 2017年4月26日上午11:30:19
 */
public class MobileConstant {

	/**
	 * 在网查询结果：[0,3)表示在网时长是0~3月
	 * */
	public static final String ONLINE_INTERVAL_1 = "1";
	/**
	 * 在网查询结果：[3,6)表示在网时长是3~6月
	 * */
	public static final String ONLINE_INTERVAL_2 = "2";
	/**
	 * 在网查询结果：[6,12)表示在网时长是6~12月
	 * */
	public static final String ONLINE_INTERVAL_3 = "3";
	/**
	 * 在网查询结果：[12,24)表示在网时长是12~24月
	 * */
	public static final String ONLINE_INTERVAL_4 = "4";
	/**
	 * 在网查询结果：[24,+)表示在网时长是24月以上
	 * */
	public static final String ONLINE_INTERVAL_5 = "5";
	/**
	 * 在网查询结果：系统无记录
	 * */
	public static final String ONLINE_INTERVAL_6 = "6";

	/**
	 * 手机状态查询结果：正常
	 * */
	public static final String STATUS_IN_NET = "0";
	/**
	 * 手机状态查询结果：在网不可用
	 * */
	public static final String STATUS_IN_NET_NOT_USE = "1";
	/**
	 * 手机状态查询结果：停机
	 * */
	public static final String STATUS_STOP = "2";
	/**
	 * 手机状态查询结果：销号
	 * */
	public static final String STATUS_PIN_NUM = "3";
	/**
	 * 手机状态查询结果：空号
	 * */
	public static final String STATUS_EMPTY_NUM = "4";
	/**
	 * 手机状态查询结果：未启用
	 * */
	public static final String STATUS_NOT_ENABLED= "5";
	/**
	 * 手机状态查询结果：系统无记录
	 * */
	public static final String STATUS_SYSTEM_NOT_RECORD = "6";

	
	/**
	 * 手机实名认证：一致
	 * */
	public static final String MOBILE_AUTH_CONSISTENT="0";
	/**
	 * 手机实名认证：不一致
	 * */
	public static final String MOBILE_AUTH_INCONSISTENT="1";
	
	/**
	 * 手机实名认证：系统无记录
	 * */
	public static final String MOBILE_AUTH_NO_RECORD="2";

}
