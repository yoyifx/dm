package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 常量类:百融定义参数
 * 
 * @author Fangx
 * 
 */
public class Credit100Constant {
	/**
	 * 接口调用成功
	 */
	public static final String RESPONSE_CODE_OK = "00";
	/**
	 * 程序错误
	 */
	public static final String RESPONSE_CODE_ERROR_SYSTEM = "100001";
	/**
	 * 匹配结果为空
	 */
	public static final String RESPONSE_CODE_EMPTY_RESULT = "100002";
	/**
	 * 缺少必选key值
	 */
	public static final String RESPONSE_CODE_EMPTY_KEY = "100003";
	/**
	 * 商户不存在或用户名错误
	 */
	public static final String RESPONSE_CODE_ERROR_USERNAMNE = "100004";
	/**
	 * 登陆密码不正确
	 */
	public static final String RESPONSE_CODE_ERROR_PASSWORD = "100005";
	/**
	 * 请求参数格式错误
	 */
	public static final String RESPONSE_CODE_ERROR_PARAM = "100006";
	/**
	 * Tokenid过期
	 */
	public static final String RESPONSE_CODE_EXPIRE_TOKENID = "100007";
	/**
	 * api调用码错误
	 */
	public static final String RESPONSE_CODE_ERROR_APICODE = "100008";
	/**
	 * ip地址错误
	 */
	public static final String RESPONSE_CODE_ERROR_IP = "100009";
	/**
	 * 超出当天访问次数
	 */
	public static final String RESPONSE_CODE_OVER_LIMITED = "100010";
	/**
	 * 账户停用
	 */
	public static final String RESPONSE_CODE_STOP_ACCOUNT = "100011";
	/**
	 * 请求套餐为空
	 */
	public static final String RESPONSE_CODE_ERROR_MEAL = "100012";
	/**
	 * 请求参数其他错误
	 */
	public static final String RESPONSE_CODE_OTHERERROR_PARAM = "1000015";
	/**
	 * 请求json异常，无法解析
	 */
	public static final String RESPONSE_CODE_ERROR_PARSE = "1000016";
	
	/**
	 * 接口产品名称:规则，借款反欺诈规则-特殊名单
	 */
	public static final String INTERFACE_TYPE_RULE_CHECKLIST = "RuleSpecialList";
	/**
	 * 接口产品名称:规则，借款反欺诈规则-多次申请
	 */
	public static final String INTERFACE_TYPE_RULE_CHECKAPPLY = "RuleApplyLoan";
	/**
	 * 接口产品名称:规则，借款反欺诈规则-法院执行人
	 */
	public static final String INTERFACE_TYPE_RULE_CHECKEXEUTION = "RuleExecution";
	/**
	 * 接口产品名称:规则，借款信用风险规则-评分
	 */
	public static final String INTERFACE_TYPE_RULE_SCORE = "RuleScore";
	/**
	 * 接口产品名称:规则，借款信用风险规则-收支等级
	 */
	public static final String INTERFACE_TYPE_RULE_ACCOUNT = "RuleAccountChange";
	/**
	 * 接口产品名称:反欺诈，特殊名单核查
	 */
	public static final String INTERFACE_TYPE_CHECKLIST = "SpecialList_c";
	/**
	 * 接口产品名称:反欺诈，多次申请核查
	 */
	public static final String INTERFACE_TYPE_CHECKAPPLY = "ApplyLoan";
	/**
	 * 接口产品名称:反欺诈，法院被执行人-个人
	 */
	public static final String INTERFACE_TYPE_CHECKEXEUTION = "Execution";
	/**
	 * 接口产品名称:信用评估，稳定性评估
	 */
	public static final String INTERFACE_TYPE_ASSESS_STABLE = "Stability_c";
	/**
	 * 接口产品名称:信用评估，商品消费评估
	 */
	public static final String INTERFACE_TYPE_ASSESS_CONSUM = "Consumption_c";
	/**
	 * 接口产品名称:信用评估，媒体阅览评估
	 */
	public static final String INTERFACE_TYPE_ASSESS_MEDIA = "Media_c";
	/**
	 * 接口产品名称:信用评估，月度收支等级评估
	 */
	public static final String INTERFACE_TYPE_ASSESS_ACCOUNT = "AccountchangeMonth";
	/**
	 * 接口核查结果:没有不良记录
	 */
	public static final String RESULT_CREDIT_GOOD = "0";
	/**
	 * 接口核查结果:有不良记录
	 */
	public static final String RESULT_CREDIT_NOT_GOOD = "1";
	/**
	 * 接口核查结果:是否不良
	 */
	public static final String RESULT_FLAG = "result_flag";
	/**
	 * 命中规则名称
	 */
	public static final String HIT_RULE_NAME = "Rule_name" ;
	/**
	 * 命中规则权重
	 */
	public static final String HIT_RULE_WEIGHT = "Rule_weight" ;
	/**
	 * 命中规则描述
	 */
	public static final String HIT_RULE_DECISION = "Rule_final_decision" ;
	/**
	 * 命中规则评分
	 */
	public static final String HIT_RULE_SCORE = "Rule_final_weight" ;
	/**
	 * 接口返回key值转换
	 */
	public static final Map<String,String> TRANSMAP = new HashMap<String, String>();
	/**
	 * 接口返回信息
	 */
	public static final Map<String,String> MAP = new HashMap<String, String>();
	/**
	 * 接口产品名称
	 */
	public static final Map<String,String> PROMAP = new HashMap<String, String>();
	static{
		MAP.put(Credit100Constant.RESPONSE_CODE_OK, "成功");
		MAP.put(Credit100Constant.RESULT_CREDIT_GOOD, "没有不良记录");
		MAP.put(Credit100Constant.RESULT_CREDIT_NOT_GOOD, "有不良记录");
		MAP.put(Credit100Constant.RESPONSE_CODE_EMPTY_KEY, "缺少必选key值");
		MAP.put(Credit100Constant.RESPONSE_CODE_EMPTY_RESULT, "匹配结果为空");
		MAP.put(Credit100Constant.RESPONSE_CODE_ERROR_APICODE, "api调用码错误");
		MAP.put(Credit100Constant.RESPONSE_CODE_ERROR_IP, "ip地址错误");
		MAP.put(Credit100Constant.RESPONSE_CODE_ERROR_MEAL, "请求套餐为空");
		MAP.put(Credit100Constant.RESPONSE_CODE_ERROR_PARAM, "请求参数格式错误");
		MAP.put(Credit100Constant.RESPONSE_CODE_ERROR_PARSE, "请求json异常，无法解析");
		MAP.put(Credit100Constant.RESPONSE_CODE_ERROR_PASSWORD, "登陆密码不正确");
		MAP.put(Credit100Constant.RESPONSE_CODE_ERROR_SYSTEM, "程序错误");
		MAP.put(Credit100Constant.RESPONSE_CODE_ERROR_USERNAMNE, "商户不存在或用户名错误");
		MAP.put(Credit100Constant.RESPONSE_CODE_EXPIRE_TOKENID, "Tokenid过期");
		MAP.put(Credit100Constant.RESPONSE_CODE_OTHERERROR_PARAM, "请求参数其他错误");
		MAP.put(Credit100Constant.RESPONSE_CODE_OVER_LIMITED, "超出当天访问次数");
		MAP.put(Credit100Constant.RESPONSE_CODE_STOP_ACCOUNT, "账户停用");
		
		PROMAP.put(Credit100Constant.INTERFACE_TYPE_ASSESS_ACCOUNT, "月度收支等级评估查询");
		PROMAP.put(Credit100Constant.INTERFACE_TYPE_ASSESS_CONSUM, "商品消费评估查询");
		PROMAP.put(Credit100Constant.INTERFACE_TYPE_ASSESS_MEDIA, "媒体阅览评估查询");
		PROMAP.put(Credit100Constant.INTERFACE_TYPE_ASSESS_STABLE, "稳定性评估查询");
		PROMAP.put(Credit100Constant.INTERFACE_TYPE_CHECKAPPLY, "多次申请核查查询");
		PROMAP.put(Credit100Constant.INTERFACE_TYPE_CHECKEXEUTION, "法院被执行人查询");
		PROMAP.put(Credit100Constant.INTERFACE_TYPE_CHECKLIST, "特殊名单核查查询");
		PROMAP.put(Credit100Constant.INTERFACE_TYPE_RULE_CHECKLIST, "特殊名单规则查询");
		PROMAP.put(Credit100Constant.INTERFACE_TYPE_RULE_CHECKEXEUTION, "法院执行规则查询");
		PROMAP.put(Credit100Constant.INTERFACE_TYPE_RULE_CHECKAPPLY, "多次申请核查规则查询");
		PROMAP.put(Credit100Constant.INTERFACE_TYPE_RULE_ACCOUNT, "收支等级规则查询");
		PROMAP.put(Credit100Constant.INTERFACE_TYPE_RULE_SCORE, "评分规则查询");
		
		TRANSMAP.put("result_flag", "creditFlag");
		TRANSMAP.put(HIT_RULE_DECISION,"advice");
		TRANSMAP.put(HIT_RULE_SCORE,"score");
		TRANSMAP.put(HIT_RULE_NAME,"description");
		TRANSMAP.put(HIT_RULE_WEIGHT,"weight");
	}
	
	/**
	 * 常量类:百融收支评估返回数据字典
	 * 
	 * @author Fangx
	 * 
	 */
	public static class Credit100AccountConstant{
		/**
		 * 接口核查结果:没有查得相关数据
		 */
		public static final String RESULT_FLAG_NOT_HIT = "0";
		/**
		 * 接口核查结果:输出成功
		 */
		public static final String RESULT_FLAG_HIT = "1";
		/**
		 * 接口核查结果:是否有记录
		 */
		public static final String RESULT_FLAG = "result_flag";
		/**
		 * 接口返回数据逾期字典值转换
		 */
		public static final Map<String,String> DICT_FLAG_OVERDUE = new HashMap<String, String>();
		/**
		 * 接口返回数据金额区间字典值转换
		 */
		public static final Map<String,String> DICT_AMOUNT_RANGE = new HashMap<String, String>();
		/**
		 * 接口返回结果值转换
		 */
		public static final Map<String,String> MAP = new HashMap<String, String>();
		/**
		 * 接口返回key值转换
		 */
		public static final Map<String,String> TRANSMAP = new HashMap<String, String>();
		
		static{
			MAP.put(RESULT_FLAG_NOT_HIT, "没有查得相关数据记录");
			MAP.put(RESULT_FLAG_HIT, "输出成功");
			
			TRANSMAP.put("result_flag", "outDataFlag");
			TRANSMAP.put("acm_card_index","cardNum");
			for (int i = 1; i < 7; i++) {
				TRANSMAP.put("acm_m"+i+"_debit_balance",i+"mDebitBalance");
				TRANSMAP.put("acm_m"+i+"_debit_out",i+"mDebitOut");
				TRANSMAP.put("acm_m"+i+"_debit_invest",i+"mDebitInvest");
				TRANSMAP.put("acm_m"+i+"_debit_repay",i+"mDebitRepay");
				TRANSMAP.put("acm_m"+i+"_debit_in",i+"mDebitIn");
				TRANSMAP.put("acm_m"+i+"_credit_out",i+"mDebitOut");
				TRANSMAP.put("acm_m"+i+"_credit_cash",i+"mDebitCash");
				TRANSMAP.put("acm_m"+i+"_credit_in",i+"mDebitIn");
				TRANSMAP.put("acm_m"+i+"_credit_def",i+"mDebitDef");
				TRANSMAP.put("acm_m"+i+"_loan",i+"mLoan");
				TRANSMAP.put("acm_m"+i+"_cons",i+"mCons");
				TRANSMAP.put("acm_m"+i+"_max_in",i+"mMaxIn");
				TRANSMAP.put("acm_m"+i+"_debit_in_num",i+"mDebitInNum");
				TRANSMAP.put("acm_m"+i+"_debit_out_num",i+"mDebitOutNum");
				TRANSMAP.put("acm_m"+i+"_credit_in_num",i+"mCreditInNum");
				TRANSMAP.put("acm_m"+i+"_credit_out_num",i+"mCreditOutNum");
			}
			for (int i = 7; i < 19;) {
				TRANSMAP.put("acm_m"+i+"m"+(i+2)+"_debit_balance","m"+i+"m"+(i+2)+"mDebitBalance");
				TRANSMAP.put("acm_m"+i+"m"+(i+2)+"_debit_out","m"+i+"m"+(i+2)+"mDebitOut");
				TRANSMAP.put("acm_m"+i+"m"+(i+2)+"_debit_invest","m"+i+"m"+(i+2)+"mDebitInvest");
				TRANSMAP.put("acm_m"+i+"m"+(i+2)+"_debit_repay","m"+i+"m"+(i+2)+"mDebitRepay");
				TRANSMAP.put("acm_m"+i+"m"+(i+2)+"_debit_in","m"+i+"m"+(i+2)+"mDebitIn");
				TRANSMAP.put("acm_m"+i+"m"+(i+2)+"_credit_out","m"+i+"m"+(i+2)+"mDebitOut");
				TRANSMAP.put("acm_m"+i+"m"+(i+2)+"_credit_cash","m"+i+"m"+(i+2)+"mDebitCash");
				TRANSMAP.put("acm_m"+i+"m"+(i+2)+"_credit_in","m"+i+"m"+(i+2)+"mDebitIn");
				TRANSMAP.put("acm_m"+i+"m"+(i+2)+"_credit_def","m"+i+"m"+(i+2)+"mDebitDef");
				TRANSMAP.put("acm_m"+i+"m"+(i+2)+"_loan","m"+i+"m"+(i+2)+"mLoan");
				TRANSMAP.put("acm_m"+i+"m"+(i+2)+"_loan","m"+i+"m"+(i+2)+"mLoan");
				TRANSMAP.put("acm_m"+i+"m"+(i+2)+"_cons","m"+i+"m"+(i+2)+"mCons");
				TRANSMAP.put("acm_m"+i+"m"+(i+2)+"_max_in","m"+i+"m"+(i+2)+"mMaxIn");
				TRANSMAP.put("acm_m"+i+"m"+(i+2)+"_debit_in_num","m"+i+"m"+(i+2)+"mDebitInNum");
				TRANSMAP.put("acm_m"+i+"m"+(i+2)+"_debit_out_num","m"+i+"m"+(i+2)+"mDebitOutNum");
				TRANSMAP.put("acm_m"+i+"m"+(i+2)+"_credit_in_num","m"+i+"m"+(i+2)+"mCreditInNum");
				TRANSMAP.put("acm_m"+i+"m"+(i+2)+"_credit_out_num","m"+i+"m"+(i+2)+"mCreditOutNum");
				i=i+3;
			}
			DICT_FLAG_OVERDUE.put("0", "未逾期");
			DICT_FLAG_OVERDUE.put("1", "逾期");
			DICT_FLAG_OVERDUE.put(null, "无信息返回");
			
			DICT_AMOUNT_RANGE.put("00","0~500");
			DICT_AMOUNT_RANGE.put("01","500~1000");
			DICT_AMOUNT_RANGE.put("02","1000~1500");
			DICT_AMOUNT_RANGE.put("03","1500~2000");
			DICT_AMOUNT_RANGE.put("04","2000~2500");
			DICT_AMOUNT_RANGE.put("05","2500~3000");
			DICT_AMOUNT_RANGE.put("06","3000~3500");
			DICT_AMOUNT_RANGE.put("07","3500~4000");
			DICT_AMOUNT_RANGE.put("08","4000~4500");
			DICT_AMOUNT_RANGE.put("09","4500~5000");
			DICT_AMOUNT_RANGE.put("10","5000~5500");
			DICT_AMOUNT_RANGE.put("11","5500~6000");
			DICT_AMOUNT_RANGE.put("12","6000~6500");
			DICT_AMOUNT_RANGE.put("13","6500~7000");
			DICT_AMOUNT_RANGE.put("14","7000~7500");
			DICT_AMOUNT_RANGE.put("15","7500~8000");
			DICT_AMOUNT_RANGE.put("16","8000~8500");
			DICT_AMOUNT_RANGE.put("17","8500~9000");
			DICT_AMOUNT_RANGE.put("18","9000~9500");
			DICT_AMOUNT_RANGE.put("19","9500~10000");
			DICT_AMOUNT_RANGE.put("20","10000~15000");
			DICT_AMOUNT_RANGE.put("21","15000~20000");
			DICT_AMOUNT_RANGE.put("22","20000~25000");
			DICT_AMOUNT_RANGE.put("23","25000~30000");
			DICT_AMOUNT_RANGE.put("24","30000~35000");
			DICT_AMOUNT_RANGE.put("25","35000~40000");
			DICT_AMOUNT_RANGE.put("26","40000~45000");
			DICT_AMOUNT_RANGE.put("27","45000~50000");
			DICT_AMOUNT_RANGE.put("28","50000~55000");
			DICT_AMOUNT_RANGE.put("29","55000~60000");
			DICT_AMOUNT_RANGE.put("30","60000~65000");
			DICT_AMOUNT_RANGE.put("31","65000~70000");
			DICT_AMOUNT_RANGE.put("32","70000~75000");
			DICT_AMOUNT_RANGE.put("33","75000~80000");
			DICT_AMOUNT_RANGE.put("34","80000~85000");
			DICT_AMOUNT_RANGE.put("35","85000~90000");
			DICT_AMOUNT_RANGE.put("36","90000~95000");
			DICT_AMOUNT_RANGE.put("37","95000~100000");
			DICT_AMOUNT_RANGE.put("38","100000~200000");
			DICT_AMOUNT_RANGE.put("39","200000~300000");
			DICT_AMOUNT_RANGE.put("40","300000~400000");
			DICT_AMOUNT_RANGE.put("41","400000~500000");
			DICT_AMOUNT_RANGE.put("42","500000~600000");
			DICT_AMOUNT_RANGE.put("43","600000~700000");
			DICT_AMOUNT_RANGE.put("44","700000~800000");
			DICT_AMOUNT_RANGE.put("45","800000~900000");
			DICT_AMOUNT_RANGE.put("46","900000~1000000");
			DICT_AMOUNT_RANGE.put("47","1000000~2000000");
			DICT_AMOUNT_RANGE.put("48","2000000~3000000");
			DICT_AMOUNT_RANGE.put("49","3000000~4000000");
			DICT_AMOUNT_RANGE.put("50","4000000~5000000");
			DICT_AMOUNT_RANGE.put("51","5000000~6000000");
			DICT_AMOUNT_RANGE.put("52","6000000~7000000");
			DICT_AMOUNT_RANGE.put("53","7000000~8000000");
			DICT_AMOUNT_RANGE.put("54","8000000~9000000");
			DICT_AMOUNT_RANGE.put("55","9000000~10000000");
			DICT_AMOUNT_RANGE.put("56","10000000~");
			DICT_AMOUNT_RANGE.put("99","未知");
		}
	}
	
	/**
	 * 常量类:百融申请核查返回数据字典
	 * 
	 * @author Fangx
	 * 
	 */
	public static class Credit100ApplyLoanConstant{
		/**
		 * 接口返回key值转换
		 */
		public static final Map<String,String> TRANSMAP = new HashMap<String, String>();
		
		static{
			TRANSMAP.put("result_flag", "creditFlag");
			
			TRANSMAP.put("al_m3_id_bank_selfnum","3mIdcardBankSelfnum");
			TRANSMAP.put("al_m3_id_bank_allnum","3mIdcardBankAllnum");
			TRANSMAP.put("al_m3_id_bank_orgnum","3mIdcardBankOrgnum");
			TRANSMAP.put("al_m3_id_notbank_selfnum","3mIdcardNotbankSelfnum");
			TRANSMAP.put("al_m3_id_notbank_allnum","3mIdcardNotbankAllnum");
			TRANSMAP.put("al_m3_id_notbank_orgnum","3mIdcardNotbankOrgnum");
			TRANSMAP.put("al_m3_cell_bank_selfnum","3mMobileBankSelfnum");
			TRANSMAP.put("al_m3_cell_bank_allnum","3mMobileBankAllnum");
			TRANSMAP.put("al_m3_cell_bank_orgnum","3mMobileBankOrgnum");
			TRANSMAP.put("al_m3_cell_notbank_selfnum","3mMobileNotbankSelfnum");
			TRANSMAP.put("al_m3_cell_notbank_allnum","3mMobileNotbankAllnum");
			TRANSMAP.put("al_m3_cell_notbank_orgnum","3mMobileNotbankOrgnum");
			
			TRANSMAP.put("al_m6_id_bank_selfnum","6mIdcardBankSelfnum");
			TRANSMAP.put("al_m6_id_bank_allnum","6mIdcardBankAllnum");
			TRANSMAP.put("al_m6_id_bank_orgnum","6mIdcardBankOrgnum");
			TRANSMAP.put("al_m6_id_notbank_selfnum","6mIdcardNotbankSelfnum");
			TRANSMAP.put("al_m6_id_notbank_allnum","6mIdcardNotbankAllnum");
			TRANSMAP.put("al_m6_id_notbank_orgnum","6mIdcardNotbankOrgnum");
			TRANSMAP.put("al_m6_cell_bank_selfnum","6mMobileBankSelfnum");
			TRANSMAP.put("al_m6_cell_bank_allnum","6mMobileBankAllnum");
			TRANSMAP.put("al_m6_cell_bank_orgnum","6mMobileBankOrgnum");
			TRANSMAP.put("al_m6_cell_notbank_selfnum","6mMobileNotbankSelfnum");
			TRANSMAP.put("al_m6_cell_notbank_allnum","6mMobileNotbankAllnum");
			TRANSMAP.put("al_m6_cell_notbank_orgnum","6mMobileNotbankOrgnum");
			
			TRANSMAP.put("al_m12_id_bank_selfnum","12mIdcardBankSelfnum");
			TRANSMAP.put("al_m12_id_bank_allnum","12mIdcardBankAllnum");
			TRANSMAP.put("al_m12_id_bank_orgnum","12mIdcardBankOrgnum");
			TRANSMAP.put("al_m12_id_notbank_selfnum","12mIdcardNotbankSelfnum");
			TRANSMAP.put("al_m12_id_notbank_allnum","12mIdcardNotbankAllnum");
			TRANSMAP.put("al_m12_id_notbank_orgnum","12mIdcardNotbankOrgnum");
			TRANSMAP.put("al_m12_cell_bank_selfnum","12mMobileBankSelfnum");
			TRANSMAP.put("al_m12_cell_bank_allnum","12mMobileBankAllnum");
			TRANSMAP.put("al_m12_cell_bank_orgnum","12mMobileBankOrgnum");
			TRANSMAP.put("al_m12_cell_notbank_selfnum","12mMobileNotbankSelfnum");
			TRANSMAP.put("al_m12_cell_notbank_allnum","12mMobileNotbankAllnum");
			TRANSMAP.put("al_m12_cell_notbank_orgnum","12mMobileNotbankOrgnum");
		}
	}
	
	/**
	 * 常量类:百融消费评估返回数据字典
	 * 
	 * @author Fangx
	 * 
	 */
	public static class Credit100ConsumptionConstant{
		/**
		 * 接口核查结果:没有查得相关数据
		 */
		public static final String RESULT_FLAG_NOT_HIT = "0";
		/**
		 * 接口核查结果:输出成功
		 */
		public static final String RESULT_FLAG_HIT = "1";
		/**
		 * 接口核查结果:是否有记录
		 */
		public static final String RESULT_FLAG = "result_flag";
		/**
		 * 接口返回数据：消费类别字典值转换
		 */
		public static final Map<String,String> DICT_PAY_TYPE = new HashMap<String, String>();
		/**
		 * 接口返回数据：消费情况字典值转换
		 */
		public static final Map<String,String> DICT_CONSUM_DETAIL = new HashMap<String, String>();
		/**
		 * 接口返回数据：消费时间间隔字典值转换
		 */
		public static final Map<String,String> DICT_CONSUM_INTERVAL = new HashMap<String, String>();
		/**
		 * 接口返回结果值转换
		 */
		public static final Map<String,String> MAP = new HashMap<String, String>();
		/**
		 * 接口返回key值转换
		 */
		public static final Map<String,String> TRANSMAP = new HashMap<String, String>();
		
		static{
			MAP.put(RESULT_FLAG_NOT_HIT, "没有查得相关数据记录");
			MAP.put(RESULT_FLAG_HIT, "输出成功");
			
			TRANSMAP.put("result_flag", "outDataFlag");
			TRANSMAP.put("cons_cont","contConsum");
			TRANSMAP.put("cons_time_recent","recentTime");
			TRANSMAP.put("cons_tot_m3_num","3mPayNumCount");
			TRANSMAP.put("cons_tot_m3_pay","3mPayCount");
			TRANSMAP.put("cons_tot_m3_p_catenum","3mPayTypeNum");
			TRANSMAP.put("cons_tot_m3_v_catenum","3mVisitTypeNum");
			TRANSMAP.put("cons_tot_m3_visits","3mVisitNumCount");
			TRANSMAP.put("cons_tot_m12_num","12mPayNumCount");
			TRANSMAP.put("cons_tot_m12_pay","12mPayCount");
			TRANSMAP.put("cons_tot_m12_p_catenum","12mPayNum");
			TRANSMAP.put("cons_tot_m12_v_catenum","12mVisitNum");
			TRANSMAP.put("cons_tot_m12_visits","12mVisitNumCount");
			TRANSMAP.put("cons_max_m3_num","3mMaxPayNum");
			TRANSMAP.put("cons_max_m3_pay","3mMaxPayCount");
			TRANSMAP.put("cons_max_m3_paycate","3mMaxPayType");
			TRANSMAP.put("cons_max_m12_num","12mMaxPayNum");
			TRANSMAP.put("cons_max_m12_pay","12mMaxPayCount");
			TRANSMAP.put("cons_max_m12_paycate","12mMaxPayType");
			TRANSMAP.put("cons_m3_RYBH_num","3mRYBHPayNum");
			TRANSMAP.put("cons_m3_RYBH_pay","3mRYBHPayCount");
			TRANSMAP.put("cons_m3_JYDQ_num","3mJYDQPayNum");
			TRANSMAP.put("cons_m3_JYDQ_pay","3mJYDQPayCount");
			TRANSMAP.put("cons_m3_MYYP_num","3mMYYPPayNum");
			TRANSMAP.put("cons_m3_MYYP_pay","3mMYYPPayCount");
			TRANSMAP.put("cons_m12_RYBH_num","12mRYBHPayNum");
			TRANSMAP.put("cons_m12_RYBH_pay","12mRYBHPayCount");
			TRANSMAP.put("cons_m12_JYDQ_num","12mJYDQPayNum");
			TRANSMAP.put("cons_m12_JYDQ_pay","12mJYDQPayCount");
			TRANSMAP.put("cons_m12_MYYP_num","12mMYYPPayNum");
			TRANSMAP.put("cons_m12_MYYP_pay","3mMYYPPayCount");
			
			DICT_PAY_TYPE.put("C1","本地生活");
			DICT_PAY_TYPE.put("C1","本地生活");
			DICT_PAY_TYPE.put("C2","保险/理财");
			DICT_PAY_TYPE.put("C3","出差旅游");
			DICT_PAY_TYPE.put("C4","宠物生活");
			DICT_PAY_TYPE.put("C5","电脑/办公");
			DICT_PAY_TYPE.put("C6","房产");
			DICT_PAY_TYPE.put("C7","服装配饰");
			DICT_PAY_TYPE.put("C8","个护化妆");
			DICT_PAY_TYPE.put("C9","家具建材");
			DICT_PAY_TYPE.put("C10","家居家纺");
			DICT_PAY_TYPE.put("C11","家用电器");
			DICT_PAY_TYPE.put("C12","教育培训");
			DICT_PAY_TYPE.put("C13","美食特产");
			DICT_PAY_TYPE.put("C14","母婴用品");
			DICT_PAY_TYPE.put("C15","汽车用品");
			DICT_PAY_TYPE.put("C16","其他");
			DICT_PAY_TYPE.put("C17","日用百货");
			DICT_PAY_TYPE.put("C18","收藏");
			DICT_PAY_TYPE.put("C19","手机/手机配件");
			DICT_PAY_TYPE.put("C20","数码");
			DICT_PAY_TYPE.put("C21","通讯");
			DICT_PAY_TYPE.put("C22","文化娱乐");
			DICT_PAY_TYPE.put("C23","网络游戏/虚拟物品");
			DICT_PAY_TYPE.put("C24","鞋");
			DICT_PAY_TYPE.put("C25","箱包");
			DICT_PAY_TYPE.put("C26","运动户外");
			DICT_PAY_TYPE.put("C27","医疗保健");
			DICT_PAY_TYPE.put("C28","珠宝贵金属");
			DICT_PAY_TYPE.put("C29","钟表首饰");
			
			DICT_CONSUM_DETAIL.put("M1","总消费次数12m=6m=3m>0");
			DICT_CONSUM_DETAIL.put("M2","总消费次数12m>6m且6m=3m且3m>0");
			DICT_CONSUM_DETAIL.put("M3","总消费次数6m>3m>0且12m=6m");
			DICT_CONSUM_DETAIL.put("M4","总消费次数12m>6m>3m>0");
			DICT_CONSUM_DETAIL.put("M5","总消费次数12m=6m=3m=0");
			
			DICT_CONSUM_INTERVAL.put("T1","3个月以内");
			DICT_CONSUM_INTERVAL.put("T2","3到6个月之间");
			DICT_CONSUM_INTERVAL.put("T3","6到12月之间");
			DICT_CONSUM_INTERVAL.put("T4","12个月以外");
		}
	}
	
	/**
	 * 常量类:百融特殊名单返回数据字典
	 * 
	 * @author Fangx
	 * 
	 */
	public static class Credit100ContractConstant{
		/**
		 * 审批状态审核字典
		 */
		public static final Map<String,String> DICT_AUDIT_STATUS = new HashMap<String, String>();
		static{
			DICT_AUDIT_STATUS.put("1", "待审核");
			DICT_AUDIT_STATUS.put("2", "审核中");
			DICT_AUDIT_STATUS.put("3", "挂起");
			DICT_AUDIT_STATUS.put("4", "通过");
			DICT_AUDIT_STATUS.put("5", "拒绝");
			DICT_AUDIT_STATUS.put("6", "退回");
		}
	}
	
	/**
	 * 常量类:百融法院执行返回数据字典
	 * 
	 * @author Fangx
	 * 
	 */
	public static class Credit100ExecutionConstant{
		/**
		 * 接口返回key值转换
		 */
		public static final Map<String,String> TRANSMAP = new HashMap<String, String>();
		
		static{
			TRANSMAP.put("result_flag", "creditFlag");
			for (int i = 1; i < 11; i++) {
				TRANSMAP.put("ex_bad"+i+"_name","case"+i+"BadName");
				TRANSMAP.put("ex_bad"+i+"_cid","case"+i+"BadDocNo");
				TRANSMAP.put("ex_bad"+i+"_cidtype","case"+i+"BadDocType");
				TRANSMAP.put("ex_bad"+i+"_datatime","case"+i+"BadDatatime");
				TRANSMAP.put("ex_bad"+i+"_datatypeid","case"+i+"BadDatatypeid");
				TRANSMAP.put("ex_bad"+i+"_datatype","case"+i+"BadDatatype");
				TRANSMAP.put("ex_bad"+i+"_leader","case"+i+"BadLeader");
				TRANSMAP.put("ex_bad"+i+"_address","case"+i+"BadAddress");
				TRANSMAP.put("ex_bad"+i+"_court","case"+i+"BadCount");
				TRANSMAP.put("ex_bad"+i+"_time","case"+i+"BadTime");
				TRANSMAP.put("ex_bad"+i+"_casenum","case"+i+"BadCasenum");
				TRANSMAP.put("ex_bad"+i+"_money","case"+i+"BadMoney");
				TRANSMAP.put("ex_bad"+i+"_base","case"+i+"BadBase");
				TRANSMAP.put("ex_bad"+i+"_basecompany","case"+i+"BadBasecompany");
				TRANSMAP.put("ex_bad"+i+"_obligation","case"+i+"BadObligation");
				TRANSMAP.put("ex_bad"+i+"_lasttime","case"+i+"BadLasttime");
				TRANSMAP.put("ex_bad"+i+"_performance","case"+i+"BadPerformance");
				TRANSMAP.put("ex_bad"+i+"_concretesituation","case"+i+"BadConcretesituation");
				TRANSMAP.put("ex_bad"+i+"_breaktime","case"+i+"BadBreaktime");
				TRANSMAP.put("ex_bad"+i+"_posttime","case"+i+"BadPosttime");
				TRANSMAP.put("ex_bad"+i+"_performedpart","case"+i+"BadPerformedpart");
				TRANSMAP.put("ex_bad"+i+"_unperformpart","case"+i+"BadUnperformpart");
				TRANSMAP.put("ex_execut"+i+"_name","case"+i+"ExecutName");
				TRANSMAP.put("ex_execut"+i+"_cid","case"+i+"ExecutDocNo");
				TRANSMAP.put("ex_execut"+i+"_cidtype","case"+i+"ExecutDocType");
				TRANSMAP.put("ex_execut"+i+"_datatime","case"+i+"ExecutDatatime");
				TRANSMAP.put("ex_execut"+i+"_datatypeid","case"+i+"ExecutDatatypeid");
				TRANSMAP.put("ex_execut"+i+"_datatype","case"+i+"ExecutDatatype");
				TRANSMAP.put("ex_execut"+i+"_court","case"+i+"ExecutCourt");
				TRANSMAP.put("ex_execut"+i+"_time","case"+i+"ExecutTime");
				TRANSMAP.put("ex_execut"+i+"_casenum","case"+i+"ExecutCasenum");
				TRANSMAP.put("ex_execut"+i+"_money","case"+i+"ExecutMoney");
				TRANSMAP.put("ex_execut"+i+"_statute","case"+i+"ExecutStatute");
				TRANSMAP.put("ex_execut"+i+"_basic","case"+i+"ExecutBasic");
				TRANSMAP.put("ex_execut"+i+"_basiccourt","case"+i+"ExecutBasiccourt");
			}
		}
	}
	
	/**
	 * 常量类:百融媒体评估返回数据字典
	 * 
	 * @author Fangx
	 * 
	 */
	public static class Credit100MediaConstant{
		/**
		 * 接口核查结果:没有查得相关数据
		 */
		public static final String RESULT_FLAG_NOT_HIT = "0";
		/**
		 * 接口核查结果:输出成功
		 */
		public static final String RESULT_FLAG_HIT = "1";
		/**
		 * 接口核查结果:是否有记录
		 */
		public static final String RESULT_FLAG = "result_flag";
		/**
		 * 接口返回数据：消费类别字典值转换
		 */
		public static final Map<String,String> DICT_MEDIA_TYPE = new HashMap<String, String>();
		/**
		 * 接口返回结果值转换
		 */
		public static final Map<String,String> MAP = new HashMap<String, String>();
		/**
		 * 接口返回key值转换
		 */
		public static final Map<String,String> TRANSMAP = new HashMap<String, String>();
		
		static{
			MAP.put(RESULT_FLAG_NOT_HIT, "没有查得相关数据记录");
			MAP.put(RESULT_FLAG_HIT, "输出成功");
			
			TRANSMAP.put("result_flag", "outDataFlag");
			TRANSMAP.put("media_tot_m3_visitdays","3mVDaysCount");
			TRANSMAP.put("media_tot_m12_visitdays","12mVDaysCount");
			TRANSMAP.put("media_max_m3_days_prop","3mMaxToAllProp");
			TRANSMAP.put("media_max_m12_days_prop","12mMaxToAllProp");
			TRANSMAP.put("media_max_m3_days","3mMaxDays");
			TRANSMAP.put("media_max_m3_cate","3mMaxType");
			TRANSMAP.put("media_max_m12_days","12mMaxDays");
			TRANSMAP.put("media_max_m12_cate","12mMaxType");
			TRANSMAP.put("media_tot_m3_catenum","3mTypeCount");
			TRANSMAP.put("media_tot_m12_catenum","12mTypeCount");
			TRANSMAP.put("media_m3_CJ_visitdays","3mCJVDays");
			TRANSMAP.put("media_m3_WXYS_visitdays","3mWXYSVDays");
			TRANSMAP.put("media_m3_MYYE_visitdays","3mMYYEVDays");
			TRANSMAP.put("media_m12_CJ_visitdays","12mCJVDays");
			TRANSMAP.put("media_m12_WXYS_visitdays","12mWXYSVDays");
			TRANSMAP.put("media_m12_MYYE_visitdays","12mMYYEVDays");

			DICT_MEDIA_TYPE.put("C1","财经");
			DICT_MEDIA_TYPE.put("C2","彩票");
			DICT_MEDIA_TYPE.put("C3","动漫");
			DICT_MEDIA_TYPE.put("C4","房产");
			DICT_MEDIA_TYPE.put("C5","户外");
			DICT_MEDIA_TYPE.put("C6","IT");
			DICT_MEDIA_TYPE.put("C7","健康");
			DICT_MEDIA_TYPE.put("C8","军事");
			DICT_MEDIA_TYPE.put("C9","交友");
			DICT_MEDIA_TYPE.put("C10","教育");
			DICT_MEDIA_TYPE.put("C11","历史");
			DICT_MEDIA_TYPE.put("C12","旅游");
			DICT_MEDIA_TYPE.put("C13","美食");
			DICT_MEDIA_TYPE.put("C14","母婴/育儿");
			DICT_MEDIA_TYPE.put("C15","女性时尚");
			DICT_MEDIA_TYPE.put("C16","汽车");
			DICT_MEDIA_TYPE.put("C17","其他");
			DICT_MEDIA_TYPE.put("C18","生活");
			DICT_MEDIA_TYPE.put("C19","手机");
			DICT_MEDIA_TYPE.put("C20","数码");
			DICT_MEDIA_TYPE.put("C21","视频");
			DICT_MEDIA_TYPE.put("C22","社区");
			DICT_MEDIA_TYPE.put("C23","体育");
			DICT_MEDIA_TYPE.put("C24","文学艺术");
			DICT_MEDIA_TYPE.put("C25","新闻");
			DICT_MEDIA_TYPE.put("C26","娱乐");
			DICT_MEDIA_TYPE.put("C27","影视");
			DICT_MEDIA_TYPE.put("C28","邮箱");
			DICT_MEDIA_TYPE.put("C29","游戏");
			DICT_MEDIA_TYPE.put("C30","应用");
			DICT_MEDIA_TYPE.put("C31","音乐");
			DICT_MEDIA_TYPE.put("C32","支付");
			DICT_MEDIA_TYPE.put("C33","招聘");
			DICT_MEDIA_TYPE.put("C34","知识问答");
			DICT_MEDIA_TYPE.put("C88","未知");
		}
	}
	
	/**
	 * 百融金服 Service接口方法名常量
	 * @author   ChenYunyu
	 * @version  1.0
	 * @since    v1.0
	 * @Date     2017-3-13上午11:26:36
	 */
	public static class Credit100MethodConstant{
		/**
		 * 查询特殊列表信息
		 */
		public static final String QUERY_SPECIAL_LIST = "querySpecialList";
		
		/**
		 * 查询特殊列表规则
		 */
		public static final String QUERY_SPECIAL_LIST_RULE = "querySpecialListRule";
		
		/**
		 * 查询多次审核规则
		 */
		public static final String QUERY_APPLY_LOAN_RULE = "queryApplyLoanRule";
		
		/**
		 * 查询多次审核规则
		 */
		public static final String QUERY_EXECUTION_RULE = "queryExecutionRule";
		
		/**
		 * 查询收支等级规则
		 */
		public static final String QUERY_ACCOUNT_RULE = "queryAccountRule";
		
		/**
		 * 查询申请核查信息
		 */
		public static final String QUERY_APPLY_LOAN = "queryApplyLoan";
		
		/**
		 * 查询法院执行信息
		 */
		public static final String QUERY_EXECUTION = "queryExecution";
		
		/**
		 * 稳定性评估
		 */
		public static final String ASSESS_STABILITY = "assessStability";
		
		/**
		 * 商品消费评估
		 */
		public static final String ASSESS_CONSUMPTION = "assessConsumption";
		
		/**
		 * 媒体评估
		 */
		public static final String ASSESS_MEDIA = "assessMedia";
		
		/**
		 * 收支评估
		 */
		public static final String ASSESS_ACCOUNT = "assessAccount";
	}
	
	/**
	 * 常量类:百融特殊名单返回数据字典
	 * 
	 * @author Fangx
	 * 
	 */
	public static class Credit100SpecialListConstant{
		/**
		 * 核查结果:直接命中
		 */
		public static final String HIT_DIRECT = "0" ;
		/**
		 * 核查结果:一度人脉命中
		 */
		public static final String HIT_LINKLEVEL_ONE = "1" ;
		/**
		 * 核查结果:二度人脉命中
		 */
		public static final String HIT_LINKLEVEL_TWO = "2" ;
		
		/**
		 * 接口返回信息
		 */
		public static final Map<String,String> DICT_HIT = new HashMap<String, String>();
		/**
		 * 接口返回key值翻译
		 */
		public static final Map<String,String> MAP = new HashMap<String, String>();
		/**
		 * 接口返回key值转换
		 */
		public static final Map<String,String> TRANSMAP = new HashMap<String, String>();
		
		static{
			DICT_HIT.put(HIT_DIRECT, "直接命中");
			DICT_HIT.put(HIT_LINKLEVEL_ONE, "直系亲属命中");
			DICT_HIT.put(HIT_LINKLEVEL_TWO, "亲属的亲属命中");
			
			MAP.put("sl_id_abnormal", "通过身份证查询疑似欺诈");
			MAP.put("sl_id_phone_overdue", "通过身份证查询电信欠费");
			MAP.put("sl_id_court_bad", "通过身份证查询法院失信人");
			MAP.put("sl_id_court_executed", "通过身份证查询法院被执行人");
			MAP.put("sl_id_bank_bad", "通过身份证查询银行不良");
			MAP.put("sl_id_bank_overdue", "通过身份证查询银行短时逾期");
			MAP.put("sl_id_bank_fraud", "通过身份证查询银行欺诈");
			MAP.put("sl_id_bank_lost", "通过身份证查询银行失联");
			MAP.put("sl_id_bank_refuse", "通过身份证查询银行拒绝");
			MAP.put("sl_id_p2p_bad", "通过身份证查询小贷或P2P不良");
			MAP.put("sl_id_p2p_overdue", "通过身份证查询小贷或P2P短时逾期");
			MAP.put("sl_id_p2p_fraud", "通过身份证查询小贷或P2P欺诈");
			MAP.put("sl_id_p2p_lost", "通过身份证查询小贷或P2P失联");
			MAP.put("sl_id_p2p_refuse", "通过身份证查询小贷或P2P拒绝");
			MAP.put("sl_id_nbank_p2p_bad", "通过身份证查询P2P不良");
			MAP.put("sl_id_nbank_p2p_overdue", "通过身份证查询P2P短时逾期");
			MAP.put("sl_id_nbank_p2p_fraud", "通过身份证查询P2P欺诈");
			MAP.put("sl_id_nbank_p2p_lost", "通过身份证查询P2P失联");
			MAP.put("sl_id_nbank_p2p_refuse", "通过身份证查询P2P拒绝");
			MAP.put("sl_id_nbank_mc_bad", "通过身份证查询小贷不良");
			MAP.put("sl_id_nbank_mc_overdue", "通过身份证查询小贷短时逾期");
			MAP.put("sl_id_nbank_mc_fraud", "通过身份证查询小贷欺诈");
			MAP.put("sl_id_nbank_mc_lost", "通过身份证查询小贷失联");
			MAP.put("sl_id_nbank_mc_refuse", "通过身份证查询小贷拒绝");
			MAP.put("sl_id_nbank_ca_bad", "通过身份证查询现金类分期不良");
			MAP.put("sl_id_nbank_ca_overdue", "通过身份证查询现金类分期短时逾期");
			MAP.put("sl_id_nbank_ca_fraud", "通过身份证查询现金类分期欺诈");
			MAP.put("sl_id_nbank_ca_lost", "通过身份证查询现金类分期失联");
			MAP.put("sl_id_nbank_ca_refuse", "通过身份证查询现金类分期拒绝");
			MAP.put("sl_id_nbank_com_bad", "通过身份证查询代偿类分期不良");
			MAP.put("sl_id_nbank_com_overdue", "通过身份证查询代偿类分期短时逾期");
			MAP.put("sl_id_nbank_com_fraud", "通过身份证查询代偿类分期短时欺诈");
			MAP.put("sl_id_nbank_com_lost", "通过身份证查询代偿类分期短时失联");
			MAP.put("sl_id_nbank_com_refuse", "通过身份证查询代偿类分期短时拒绝");
			MAP.put("sl_id_nbank_cf_bad", "通过身份证查询消费金融不良");
			MAP.put("sl_id_nbank_cf_overdue", "通过身份证查询消费金融短时逾期");
			MAP.put("sl_id_nbank_cf_fraud", "通过身份证查询消费金融欺诈");
			MAP.put("sl_id_nbank_cf_lost", "通过身份证查询消费金融失联");
			MAP.put("sl_id_nbank_cf_refuse", "通过身份证查询消费金融拒绝");
			MAP.put("sl_id_nbank_other_bad", "通过身份证查询非银其他不良");
			MAP.put("sl_id_nbank_other_overdue", "通过身份证查询非银其他短时逾期");
			MAP.put("sl_id_nbank_other_fraud", "通过身份证查询非银其他欺诈");
			MAP.put("sl_id_nbank_other_lost", "通过身份证查询非银其他失联");
			MAP.put("sl_id_nbank_other_refuse", "通过身份证查询非银其他拒绝");
			MAP.put("sl_lm_cell_bank_bad", "通过联系人手机查询银行不良");
			MAP.put("sl_lm_cell_bank_overdue", "通过联系人手机查询银行短时逾期");
			MAP.put("sl_lm_cell_bank_fraud", "通过联系人手机查询银行欺诈");
			MAP.put("sl_lm_cell_bank_lost", "通过联系人手机查询银行失联");
			MAP.put("sl_lm_cell_bank_refuse", "通过联系人手机查询银行拒绝");
			MAP.put("sl_lm_cell_phone_overdue", "通过联系人手机查询电信欠费");
			MAP.put("sl_lm_cell_nbank_p2p_bad", "通过联系人手机查询P2P不良");
			MAP.put("sl_lm_cell_nbank_p2p_overdue", "通过联系人手机查询P2P短时逾期");
			MAP.put("sl_lm_cell_nbank_p2p_fraud", "通过联系人手机查询P2P欺诈");
			MAP.put("sl_lm_cell_nbank_p2p_lost", "通过联系人手机查询P2P失联");
			MAP.put("sl_lm_cell_nbank_p2p_refuse", "通过联系人手机查询P2P拒绝");
			MAP.put("sl_lm_cell_nbank_mc_bad", "通过联系人手机查询小贷不良");
			MAP.put("sl_lm_cell_nbank_mc_overdue", "通过联系人手机查询小贷短时逾期");
			MAP.put("sl_lm_cell_nbank_mc_fraud", "通过联系人手机查询小贷欺诈");
			MAP.put("sl_lm_cell_nbank_mc_lost", "通过联系人手机查询小贷失联");
			MAP.put("sl_lm_cell_nbank_mc_refuse", "通过联系人手机查询小贷拒绝");
			MAP.put("sl_lm_cell_nbank_ca_bad", "通过联系人手机查询现金类分期不良");
			MAP.put("sl_lm_cell_nbank_ca_overdue", "通过联系人手机查询现金类分期短时逾期");
			MAP.put("sl_lm_cell_nbank_ca_fraud", "通过联系人手机查询现金类分期欺诈");
			MAP.put("sl_lm_cell_nbank_ca_lost", "通过联系人手机查询现金类分期失联");
			MAP.put("sl_lm_cell_nbank_ca_refuse", "通过联系人手机查询现金类分期拒绝");
			MAP.put("sl_lm_cell_nbank_com_bad", "通过联系人手机查询代偿类分期不良");
			MAP.put("sl_lm_cell_nbank_com_overdue", "通过联系人手机查询代偿类分期短时逾期");
			MAP.put("sl_lm_cell_nbank_com_fraud", "通过联系人手机查询代偿类分期短时欺诈");
			MAP.put("sl_lm_cell_nbank_com_lost", "通过联系人手机查询代偿类分期短时失联");
			MAP.put("sl_lm_cell_nbank_com_refuse", "通过联系人手机查询代偿类分期短时拒绝");
			MAP.put("sl_lm_cell_nbank_cf_bad", "通过联系人手机查询消费金融不良");
			MAP.put("sl_lm_cell_nbank_cf_overdue", "通过联系人手机查询消费金融短时逾期");
			MAP.put("sl_lm_cell_nbank_cf_fraud", "通过联系人手机查询消费金融欺诈");
			MAP.put("sl_lm_cell_nbank_cf_lost", "通过联系人手机查询消费金融失联");
			MAP.put("sl_lm_cell_nbank_cf_refuse", "通过联系人手机查询消费金融拒绝");
			MAP.put("sl_lm_cell_nbank_other_bad", "通过联系人手机查询非银其他不良");
			MAP.put("sl_lm_cell_nbank_other_overdue", "通过联系人手机查询非银其他短时逾期");
			MAP.put("sl_lm_cell_nbank_other_fraud", "通过联系人手机查询非银其他欺诈");
			MAP.put("sl_lm_cell_nbank_other_lost", "通过联系人手机查询非银其他失联");
			MAP.put("sl_lm_cell_nbank_other_refuse", "通过联系人手机查询非银其他拒绝");
			MAP.put("sl_cell_bank_bad", "通过手机号查询银行不良");
			MAP.put("sl_cell_bank_overdue", "通过手机号查询银行短时逾期");
			MAP.put("sl_cell_bank_fraud", "通过手机号查询银行欺诈");
			MAP.put("sl_cell_bank_lost", "通过手机号查询银行失联");
			MAP.put("sl_cell_bank_refuse", "通过手机号查询银行拒绝");
			MAP.put("sl_cell_p2p_bad", "通过手机号查询小贷或P2P不良");
			MAP.put("sl_cell_p2p_overdue", "通过手机号查询小贷或P2P短时逾期");
			MAP.put("sl_cell_p2p_fraud", "通过手机号查询小贷或P2P欺诈");
			MAP.put("sl_cell_p2p_lost", "通过手机号查询小贷或P2P失联");
			MAP.put("sl_cell_p2p_refuse", "通过手机号查询小贷或P2P拒绝");
			MAP.put("sl_cell_phone_overdue", "通过手机号查询电信欠费");
			MAP.put("sl_cell_nbank_p2p_bad", "通过手机号查询P2P不良");
			MAP.put("sl_cell_nbank_p2p_overdue", "通过手机号查询P2P短时逾期");
			MAP.put("sl_cell_nbank_p2p_fraud", "通过手机号查询P2P欺诈");
			MAP.put("sl_cell_nbank_p2p_lost", "通过手机号查询P2P失联");
			MAP.put("sl_cell_nbank_p2p_refuse", "通过手机号查询P2P拒绝");
			MAP.put("sl_cell_nbank_mc_bad", "通过手机号查询小贷不良");
			MAP.put("sl_cell_nbank_mc_overdue", "通过手机号查询小贷短时逾期");
			MAP.put("sl_cell_nbank_mc_fraud", "通过手机号查询小贷欺诈");
			MAP.put("sl_cell_nbank_mc_lost", "通过手机号查询小贷失联");
			MAP.put("sl_cell_nbank_mc_refuse", "通过手机号查询小贷拒绝");
			MAP.put("sl_cell_nbank_ca_bad", "通过手机号查询现金类分期不良");
			MAP.put("sl_cell_nbank_ca_overdue", "通过手机号查询现金类分期短时逾期");
			MAP.put("sl_cell_nbank_ca_fraud", "通过手机号查询现金类分期欺诈");
			MAP.put("sl_cell_nbank_ca_lost", "通过手机号查询现金类分期失联");
			MAP.put("sl_cell_nbank_ca_refuse", "通过手机号查询现金类分期拒绝");
			MAP.put("sl_cell_nbank_com_bad", "通过手机号查询代偿类分期不良");
			MAP.put("sl_cell_nbank_com_overdue", "通过手机号查询代偿类分期短时逾期");
			MAP.put("sl_cell_nbank_com_fraud", "通过手机号查询代偿类分期短时欺诈");
			MAP.put("sl_cell_nbank_com_lost", "通过手机号查询代偿类分期短时失联");
			MAP.put("sl_cell_nbank_com_refuse", "通过手机号查询代偿类分期短时拒绝");
			MAP.put("sl_cell_nbank_cf_bad", "通过手机号查询消费金融不良");
			MAP.put("sl_cell_nbank_cf_overdue", "通过手机号查询消费金融短时逾期");
			MAP.put("sl_cell_nbank_cf_fraud", "通过手机号查询消费金融欺诈");
			MAP.put("sl_cell_nbank_cf_lost", "通过手机号查询消费金融失联");
			MAP.put("sl_cell_nbank_cf_refuse", "通过手机号查询消费金融拒绝");
			MAP.put("sl_cell_nbank_other_bad", "通过手机号查询非银其他不良");
			MAP.put("sl_cell_nbank_other_overdue", "通过手机号查询非银其他短时逾期");
			MAP.put("sl_cell_nbank_other_fraud", "通过手机号查询非银其他欺诈");
			MAP.put("sl_cell_nbank_other_lost", "通过手机号查询非银其他失联");
			MAP.put("sl_cell_nbank_other_refuse", "通过手机号查询非银其他拒绝");
			
			TRANSMAP.put("result_flag", "creditFlag");
			TRANSMAP.put("sl_id_abnormal", "idcardAbnormal");
			TRANSMAP.put("sl_id_phone_overdue", "idcardTelecomOverdue");
			TRANSMAP.put("sl_id_court_bad", "idcardCourtBad");
			TRANSMAP.put("sl_id_court_executed", "idcardCourtExecuted");
			TRANSMAP.put("sl_id_bank_bad", "idcardBankBad");
			TRANSMAP.put("sl_id_bank_overdue", "idcardBankOverdue");
			TRANSMAP.put("sl_id_bank_fraud","idcardBankFraud");
			TRANSMAP.put("sl_id_bank_lost","idcardBankLost");
			TRANSMAP.put("sl_id_bank_refuse","idcardBankRefuse");
			TRANSMAP.put("sl_id_p2p_bad","idcardP2PBad");
			TRANSMAP.put("sl_id_p2p_overdue","idcardP2POverdue");
			TRANSMAP.put("sl_id_p2p_fraud","idcardP2PFraud");
			TRANSMAP.put("sl_id_p2p_lost","idcardP2PLost");
			TRANSMAP.put("sl_id_p2p_refuse","idcardP2PRefuse");
			TRANSMAP.put("sl_id_nbank_p2p_bad","idcardNobankP2PBad");
			TRANSMAP.put("sl_id_nbank_p2p_overdue","idcardNobankP2POverdue");
			TRANSMAP.put("sl_id_nbank_p2p_fraud","idcardNobankP2PFraud");
			TRANSMAP.put("sl_id_nbank_p2p_lost","idcardNobankP2PLost");
			TRANSMAP.put("sl_id_nbank_p2p_refuse","idcardNobankP2PRefuse");
			TRANSMAP.put("sl_id_nbank_mc_bad","idcardNobankMicroloanBad");
			TRANSMAP.put("sl_id_nbank_mc_overdue","idcardNobankMicroloanOverdue");
			TRANSMAP.put("sl_id_nbank_mc_fraud","idcardNobankMicroloanFraud");
			TRANSMAP.put("sl_id_nbank_mc_lost","idcardNobankMicroloanLost");
			TRANSMAP.put("sl_id_nbank_mc_refuse","idcardNobankMicroloanRefuse");
			TRANSMAP.put("sl_id_nbank_ca_bad","idcardNobankCashBad");
			TRANSMAP.put("sl_id_nbank_ca_overdue","idcardNobankCashOverdue");
			TRANSMAP.put("sl_id_nbank_ca_fraud","idcardNobankCashFraud");
			TRANSMAP.put("sl_id_nbank_ca_lost","idcardNobankCashLost");
			TRANSMAP.put("sl_id_nbank_ca_refuse","idcardNobankCashRefuse");
			TRANSMAP.put("sl_id_nbank_com_bad","idcardNobankComBad");
			TRANSMAP.put("sl_id_nbank_com_overdue","idcardNobankComOverdue");
			TRANSMAP.put("sl_id_nbank_com_fraud","idcardNobankComFraud");
			TRANSMAP.put("sl_id_nbank_com_lost","idcardNobankComLost");
			TRANSMAP.put("sl_id_nbank_com_refuse","idcardNobankComRefuse");
			TRANSMAP.put("sl_id_nbank_cf_bad","idcardNobankConsumeBad");
			TRANSMAP.put("sl_id_nbank_cf_overdue","idcardNobankConsumeOverdue");
			TRANSMAP.put("sl_id_nbank_cf_fraud","idcardNobankConsumeFraud");
			TRANSMAP.put("sl_id_nbank_cf_lost","idcardNobankConsumeLost");
			TRANSMAP.put("sl_id_nbank_cf_refuse","idcardNobankConsumeRefuse");
			TRANSMAP.put("sl_id_nbank_other_bad","idcardNobankOtherBad");
			TRANSMAP.put("sl_id_nbank_other_overdue","idcardNobankOtherOverdue");
			TRANSMAP.put("sl_id_nbank_other_fraud","idcardNobankOtherFraud");
			TRANSMAP.put("sl_id_nbank_other_lost","idcardNobankOtherLost");
			TRANSMAP.put("sl_id_nbank_other_refuse","idcardNobankOtherRefuse");
			TRANSMAP.put("sl_lm_cell_bank_bad","contractMobileBankBad");
			TRANSMAP.put("sl_lm_cell_bank_overdue","contractMobileBankOverdue");
			TRANSMAP.put("sl_lm_cell_bank_fraud","contractMobileBankFraud");
			TRANSMAP.put("sl_lm_cell_bank_lost","contractMobileBankLost");
			TRANSMAP.put("sl_lm_cell_bank_refuse","contractMobileBankRefuse");
			TRANSMAP.put("sl_lm_cell_phone_overdue","contractMobileTelecomOverdue");
			TRANSMAP.put("sl_lm_cell_nbank_p2p_bad","contractMobileNobankP2PBad");
			TRANSMAP.put("sl_lm_cell_nbank_p2p_overdue","contractMobileNobankP2POverdue");
			TRANSMAP.put("sl_lm_cell_nbank_p2p_fraud","contractMobileNobankP2PFraud");
			TRANSMAP.put("sl_lm_cell_nbank_p2p_lost","contractMobileNobankP2PLost");
			TRANSMAP.put("sl_lm_cell_nbank_p2p_refuse","contractMobileNobankP2PRefuse");
			TRANSMAP.put("sl_lm_cell_nbank_mc_bad","contractMobileNobankMicroloanBad");
			TRANSMAP.put("sl_lm_cell_nbank_mc_overdue","contractMobileNobankMicroloanOverdue");
			TRANSMAP.put("sl_lm_cell_nbank_mc_fraud","contractMobileNobankMicroloanFraud");
			TRANSMAP.put("sl_lm_cell_nbank_mc_lost","contractMobileNobankMicroloanLost");
			TRANSMAP.put("sl_lm_cell_nbank_mc_refuse","contractMobileNobankMicroloanRefuse");
			TRANSMAP.put("sl_lm_cell_nbank_ca_bad","contractMobileNobankCashBad");
			TRANSMAP.put("sl_lm_cell_nbank_ca_overdue","contractMobileNobankCashOverdue");
			TRANSMAP.put("sl_lm_cell_nbank_ca_fraud","contractMobileNobankCashFraud");
			TRANSMAP.put("sl_lm_cell_nbank_ca_lost","contractMobileNobankCashLost");
			TRANSMAP.put("sl_lm_cell_nbank_ca_refuse","contractMobileNobankCashRefuse");
			TRANSMAP.put("sl_lm_cell_nbank_com_bad","contractMobileNobankComBad");
			TRANSMAP.put("sl_lm_cell_nbank_com_overdue","contractMobileNobankComOverdue");
			TRANSMAP.put("sl_lm_cell_nbank_com_fraud","contractMobileNobankComFraud");
			TRANSMAP.put("sl_lm_cell_nbank_com_lost","contractMobileNobankComLost");
			TRANSMAP.put("sl_lm_cell_nbank_com_refuse","contractMobileNobankComRefuse");
			TRANSMAP.put("sl_lm_cell_nbank_cf_bad","contractMobileNobankConsumeBad");
			TRANSMAP.put("sl_lm_cell_nbank_cf_overdue","contractMobileNobankConsumeOverdue");
			TRANSMAP.put("sl_lm_cell_nbank_cf_fraud","contractMobileNobankConsumeFraud");
			TRANSMAP.put("sl_lm_cell_nbank_cf_lost","contractMobileNobankConsumeLost");
			TRANSMAP.put("sl_lm_cell_nbank_cf_refuse","contractMobileNobankConsumeRefuse");
			TRANSMAP.put("sl_lm_cell_nbank_other_bad","contractMobileNobankOtherBad");
			TRANSMAP.put("sl_lm_cell_nbank_other_overdue","contractMobileNobankOtherOverdue");
			TRANSMAP.put("sl_lm_cell_nbank_other_fraud","contractMobileNobankOtherFraud");
			TRANSMAP.put("sl_lm_cell_nbank_other_lost","contractMobileNobankOtherLost");
			TRANSMAP.put("sl_lm_cell_nbank_other_refuse","contractMobileNobankOtherRefuse");
			TRANSMAP.put("sl_cell_bank_bad","mobileBankBad");
			TRANSMAP.put("sl_cell_bank_overdue","mobileBankOverdue");
			TRANSMAP.put("sl_cell_bank_fraud","mobileBankFraud");
			TRANSMAP.put("sl_cell_bank_lost","mobileBankLost");
			TRANSMAP.put("sl_cell_bank_refuse","mobileBankRefuse");
			TRANSMAP.put("sl_cell_p2p_bad","mobileP2PBad");
			TRANSMAP.put("sl_cell_p2p_overdue","mobileP2POverdue");
			TRANSMAP.put("sl_cell_p2p_fraud","mobileP2PFraud");
			TRANSMAP.put("sl_cell_p2p_lost","mobileP2PLost");
			TRANSMAP.put("sl_cell_p2p_refuse","mobileP2PRefuse");
			TRANSMAP.put("sl_cell_phone_overdue","mobileTelecomOverdue");
			TRANSMAP.put("sl_cell_nbank_p2p_bad","mobileNobankP2PBad");
			TRANSMAP.put("sl_cell_nbank_p2p_overdue","mobileNobankP2POverdue");
			TRANSMAP.put("sl_cell_nbank_p2p_fraud","mobileNobankP2PFraud");
			TRANSMAP.put("sl_cell_nbank_p2p_lost","mobileNobankP2PLost");
			TRANSMAP.put("sl_cell_nbank_p2p_refuse","mobileNobankP2PRefuse");
			TRANSMAP.put("sl_cell_nbank_mc_bad","mobileNobankMicroloanBad");
			TRANSMAP.put("sl_cell_nbank_mc_overdue","mobileNobankMicroloanOverdue");
			TRANSMAP.put("sl_cell_nbank_mc_fraud","mobileNobankMicroloanFraud");
			TRANSMAP.put("sl_cell_nbank_mc_lost","mobileNobankMicroloanLost");
			TRANSMAP.put("sl_cell_nbank_mc_refuse","mobileNobankMicroloanRefuse");
			TRANSMAP.put("sl_cell_nbank_ca_bad","mobileNobankCashBad");
			TRANSMAP.put("sl_cell_nbank_ca_overdue","mobileNobankCashOverdue");
			TRANSMAP.put("sl_cell_nbank_ca_fraud","mobileNobankCashFraud");
			TRANSMAP.put("sl_cell_nbank_ca_lost","mobileNobankCashLost");
			TRANSMAP.put("sl_cell_nbank_ca_refuse","mobileNobankCashRefuse");
			TRANSMAP.put("sl_cell_nbank_com_bad","mobileNobankComBad");
			TRANSMAP.put("sl_cell_nbank_com_overdue","mobileNobankComOverdue");
			TRANSMAP.put("sl_cell_nbank_com_fraud","mobileNobankComFraud");
			TRANSMAP.put("sl_cell_nbank_com_lost","mobileNobankComLost");
			TRANSMAP.put("sl_cell_nbank_com_refuse","mobileNobankComRefuse");
			TRANSMAP.put("sl_cell_nbank_cf_bad","mobileNobankComsumeBad");
			TRANSMAP.put("sl_cell_nbank_cf_overdue","mobileNobankComsumeOverdue");
			TRANSMAP.put("sl_cell_nbank_cf_fraud","mobileNobankComsumeFraud");
			TRANSMAP.put("sl_cell_nbank_cf_lost","mobileNobankComsumeFraud");
			TRANSMAP.put("sl_cell_nbank_cf_refuse","mobileNobankComsumeRefuse");
			TRANSMAP.put("sl_cell_nbank_other_bad","mobileNobankOtherBad");
			TRANSMAP.put("sl_cell_nbank_other_overdue","mobileNobankOtherOverdue");
			TRANSMAP.put("sl_cell_nbank_other_fraud","mobileNobankOtherFraud");
			TRANSMAP.put("sl_cell_nbank_other_lost","mobileNobankOtherLost");
			TRANSMAP.put("sl_cell_nbank_other_refuse","mobileNobankOtherRefuse");
		}
	}
	
	/**
	 * 常量类:百融媒体评估返回数据字典
	 * 
	 * @author Fangx
	 * 
	 */
	public static class Credit100StabilityConstant{
		/**
		 * 接口核查结果:没有查得相关数据
		 */
		public static final String RESULT_FLAG_NOT_HIT = "0";
		/**
		 * 接口核查结果:输出成功
		 */
		public static final String RESULT_FLAG_HIT = "1";
		/**
		 * 接口核查结果:是否有记录
		 */
		public static final String RESULT_FLAG = "result_flag";
		/**
		 * 接口返回数据：匹配结果字典值转换
		 */
		public static final Map<String,String> DICT_MATCH_HIT = new HashMap<String, String>();
		/**
		 * 接口返回数据：关系匹配结果字典值转换
		 */
		public static final Map<String,String> DICT_RELATION_MATCH_HIT = new HashMap<String, String>();
		/**
		 * 接口返回结果值转换
		 */
		public static final Map<String,String> MAP = new HashMap<String, String>();
		/**
		 * 接口返回key值转换
		 */
		public static final Map<String,String> TRANSMAP = new HashMap<String, String>();
		
		static{
			MAP.put(RESULT_FLAG_NOT_HIT, "没有查得相关数据记录");
			MAP.put(RESULT_FLAG_HIT, "输出成功");
			
			TRANSMAP.put("result_flag", "outDataFlag");
			TRANSMAP.put("stab_auth_id","authIdcard");
			TRANSMAP.put("stab_auth_cell","authMobile");
			TRANSMAP.put("stab_auth_mail","authMail");
			TRANSMAP.put("stab_auth_key_relation","authKey");
			TRANSMAP.put("stab_auth_home_tel","authHomeTel");
			TRANSMAP.put("stab_auth_biz_tel","authBizTel");
			TRANSMAP.put("stab_auth_name","authName");
			TRANSMAP.put("stab_auth_id_name","authIdcardName");
			TRANSMAP.put("stab_id_num","idcardNum");
			TRANSMAP.put("stab_cell_firsttime","firstMobileDate");
			TRANSMAP.put("stab_cell_num","mobileNum");
			TRANSMAP.put("stab_mail_num","mailNum");
			TRANSMAP.put("stab_name_num","nameNum");
			TRANSMAP.put("stab_tel_num","telNum");
			TRANSMAP.put("stab_addr_num","addrNum");
			
			DICT_MATCH_HIT.put("0", "匹配失败");
			DICT_MATCH_HIT.put("1", "匹配成功");
			DICT_MATCH_HIT.put("9", "匹配失败、未知");
			
			DICT_RELATION_MATCH_HIT.put("000", "手机邮箱身份证未关联");
			DICT_RELATION_MATCH_HIT.put("001", "身份证手机未关联,身份证邮箱未关联,手机邮箱关联");
			DICT_RELATION_MATCH_HIT.put("010", "身份证手机未关联,身份证邮箱关联,手机邮箱未关联");
			DICT_RELATION_MATCH_HIT.put("011", "身份证手机未关联,身份证邮箱关联,手机邮箱关联");
			DICT_RELATION_MATCH_HIT.put("100", "身份证手机关联,身份证邮箱未关联,手机邮箱未关联");
			DICT_RELATION_MATCH_HIT.put("101", "身份证手机关联,身份证邮箱未关联,手机邮箱关联");
			DICT_RELATION_MATCH_HIT.put("110", "身份证手机关联,身份证邮箱关联,手机邮箱未关联");
			DICT_RELATION_MATCH_HIT.put("111", "手机,邮箱,身份证关联");
		}
	}
}
