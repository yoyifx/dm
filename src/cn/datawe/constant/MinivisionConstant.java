/**
 * 工程名：project-util
 * 包名：cn.datawe.constant
 */
package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

import cn.datawe.util.ValidatorUtil;

/**
 * 类名：MinivisionRemoteConstant
 * 
 * @desc 常量类：小视科技远程接口相关常量
 * @author lishasha
 * @version 1.0
 * @since v1.0
 * @Date 2017-2-14下午12:02:11
 */
public class MinivisionConstant {

	/**
	 * 小视科技返回状态码：查询错误
	 * */
	public static final String ERROR = "-1";

	public static final String OPERATOR_TYPE_CMCC = "CMCC";
	public static final String OPERATOR_TYPE_UNICOM = "UNICOM";
	public static final String OPERATOR_TYPE_TELECOM = "TELECOM";

	/**
	 * 小视科技信用相关返回状态码
	 * */
	public class CreditCode {
		// TODO 返回为1结果计费，其他不计费
		/**
		 * 命中或已查得
		 * */
		public static final String SUCCESS = "1";
		/**
		 * 未命中或未查得
		 * */
		public static final String NOT_FOUND = "2";
	}

	/**
	 * 小视科技个人基本信息返回状态码
	 * */
	public class PersonInfoCode {
		/**
		 * 一致或认证信息匹配
		 * */
		public static final String CONSISTENT = "1";
		/**
		 * 不一致或认证信息不匹配
		 * */
		public static final String INCONSISTENT = "2";
		/**
		 * 无法验证
		 * */
		public static final String NOT_VERIFIED = "3";
	}

	/**
	 * 小视科技运营商类返回状态码
	 * */
	public class OperatorCode {
		// TODO 1,2,3,4,5,6计费，-1不计费
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

		// TODO 1,2,3,4计费，-1不计费
		/**
		 * 手机状态查询结果：移动--在网，联通--在网，电信--正常使用
		 * */
		public static final String STATUS_1 = "1";
		/**
		 * 手机状态查询结果：移动--停机,联通--停机，电信--停机
		 * */
		public static final String STATUS_2 = "2";
		/**
		 * 手机状态查询结果：移动--销号,联通--销号
		 * */
		public static final String STATUS_3 = "3";
		/**
		 * 手机状态查询结果：移动--系统无记录
		 * */
		public static final String STATUS_CMCC_4 = "4";
		/**
		 * 手机状态查询结果：联通--空号
		 * */
		public static final String STATUS_UNICOM_4 = "4";
		/**
		 * 手机状态查询结果：电信--在网但不可用：办理了手机号但未激活进行使用
		 * */
		public static final String STATUS_TELECOM_3 = "3";
		/**
		 * 手机状态查询结果：电信--不在网:号码产生了，但没有归属人，注销或者未放号
		 * */
		public static final String STATUS_TELECOM_4 = "4";
		/**
		 * 手机状态查询结果：电信--无法查询:特殊或者保密号码，不提供在网查询
		 * */
		public static final String STATUS_TELECOM_5 = "5";
	}

	/**
	 * 将远端返回的结果封装成本地对应的结果
	 * */
	public class LocalResult {

		/**
		 * 命中或查得
		 * */
		public static final String CREDIT_SUCCESS = "1";
		/**
		 * 未命中或未查得
		 * */
		public static final String CREDIT_NOT_FOUND = "0";

		/**
		 * 不一致
		 * */
		public static final String PERSON_CONSISTENT = "0";
		/**
		 * 一致
		 * */
		public static final String PERSON_INCONSISTENT = "1";
		/**
		 * 无法验证
		 * */
		public static final String PERSON_NOT_VERIFIED = "2";
	}

	/**
	 * 远端接口服务名
	 * */
	public class Service {
		/**
		 * 远程接口服务名:黑名单验证
		 * */
		public static final String BLACK_LIST_CHECK = "BlackListCheck";
		/**
		 * 远程接口服务名:逾期详情查询
		 * */
		public static final String OVERDUE_DETAIL_CHECK = "OverdueDetailCheck";
		/**
		 * 远程接口服务名:个人电子信息验证
		 * */
		public static final String IDNAME_CHECK = "IDNameCheck";
		/**
		 * 远程接口服务名:个人电子信息图像查询
		 * */
		public static final String GET_IDCARD_IMAGE = "GetIDCardImage";
		/**
		 * 远程接口服务名:银行卡三要素验证
		 * */
		public static final String NAME_IDCARD_ACCOUNT_VERIFY = "NameIDCardAccountVerify";
		/**
		 * 远程接口服务名:银行卡四要素验证
		 * */
		public static final String NAME_IDCARD_PHONE_ACCOUNT_VERIFY = "NameIDCardPhoneAccountVerify";
		/**
		 * 远程接口服务名:移动手机号在网时长查询
		 * */
		public static final String MOBILE_ONLINE_INTERVAL_CMCC = "MobileOnlineIntervalCmcc";
		/**
		 * 远程接口服务名:联通手机号在网时长查询
		 * */
		public static final String MOBILE_ONLINE_INTERVAL_UNICOM = "MobileOnlineIntervalUnicom";
		/**
		 * 远程接口服务名:电信手机号在网时长查询
		 * */
		public static final String MOBILE_ONLINE_INTERVAL_TELECOM = "MobileOnlineIntervalTelecom";
		/**
		 * 远程接口服务名:移动手机号码状态查询
		 * */
		public static final String MOBILE_STATUS_CMCC = "MobileStatusCmcc";
		/**
		 * 远程接口服务名:联通手机号码状态查询
		 * */
		public static final String MOBILE_STATUS_UNICOM = "MobileStatusUnicom";
		/**
		 * 远程接口服务名:电信手机号码状态查询
		 * */
		public static final String MOBILE_STATUS_TELECOM = "MobileStatusTelecom";
	}

	/**
	 * 本地封装接口服务名
	 * */
	public class LocalService {
		/**
		 * 小视科技：黑名单验证
		 */
		public static final String BLACK_LIST_CHECK = "blacklistCheck";

		/**
		 * 小视科技：逾期详情查询
		 */
		public static final String OVERDUE_DETAIL_CHECK = "overdueDetailCheck";
		/**
		 * 小视科技：个人电子信息验证
		 * */
		public static final String IDNAME_CHECK = "idnameCheck";
		/**
		 * 小视科技：个人电子信息图像查询
		 * */
		public static final String IDCARD_IMAGE = "idcardImage";
		/**
		 * 小视科技：银行卡三要素验证
		 * */
		public static final String IDENTIFY_IDCARD_BANK_THREE = "identifyIdcardBankThree";
		/**
		 * 小视科技：银行卡四要素验证
		 * */
		public static final String IDENTIFY_IDCARD_BANK_FOUR = "identifyIdcardBankFour";
		/**
		 * 小视科技：移动手机号在网时长查询
		 * */
		public static final String MOBILE_ONLINE_CMCC = "mobileOnlineCmcc";
		/**
		 * 小视科技：联通手机号在网时长查询
		 * */
		public static final String MOBILE_ONLINE_UNICOM = "mobileOnlineUnicom";
		/**
		 * 小视科技：电信手机号在网时长查询
		 * */
		public static final String MOBILE_ONLINE_TELECOM = "mobileOnlineTelecom";
		/**
		 * 小视科技：移动手机号码状态查询
		 * */
		public static final String MOBILE_STATUS_CMCC = "mobileStatusCmcc";
		/**
		 * 小视科技：联通手机号码状态查询
		 * */
		public static final String MOBILE_STATUS_UNICOM = "mobileStatusUnicom";
		/**
		 * 小视科技：电信手机号码状态查询
		 * */
		public static final String MOBILE_STATUS_TELECOM = "mobileStatusTelecom";
	}

	/**
	 * 信用相关
	 * */
	public static Map<String, String> creditMapInfo() {
		Map<String, String> map = new HashMap<String, String>();
		map.put(CreditCode.SUCCESS, LocalResult.CREDIT_SUCCESS);
		map.put(CreditCode.NOT_FOUND, LocalResult.CREDIT_NOT_FOUND);
		return map;
	}

	/**
	 * 个人信息相关
	 * */
	public static Map<String, String> personMapInfo() {
		Map<String, String> map = new HashMap<String, String>();
		map.put(PersonInfoCode.CONSISTENT, IDCardConstant.INCONSISTENT);
		map.put(PersonInfoCode.INCONSISTENT, IDCardConstant.CONSISTENT);
		map.put(PersonInfoCode.NOT_VERIFIED, IDCardConstant.NOT_VERIFIED);
		return map;
	}

	/**
	 * 手机在网时间
	 * */
	public static Map<String, String> operatorOnlineMapInfo() {
		Map<String, String> map = new HashMap<String, String>();
		map.put(OperatorCode.ONLINE_INTERVAL_1, MobileConstant.ONLINE_INTERVAL_1);
		map.put(OperatorCode.ONLINE_INTERVAL_2, MobileConstant.ONLINE_INTERVAL_2);
		map.put(OperatorCode.ONLINE_INTERVAL_3, MobileConstant.ONLINE_INTERVAL_3);
		map.put(OperatorCode.ONLINE_INTERVAL_4, MobileConstant.ONLINE_INTERVAL_4);
		map.put(OperatorCode.ONLINE_INTERVAL_5, MobileConstant.ONLINE_INTERVAL_5);
		map.put(OperatorCode.ONLINE_INTERVAL_6, MobileConstant.ONLINE_INTERVAL_6);
		return map;
	}

	/**
	 * 手机在网状态
	 * */
	public static Map<String, String> operatorStatusMap(String operatorType) {
		Map<String, String> map = new HashMap<String, String>();
		map.put(OperatorCode.STATUS_1, MobileConstant.STATUS_IN_NET);
		map.put(OperatorCode.STATUS_2, MobileConstant.STATUS_STOP);
		if (ValidatorUtil.isEquals(operatorType, OPERATOR_TYPE_CMCC)) {
			map.put(OperatorCode.STATUS_3, MobileConstant.STATUS_PIN_NUM);
			map.put(OperatorCode.STATUS_CMCC_4, MobileConstant.STATUS_SYSTEM_NOT_RECORD);
		}
		if (ValidatorUtil.isEquals(operatorType, OPERATOR_TYPE_UNICOM)) {
			map.put(OperatorCode.STATUS_3, MobileConstant.STATUS_PIN_NUM);
			map.put(OperatorCode.STATUS_UNICOM_4, MobileConstant.STATUS_EMPTY_NUM);
		}
		if (ValidatorUtil.isEquals(operatorType, OPERATOR_TYPE_TELECOM)) {
			map.put(OperatorCode.STATUS_TELECOM_3, MobileConstant.STATUS_IN_NET_NOT_USE);
			map.put(OperatorCode.STATUS_TELECOM_4, MobileConstant.STATUS_NOT_ENABLED);
			map.put(OperatorCode.STATUS_TELECOM_5, MobileConstant.STATUS_SYSTEM_NOT_RECORD);
		}
		return map;
	}
}
