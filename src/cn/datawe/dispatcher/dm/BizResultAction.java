package cn.datawe.dispatcher.dm;

import java.util.Map;

import com.lrt.framework.core.pojos.ServiceResponse;

import cn.datawe.dispatcher.MainDispatcher;

public class BizResultAction extends MainDispatcher {
	private static ServiceResponse excute(String op, Map<Object, Object> condition) {
		return excute("bizResultAction", op, condition);
	}

	public static ServiceResponse countDataInterFaceByCode(Map<Object, Object> condition) {
		return excute("countDataInterFaceByCode", condition);
	}

	public static ServiceResponse countBySixMonth(Map<Object, Object> condition) {
		return excute("countBySixMonth", condition);
	}

	public static ServiceResponse countBydays(Map<Object, Object> condition) {
		return excute("countBydays", condition);
	}

	public static ServiceResponse countNatureByCondition(Map<Object, Object> condition) {
		return excute("countNatureByCondition", condition);
	}

	public static ServiceResponse countErrorByCodition(Map<Object, Object> condition) {
		return excute("countErrorByCodition", condition);
	}

	public static ServiceResponse countHitRateByCodition(Map<Object, Object> condition) {
		return excute("countHitRateByCodition", condition);
	}

	public static ServiceResponse countLikeProductBycode(Map<Object, Object> condition) {
		return excute("countLikeProductBycode", condition);
	}

	public static ServiceResponse countRecordByCondition(Map<Object, Object> condition) {
		return excute("countRecordByCondition", condition);
	}

	public static ServiceResponse countIntefaceByDays(Map<Object, Object> condition) {
		return excute("countIntefaceByDays", condition);
	}

	public static ServiceResponse countYesterdayInfo(Map<Object, Object> condition) {
		return excute("countYesterdayInfo", condition);
	}

	public static ServiceResponse countIncByDay(Map<Object, Object> condition) {
		return excute("countIncByDay", condition);
	}

	public static ServiceResponse countProDataCompose(Map<Object, Object> condition) {
		return excute("countProDataCompose", condition);
	}

	public static ServiceResponse countDataCompose(Map<Object, Object> condition) {
		return excute("countDataCompose", condition);
	}
	
	public static ServiceResponse queryCountData(Map<Object, Object> condition) {
		return excute("queryCountData", condition);
	}
}
