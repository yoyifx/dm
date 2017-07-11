/**
 * 工程名：dm-util
 * 包名：cn.datawe.dispatcher.dm
 */
package cn.datawe.dispatcher.dm;

import java.util.Map;

import cn.datawe.dispatcher.MainDispatcher;

import com.lrt.framework.core.pojos.ServiceResponse;

/**
 * 类名：OperateLogAction
 * 
 * @desc
 * @author lishasha
 * @version 1.0
 * @since v1.0
 * @Date 2017年3月27日下午5:09:05
 */
public class OperateLogAction extends MainDispatcher {

	private static ServiceResponse excute(String op, Map<Object, Object> condition) {
		return excute("operateLogAction", op, condition);
	}

	public static ServiceResponse saveOperateLog(Map<Object, Object> condition) {
		condition.put("op", "saveOperateLog");
		return excute("saveOperateLog", condition);
	}

	public static ServiceResponse queryOperateLogList(Map<Object, Object> condition) {
		condition.put("op", "queryOperateLogList");
		return excute("queryOperateLogList", condition);
	}

}
