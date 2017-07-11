package cn.datawe.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.util.StringUtils;

import com.lrt.framework.core.cache.CacheManager;
import com.lrt.framework.core.redis.JedisMQPublisher;
import com.lrt.framework.core.redis.JedisManager;
import com.lrt.framework.core.remoting.client.Dispatcher;

/**
 * 获取spring上下文
 * 
 * @author yub
 * @date 2014-7-28
 */
public class SpringContextUtil implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext applicationContext) {
		SpringContextUtil.applicationContext = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static Object getBean(String name) {
		return applicationContext.getBean(name);
	}

	public static <T> T getBean(Class<T> c) {
		return applicationContext.getBean(c);
	}

	/**
	 * 获取CacheManager
	 * 
	 * @return
	 */
	public static CacheManager getCacheManager() {
		return (CacheManager) getBean("cacheManager");
	}

	/**
	 * 获取JedisManager
	 * 
	 * @return
	 */
	public static JedisManager getJedisManager() {
		return (JedisManager) getBean("jedisManager");
	}

	/**
	 * 获取JedisMQPublisher
	 * 
	 * @return
	 */
	public static JedisMQPublisher getJedisMQPublisher() {
		return (JedisMQPublisher) getBean("jedisMQPublisher");
	}

	/**
	 * 获取spring线程池
	 * 
	 * @return
	 */
	public static ThreadPoolTaskExecutor getTaskExecutor() {
		return (ThreadPoolTaskExecutor) getBean("taskExecutor");
	}

	/**
	 * 获取messageSource
	 * 
	 * @return
	 */
	public static MessageSource getMessage() {
		return (MessageSource) getBean("messageSource");
	}

	/**
	 * 获取memberDispatcher
	 * 
	 * @return
	 */
	public static Dispatcher getMemberDispatcher() {
		return (Dispatcher) getBean("mainDispatcher");
	}

	/**
	 * 获取apiDispatcher
	 * 
	 * @return
	 */
	public static Dispatcher getApiDispatcher() {
		return (Dispatcher) getBean("apiDispatcher");
	}

	/**
	 * 获取系统相关配置
	 * 
	 * @param key
	 * @return
	 */
	public static String getProperties(String key) {
		if (!StringUtils.hasText(key)) {
			return null;
		}
		String value = null;
		JedisManager jedisManager = getJedisManager();
		if (jedisManager != null) {
			value = (String) jedisManager.getValue(key);
		}
		return value;
	}
	
	/**
	 * 获取系统相关配置,如果你的配置可以拥有默认值用此方法，一般情况慎用
	 * 
	 * @param key
	 * @return
	 */
	public static String getProperties(String key,String defaultValue) {
		if (!StringUtils.hasText(key)) {
			return null;
		}
		String value = null;
		JedisManager jedisManager = getJedisManager();
		if (jedisManager != null) {
			value = (String) jedisManager.getValue(key);
		}
		if (null == value) {
			value = defaultValue;
		}
		return value;
	}
}