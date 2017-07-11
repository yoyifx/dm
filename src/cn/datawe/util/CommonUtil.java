package cn.datawe.util;

import java.util.HashMap;
import java.util.Map;

import cn.datawe.constant.CommonConstant;
import cn.datawe.constant.LogErrorCodeConstant;

/**
 * 工具类:通用
 * 
 * @author LiuJiaLe
 * 
 */
public final class CommonUtil {

	/**
	 * 返回结果
	 * 
	 * @param localLog
	 * @param remoteLog
	 * @param data
	 * @param code
	 * @param message
	 * @return
	 */
	public static Map<Object, Object> result(Object openLog, Object remoteLog, Object data, Object code, Object message) {
		
		if (null == code) {

			throw new IllegalArgumentException("'code' must not be empty");
		}
		Map<Object, Object> returnMap = new HashMap<Object, Object>();
		if (null != data) {

			returnMap.put(CommonConstant.RETURN_DATA, data);
		}
		returnMap.put(CommonConstant.RETURN_CODE, code);
		if (null != message) {

			returnMap.put(CommonConstant.RETURN_MESSAGE, message);
		}
		if (null != openLog) {
			
			returnMap.put(CommonConstant.RETURN_OPEN_LOG, openLog);
		}
		if (null != remoteLog) {
			
			returnMap.put(CommonConstant.RETURN_REMOTE_LOG, remoteLog);
		}
		return returnMap;
	}
	
	/**
	 * 返回结果
	 * 
	 * @param localLog
	 * @param remoteLog
	 * @param alarmLog
	 * @param data
	 * @param code
	 * @param message
	 * @return
	 */
	public static Map<Object, Object> result(Object openLog, Object remoteLog, Object alarmLog,  Object data, Object code, Object message) {
		
		if (null == code) {

			throw new IllegalArgumentException("'code' must not be empty");
		}
		Map<Object, Object> returnMap = new HashMap<Object, Object>();
		if (null != data) {

			returnMap.put(CommonConstant.RETURN_DATA, data);
		}
		returnMap.put(CommonConstant.RETURN_CODE, code);
		if (null != message) {

			returnMap.put(CommonConstant.RETURN_MESSAGE, message);
		}
		if (null != openLog) {
			
			returnMap.put(CommonConstant.RETURN_OPEN_LOG, openLog);
		}
		if (null != remoteLog) {
			
			returnMap.put(CommonConstant.RETURN_REMOTE_LOG, remoteLog);
		}
		return returnMap;
	}
	/**
	 * 返回结果
	 * 
	 * @param data
	 * @param code
	 * @param message
	 * @return
	 */
	public static Map<Object, Object> result(Object data, Object code, Object message) {

		if (null == code) {

			throw new IllegalArgumentException("'code' must not be empty");
		}
		Map<Object, Object> returnMap = new HashMap<Object, Object>();
		if (null != data) {

			returnMap.put(CommonConstant.RETURN_DATA, data);
		}
		returnMap.put(CommonConstant.RETURN_CODE, code);
		if (null != message) {

			returnMap.put(CommonConstant.RETURN_MESSAGE, message);
		}
		return returnMap;
	}

	/**
	 * 返回结果
	 * 
	 * @param code
	 * @param message
	 * @return
	 */
	public static Map<Object, Object> result(Object code, Object message) {

		return result(null, code, message);
	}
	
	/**
	 * 返回结果:成功
	 * 
	 * @param openLog
	 * @param remoteLog
	 * @param data
	 * @param messageHeader
	 * @return
	 */
	public static Map<Object, Object> resultSuccess(Object openLog, Object remoteLog, Object data, String messageHeader) {

		return result(openLog, remoteLog, data, CommonConstant.SUCCESS, String.format("%s，%s", messageHeader, CommonConstant.MAP.get(CommonConstant.SUCCESS)));
	}
	
	/**
	 * 返回结果:成功
	 * 
	 * @param localLog
	 * @param remoteLog
	 * @param alarmLog
	 * @param data
	 * @param messageHeader
	 * @return
	 */
	public static Map<Object, Object> resultSuccess(Object localLog, Object remoteLog, Object alarmLog, Object data, String messageHeader) {

		return result(localLog, remoteLog,alarmLog, data, CommonConstant.SUCCESS, String.format("%s，%s", messageHeader, CommonConstant.MAP.get(CommonConstant.SUCCESS)));
	}

	/**
	 * 返回结果:成功
	 * 
	 * @param data
	 * @param messageHeader
	 * @param message
	 * @return
	 */
	public static Map<Object, Object> resultSuccess(Object data, String messageHeader, String message) {

		return result(data, CommonConstant.SUCCESS, String.format("%s，%s", messageHeader, message));
	}

	/**
	 * 返回结果:成功
	 * 
	 * @param data
	 * @param messageHeader
	 * @return
	 */
	public static Map<Object, Object> resultSuccess(Object data, String messageHeader) {

		return result(data, CommonConstant.SUCCESS, String.format("%s，%s", messageHeader, CommonConstant.MAP.get(CommonConstant.SUCCESS)));
	}

	/**
	 * 返回结果:成功
	 * 
	 * @param data
	 * @return
	 */
	public static Map<Object, Object> resultSuccess(Object data) {

		return result(data, CommonConstant.SUCCESS, CommonConstant.MAP.get(CommonConstant.SUCCESS));
	}

	/**
	 * 返回结果:成功
	 * 
	 * @param messageHeader
	 * @return
	 */
	public static Map<Object, Object> resultSuccess(String messageHeader) {

		return result(CommonConstant.SUCCESS, String.format("%s，%s", messageHeader, CommonConstant.MAP.get(CommonConstant.SUCCESS)));
	}

	/**
	 * 返回结果:成功
	 * 
	 * @return
	 */
	public static Map<Object, Object> resultSuccess() {

		return result(CommonConstant.SUCCESS, CommonConstant.MAP.get(CommonConstant.SUCCESS));
	}

	/**
	 * 返回结果:失败
	 * 
	 * @param data
	 * @param messageHeader
	 * @param message
	 * @return
	 */
	public static Map<Object, Object> resultFailure(Object data, String messageHeader, String message) {

		return result(data, CommonConstant.FAILURE, String.format("%s，%s", messageHeader, message));
	}

	/**
	 * 返回结果:失败
	 * 
	 * @param data
	 * @param message
	 * @return
	 */
	public static Map<Object, Object> resultFailure(Object data, String message) {

		return result(data, CommonConstant.FAILURE, message);
	}

	/**
	 * 返回结果:失败
	 * 
	 * @param data
	 * @return
	 */
	public static Map<Object, Object> resultFailure(Object data) {

		return result(data, CommonConstant.FAILURE, CommonConstant.MAP.get(CommonConstant.FAILURE));
	}

	/**
	 * 返回结果:失败
	 * 
	 * @param messageHeader
	 * @param message
	 * @return
	 */
	public static Map<Object, Object> resultFailure(String messageHeader, String message) {

		return result(CommonConstant.FAILURE, String.format("%s，%s", messageHeader, message));
	}

	/**
	 * 返回结果:失败
	 * 
	 * @param message
	 * @return
	 */
	public static Map<Object, Object> resultFailure(String message) {

		return result(CommonConstant.FAILURE, message);
	}

	/**
	 * 返回结果:失败
	 * 
	 * @return
	 */
	public static Map<Object, Object> resultFailure() {

		return result(CommonConstant.FAILURE, CommonConstant.MAP.get(CommonConstant.FAILURE));
	}
	
	/**
	 * 返回结果:排队中/处理中
	 * 
	 * @param localLog
	 * @param remoteLog
	 * @param messageHeader
	 * @param message
	 * @return
	 */
	public static Map<Object, Object> resultQueue(Object localLog, Object remoteLog, String messageHeader, String message) {
		
		return result(localLog, remoteLog, null, CommonConstant.QUEUE, String.format("%s，%s", messageHeader, message));
	}
	
	/**
	 * 返回结果:排队中/处理中
	 * 
	 * @param localLog
	 * @param remoteLog
	 * @param messageHeader
	 * @return
	 */
	public static Map<Object, Object> resultQueue(Object localLog, Object remoteLog, String messageHeader) {
		
		return result(localLog, remoteLog, null, CommonConstant.QUEUE, String.format("%s，%s", messageHeader, CommonConstant.MAP.get(CommonConstant.QUEUE)));
	}
	
	/**
	 * 返回结果:没有找到相关记录
	 * 
	 * @param localLog
	 * @param remoteLog
	 * @param messageHeader
	 * @return
	 */
	public static Map<Object, Object> resultNotFound(Object localLog, Object remoteLog, String messageHeader, String message) {
		
		return result(localLog, remoteLog, null, CommonConstant.NOT_FOUND, String.format("%s，%s", messageHeader, message));
	}
	
	/**
	 * 返回结果:没有找到相关记录
	 * 
	 * @param openLog
	 * @param remoteLog
	 * @param messageHeader
	 * @return
	 */
	public static Map<Object, Object> resultNotFound(Object openLog, Object remoteLog, String messageHeader) {
		
		return result(openLog, remoteLog, null, CommonConstant.NOT_FOUND, String.format("%s，%s", messageHeader, CommonConstant.MAP.get(CommonConstant.NOT_FOUND)));
	}
	
	/**
	 * 返回结果:没有找到相关记录
	 * 
	 * @param messageHeader
	 * @param message
	 * @return
	 */
	public static Map<Object, Object> resultNotFound(String messageHeader, String message) {

		return result(CommonConstant.NOT_FOUND, String.format("%s，%s", messageHeader, message));
	}
	
	/**
	 * 返回结果:没有找到相关记录
	 * 
	 * @param messageHeader
	 * @return
	 */
	public static Map<Object, Object> resultNotFound(String messageHeader) {

		return result(CommonConstant.NOT_FOUND, String.format("%s，%s", messageHeader, CommonConstant.MAP.get(CommonConstant.NOT_FOUND)));
	}
	
	/**
	 * 返回结果:出错了
	 * 
	 * @param localLog
	 * @param openLog
	 * @param messageHeader
	 * @param message
	 * @return
	 */
	public static Map<Object, Object> resultError(Object openLog, Object remoteLog, String messageHeader, String message) {
		
		return result(openLog, remoteLog, null, CommonConstant.ERROR, String.format("%s，%s", messageHeader, message));
	}

	/**
	 * 返回结果:出错了
	 * 
	 * @param localLog
	 * @param remoteLog
	 * @param messageHeader
	 * @return
	 */
	public static Map<Object, Object> resultError(Object localLog, Object remoteLog, String messageHeader) {
		
		return result(localLog, remoteLog, null, CommonConstant.ERROR, String.format("%s，%s", messageHeader, CommonConstant.MAP.get(CommonConstant.ERROR)));
	}

	/**
	 * 返回结果:出错了
	 * 
	 * @param messageHeader
	 * @param message
	 * @return
	 */
	public static Map<Object, Object> resultError(String messageHeader, String message) {

		return result(CommonConstant.ERROR, String.format("%s，%s", messageHeader, message));
	}

	/**
	 * 返回结果:出错了
	 * 
	 * @param message
	 * @return
	 */
	public static Map<Object, Object> resultError(String message) {

		return result(CommonConstant.ERROR, message);
	}
	
	/**
	 * 返回结果:出错了
	 * 
	 * @param data
	 * @param message
	 * @return
	 */
	public static Map<Object, Object> resultError(Object data, String message) {
		return result(data, CommonConstant.ERROR, String.format("%s，%s", message, CommonConstant.MAP.get(CommonConstant.ERROR)));
	}
	
	/**
	 * 返回结果:出错了
	 * 
	 * @return
	 */
	public static Map<Object, Object> resultError() {

		return result(CommonConstant.ERROR, CommonConstant.MAP.get(CommonConstant.ERROR));
	}
	
	/**
	 * 返回结果:出错了
	 * 
	 * @param errorCode
	 * @return
	 */
	public static Map<Object, Object> resultErrorCode(String errorCode) {
		
		return result(null, errorCode, LogErrorCodeConstant.MAP.get(errorCode));
	}
	
	/**
	 * 返回结果:出错了
	 * 
	 * @param messageHeader
	 * @param errorCode
	 * @return
	 */
	public static Map<Object, Object> resultErrorCode(String messageHeader, String errorCode) {
		
		return result(null, errorCode, String.format("%s，%s", messageHeader, LogErrorCodeConstant.MAP.get(errorCode)));
	}
	
	/**
	 * 返回结果:出错了
	 * 
	 * @param messageHeader
	 * @param errorCode
	 * @param message
	 * @return
	 */
	public static Map<Object, Object> resultErrorCode(String messageHeader, String errorCode, String message) {
		
		return result(null, errorCode, String.format("%s，%s", messageHeader, message));
	}
	
	/**
	 * 返回结果:出错了
	 * 
	 * @param openLog
	 * @param remoteLog
	 * @param messageHeader
	 * @param errorCode
	 * @return
	 */
	public static Map<Object, Object> resultErrorCode(Object openLog, Object remoteLog, String messageHeader, String errorCode) {
		
		return result(openLog, remoteLog, null, errorCode, String.format("%s，%s", messageHeader, LogErrorCodeConstant.MAP.get(errorCode)));
	}

	private CommonUtil() {}
}
