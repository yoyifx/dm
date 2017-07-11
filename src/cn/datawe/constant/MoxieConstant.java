package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 常量类:魔蝎定义参数常量
 * 
 * @author Fangx
 * 
 */
public class MoxieConstant {
	/**
	 * 任务类型
	 */
	public static final String TASK_TYPE = "INSURANCE";
	/**
	 * 任务发起方式：moxie-sdk 
	 */
	public static final String TASK_WAY_SDK = "0";
	/**
	 * 任务发起方式: moxie-h5
	 */
	public static final String TASK_WAY_H5 = "1";
	/**
	 * 任务发起方式: api 有交互
	 */
	public static final String TASK_WAY_API_ACT = "2";
	/**
	 * 任务发起方式: api 无交互
	 */
	public static final String TASK_WAY_API = "3";
	/**
	 * 任务开始阶段
	 */
	public static final String TASK_NEW_PHASE = "NEW";
	/**
	 * 任务采集状态：未完成
	 */
	public static final int TASK_STATUS_UNDONE = 0;
	/**
	 * 任务采集状态：已完成
	 */
	public static final int TASK_STATUS_DONE = 1;
	/**
	 * 登录业务
	 */
	public static final String LOGIN_TARGET = "-1";
	/**
	 * 登录类别：保单号
	 */
	public static final String LOGIN_TYPE_POLICY = "policynum";
	/**
	 * 登录类别：车牌号
	 */
	public static final String LOGIN_TYPE_PLATE = "platenum";
	/**
	 * 登录类别：车架号
	 */
	public static final String LOGIN_TYPE_VEHICLE = "vehicleframenum";
	
	/**
	 * 保险公司名称列表
	 */
	public static final Map<String,String> MAP = new HashMap<String, String>();
	static{
		MAP.put("1", "PICC");//中国人民保险
		MAP.put("2", "PAIC");//中国平安
		MAP.put("3", "CPIC");//太平洋保险
		MAP.put("4", "GPIC");//中国人寿财产保险
		MAP.put("5", "CCIC");//中国大地保险
		MAP.put("6", "YGBX");//阳光保险
		MAP.put("7", "TPIC");//中国太平
		MAP.put("8", "TAIC");//天安财险
		MAP.put("9", "YDCX");//英大泰和财产保险
		MAP.put("10", "YAIC");//永安保险
		MAP.put("11", "DBIC");//都邦保险
		MAP.put("12", "ABIC");//安邦保险
		MAP.put("13", "TPBX");//安盛天平
		MAP.put("14", "AICS");//永诚财产保险
		MAP.put("15", "BOCI");//中银保险
		MAP.put("16", "ZKIC");//紫金财产保险
		MAP.put("17", "FBCX");//富邦财产保险
		MAP.put("18", "HABX");//华安财产保险
	}
}
