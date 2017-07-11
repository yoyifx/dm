package cn.datawe.constant;

/**
 * 常量类:memcached缓存key
 * 
 * @author YCZ
 * 
 */
public class CacheConstant {

	/**
	 * 卡号码+uuid(30天)
	 */
	public static final String CARD_NO_BY_UUID_KEY = "card_no_by_uuid_";

	/**
	 * 手机号码+uuid(30天)
	 */
	public static final String MOBILE_NO_BY_UUID_KEY = "mobile_no_by_uuid_";
	
	/**
	 * token(半小时)
	 * */
	public static final String TOKEN_KEY="token_key_";
	
	/**
	 * 用户输入密码连续错5次，锁定两小时
	 * */
	public static final String LOCK_USER="lock_user_";
	
	/**
	 * 用户输入密码连续错5次，锁定两小时
	 * */
	public static final String LOCK_USER_NUM="lock_user_num_";

	/**
	 * 同程金服access_token(3000s)
	 * */
	public static final String LY_ACCESS_TOKEN = "ly_access_token";

	/**
	 * 同程金服encrypt_key(3000s)
	 * */
	public static final String LY_ENCRYPT_KEY = "ly_encrypt_key";

	/**
	 * 增信通token(2小时)
	 */
	public static final String CREDITTONE_TOKEN = "credittone_token";

	/**
	 * 百融tokenid(1小时)
	 */
	public static final String CREDIT100_TOKEN_ID = "credit100_token_id";

	/**
	 * 多数据源当前接口
	 */
	public static final String REMOTE_SOURCE_CURRENT_API = "remote_source_current_api_";

	/**
	 * 多数据源成功
	 */
	public static final String REMOTE_SOURCE_SUCCESS = "remote_source_success_";
	/**
	 * 多数据源失败
	 */
	public static final String REMOTE_SOURCE_FAIL = "remote_source_fail_";
	
	/**
	 * 数据源账号信息
	 * */
	public static final String REMOTE_ACCOUNT_INFO = "remote_account_info_";
	
	/**
	 * 异常数据源
	 * */
	public static final String REMOTE_ERROR="remote_error";
	
	/**
	 * 异常数据源发送消息
	 * */
	public static final String REMOTE_ERROR_SEND_MSG="remote_error_send_msg_";

	/**
	 * R 服务ip:port 组
	 */
	public static final String R_SERVERS = "r_servers";
	
	/**
	 * 葫芦数据：索伦数据访问令牌token
	 */
	public static final String HULUHUJU_SAURON_ACCESS_TOKEN = "huluhuju_sauron_access_token";
	
}
