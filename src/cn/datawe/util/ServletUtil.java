package cn.datawe.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 工具类:Servlet
 * 
 * @author LiuJiaLe
 *
 */
public class ServletUtil {

	private static final Log logger = LogFactory.getLog(ServletUtil.class);
	
	/**
	 * 将请求参数转换为Map
	 * 
	 * @param request
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@SuppressWarnings("unchecked")
	public static Map<Object, Object> paramToMap(HttpServletRequest request) throws UnsupportedEncodingException {
		
		Map<Object, Object> resultMap = null;
		String contentType = request.getContentType();
		String characterEncoding = request.getCharacterEncoding();
		LoggerUtil.infos(logger, "contentType, characterEncoding2", contentType, characterEncoding);
		if (ValidatorUtil.isContainsIgnoreCase(contentType, "application/json")) {
			
			String json = getJSON(request);
			resultMap = (Map<Object, Object>) JacksonUtil.toMap(json);
		} else {
			
			resultMap = new HashMap<Object, Object>();
			Map<String, String[]> map = request.getParameterMap();
			String key = null;
			String value = null;
			for (Map.Entry<String, String[]> entry : map.entrySet()) {
				
				key = String.valueOf(entry.getKey());
				value = ((String[]) entry.getValue())[0];
				resultMap.put(key, value);// URLDecoder.decode(value, "UTF-8"));
			}
		}
		return resultMap;
	}
	
	/**
	 * 获取请求方的IP
	 * 
	 * @param request
	 * @return
	 */
	public static String getRequestIP(HttpServletRequest request) {
		
		String ip = request.getHeader("X-Real-IP");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			
			ip = request.getHeader("X-Forwarded-For");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			
			ip = request.getRemoteAddr();
		}
		return ip;
	}
	
	/**
	 * 获取JSON数据
	 * 
	 * @param request
	 * @return
	 */
	public static String getJSON(HttpServletRequest request) {

		StringBuilder json = new StringBuilder();
		String line = null;
		try {
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
			while ((line = reader.readLine()) != null) {
				
				json.append(line);
			}
		} catch (Exception e) {

			logger.warn(e);
		}
		return json.toString();
	}
	
	public static String cleanXSS(String value) {
		
		value = value.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
		value = value.replaceAll("\\(", "&#40;").replaceAll("\\)", "&#41;");
		value = value.replaceAll("'", "&#39;");
		value = value.replaceAll("eval\\((.*)\\)", "");
		value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
		value = value.replaceAll("script", "");
		return value;
	}
}
