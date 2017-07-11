package cn.datawe.constant;

/**
 * 枚举类:星期
 * 
 * @author LiuJiaLe
 * 
 */
public enum WeekEnum {

	MONDAY("星期一", "周一", "Monday", "Mon.", 1),
	TUESDAY("星期二", "周二", "Tuesday", "Tues.", 2),
	WEDNESDAY("星期三", "周三", "Wednesday", "Wed.", 3),
	THURSDAY("星期四", "周四", "Thursday", "Thur.", 4),
	FRIDAY("星期五", "周五", "Friday", "Fri.", 5),
	SATURDAY("星期六", "周六", "Saturday", "Sat.", 6),
	SUNDAY("星期日", "周末", "Sunday", "Sun.", 7);

	private String cnName;
	private String cnShortName;
	private String enName;
	private String enShortName;
	private int number;

	private WeekEnum(String cnName, String cnShortName, String enName, String enShortName, int number) {
		this.cnName = cnName;
		this.cnShortName = cnShortName;
		this.enName = enName;
		this.enShortName = enShortName;
		this.number = number;
	}

	public String getCnName() {
		return cnName;
	}

	public String getCnShortName() {
		return cnShortName;
	}

	public String getEnName() {
		return enName;
	}

	public String getEnShortName() {
		return enShortName;
	}

	public int getNumber() {
		return number;
	}
}
