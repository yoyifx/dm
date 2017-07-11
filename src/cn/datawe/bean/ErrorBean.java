package cn.datawe.bean;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.lrt.framework.core.pojos.PrintableAndSerializeableDTO;

/**
 * 
 * @author LiuJiaLe
 * 
 */
public class ErrorBean extends PrintableAndSerializeableDTO {

	private static final long serialVersionUID = 1L;

	private HttpStatus status;
	private String code;
	private String message;
	private List<FieldErrorBean> fieldErrors;

	public ErrorBean() {
	}
	
	public ErrorBean(HttpStatus status, String code, List<FieldErrorBean> fieldErrors) {
		this.status = status;
		this.code = code;
		this.fieldErrors = fieldErrors;
	}

	public ErrorBean(HttpStatus status, String code, String message, List<FieldErrorBean> fieldErrors) {
		this.status = status;
		this.code = code;
		this.message = message;
		this.fieldErrors = fieldErrors;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<FieldErrorBean> getFieldErrors() {
		return fieldErrors;
	}

	public void setFieldErrors(List<FieldErrorBean> fieldErrors) {
		this.fieldErrors = fieldErrors;
	}
}
