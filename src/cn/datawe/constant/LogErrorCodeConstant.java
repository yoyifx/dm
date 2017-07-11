package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 常量类:日志表中记录的接口详细错误码
 * 
 * @author LiuJiaLe
 * 
 */
public class LogErrorCodeConstant {
	
	/******************************************
	 * 错误码定义
	 * 1xxx,2xxx,3xxx: 系统错误
	 * 4xxx,5xxx,6xxx: 业务错误
	 * 7xxx,8xxx,9xxx: 远程接口错误
	 ******************************************/

	/**
	 * 系统异常
	 */
	public static final String SYSTEM_ERROR = "1000";
	
	/**
	 * 数据异常
	 */
	public static final String DATA_ERROR = "1001";
	
	/**
	 * 数据解析失败
	 */
	public static final String PARSE_DATA_ERROR = "1002";
	
	/**
	 * XML解析失败
	 */
	public static final String PARSE_XML_ERROR = "1003";
	
	/**
	 * JSON解析失败
	 */
	public static final String PARSE_JSON_ERROR = "1004";
	
	/**
	 * 缺少请求参数
	 */
	public static final String PARAM_MISSING = "2000";
	
	/**
	 * 请求参数的数据格式不正确
	 */
	public static final String PARAM_FORMAT_ERROR = "2001";
	
	/**
	 * 请求参数的数据类型不正确
	 */
	public static final String PARAM_TYPE_ERROR = "2002";
	
	/**
	 * 请求参数的数据取值范围不正确
	 */
	public static final String PARAM_RANGE_ERROR = "2003";

	/**
	 * 请求参数解密失败
	 */
	public static final String PARAM_DECRYPT_ERROR = "2004";

	/**
	 * 请求参数加密失败
	 */
	public static final String PARAM_ENCRYPT_ERROR = "2005";

	/**
	 * 缺少配置信息
	 */
	public static final String CONFIG_MISSING = "3000";
	
	/**
	 * 配置信息的数据格式不正确
	 */
	public static final String CONFIG_FORMAT_ERROR = "3001";
	
	/**
	 * 配置信息的数据类型不正确
	 */
	public static final String CONFIG_TYPE_ERROR = "3002";
	
	/**
	 * 配置信息的数据取值范围不正确
	 */
	public static final String CONFIG_RANGE_ERROR = "3003";

	/**
	 * 配置信息解密失败
	 */
	public static final String CONFIG_DECRYPT_ERROR = "3004";
	
	/**
	 * 没有找到配置文件
	 */
	public static final String CONFIG_FILE_NOT_FOUND = "3005";
	
	/**
	 * 批量提交数据已结束
	 */
	public static final String BATCH_SUBMIT_DATA_FINISHED = "4000";
	
	/**
	 * 批量提交数据未结束
	 */
	public static final String BATCH_SUBMIT_DATA_UNFINISHED = "4001";

	/**
	 * 获取接口信息出错了
	 */
	public static final String API_ERROR = "5000";
	
	/**
	 * 该接口已停用
	 */
	public static final String API_CLOSED = "5001";

	/**
	 * 客户余额不足
	 */
	public static final String CLIENT_NO_BALANCE  = "6000";

	/**
	 * 用户用户IP不正确
	 */
	public static final String USER_IP_ERROR  = "6001";

	/**
	 * IP不在白名单范围内
	 */
	public static final String USER_IP_NOT_WHITELIST  = "6002";

	/**
	 * IP白名单缺失
	 */
	public static final String USER_IP_WHITELIST_MISSING  = "6003";
	
	/**
	 * 认证失败
	 * */
	public static final String AUTH_FAIL="7000";
	/**
	 * 没有访问权限
	 * */
	public static final String NOT_ACCESS="7001";
	
	/**
	 * 远程接口系统异常
	 */
	public static final String REMOTE_ERROR = "9000";
	
	/**
	 * 远程接口请求地址无法访问
	 */
	public static final String REMOTE_UNKNOWN_HOST_ERROR = "9001";

	/**
	 * 远程接口请求超时
	 */
	public static final String REMOTE_CONNECT_TIMEOUT_ERROR = "9002";
	
	/**
	 * 远程接口响应超时
	 */
	public static final String REMOTE_SOCKET_TIMEOUT_ERROR = "9003";
	
	/**
	 * 远程接口返回结果不正确
	 */
	public static final String REMOTE_RETURN_RESULT_ERROR = "9004";
	
	/**
	 * 远程接口返回错误
	 */
	public static final String REMOTE_RETURN_ERROR = "9005";

	/**
	 * 远程接口返回数据不正确
	 */
	public static final String REMOTE_RETURN_DATA_ERROR = "9006";
	
	/**
	 * 远程接口返回数据验签失败
	 */
	public static final String REMOTE_RETURN_SIGN_ERROR = "9007";
	
	/**
	 * 异步接口仍在处理中
	 */
	public static final String ASYNS_API_PROCESSING = "9008";
	
	/**
	 * 远程接口Token无效 
	 */
	public static final String REMOTE_RETURN_TOKEN_ERROR = "9009";
	
	/**
	 * 请求参数无效
	 */
	public static final String PARAM_INVALID = "9010";
	
	/**
	 * 获取远程接口Token过于频繁
	 */
	public static final String REMOTE_RETURN_TOKEN_FREQUENT = "9011";
	
	public static final Map<String, String> MAP = new HashMap<String, String>();

	static {

		MAP.put(LogErrorCodeConstant.SYSTEM_ERROR, "系统错误");
		MAP.put(LogErrorCodeConstant.PARAM_MISSING, "缺少请求参数");
		MAP.put(LogErrorCodeConstant.PARAM_FORMAT_ERROR, "请求参数的数据格式不正确");
		MAP.put(LogErrorCodeConstant.PARAM_TYPE_ERROR, "请求参数的数据类型不正确");
		MAP.put(LogErrorCodeConstant.PARAM_RANGE_ERROR, "请求参数的数据取值范围不正确");
		MAP.put(LogErrorCodeConstant.PARAM_DECRYPT_ERROR, "请求参数解密失败");
		MAP.put(LogErrorCodeConstant.CONFIG_MISSING, "缺少配置信息");
		MAP.put(LogErrorCodeConstant.CONFIG_FORMAT_ERROR, "配置信息的数据格式不正确");
		MAP.put(LogErrorCodeConstant.CONFIG_TYPE_ERROR, "配置信息的数据类型不正确");
		MAP.put(LogErrorCodeConstant.CONFIG_RANGE_ERROR, "配置信息的数据取值范围不正确");
		MAP.put(LogErrorCodeConstant.CONFIG_DECRYPT_ERROR, "配置信息解密失败");
		MAP.put(LogErrorCodeConstant.CONFIG_FILE_NOT_FOUND, "没有找到配置文件");
		MAP.put(LogErrorCodeConstant.PARSE_DATA_ERROR, "数据解析失败");
		MAP.put(LogErrorCodeConstant.PARSE_XML_ERROR, "XML解析失败");
		MAP.put(LogErrorCodeConstant.PARSE_JSON_ERROR, "JSON解析失败");
		
		MAP.put(LogErrorCodeConstant.BATCH_SUBMIT_DATA_FINISHED, "批量提交数据已结束");
		MAP.put(LogErrorCodeConstant.BATCH_SUBMIT_DATA_UNFINISHED, "批量提交数据未结束");
		MAP.put(LogErrorCodeConstant.API_ERROR, "获取接口信息出错了");
		MAP.put(LogErrorCodeConstant.API_CLOSED, "该接口已停用");
		MAP.put(LogErrorCodeConstant.CLIENT_NO_BALANCE, "客户余额不足");
		MAP.put(LogErrorCodeConstant.USER_IP_ERROR, "用户用户IP不正确");
		MAP.put(LogErrorCodeConstant.USER_IP_NOT_WHITELIST, "IP不在白名单范围内");
		MAP.put(LogErrorCodeConstant.USER_IP_WHITELIST_MISSING, "IP白名单缺失");
		
		MAP.put(LogErrorCodeConstant.REMOTE_ERROR, "远程接口错误");
		MAP.put(LogErrorCodeConstant.REMOTE_UNKNOWN_HOST_ERROR, "远程接口请求地址无法访问");
		MAP.put(LogErrorCodeConstant.REMOTE_CONNECT_TIMEOUT_ERROR, "远程接口请求超时");
		MAP.put(LogErrorCodeConstant.REMOTE_SOCKET_TIMEOUT_ERROR, "远程接口响应超时");
		MAP.put(LogErrorCodeConstant.REMOTE_RETURN_RESULT_ERROR, "远程接口返回结果不正确");
		MAP.put(LogErrorCodeConstant.REMOTE_RETURN_ERROR, "远程接口返回错误");
		MAP.put(LogErrorCodeConstant.REMOTE_RETURN_DATA_ERROR, "远程接口返回数据不正确");
		MAP.put(LogErrorCodeConstant.REMOTE_RETURN_SIGN_ERROR, "远程接口验签失败");
		MAP.put(LogErrorCodeConstant.ASYNS_API_PROCESSING, "异步接口仍在处理中");
		MAP.put(LogErrorCodeConstant.REMOTE_RETURN_TOKEN_ERROR, "远程接口Token无效");
		MAP.put(LogErrorCodeConstant.PARAM_INVALID, "请求参数无效");
		MAP.put(LogErrorCodeConstant.REMOTE_RETURN_TOKEN_FREQUENT, "获取远程接口Token过于频繁");
	}
	
	/**
	 * 常量类：汇法网，查询主题
	 * @author ChenYunyu
	 *
	 */
	public static class LawxpTopicConstant {
		
		/**
		 * 执行公开信息
		 */
		public static final String EXCUTION_OVERT_INFO = "11";
		
		/**
		 * 失信老赖名单
		 */
		public static final String BREAK_PROMISE_ROLL = "12";
		
		/**
		 * 限制高消费名单
		 */
		public static final String LIMIT_HIGH_COS_ROLL = "13";
		
		/**
		 * 限制出入境名单
		 */
		public static final String LIMIT_EXIT_ENTRY_ROLL = "14";
		
		/**
		 * 民商事裁判文书
		 */
		public static final String CIVIL_COMM_JUD_DOC = "15";
		
		/**
		 * 民商事审判流程
		 */
		public static final String CIVIL_COMM_TRIAL_PRD = "16";
		
		/**
		 * 罪犯及嫌疑人名单
		 */
		public static final String CRIMINAL_SUSPECT_ROLL = "17";
		
		/**
		 * 行政违法记录
		 */
		public static final String ADM_ILLEGAL_RECORD = "18";
		
		/**
		 * 欠税名单
		 */
		public static final String OWE_TAX_ROLL = "19";
		
		/**
		 * 纳税非正常户
		 */
		public static final String PAY_TAX_NOT_NORMAL = "20";
		
		/**
		 * 欠款欠费名单
		 */
		public static final String OWE_PAYMENT_ROLL = "21";
		
		public static final Map<String, String> MAP = new HashMap<String, String>();
		static {
			MAP.put(EXCUTION_OVERT_INFO, "执行公开信息");
			MAP.put(BREAK_PROMISE_ROLL, "失信老赖名单");
			MAP.put(LIMIT_HIGH_COS_ROLL, "限制高消费名单");
			MAP.put(LIMIT_EXIT_ENTRY_ROLL, "限制出入境名单");
			MAP.put(CIVIL_COMM_JUD_DOC, "民商事裁判文书");
			MAP.put(CIVIL_COMM_TRIAL_PRD, "民商事审判流程");
			MAP.put(CRIMINAL_SUSPECT_ROLL, "罪犯及嫌疑人名单");
			MAP.put(ADM_ILLEGAL_RECORD, "行政违法记录");
			MAP.put(OWE_TAX_ROLL, "欠税名单");
			MAP.put(PAY_TAX_NOT_NORMAL, "纳税非正常户");
			MAP.put(OWE_PAYMENT_ROLL, "欠款欠费名单");
		}
		
		/**
		 * 定义主题对应的KEY
		 */
		public static final Map<String, String> TOPIC_KEY_MAP = new HashMap<String, String>();
		static {
			TOPIC_KEY_MAP.put(EXCUTION_OVERT_INFO, "zxInfo");
			TOPIC_KEY_MAP.put(BREAK_PROMISE_ROLL, "sxInfo");
			TOPIC_KEY_MAP.put(LIMIT_HIGH_COS_ROLL, "gxfInfo");
			TOPIC_KEY_MAP.put(LIMIT_EXIT_ENTRY_ROLL, "crjInfo");
			TOPIC_KEY_MAP.put(CIVIL_COMM_JUD_DOC, "cpInfo");
			TOPIC_KEY_MAP.put(CIVIL_COMM_TRIAL_PRD, "spInfo");
			TOPIC_KEY_MAP.put(CRIMINAL_SUSPECT_ROLL, "xyrInfo");
			TOPIC_KEY_MAP.put(ADM_ILLEGAL_RECORD, "wfInfo");
			TOPIC_KEY_MAP.put(OWE_TAX_ROLL, "qsInfo");
			TOPIC_KEY_MAP.put(PAY_TAX_NOT_NORMAL, "nsInfo");
			TOPIC_KEY_MAP.put(OWE_PAYMENT_ROLL, "qkInfo");
		}
		
		/**
		 * 枚举类：汇法网，查询主题
		 * @author ChenYunyu
		 *
		 */
		public enum LawxpTopicEnum {
			ITEM0(EXCUTION_OVERT_INFO, "执行公开信息"),
			ITEM1(BREAK_PROMISE_ROLL, "失信老赖名单"),
			ITEM2(LIMIT_HIGH_COS_ROLL, "限制高消费名单"),
			ITEM3(LIMIT_EXIT_ENTRY_ROLL, "限制出入境名单"),
			ITEM4(CIVIL_COMM_JUD_DOC, "民商事裁判文书"),
			ITEM5(CIVIL_COMM_TRIAL_PRD, "民商事审判流程"),
			ITEM6(CRIMINAL_SUSPECT_ROLL, "罪犯及嫌疑人名单"),
			ITEM7(ADM_ILLEGAL_RECORD, "行政违法记录"),
			ITEM8(OWE_TAX_ROLL, "欠税名单"),
			ITEM9(PAY_TAX_NOT_NORMAL, "纳税非正常户"),
			ITEM10(OWE_PAYMENT_ROLL, "欠款欠费名单");
			
			private LawxpTopicEnum(String id, String caption) {
				this.id = id;
				this.caption = caption;
			}
			
			private String id;
			private String caption;
			
			public String getId() {
				return id;
			}

			public String getCaption() {
				return caption;
			}
			
			public static String getId(String caption) {
				if (null != caption && caption.trim().length() > 0) {
					for (LawxpTopicEnum e : LawxpTopicEnum.values()) {
						if(caption.equals(e.getCaption())){
							return e.getId();
						}
					}
				}
				return null;
			}
			
			public static String getCaption(String id) {
				return getCaption(id, id);
			}
			
			public static String getCaption(String id, String caption) {
				if (null != id && id.trim().length() > 0) {
					for (LawxpTopicEnum e : LawxpTopicEnum.values()) {
						if (id.equals(e.getId()) || id.equalsIgnoreCase(e.toString())) {
							return e.getCaption();
						}
					}
				}
				return caption;
			}
			
		}
	}
	
	/**
	 * 枚举类：汇法网查询结果明细.
	 * 对应远端json结果中 onemsglist 对象中的 propername 数据
	 * @author ChenYunyu
	 *
	 */
	public static enum LawxpResultDetailEnum {
		ITEM1("caseNo", "案号","执行案号","","","",""), //统一命名为“案号”
		ITEM2("subject", "事由","涉案事由","违法事由","拖欠事由","",""), //统一命名为“事由”
		ITEM3("agency","机构", "执行法院","审理机关","侦查/批捕/审判机关","执法/复议/审判机关","主管税务机关"), //统一命名为“机构”
		ITEM4("content", "执行内容"),
		ITEM5("dateType", "日期类别"),
		ITEM6("billNo", "合同/借据编号"),
		ITEM7("amount", "金额","涉案金额","拖欠金额","","",""), //统一命名为“金额”
		ITEM8("currency", "币种","拖欠币种","","","",""),
		ITEM9("taxType", "所欠税种"),
		ITEM10("taxBalance", "欠税余额"),
		ITEM11("taxPeriod", "欠税属期"),
		ITEM12("role", "诉讼地位"),
		ITEM13("procResult", "处理结果"),
		ITEM14("adminResult", "行政执法结果"),
		ITEM15("courtResult", "法院审理结果"),
		ITEM16("status", "执行状态"),
		ITEM17("remark", "异议备注");

		private String id;
		private String caption;
		private String caption1;
		private String caption2;
		private String caption3;
		private String caption4;
		private String caption5;
		
		private LawxpResultDetailEnum(String id, String caption) {
			this.id = id;
			this.caption = caption;
		}
		
		private LawxpResultDetailEnum(String id, String caption,String caption1,String caption2,String caption3,String caption4,String caption5) {
			this.id = id;
			this.caption = caption;
			this.caption1 = caption1;
			this.caption2 = caption2;
			this.caption3 = caption3;
			this.caption4 = caption4;
			this.caption5 = caption5;
		}
		
		public String getId() {
			return id;
		}

		public String getCaption() {
			return caption;
		}
		
		public String getCaption1() {
			return caption1;
		}
		
		public String getCaption2() {
			return caption2;
		}
		
		public String getCaption3() {
			return caption3;
		}
		
		public String getCaption4() {
			return caption4;
		}
		
		public String getCaption5() {
			return caption5;
		}
		
		public static String getCaption(String id) {
			return getCaption(id, id);
		}
		
		public static String getId(String caption) {
			if (null != caption && caption.trim().length() > 0) {
				for (LawxpResultDetailEnum e : LawxpResultDetailEnum.values()) {
					if(caption.equals(e.getCaption()) ){
						return e.getId();
					}else if(caption.equals(e.getCaption1())){
						return e.getId();
					}else if(caption.equals(e.getCaption2())){
						return e.getId();
					}else if(caption.equals(e.getCaption3())){
						return e.getId();
					}else if(caption.equals(e.getCaption4())){
						return e.getId();
					}else if(caption.equals(e.getCaption5())){
						return e.getId();
					}
				}
			}
			return null;
		}
		
		public static String getCaption(String id, String caption) {
			if (null != id && id.trim().length() > 0) {
				for (LawxpResultDetailEnum e : LawxpResultDetailEnum.values()) {
					if (id.equals(e.getId()) || id.equalsIgnoreCase(e.toString())) {
						return e.getCaption();
					}
				}
			}
			return caption;
		}
		
	}

}
