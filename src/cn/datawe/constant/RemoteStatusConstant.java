package cn.datawe.constant;
import java.util.HashMap;
import java.util.Map;

public class RemoteStatusConstant {
	private static final String SUC="0";
	private static final String FAIL="1";
	private static final String NOT_FOUND="2";
	private static final String QUEUE="3";
	private static final String ERROR="-1";
	private static final String REMOTE_ERROR="-2";
	private static final String REMOTE_ERROR_INFO="-3";
	
	public static final Map<String, String> MAP = new HashMap<String, String>();
	
	static {

		MAP.put(RemoteStatusConstant.SUC, "成功");
		MAP.put(RemoteStatusConstant.FAIL, "失败");
		MAP.put(RemoteStatusConstant.NOT_FOUND, "没有找到相关记录");
		MAP.put(RemoteStatusConstant.QUEUE, "排队中");
		MAP.put(RemoteStatusConstant.ERROR, "出错了");
		MAP.put(RemoteStatusConstant.REMOTE_ERROR, "访问远程接口出错");
		MAP.put(RemoteStatusConstant.REMOTE_ERROR_INFO, "远程接口返回错误信息");
	
	}
}
