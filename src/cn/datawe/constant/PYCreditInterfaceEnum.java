package cn.datawe.constant;

/**
 * 枚举类:鹏元征信接口信息
 * 
 * @author LiuJiaLe
 * 
 */
public enum PYCreditInterfaceEnum {
	
	/**个人身份认证*/
	ITEM0("个人身份认证", "25160", "10604", "101"),
	
	/**企业经营分析*/
	ITEM1("企业经营分析", "25123", "95059", "101"),
	
	/**企业基本信息查询*/
	ITEM2("企业基本信息", "25123", "95013", "101"),
	
	/**企业经营指数*/
	ITEM3("企业经营指数", "25123", "22301", "101"),
	
	/**个人风险信息*/
	ITEM4("个人风险信息", "25136", "14221", "101"),
	
	/**企业固话反查*/
	ITEM5("企业固话反查", "25129", "21603", "101"),
	;

	private String name;// 接口名称
	private String queryType;// 查询类型
	private String subReportID;// 收费子报告ID
	private String queryReasonID;// 查询原因ID

	private PYCreditInterfaceEnum(String name, String queryType, String subReportID, String queryReasonID) {
		this.name = name;
		this.queryType = queryType;
		this.subReportID = subReportID;
		this.queryReasonID = queryReasonID;
	}
	
	public String getName() {
		return name;
	}

	public String getQueryType() {
		return queryType;
	}

	public String getSubReportID() {
		return subReportID;
	}

	public String getQueryReasonID() {
		return queryReasonID;
	}
}
