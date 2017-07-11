package cn.datawe.bean;

import com.lrt.framework.core.pojos.PrintableAndSerializeableDTO;

/**
 * 本地接口对象
 * 
 * @author YCZ
 * 
 */
public class LocalBean extends PrintableAndSerializeableDTO {
	private static final long serialVersionUID = 1L;

	/**
	 * 缓存天数
	 */
	private int expireDay;

	public LocalBean(int expireDay) {
		super();
		this.expireDay = expireDay;
	}

	public int getExpireDay() {
		return expireDay;
	}

	public void setExpireDay(int expireDay) {
		this.expireDay = expireDay;
	}

}
