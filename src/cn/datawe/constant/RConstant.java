package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 常量:R常量类
 * 
 * @author LiuJiaLe
 * 
 */
public class RConstant {

	/** 请求类型 */
	public static class RequestType {

		/** 同步 */
		public static final String SYNC = "0";

		/** 异步 */
		public static final String ASYNC = "1";
	}

	/** 数据类型 */
	public static class DataType {

		/** JSON */
		public static final int JSON = 0;

		/** EXCEL */
		public static final int EXCEL = 1;
	}
	
	public static class BizType{
		public static final String BIZ_101="101";
	}

	/** 特征接口Code */
	public static class FeatureCode {

		/** 手机通话特征 */
		public static final String MOBILE_CALL = "1001";

		/** 手机短信特征 */
		public static final String MOBILE_SMS = "1002";

		/** 手机通讯特征 */
		public static final String MOBILE_COMMUNICATION = "1003";

		/** 手机联系人特征 */
		public static final String MOBILE_CONTACTS = "1004";

		/** 手机话费特征 */
		public static final String MOBILE_BILL = "1005";

		/** 用户逾期特征 */
		public static final String PERSON_OVERDUE = "1006";
	}

	/** 状态码 */
	public static class Status {

		/**
		 * 成功（部分资源包运算成功，部分失败）
		 * */
		public static final String STATUS_10000 = "10000";

		/**
		 * 请求参数不正确
		 * */
		public static final String STATUS_20000 = "20000";

		/**
		 * 请求数据中没有bizType
		 * */
		public static final String STATUS_20001 = "20001";

		/**
		 * 请求数据中没有bizData
		 * */
		public static final String STATUS_20002 = "20002";

		/**
		 * 请求数据中没有clientCode
		 * */
		public static final String STATUS_20003 = "20003";

		/**
		 * 请求数据中没有batNo
		 * */
		public static final String STATUS_20004 = "20004";

		/**
		 * 请求数据中没有requestType
		 * */
		public static final String STATUS_20005 = "20005";

		/**
		 * 没有找到bizType对应的业务算法
		 * */
		public static final String STATUS_20006 = "20006";
	}

	/**
	 * 特征资源返回状态码
	 * */
	public static class FeatureReturnCode {
		/**
		 * 找不到featurecode
		 * */
		public static final String CODE_41001 = "41001";
		/**
		 * 找不到Detail
		 * */
		public static final String CODE_41002 = "41002";
		/**
		 * 首要用户主体信息不存在
		 * */
		public static final String CODE_41003 = "41003";
		/**
		 * 首要用户主体姓名不存在
		 * */
		public static final String CODE_41004 = "41004";
		/**
		 * 首要用户主体身份证不存在
		 * */
		public static final String CODE_41005 = "41005";
		/**
		 * 用户借款数据不存在
		 * */
		public static final String CODE_41006 = "41006";
		/**
		 * 用户还款数据不存在
		 * */
		public static final String CODE_41007 = "41007";
		/**
		 * 手机通话数据不存在
		 * */
		public static final String CODE_41008 = "41008";
		/**
		 * 手机短信数据不存在
		 * */
		public static final String CODE_41009 = "41009";
		/**
		 * 特征所需字段不完整
		 * */
		public static final String CODE_41010 = "41010";
		/**
		 * 次要用户主体信息不存在
		 * */
		public static final String CODE_41011 = "41011";
		/**
		 * 次要用户主体姓名不存在
		 * */
		public static final String CODE_41012 = "41012";
		/**
		 * 次要用户主体身份证不存在
		 * */
		public static final String CODE_41013 = "41013";
		/**
		 * 次要用户主体手机通话数据不存在
		 * */
		public static final String CODE_41014 = "41014";
		/**
		 * 次要用户主体手机短信数据不存在
		 * */
		public static final String CODE_41015 = "41015";
		/**
		 * 手机话费数据不存在
		 * */
		public static final String CODE_41016 = "41016";

		public static final Map<String, String> MAP = new HashMap<String, String>();
		static {
			MAP.put(CODE_41001, "找不到featurecode");
			MAP.put(CODE_41002, "找不到Detail");
			MAP.put(CODE_41003, "首要用户主体信息不存在");
			MAP.put(CODE_41004, "首要用户主体姓名不存在");
			MAP.put(CODE_41005, "首要用户主体身份证不存在");
			MAP.put(CODE_41006, "用户借款数据不存在");
			MAP.put(CODE_41007, "用户还款数据不存在");
			MAP.put(CODE_41008, "手机通话数据不存在");
			MAP.put(CODE_41009, "手机短信数据不存在");
			MAP.put(CODE_41010, "特征所需字段不完整");
			MAP.put(CODE_41011, "次要用户主体信息不存在");
			MAP.put(CODE_41012, "次要用户主体姓名不存在");
			MAP.put(CODE_41013, "次要用户主体身份证不存在");
			MAP.put(CODE_41014, "次要用户主体手机通话数据不存在");
			MAP.put(CODE_41015, "次要用户主体手机短信数据不存在");
			MAP.put(CODE_41016, "手机话费数据不存在");
		}
	}

	public static class RequestBean {
		private String clientCode;
		private String batNo;
		private String bizType;
		private String requestType;
		private Map<Object, Object> bizData;

		public RequestBean(String clientCode, String batNo, String bizType, String requestType) {
			super();
			this.setClientCode(clientCode);
			this.setBatNo(batNo);
			this.setBizType(bizType);
			this.setRequestType(requestType);
		}

		public String getClientCode() {
			return clientCode;
		}

		public void setClientCode(String clientCode) {
			this.clientCode = clientCode;
		}

		public String getBatNo() {
			return batNo;
		}

		public void setBatNo(String batNo) {
			this.batNo = batNo;
		}

		public String getBizType() {
			return bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getRequestType() {
			return requestType;
		}

		public void setRequestType(String requestType) {
			this.requestType = requestType;
		}

		public Map<Object, Object> getBizData() {
			return bizData;
		}

		public void setBizData(Map<Object, Object> bizData) {
			this.bizData = bizData;
		}

	}
}
