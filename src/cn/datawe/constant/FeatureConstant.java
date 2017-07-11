/**
 * 工程名：dm-util
 * 包名：cn.datawe.constant
 */
package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

import cn.datawe.util.ValidatorUtil;

/**
 * 类名：FeatureConstant
 * 
 * @desc
 * @author lishasha
 * @version 1.0
 * @since v1.0
 * @Date 2017年6月12日下午6:13:59
 */
public class FeatureConstant {

	public static final Integer DAYS_0 = 0;

	public static final Integer DAYS_60 = 60;

	public static final Integer DAYS_90 = 90;

	public static final Integer DAYS_180 = 180;

	/**
	 * 用户职业类型
	 * */
	public static class ProfessionConstant {

		/**
		 * 职业:学生
		 * */
		public static final Integer PROFESSION_1 = 1;

		/**
		 * 职业:企业职员
		 * */
		public static final Integer PROFESSION_2 = 2;

		/**
		 * 职业:个体户
		 * */
		public static final Integer PROFESSION_3 = 3;

		/**
		 * 职业:退休
		 * */
		public static final Integer PROFESSION_4 = 4;

		/**
		 * 职业:自由职业
		 * */
		public static final Integer PROFESSION_5 = 5;

		/**
		 * 职业:其他
		 * */
		public static final Integer PROFESSION_99 = 99;

		public static final Map<Integer, String> MAP = new HashMap<Integer, String>();
		static {
			MAP.put(PROFESSION_1, "学生");
			MAP.put(PROFESSION_2, "企业职员");
			MAP.put(PROFESSION_3, "个体户");
			MAP.put(PROFESSION_4, "退休");
			MAP.put(PROFESSION_5, "自由职业");
			MAP.put(PROFESSION_99, "其他");
		}

		public static String getStable(Integer str) {
			String data = MAP.get(str);
			if (ValidatorUtil.isEmptyIgnoreBlank(data)) {
				return "";
			}
			String result = "";
			if (ValidatorUtil.isEquals(str, PROFESSION_2, PROFESSION_4)) {
				result = "0";//稳定
			} else if (ValidatorUtil.isEquals(str, PROFESSION_99)) {
				result = "1";//一般
			} else {
				result = "2";//不稳定
			}

			return result;
		}

	}

	/**
	 * 收入类型
	 * */
	public static class SalaryType {

		/**
		 * 收入类别：1000以下
		 * */
		public static final Integer SALARY_1 = 1;

		/**
		 * 收入类别：1001-3000
		 * */
		public static final Integer SALARY_2 = 2;

		/**
		 * 收入类别：3001-5000
		 * */
		public static final Integer SALARY_3 = 3;

		/**
		 * 收入类别：5001-10000
		 * */
		public static final Integer SALARY_4 = 4;

		/**
		 * 收入类别：10000以上
		 * */
		public static final Integer SALARY_5 = 5;

		public static final Map<Integer, String> MAP = new HashMap<Integer, String>();
		static {
			MAP.put(SALARY_1, "0");//低
			MAP.put(SALARY_2, "0");//低
			MAP.put(SALARY_3, "1");//中
			MAP.put(SALARY_4, "1");//中
			MAP.put(SALARY_5, "2");//高
		}
	}

}
