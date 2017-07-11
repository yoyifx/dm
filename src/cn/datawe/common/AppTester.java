package cn.datawe.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试基类
 * 
 * @author LiuJiaLe
 *
 */
public class AppTester {

	private static final Log logger = LogFactory.getLog(AppTester.class);

	public ClassPathXmlApplicationContext context;

	public AppTester() {
		
		super();
		String[] config = {
			"applicationContext-action.xml",
			"applicationContext-auth.xml",
			"applicationContext-common.xml",
			"applicationContext-tx.xml"
		};
		context = new ClassPathXmlApplicationContext(config);
	}
	
	protected Properties get() {
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("dm-app.properties");
		Properties p = new Properties();
		try {
			p.load(inputStream);
		} catch (IOException e1) {
			logger.error(e1);
		}

		return p;

	}
}
