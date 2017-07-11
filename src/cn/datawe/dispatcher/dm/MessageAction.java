/**
 * 工程名：dm-util
 * 包名：cn.datawe.dispatcher.dm
 */
package cn.datawe.dispatcher.dm;

import java.util.Map;

import cn.datawe.dispatcher.MainDispatcher;

import com.lrt.framework.core.pojos.ServiceResponse;

/**
 * 类名：MessageAction
 * @desc 
 * @author Fangx
 * @version 1.0
 * @since v1.0
 * @Date 2017年3月28日下午6:54:53
 */
public class MessageAction extends MainDispatcher {

	private static ServiceResponse excute(String op, Map<Object, Object> condition) {
		return excute("messageAction", op, condition);
	}

	public static ServiceResponse queryMessageList(Map<Object, Object> condition) {
		return excute("queryMessageList", condition);
	}
	
	public static ServiceResponse changeMessageStatus(Map<Object, Object> condition) {
		return excute("changeMessageStatus", condition);
	}
}
