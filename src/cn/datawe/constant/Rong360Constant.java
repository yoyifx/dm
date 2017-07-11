package cn.datawe.constant;


/**
 * 常量类：融360
 * @author ChenYunyu
 *
 */
public class Rong360Constant {

	/**
	 * Action OP
	 * @author ChenYunyu
	 *
	 */
	public class Operation{
		/**
		 * 全部报告(包括所有类型)
		 */
		public static final String ALL_TYPE_REPORT = "allTypeReport";
		
	}
	
	
	/**
	 * 报告类别
	 * @author ChenYunyu
	 *
	 */
	public class Type{
		
		/**
		 * 个人危险报告
		 */
		public static final String DANGER = "1";
		
		/**
		 * qq群危险报告
		 */
		public static final String QQ_GROUP = "2";
		
		/**
		 * 内部运营商报告
		 */
		public static final String INNOP = "3";
		
		/**
		 * 资质记录
		 */
		public static final String QUALIFICATION = "4";
		
		/**
		 * 借贷记录
		 */
		public static final String LOAN_RECORD = "5";
		
		/**
		 * 审批记录
		 */
		public static final String APPROVAL_RECORD = "6";
		
	}
	
	/**
	 * service接口名称常量
	 * @author   ChenYunyu
	 * @version  1.0
	 * @since    v1.0
	 * @Date     2017-3-8下午5:25:05
	 */
	public class ServiceMethod{
		/**
		 * 1.0版，个人信贷报告，全部报告(包括所有类型)
		 */
		public static final String RONG_ALL_TYPE = "allTypeReport";
		
		/**
		 * 1.1版，个人信贷报告，全部报告(包括所有类型)
		 */
		public static final String RONG11_ALL_TYPE = "allTypeReport";
		/**
		 * 1.1版，互联网行为报告
		 */
		public static final String RONG11_WEB_DEED = "webDeedReport";
	}
	
	////////// Please write other inner class here.
	
}
