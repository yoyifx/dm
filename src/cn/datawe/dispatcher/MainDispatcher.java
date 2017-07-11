package cn.datawe.dispatcher;

import java.util.Map;

import cn.datawe.util.SpringContextUtil;

import com.lrt.framework.core.pojos.ServiceResponse;

/**
 * MainDispatcher
 * 
 * @author LiuJiaLe
 *
 */
public class MainDispatcher extends BaseDispatcher {

	protected static ServiceResponse excute(String serviceId, String op, Map<Object, Object> condition) {
		return excute(serviceId, op, condition, SpringContextUtil.getMemberDispatcher());
	}
}