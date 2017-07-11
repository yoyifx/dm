package cn.datawe.dispatcher;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.datawe.util.ValidatorUtil;

import com.lrt.framework.core.pojos.ServiceRequest;
import com.lrt.framework.core.pojos.ServiceResponse;
import com.lrt.framework.core.remoting.client.Dispatcher;

/**
 * BaseDispatcher
 * 
 * @author LiuJiaLe
 * 
 */
public class BaseDispatcher {

	private static Log logger = LogFactory.getLog(BaseDispatcher.class);

	protected static ServiceResponse excute(String serviceId, String op, Map<Object, Object> condition, Dispatcher dispatcher) {

		if (ValidatorUtil.isEmptyIgnoreBlank(serviceId)) {
			
			throw new RuntimeException("serviceId 不能为空");
		}

		if (null == dispatcher) {
			
			throw new RuntimeException("dispatcher 不能为空");
		}

		try {
			
			long start = 0;
			ServiceRequest serviceRequest = new ServiceRequest();
			serviceRequest.setRequestServiceId(serviceId);
			serviceRequest.setOp(op);
			serviceRequest.setRequestObject(condition);
			if (logger.isDebugEnabled()) {
				logger.debug(String.format("接口:%s,发送参数:%s", serviceId, condition));
				start = System.currentTimeMillis();
			}

			ServiceResponse serviceResponse = dispatcher.dispatchService(serviceRequest);
			if (logger.isDebugEnabled()) {
				logger.debug(String.format("接口:%s,耗时: %s 毫秒,返回数据:%s", serviceId, System.currentTimeMillis() - start, serviceResponse));
			}
			return serviceResponse;
		} catch (Exception e) {
			
			logger.error("接口调用失败", e);
			throw new RuntimeException("接口调用失败", e);
		}
	}
}