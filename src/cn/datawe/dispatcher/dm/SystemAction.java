/**
 * 工程名：dm-util
 * 包名：cn.datawe.dispatcher.dm
 */
package cn.datawe.dispatcher.dm;

import java.util.Map;

import cn.datawe.dispatcher.MainDispatcher;

import com.lrt.framework.core.pojos.ServiceResponse;

/**
 * 类名：SystemAction
 * @desc 
 * @author lishasha
 * @version 1.0
 * @since v1.0
 * @Date 2017年3月31日下午4:21:43
 */
public class SystemAction extends MainDispatcher {
	
	private static ServiceResponse excute(String op, Map<Object, Object> condition) {
		return excute("systemAction", op, condition);
	}

	public static ServiceResponse queryIndexInfo(Map<Object, Object> condition) {
		return excute("queryIndexInfo", condition);
	}

	public static ServiceResponse queryOperateLog(Map<Object, Object> condition) {
		return excute("queryOperateLog", condition);
	}

}
