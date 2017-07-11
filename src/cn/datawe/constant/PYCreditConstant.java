package cn.datawe.constant;


/**
 * 风险列表常量
 * 
 * @author YCZ
 * 
 */
public class PYCreditConstant {

	/**企业状态*/
	public static class CorpStatus {

		/**在营（开业）*/
		public static final String OPEN = "1";
		
		/**吊销*/
		public static final String REVOKE = "2";
		
		/**注销*/
		public static final String CANCEL = "3";
		
		/**迁出*/
		public static final String MOVE = "4";
		
		/**停业*/
		public static final String CLOSE = "5";
		
		/**其他*/
		public static final String OTHER = "9";
	}

	/**子报告查询状态*/
	public static class TreatResult {
		
		/**成功*/
		public static final String SUCCESS = "1";

		/**未查得*/
		public static final String NOT_FOUND = "2";
		
		/**出错了*/
		public static final String ERROR = "3";
	}
}
