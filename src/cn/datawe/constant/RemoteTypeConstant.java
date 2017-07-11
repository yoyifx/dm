/**
 * 工程名：dm-util
 * 包名：cn.datawe.constant
 */
package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 类名：RemoteTypeConstant
 * 
 * @desc 数据源类别
 * @author lishasha
 * @version 1.0
 * @since v1.0
 * @Date 2017年3月25日下午3:02:36
 */
public class RemoteTypeConstant {

	/**
	 * 身份认证
	 * */
	public static final int IDCARD_AUTH = 1;
	/**
	 * 风险识别
	 * */
	public static final int RISK_QUERY = 2;
	/**
	 * 信用报告
	 * */
	public static final int CREDIT_REPORT = 3;
	/**
	 * 信息查询
	 * */
	public static final int INFORMATION_QUERY = 4;
	/**
	 * 交通出行
	 * */
	public static final int TRAFFIC_TRAVEL = 5;
	/**
	 * 数据采集
	 * */
	public static final int DATA_ACQUISITION = 6;

	public static final Map<Integer, String> MAP = new HashMap<Integer, String>();

	static {
		MAP.put(IDCARD_AUTH, "身份认证");
		MAP.put(RISK_QUERY, "风险识别");
		MAP.put(CREDIT_REPORT, "信用报告");
		MAP.put(INFORMATION_QUERY, "信息查询");
		MAP.put(TRAFFIC_TRAVEL, "交通出行");
		MAP.put(DATA_ACQUISITION, "数据采集");
	}

}
