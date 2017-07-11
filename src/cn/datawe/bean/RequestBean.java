package cn.datawe.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import cn.datawe.constant.CommonConstant;
import cn.datawe.util.ServletUtil;
import cn.datawe.util.ValidatorUtil;

import com.lrt.framework.core.pojos.PrintableAndSerializeableDTO;

/**
 * 请求Bean
 * 
 * @author LiuJiaLe
 * 
 */
public class RequestBean extends PrintableAndSerializeableDTO {

	private static final long serialVersionUID = 1L;

	private Map<Object, Object> param;

	public RequestBean() {
		super();
	}

	public RequestBean(HttpServletRequest request) {
		super();
		try {
			
			List<AttachmentBean> attachmentList = new ArrayList<AttachmentBean>();
			request.setCharacterEncoding(CommonConstant.CHARSET);
			param = ServletUtil.paramToMap(request);
			if (ValidatorUtil.isNotEmpty(attachmentList)) {

				StringBuilder sb = new StringBuilder();
				sb.append("[");
				for (AttachmentBean attachment : attachmentList) {
					sb.append(attachment.toString());
					sb.append(",");
				}
				sb.deleteCharAt(sb.length() - 1);
				sb.append("]");
				param.put("attachmentList", sb.toString());
			}
		} catch (Exception e) {
			
			throw new RuntimeException("create RequestBean error");
		}
	}

	public Map<Object, Object> getParam() {
		return param;
	}

	public void setParam(Map<Object, Object> param) {
		this.param = param;
	}
}
