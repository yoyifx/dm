package cn.datawe.bean;

import java.util.List;

import cn.datawe.util.ValidatorUtil;

import com.lrt.framework.core.pojos.PrintableAndSerializeableDTO;

/**
 * 封装调用鹏元征信接口的请求信息
 * 
 * @author LiuJiaLe
 *
 */
public class PYCreditRequest extends PrintableAndSerializeableDTO {

	private static final long serialVersionUID = -5115023845378067023L;

	/**
	 * 接口编号
	 */
	private String interfaceID;

	/**
	 * 查询类型
	 */
	private String queryType;

	/**
	 * 请求参数列表
	 */
	private List<RequestParam> requestParamList;

	public String getInterfaceID() {
		return interfaceID;
	}

	public void setInterfaceID(String interfaceID) {
		this.interfaceID = interfaceID;
	}

	public String getQueryType() {
		return queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public List<RequestParam> getRequestParamList() {
		return requestParamList;
	}

	public void setRequestParamList(List<RequestParam> requestParamList) {
		this.requestParamList = requestParamList;
	}
	
	public String createRequestXML() {

		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version=\"1.0\" encoding=\"GBK\"?>\n");
		sb.append("<conditions>\n");
		sb.append("<condition");
		if (ValidatorUtil.isNotEmptyIgnoreBlank(this.getInterfaceID())) {

			sb.append(" interfaceId=\"").append(this.getInterfaceID()).append("\"");
		}
		if (ValidatorUtil.isNotEmptyIgnoreBlank(this.getQueryType())) {

			sb.append(" queryType=\"").append(this.getQueryType()).append("\"");
		}
		sb.append(">\n");
		List<RequestParam> requestParamList = this.getRequestParamList();
		for (RequestParam requestParam : requestParamList) {

			if (requestParam.isIgnoreEmpty() && ValidatorUtil.isEmptyIgnoreBlank(requestParam.getContent())) {

				continue;
			}
			sb.append("<item>\n");
			sb.append("<name>").append(requestParam.getName()).append("</name>\n");// 查询条件名称
			sb.append("<value>").append(requestParam.getContent()).append("</value>\n");// 查询条件值
			sb.append("</item>\n");
		}
		sb.append("</condition>\n");
		sb.append("</conditions>\n");
		return sb.toString();
	}
}
