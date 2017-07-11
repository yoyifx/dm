package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 常量类：增信通
 * 
 * @author ChenYunyu
 * 
 */
public class CredittoneConstant {

	/** 没有找到相关记录 */
	public static int NOT_FOUND = -1;

	/**
	 * 响应码常量
	 * 
	 * @author ChenYunyu
	 * 
	 */
	public static class ResponseCode {

		/**
		 * 正常,接口调用成功
		 */
		public static final String RESPONSE_CODE_OK = "200";

		/**
		 * 无效用户
		 */
		public static final String RESPONSE_CODE_USER_INVALID = "100";

		/**
		 * 参数为空
		 */
		public static final String RESPONSE_CODE_PARAM_EMPTY = "101";

		/**
		 * 参数类型不正确
		 */
		public static final String RESPONSE_CODE_PARAM_TYPE_ERROR = "102";

		/**
		 * 今天查询次数已超上限
		 */
		public static final String RESPONSE_CODE_SEARCH_COUNT_EXCESS = "103";
		
		/**
		 * 自定义调用模块编码错误
		 */
		public static final String RESPONSE_CODE_MODULE_NO_ERROR = "104";
		
		/**
		 * 姓名为空
		 */
		public static final String RESPONSE_CODE_NAME_EMPTY = "105";
		
		/**
		 * 身份证号为空或有误
		 */
		public static final String RESPONSE_CODE_IDCARD_ERROR = "106";
		
		/**
		 * 手机号为空或有误
		 */
		public static final String RESPONSE_CODE_MOBILE_ERROR = "107";
		
		/**
		 * 不支持该手机号段
		 */
		public static final String RESPONSE_CODE_MOBILE_NOT_SUPPORT = "108";
		
		/**
		 * 银行卡号为空
		 */
		public static final String RESPONSE_CODE_BANKCARD_EMPTY = "109";
		
		/**
		 * 企业名称为空 
		 */
		public static final String RESPONSE_CODE_COMPANY_NAME_EMPTY = "110";
		
		/**
		 * 车牌号为空 
		 */
		public static final String RESPONSE_CODE_CAR_NO_EMPTY = "111";
		
		/**
		 * 车辆类型为空或不支持 
		 */
		public static final String RESPONSE_CODE_CAR_TYPE_EMPTY = "112";
		
		/**
		 *车架号为空
		 */
		public static final String RESPONSE_CODE_CAR_FRAME_EMPTY = "113";
		
		/**
		 * 发动机号为空  
		 */
		public static final String RESPONSE_CODE_ENGINE_NO_EMPTY = "114";
		
		/**
		 * Token无效(Token过期失效或Token不存在)
		 */
		public static final String RESPONSE_CODE_TOKEN_INVALID = "300";

		/**
		 * 账户已被销毁 
		 */
		public static final String RESPONSE_CODE_ACCOUNT_DESTROY = "303";

		/**
		 * 账户已被冻结 
		 */
		public static final String RESPONSE_CODE_ACCOUNT_FROST = "304";

		/**
		 * 账户已过期
		 */
		public static final String RESPONSE_CODE_ACCOUNT_INVALID = "306";
		
		/**
		 * 请求token太过频繁
		 */
		public static final String RESPONSE_CODE_TOKEN_FREQUENT = "307";
		
		/**
		 * Token不合规(检查Token是否正确)
		 */
		public static final String RESPONSE_CODE_TOKEN_ERROR = "308";
		
		/**
		 * 账户余额不足 
		 */
		public static final String RESPONSE_CODE_ACCOUNT_NO_BALANCE = "309";
		
		/**
		 * 数据源异常
		 */
		public static final String RESPONSE_CODE_DATASOURCE_ERROR = "310";
		
		/**
		 * 增信通内部执行错误
		 */
		public static final String RESPONSE_CODE_SERVER_ERROR = "500";

		public static final Map<String, String> MAP = new HashMap<String, String>();
		static {
			MAP.put(ResponseCode.RESPONSE_CODE_OK, "正常");
			MAP.put(ResponseCode.RESPONSE_CODE_USER_INVALID, "无效用户");
			MAP.put(ResponseCode.RESPONSE_CODE_PARAM_EMPTY, "参数为空");
			MAP.put(ResponseCode.RESPONSE_CODE_PARAM_TYPE_ERROR, "参数类型不正确");
			MAP.put(ResponseCode.RESPONSE_CODE_SEARCH_COUNT_EXCESS, "今天查询次数已超上限");
			MAP.put(ResponseCode.RESPONSE_CODE_MODULE_NO_ERROR, "自定义调用模块编码错误");
			MAP.put(ResponseCode.RESPONSE_CODE_NAME_EMPTY, "姓名为空");
			MAP.put(ResponseCode.RESPONSE_CODE_IDCARD_ERROR, "身份证号为空或有误");
			MAP.put(ResponseCode.RESPONSE_CODE_MOBILE_ERROR, "手机号为空或有误");
			MAP.put(ResponseCode.RESPONSE_CODE_MOBILE_NOT_SUPPORT, "不支持该手机号段");
			MAP.put(ResponseCode.RESPONSE_CODE_BANKCARD_EMPTY, "银行卡号为空 ");
			MAP.put(ResponseCode.RESPONSE_CODE_COMPANY_NAME_EMPTY, "企业名称为空 ");
			MAP.put(ResponseCode.RESPONSE_CODE_CAR_NO_EMPTY, "车牌号为空 ");
			MAP.put(ResponseCode.RESPONSE_CODE_CAR_TYPE_EMPTY, "车辆类型为空或不支持 ");
			MAP.put(ResponseCode.RESPONSE_CODE_CAR_FRAME_EMPTY, "车架号为空 ");
			MAP.put(ResponseCode.RESPONSE_CODE_ENGINE_NO_EMPTY, "发动机号为空");
			MAP.put(ResponseCode.RESPONSE_CODE_TOKEN_INVALID, "Token无效");
			MAP.put(ResponseCode.RESPONSE_CODE_ACCOUNT_DESTROY, "账户已被销毁 ");
			MAP.put(ResponseCode.RESPONSE_CODE_ACCOUNT_FROST, "账户已被冻结");
			MAP.put(ResponseCode.RESPONSE_CODE_ACCOUNT_INVALID, "账户已过期");
			MAP.put(ResponseCode.RESPONSE_CODE_TOKEN_FREQUENT, "请求token太过频繁");
			MAP.put(ResponseCode.RESPONSE_CODE_TOKEN_ERROR, "Token不合规");
			MAP.put(ResponseCode.RESPONSE_CODE_ACCOUNT_NO_BALANCE, "账户余额不足 ");
			MAP.put(ResponseCode.RESPONSE_CODE_DATASOURCE_ERROR, "数据源异常 ");
			MAP.put(ResponseCode.RESPONSE_CODE_SERVER_ERROR, "内部执行错误");
		}
	}

	/**
	 * 自定义模块编码列表
	 * 
	 * @author ChenYunyu
	 * 
	 */
	public static class Module {

		/**
		 * 法院信息段
		 */
		public static final String MODULE_100000 = "100000";

		/**
		 * 黑名单信息段
		 */
		public static final String MODULE_200000 = "200000";

		/**
		 * 同业借贷信息段
		 */
		public static final String MODULE_300000 = "300000";

		/**
		 * 负面舆情信息段
		 */
		public static final String MODULE_400000 = "400000";

		/**
		 * 机构信息段
		 */
		public static final String MODULE_500000 = "500000";

		/**
		 * 地理信息段
		 */
		public static final String MODULE_600000 = "600000";

		/**
		 * 手机信息段-是否实名制验证(手机号)
		 */
		public static final String MODULE_701200 = "701200";

		/**
		 * 手机信息段-实名二维验证(手机号+姓名)
		 */
		public static final String MODULE_702000 = "702000";

		/**
		 * 手机信息段-实名三维验证(手机号+姓名+身份证)
		 */
		public static final String MODULE_703000 = "703000";

		/**
		 * 手机信息段-在网时长(月)
		 */
		public static final String MODULE_704000 = "704000";

		/**
		 * 手机信息段-最近三个月通话时长均值区间(分钟)
		 */
		public static final String MODULE_705000 = "705000";

		/**
		 * 手机信息段-在网状态
		 */
		public static final String MODULE_706000 = "706000";

		/**
		 * 手机信息段-验证是否常用联系人对象
		 */
		public static final String MODULE_707000 = "707000";

		/**
		 * 核身题库信息段
		 */
		public static final String MODULE_800000 = "800000";

		/**
		 * 个人信息段-身份实名核验节点
		 */
		public static final String MODULE_901000 = "901000";

		/**
		 * 个人信息段-身份实名含照片核验节点
		 */
		public static final String MODULE_902000 = "902000";

		/**
		 * 个人信息段-银行卡账户信息核验节点
		 */
		public static final String MODULE_903000 = "903000";

		/**
		 * 个人信息段-银行卡账户信息核验结果(银行卡+姓名)
		 */
		public static final String MODULE_903010 = "903010";

		/**
		 * 个人信息段-银行卡账户信息三维核验结果(银行卡+姓名+身份证号)
		 */
		public static final String MODULE_903020 = "903020";

		/**
		 * 个人信息段-银行卡账户信息四维核验结果(银行卡+姓名+身份证号+预留手机号)
		 */
		public static final String MODULE_903030 = "903030";

		/**
		 * 个人信息段-个人对外投资信息节点
		 */
		public static final String MODULE_904000 = "904000";

		/**
		 * 个人信息段-保险从业人员资质信息节点
		 */
		public static final String MODULE_905000 = "905000";

		/**
		 * 个人信息段-学历信息查询节点
		 */
		public static final String MODULE_906000 = "906000";

		/**
		 * 个人信息段-个人航空信息航-旅价值信息子节点
		 */
		public static final String MODULE_907010 = "907010";

		/**
		 * 个人信息段-个人航空信息航-乘机人报告子节点
		 */
		public static final String MODULE_907020 = "907020";

		/**
		 * 车辆信息段
		 */
		public static final String MODULE_110000 = "110000";

		/**
		 * 信用评分信息
		 */
		public static final String MODULE_120000 = "120000";

		public static final Map<String, String> MAP = new HashMap<String, String>();
		static {
			MAP.put(Module.MODULE_100000, "法院信息段");
			MAP.put(Module.MODULE_200000, "黑名单信息段");
			MAP.put(Module.MODULE_300000, "同业借贷信息段");
			MAP.put(Module.MODULE_400000, "负面舆情信息段");
			MAP.put(Module.MODULE_500000, "机构信息段");
			MAP.put(Module.MODULE_600000, "地理信息段");

			MAP.put(Module.MODULE_701200, "手机信息段-是否实名制验证(手机号)");
			MAP.put(Module.MODULE_702000, "手机信息段-实名二维验证(手机号+姓名)");
			MAP.put(Module.MODULE_703000, "手机信息段-实名三维验证(手机号+姓名+身份证)");
			MAP.put(Module.MODULE_704000, "手机信息段-在网时长(月)");
			MAP.put(Module.MODULE_705000, "手机信息段-最近三个月通话时长均值区间(分钟)");
			MAP.put(Module.MODULE_706000, "手机信息段-在网状态");
			MAP.put(Module.MODULE_707000, "手机信息段-验证是否常用联系人对象");

			MAP.put(Module.MODULE_800000, "核身题库信息段");

			MAP.put(Module.MODULE_901000, "个人信息段-身份实名核验节点");
			MAP.put(Module.MODULE_902000, "个人信息段-身份实名含照片核验节点");
			MAP.put(Module.MODULE_903000, "个人信息段-银行卡账户信息核验节点");
			MAP.put(Module.MODULE_903010, "个人信息段-银行卡账户信息核验结果(银行卡+姓名)");
			MAP.put(Module.MODULE_903020, "个人信息段-银行卡账户信息三维核验结果(银行卡+姓名+身份证号)");
			MAP.put(Module.MODULE_903030, "个人信息段-银行卡账户信息四维核验结果(银行卡+姓名+身份证号+预留手机号)");
			MAP.put(Module.MODULE_904000, "个人信息段-个人对外投资信息节点");
			MAP.put(Module.MODULE_905000, "个人信息段-保险从业人员资质信息节点");
			MAP.put(Module.MODULE_906000, "个人信息段-学历信息查询节点");
			MAP.put(Module.MODULE_907010, "个人信息段-个人航空信息航-旅价值信息子节点");
			MAP.put(Module.MODULE_907020, "个人信息段-个人航空信息航-乘机人报告子节点");

			MAP.put(Module.MODULE_110000, "车辆信息段");
			MAP.put(Module.MODULE_120000, "信用评分信息");
		}
	}

	/**
	 * 手机实名认证结果
	 * 
	 * @author LiuJiaLe
	 * 
	 */
	public static class RealNameAuthResult {

		/** 一致 */
		public static int Y = 0;
		/** 不一致 */
		public static int N = 1;
		
		public static final Map<Object, Object> REALNAME_AUTH_MAP=new HashMap<Object, Object>(); 
		
		static{
			REALNAME_AUTH_MAP.put(Y, MobileConstant.MOBILE_AUTH_CONSISTENT);
			REALNAME_AUTH_MAP.put(N, MobileConstant.MOBILE_AUTH_INCONSISTENT);
		}

		public static Integer get(String str) {

			if (null != str && str.trim().length() > 0) {

				if ("Y".equals(str)) {

					return Y;
				}
				if ("N".equals(str)) {

					return N;
				}
				if ("X".equals(str)) {

					return NOT_FOUND;
				}
			}
			return null;
		}
	}

	/**
	 * 手机在网时长
	 * 
	 * @author LiuJiaLe
	 * 
	 */
	public static class NetworkPeriod {

		/** 0～6个月 */
		public static int A = 0;
		/** 6～12个月 */
		public static int B = 1;
		/** 12～24个月 */
		public static int C = 2;
		/** 24个月以上 */
		public static int D = 3;
		
		public static final Map<Object, Object> NETWORK_PERIOD_MAP=new HashMap<Object, Object>(); 
		
		static{
			NETWORK_PERIOD_MAP.put(A, MobileConstant.ONLINE_INTERVAL_2);
			NETWORK_PERIOD_MAP.put(B, MobileConstant.ONLINE_INTERVAL_3);
			NETWORK_PERIOD_MAP.put(C, MobileConstant.ONLINE_INTERVAL_4);
			NETWORK_PERIOD_MAP.put(D, MobileConstant.ONLINE_INTERVAL_5);
		}

		public static Integer get(String str) {

			if (null != str && str.trim().length() > 0) {

				if ("A".equals(str)) {

					return A;
				}
				if ("B".equals(str)) {

					return B;
				}
				if ("C".equals(str)) {

					return C;
				}
				if ("D".equals(str)) {

					return D;
				}
				if ("X".equals(str)) {

					return NOT_FOUND;
				}
			}
			return null;
		}
	}

	/**
	 * 手机在网状态
	 * 
	 * @author LiuJiaLe
	 * 
	 */
	public static class NetworkStatus {

		/** 正常在用 */
		public static int A = 0;
		/** 停机 */
		public static int B = 1;
		/** 在网但不可用 */
		public static int C = 2;
		/** 空号 */
		public static int D = 3;
		/** 预销户 */
		public static int E = 4;
		
		public static final Map<Object, Object> NETWORK_STATUS_MAP=new HashMap<Object, Object>(); 
		
		static{
			NETWORK_STATUS_MAP.put(A, MobileConstant.STATUS_IN_NET);
			NETWORK_STATUS_MAP.put(B, MobileConstant.STATUS_STOP);
			NETWORK_STATUS_MAP.put(C, MobileConstant.STATUS_IN_NET_NOT_USE);
			NETWORK_STATUS_MAP.put(D, MobileConstant.STATUS_EMPTY_NUM);
			NETWORK_STATUS_MAP.put(E, MobileConstant.STATUS_IN_NET_NOT_USE);
		}

		public static Integer get(String str) {

			if (null != str && str.trim().length() > 0) {

				if ("A".equals(str)) {

					return A;
				}
				if ("B".equals(str)) {

					return B;
				}
				if ("C".equals(str)) {

					return C;
				}
				if ("D".equals(str)) {

					return D;
				}
				if ("E".equals(str)) {

					return E;
				}
				if ("X".equals(str)) {

					return NOT_FOUND;
				}
			}
			return null;
		}
	}

	/**
	 * 验证结果
	 * 
	 * @author ChenYunyu
	 * @version 1.0
	 * @since v1.0
	 * @Date 2017-3-21上午11:23:53
	 */
	public static class VerifyResult {
		/**
		 * 无记录
		 */
		public static String NOT_FOUND = "0";
		/**
		 * 一致
		 */
		public static String MATCHED = "1";

		/**
		 * 不一致
		 */
		public static String NO_MATCHED = "2";

		public static final Map<String, String> MAP = new HashMap<String, String>();
		static {
			MAP.put(NOT_FOUND, IDCardConstant.NOT_VERIFIED);
			MAP.put(MATCHED, IDCardConstant.INCONSISTENT);
			MAP.put(NO_MATCHED, IDCardConstant.NOT_VERIFIED);
		}

	}

}
