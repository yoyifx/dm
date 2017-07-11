package cn.datawe.dispatcher.dm;

import cn.datawe.dispatcher.MainDispatcher;
import com.lrt.framework.core.pojos.ServiceResponse;

import java.util.Map;

public class ApiAction extends MainDispatcher {
	private static ServiceResponse excute(String op, Map<Object, Object> condition) {
		return excute("apiAction", op, condition);
	}

	public static ServiceResponse queryApiList(Map<Object, Object> condition) {
		condition.put("op", "queryApiList");
		return excute("queryApiList", condition);
	}
	
	public static ServiceResponse queryApiWeight(Map<Object, Object> condition) {
		condition.put("op", "queryApiWeight");
		return excute("queryApiWeight", condition);
	}
	
	public static ServiceResponse addApi(Map<Object, Object> condition) {
		condition.put("op", "addApi");
		return excute("addApi", condition);
	}
	
	public static ServiceResponse addWhitelist(Map<Object, Object> condition) {
		condition.put("op", "addWhitelist");
		return excute("addWhitelist", condition);
	}
	
	public static ServiceResponse changeStatus(Map<Object, Object> condition) {
		condition.put("op", "changeStatus");
		return excute("changeStatus", condition);
	}
	
	public static ServiceResponse delApi(Map<Object, Object> condition) {
		condition.put("op", "delApi");
		return excute("delApi", condition);
	}
	
	public static ServiceResponse doApi(Map<Object, Object> condition) {
		condition.put("op", "doApi");
		return excute("doApi", condition);
	}
	public static ServiceResponse delWhitelist(Map<Object, Object> condition) {
		condition.put("op", "delWhitelist");
		return excute("delWhitelist", condition);
	}
	
	public static ServiceResponse queryWhitelist(Map<Object, Object> condition) {
		condition.put("op", "queryWhitelist");
		return excute("queryWhitelist", condition);
	}
	
	public static ServiceResponse changeIpSwitch(Map<Object, Object> condition) {
		condition.put("op", "changeIpSwitch");
		return excute("changeIpSwitch", condition);
	}
	
	public static ServiceResponse updateWeight(Map<Object, Object> condition) {
		condition.put("op", "updateWeight");
		return excute("updateWeight", condition);
	}
	
	public static ServiceResponse getApiParam(Map<Object, Object> condition) {
		condition.put("op", "getApiParam");
		return excute("getApiParam", condition);
	}
}