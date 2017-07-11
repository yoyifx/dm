package cn.datawe.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.datawe.constant.WeekEnum;

/**
 * 工具类:日期
 * 
 * @author LiuJiaLe
 * 
 */
public final class DateUtil {

	private static final Log logger = LogFactory.getLog(DateUtil.class);

	public static final int WEEK_TYPE_CN_NAME = 1;
	public static final int WEEK_TYPE_CN_SHORT_NAME = 2;
	public static final int WEEK_TYPE_EN_NAME = 3;
	public static final int WEEK_TYPE_EN_SHORT_NAME = 4;
	public static final int WEEK_TYPE_NUMBER = 5;

	public static final String FORMAT_CST = "EEE MMM dd HH:mm:ss z yyyy";
	public static final String FORMAT_DATE_TIME = "yyyy-MM-dd HH:mm:ss";
	public static final String FORMAT_DATE = "yyyy-MM-dd";
	public static final String FORMAT_DATE_1="yyyy/MM/dd";
	public static final String FORMAT_TIME = "HH:mm:ss";
	public static final String FORMAT_CN_DATE_TIME = "yyyy年MM月dd日 HH时mm分ss秒";
	public static final String FORMAT_CN_DATE = "yyyy年MM月dd日";
	public static final String FORMAT_CN_TIME = "HH时mm分ss秒";

	/**
	 * 昨天
	 * 
	 * @param format
	 * @return
	 */
	public static String yesterday(String format) {

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -1);
		return getDateFormat(format).format(calendar.getTime());
	}

	/**
	 * 今天
	 * 
	 * @param format
	 * @return
	 */
	public static String today(String format) {

		return getDateFormat(format).format(new Date());
	}

	/**
	 * 明天
	 * 
	 * @param format
	 * @return
	 */
	public static String tomorrow(String format) {

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 1);
		return getDateFormat(format).format(calendar.getTime());
	}

	/**
	 * 当前日期
	 * 
	 * @return
	 */
	public static Date currentDate() {

		return new Date();
	}

	/**
	 * 当前日期:年
	 * 
	 * @return
	 */
	public static int currentYear() {

		return getYear(currentDate());
	}

	/**
	 * 当前日期:月
	 * 
	 * @return
	 */
	public static int currentMonth() {

		return getMonth(currentDate());
	}

	/**
	 * 当前日期:日
	 * 
	 * @return
	 */
	public static int currentDay() {

		return getDay(currentDate());
	}

	/**
	 * 当前日期:星期几
	 * 
	 * @return
	 */
	public static int currentWeek() {

		return getWeek(currentDate());
	}

	/**
	 * 当前日期:时
	 * 
	 * @return
	 */
	public static int currentHour() {

		return getHour(currentDate());
	}

	/**
	 * 当前日期:分
	 * 
	 * @return
	 */
	public static int currentMinute() {

		return getMinute(currentDate());
	}

	/**
	 * 当前日期:秒
	 * 
	 * @return
	 */
	public static int currentSecond() {

		return getSecond(currentDate());
	}

	/**
	 * 当前日期:毫秒
	 * 
	 * @return
	 */
	public static int currentMillisecond() {

		return getMillisecond(currentDate());
	}

	/**
	 * 判断是否为工作日(周六和周日为非工作日)
	 * 
	 * @param date
	 * @return
	 */
	public static boolean isWorkDay(Date date) {

		return !isNotWorkDay(date);
	}

	/**
	 * 判断是否为工作日(周六和周日为非工作日)
	 * 
	 * @param date
	 * @return
	 */
	public static boolean isNotWorkDay(Date date) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		return week == Calendar.SUNDAY || week == Calendar.SATURDAY;
	}

	/**
	 * 判断第一个时间是否小于第二个时间
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isLess(String str1, String str2) {

		Long milliseconds = intervalMilliseconds(str1, str2);
		return milliseconds < 0;
	}

	/**
	 * 判断第一个时间是否不小于第二个时间
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isNotLess(String str1, String str2) {

		return !isLess(str1, str2);
	}

	/**
	 * 判断第一个时间是否小于第二个时间
	 * 
	 * @param str1
	 * @param str2
	 * @param format
	 * @return
	 */
	public static boolean isLess(String str1, String str2, String format) {

		Long milliseconds = intervalMilliseconds(str1, str2, format);
		return milliseconds < 0;
	}

	/**
	 * 判断第一个时间是否不小于第二个时间
	 * 
	 * @param str1
	 * @param str2
	 * @param format
	 * @return
	 */
	public static boolean isNotLess(String str1, String str2, String format) {

		return !isLess(str1, str2, format);
	}

	/**
	 * 判断第一个时间是否大于第二个时间
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isGreater(String str1, String str2) {

		Long milliseconds = intervalMilliseconds(str1, str2);
		return milliseconds > 0;
	}

	/**
	 * 判断第一个时间是否不大于第二个时间
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isNotGreater(String str1, String str2) {

		return !isGreater(str1, str2);
	}

	/**
	 * 判断第一个时间是否大于第二个时间
	 * 
	 * @param str1
	 * @param str2
	 * @param format
	 * @return
	 */
	public static boolean isGreater(String str1, String str2, String format) {

		Long milliseconds = intervalMilliseconds(str1, str2, format);
		return milliseconds > 0;
	}

	/**
	 * 判断第一个时间是否不大于第二个时间
	 * 
	 * @param str1
	 * @param str2
	 * @param format
	 * @return
	 */
	public static boolean isNotGreater(String str1, String str2, String format) {

		return !isGreater(str1, str2, format);
	}

	/**
	 * 判断两个时间是否相等
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isEquals(String str1, String str2) {

		Long milliseconds = intervalMilliseconds(str1, str2);
		return milliseconds == 0;
	}

	/**
	 * 判断两个时间是否不相等
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isNotEquals(String str1, String str2) {

		return !isEquals(str1, str2);
	}

	/**
	 * 判断两个日期是否不相等
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static boolean isEquals(Date date1, Date date2) {

		if (ValidatorUtil.isNotEquals(getYear(date1), getYear(date2)) || ValidatorUtil.isNotEquals(getMonth(date1), getMonth(date2)) || ValidatorUtil.isNotEquals(getDay(date1), getDay(date2))) {

			return false;
		}
		return true;
	}

	/**
	 * 判断两个日期是否不相等
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static boolean isNotEquals(Date date1, Date date2) {

		return !isEquals(date1, date2);
	}

	/**
	 * 判断两个时间是否相等
	 * 
	 * @param str1
	 * @param str2
	 * @param format
	 * @return
	 */
	public static boolean isEquals(String str1, String str2, String format) {

		Long milliseconds = intervalMilliseconds(str1, str2, format);
		return milliseconds == 0;
	}

	/**
	 * 判断两个时间是否不相等
	 * 
	 * @param str1
	 * @param str2
	 * @param format
	 * @return
	 */
	public static boolean isNotEquals(String str1, String str2, String format) {

		return !isEquals(str1, str2, format);
	}

	/**
	 * 判断是否为闰年
	 * 
	 * @param year
	 * @return
	 */
	public static boolean isLeapYear(int year) {

		return year < 1 ? false : (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
	}

	/**
	 * 判断是否不为闰年
	 * 
	 * @param year
	 * @return
	 */
	public static boolean isNotLeapYear(int year) {

		return !isLeapYear(year);
	}

	/**
	 * 判断是否为闰年
	 * 
	 * @param date
	 * @return
	 */
	public static boolean isLeapYear(Date date) {

		return isLeapYear(getYear(date));
	}

	/**
	 * 判断是否不为闰年
	 * 
	 * @param date
	 * @return
	 */
	public static boolean isNotLeapYear(Date date) {

		return !isLeapYear(date);
	}

	/**
	 * 解析日期字符串返回日期对象(不含时分秒)
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Date parseDate(String str, String format) {

		try {

			DateFormat dateFormat = getDateFormat(format);
			str = reformat(str, format);
			return (Date) dateFormat.parse(str);
		} catch (Exception e) {

			logger.warn(e);
		}
		return null;
	}

	/**
	 * 获取日期中的某个数值
	 * 
	 * @param date
	 * @param dateType
	 * @return
	 */
	public static Integer get(Date date, int dateType) {

		if (null == date) {

			return null;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(dateType);
	}

	/**
	 * 获取日期:年
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Integer getYear(String str, String format) {

		return getYear(toDate(str, format));
	}

	/**
	 * 获取日期:年
	 * 
	 * @param date
	 * @return
	 */
	public static Integer getYear(Date date) {

		return get(date, Calendar.YEAR);
	}

	/**
	 * 获取日期:月
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Integer getMonth(String str, String format) {

		return getMonth(toDate(str, format));
	}

	/**
	 * 获取日期:月
	 * 
	 * @param date
	 * @return
	 */
	public static Integer getMonth(Date date) {

		Integer month = get(date, Calendar.MONTH);
		return null == month ? null : month + 1;
	}

	/**
	 * 获取日期:日
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Integer getDay(String str, String format) {

		return getDay(toDate(str, format));
	}

	/**
	 * 获取日期:日
	 * 
	 * @param date
	 * @return
	 */
	public static Integer getDay(Date date) {

		return get(date, Calendar.DAY_OF_MONTH);
	}

	/**
	 * 获取日期:星期几
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Integer getWeek(String str, String format) {

		return getWeek(toDate(str, format));
	}

	/**
	 * 获取日期:星期几
	 * 
	 * @param date
	 * @return
	 */
	public static Integer getWeek(Date date) {

		Integer week = get(date, Calendar.DAY_OF_WEEK);
		return null == week ? null : week - 1;
	}

	/**
	 * 获取日期:时
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Integer getHour(String str, String format) {

		return getHour(toDate(str, format));
	}

	/**
	 * 获取日期:时
	 * 
	 * @param date
	 * @return
	 */
	public static Integer getHour(Date date) {

		return get(date, Calendar.HOUR_OF_DAY);
	}

	/**
	 * 获取日期:分
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Integer getMinute(String str, String format) {

		return getMinute(toDate(str, format));
	}

	/**
	 * 获取日期:分
	 * 
	 * @param date
	 * @return
	 */
	public static Integer getMinute(Date date) {

		return get(date, Calendar.MINUTE);
	}

	/**
	 * 获取日期:秒
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Integer getSecond(String str, String format) {

		return getSecond(toDate(str, format));
	}

	/**
	 * 获取日期:秒
	 * 
	 * @param date
	 * @return
	 */
	public static Integer getSecond(Date date) {

		return get(date, Calendar.SECOND);
	}

	/**
	 * 获取日期:毫秒
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Integer getMillisecond(String str, String format) {

		return getMillisecond(toDate(str, format));
	}

	/**
	 * 获取日期:毫秒
	 * 
	 * @param date
	 * @return
	 */
	public static Integer getMillisecond(Date date) {

		return get(date, Calendar.MILLISECOND);
	}

	/**
	 * 设置日期中的某个数值
	 * 
	 * @param date
	 * @param dateType
	 * @param amount
	 * @return
	 */
	public static Date set(Date date, int dateType, int amount) {

		if (null == date) {

			return null;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(dateType, amount);
		return calendar.getTime();
	}

	/**
	 * 设置日期:年
	 * 
	 * @param date
	 * @param amount
	 * @return
	 */
	public static Date setYear(Date date, int amount) {

		return set(date, Calendar.YEAR, amount);
	}

	/**
	 * 设置日期:月
	 * 
	 * @param date
	 * @param amount
	 * @return
	 */
	public static Date setMonth(Date date, int amount) {

		return set(date, Calendar.MONTH, amount);
	}

	/**
	 * 设置日期:日
	 * 
	 * @param date
	 * @param amount
	 * @return
	 */
	public static Date setDay(Date date, int amount) {

		return set(date, Calendar.DATE, amount);
	}

	/**
	 * 设置日期:时
	 * 
	 * @param date
	 * @param amount
	 * @return
	 */
	public static Date setHour(Date date, int amount) {

		return set(date, Calendar.HOUR_OF_DAY, amount);
	}

	/**
	 * 设置日期:分
	 * 
	 * @param date
	 * @param amount
	 * @return
	 */
	public static Date setMinute(Date date, int amount) {

		return set(date, Calendar.MINUTE, amount);
	}

	/**
	 * 设置日期:秒
	 * 
	 * @param date
	 * @param amount
	 * @return
	 */
	public static Date setSecond(Date date, int amount) {

		return set(date, Calendar.SECOND, amount);
	}

	/**
	 * 设置日期:毫秒
	 * 
	 * @param date
	 * @param amount
	 * @return
	 */
	public static Date setMillisecond(Date date, int amount) {

		return set(date, Calendar.MILLISECOND, amount);
	}

	/**
	 * 获取指定日期的上一年
	 * 
	 * @param date
	 * @return
	 */
	public static Date prevYear(Date date) {

		return setYear(date, -1);
	}

	/**
	 * 获取指定日期的下一年
	 * 
	 * @param date
	 * @return
	 */
	public static Date nextYear(Date date) {

		return setYear(date, 1);
	}

	/**
	 * 获取指定日期的上一月
	 * 
	 * @param date
	 * @return
	 */
	public static Date prevMonth(Date date) {

		return setMonth(date, -1);
	}

	/**
	 * 获取指定日期的下一月
	 * 
	 * @param date
	 * @return
	 */
	public static Date nextMonth(Date date) {

		return setMonth(date, 1);
	}

	/**
	 * 获取指定日期的上一天
	 * 
	 * @param date
	 * @return
	 */
	public static Date prevDay(Date date) {

		return setDay(date, -1);
	}

	/**
	 * 获取指定日期的下一天
	 * 
	 * @param date
	 * @return
	 */
	public static Date nextDay(Date date) {

		return setDay(date, 1);
	}

	/**
	 * 获取两个日期相差天数
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static Integer intervalDays(String str1, String str2) {

		Long milliseconds = intervalMilliseconds(str1, str2, FORMAT_DATE);
		return null == milliseconds ? null : (int) (milliseconds / (24 * 60 * 60 * 1000));
	}

	/**
	 * 获取两个日期相差天数
	 * 
	 * @param str1
	 * @param str2
	 * @param format
	 * @return
	 */
	public static Integer intervalDays(String str1, String str2, String format) {

		Long milliseconds = intervalMilliseconds(str1, str2, format);
		return null == milliseconds ? null : (int) (milliseconds / (24 * 60 * 60 * 1000));
	}

	/**
	 * 获取两个日期相差小时数
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static Long intervalHours(String str1, String str2) {

		Long milliseconds = intervalMilliseconds(str1, str2, "yyyy-MM-dd HH");
		return null == milliseconds ? null : (long) (milliseconds / (60 * 60 * 1000));
	}

	/**
	 * 获取两个日期相差小时数
	 * 
	 * @param str1
	 * @param str2
	 * @param format
	 * @return
	 */
	public static Long intervalHours(String str1, String str2, String format) {

		Long milliseconds = intervalMilliseconds(str1, str2, format);
		return null == milliseconds ? null : (long) (milliseconds / (60 * 60 * 1000));
	}

	/**
	 * 获取两个日期相差分钟数
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static Long intervalMinutes(String str1, String str2) {

		Long milliseconds = intervalMilliseconds(str1, str2, "yyyy-MM-dd HH:mm");
		return null == milliseconds ? null : (long) (milliseconds / (60 * 1000));
	}

	/**
	 * 获取两个日期相差分钟数
	 * 
	 * @param str1
	 * @param str2
	 * @param format
	 * @return
	 */
	public static Long intervalMinutes(String str1, String str2, String format) {

		Long milliseconds = intervalMilliseconds(str1, str2, format);
		return null == milliseconds ? null : (long) (milliseconds / (60 * 1000));
	}

	/**
	 * 获取两个日期相差秒数
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static Long intervalSeconds(String str1, String str2) {

		Long milliseconds = intervalMilliseconds(str1, str2, FORMAT_DATE_TIME);
		return null == milliseconds ? null : (long) (milliseconds / 1000);
	}

	/**
	 * 获取两个日期相差秒数
	 * 
	 * @param str1
	 * @param str2
	 * @param format
	 * @return
	 */
	public static Long intervalSeconds(String str1, String str2, String format) {

		Long milliseconds = intervalMilliseconds(str1, str2, format);
		return null == milliseconds ? null : (long) (milliseconds / 1000);
	}

	/**
	 * 获取两个日期相差毫秒数
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static Long intervalMilliseconds(String str1, String str2) {

		return intervalMilliseconds(str1, str2, "yyyy-MM-dd HH:mm:ss:SSS");
	}

	/**
	 * 获取两个日期相差毫秒数
	 * 
	 * @param str1
	 * @param str2
	 * @param format
	 * @return
	 */
	public static Long intervalMilliseconds(String str1, String str2, String format) {

		try {

			str1 = reformat(str1, format);
			str2 = reformat(str2, format);
			DateFormat dateFormat = getDateFormat(format);
			Date date1 = dateFormat.parse(str1);
			Date date2 = dateFormat.parse(str2);
			return toMilliseconds(date1) - toMilliseconds(date2);
		} catch (Exception e) {

			logger.warn(e);
		}
		return null;
	}

	/**
	 * 获取两个日期相差毫秒数
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static Long intervalMilliseconds(Date date1, Date date2) {

		Long milliseconds1 = toMilliseconds(date1);
		Long milliseconds2 = toMilliseconds(date2);
		return (null == milliseconds1 || null == milliseconds2) ? null : milliseconds1 - milliseconds2;
	}

	/**
	 * 获取日期对应的星期信息
	 * 
	 * @param date
	 * @param type
	 * @return
	 */
	public static String getWeek(Date date, int type) {

		String result = null;
		WeekEnum weekEnum = getWeekEnum(date);
		if (type == WEEK_TYPE_CN_NAME) {

			result = weekEnum.getCnName();
		} else if (type == WEEK_TYPE_CN_NAME) {

			result = weekEnum.getCnShortName();
		} else if (type == WEEK_TYPE_CN_NAME) {

			result = weekEnum.getEnName();
		} else if (type == WEEK_TYPE_CN_NAME) {

			result = weekEnum.getEnShortName();
		} else {

			result = String.valueOf(weekEnum.getNumber());
		}
		return result;
	}

	/**
	 * 将指定日期转换为时间戳对象
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public static Timestamp toTimestamp(int year, int month, int day) {

		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(year, month - 1, day);
		return new Timestamp(calendar.getTimeInMillis());
	}

	/**
	 * 将日期对象转换为时间戳对象
	 * 
	 * @param date
	 * @return
	 */
	public static Timestamp toTimestamp(Date date) {

		return null == date ? null : new Timestamp(date.getTime());
	}

	/**
	 * 将指定日期格式的字符串转换为时间戳对象
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Timestamp toTimestamp(String str, String format) {

		return toTimestamp(toDate(str, format));
	}

	/**
	 * 将指定日期格式的字符串转换为日期对象
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Date toDate(String str, String format) {

		if (ValidatorUtil.isNotAllEmptyIgnoreBlank(str, format)) {

			try {

				return getDateFormat(format).parse(str);
			} catch (Exception e) {

				logger.warn(e);
			}
		}
		return null;
	}

	/**
	 * 将日期对象转换为指定日期格式的日期对象
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static Date toDate(Date date, String format) {

		return toDate(toString(date, format), format);
	}
	
	public static Timestamp toTimestamp(Timestamp timestamp, String format){
		return toTimestamp(toString(timestamp, format), format);
	}
	

	/**
	 * 将时间戳对象转换为指定日期格式的日期字符串
	 * 
	 * @param timestamp
	 * @param format
	 * @return
	 */
	public static String toString(Timestamp timestamp, String format) {

		if (null != timestamp && ValidatorUtil.isNotEmptyIgnoreBlank(format)) {

			try {

				return getDateFormat(format).format(timestamp);
			} catch (Exception e) {

				logger.warn(e);
			}
		}
		return null;
	}

	/**
	 * 将日期对象转换为指定日期格式的日期字符串
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static String toString(Date date, String format) {

		if (null != date && ValidatorUtil.isNotEmptyIgnoreBlank(format)) {

			try {

				return getDateFormat(format).format(date);
			} catch (Exception e) {

				logger.warn(e);
			}
		}
		return null;
	}

	/**
	 * 将时间戳对象转换为指定日期格式的日期字符串
	 * 
	 * @param timeStamp
	 * @param format
	 * @return
	 */
	public static String toString(long timeStamp, String format) {

		return toString(new Date(timeStamp), format);
	}

	/**
	 * 将原日期格式的日期字符串转换为新日期格式的日期字符串
	 * 
	 * @param str
	 * @param oldFormat
	 * @param newFormat
	 * @return
	 */
	public static String toString(String str, String oldFormat, String newFormat) {

		if (ValidatorUtil.isEmptyIgnoreBlank(str, oldFormat, newFormat) || str.length() != oldFormat.length()) {

			return null;
		}
		return toString(toDate(str, oldFormat), newFormat);
	}

	/**
	 * 将Unix时间戳字符串转换为指定日期格式的日期字符串
	 * 
	 * @param unixTimestamp
	 * @param format
	 * @return
	 */
	public static String unixTimestampToString(String unixTimestamp, String format) {

		if (ValidatorUtil.isInteger(unixTimestamp) && ValidatorUtil.isNotEmptyIgnoreBlank(format)) {

			try {

				Long timestamp = Long.parseLong(unixTimestamp) * 1000;
				return toString(timestamp, format);
			} catch (Exception e) {

				logger.warn(e);
			}
		}
		return null;
	}

	/**
	 * 转换为毫秒数
	 * 
	 * @param date
	 * @return
	 */
	public static Long toMilliseconds(Date date) {

		return null == date ? null : date.getTime();
	}

	/**
	 * 转换为毫秒数
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Long toMilliseconds(String str, String format) {

		return toMilliseconds(toDate(str, format));
	}

	/**
	 * 转换为秒数
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Long toSeconds(String str, String format) {

		Long milliseconds = toMilliseconds(str, format);
		return null == milliseconds ? null : (long) (milliseconds / 1000);
	}

	/**
	 * 转换为分钟
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Long toMinutes(String str, String format) {

		Long milliseconds = toMilliseconds(str, format);
		return null == milliseconds ? null : (long) (milliseconds / (60 * 1000));
	}

	/**
	 * 转换为小时
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Long toHours(String str, String format) {

		Long milliseconds = toMilliseconds(str, format);
		return null == milliseconds ? null : (long) (milliseconds / (60 * 60 * 1000));
	}

	/**
	 * 将CST格式的日期字符串转换为日期对象
	 * 
	 * @param str
	 * @return
	 */
	public static Date cstToDate(String str) {

		if (ValidatorUtil.isNotEmptyIgnoreBlank(str)) {

			try {

				SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_CST, java.util.Locale.US);
				return sdf.parse(str);
			} catch (Exception e) {

				logger.warn(e);
			}
		}
		return null;
	}

	/**
	 * 将CST格式的日期字符串转换为指定格式的日期字符串
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static String cstToString(String str, String format) {

		return toString(cstToDate(str), format);
	}

	/**
	 * 重新格式化
	 * 
	 * <p>
	 * 当日期字符串的格式不为指定日期格式时，在不改变原日期大小的情况下，生成新的日期字符串，简单适配指定日期格式
	 * </p>
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static String reformat(String str, String format) {

		return str.length() < format.length() ? str.concat(format.substring(str.length()).replaceAll("[YyMmDdHhSs]", "0")) : str;
	}

	/**
	 * 获取本年剩余天数
	 * 
	 * @return
	 */
	public static int remainDaysByYear() {

		Calendar calendar = Calendar.getInstance();
		int currentDays = calendar.get(Calendar.DAY_OF_YEAR);
		calendar.set(Calendar.DAY_OF_YEAR, 1);
		calendar.roll(Calendar.DAY_OF_YEAR, false);
		int totalDays = calendar.get(Calendar.DAY_OF_YEAR);
		return totalDays - currentDays;
	}

	/**
	 * 获取日期对象对应当年的剩余天数
	 * 
	 * @param date
	 * @return
	 */
	public static Integer remainDaysByYear(Date date) {

		if (null == date) {

			return null;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int currentDays = calendar.get(Calendar.DAY_OF_YEAR);
		calendar.set(Calendar.DAY_OF_YEAR, 1);
		calendar.roll(Calendar.DAY_OF_YEAR, false);
		int totalDays = calendar.get(Calendar.DAY_OF_YEAR);
		return totalDays - currentDays;
	}

	/**
	 * 获取日期字符串对应当年的剩余天数
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Integer remainDaysByYear(String str, String format) {

		return remainDaysByYear(toDate(str, format));
	}

	/**
	 * 获取本月剩余天数
	 * 
	 * @return
	 */
	public static int remainDaysByMonth() {

		Calendar calendar = Calendar.getInstance();
		int currentDays = calendar.get(Calendar.DAY_OF_MONTH);
		int totalDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		return totalDays - currentDays;
	}

	/**
	 * 获取日期对象对应当月的剩余天数
	 * 
	 * @param date
	 * @return
	 */
	public static Integer remainDaysByMonth(Date date) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int currentDays = calendar.get(Calendar.DAY_OF_MONTH);
		calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1);
		calendar.roll(Calendar.DAY_OF_MONTH, false);
		int totalDays = calendar.get(Calendar.DAY_OF_MONTH);
		return totalDays - currentDays;
	}

	/**
	 * 获取日期字符串对应当月的剩余天数
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Integer remainDaysByMonth(String str, String format) {

		return remainDaysByMonth(toDate(str, format));
	}

	/**
	 * 获取本月最后一天的日期对象
	 * 
	 * @return
	 */
	public static Date lastDayByMonth() {

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		return calendar.getTime();
	}

	/**
	 * 获取本月最后一天的日期字符串
	 * 
	 * @param format
	 * @return
	 */
	public static String lastDayByMonth(String format) {

		return toString(lastDayByMonth(), format);
	}

	/**
	 * 获取日期对象对应的当月最后一天的日期字符串
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static String lastDayByMonth(Date date, String format) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		return toString(calendar.getTime(), format);
	}

	/**
	 * 获取日期对象对应的当月最后一天的日期字符串
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static String lastDayByMonth(String str, String format) {

		return lastDayByMonth(toDate(str, format), format);
	}

	/**
	 * 获取日期对象对应的当月最后一天的日期字符串
	 * 
	 * @param str
	 * @param oldFormat
	 * @param newFormat
	 * @return
	 */
	public static String lastDayByMonth(String str, String oldFormat, String newFormat) {

		return lastDayByMonth(toDate(str, oldFormat), newFormat);
	}

	/**
	 * 比较两个日期大小（不包含时分秒）
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int compareTo(Date date1, Date date2) {

		Calendar c1 = Calendar.getInstance();
		c1.setTime(date1);

		int y1 = c1.get(Calendar.YEAR);
		int m1 = c1.get(Calendar.MONTH);
		int d1 = c1.get(Calendar.DAY_OF_MONTH);

		c1.setTime(date2);

		int y2 = c1.get(Calendar.YEAR);
		int m2 = c1.get(Calendar.MONTH);
		int d2 = c1.get(Calendar.DAY_OF_MONTH);

		if (y1 == y2 && m1 == m2 && d1 == d2) {
			return 0;
		}

		if (y1 > y2) {
			return 1;
		}

		if (y1 < y2) {
			return -1;
		}

		if (m1 > m2) {
			return 1;
		}

		if (m1 < m2) {
			return -1;
		}

		return d1 > d2 ? 1 : -1;
	}

	/**
	 * 返回昨天的0时0分0秒与今天的0时0分0秒
	 * 
	 * @return item[0] yesterday <br>
	 *         item[1] today
	 * 
	 */
	public static Timestamp[] getMidnightTimes() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MILLISECOND, 0);
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		// Date end = cal.getTime();
		Timestamp end = new Timestamp(cal.getTimeInMillis());

		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH) - 1, 0, 0, 0);
		// Date start = cal.getTime();
		Timestamp start = new Timestamp(cal.getTimeInMillis());

		Timestamp[] t = { start, end };
		return t;
	}

	/**
	 * 判断时间是否大于开始时间，并且小于结束时间
	 * 
	 * @param str
	 * @param startStr
	 * @param endStr
	 * @param format
	 * @return
	 */
	public static boolean isBetween(String str, String startStr, String endStr, String format) {

		try {

			str = reformat(str, format);
			startStr = reformat(startStr, format);
			endStr = reformat(endStr, format);
			DateFormat dateFormat = getDateFormat(format);
			Date date = dateFormat.parse(str);
			Date startDate = dateFormat.parse(startStr);
			Date endDate = dateFormat.parse(endStr);
			Long milliseconds = toMilliseconds(date);
			Long result = milliseconds - toMilliseconds(startDate);
			if (result > 0) {

				result = milliseconds - toMilliseconds(endDate);
				if (result < 0) {

					return true;
				}
			}
		} catch (Exception e) {

			logger.warn(e);
		}
		return false;
	}

	/**
	 * 判断时间是否不大于开始时间，或者不小于结束时间
	 * 
	 * @param str
	 * @param startStr
	 * @param endStr
	 * @param format
	 * @return
	 */
	public static boolean isNotBetween(String str, String startStr, String endStr, String format) {

		return !isBetween(str, startStr, endStr, format);
	}

	/**
	 * 判断时间是否大于开始时间，并且小于结束时间
	 * 
	 * @param date
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static boolean isBetween(Date date, Date startDate, Date endDate) {

		try {

			Long milliseconds = toMilliseconds(date);
			Long result = milliseconds - toMilliseconds(startDate);
			if (result > 0) {

				result = milliseconds - toMilliseconds(endDate);
				if (result < 0) {

					return true;
				}
			}
		} catch (Exception e) {

			logger.warn(e);
		}
		return false;
	}

	/**
	 * 判断时间是否不大于开始时间，或者不小于结束时间
	 * 
	 * @param date
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static boolean isNotBetween(Date date, Date startDate, Date endDate) {

		return !isBetween(date, startDate, endDate);
	}

	/**
	 * 判断时间是否不小于开始时间，并且不大于结束时间
	 * 
	 * @param str
	 * @param startStr
	 * @param endStr
	 * @param format
	 * @return
	 */
	public static boolean isBetweenEquals(String str, String startStr, String endStr, String format) {

		try {

			str = reformat(str, format);
			startStr = reformat(startStr, format);
			endStr = reformat(endStr, format);
			DateFormat dateFormat = getDateFormat(format);
			Date date = dateFormat.parse(str);
			Date startDate = dateFormat.parse(startStr);
			Date endDate = dateFormat.parse(endStr);
			Long milliseconds = toMilliseconds(date);
			Long result = milliseconds - toMilliseconds(startDate);
			if (result >= 0) {

				result = milliseconds - toMilliseconds(endDate);
				if (result <= 0) {

					return true;
				}
			}
		} catch (Exception e) {

			logger.warn(e);
		}
		return false;
	}

	/**
	 * 判断时间是否小于开始时间，或者大于结束时间
	 * 
	 * @param str
	 * @param startStr
	 * @param endStr
	 * @param format
	 * @return
	 */
	public static boolean isNotBetweenEquals(String str, String startStr, String endStr, String format) {

		return !isBetweenEquals(str, startStr, endStr, format);
	}

	/**
	 * 判断时间是否不小于开始时间，并且不大于结束时间
	 * 
	 * @param date
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static boolean isBetweenEquals(Date date, Date startDate, Date endDate) {

		try {

			Long milliseconds = toMilliseconds(date);
			Long result = milliseconds - toMilliseconds(startDate);
			if (result >= 0) {

				result = milliseconds - toMilliseconds(endDate);
				if (result <= 0) {

					return true;
				}
			}
		} catch (Exception e) {

			logger.warn(e);
		}
		return false;
	}

	/**
	 * 判断时间是否小于开始时间，或者大于结束时间
	 * 
	 * @param date
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static boolean isNotBetweenEquals(Date date, Date startDate, Date endDate) {

		return !isBetweenEquals(date, startDate, endDate);
	}

	//
	private static SimpleDateFormat getDateFormat(String format) {

		return new SimpleDateFormat(format);
	}

	//
	private static WeekEnum getWeekEnum(Date date) {

		WeekEnum weekEnum = null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int weekNumber = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		switch (weekNumber) {
		case 0:

			weekEnum = WeekEnum.SUNDAY;
			break;
		case 1:

			weekEnum = WeekEnum.MONDAY;
			break;
		case 2:

			weekEnum = WeekEnum.TUESDAY;
			break;
		case 3:

			weekEnum = WeekEnum.WEDNESDAY;
			break;
		case 4:

			weekEnum = WeekEnum.THURSDAY;
			break;
		case 5:

			weekEnum = WeekEnum.FRIDAY;
			break;
		case 6:

			weekEnum = WeekEnum.SATURDAY;
			break;
		}
		return weekEnum;
	}

	public static Date getDate(Date date, int calendarType, int num) {
		Calendar cd = Calendar.getInstance();
		cd.setTime(date);
		cd.add(calendarType, num);
		return cd.getTime();
	}

	private DateUtil() {
	}

	public static void main(String[] args) throws Exception {
		// Date earlydate = new Date();
		// Date latedate = new Date();
		// DateFormat df = DateFormat.getDateInstance();
		// earlydate = df.parse("2008-09-21");
		// latedate = df.parse("2009-09-29");
		// System.out.println(intervalDays("2016-09-12", "2014-01-08"));
		// Format mat = new SimpleDateFormat("yyyy-MM-dd");
		// System.out.println("out" + DateUtil.intervalDays(mat.format(new
		// Date()), "2016-09-12"));

		System.out.println(DateUtil.intervalDays(DateUtil.toString(new Date(), DateUtil.FORMAT_DATE), ""));

		// System.out.println(DateUtil.compareTo(new Date(), new Date()));
		// Date d=DateUtil.prevMonth(new Date());
		// SimpleDateFormat format = new SimpleDateFormat(FORMAT_DATE);
		// String s =format.format(d);
		// System.out.println(s);
		// long currentTimeMillis = System.currentTimeMillis();
		// Date cur = new Date(currentTimeMillis);
		// Date d1 = new Date(currentTimeMillis - 3600 * 18 * 1000);
		// Date d2 = new Date(currentTimeMillis + 5);
		//
		// System.out.println(DateUtil.compareTo(d1, d2));
		//
		// SimpleDateFormat format = new SimpleDateFormat(FORMAT_DATE_TIME);
		// d1 = format.parse("2016-08-17 18:00:00");
		// d2 = format.parse("2016-08-18 12:00:00");
		//
		// System.out.println(DateUtil.compareTo(d1, d2));

		// 110600,113750
		// int ret = DateUtil.intervalDays("2016-06-24", "2016-03-15 16:33:54");
		// System.out.println(ret);//81,83

		// System.out.println(DateUtil.isLess("2016-03-01 16:18:52",
		// "2016-03-01 17:03:04", "yyyy-MM-dd HH:mm:ss"));
		// System.out.println(DateUtil.isLess("2016-05-28 15:46:12",
		// "2016-03-01 17:03:04", "yyyy-MM-dd HH:mm:ss"));
		// System.out.println(DateUtil.isLess("2016-03-01 16:18:52",
		// "2016-03-02 20:16:07", "yyyy-MM-dd HH:mm:ss"));
		// System.out.println(DateUtil.isLess("2016-05-28 15:46:12",
		// "2016-03-02 20:16:07", "yyyy-MM-dd HH:mm:ss"));

		// System.out.println(getMonth(new Date()));

		// Calendar calendar = Calendar.getInstance();
		// calendar.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),1);
		// calendar.roll(Calendar.DATE, false);
		// System.out.println("->" + calendar.get(Calendar.DATE));
		// System.out.println("->" + getDay(new Date()));

		// System.out.println(new Date().getTime());
		// System.out.println(toString(1455704509083L, "yyyy-MM-dd HH:mm:ss"));
		// System.out.println(monthEndDate("yyyy-MM-dd"));
		// System.out.println(remainDaysByMonth());

		// String str = "2000-01-01 12";
		// String format1 = "yyyy-MM-dd HH";
		// String format2 = "yyyy-MM-dd mm:ss";
		// Date date1 = toDate(str, format1);
		// System.out.println(date1);
		// Date date2 = toDate(date1, format2);
		// System.out.println(date2);

		// String str = "2000年01-01日";
		// String format1 = "yyyy年MM月dd日";
		// String format2 = "yyyy-MM-dd HH:mm:ss:SSS";
		// String ret = toString(str, format1, format2);
		// System.out.println(ret);

		// String str1 = "2000-01-01";
		// String str2 = "2012-01-23";
		// System.out.println(toMilliseconds(str1, "yyyy-MM-dd"));
		// System.out.println(toSeconds(str1, "yyyy-MM-dd"));
		// System.out.println(System.currentTimeMillis());

		// String str1 = "23:30:45:789";
		// String str2 = "21:30:45:789";
		// String format = "yyyy-MM-dd HH:mm:ss:SSS";
		// Integer result1 = intervalDays(str1, str2);
		// Long result2 = intervalHours(str1, str2);
		// Long result3 = intervalMinutes(str1, str2);
		// Long result4 = intervalSeconds(str1, str2);
		// System.out.println(result1);
		// System.out.println(result2);
		// System.out.println(result3);
		// System.out.println(result4);

		// String str = "Wed Sep 16 11:26:23 CST 2009";
		// String format = "yyyy-MM-dd HH:mm:ss";
		// String ret = cstToString(str, format);
		// System.out.println(ret);
		System.err.println(setDay(new Date(), -6));
	}
}
