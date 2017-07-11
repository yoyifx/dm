package cn.datawe.dispatcher.dm;

import cn.datawe.dispatcher.MainDispatcher;
import com.lrt.framework.core.pojos.ServiceResponse;

import java.util.Map;

public class DataSourceAction extends MainDispatcher {
	private static ServiceResponse excute(String op, Map<Object, Object> condition) {
		return excute("dataSourceAction", op, condition);
	}

	public static ServiceResponse queryDataSourceList(Map<Object, Object> condition) {
		condition.put("op", "queryDataSourceList");
		return excute("queryDataSourceList", condition);
	}
	public static ServiceResponse openDataSource(Map<Object, Object> condition) {
		condition.put("op", "openDataSource");
		return excute("openDataSource", condition);
	}
	public static ServiceResponse testDataSource(Map<Object, Object> condition) {
		condition.put("op", "testDataSource");
		return excute("testDataSource", condition);
	}
	public static ServiceResponse changeStatus(Map<Object, Object> condition) {
		condition.put("op", "changeStatus");
		return excute("changeStatus", condition);
	}
	public static ServiceResponse updateCacheConfig(Map<Object, Object> condition) {
		condition.put("op", "updateCacheConfig");
		return excute("updateCacheConfig", condition);
	}
}