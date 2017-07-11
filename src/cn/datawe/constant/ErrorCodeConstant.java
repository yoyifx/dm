package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 常量类:开放平台接口返回的错误码
 * 
 * @author LiuJiaLe
 * 
 */
public class ErrorCodeConstant {

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
	 * 公共参数:用户IP访问受限
	 */
	public static final String COMMON_PARAM_USER_IP_ACCESS_LIMITED = "20105";

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
	public static final String PRV_NO_BALANCE  = "20404";

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

		/**1xxxx*/
		MAP.put(ErrorCodeConstant.SYSTEM_ERROR, "系统错误");
		MAP.put(ErrorCodeConstant.SYSTEM_TIMEOUT, "系统超时");
		MAP.put(ErrorCodeConstant.SYSTEM_BUSY, "系统繁忙");
		MAP.put(ErrorCodeConstant.SYSTEM_QUEUE, "系统排队");
		
		/**201xx:公共参数*/
		MAP.put(ErrorCodeConstant.COMMON_PARAM_CLIENT_CODE_ERROR, "客户代码参数不正确");
		MAP.put(ErrorCodeConstant.COMMON_PARAM_TOKEN_ERROR, "客户令牌参数不正确");
		MAP.put(ErrorCodeConstant.COMMON_PARAM_VERSION_ERROR, "版本号不正确");
		MAP.put(ErrorCodeConstant.COMMON_PARAM_REQUEST_NO_ERROR, "请求流水号不正确");
		MAP.put(ErrorCodeConstant.COMMON_PARAM_USER_IP_ERROR, "用户IP不正确");
		MAP.put(ErrorCodeConstant.COMMON_PARAM_USER_IP_ACCESS_LIMITED, "用户IP访问受限");

		/**202xx:客户*/
		MAP.put(ErrorCodeConstant.CLIENT_CHECK_CLIENT_INFO_REMOTE_ERROR, "检查客户信息，调用远程服务，出错了");
		MAP.put(ErrorCodeConstant.CLIENT_CHECK_CLIENT_INFO_ERROR, "检查客户信息，出错了");
		MAP.put(ErrorCodeConstant.CLIENT_CHECK_CLIENT_INFO_DATA_ERROR, "检查客户信息，出错了，数据不正确");
		MAP.put(ErrorCodeConstant.CLIENT_ERROR, "客户不正确");
		MAP.put(ErrorCodeConstant.CLIENT_INVALID, "客户已失效");
		MAP.put(ErrorCodeConstant.CLIENT_USERNAME_PASSWORD_ERROR, "客户的用户名或密码不正确");

		/**203xx:令牌*/
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
		
		/**204xx:权限*/
		MAP.put(ErrorCodeConstant.PRV_API_ERROR, "接口信息出错");
		MAP.put(ErrorCodeConstant.PRV_API_CLOSED, "该接口已停用");
		MAP.put(ErrorCodeConstant.PRV_NOT_AUTHED, "无权限访问该接口");
		MAP.put(ErrorCodeConstant.PRV_API_OVER_CALL, "接口超量");
		MAP.put(ErrorCodeConstant.PRV_NO_BALANCE, "余额不足");

		/**3xxxx*/
		MAP.put(ErrorCodeConstant.PARAM_MISSING, "缺少请求参数");
		MAP.put(ErrorCodeConstant.PARAM_FORMAT_ERROR, "参数格式不正确(待作废)");
		MAP.put(ErrorCodeConstant.NOT_FOUND, "没有找到相关记录");
		MAP.put(ErrorCodeConstant.PARAM_INVALID, "参数无效");
		MAP.put(ErrorCodeConstant.BATCH_SUBMIT_DATA_FINISHED, "批量提交数据已结束");
		MAP.put(ErrorCodeConstant.BATCH_SUBMIT_DATA_UNFINISHED, "批量提交数据未结束");
	}
}
