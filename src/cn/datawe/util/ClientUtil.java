package cn.datawe.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.xfire.client.Client;
import org.codehaus.xfire.transport.http.CommonsHttpMessageSender;

/**
 * 工具类:XFire客户端
 * 
 * @author LiuJiaLe
 *
 */
public class ClientUtil {

	public static final int TIMEOUT = 20000;
	public static final String DISABLE_KEEP_ALIVE = "true";
	public static final String DISABLE_EXPECT_CONTINUE = "true";
	public static final String SERVICE_NAME_REPORT = "queryReport";
	
	/**
	 * XFire客户端调用服务
	 * 
	 * @param serviceURL
	 * @param serviceName
	 * @param username
	 * @param password
	 * @param requestInfo
	 * @return
	 * @throws Exception
	 */
	public static Object[] callService(String serviceURL, String serviceName, String username, String password, String requestInfo) throws Exception {
		
		return callService(serviceURL, serviceName, new Object[]{username, password, requestInfo});
	}
	
	/**
	 * XFire客户端调用服务
	 * 
	 * @param serviceURL
	 * @param serviceName
	 * @param requestParams
	 * @return
	 * @throws Exception
	 */
	public static Object[] callService(String serviceURL, String serviceName, Object[] requestParams) throws Exception  {
		
		URL url = new URL(serviceURL);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setConnectTimeout(TIMEOUT);// 连接主机超时时间(单位:毫秒)
		connection.setReadTimeout(TIMEOUT);// 从主机读取数据超时时间(单位:毫秒)
		
		//HttpURLConnection connection = getConnection(serviceURL);
		connection.connect();
		
		int code = connection.getResponseCode();
		if (code == HttpURLConnection.HTTP_OK) {
			
			Client client = getClient(connection);
			return client.invoke(serviceName, requestParams);
		}
		throw new RuntimeException(String.format("Server returned HTTP response code: %s for URL: %s", code, serviceURL));
	}
	
	/**
	 * XFire客户端调用报告类服务
	 * 
	 * @param serviceURL
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static Object[] callReportService(String serviceURL, Object... params) throws Exception {
		
		int len = params.length;
		Object[] requestParams = new Object[len+1];
		for (int i=0; i<len; i++) {
			
			requestParams[i] = params[i];
		}
		requestParams[len] = "xml";
		return callService(serviceURL, SERVICE_NAME_REPORT, requestParams);
	}
	
	/**
	 * XFire客户端调用报告类服务
	 * 
	 * @param serviceURL
	 * @param serviceName
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static Object[] callReportServiceByServiceName(String serviceURL, String serviceName, Object... params) throws Exception {
		
		int len = params.length;
		Object[] requestParams = new Object[len+1];
		for (int i=0; i<len; i++) {
			
			requestParams[i] = params[i];
		}
		requestParams[len] = "xml";
		return callService(serviceURL, serviceName, requestParams);
	}
	
	/**
	 * XFire客户端调用IDS类服务
	 * 
	 * @param serviceURL
	 * @param userID
	 * @param password
	 * @param requestXML
	 * @return
	 * @throws Exception
	 */
	public static Object[] callIDSService(String serviceURL, String serviceName, String requestXML) throws Exception {
		
		return callService(serviceURL, serviceName, new Object[]{requestXML, "xml"});
	}
	
	//
	private static HttpURLConnection getConnection(String url) throws IOException {
		
		URL _url = new URL(url);
		HttpURLConnection connection = (HttpURLConnection) _url.openConnection();
		connection.setConnectTimeout(TIMEOUT);// 连接主机超时时间(单位:毫秒)
		connection.setReadTimeout(TIMEOUT);// 从主机读取数据超时时间(单位:毫秒)
		connection.setRequestMethod("POST");
		connection.setDoInput(true);
		connection.setDoOutput(true);
		connection.setUseCaches(false);
		connection.setDefaultUseCaches(false);
		return connection;
	}
	
	//
	private static Client getClient(HttpURLConnection connection) throws IOException, Exception {
		
		Client client = new Client(connection.getInputStream(), null);
		//Client client = Client.getInstance(connection.getInputStream());
		client.setProperty(CommonsHttpMessageSender.HTTP_TIMEOUT, String.valueOf(TIMEOUT));// 连接服务端超时
		client.setProperty(CommonsHttpMessageSender.DISABLE_KEEP_ALIVE, DISABLE_KEEP_ALIVE);
		client.setProperty(CommonsHttpMessageSender.DISABLE_EXPECT_CONTINUE, DISABLE_EXPECT_CONTINUE);
		return client;
	}
}
