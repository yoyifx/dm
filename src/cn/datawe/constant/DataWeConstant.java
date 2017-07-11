/**
 * 工程名：dm-util
 * 包名：cn.datawe.constant
 */
package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 类名：DataWeConstant
 * 
 * @desc 前海数维常量
 * @author lishasha
 * @version 1.0
 * @since v1.0
 * @Date 2017年4月24日下午2:23:33
 */
public class DataWeConstant {
	
	public static class ApiCode{

		/**
		 * 前海数维：获取令牌接口编号
		 * */
		public static final String TOKEN_CODE = "0001";

		/**
		 * 前海数维：查询个人风险信息接口编号
		 * */
		public static final String PERSON_RISK_CODE = "10005";

		/**
		 * 前海数维：身份证实名认证
		 * */
		public static final String IDCARD_AUTH_CODE = "10036";

		/**
		 * 前海数维：身份证实名认证（返照）
		 * */
		public static final String IDCARD_AUTH_PHOTO_CODE = "10046";
	}
	
	public static class Service{
		/**
		 * 获取token
		 * */
		public static final String TOKEN="/token";
		/**
		 * 查询个人风险信息
		 * */
		public static final String PERSON_RISK="/person/risk";
		/**
		 * 身份证实名认证
		 * */
		public static final String IDCARD_AUTH="/person/idcard/auth";
		/**
		 * 身份证实名认证（返照）
		 * */
		public static final String IDCARD_AUTH_PHOTO="/person/idcard/auth/photo";
	}

	/**
	 * 类名：ReturnCode
	 * 
	 * @desc 前海数维返回常量
	 * @author lishasha
	 * @version 1.0
	 * @since v1.0
	 * @Date 2017年4月24日下午2:31:21
	 */
	public static class ReturnCode {
		/**
		 * 系统错误
		 */
		public static final String SYSTEM_ERROR = "10000";

		/**
		 * 系统超时
		 */
		public static final String SYSTEM_TIMEOUT = "10001";

		/**
		 * 系统繁忙
		 */
		public static final String SYSTEM_BUSY = "10002";

		/**
		 * 系统排队
		 */
		public static final String SYSTEM_QUEUE = "10003";

		/**
		 * 公共参数:客户代码参数不正确
		 */
		public static final String COMMON_PARAM_CLIENT_CODE_ERROR = "20100";

		/**
		 * 公共参数:客户令牌参数不正确
		 */
		public static final String COMMON_PARAM_TOKEN_ERROR = "20101";

		/**
		 * 公共参数:版本号不正确
		 */
		public static final String COMMON_PARAM_VERSION_ERROR = "20102";

		/**
		 * 公共参数:请求流水号不正确
		 */
		public static final String COMMON_PARAM_REQUEST_NO_ERROR = "20103";

		/**
		 * 公共参数:用户IP不正确
		 */
		public static final String COMMON_PARAM_USER_IP_ERROR = "20104";

		/**
		 * 客户:检查客户信息，调用远程服务，出错了
		 */
		public static final String CLIENT_CHECK_CLIENT_INFO_REMOTE_ERROR = "20200";

		/**
		 * 客户:检查客户信息，出错了
		 */
		public static final String CLIENT_CHECK_CLIENT_INFO_ERROR = "20201";

		/**
		 * 客户:检查客户信息，出错了，数据不正确
		 */
		public static final String CLIENT_CHECK_CLIENT_INFO_DATA_ERROR = "20202";

		/**
		 * 客户:客户不正确
		 */
		public static final String CLIENT_ERROR = "20203";

		/**
		 * 客户:客户已失效
		 */
		public static final String CLIENT_INVALID = "20204";

		/**
		 * 客户:客户的用户名或密码不正确
		 */
		public static final String CLIENT_USERNAME_PASSWORD_ERROR = "20205";

		/**
		 * 令牌:获取令牌信息，调用远程服务，出错了
		 */
		public static final String TOKEN_GET_TOKEN_INFO_REMOTE_ERROR = "20300";

		/**
		 * 令牌:获取令牌信息，出错了
		 */
		public static final String TOKEN_GET_TOKEN_INFO_ERROR = "20301";

		/**
		 * 令牌:获取令牌信息，出错了，数据不正确
		 */
		public static final String TOKEN_GET_TOKEN_INFO_DATA_ERROR = "20302";

		/**
		 * 令牌:新增令牌信息，调用远程服务，出错了
		 */
		public static final String TOKEN_ADD_TOKEN_INFO_REMOTE_ERROR = "20303";

		/**
		 * 令牌:新增令牌信息，出错了
		 */
		public static final String TOKEN_ADD_TOKEN_INFO_ERROR = "20304";

		/**
		 * 令牌:新增令牌信息，出错了，数据不正确
		 */
		public static final String TOKEN_ADD_TOKEN_INFO_DATA_ERROR = "20305";

		/**
		 * 令牌:检查令牌信息，调用远程服务，出错了
		 */
		public static final String TOKEN_CHECK_TOKEN_INFO_REMOTE_ERROR = "20306";

		/**
		 * 令牌:检查令牌信息，出错了
		 */
		public static final String TOKEN_CHECK_TOKEN_INFO_ERROR = "20307";

		/**
		 * 令牌:检查令牌信息，出错了，数据不正确
		 */
		public static final String TOKEN_CHECK_TOKEN_INFO_DATA_ERROR = "20308";

		/**
		 * 令牌:令牌不正确
		 */
		public static final String TOKEN_ERROR = "20309";

		/**
		 * 令牌:令牌已失效
		 */
		public static final String TOKEN_INVALID = "20310";

		/**
		 * 令牌:令牌已过期
		 */
		public static final String TOKEN_TIMEOUT = "20311";

		/**
		 * 权限：获取接口信息出错了
		 */
		public static final String PRV_API_ERROR = "20400";

		/**
		 * 权限：该接口已停用
		 */
		public static final String PRV_API_CLOSED = "20401";

		/**
		 * 权限：无权限访问该接口
		 */
		public static final String PRV_NOT_AUTHED = "20402";

		/**
		 * 权限：接口超量
		 */
		public static final String PRV_API_OVER_CALL = "20403";

		/**
		 * 权限：余额不足
		 */
		public static final String PRV_NO_BALANCE = "20404";

		/**
		 * 缺少请求参数
		 */
		public static final String PARAM_MISSING = "30000";

		/**
		 * 参数格式不正确(待作废)
		 */
		public static final String PARAM_FORMAT_ERROR = "30001";

		/**
		 * 没有找到相关记录
		 */
		public static final String NOT_FOUND = "30002";

		/**
		 * 参数无效
		 */
		public static final String PARAM_INVALID = "30003";

		/**
		 * 批量提交数据已结束
		 */
		public static final String BATCH_SUBMIT_DATA_FINISHED = "30004";

		/**
		 * 批量提交数据未结束
		 */
		public static final String BATCH_SUBMIT_DATA_UNFINISHED = "30005";

		public static final Map<String, String> MAP = new HashMap<String, String>();

		static {

			/** 1xxxx */
			MAP.put(ErrorCodeConstant.SYSTEM_ERROR, "系统错误");
			MAP.put(ErrorCodeConstant.SYSTEM_TIMEOUT, "系统超时");
			MAP.put(ErrorCodeConstant.SYSTEM_BUSY, "系统繁忙");
			MAP.put(ErrorCodeConstant.SYSTEM_QUEUE, "系统排队");

			/** 201xx:公共参数 */
			MAP.put(ErrorCodeConstant.COMMON_PARAM_CLIENT_CODE_ERROR, "客户代码参数不正确");
			MAP.put(ErrorCodeConstant.COMMON_PARAM_TOKEN_ERROR, "客户令牌参数不正确");
			MAP.put(ErrorCodeConstant.COMMON_PARAM_VERSION_ERROR, "版本号不正确");
			MAP.put(ErrorCodeConstant.COMMON_PARAM_REQUEST_NO_ERROR, "请求流水号不正确");
			MAP.put(ErrorCodeConstant.COMMON_PARAM_USER_IP_ERROR, "用户IP不正确");

			/** 202xx:客户 */
			MAP.put(ErrorCodeConstant.CLIENT_CHECK_CLIENT_INFO_REMOTE_ERROR, "检查客户信息，调用远程服务，出错了");
			MAP.put(ErrorCodeConstant.CLIENT_CHECK_CLIENT_INFO_ERROR, "检查客户信息，出错了");
			MAP.put(ErrorCodeConstant.CLIENT_CHECK_CLIENT_INFO_DATA_ERROR, "检查客户信息，出错了，数据不正确");
			MAP.put(ErrorCodeConstant.CLIENT_ERROR, "客户不正确");
			MAP.put(ErrorCodeConstant.CLIENT_INVALID, "客户已失效");
			MAP.put(ErrorCodeConstant.CLIENT_USERNAME_PASSWORD_ERROR, "客户的用户名或密码不正确");

			/** 203xx:令牌 */
			MAP.put(ErrorCodeConstant.TOKEN_GET_TOKEN_INFO_REMOTE_ERROR, "获取令牌信息，调用远程服务，出错了");
			MAP.put(ErrorCodeConstant.TOKEN_GET_TOKEN_INFO_ERROR, "获取令牌信息，出错了");
			MAP.put(ErrorCodeConstant.TOKEN_GET_TOKEN_INFO_DATA_ERROR, "获取令牌信息，出错了，数据不正确");
			MAP.put(ErrorCodeConstant.TOKEN_ADD_TOKEN_INFO_REMOTE_ERROR, "新增令牌信息，调用远程服务，出错了");
			MAP.put(ErrorCodeConstant.TOKEN_ADD_TOKEN_INFO_ERROR, "新增令牌信息，出错了");
			MAP.put(ErrorCodeConstant.TOKEN_ADD_TOKEN_INFO_DATA_ERROR, "新增令牌信息，出错了，数据不正确");
			MAP.put(ErrorCodeConstant.TOKEN_CHECK_TOKEN_INFO_REMOTE_ERROR, "检查令牌信息，调用远程服务，出错了");
			MAP.put(ErrorCodeConstant.TOKEN_CHECK_TOKEN_INFO_ERROR, "检查令牌信息，出错了");
			MAP.put(ErrorCodeConstant.TOKEN_CHECK_TOKEN_INFO_DATA_ERROR, "检查令牌信息，出错了，数据不正确");
			MAP.put(ErrorCodeConstant.TOKEN_ERROR, "令牌不正确");
			MAP.put(ErrorCodeConstant.TOKEN_INVALID, "令牌已失效");
			MAP.put(ErrorCodeConstant.TOKEN_TIMEOUT, "令牌已过期");

			/** 204xx:权限 */
			MAP.put(ErrorCodeConstant.PRV_API_ERROR, "接口信息出错");
			MAP.put(ErrorCodeConstant.PRV_API_CLOSED, "该接口已停用");
			MAP.put(ErrorCodeConstant.PRV_NOT_AUTHED, "无权限访问该接口");
			MAP.put(ErrorCodeConstant.PRV_API_OVER_CALL, "接口超量");
			MAP.put(ErrorCodeConstant.PRV_NO_BALANCE, "余额不足");

			/** 3xxxx */
			MAP.put(ErrorCodeConstant.PARAM_MISSING, "缺少请求参数");
			MAP.put(ErrorCodeConstant.PARAM_FORMAT_ERROR, "参数格式不正确(待作废)");
			MAP.put(ErrorCodeConstant.NOT_FOUND, "没有找到相关记录");
			MAP.put(ErrorCodeConstant.PARAM_INVALID, "参数无效");
		}
	}

	/**
	 * 证件类型
	 * */
	public static class CardType {
		/**
		 * 身份证
		 * */
		public static final String IDCARD = "0";
		/**
		 * 护照
		 * */
		public static final String PASSPORT = "1";
	}
	
	/**
	 * 黑名单风险类型
	 * 
	 * @author LiuJiaLe
	 * 
	 */
	public static class Type {
		/**
		 * 逾期风险
		 */
		public static final int OVERDUE = 1;

		/**
		 * 法院及其他行政风险
		 */
		public static final int ADMINISTRATIVE = 2;

		/**
		 * 欺诈风险
		 */
		public static final int FRAUD = 3;

		/**
		 * 失联风险
		 */
		public static final int LOST_CONTACT = 4;

		/**
		 * 信用不良
		 */
		public static final int BAD_CREDIT = 5;

		/**
		 * 虚假申请
		 */
		public static final int APPLY_FALSE = 6;
	}
	
	/**
	 * 风险原因
	 * 
	 * @author LiuJiaLe
	 *
	 */
	public static class Reason {
		
		/**
		 * 信贷申请审核
		 */
		public static final int APPLY_AUDIT = 0;
		
		/**
		 * 其他
		 */
		public static final int OTHER = 99;
	}
	
	/**
	 * 风险项列表(风险编号)
	 * @author ChenYunyu
	 */
	public static class RiskNo {
		
		/**
		 * 逾期风险:逾期风险，提款次数大于20次，本金逾期大于30天或利息逾期大于60天的提款记录占比高于60%
		 */
		public static final int OVERDUE_10001 = 10001;
		
		/**
		 * 逾期风险:逾期风险，借款金额大于5,000元，利息逾期大于90天，且本金逾期大于60天的
		 */
		public static final int OVERDUE_10002 = 10002;
		
		/**
		 * 逾期风险:逾期风险，借款本金逾期超过90天，且逾期总金额大于5,000元的
		 */
		public static final int OVERDUE_10003 = 10003;
		
		/**
		 * 逾期风险:逾期风险，初次借款金额超过授信金额90%，且初次本金逾期超过60天利息逾期超过90天，或本金逾期超过90天
		 */
		public static final int OVERDUE_10004 = 10004;
		
		/**
		 * 逾期风险:超小额信贷逾期（金额<=1000）
		 */
		public static final int OVERDUE_10005 = 10005;
		
		/**
		 * 逾期风险:小额信贷逾期（金额<=5000）
		 */
		public static final int OVERDUE_10006 = 10006;
		
		/**
		 * 逾期风险:信贷逾期（金额>5000）
		 */
		public static final int OVERDUE_10007 = 10007;
		
		/**
		 * 逾期风险:逾期风险，本金逾期大于90天
		 */
		public static final int OVERDUE_10008 = 10008;
		
		/**
		 * 逾期风险:逾期风险，本金逾期大于60天
		 */
		public static final int OVERDUE_10009 = 10009;
		
		/**
		 * 逾期风险:消费金融短时逾期用户
		 */
		public static final int OVERDUE_10010 = 10010;
		
		/**
		 * 逾期风险:逾期风险，本金逾期大于30天
		 */
		public static final int OVERDUE_10011 = 10011;
		
		/**
		 * 逾期风险:逾期风险，本金逾期大于15天
		 */
		public static final int OVERDUE_10012 = 10012;
		
		/**
		 * 逾期风险，银行/非银/小贷/P2P/消费类分期 等 短时逾期用户
		 */
		public static final int OVERDUE_10013 = 10013;
		
		/** 
		 * 逾期风险，银行/非银/小贷/P2P/消费类分期 等不良用户
		 */
		public static final int OVERDUE_10014 = 10014;
		
		/** 
		 * 逾期风险，风险类别为A的：10<=风险分值<20
		 */
		public static final int OVERDUE_10015 = 10015;
		
		/**
		 * 逾期风险，风险类别为A的：20<=风险分值<40
		 */
		public static final int OVERDUE_10016 = 10016;
		
		/**
		 * 逾期风险，风险类别为A的：40<=风险分值
		 */
		public static final int OVERDUE_10017 = 10017;
		
		//融360 “最大逾期时长” 取值 1: 1个月以内/2:1-2个月/3:2-3个月/4:3-6个月/5:6个月以上/0:无结果
		
		/**
		 * 逾期风险，累计逾期次数0，最大逾期时长0/1/2
		 */
		public static final int OVERDUE_10018 = 10018;
		
		/**
		 * 逾期风险，累计逾期次数0，最大逾期时长3
		 */
		public static final int OVERDUE_10019 = 10019;
		
		/**
		 * 逾期风险，累计逾期次数0，最大逾期时长4
		 */
		public static final int OVERDUE_10020 = 10020;
		
		/**
		 * 逾期风险，累计逾期次数0，最大逾期时长5
		 */
		public static final int OVERDUE_10021 = 10021;
		
		/**
		 * 逾期风险，累计逾期次数1，最大逾期时长0/1/2
		 */
		public static final int OVERDUE_10022 = 10022;
		
		/**
		 * 逾期风险，累计逾期次数1，最大逾期时长3
		 */
		public static final int OVERDUE_10023 = 10023;
		
		/**
		 * 逾期风险，累计逾期次数1，最大逾期时长4
		 */
		public static final int OVERDUE_10024 = 10024;
		
		/**
		 * 逾期风险，累计逾期次数1，最大逾期时长5
		 */
		public static final int OVERDUE_10025 = 10025;
		
		/**
		 * 逾期风险，累计逾期次数2，最大逾期时长0/1/2
		 */
		public static final int OVERDUE_10026 = 10026;
		
		/**
		 * 逾期风险，累计逾期次数2，最大逾期时长3
		 */
		public static final int OVERDUE_10027 = 10027;
		
		/**
		 * 逾期风险，累计逾期次数2，最大逾期时长4/5
		 */
		public static final int OVERDUE_10028 = 10028;
		
		/**
		 * 逾期风险，累计逾期次数3次及以上
		 */
		public static final int OVERDUE_10029 = 10029;
		
		/**
		 * 法院及其他行政风险，法院失信人用户/法院被执行人用户
		 */
		public static final int ADMINISTRATIVE_20001 = 20001;
		
		/**
		 * 法院及其他行政风险，风险类别为B的
		 */
		public static final int ADMINISTRATIVE_20002 = 20002;
		
		/**
		 * 法院及其他行政风险，法院失信
		 */
		public static final int ADMINISTRATIVE_20003 = 20003;
		
		/**
		 * 法院及其他行政风险,
		 * 前海风险度-行政负面风险-风险类别为B，风险标记为B2法院被执行人的；汇法网-执行公开信息命中的
		 */
		public static final int ADMINISTRATIVE_20004 = 20004;
		
		/**
		 * 法院及其他行政风险,
		 * 前海风险度-行政负面风险-风险类别为B，风险标记为B1失信老赖的；汇法网-失信老赖名单命中的
		 */
		public static final int ADMINISTRATIVE_20005 = 20005;
		
		/**
		 * 法院及其他行政风险,
		 * 前海风险度-行政负面风险-风险类别为B，风险标记为B3交通严重违章的
		 */
		public static final int ADMINISTRATIVE_20006 = 20006;
		
		/**
		 * 法院及其他行政风险,
		 * 被监管用户（汇法网的-限制高消费名单、限制出入境名单）
		 */
		public static final int ADMINISTRATIVE_20007 = 20007;
		
		/**
		 * 法院及其他行政风险,
		 * 民事涉案（汇法网的-涉及民事裁判文书、民事审判流程）
		 */
		public static final int ADMINISTRATIVE_20008 = 20008;
		
		/**
		 * 法院及其他行政风险,
		 * 刑事涉案（汇法网-罪犯及嫌疑人名单）
		 */
		public static final int ADMINISTRATIVE_20009 = 20009;
		
		/**
		 * 法院及其他行政风险,
		 * 行政处罚（汇法网-行政违法记录、纳税非正常户）
		 */
		public static final int ADMINISTRATIVE_20010 = 20010;
		
		/**
		 * 法院及其他行政风险,
		 * 汇法网-欠税名单
		 */
		public static final int ADMINISTRATIVE_20011 = 20011;
		
		/**
		 * 法院及其他行政风险,
		 * 汇法网-欠款欠费名单
		 */
		public static final int ADMINISTRATIVE_20012 = 20012;
		
		/**
		 * 欺诈风险，银行/非银/小贷/P2P/消费类分期 等欺诈用户
		 */
		public static final int FRAUD_30001 = 30001;
		
		/**
		 * 欺诈风险，风险类别为C的
		 */
		public static final int FRAUD_30002 = 30002;
		
		/**
		 * 欺诈风险，累计欺诈次数 1次
		 */
		public static final int FRAUD_30003 = 30003;
		
		/**
		 * 欺诈风险，累计欺诈次数 2次及以上
		 */
		public static final int FRAUD_30004 = 30004;
		
		/**
		 * 欺诈风险，命中网贷黑名单
		 */
		public static final int FRAUD_30005 = 30005;
		
		/**
		 * 欺诈风险，命中贷款中介名单
		 */
		public static final int FRAUD_30006 = 30006;
		
		/**
		 * 欺诈风险，前海风险度-风险类别为C，风险标记为C1手机号存在欺诈风险，C2卡号存在欺诈风险，C4 IP存在欺诈风险
		 */
		public static final int FRAUD_30007 = 30007;
		
		/**
		 * 欺诈风险，前海风险度-风险类别为C，风险标记为C3身份证号存在欺诈风险
		 */
		public static final int FRAUD_30008 = 30008;
		
		/**
		 * 失联风险，银行/非银/小贷/P2P/消费类分期 等失联用户
		 */
		public static final int LOST_CONTACT_40001 = 40001;
		
		/**
		 * 失联风险
		 */
		public static final int LOST_CONTACT_49999 = 49999;
		
		/**
		 * 信用不良风险，银行/非银/小贷/P2P/消费类分期 等因某些原因判定为不良而拒绝的客户
		 */
		public static final int BAD_CREDIT_50001 = 50001;
		
		/**
		 * 信用不良风险，电信欠费用户 
		 */
		public static final int BAD_CREDIT_50002 = 50002;
		
		/**
		 * 信用不良风险，评级过低
		 */
		public static final int BAD_CREDIT_50003 = 50003;
		
		/**
		 * 信用不良风险，博彩偏好1：低
		 */
		public static final int BAD_CREDIT_50004 = 50004;
		
		/**
		 * 信用不良风险，博彩偏好2：中
		 */
		public static final int BAD_CREDIT_50005 = 50005;
		
		/**
		 * 信用不良风险，博彩偏好3：高
		 */
		public static final int BAD_CREDIT_50006 = 50006;
		
		/**
		 * 信用不良风险，有被法院执行记录
		 */
		public static final int BAD_CREDIT_50007 = 50007;
		
		/**
		 * 信用不良风险，被标记为逾期信用不良
		 */
		public static final int BAD_CREDIT_50008 = 50008;
		
		/**
		 * 信用不良风险，被标记为信用不良
		 */
		public static final int BAD_CREDIT_50009 = 50009;
		
		/**
		 * 信用不良风险，融360-出现在不良行为名单中
		 */
		public static final int BAD_CREDIT_50010 = 50010;
		
		/**
		 * 信用不良风险，百融-消费金融信用不良
		 */
		public static final int BAD_CREDIT_50011 = 50011;
		
		/**
		 * 虚假申请风险，关联多个手机号/关联多个身份证
		 */
		public static final int APPLY_FALSE_60001 = 60001;
		
		/**
		 * 虚假申请风险，被标记为“客户提供虚假信息或证明材料”、“客户有欺诈嫌疑”
		 */
		public static final int APPLY_FALSE_60002 = 60002;
		
		/**
		 * 风险项描述 MAP
		 */
		public static final Map<String, String> MAP = new HashMap<String, String>();
		static {
			MAP.put(String.valueOf(OVERDUE_10001), "逾期风险，频繁逾期");
			MAP.put(String.valueOf(OVERDUE_10002), "逾期风险，恶意逾期");
			MAP.put(String.valueOf(OVERDUE_10003), "逾期风险，长时信贷逾期");
			MAP.put(String.valueOf(OVERDUE_10004), "逾期风险，初次满授信额逾期");
			MAP.put(String.valueOf(OVERDUE_10005), "逾期风险，超小额信贷逾期");
			MAP.put(String.valueOf(OVERDUE_10006), "逾期风险，小额信贷逾期");
			MAP.put(String.valueOf(OVERDUE_10007), "逾期风险，中大额信贷逾期");
			MAP.put(String.valueOf(OVERDUE_10008), "逾期风险，M3+逾期");
			MAP.put(String.valueOf(OVERDUE_10009), "逾期风险，M3逾期");
			MAP.put(String.valueOf(OVERDUE_10010), "逾期风险，消费金融逾期");
			MAP.put(String.valueOf(OVERDUE_10011), "逾期风险，M2逾期");
			MAP.put(String.valueOf(OVERDUE_10012), "逾期风险，M1逾期");
			MAP.put(String.valueOf(OVERDUE_10013), "逾期风险，贷款机构短时逾期");
			MAP.put(String.valueOf(OVERDUE_10014), "逾期风险，贷款机构信用不良");
			MAP.put(String.valueOf(OVERDUE_10015), "逾期风险，逾期低风险");
			MAP.put(String.valueOf(OVERDUE_10016), "逾期风险，逾期中风险");
			MAP.put(String.valueOf(OVERDUE_10017), "逾期风险，逾期高风险");
			MAP.put(String.valueOf(OVERDUE_10018), "逾期风险，最长逾期2个月以内");
			MAP.put(String.valueOf(OVERDUE_10019), "逾期风险，最长逾期2-3个月");
			MAP.put(String.valueOf(OVERDUE_10020), "逾期风险，最长逾期3-6个月");
			MAP.put(String.valueOf(OVERDUE_10021), "逾期风险，最长逾期6个月以上");
			MAP.put(String.valueOf(OVERDUE_10022), "逾期风险，1次逾期最长2个月以内");
			MAP.put(String.valueOf(OVERDUE_10023), "逾期风险，1次逾期最长2-3个月以内");
			MAP.put(String.valueOf(OVERDUE_10024), "逾期风险，1次逾期最长3-6个月以内");
			MAP.put(String.valueOf(OVERDUE_10025), "逾期风险，1次逾期最长6个月以上");
			MAP.put(String.valueOf(OVERDUE_10026), "逾期风险，2次逾期最长2个月以内");
			MAP.put(String.valueOf(OVERDUE_10027), "逾期风险，2次逾期最长2-3个月以内");
			MAP.put(String.valueOf(OVERDUE_10028), "逾期风险，2次逾期最长3个月以上");
			MAP.put(String.valueOf(OVERDUE_10029), "逾期风险，3次及以上逾期");
			MAP.put(String.valueOf(ADMINISTRATIVE_20001), "法院及其他行政风险，司法信用风险");
			MAP.put(String.valueOf(ADMINISTRATIVE_20002), "法院及其他行政风险，行政风险");
			MAP.put(String.valueOf(ADMINISTRATIVE_20003), "法院及其他行政风险，法院失信");
			MAP.put(String.valueOf(ADMINISTRATIVE_20004), "法院及其他行政风险，法院执行");
			MAP.put(String.valueOf(ADMINISTRATIVE_20005), "法院及其他行政风险，失信老赖");
			MAP.put(String.valueOf(ADMINISTRATIVE_20006), "法院及其他行政风险，交通违章");
			MAP.put(String.valueOf(ADMINISTRATIVE_20007), "法院及其他行政风险，被监管用户");
			MAP.put(String.valueOf(ADMINISTRATIVE_20008), "法院及其他行政风险，民事涉案");
			MAP.put(String.valueOf(ADMINISTRATIVE_20009), "法院及其他行政风险，刑事涉案");
			MAP.put(String.valueOf(ADMINISTRATIVE_20010), "法院及其他行政风险，行政处罚");
			MAP.put(String.valueOf(ADMINISTRATIVE_20011), "法院及其他行政风险，欠税");
			MAP.put(String.valueOf(ADMINISTRATIVE_20012), "法院及其他行政风险，欠款欠费");
			MAP.put(String.valueOf(FRAUD_30001), "欺诈风险，贷款机构欺诈用户");
			MAP.put(String.valueOf(FRAUD_30002), "欺诈风险，欺诈");
			MAP.put(String.valueOf(FRAUD_30003), "欺诈风险，欺诈次数1次");
			MAP.put(String.valueOf(FRAUD_30004), "欺诈风险，欺诈次数2次及以上");
			MAP.put(String.valueOf(FRAUD_30005), "欺诈风险，网贷黑名单");
			MAP.put(String.valueOf(FRAUD_30006), "欺诈风险，贷款中介");
			MAP.put(String.valueOf(FRAUD_30007), "欺诈风险，行为欺诈");
			MAP.put(String.valueOf(FRAUD_30008), "欺诈风险，身份欺诈");
			MAP.put(String.valueOf(LOST_CONTACT_40001), "失联风险，贷款机构失联风险");
			MAP.put(String.valueOf(LOST_CONTACT_49999), "失联风险，失联用户");
			MAP.put(String.valueOf(BAD_CREDIT_50001), "信用不良风险，贷款机构拒绝用户");
			MAP.put(String.valueOf(BAD_CREDIT_50002), "信用不良风险，电信欠费 ");
			MAP.put(String.valueOf(BAD_CREDIT_50003), "信用不良风险，低信用");
			MAP.put(String.valueOf(BAD_CREDIT_50004), "信用不良风险，低博彩偏好");
			MAP.put(String.valueOf(BAD_CREDIT_50005), "信用不良风险，中博彩偏好");
			MAP.put(String.valueOf(BAD_CREDIT_50006), "信用不良风险，高博彩偏好");
			MAP.put(String.valueOf(BAD_CREDIT_50007), "信用不良风险，被执行人");
			MAP.put(String.valueOf(BAD_CREDIT_50008), "信用不良风险，贷款信用不良");
			MAP.put(String.valueOf(BAD_CREDIT_50009), "信用不良风险，信用不良用户");
			MAP.put(String.valueOf(BAD_CREDIT_50010), "信用不良风险，不良行为");
			MAP.put(String.valueOf(BAD_CREDIT_50011), "信用不良风险，消费金融信用不良");
			MAP.put(String.valueOf(APPLY_FALSE_60001), "虚假申请风险，多重身份");
			MAP.put(String.valueOf(APPLY_FALSE_60002), "虚假申请风险，虚假证明");
		}
	}
}
