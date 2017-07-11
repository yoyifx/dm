package cn.datawe.constant;

import cn.datawe.util.ValidatorUtil;

/**
 * 枚举：城市等级分类
 * @author   ChenYunyu
 * @version  1.0
 * @since    v1.0
 * @Date     2017-7-4下午4:13:45
 */
public enum CityTypeEnum {
	ITEM110000("110000", "北京","市","1"),
	ITEM310000("310000", "上海","市","1"),
	ITEM440100("440100", "广州","市","1"),
	ITEM440300("440300", "深圳","市","1"),
	
	ITEM510100("510100", "成都", "市", "2"),
	ITEM330100("330100", "杭州", "市", "2"),
	ITEM420100("420100", "武汉", "市", "2"),
	ITEM500000("500000", "重庆", "市", "2"),
	ITEM320100("320100", "南京", "市", "2"),
	ITEM120000("120000", "天津", "市", "2"),
	ITEM320500("320500", "苏州", "市", "2"),
	ITEM610100("610100", "西安", "市", "2"),
	ITEM430100("430100", "长沙", "市", "2"),
	ITEM210100("210100", "沈阳", "市", "2"),
	ITEM370200("370200", "青岛", "市", "2"),
	ITEM410100("410100", "郑州", "市", "2"),
	ITEM210200("210200", "大连", "市", "2"),
	ITEM441900("441900", "东莞", "市", "2"),
	ITEM330200("330200", "宁波", "市", "2"),
	ITEM350200("350200", "厦门", "市", "2"),
	ITEM350100("350100", "福州", "市", "2"),
	ITEM320200("320200", "无锡", "市", "2"),
	ITEM340100("340100", "合肥", "市", "2"),
	ITEM530100("530100", "昆明", "市", "2"),
	ITEM230100("230100", "哈尔滨", "市", "2"),
	ITEM370100("370100", "济南", "市", "2"),
	ITEM440600("440600", "佛山", "市", "2"),
	ITEM220100("220100", "长春", "市", "2"),
	ITEM330300("330300", "温州", "市", "2"),
	ITEM130100("130100", "石家庄", "市", "2"),
	ITEM450100("450100", "南宁", "市", "2"),
	ITEM320400("320400", "常州", "市", "2"),
	ITEM350500("350500", "泉州", "市", "2"),
	ITEM360100("360100", "南昌", "市", "2"),
	ITEM520100("520100", "贵阳", "市", "2"),
	ITEM140100("140100", "太原", "市", "2"),
	ITEM370600("370600", "烟台", "市", "2"),
	ITEM330400("330400", "嘉兴", "市", "2"),
	ITEM320600("320600", "南通", "市", "2"),
	ITEM330700("330700", "金华", "市", "2"),
	ITEM440400("440400", "珠海", "市", "2"),
	ITEM441300("441300", "惠州", "市", "2"),
	ITEM320300("320300", "徐州", "市", "2"),
	ITEM460100("460100", "海口", "市", "2"),
	ITEM650100("650100", "乌鲁木齐", "市", "2"),
	ITEM330600("330600", "绍兴", "市", "2"),
	ITEM442000("442000", "中山", "市", "2"),
	ITEM331000("331000", "台州", "市", "2"),
	ITEM620100("620100", "兰州", "市", "2"),
	
	ITEM370700("370700", "潍坊", "市", "3"),
	ITEM130600("130600", "保定", "市", "3"),
	ITEM321100("321100", "镇江", "市", "3"),
	ITEM321000("321000", "扬州", "市", "3"),
	ITEM450300("450300", "桂林", "市", "3"),
	ITEM130200("130200", "唐山", "市", "3"),
	ITEM460200("460200", "三亚", "市", "3"),
	ITEM330500("330500", "湖州", "市", "3"),
	ITEM150100("150100", "呼和浩特", "市", "3"),
	ITEM131000("131000", "廊坊", "市", "3"),
	ITEM410300("410300", "洛阳", "市", "3"),
	ITEM371000("371000", "威海", "市", "3"),
	ITEM320900("320900", "盐城", "市", "3"),
	ITEM371300("371300", "临沂", "市", "3"),
	ITEM440700("440700", "江门", "市", "3"),
	ITEM440500("440500", "汕头", "市", "3"),
	ITEM321200("321200", "泰州", "市", "3"),
	ITEM350600("350600", "漳州", "市", "3"),
	ITEM130400("130400", "邯郸", "市", "3"),
	ITEM370800("370800", "济宁", "市", "3"),
	ITEM340200("340200", "芜湖", "市", "3"),
	ITEM370300("370300", "淄博", "市", "3"),
	ITEM640100("640100", "银川", "市", "3"),
	ITEM450200("450200", "柳州", "市", "3"),
	ITEM510700("510700", "绵阳", "市", "3"),
	ITEM440800("440800", "湛江", "市", "3"),
	ITEM210300("210300", "鞍山", "市", "3"),
	ITEM360700("360700", "赣州", "市", "3"),
	ITEM230600("230600", "大庆", "市", "3"),
	ITEM420500("420500", "宜昌", "市", "3"),
	ITEM150200("150200", "包头", "市", "3"),
	ITEM610400("610400", "咸阳", "市", "3"),
	ITEM130300("130300", "秦皇岛", "市", "3"),
	ITEM430200("430200", "株洲", "市", "3"),
	ITEM350300("350300", "莆田", "市", "3"),
	ITEM220200("220200", "吉林", "市", "3"),
	ITEM320800("320800", "淮安", "市", "3"),
	ITEM441200("441200", "肇庆", "市", "3"),
	ITEM350900("350900", "宁德", "市", "3"),
	ITEM430400("430400", "衡阳", "市", "3"),
	ITEM350700("350700", "南平", "市", "3"),
	ITEM320700("320700", "连云港", "市", "3"),
	ITEM210600("210600", "丹东", "市", "3"),
	ITEM530700("530700", "丽江", "市", "3"),
	ITEM445200("445200", "揭阳", "市", "3"),
	ITEM222400("222400", "延边朝鲜族", "自治州", "3"),
	ITEM330900("330900", "舟山", "市", "3"),
	ITEM360400("360400", "九江", "市", "3"),
	ITEM350800("350800", "龙岩", "市", "3"),
	ITEM130900("130900", "沧州", "市", "3"),
	ITEM210400("210400", "抚顺", "市", "3"),
	ITEM420600("420600", "襄阳", "市", "3"),
	ITEM361100("361100", "上饶", "市", "3"),
	ITEM210800("210800", "营口", "市", "3"),
	ITEM350400("350400", "三明", "市", "3"),
	ITEM340300("340300", "蚌埠", "市", "3"),
	ITEM331100("331100", "丽水", "市", "3"),
	ITEM430600("430600", "岳阳", "市", "3"),
	ITEM441800("441800", "清远", "市", "3"),
	ITEM421000("421000", "荆州", "市", "3"),
	ITEM370900("370900", "泰安", "市", "3"),
	ITEM330800("330800", "衢州", "市", "3"),
	ITEM211100("211100", "盘锦", "市", "3"),
	ITEM370500("370500", "东营", "市", "3"),
	ITEM411300("411300", "南阳", "市", "3"),
	ITEM340500("340500", "马鞍山", "市", "3"),
	ITEM511300("511300", "南充", "市", "3"),
	ITEM630100("630100", "西宁", "市", "3"),
	ITEM420900("420900", "孝感", "市", "3"),
	ITEM230200("230200", "齐齐哈尔", "市", "3");
	
	private String code;// 城市行政区号
	private String city;// 城市名称
	private String cityType;// 城市行政区划类型
	private String leval;// 城市级别

	private CityTypeEnum(String code, String city, String cityType, String leval) {
		this.code = code;
		this.city = city;
		this.cityType = cityType;
		this.leval = leval;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLeval() {
		return leval;
	}

	public void setLeval(String leval) {
		this.leval = leval;
	}

	public String getCityType() {
		return cityType;
	}

	public void setCityType(String cityType) {
		this.cityType = cityType;
	}

	public static String getCode(String city) {

		if (ValidatorUtil.isNotEmptyIgnoreBlank(city)) {

			for (CityTypeEnum e : CityTypeEnum.values()) {

				if (city.equals(e.getCity())) {

					return e.getCode();
				}
			}
		}
		return null;
	}

	public static String getCity(String code) {

		if (ValidatorUtil.isNotEmptyIgnoreBlank(code)) {

			for (CityTypeEnum e : CityTypeEnum.values()) {

				if (code.equals(e.getCode())) {

					return e.getCity();
				}
			}
		}
		return null;
	}

	public static String getFullCity(String code) {

		if (ValidatorUtil.isNotEmptyIgnoreBlank(code)) {

			for (CityTypeEnum e : CityTypeEnum.values()) {

				if (code.equals(e.getCode())) {

					return e.getCity().concat(e.getCityType());
				}
			}
		}
		return null;
	}

	public static String getCityLeval(String code) {

		if (ValidatorUtil.isNotEmptyIgnoreBlank(code)) {

			for (CityTypeEnum e : CityTypeEnum.values()) {

				if (code.equals(e.getCode())) {

					return e.getLeval();
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(CityTypeEnum.getCityLeval("211100"));
	}
	
}
