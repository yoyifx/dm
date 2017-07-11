package cn.datawe.util;

import java.util.HashMap;
import java.util.Map;

import cn.datawe.constant.CommonConstant;
import cn.datawe.constant.ErrorCodeConstant;
import cn.datawe.constant.LogErrorCodeConstant;

/**
 * 常量类:接口错误码适配开放平台的接口错误码
 * 
 * @author LiuJiaLe
 * 
 */
public class ErrorCodeAdapter {

	private static final Map<String, String> MAP = new HashMap<String, String>();

	static {

		MAP.put(CommonConstant.QUEUE, ErrorCodeConstant.SYSTEM_QUEUE);
		MAP.put(CommonConstant.NOT_FOUND, ErrorCodeConstant.NOT_FOUND);
		MAP.put(CommonConstant.ERROR, ErrorCodeConstant.SYSTEM_ERROR);
		MAP.put(LogErrorCodeConstant.SYSTEM_ERROR, ErrorCodeConstant.SYSTEM_ERROR);
		MAP.put(LogErrorCodeConstant.DATA_ERROR, ErrorCodeConstant.SYSTEM_ERROR);
		MAP.put(LogErrorCodeConstant.PARAM_MISSING, ErrorCodeConstant.PARAM_MISSING);
		MAP.put(LogErrorCodeConstant.PARAM_INVALID, ErrorCodeConstant.PARAM_INVALID);
		MAP.put(LogErrorCodeConstant.PARAM_FORMAT_ERROR, ErrorCodeConstant.PARAM_INVALID);
		MAP.put(LogErrorCodeConstant.PARAM_TYPE_ERROR, ErrorCodeConstant.PARAM_INVALID);
		MAP.put(LogErrorCodeConstant.PARAM_RANGE_ERROR, ErrorCodeConstant.PARAM_INVALID);
		MAP.put(LogErrorCodeConstant.PARAM_DECRYPT_ERROR, ErrorCodeConstant.PARAM_INVALID);
		MAP.put(LogErrorCodeConstant.CONFIG_MISSING, ErrorCodeConstant.SYSTEM_ERROR);
		MAP.put(LogErrorCodeConstant.CONFIG_FORMAT_ERROR, ErrorCodeConstant.SYSTEM_ERROR);
		MAP.put(LogErrorCodeConstant.CONFIG_TYPE_ERROR, ErrorCodeConstant.SYSTEM_ERROR);
		MAP.put(LogErrorCodeConstant.CONFIG_RANGE_ERROR, ErrorCodeConstant.SYSTEM_ERROR);
		MAP.put(LogErrorCodeConstant.CONFIG_DECRYPT_ERROR, ErrorCodeConstant.SYSTEM_ERROR);
		MAP.put(LogErrorCodeConstant.CONFIG_FILE_NOT_FOUND, ErrorCodeConstant.SYSTEM_ERROR);
		MAP.put(LogErrorCodeConstant.PARSE_DATA_ERROR, ErrorCodeConstant.SYSTEM_ERROR);
		MAP.put(LogErrorCodeConstant.PARSE_XML_ERROR, ErrorCodeConstant.SYSTEM_ERROR);
		MAP.put(LogErrorCodeConstant.PARSE_JSON_ERROR, ErrorCodeConstant.SYSTEM_ERROR);
		MAP.put(LogErrorCodeConstant.REMOTE_ERROR, ErrorCodeConstant.SYSTEM_BUSY);
		MAP.put(LogErrorCodeConstant.REMOTE_UNKNOWN_HOST_ERROR, ErrorCodeConstant.SYSTEM_ERROR);
		MAP.put(LogErrorCodeConstant.REMOTE_CONNECT_TIMEOUT_ERROR, ErrorCodeConstant.SYSTEM_BUSY);
		MAP.put(LogErrorCodeConstant.REMOTE_SOCKET_TIMEOUT_ERROR, ErrorCodeConstant.SYSTEM_BUSY);
		MAP.put(LogErrorCodeConstant.REMOTE_RETURN_RESULT_ERROR, ErrorCodeConstant.SYSTEM_ERROR);
		MAP.put(LogErrorCodeConstant.REMOTE_RETURN_ERROR, ErrorCodeConstant.SYSTEM_ERROR);
		MAP.put(LogErrorCodeConstant.REMOTE_RETURN_DATA_ERROR, ErrorCodeConstant.SYSTEM_ERROR);
		MAP.put(LogErrorCodeConstant.CLIENT_NO_BALANCE, ErrorCodeConstant.PRV_NO_BALANCE);
		MAP.put(LogErrorCodeConstant.ASYNS_API_PROCESSING, ErrorCodeConstant.SYSTEM_QUEUE);
		MAP.put(LogErrorCodeConstant.BATCH_SUBMIT_DATA_FINISHED, ErrorCodeConstant.BATCH_SUBMIT_DATA_FINISHED);
		MAP.put(LogErrorCodeConstant.BATCH_SUBMIT_DATA_UNFINISHED, ErrorCodeConstant.BATCH_SUBMIT_DATA_UNFINISHED);

		MAP.put(LogErrorCodeConstant.USER_IP_ERROR, ErrorCodeConstant.COMMON_PARAM_USER_IP_ERROR);
		MAP.put(LogErrorCodeConstant.USER_IP_NOT_WHITELIST, ErrorCodeConstant.COMMON_PARAM_USER_IP_ACCESS_LIMITED);
		MAP.put(LogErrorCodeConstant.API_ERROR, ErrorCodeConstant.PRV_API_ERROR);
		MAP.put(LogErrorCodeConstant.API_CLOSED, ErrorCodeConstant.PRV_API_CLOSED);

		MAP.put(LogErrorCodeConstant.AUTH_FAIL, ErrorCodeConstant.CLIENT_CHECK_CLIENT_INFO_REMOTE_ERROR);
		MAP.put(LogErrorCodeConstant.NOT_ACCESS, ErrorCodeConstant.PRV_NOT_AUTHED);
		MAP.put(LogErrorCodeConstant.REMOTE_RETURN_TOKEN_ERROR, ErrorCodeConstant.CLIENT_CHECK_CLIENT_INFO_DATA_ERROR);
	}

	public static String to(String code) {
		return ErrorCodeAdapter.MAP.get(code);
	}
}
