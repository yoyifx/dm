package cn.datawe.util;

import org.apache.commons.logging.Log;

/**
 * 工具类:日志
 *
 * @author LiuJiaLe
 *
 */
public final class LoggerUtil {
	
	/**
	 * 默认分隔符
	 */
	public static final String SEPARATOR = "=";

	/**
	 * 常见错误:不能为空
	 */
	public static final String ERROR_EMPTY = "is empty";
	
	/**
	 * 常见错误:超过上限
	 */
	public static final String ERROR_EXCESS = "is excess";

	/**
	 * 常见错误:不能都为空
	 */
	public static final String ERROR_ALL_EMPTY = "is all empty";

	/**
	 * 常见错误:解密失败
	 */
	public static final String ERROR_DECRYPT = "decrypt failure";

	/**
	 * 常见错误:解码失败
	 */
	public static final String ERROR_DECODE = "decode failure";
	
	/**
	 * 常见错误:解析失败
	 */
	public static final String ERROR_PARSE = "parse failure";
	
	/**
	 * 常见错误:解析JSON失败
	 */
	public static final String ERROR_PARSE_JSON = "parse json failure";

	/**
	 * 常见错误:解析XML失败
	 */
	public static final String ERROR_PARSE_XML = "parse XML failure";

	/**
	 * 常见错误:无效数据
	 */
	public static final String ERROR_INVALID = "data invalid";
	
	/**
	 * 常见错误:无效数字
	 */
	public static final String ERROR_INVALID_NUMERIC = "invalid numeric";

	/**
	 * 常见错误:无效整数
	 */
	public static final String ERROR_INVALID_INTEGER = "invalid integer";

	/**
	 * 常见错误:无效正整数
	 */
	public static final String ERROR_INVALID_POSITIVE_INTEGER = "invalid positive integer";

	/**
	 * 常见错误:无效小数
	 */
	public static final String ERROR_INVALID_DECIMAL = "invalid decimal";
	
	/**
	 * 常见错误:无效IP
	 */
	public static final String ERROR_INVALID_IP = "invalid ip";

	/**
	 * 常见错误:没有找到相关文件
	 */
	public static final String ERROR_FILE_NOT_FOUND = "file not found";
	
	

	/**
	 * 系统异常
	 */
	private static final String EXCEPTION = "系统异常";

	/**
	 * 日志等级:调试信息
	 */
	public static final int LEVEL_DEBUG = 1;

	/**
	 * 日志等级:提示信息
	 */
	public static final int LEVEL_INFO = 2;

	/**
	 * 调试信息
	 *
	 * @param logger
	 * @param message
	 */
	public static void debug(Log logger, String message) {

		showMessage(logger, LEVEL_DEBUG, null, message);
	}
	
	/**
	 * 调试信息
	 *
	 * @param logger
	 * @param messageHeader
	 * @param message
	 */
	public static void debug(Log logger, String messageHeader, Object message) {

		showMessage(logger, LEVEL_DEBUG, messageHeader, message);
	}
	
	/**
	 * 调试信息
	 * 
	 * @param logger
	 * @param messageHeaders
	 * @param messages
	 */
	public static void debugs(Log logger, String messageHeaders, Object... messages) {
		// 需保证messageHeaders中的英文逗号分隔后的元素个数顺序与messages的元素个数顺序一致
		if (null != logger && logger.isDebugEnabled() && null != messages && messages.length > 0) {
			
			String[] array = ConvertUtil.toArray(messageHeaders);
			String content = null;
			for (int i=0; i<array.length; i++) {
				// 跟踪堆栈信息
				content = getStackTrace() + array[i] + SEPARATOR + messages[i];
				logger.debug(content);
			}
		}
	}
	
	/**
	 * 提示信息
	 *
	 * @param logger
	 * @param message
	 */
	public static void info(Log logger, String message) {

		showMessage(logger, LEVEL_INFO, null, message);
	}
	
	/**
	 * 提示信息
	 * 
	 * @param logger
	 * @param messageHeader
	 * @param message
	 */
	public static void info(Log logger, String messageHeader, Object message) {

		showMessage(logger, LEVEL_INFO, messageHeader, message);
	}

	/**
	 * 提示信息
	 * 
	 * @param logger
	 * @param messageHeaders
	 * @param messages
	 */
	public static void infos(Log logger, String messageHeaders, Object... messages) {
		// 需保证messageHeaders中的英文逗号分隔后的元素个数顺序与messages的元素个数顺序一致
		if (null != logger && logger.isInfoEnabled() && null != messages && messages.length > 0) {
			
			String[] array = ConvertUtil.toArray(messageHeaders);
			String content = null;
			for (int i=0; i<array.length; i++) {
				
				content = array[i] + SEPARATOR + messages[i];
				logger.info(content);
			}
		}
	}

	/**
	 * 错误信息
	 * 
	 * @param logger
	 * @param e
	 */
	public static void error(Log logger, Exception e) {

		error(logger, null, e);
	}
	
	/**
	 * 错误信息
	 * 
	 * @param logger
	 * @param messageHeader
	 * @param e
	 */
	public static void error(Log logger, String messageHeader, Exception e) {

		if (null != logger && logger.isErrorEnabled() && null != e) {
			
			String content = ValidatorUtil.isEmpty(messageHeader) ? EXCEPTION : messageHeader + "，" + EXCEPTION;
			logger.error(content, e);
		}
	}

	/**
	 * 日志信息
	 * 
	 * @param logger
	 * @param level
	 * @param messageHeader
	 * @param message
	 */
	public static void showMessage(Log logger, int level, String messageHeader, Object message) {

		if (null != logger) {
			
			String content = ValidatorUtil.isEmpty(messageHeader) ? String.valueOf(message) : messageHeader + SEPARATOR + message;
			if (level == LEVEL_DEBUG && logger.isDebugEnabled()) {

				content = getStackTrace().concat(content);
				logger.debug(content);
			} else if (level == LEVEL_INFO && logger.isInfoEnabled()) {

				logger.info(content);
			}
		}
	}
	
	private static String getStackTrace() {
		
		StringBuilder sb = new StringBuilder();
		StackTraceElement[] array = Thread.currentThread().getStackTrace();
		sb.append("{");
		sb.append(array[4].getClassName());
		sb.append(".");
		sb.append(array[4].getMethodName());
		sb.append("(");
		sb.append(array[4].getLineNumber());
		sb.append(")} ");
//		sb.append(array[3].getClassName());
//		sb.append(".");
//		sb.append(array[3].getMethodName());
//		sb.append("(");
//		sb.append(array[3].getLineNumber());
//		sb.append(")} ");
		return sb.toString();
	}
	
	private LoggerUtil() {}
}
