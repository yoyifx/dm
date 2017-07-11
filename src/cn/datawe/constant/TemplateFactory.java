package cn.datawe.constant;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

/**
 * 模板工厂
 * 
 * @author YCZ
 * 
 */
public class TemplateFactory {

	private static final Log logger = LogFactory.getLog(TemplateFactory.class);

	private static Map<String, String> remoteCacheTextStyle = new HashMap<String, String>();
	private static Map<String, String> openCacheTextStyle = new HashMap<String, String>();

	static {
		// TODO: add your code
		// 平安征信
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10203, "$idNo,$mobileNos,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10205, "$idNo,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10206, "$idNo,$name,$mobileNo,$company");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10207, "$idNo,$name,$mobile,$cardNo");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10208, "$idNo,$name,$mobileNo,$refName,$refMobileNo");

		// 百融接口
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10004, "$idcard,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10005, "$idcard,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10006, "$idcard,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10007, "$idcard,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10008, "$idcard,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10009, "$idcard,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10010, "$idcard,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10011, "$idcard,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10012, "$idcard,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10013, "$idcard,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10014, "$idcard,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10015, "$idcard,$mobile,$name");
		
		//增信通
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10301, "$idcard,$mobile,$city,$moduleNo"); // 不再使用，2016.01.06
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10302, "$idcard,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10801, "$idcard,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10802, "$idcard,$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10803, "$idcard,$mobile");

		// 融360接口1.0版
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10700, "$docNo,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10701, "$docNo,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10702, "$docNo,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10703, "$docNo,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10704, "$docNo,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10705, "$docNo,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10706, "$docNo,$mobile,$name");

		// 融360接口1.1版
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10708, "$docNo,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10709, "$docNo,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10710, "$docNo,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10711, "$docNo,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10712, "$docNo,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10713, "$docNo,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10714, "$docNo,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10804, "$mobile");

		// 小视科技接口 v2.1
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10900, "$idcard,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10901, "$idcard,$mobile,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10902, "$idcard,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10903, "$idcard,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10904, "$idcard,$name,$cardNo");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10905, "$idcard,$name,$mobile,$cardNo");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10906, "$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10907, "$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10908, "$idcard,$name,$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10909, "$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10910, "$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10911, "$idcard,$name,$mobile");

		// 同程金服
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_11001, "$idcard,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_11002, "$idcard,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_11003, "$idcard,$name,$mobile,$cardNo");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_11004, "$idcard,$name,$cardNo");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_11005, "$idcard,$name,$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_11006, "$name,$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_11007, "$idcard,$name,$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_11008, "$idcard,$name,$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_11009, "$idcard,$name,$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_11010, "$idcard,$name,$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_11011, "$idcard,$name,$mobile");

		// 数据堂
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10501, "$idcard,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10502, "$idcard,$name,$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10503, "$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10504, "$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10505, "$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10506, "$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10507, "$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_10508, "$mobile");

		// 前海数维
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_12001, "$docNo,$name,$mobile");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_12002, "$idcard,$name");
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_12003, "$idcard,$name");
		
		//葫芦数据
		remoteCacheTextStyle.put(RemoteCodeConstant.REMOTE_40002, "$idCard,$name,$phone");
	}

	/**
	 * 返回本地接口缓存入参匹配的文本
	 * 
	 * @param code
	 *            接口编号
	 * @param condition
	 *            输入条件
	 * @return 接口编号不匹配时返回null
	 */
	public static String getRemoteCacheText(String code, Map<Object, Object> condition) {

		String style = remoteCacheTextStyle.get(code);

		if (style == null) {
			throw new RuntimeException("缺少模板引擎!");
		}

		VelocityContext context = new VelocityContext();
		for (Map.Entry<Object, Object> item : condition.entrySet()) {
			if (item.getKey() == null) {
				continue;
			}
			String key = item.getKey().toString();
			String value = item.getValue() == null ? "" : item.getValue().toString();
			if ("idNo".equals(key) || "idcard".equalsIgnoreCase(key) || "docNo".equals(key) || "idCard".equals(key)) {
				// 特殊处理身份证的大小写
				value = value.toUpperCase();
			}
			context.put(key, value);
		}

		Velocity.init();
		StringWriter writer = new StringWriter();
		Velocity.evaluate(context, writer, "Velocity", style);

		String str = writer.toString();
		if (str.indexOf('$') >= 0) {
			logger.warn("-Condition-warn!-" + str);
		}

		return str;
	}

	/**
	 * 返回服务缓存入参匹配的文本
	 * 
	 * @param code
	 *            接口编号
	 * @param condition
	 *            输入条件
	 * @return 接口编号不匹配时返回null
	 */
	public static String getOpenCacheText(String code, Map<Object, Object> condition) {

		String style = openCacheTextStyle.get(code);

		if (style == null) {
			throw new RuntimeException("缺少模板引擎!");
		}

		VelocityContext context = new VelocityContext();
		for (Map.Entry<Object, Object> item : condition.entrySet()) {
			if (item.getKey() == null) {
				continue;
			}
			String key = item.getKey().toString();
			String value = item.getValue() == null ? "" : item.getValue().toString();
			if ("idNo".equals(key) || "idcard".equalsIgnoreCase(key) || "docNo".equals(key)) {
				// 特殊处理身份证的大小写
				value = value.toUpperCase();
			}
			context.put(key, value);
		}

		Velocity.init();
		StringWriter writer = new StringWriter();
		Velocity.evaluate(context, writer, "Velocity", style);

		String str = writer.toString();
		if (str.indexOf('$') >= 0) {
			logger.warn("-Condition-warn!-" + str);
		}

		return str;
	}

	/**
	 * 是否配置openLocal模板缓存
	 * 
	 * @author lishasha
	 * @Date 2017-3-16下午04:41:11
	 * @method isOpenCached
	 * @param code
	 * @return
	 * 
	 * @since v1.0
	 */
	public static boolean isOpenCached(String code) {
		return openCacheTextStyle.containsKey(code);
	}

}
