package cn.datawe.bean;

import com.lrt.framework.core.pojos.PrintableAndSerializeableDTO;

/**
 * 
 * @author LiuJiaLe
 * 
 */
public class FieldErrorBean extends PrintableAndSerializeableDTO {

	private static final long serialVersionUID = 1L;

	private String field;
	private Object rejectedValue;
	private String message;

	public FieldErrorBean() {
		super();
	}

	public FieldErrorBean(String field, Object rejectedValue, String message) {
		super();
		this.field = field;
		this.rejectedValue = rejectedValue;
		this.message = message;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Object getRejectedValue() {
		return rejectedValue;
	}

	public void setRejectedValue(Object rejectedValue) {
		this.rejectedValue = rejectedValue;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
