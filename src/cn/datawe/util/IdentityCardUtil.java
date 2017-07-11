package cn.datawe.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 工具类:公民身份证
 * 
 * @author LiuJiaLe
 * 
 */
public final class IdentityCardUtil {
	
	/****************************************************************
	 * 身份证号码组成
	 * 
	 * 1.地址码:身份证号码前6位(1-2位表示省, 3-4位表示市, 5-6位表示区)
	 * 2.出生日期码:一代身份证是地址码后6位, 二代身份证是地址码后8位
	 * 3.顺序码:出生日期码后3位, 奇数表示男性, 偶数表示女性
	 * 4.校验码:二代身份证号码最末位(目前只有二代身份证才有校验码)
	 ****************************************************************/
	
	private static final Log logger = LogFactory.getLog(IdentityCardUtil.class);
	
	/**
	 * 出生日期格式
	 */
	private static final String BIRTHDATE_FORMAT = "yyyyMMdd";
	
	/**
	 * 出生日期的最小年份
	 */
	private static final int BIRTHDATE_MIN_YEAR = 1930;
	
	/**
	 * 性别:男
	 */
	private static final String GENDER_MALE = "1";
	
	/**
	 * 性别:女
	 */
	private static final String GENDER_FEMALE = "2";
	
	/**
	 * 性别:不详
	 */
	private static final String GENDER_UNKNOWN = "3";

	/**
	 * 二代身份证号码中前17位的每位加权因子
	 */
	private static final int[] POWER_ARRAY = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
	
	/**
	 * 二代身份证校验码(通过前17位加权求和并取模得到对应的校验码)
	 */
	private static final String[] CHECK_CODE_ARRAY = { "1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2" };
	
	/**
	 * 省、自治区、直辖市、性别字典表
	 */
	private static Map<String, String> PROVINCE_MAP = new HashMap<String, String>();
	private static Map<String, String> GENDER_MAP = new HashMap<String, String>();
	static {
		
		PROVINCE_MAP.put("11", "北京");
		PROVINCE_MAP.put("12", "天津");
		PROVINCE_MAP.put("13", "河北");
		PROVINCE_MAP.put("14", "山西");
		PROVINCE_MAP.put("15", "内蒙古");
		PROVINCE_MAP.put("21", "辽宁");
		PROVINCE_MAP.put("22", "吉林");
		PROVINCE_MAP.put("23", "黑龙江");
		PROVINCE_MAP.put("31", "上海");
		PROVINCE_MAP.put("32", "江苏");
		PROVINCE_MAP.put("33", "浙江");
		PROVINCE_MAP.put("34", "安徽");
		PROVINCE_MAP.put("35", "福建");
		PROVINCE_MAP.put("36", "江西");
		PROVINCE_MAP.put("37", "山东");
		PROVINCE_MAP.put("41", "河南");
		PROVINCE_MAP.put("42", "湖北");
		PROVINCE_MAP.put("43", "湖南");
		PROVINCE_MAP.put("44", "广东");
		PROVINCE_MAP.put("45", "广西");
		PROVINCE_MAP.put("46", "海南");
		PROVINCE_MAP.put("50", "重庆");
		PROVINCE_MAP.put("51", "四川");
		PROVINCE_MAP.put("52", "贵州");
		PROVINCE_MAP.put("53", "云南");
		PROVINCE_MAP.put("54", "西藏");
		PROVINCE_MAP.put("61", "陕西");
		PROVINCE_MAP.put("62", "甘肃");
		PROVINCE_MAP.put("63", "青海");
		PROVINCE_MAP.put("64", "宁夏");
		PROVINCE_MAP.put("65", "新疆");
		
		GENDER_MAP.put(GENDER_MALE, "男");
		GENDER_MAP.put(GENDER_FEMALE, "女");
		GENDER_MAP.put(GENDER_UNKNOWN, "不详");
	}
	
	/**
	 * 判断是否为有效的身份证号码
	 * 
	 * @param id 身份证号码
	 * @return 有效身份证号码，返回true，否则返回false
	 */
	public static boolean isID(String id) {

		return isFirstID(id) || isSecondID(id);
	}
	
	/**
	 * 判断是否为无效的身份证号码
	 * 
	 * @param id 身份证号码
	 * @return 无效身份证号码，返回true，否则返回false
	 */
	public static boolean isNotID(String id) {
		
		return !isID(id);
	}
	
	/**
	 * 判断是否为一代身份证号码
	 * 
	 * @param id 身份证号码
	 * @return 是一代身份证号码，返回true，否则返回false
	 */
	public static boolean isFirstID(String id) {
		// 正则校验
		if (ValidatorUtil.isNotID(id)) {
			
			return false;
		}
		// 检查长度
		if (id.length() != 15) {
			
			return false;
		}
		// 检查省级行政区划
		if (null == AreaUtil.getName(id.substring(0, 2).concat("0000"))) {
			
			return false;
		}
		// 检查出生日期
		return isBirthdate("19".concat(id.substring(6, 12)));
	}
	
	/**
	 * 判断是否不为一代身份证号码
	 * 
	 * @param id 身份证号码
	 * @return 不是一代身份证号码，返回true，否则返回false
	 */
	public static boolean isNotFirstID(String id) {
		
		return !isFirstID(id);
	}
	
	/**
	 * 判断是否为二代身份证号码
	 * 
	 * @param id 身份证号码
	 * @return 是二代身份证号码，返回true，否则返回false
	 */
	public static boolean isSecondID(String id) {
		// 正则校验
		if (ValidatorUtil.isNotID(id)) {
			
			return false;
		}
		// 检查长度
		if (id.length() != 18) {
			
			return false;
		}
		// 检查省级行政区划
		if (null == AreaUtil.getName(id.substring(0, 2).concat("0000"))) {
			
			return false;
		}
		// 检查出生日期
		if (isNotBirthdate(id.substring(6, 14))) {
			
			return false;
		}
		// 检查校验码
		return id.substring(17).equalsIgnoreCase(getCheckCodeBySecondID(id));
	}
	
	/**
	 * 判断是否不为二代身份证号码
	 * 
	 * @param id 身份证号码
	 * @return 不是二代身份证号码，返回true，否则返回false
	 */
	public static boolean isNotSecondID(String id) {
		
		return !isSecondID(id);
	}
	
	/**
	 * 将一代身份证号码转换为二代身份证号码
	 * 
	 * @param firstID 一代身份证号码
	 * @return 一代身份证校验通过并转换成功，返回二代身份证号码，否则返回空
	 */
	public static String toSecondID(String firstID) {
		
		if (isFirstID(firstID)) {
			// 生成前17位身份证号码
			String secondID = firstID.substring(0, 6)
					.concat("19").concat(firstID.substring(6, 12))
					.concat(firstID.substring(12));
			// 生成最后1位校验码
			String checkCode = getCheckCodeBySecondID(secondID);
			if (null != checkCode) {
				// 生成二代身份证号码
				return secondID.concat(checkCode);
			}
		}
		return null;
	}
	
	/**
	 * 获取身份证号码中的出生日期
	 * 
	 * @param id 身份证号码
	 * @return 身份证号码校验通过，返回身份证号码中的出生日期，格式：yyyyMMdd
	 */
	public static String getBirthdate(String id) {
		
		if (isFirstID(id)) {
			
			return "19".concat(id.substring(6, 12));
		}
		if (isSecondID(id)) {
			
			return id.substring(6, 14);
		}
		return null;
	}
	
	/**
	 * 获取身份证号码中的出生日期
	 * 
	 * @param id 身份证号码
	 * @param format 自定义出生日期格式
	 * @return 身份证号码校验通过，返回身份证号码中的出生日期
	 */
	public static String getBirthdate(String id, String format) {
		
		return DateUtil.toString(getBirthdate(id), BIRTHDATE_FORMAT, format);
	}
	
	/**
	 * 获取身份证号码中的出生年份
	 * 
	 * @param id 身份证号码
	 * @return 身份证号码校验通过，返回出生年份，否则返回空
	 */
	public static Integer getBirthYear(String id) {
		
		if (isFirstID(id)) {
			
			return Integer.parseInt("19".concat(id.substring(6, 8)));
		}
		if (isSecondID(id)) {
			
			return Integer.parseInt(id.substring(6, 10));
		}
		return null;
	}
	
	/**
	 * 获取身份证号码中的出生月份
	 * 
	 * @param id 身份证号码
	 * @return 身份证号码校验通过，返回出生月份，否则返回空
	 */
	public static Integer getBirthMonth(String id) {
		
		if (isFirstID(id)) {
			
			return Integer.parseInt(id.substring(8, 10));
		}
		if (isSecondID(id)) {
			
			return Integer.parseInt(id.substring(10, 12));
		}
		return null;
	}
	
	/**
	 * 获取身份证号码中的性别代码
	 * 
	 * @param id 身份证号码
	 * @return 身份证号码校验通过，返回身份证号码校验结果，1：男，2：女，3：不详
	 */
	public static String getGenderCode(String id) {
		
		char gender = 3;
		if (isFirstID(id)) {
			
			gender = id.charAt(14);
		} else if (isSecondID(id)) {
			
			gender = id.charAt(16);
		} else {
			
			return GENDER_UNKNOWN;
		}
		if ((gender & 1) == 0) {
			
			return GENDER_FEMALE;
		}
		return GENDER_MALE;
	}
	
	/**
	 * 获取身份证号码中的性别名称(1:男, 2:女, 3:不详)
	 * 
	 * @param id 身份证号码
	 * @return 身份证号码校验通过，返回1或2，否则返回3
	 */
	public static String getGenderName(String id) {
		
		return GENDER_MAP.get(getGenderCode(id));
	}
	
	/**
	 * 获取身份证号码中的当前年龄
	 * 
	 * @param id 身份证号码
	 * @return 身份证号码校验通过，返回当前年龄，否则返回空
	 */
	public static Integer getAge(String id) {
		
		int year = 0;
		if (isFirstID(id)) {
			
			year = Integer.parseInt("19".concat(id.substring(6, 8)));
		} else if (isSecondID(id)) {
			
			year = Integer.parseInt(id.substring(6, 10));
		} else {
			
			return null;
		}
		int age = getCurrentYear() - year;
		return age > 0 ? age : null;
	}
	
	/**
	 * 获取身份证号码中的省份名称
	 * 
	 * @param id 身份证号码
	 * @return 身份证号码校验通过，返回省份名称，否则返回空
	 */
	public static String getProvinceName(String id) {
		
		if (isID(id)) {
			
			return PROVINCE_MAP.get(id.substring(0, 2));
		}
		return null;
	}
	
	/**
	 * 获取身份证号码中的行政区划名称(包含省市区)
	 * 
	 * <p>注意：根据国家最新版的行政区划数据字典匹配结果，使用旧版行政区划代码的身份证可能会获取不到结果或结果已变更</p>
	 * @param id 身份证号码
	 * @return 身份证号码校验通过，返回行政区划名称(包含省市区)，否则返回空
	 */
	public static String getFullAreaName(String id) {
		
		return isID(id) ? AreaUtil.getFullName(id.substring(0, 6)) : null;
	}
	
	/**
	 * 判断出生日期是否有效
	 * 
	 * @param birthdate 出生日期，格式：yyyyMMdd
	 * @return 有效出生日期，返回true，否则返回false
	 */
	public static boolean isBirthdate(String birthdate) {
		
		if (null == birthdate || birthdate.length() != 8) {
			
			return false;
		}
		Date date = null;
		try {
			
			date = new SimpleDateFormat(BIRTHDATE_FORMAT).parse(birthdate);
		} catch (Exception e) {
			
			logger.warn(e);
			return false;
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		return isBirthdate(year, month, day);
	}
	
	/**
	 * 判断出生日期是否无效
	 * 
	 * @param birthdate 出生日期，格式：yyyyMMdd
	 * @return 无效的出生日期返回true，否则返回false
	 */
	public static boolean isNotBirthdate(String birthdate) {
		
		return !isBirthdate(birthdate);
	}
	
	/**
	 * 判断出生日期是否有效
	 * 
	 * @param year 年
	 * @param month 月
	 * @param day 日
	 * @return 有效的出生日期返回true，否则返回false
	 */
	public static boolean isBirthdate(int year, int month, int day) {
		
		if (year < BIRTHDATE_MIN_YEAR || year >= getCurrentYear() || month < 1 || month > 12 || day < 1) {
			
			return false;
		}
		int lastDayOfMonth;
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			
			lastDayOfMonth = 30;
			break;
		case 2:
			
			lastDayOfMonth = ValidatorUtil.isLeapYear(year) ? 29 : 28;
			break;
		default:
			
			lastDayOfMonth = 31;
		}
		return day <= lastDayOfMonth;
	}
	
	/**
	 * 判断身份证号码中的出生日期是否无效
	 * 
	 * @param year 年
	 * @param month 月
	 * @param day 日
	 * @return 无效的出生日期返回true，否则返回false
	 */
	public static boolean isNotBirthdate(int year, int month, int day) {
		
		return !isBirthdate(year, month, day);
	}
	
	/**
	 * 获取二代身份证号码中的校验码
	 * 
	 * @param secondID 二代身份证号码
	 * @return 返回二代身份证号码中的校验码
	 */
	public static String getCheckCodeBySecondID(String secondID) {
		
		int sum = 0;
		for (int i=0; i<17; i++) {
			
			sum += POWER_ARRAY[i] * (secondID.charAt(i) - '0');
		}
		return CHECK_CODE_ARRAY[sum % 11];
	}
	
	/**
	 * 获取当前年份
	 * 
	 * @return 返回当前年份
	 */
	public static int getCurrentYear() {
		
		return Calendar.getInstance().get(Calendar.YEAR);
	}
	
	private IdentityCardUtil() {}
}
