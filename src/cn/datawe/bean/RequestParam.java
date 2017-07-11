package cn.datawe.bean;

import cn.datawe.util.ValidatorUtil;

/**
 * 请求参数
 * 
 * @author LiuJiaLe
 *
 */
public class RequestParam {

	/**
	 * 参数名称
	 */
	private String name; 

	/**
	 * 参数内容
	 */
	private String content;
	
	/**
	 * 是否忽略参数内容为空的
	 */
	private boolean isIgnoreEmpty;
	
	public RequestParam() {
		super();
	}
	
	public RequestParam(String name, Object content) {
		super();
		this.name = name;
		this.content = String.valueOf(content);
	}
	
	public RequestParam(String name, Object content, boolean isIgnoreEmpty) {
		super();
		this.name = name;
		this.content = String.valueOf(content);
		this.isIgnoreEmpty = isIgnoreEmpty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return ValidatorUtil.isEmptyIgnoreBlank(content) ? "" : content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isIgnoreEmpty() {
		return isIgnoreEmpty;
	}

	public void setIgnoreEmpty(boolean isIgnoreEmpty) {
		this.isIgnoreEmpty = isIgnoreEmpty;
	}
}
