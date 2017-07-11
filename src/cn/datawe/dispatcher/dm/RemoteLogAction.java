package cn.datawe.dispatcher.dm;

import java.util.Map;

import com.lrt.framework.core.pojos.ServiceResponse;

import cn.datawe.dispatcher.MainDispatcher;

public class RemoteLogAction extends MainDispatcher {
	private static ServiceResponse excute(String op, Map<Object, Object> condition) {
		return excute("remoteLogAction", op, condition);
	}

	public static ServiceResponse countByCondition(Map<Object, Object> condition) {
		return excute("countByCondition", condition);
	}
	public static ServiceResponse findPageByCondition(Map<Object, Object> condition) {
		return excute("findPageByCondition", condition);
	}
	public static ServiceResponse getInParam(Map<Object, Object> condition) {
		return excute("getInParam", condition);
	}
	public static ServiceResponse getOutParam(Map<Object, Object> condition) {
		return excute("getOutParam", condition);
	}
}
