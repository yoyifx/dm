/**
 * 工程名：dm-util
 * 包名：cn.datawe.constant
 */
package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 类名：OperateLogConstant
 * 
 * @desc 操作日志常量
 * @author lishasha
 * @version 1.0
 * @since v1.0
 * @Date 2017年3月27日下午5:41:42
 */
public class OperateLogConstant {

	/**
	 * 登录
	 * */
	public static final int LOGIN = 0;
	/**
	 * 新增
	 * */
	public static final int ADD = 1;
	/**
	 * 修改
	 * */
	public static final int EDIT = 2;
	/**
	 * 删除
	 * */
	public static final int DELETE = 3;
	/**
	 * 查看
	 * */
	public static final int QUERY = 4;
	/**
	 * 测试
	 * */
	public static final int TEST = 5;

	public static final Map<String, Integer> MAP = new HashMap<String, Integer>();
	static {
		MAP.put(LogEnum.LOGIN, LOGIN);
		MAP.put(LogEnum.ADD, ADD);
		MAP.put(LogEnum.EDIT, EDIT);
		MAP.put(LogEnum.DELETE, DELETE);
		MAP.put(LogEnum.QUERY, QUERY);
		MAP.put(LogEnum.TEST, TEST);
	}

}
