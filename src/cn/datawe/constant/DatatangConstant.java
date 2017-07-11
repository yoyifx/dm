package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 常量类:数据堂定义参数常量
 * 
 * @author Fangx
 * 
 */
public class DatatangConstant {
	/**
	 * 错误类型：APIKey 错误
	 */
	public static final String DATATANG_ERROR_APIKEY = "ERR001";
	/**
	 * 错误类型：返回类型错误
	 */
	public static final String DATATANG_ERROR_TYPE = "ERR003";
	/**
	 * 错误类型：Apikey 过期
	 */
	public static final String DATATANG_ERROR_OVERDUE = "ERR005";
	/**
	 * 错误类型：次数超限
	 */
	public static final String DATATANG_ERROR_OUT_LIMIT = "ERR006";
	/**
	 * 错误类型：参数错误
	 */
	public static final String DATATANG_ERROR_PARAM = "ERR008";
	/**
	 * 错误类型：账户余额不足
	 */
	public static final String DATATANG_ERROR_ACCOUNT = "ERR011";
	/**
	 * 错误类型：地址不正确
	 */
	public static final String DATATANG_ERROR_URL = "ERR014";
	/**
	 * 错误类型：远端接口返回超时
	 */
	public static final String DATATANG_ERROR_TIME_OUT = "ERR022";
	/**
	 * 错误类型：返回正确
	 */
	public static final String DATATANG_SUCCESS = "00";
	/**
	 * 错误类型：姓名与身份证号不一致
	 */
	public static final String DATATANG_ERROR_ID_NAME = "01";
	/**
	 * 错误类型：身份证号码不存在
	 */
	public static final String DATATANG_ERROR_IDCARD = "02";

	/**
	 * 错误码
	 */
	public static final Map<String, String> MAP = new HashMap<String, String>();
	static {
		MAP.put(DATATANG_ERROR_APIKEY, "APIKey 错误");
		MAP.put(DATATANG_ERROR_TYPE, "返回类型错误");
		MAP.put(DATATANG_ERROR_OVERDUE, "Apikey 过期");
		MAP.put(DATATANG_ERROR_OUT_LIMIT, "次数超限");
		MAP.put(DATATANG_ERROR_PARAM, "参数错误");
		MAP.put(DATATANG_ERROR_ACCOUNT, "账户余额不足");
		MAP.put(DATATANG_ERROR_URL, "地址不正确");
		MAP.put(DATATANG_SUCCESS, "返回正确");
		MAP.put(DATATANG_ERROR_ID_NAME, "姓名与身份证号不一致");
		MAP.put(DATATANG_ERROR_IDCARD, "身份证号码不存在");
	}

	public static class Service {
		/**
		 * 身份证返照查询
		 * */
		public static final String CREDIT_QUERYIDCARD = "/credit/queryIDCard";
		/**
		 * 移动手机在网时长
		 * */
		public static final String CREDIT_CMCC_NETWORK_TIME = "/credit/queryCMCCNetworkTime";
		/**
		 * 联通手机在网时长
		 * */
		public static final String CREDIT_UNICOM_NETWORK_TIME = "/credit/queryUnicomNetworkTime";
		/**
		 * 电信手机在网时长
		 * */
		public static final String CREDIT_TELECOM_NETWORK_TIME = "/credit/queryTelecomNetworkTime";
		/**
		 * 移动手机在网状态
		 * */
		public static final String CREDIT_CMCC_NETWORK_STATUS = "/credit/queryCMCCNetworkStatus";
		/**
		 * 联通手机在网状态
		 * */
		public static final String CREDIT_UNICOM_NETWORK_STATUS = "/credit/queryUnicomNetworkStatus";
		/**
		 * 电信手机在网状态
		 * */
		public static final String CREDIT_TELECOM_NETWORK_STATUS = "/credit/queryTelecomNetworkStatus";
		/**
		 * 手机号三元素认证
		 * */
		public static final String CREDIT_MOBILE_3ELEVAL = "/credit/mobileNameId3EleVal";
	}
	
	/**
	 * 数据堂手机相关常量
	 * 类名：MobileMap
	 * @desc 
	 * @author lishasha
	 * @version 1.0
	 * @since v1.0
	 * @Date 2017年4月25日下午7:41:07
	 */
	public static class MobileConstatnt{

		/**
		 * 移动手机在网时长:3 个月以下
		 * */
		public static final String ONLINE_CMCC_1="0-3";
		/**
		 * 移动手机在网时长:3 到 6 个月
		 * */
		public static final String ONLINE_CMCC_2="3-6";
		/**
		 * 移动手机在网时长：6 到 12 个月
		 * */
		public static final String ONLINE_CMCC_3="6-12";
		/**
		 * 移动手机在网时长:12 到 18 个月
		 * */
		public static final String ONLINE_CMCC_4="12-18";
		/**
		 * 移动手机在网时长:18 到 24 个月
		 * */
		public static final String ONLINE_CMCC_5="18-24";
		/**
		 * 移动手机在网时长:24 个月以上
		 * */
		public static final String ONLINE_CMCC_6=">24";

		/**
		 * 联通手机在网时长:1 个月及以下（用户状态正常时，含义为当月入网）
		 * */
		public static final String ONLINE_UNICOM_1="1";
		/**
		 * 联通手机在网时长: 2 个月（用户状态正常时，含义为上个月入网）
		 * */
		public static final String ONLINE_UNICOM_2="1";
		/**
		 * 联通手机在网时长：3-6 个月
		 * */
		public static final String ONLINE_UNICOM_3="2";
		/**
		 * 联通手机在网时长:7-12 个月
		 * */
		public static final String ONLINE_UNICOM_4="4";
		/**
		 * 联通手机在网时长:13-24 个月
		 * */
		public static final String ONLINE_UNICOM_5="5";
		/**
		 * 联通手机在网时长:25-36 个月
		 * */
		public static final String ONLINE_UNICOM_6="6";
		/**
		 * 联通手机在网时长:37 个月及以上
		 * */
		public static final String ONLINE_UNICOM_7="7";

		/**
		 * 电信手机在网时长:0-6 个月
		 * */
		public static final String ONLINE_TELECOM_A="A";
		/**
		 * 电信手机在网时长:6-12 个月
		 * */
		public static final String ONLINE_TELECOM_B="B";
		/**
		 * 电信手机在网时长：12-24 个月
		 * */
		public static final String ONLINE_TELECOM_C="C";
		/**
		 * 电信手机在网时长:24-36 个月
		 * */
		public static final String ONLINE_TELECOM_D="D";
		/**
		 * 电信手机在网时长:36 个月及以上
		 * */
		public static final String ONLINE_TELECOM_E="E";
		/**
		 * 电信手机在网时长:无效手机号码；
		 * */
		public static final String ONLINE_TELECOM_N="N";
		/**
		 * 电信手机在网时长:号码状态有误（未开卡，挂失卡等）
		 * */
		public static final String ONLINE_TELECOM_F="F";

		/**
		 * 移动手机在网状态：查询的手机号码在网
		 * */
		public static final String STATUS_CMCC_0="0";
		/**
		 * 移动手机在网状态：查询的手机号码停机
		 * */
		public static final String STATUS_CMCC_1="1";
		/**
		 * 移动手机在网状态：查询的手机号码预销号
		 * */
		public static final String STATUS_CMCC_2="2";
		/**
		 * 移动手机在网状态：查询的手机号码销号
		 * */
		public static final String STATUS_CMCC_3="3";

		/**
		 * 联通手机在网状态：非联通
		 * */
		public static final String STATUS_UNICOM_0="0";
		/**
		 * 联通手机在网状态：未启用
		 * */
		public static final String STATUS_UNICOM_1="1";
		/**
		 * 联通手机在网状态：正常
		 * */
		public static final String STATUS_UNICOM_2="2";
		/**
		 * 联通手机在网状态：欠费停机
		 * */
		public static final String STATUS_UNICOM_3="3";
		/**
		 * 联通手机在网状态：其它停机
		 * */
		public static final String STATUS_UNICOM_4="4";
		/**
		 * 联通手机在网状态：已销号
		 * */
		public static final String STATUS_UNICOM_5="5";

		/**
		 * 电信手机在网状态：在网状态正常
		 * */
		public static final String STATUS_TELECOM_0="0";
		/**
		 * 电信手机在网状态：在网状态停机
		 * */
		public static final String STATUS_TELECOM_1="1";
		/**
		 * 电信手机在网状态：在网但不可用
		 * */
		public static final String STATUS_TELECOM_2="2";
		/**
		 * 电信手机在网状态：销号/未启用
		 * */
		public static final String STATUS_TELECOM_3="3";
		/**
		 * 电信手机在网状态：无效手机号码
		 * */
		public static final String STATUS_TELECOM_4="4";
		/**
		 * 电信手机在网状态：号码状态有误
		 * */
		public static final String STATUS_TELECOM_5="5";
		
		/**
		 * 手机实名认证：三要素身份验证不一致
		 * */
		public static final String MOBILE_AUTH_INCONSISTENT="-1";
		
		/**
		 * 手机实名认证：系统无记录
		 * */
		public static final String MOBILE_AUTH_NO_RECORD="0";
		
		/**
		 * 手机实名认证：三要素身份验证一致
		 * */
		public static final String MOBILE_AUTH_CONSISTENT="1";

		public static final Map<String, String> MOBILE_ONLINE_CMCC_MAP = new HashMap<String, String>();//移动手机在网时长
		public static final Map<String, String> MOBILE_ONLINE_UNICOM_MAP = new HashMap<String, String>();//联通手机在网时长
		public static final Map<String, String> MOBILE_ONLINE_TELECOM_MAP = new HashMap<String, String>();//电信手机在网时长
		
		public static final Map<String, String> MOBILE_STATUS_CMCC_MAP = new HashMap<String, String>();//移动手机在网状态
		public static final Map<String, String> MOBILE_STATUS_UNICOM_MAP = new HashMap<String, String>();//联通手机在网状态
		public static final Map<String, String> MOBILE_STATUS_TELECOM_MAP = new HashMap<String, String>();//电信手机在网状态
		
		public static final Map<String, String> MOBILE_AUTH_MAP = new HashMap<String, String>();//手机实名认证
		static{
			MOBILE_ONLINE_CMCC_MAP.put(ONLINE_CMCC_1, MobileConstant.ONLINE_INTERVAL_1);
			MOBILE_ONLINE_CMCC_MAP.put(ONLINE_CMCC_2, MobileConstant.ONLINE_INTERVAL_2);
			MOBILE_ONLINE_CMCC_MAP.put(ONLINE_CMCC_3, MobileConstant.ONLINE_INTERVAL_3);
			MOBILE_ONLINE_CMCC_MAP.put(ONLINE_CMCC_4, MobileConstant.ONLINE_INTERVAL_4);
			MOBILE_ONLINE_CMCC_MAP.put(ONLINE_CMCC_5, MobileConstant.ONLINE_INTERVAL_4);
			MOBILE_ONLINE_CMCC_MAP.put(ONLINE_CMCC_6, MobileConstant.ONLINE_INTERVAL_5);

			MOBILE_ONLINE_UNICOM_MAP.put(ONLINE_UNICOM_1, MobileConstant.ONLINE_INTERVAL_1);
			MOBILE_ONLINE_UNICOM_MAP.put(ONLINE_UNICOM_2, MobileConstant.ONLINE_INTERVAL_1);
			MOBILE_ONLINE_UNICOM_MAP.put(ONLINE_UNICOM_3, MobileConstant.ONLINE_INTERVAL_2);
			MOBILE_ONLINE_UNICOM_MAP.put(ONLINE_UNICOM_4, MobileConstant.ONLINE_INTERVAL_3);
			MOBILE_ONLINE_UNICOM_MAP.put(ONLINE_UNICOM_5, MobileConstant.ONLINE_INTERVAL_4);
			MOBILE_ONLINE_UNICOM_MAP.put(ONLINE_UNICOM_6, MobileConstant.ONLINE_INTERVAL_5);
			MOBILE_ONLINE_UNICOM_MAP.put(ONLINE_UNICOM_7, MobileConstant.ONLINE_INTERVAL_5);

			MOBILE_ONLINE_TELECOM_MAP.put(ONLINE_TELECOM_A, MobileConstant.ONLINE_INTERVAL_2);
			MOBILE_ONLINE_TELECOM_MAP.put(ONLINE_TELECOM_B, MobileConstant.ONLINE_INTERVAL_3);
			MOBILE_ONLINE_TELECOM_MAP.put(ONLINE_TELECOM_C, MobileConstant.ONLINE_INTERVAL_4);
			MOBILE_ONLINE_TELECOM_MAP.put(ONLINE_TELECOM_D, MobileConstant.ONLINE_INTERVAL_5);
			MOBILE_ONLINE_TELECOM_MAP.put(ONLINE_TELECOM_E, MobileConstant.ONLINE_INTERVAL_5);


			MOBILE_STATUS_CMCC_MAP.put(STATUS_CMCC_0, MobileConstant.STATUS_IN_NET);
			MOBILE_STATUS_CMCC_MAP.put(STATUS_CMCC_1, MobileConstant.STATUS_STOP);
			MOBILE_STATUS_CMCC_MAP.put(STATUS_CMCC_2, MobileConstant.STATUS_IN_NET_NOT_USE);
			MOBILE_STATUS_CMCC_MAP.put(STATUS_CMCC_3, MobileConstant.STATUS_PIN_NUM);

			MOBILE_STATUS_UNICOM_MAP.put(STATUS_UNICOM_1, MobileConstant.STATUS_NOT_ENABLED);
			MOBILE_STATUS_UNICOM_MAP.put(STATUS_UNICOM_2, MobileConstant.STATUS_IN_NET);
			MOBILE_STATUS_UNICOM_MAP.put(STATUS_UNICOM_3, MobileConstant.STATUS_STOP);
			MOBILE_STATUS_UNICOM_MAP.put(STATUS_UNICOM_4, MobileConstant.STATUS_STOP);
			MOBILE_STATUS_UNICOM_MAP.put(STATUS_UNICOM_5, MobileConstant.STATUS_PIN_NUM);

			MOBILE_STATUS_TELECOM_MAP.put(STATUS_TELECOM_0, MobileConstant.STATUS_IN_NET);
			MOBILE_STATUS_TELECOM_MAP.put(STATUS_TELECOM_1, MobileConstant.STATUS_STOP);
			MOBILE_STATUS_TELECOM_MAP.put(STATUS_TELECOM_2, MobileConstant.STATUS_IN_NET_NOT_USE);
			MOBILE_STATUS_TELECOM_MAP.put(STATUS_TELECOM_3, MobileConstant.STATUS_PIN_NUM);

			MOBILE_AUTH_MAP.put(MOBILE_AUTH_INCONSISTENT, MobileConstant.MOBILE_AUTH_INCONSISTENT);
			MOBILE_AUTH_MAP.put(MOBILE_AUTH_CONSISTENT, MobileConstant.MOBILE_AUTH_CONSISTENT);
			MOBILE_AUTH_MAP.put(MOBILE_AUTH_NO_RECORD, MobileConstant.MOBILE_AUTH_NO_RECORD);
		}
	}
}
