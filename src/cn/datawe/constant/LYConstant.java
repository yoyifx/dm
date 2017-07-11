/**
 * 工程名：project-util
 * 包名：cn.datawe.constant
 */
package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 类名：LYConstant
 * 
 * @desc 同程金服常量
 * @author lishasha
 * @version 1.0
 * @since v1.0
 * @Date 2017-2-23下午03:39:42
 */
public class LYConstant {

	/**
	 * 同程金服返回码：系统繁忙，请稍后再试。内部错误
	 * */
	public static final String REQUEST_CODE_ERROR = "-1";
	/**
	 * 同程金服返回码：请求成功
	 * */
	public static final String REQUEST_CODE_OK = "0";
	/**
	 * 同程金服返回码：访问路径不存在
	 * */
	public static final String REQUEST_CODE_URL_ERROR = "404";
	/**
	 * 同程金服返回码：认证失败
	 * */
	public static final String REQUEST_CODE_AUTH_FAIL = "10001";
	/**
	 * 同程金服返回码：必要参数校验失败
	 * */
	public static final String REQUEST_CODE_PARAMS_VERIFY_ERROR = "20001";
	/**
	 * 同程金服返回码：没有接口访问权限
	 * */
	public static final String REQUEST_CODE_NOT_ACCESS = "20002";
	/**
	 * 同程金服返回码：数据源错误
	 * */
	public static final String REQUEST_CODE_DATA_SOURCE_ERROR = "20003";
	/**
	 * 同程金服返回码：暂不支持此数据查询
	 * */
	public static final String REQUEST_CODE_NOT_SUPPORT = "20004";
	/**
	 * 同程金服返回码：超过接口限制或账户余额不足，请联系同程商务
	 * */
	public static final String REQUEST_CODE_OVER_LIMIT = "30001";
	/**
	 * 同程金服返回码：解密数据异常，验签失败，或传入数据有误
	 * */
	public static final String REQUEST_CODE_DECRY_ERROR = "40001";
	/**
	 * 同程金服返回码：授权token无效或过期
	 * */
	public static final String REQUEST_CODE_TOKEN_ERROR = "50001";
	/**
	 * 同程金服返回码：IP访问受限
	 * */
	public static final String REQUEST_CODE_BLACKLIST_IP = "60001";
	/**
	 * 同程金服身份认证返回编码：查无记录
	 * */
	public static final String IDENTIFY_RESULT_NO_RECORD = "-1";
	/**
	 * 同程金服身份认证返回编码：认证不一致
	 * */
	public static final String IDENTIFY_RESULT_INCONSISTENT = "0";
	/**
	 * 同程金服身份认证返回编码：认证一致
	 * */
	public static final String IDENTIFY_RESULT_CONSISTENT = "1";

	/**
	 * 同程金服银行卡认证返回编码：要素匹配
	 * */
	public static final String IDENTIFY_CODE_OK = "0000";
	/**
	 * 同程金服银行卡认证返回编码：银行卡与其他要素不匹配
	 * */
	public static final String IDENTIFY_CODE_BANK_NOT_MATCH_OTHER = "1001";
	/**
	 * 同程金服银行卡认证返回编码：身份证与其他要素不匹配
	 * */
	public static final String IDENTIFY_CODE_IDACRD_NOT_MATCH_OTHER = "1002";
	/**
	 * 同程金服银行卡认证返回编码：姓名与其他要素不匹配
	 * */
	public static final String IDENTIFY_CODE_NAME_NOT_MATCH_OTHER = "1003";
	/**
	 * 同程金服银行卡认证返回编码：银行卡与身份证不匹配
	 * */
	public static final String IDENTIFY_CODE_BANK_NOT_MATCH_IDCARD = "1004";
	/**
	 * 同程金服银行卡认证返回编码：不支持该银行验证
	 * */
	public static final String IDENTIFY_CODE_BANK_NOT_SUPPORT = "1005";
	/**
	 * 同程金服银行卡认证返回编码：卡无效或过期卡
	 * */
	public static final String IDENTIFY_CODE_BANK_INVALID_CARD = "1006";
	/**
	 * 同程金服银行卡认证返回编码：受限制的卡，建议换卡操作
	 * */
	public static final String IDENTIFY_CODE_BANK_LIMITED_CARD = "1007";
	/**
	 * 同程金服银行卡认证返回编码：要素不匹配
	 * */
	public static final String IDENTIFY_CODE_KEY_ELE_MISMATCH = "1100";
	/**
	 * 同程金服银行卡认证返回编码：信息不存在
	 * */
	public static final String IDENTIFY_CODE_INFO_NOT_EXIST = "9999";

	public static final Map<String, String> MAP = new HashMap<String, String>();
	
	public static final Map<String, String> LogMap=new HashMap<String, String>();

	static {
		MAP.put(REQUEST_CODE_ERROR, "系统繁忙，请稍后再试。内部错误");
		MAP.put(REQUEST_CODE_OK, "请求成功");
		MAP.put(REQUEST_CODE_URL_ERROR, "访问路径不存在");
		MAP.put(REQUEST_CODE_AUTH_FAIL, "认证失败");
		MAP.put(REQUEST_CODE_PARAMS_VERIFY_ERROR, "必要参数校验失败");
		MAP.put(REQUEST_CODE_NOT_ACCESS, "没有接口访问权限");
		MAP.put(REQUEST_CODE_DATA_SOURCE_ERROR, "REQUEST_CODE_DATA_SOURCE_ERROR");
		MAP.put(REQUEST_CODE_NOT_SUPPORT, "暂不支持此数据查询");
		MAP.put(REQUEST_CODE_OVER_LIMIT, "超过接口限制或账户余额不足，请联系同程商务");
		MAP.put(REQUEST_CODE_DECRY_ERROR, "解密数据异常，验签失败，或传入数据有误");
		MAP.put(REQUEST_CODE_TOKEN_ERROR, "授权token无效或过期");
		MAP.put(REQUEST_CODE_BLACKLIST_IP, "IP访问受限");

		LogMap.put(REQUEST_CODE_ERROR, LogErrorCodeConstant.SYSTEM_ERROR);
		LogMap.put(REQUEST_CODE_URL_ERROR, LogErrorCodeConstant.REMOTE_UNKNOWN_HOST_ERROR);
		LogMap.put(REQUEST_CODE_AUTH_FAIL, LogErrorCodeConstant.AUTH_FAIL);
		LogMap.put(REQUEST_CODE_PARAMS_VERIFY_ERROR, LogErrorCodeConstant.PARAM_MISSING);
		LogMap.put(REQUEST_CODE_NOT_ACCESS, LogErrorCodeConstant.NOT_ACCESS);
		LogMap.put(REQUEST_CODE_DATA_SOURCE_ERROR, LogErrorCodeConstant.SYSTEM_ERROR);
		LogMap.put(REQUEST_CODE_NOT_SUPPORT, LogErrorCodeConstant.API_ERROR);
		LogMap.put(REQUEST_CODE_OVER_LIMIT, LogErrorCodeConstant.CLIENT_NO_BALANCE);
		LogMap.put(REQUEST_CODE_DECRY_ERROR, LogErrorCodeConstant.PARSE_DATA_ERROR);
		LogMap.put(REQUEST_CODE_TOKEN_ERROR, LogErrorCodeConstant.REMOTE_RETURN_TOKEN_ERROR);
		LogMap.put(REQUEST_CODE_BLACKLIST_IP, LogErrorCodeConstant.USER_IP_NOT_WHITELIST);
		
		MAP.put(IDENTIFY_RESULT_NO_RECORD, "查无记录");
		MAP.put(IDENTIFY_RESULT_INCONSISTENT, "认证不一致");
		MAP.put(IDENTIFY_RESULT_CONSISTENT, "认证一致");

		MAP.put(IDENTIFY_CODE_OK, "要素匹配");
		MAP.put(IDENTIFY_CODE_BANK_NOT_MATCH_OTHER, "银行卡与其他要素不匹配");
		MAP.put(IDENTIFY_CODE_IDACRD_NOT_MATCH_OTHER, "身份证与其他要素不匹配");
		MAP.put(IDENTIFY_CODE_NAME_NOT_MATCH_OTHER, "姓名与其他要素不匹配");
		MAP.put(IDENTIFY_CODE_BANK_NOT_MATCH_IDCARD, "银行卡与身份证不匹配");
		MAP.put(IDENTIFY_CODE_BANK_NOT_SUPPORT, "不支持该银行验证");
		MAP.put(IDENTIFY_CODE_BANK_INVALID_CARD, "卡无效或过期卡");
		MAP.put(IDENTIFY_CODE_BANK_LIMITED_CARD, "受限制的卡，建议换卡操作");
		MAP.put(IDENTIFY_CODE_KEY_ELE_MISMATCH, "要素不匹配");
		MAP.put(IDENTIFY_CODE_INFO_NOT_EXIST, "信息不存在");
	}
	
	public static class MobileConstantMap {

		/**
		 * 手机三要素实名认证：查无记录
		 * */
		public static final String MOBILE_AUTH_INCONSISTENT = "-1";

		/**
		 * 手机三要素实名认证：认证不一致
		 * */
		public static final String MOBILE_AUTH_NO_RECORD = "0";

		/**
		 * 手机三要素实名认证：认证一致
		 * */
		public static final String MOBILE_AUTH_CONSISTENT = "1";
		
		/**
		 * 手机在网时长:(0,3]
		 * */
		public static final String ONLINE_1="03";
		
		/**
		 * 手机在网时长:(3,6]
		 * */
		public static final String ONLINE_2="04";
		
		/**
		 * 手机在网时长:(6,12]
		 * */
		public static final String ONLINE_3="1";
		
		/**
		 * 手机在网时长:(12,24]
		 * */
		public static final String ONLINE_4="2";
		
		/**
		 * 手机在网时长:(24,+)
		 * */
		public static final String ONLINE_5="3";
		
		/**
		 * 手机在网状态:正常使用
		 * */
		public static final String STATUS_0="0";
		
		/**
		 * 手机在网状态:停机
		 * */
		public static final String STATUS_1="1";
		
		/**
		 * 手机在网状态:在网但不可用
		 * */
		public static final String STATUS_2="2";
		
		/**
		 * 手机在网状态:不在网
		 * */
		public static final String STATUS_3="3";
		
		/**
		 * 手机在网状态:预销户或空号
		 * */
		public static final String STATUS_4="4";

		public static final Map<String, String> MOBILE_AUTH_MAP = new HashMap<String, String>();
		public static final Map<String, String> MOBILE_ONLINE_MAP = new HashMap<String, String>();
		public static final Map<String, String> MOBILE_STATUS_MAP = new HashMap<String, String>();

		static {
			MOBILE_AUTH_MAP.put(MOBILE_AUTH_INCONSISTENT, MobileConstant.MOBILE_AUTH_NO_RECORD);
			MOBILE_AUTH_MAP.put(MOBILE_AUTH_CONSISTENT, MobileConstant.MOBILE_AUTH_CONSISTENT);
			MOBILE_AUTH_MAP.put(MOBILE_AUTH_NO_RECORD, MobileConstant.MOBILE_AUTH_INCONSISTENT);

			MOBILE_ONLINE_MAP.put(ONLINE_1, MobileConstant.ONLINE_INTERVAL_1);
			MOBILE_ONLINE_MAP.put(ONLINE_2, MobileConstant.ONLINE_INTERVAL_2);
			MOBILE_ONLINE_MAP.put(ONLINE_3, MobileConstant.ONLINE_INTERVAL_3);
			MOBILE_ONLINE_MAP.put(ONLINE_4, MobileConstant.ONLINE_INTERVAL_4);
			MOBILE_ONLINE_MAP.put(ONLINE_5, MobileConstant.ONLINE_INTERVAL_5);

			MOBILE_STATUS_MAP.put(STATUS_0, MobileConstant.STATUS_IN_NET);
			MOBILE_STATUS_MAP.put(STATUS_1, MobileConstant.STATUS_STOP);
			MOBILE_STATUS_MAP.put(STATUS_2, MobileConstant.STATUS_IN_NET_NOT_USE);
			MOBILE_STATUS_MAP.put(STATUS_3, MobileConstant.STATUS_NOT_ENABLED);
			MOBILE_STATUS_MAP.put(STATUS_4, MobileConstant.STATUS_EMPTY_NUM);
		}
	}

	/**
	 * 同程金服远端请求服务名
	 * */
	public class Service {
		/**
		 * 获取调用凭证接口
		 * */
		public static final String SERVICE_TOKEN = "token";
		/**
		 * 
		 * */
		public static final String ACCESS_TOKEN="?access_token=";
		/**
		 * 身份证实名三要素
		 * */
		public static final String IDENTIFY_IDCARD_PHOTO = "api/identify/idcard/photo";
		/**
		 * 身份证实名二要素
		 * */
		public static final String IDENTIFY_IDCARD = "api/identify/idcard";
		/**
		 * 银行卡四要素
		 * */
		public static final String IDENTIFY_IDCARD_BANK_FOUR = "api/identify/idcard/bank/four";
		/**
		 * 银行卡三要素
		 * */
		public static final String IDENTIFY_IDCARD_BANK_THREE = "api/identify/idcard/bank";
		/**
		 * 手机号三要素认证
		 * */
		public static final String IDENTIFY_MOBILE_THREE = "api/identify/idcard/mobile";
		/**
		 * 手机号二要素认证
		 * */
		public static final String IDENTIFY_MOBILE_TWO = "api/mobile/identifyName";
		/**
		 * 手机在网时长
		 * */
		public static final String MOBILE_ONLINE = "api/mobile/online";
		/**
		 * 手机在网状态
		 * */
		public static final String MOBILE_STATUS = "api/mobile/status";
		/**
		 * 手机号月消费档次
		 * */
		public static final String MOBILE_CONSUMPTION_LEVEL = "api/mobile/consumptionLevel";
		/**
		 * 学历信息认证
		 * */
		public static final String IDENTIFY_EDUCATION = "api/identify/idcard/education";
		/**
		 * 金融稳定性分析
		 * */
		public static final String MOBILE_MESSAGE_BILL = "api/mobile/messageBill";
	}

}
