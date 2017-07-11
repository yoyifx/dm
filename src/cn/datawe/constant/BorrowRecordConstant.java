/**
 * 工程名：dm-util
 * 包名：cn.datawe.constant
 */
package cn.datawe.constant;

/**
 * 类名：BorrowRecordConstant
 * 
 * @desc
 * @author Administrator
 * @version 1.0
 * @since v1.0
 * @Date 2017年6月26日下午3:29:42
 */
public class BorrowRecordConstant {

	/** 合同借款状态：代付款 */
	public static final Integer WAITING = 1;
	/** 合同借款状态：放款中 */
	public static final Integer IN = 2;
	/** 合同借款状态：放款失败 */
	public static final Integer FAIL = 3;
	/** 合同借款状态：还款中 */
	public static final Integer REPAY_IN = 4;
	/** 合同借款状态：已还清 */
	public static final Integer PAID_OFF = 5;
	/** 合同借款状态：已作废 */
	public static final Integer INVALID = 6;

}
