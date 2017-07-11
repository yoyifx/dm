/**
 * 工程名：dm-util
 * 包名：cn.datawe.constant
 */
package cn.datawe.constant;

/**
 * 类名：RepayRecordConstant
 * 
 * @desc
 * @author Administrator
 * @version 1.0
 * @since v1.0
 * @Date 2017年6月23日上午10:08:13
 */
public class RepayRecordConstant {

	/** 待还款 */
	public static final Integer WAITING = 1;
	/** 正在扣款 */
	public static final Integer IN = 2;
	/** 扣款失败 */
	public static final Integer FAIL = 3;
	/** 已还款 */
	public static final Integer REPAY = 4;
	/** 已逾期 */
	public static final Integer OVERDUE = 5;

}
