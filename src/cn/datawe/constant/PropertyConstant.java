package cn.datawe.constant;

/**
 * 常量类:参数配置的key
 * 
 * @author YCZ
 * 
 */
public class PropertyConstant {

	/**
	 * 小视科技数据源请求URL:https://www.miniscores.cn:8313/CreditFunc/v2.1/
	 */
	public static final String MINIVISION_URL = "minivision_url";

	/**
	 * 同程金服数据源请求URL:http://jrdata.ly.com/
	 */
	public static final String LY_URL = "ly_url";

	/**
	 * 同程金服RSA密钥文件地址
	 */
	public static final String LY_PRIVATEKEY_FILEPATH = "ly_privateKey_filepath";

	/**
	 * 增信通数据源请求URL:http://creditsearch.credittone.com
	 */
	public static final String CREDITTONE_URL = "credittone_url";

	/**
	 * 数据堂数据源请求URL:http://apidata.datatang.com/data
	 */
	public static final String DATATANG_URL = "datatang_url";

	/**
	 * 用户密码输错次数
	 * */
	public static final String USER_PASSWORD_ERROR_NUM = "user_password_error_num";

	/**
	 * 数据源接口切换开关(on:自动，off:关闭)
	 */
	public static final String REMOTE_SOURCE_AUTO_SWITCH = "remote_source_auto_switch_";

	/**
	 * 数据源接口默认编号
	 */
	public static final String REMOTE_SOURCE_API_DEFAULT = "remote_source_api_default_";

	/**
	 * 数据源接口负载均衡开关(on:自动，off:关闭)
	 */
	public static final String REMOTE_SOURCE_WR_SWITCH = "remote_source_wr_switch_";

}
