package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

import cn.datawe.util.ValidatorUtil;

/**
 * 数据源管理常量类
 * 
 * @author Fangx
 * 
 */
public class DataSourceConstant {
	/**
	 * 开通状态：未开通
	 */
	public static final int OPEN_STATUS_CLOSED = 0;
	/**
	 * 开通状态：已开通
	 */
	public static final int OPEN_STATUS_OPEN = 1;

	/**
	 * 数据源状态：暂停
	 */
	public static final int SOURCE_STATUS_CLOSED = 0;
	/**
	 * 数据源状态：启用
	 */
	public static final int SOURCE_STATUS_OPEN = 1;

	/**
	 * 缓存开启状态：未开启
	 */
	public static final int CACHE_SWITCH_CLOSED = 0;
	/**
	 * 缓存开启状态：已开启
	 */
	public static final int CACHE_SWITCH_OPEN = 1;

	/**
	 * 数据源类别：身份验证
	 */
	public static final int SOURCE_TYPE_IDENTITY = 1;
	/**
	 * 数据源类别：风险查询
	 */
	public static final int SOURCE_TYPE_RISK = 2;
	/**
	 * 数据源类别：信用报告
	 */
	public static final int SOURCE_TYPE_CREDIT = 3;
	/**
	 * 数据源类别：信息查询
	 */
	public static final int SOURCE_TYPE_INFO_QUERY = 4;
	/**
	 * 数据源类别：交通出行
	 */
	public static final int SOURCE_TYPE_TRAFFIC = 5;
	/**
	 * 数据源类别：数据采集
	 */
	public static final int SOURCE_TYPE_ACQUIRE = 6;
	/**
	 * 数据源类别：特征数据
	 */
	public static final int SOURCE_TYPE_FEATURE = 7;

	/**
	 * 运营商详单类别：通话记录
	 */
	public static final String CALL_TYPE_CALL = "1";
	/**
	 * 运营商详单类别：短信记录
	 */
	public static final String CALL_TYPE_SMS = "2";
	/**
	 * 运营商详单类别：月账单记录
	 */
	public static final String CALL_TYPE_BILL = "3";

	/**
	 * 数据资产类别
	 */
	public static final Map<Integer, String> DATA_TYPE_MAP = new HashMap<Integer, String>();

	public static final Map<Object, Object> MAP = new HashMap<Object, Object>();

	/**
	 * 非校验入参数据源
	 */
	public static final String[] UNCHECK_SOURCE = { RemoteCodeConstant.REMOTE_10016, RemoteCodeConstant.REMOTE_10017, RemoteCodeConstant.REMOTE_10018, RemoteCodeConstant.REMOTE_20000 };

	static {
		DATA_TYPE_MAP.put(SOURCE_TYPE_IDENTITY, "第三方数据源");
		DATA_TYPE_MAP.put(SOURCE_TYPE_RISK, "第三方数据源");
		DATA_TYPE_MAP.put(SOURCE_TYPE_CREDIT, "第三方数据源");
		DATA_TYPE_MAP.put(SOURCE_TYPE_INFO_QUERY, "第三方数据源");
		DATA_TYPE_MAP.put(SOURCE_TYPE_TRAFFIC, "第三方数据源");
		DATA_TYPE_MAP.put(SOURCE_TYPE_ACQUIRE, "业务数据");
		DATA_TYPE_MAP.put(SOURCE_TYPE_FEATURE, "特征数据");
	}

	public static Integer[] types(String dataType) {
		if (ValidatorUtil.isEmptyIgnoreBlank(dataType)) {
			return null;
		}
		if (ValidatorUtil.isEquals(dataType, "1")) {
			Integer[] types = { SOURCE_TYPE_IDENTITY, SOURCE_TYPE_RISK, SOURCE_TYPE_CREDIT, SOURCE_TYPE_INFO_QUERY, SOURCE_TYPE_TRAFFIC };
			return types;
		} else if (ValidatorUtil.isEquals(dataType, "2")) {
			Integer[] types = { SOURCE_TYPE_ACQUIRE };
			return types;
		} else if (ValidatorUtil.isEquals(dataType, "3")) {
			Integer[] types = { SOURCE_TYPE_FEATURE };
			return types;
		} else {
			return null;
		}
	}

}
