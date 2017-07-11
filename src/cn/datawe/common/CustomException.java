package cn.datawe.common;

import cn.datawe.constant.ErrorCodeAdapter;
import cn.datawe.constant.ErrorCodeConstant;

/**
 * 自定义异常
 * 
 * @author LiuJiaLe
 * 
 */
public class CustomException extends Exception {

	private static final long serialVersionUID = 393503633600128297L;

	private String errorCode;

	private String errorMessage;

	public CustomException(String errorCode) throws RuntimeException {

		super();
		this.setErrorCode(errorCode);
		this.setErrorMessage(this.errorCode);
	}

	public CustomException(String errorCode, String errorMessage) {

		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {

		return errorCode;
	}

	@Override
	public String getMessage() {

		return this.errorMessage;
	}

	private void setErrorCode(String errorCode) throws RuntimeException {

		this.errorCode = ErrorCodeConstant.MAP.containsKey(errorCode) ? errorCode : ErrorCodeAdapter.to(errorCode);

		if (this.errorCode == null) {
			this.errorCode = ErrorCodeConstant.SYSTEM_ERROR;
		}
	}

	private void setErrorMessage(String errorCode) throws RuntimeException {
		this.errorMessage = ErrorCodeConstant.MAP.get(errorCode);

	}
}
