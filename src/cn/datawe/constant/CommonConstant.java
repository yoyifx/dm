package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 常量类:通用
 * 
 * @author LiuJiaLe
 * 
 */
public class CommonConstant {

	/**
	 * 系统默认用户
	 * */
	public static final String DEFAULT_USER = "admin";

	/**
	 * 默认字符编码:UTF-8
	 */
	public static final String CHARSET = "UTF-8";

	/**
	 * 状态码:成功
	 */
	public static final String SUCCESS = "0";

	/**
	 * 状态码:失败
	 */
	public static final String FAILURE = "1";

	/**
	 * 状态码:没有找到相关记录
	 */
	public static final String NOT_FOUND = "2";

	/**
	 * 状态码:排队中
	 */
	public static final String QUEUE = "3";
	
	/**
	 * 状态码:token错误
	 * */
	public static final String TOKEN_ERROR="999";

	/**
	 * 状态码:出错了
	 */
	public static final String ERROR = "-1";

	/**
	 * 状态码:访问远程接口出错
	 */
	public static final String REMOTE_ACCESS_ERROR = "-2";

	/**
	 * 状态码:远程接口返回错误
	 */
	public static final String REMOTE_RETURN_ERROR = "-3";

	public static final Map<String, String> MAP = new HashMap<String, String>();

	static {

		MAP.put(CommonConstant.SUCCESS, "成功");
		MAP.put(CommonConstant.FAILURE, "失败");
		MAP.put(CommonConstant.NOT_FOUND, "没有找到相关记录");
		MAP.put(CommonConstant.QUEUE, "排队中");
		MAP.put(CommonConstant.ERROR, "出错了");
		MAP.put(CommonConstant.REMOTE_ACCESS_ERROR, "访问远程接口出错");
		MAP.put(CommonConstant.REMOTE_RETURN_ERROR, "远程接口返回错误");
	}

	/**
	 * 返回的数据
	 */
	public static final String RETURN_DATA = "data";

	/**
	 * 返回的状态码(0:成功, 1:失败, -1:出错了)
	 */
	public static final String RETURN_CODE = "code";

	/**
	 * 返回的错误码
	 */
	public static final String RETURN_ERROR_CODE = "errorCode";

	/**
	 * 返回的描述信息
	 */
	public static final String RETURN_MESSAGE = "message";

	/**
	 * 返回的结果码(自定义)
	 */
	public static final String RETURN_RESULT = "result";

	/**
	 * 返回的原始数据
	 */
	public static final String RETURN_RAW_DATA = "rawData";

	/**
	 * 返回的请求流水号
	 */
	public static final String RETURN_REQUEST_NO = "requestNo";

	/**
	 * 返回的结果流水号
	 */
	public static final String RETURN_RESULT_NO = "resultNo";

	/**
	 * 返回的远程接口日志信息
	 */
	public static final String RETURN_REMOTE_LOG = "remoteLog";

	/**
	 * 返回的接口预警日志信息
	 */
	public static final String RETURN_OPEN_LOG = "openLog";

	/**
	 * 是
	 */
	public static final int YES = 1;

	/**
	 * 否
	 */
	public static final int NO = 0;

	/**
	 * 有效
	 */
	public static final int VALID = 1;

	/**
	 * 无效
	 */
	public static final int INVALID = 0;

	/**
	 * 数据开关:开
	 */
	public static final String ON = "on";

	/**
	 * 数据开关:关
	 */
	public static final String OFF = "off";

	/**
	 * 启用
	 */
	public static final int ENABLED = 1;

	/**
	 * 停用
	 */
	public static final int DISABLED = 0;

	/**
	 * 开通状态：开通
	 * */
	public static final int OPENED = 1;

	/**
	 * 开通状态：未开通
	 * */
	public static final int NOT_OPENED = 0;

	/**
	 * 阅读状态：已读
	 * */
	public static final int READ = 1;

	/**
	 * 阅读状态：未读
	 * */
	public static final int UNREAD = 0;

	/**
	 * 返回结果
	 * */
	public static final String RESULT = "result";

	/**
	 * 返回信息
	 * */
	public static final String MESSAGE = "message";
}
