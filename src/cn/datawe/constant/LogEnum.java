/**
 * 工程名：dm-util
 * 包名：cn.datawe.constant
 */
package cn.datawe.constant;

/**
 * 类名：LogEnum
 * 
 * @desc
 * @author lishasha
 * @version 1.0
 * @since v1.0
 * @Date 2017年3月24日下午3:23:34
 */
public enum LogEnum {

	USER("USER", "用户信息"), ROLE("ROLE", "角色信息"), DSOURCE("DSOURCE", "数据源信息"), API("API", "接口信息");

	/**
	 * 登录
	 * */
	public static final String LOGIN = "LOGIN";
	/**
	 * 新增
	 * */
	public static final String ADD = "ADD";
	/**
	 * 修改
	 * */
	public static final String EDIT = "EDIT";
	/**
	 * 删除
	 * */
	public static final String DELETE = "DELETE";
	/**
	 * 查看
	 * */
	public static final String QUERY = "QUERY";
	/**
	 * 测试
	 * */
	public static final String TEST = "TEST";
	/**
	 * 调用
	 * */
	public static final String INVOKE = "INVOKE";

	/**
	 * 日志类型
	 * */
	public String type;

	/**
	 * 操作标记
	 * */
	public String target;

	/**
	 * 日志信息
	 * */
	public String message;

	LogEnum(String type, String target) {
		this.type = type;
		this.target = target;
	}

	LogEnum(String type, String target, String message) {
		this.type = type;
		this.target = target;
		this.message = message;
	}
	
	

}
