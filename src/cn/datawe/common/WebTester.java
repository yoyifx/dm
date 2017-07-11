package cn.datawe.common;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.datawe.constant.CommonConstant;
import cn.datawe.util.CollectionUtil;
import cn.datawe.util.HttpClientUtil;
import cn.datawe.util.JacksonUtil;
import cn.datawe.util.ValidatorUtil;

/**
 * 测试
 * 
 * @author LiuJiaLe
 * 
 */
public class WebTester {

	private static final Log logger = LogFactory.getLog(WebTester.class);

	/** 接口请求地址:开发环境 */
	public static final String URL_DEV = "http://127.0.0.1:8080/credit-web/api";
	/** 接口请求地址:测试环境 */
	public static final String URL_TEST = "https://api-test.datawe.com:9443/api";
	/** 接口请求地址:生产环境节点1 */
	public static final String URL_PRD = "https://api.datawe.com:8443/api";
	/** 接口请求地址:生产环境节点2 */
	public static final String URL_PRD2 = "http://120.24.214.196:90/api";

	/** 接口服务:查询示例 */
	public static final String SERVICE_EXAMPLE_QUERY = "/example/query";

	/** 开发环境 */
	public static final int DEV = 1;
	/** 测试环境 */
	public static final int TEST = 2;
	/** 生产环境节点1 */
	public static final int PRD = 3;
	/** 生产环境节点2 */
	public static final int PRD2 = 4;

	/* 各环境通用的测试账号信息 */
	public static final String USERNAME = "test";
	public static final String PASSWORD = "123456";

	public static String getURL(int flag, String service) {

		String url = null;
		if (flag == DEV) {

			url = URL_DEV.concat(service);
		} else if (flag == TEST) {

			url = URL_TEST.concat(service);
		} else if (flag == PRD) {

			url = URL_PRD.concat(service);
		} else if (flag == PRD2) {

			url = URL_PRD2.concat(service);
		} else {

			throw new RuntimeException();
		}
		return url;
	}

	@SuppressWarnings("unchecked")
	public static String getToken(String url, String username, String password) {

		System.out.println("-----------获取令牌-----------");
		Map<Object, Object> condition = new HashMap<Object, Object>();
		condition.put("username", username);
		condition.put("password", password);
		condition.put("reqno", System.currentTimeMillis());

		String result = getResult(url, condition);
		Map<Object, Object> resultMap = (Map<Object, Object>) JacksonUtil.toMap(result);
		if (ValidatorUtil.isNotEmpty(resultMap)) {

			String code = String.valueOf(resultMap.get(CommonConstant.RETURN_CODE));
			if (ValidatorUtil.isEquals(code, CommonConstant.SUCCESS)) {

				return CollectionUtil.getValue(resultMap, CommonConstant.RETURN_DATA, "token");
			}
		}
		return null;
	}

	public static String getResult(int flag, String service, Object condition) {

		String url = getURL(flag, service);
		return getResult(url, condition);
	}

	@SuppressWarnings("unchecked")
	public static String getResult(String url, Object condition) {

		System.out.println("url: " + url);
		System.out.println("condition: " + condition);
		boolean isSSL = url.indexOf("https") == -1 ? false : true;
		System.out.println("isSSL: " + isSSL);
		try {

			String result = null;
			if (ValidatorUtil.isMap(condition)) {

				System.out.println("request mode: FORM POST");
				result = isSSL ? HttpClientUtil.postSSL(url, (Map<Object, Object>) condition) : HttpClientUtil.post(url,
						(Map<Object, Object>) condition);
			} else if (ValidatorUtil.isString(condition)) {

				System.out.println("request mode: JSON POST");
				result = isSSL ? HttpClientUtil.postSSL(url, (String) condition) : HttpClientUtil.post(url, (String) condition);
			}
			System.out.println("result: " + result);
			return result;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}
}
