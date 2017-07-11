package cn.datawe.util;

import java.math.BigDecimal;

/**
 * 工具类:运算
 * 
 * @author LiuJiaLe
 *
 */
public final class ArithUtil {

	/**
	 * 默认小数位数
	 */
	private static final int SCALE = 10;
	
	/**
	 * 加法
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double add(String v1, String v2) {
		
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return b1.add(b2).doubleValue();
	}
	
	/**
	 * 加法
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double add(float v1, float v2) {
		
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return b1.add(b2).doubleValue();
	}
	
	/**
	 * 加法
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double add(double v1, double v2) {
		
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.add(b2).doubleValue();
	}
	
	/**
	 * 减法
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double subtract(String v1, String v2) {
		
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return b1.subtract(b2).doubleValue();
	}
	
	/**
	 * 减法
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double subtract(float v1, float v2) {
		
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return b1.subtract(b2).doubleValue();
	}
	
	/**
	 * 减法
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double subtract(double v1, double v2) {
		
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.subtract(b2).doubleValue();
	}
	
	/**
	 * 乘法
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double multiply(String v1, String v2) {
		
		if (ValidatorUtil.isNotNumeric(v1, v2)) {
			
			throw new IllegalArgumentException("无效数字！");
		}
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return b1.multiply(b2).doubleValue();
	}
	
	/**
	 * 乘法
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double multiply(float v1, float v2) {
		
		if (v1 == 0 || v2 == 0) {
			
			return BigDecimal.ZERO.doubleValue();
		}
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2).doubleValue();
	}
	
	/**
	 * 乘法
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double multiply(double v1, double v2) {
		
		if (v1 == 0 || v2 == 0) {
			
			return BigDecimal.ZERO.doubleValue();
		}
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2).doubleValue();
	}
	
	/**
	 * 除法
	 * 
	 * @param dividend
	 * @param divisor
	 * @param scale
	 * @return
	 */
	public static double divide(String dividend, String divisor, int scale) {
		
		if (scale < 0) {
			
			throw new IllegalArgumentException("小数位数必须是一个大于或等于零的整数！");
		}
		BigDecimal b1 = new BigDecimal(dividend);
		BigDecimal b2 = new BigDecimal(divisor);
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();// 四舍五入
	}
	
	/**
	 * 除法
	 * 
	 * @param dividend
	 * @param divisor
	 * @return
	 */
	public static double divide(double dividend, double divisor) {
		
		return divide(dividend, divisor, SCALE);
	}
	
	/**
	 * 除法
	 * 
	 * @param dividend
	 * @param divisor
	 * @param scale
	 * @return
	 */
	public static double divide(double dividend, double divisor, int scale) {
		
		if (dividend == 0) {
			
			return BigDecimal.ZERO.doubleValue();
		}
		if (divisor == 0) {
			
			throw new IllegalArgumentException("除数必须是非零的数字！");
		}
		if (scale < 0) {
			
			throw new IllegalArgumentException("小数位数必须是一个大于或等于零的整数！");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(dividend));
		BigDecimal b2 = new BigDecimal(Double.toString(divisor));
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();// 四舍五入
	}
	
	/**
	 * 小数四舍五入，自定义小数位数
	 * 
	 * @param v
	 * @param scale
	 * @return
	 */
	public static double round(double v, int scale) {
		
		return divide(v, 1, scale);
	}
	
	/**
	 * 小数四舍五入，自定义小数位数
	 * 
	 * @param v
	 * @param scale
	 * @return
	 */
	public static double round(String v, int scale) {
		
		if ("0".equals(v)) {
			
			return BigDecimal.ZERO.doubleValue();
		}
		if (ValidatorUtil.isNotNumeric(v)) {
			
			throw new IllegalArgumentException("被除数必须是数字！");
		}
		if (scale < 0) {
			
			throw new IllegalArgumentException("小数位数必须是一个大于或等于零的整数！");
		}
		BigDecimal b1 = new BigDecimal(v);
		BigDecimal b2 = new BigDecimal(1);
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();// 四舍五入
	}
	
	/**
	 * 小数四舍五入，取整
	 * 
	 * @param v
	 * @return
	 */
	public static long round(String v) {
		
		return Math.round(Double.parseDouble(v));
	}
	
	/**
	 * 小数四舍五入，取整
	 * 
	 * @param v
	 * @return
	 */
	public static long round(double v) {
		
		return Math.round(v);
	}
	
	/**
	 * 向上取整
	 * 
	 * @param v
	 * @return
	 */
	public static long ceil(double v) {
		
		return (long) Math.ceil(v);
	}
	
	/**
	 * 向下取整
	 * 
	 * @param v
	 * @return
	 */
	public static long floor(double v) {
		
		return (long) Math.floor(v);
	}
	
	private ArithUtil() {}
	
	public static void main(String[] args) {
		
		String str = "1.45";
		double d = Double.parseDouble(str);
		System.out.println(round(d));
		System.out.println(round(str));
		
		//System.out.println(ceil(d));
		//System.out.println(Math.ceil(d));
		
		//System.out.println(floor(d));
		//System.out.println(Math.floor(d));
	}
}
