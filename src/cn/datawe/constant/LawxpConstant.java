package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 常量类：汇法网
 * @author ChenYunyu
 *
 */
public class LawxpConstant {
	
	/**
	 * 查询模式：个人
	 */
	public static final int STYPE_PERSON = 1;
	
	/**
	 * 查询模式：企业
	 */
	public static final int STYPE_ORGANIZATION = 2;
	
	
	/**
	 * 查询成功
	 */
	public static final String SUCCESS_CODE = "s";
	
	
	/**
	 * 查询失败
	 */
	public static final String FAIL_CODE = "e";
	
	
	/**
	 * 汇法信息查询结果集封装
	 * @author ChenYunyu
	 *
	 */
	public class ResultCollection{
		
		/**
		 * 远端结果总数
		 */
		public static final String TOTAL_NUM = "totalNum";
		
		/**
		 * 查询成功总数
		 */
		public static final String SUCCESS_NUM = "successNum";
		
		/**
		 * 查询失败总数
		 */
		public static final String FAIL_NUM = "failNum";
		
		/**
		 * 当前数据页码
		 */
		public static final String PAGE_NO = "pageNo";
		
		/**
		 * 每页数量
		 */
		public static final String PAGE_SIZE = "pageSize";
		
		/**
		 * 查询的具体结果(数组)
		 */
		public static final String MSG_LIST = "msgList";
		
		/**
		 * 数据主键Id
		 * @see 该条信息在汇法网唯一标识，同类型下不同信息keyid唯一
		 * 
		 */
		public static final String KEYID = "keyid";
		
		/**
		 * 姓名/全称
		 */
		public static final String NAME = "name";
		
		/**
		 * 身份证/组织机构代码
		 */
		public static final String CID = "cid";
		
		/**
		 * 查询主题
		 * (对应key值为 "数据类型  type")
		 * @see cn.datawe.constant.LawxpTopicConstant 汇法网，查询主题
		 * 
		 */
		public static final String TOPIC = "topic";
		
		/**
		 * 数据类型
		 */
		public static final String TYPE = "type";
		
		/**
		 * 数据类型编号.
		 * @see 该条信息在汇法网的类型编号，如：31,32; keyid+typet 标识唯一一条数据，用作扣费标准
		 */
		public static final String TYPET = "typet";
		
		/**
		 * 标题.
		 * @see 该条信息标题
		 */
		public static final String TITLE = "title";
		
		/**
		 * 时间.
		 * @see 该条信息的对应时间，如该条信息是执行信息，则是执行时间，如是裁判文书这是审理时间
		 */
		public static final String DATETIME = "dateTime";
	}
	
	/**
	 * Service接口名常量
	 * @author   ChenYunyu
	 * @version  1.0
	 * @since    v1.0
	 * @Date     2017-3-13下午3:59:57
	 */
	public class ServiceMethod{
		
		/**
		 * 查询全量数据(所有主题，个人)
		 */
		public static final String PER_ALL = "perQueryAllInfo";
		
		/**
		 * 查询全量数据(所有主题，企业)
		 */
		public static final String ORG_ALL = "orgQueryAllInfo";
		
	}
	
	/**
	 * 诉讼地位
	 * @author   ChenYunyu
	 * @version  1.0
	 * @since    v1.0
	 * @Date     2017-3-14下午9:30:07
	 */
	public static class Position{
		/**
		 * 负面的诉讼地位
		 */
		public static final Map<String, String> NEG_MAP = new HashMap<String, String>();
		static {
			NEG_MAP.put("罪犯", "NEGATIVE");
			NEG_MAP.put("被告", "NEGATIVE");
			NEG_MAP.put("罪犯人", "NEGATIVE");
			NEG_MAP.put("被告人", "NEGATIVE");
			NEG_MAP.put("一审被告", "NEGATIVE");
			NEG_MAP.put("第二被告", "NEGATIVE");
			NEG_MAP.put("本诉被告", "NEGATIVE");
			NEG_MAP.put("被执行人", "NEGATIVE");
			NEG_MAP.put("第四被告", "NEGATIVE");
			NEG_MAP.put("原审被告", "NEGATIVE");
			NEG_MAP.put("被起诉人", "NEGATIVE");
			NEG_MAP.put("第三被告", "NEGATIVE");
			NEG_MAP.put("被罚款人", "NEGATIVE");
			NEG_MAP.put("第五被告", "NEGATIVE");
			NEG_MAP.put("被申诉人", "NEGATIVE");
			NEG_MAP.put("第一被告", "NEGATIVE");
			NEG_MAP.put("反诉被告", "NEGATIVE");
			NEG_MAP.put("第一被申请", "NEGATIVE");
			NEG_MAP.put("反诉被告人", "NEGATIVE");
			NEG_MAP.put("第三被申请", "NEGATIVE");
			NEG_MAP.put("原审被上诉人", "NEGATIVE");
			NEG_MAP.put("被申请执行人", "NEGATIVE");
			NEG_MAP.put("被强制医疗人", "NEGATIVE");
			NEG_MAP.put("被告(原告)", "NEGATIVE");
			NEG_MAP.put("第三被执行人", "NEGATIVE");
			NEG_MAP.put("第二被执行人", "NEGATIVE");
			NEG_MAP.put("第一被执行人", "NEGATIVE");
			NEG_MAP.put("被申请追加人", "NEGATIVE");
			NEG_MAP.put("再审被申请人", "NEGATIVE");
			NEG_MAP.put("原仲裁被申请人", "NEGATIVE");
			NEG_MAP.put("委托代理人被告", "NEGATIVE");
			NEG_MAP.put("被告(反诉原告)", "NEGATIVE");
			NEG_MAP.put("附带民事诉讼被告人", "NEGATIVE");
			NEG_MAP.put("上诉人(一审被告)", "NEGATIVE");
			NEG_MAP.put("申诉人(一审被告)", "NEGATIVE");
			NEG_MAP.put("申诉人(原审被告)", "NEGATIVE");
			NEG_MAP.put("上诉人(原审被告人)", "NEGATIVE");
			NEG_MAP.put("被申请人(一审被告)", "NEGATIVE");
			NEG_MAP.put("被申请人(原审被告)", "NEGATIVE");
			NEG_MAP.put("被申诉人(一审被告)", "NEGATIVE");
			NEG_MAP.put("被上诉人(一审被告)", "NEGATIVE");
			NEG_MAP.put("被申诉人(原审被告)", "NEGATIVE");
			NEG_MAP.put("被上诉人(原审被告)", "NEGATIVE");
			NEG_MAP.put("上诉人（原审被告）被告", "NEGATIVE");
			NEG_MAP.put("原审附带民事诉讼被告人", "NEGATIVE");
			NEG_MAP.put("再审申请人（一审被告）", "NEGATIVE");
			NEG_MAP.put("原审上诉人(一审被告)", "NEGATIVE");
			NEG_MAP.put("被上诉人(原审被告人)", "NEGATIVE");
			NEG_MAP.put("申请再审人(一审被告)", "NEGATIVE");
			NEG_MAP.put("申请复议人（被执行人）", "NEGATIVE");
			NEG_MAP.put("被上诉人(原审第三人)", "NEGATIVE");
			NEG_MAP.put("再审申请人（原审被告）", "NEGATIVE");
			NEG_MAP.put("申请再审人(原审被告)", "NEGATIVE");
			NEG_MAP.put("原审被告(原审反诉原告)", "NEGATIVE");
			NEG_MAP.put("被上诉人(原审第二被告)", "NEGATIVE");
			NEG_MAP.put("被上诉人（原审被告）被告", "NEGATIVE");
			NEG_MAP.put("被告人暨附带民事诉讼被告人", "NEGATIVE");
			NEG_MAP.put("被告人(附带民事诉讼被告人)", "NEGATIVE");
			NEG_MAP.put("被上诉人(原审原告、反诉被告)", "NEGATIVE");
			NEG_MAP.put("被申请人(一审原告、反诉被告)", "NEGATIVE");
			NEG_MAP.put("被上诉人(一审被告、被申请人)", "NEGATIVE");
			NEG_MAP.put("被上诉人(原审被告，反诉原告)", "NEGATIVE");
			NEG_MAP.put("被上诉人(原审被告、反诉原告)", "NEGATIVE");
			NEG_MAP.put("被申请人(一审被告、二审上诉人)", "NEGATIVE");
			NEG_MAP.put("被申请人(一审原告、二审上诉人)", "NEGATIVE");
			NEG_MAP.put("被申诉人(一审原告、二审被上诉人)", "NEGATIVE");
			NEG_MAP.put("被上诉人(原审本诉原告、反诉被告)", "NEGATIVE");
			NEG_MAP.put("被上诉人(原审原告、再审被申诉人)", "NEGATIVE");
			NEG_MAP.put("被申请人(一审被告、二审被上诉人)", "NEGATIVE");
			NEG_MAP.put("被申请人(一审原告、二审被上诉人)", "NEGATIVE");
			NEG_MAP.put("被上诉人(原审被告、再审被申诉人)", "NEGATIVE");
			NEG_MAP.put("被申请人(一审被告，二审被上诉人)", "NEGATIVE");
			NEG_MAP.put("被申请人(一审原告，二审被上诉人)", "NEGATIVE");
			NEG_MAP.put("再审被申请人（一审被告，二审上诉人）", "NEGATIVE");
			NEG_MAP.put("被申请人(一审第三人、二审被上诉人)", "NEGATIVE");
			NEG_MAP.put("再审被申请人(一审被告、二审被上诉人)", "NEGATIVE");
		}
	}

}
