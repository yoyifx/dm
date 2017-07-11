package cn.datawe.util;

import java.util.Map;

import cn.datawe.constant.ChinaCentralAreaCodeEnum;
import cn.datawe.constant.ChinaEastAreaCodeEnum;
import cn.datawe.constant.ChinaNorthAreaCodeEnum;
import cn.datawe.constant.ChinaNortheastAreaCodeEnum;
import cn.datawe.constant.ChinaNorthwestAreaCodeEnum;
import cn.datawe.constant.ChinaSouthAreaCodeEnum;
import cn.datawe.constant.ChinaSouthwestAreaCodeEnum;

/**
 * 工具类:行政区划
 * 
 * <p>注意：根据中国最新版的行政区划数据字典匹配结果，不向下兼容已废弃或已更名的行政区划</p>
 * 
 * @author LiuJiaLe
 *
 */
public final class AreaUtil {
	
	/**
	 * 判断是否为行政区划代码
	 * 
	 * @param code
	 * @return
	 */
	public static boolean isCode(String code) {
		
		return !isNotCode(code);
	}
	
	/**
	 * 判断是否不为行政区划代码
	 * 
	 * @param code
	 * @return
	 */
	public static boolean isNotCode(String code) {
		
		return null == getName(code);
	}
	
	/**
	 * 根据行政区划名称或代码获取第一级的行政区划代码(省、自治区、直辖市)
	 * 
	 * @param str
	 * @return
	 */
	public static String getFirstCode(String str) {
		
		return null;
	}
	
	/**
	 * 获取最末级的行政区划代码
	 * 
	 * @param name
	 * @return
	 */
	public static String getCode(String name) {
		
		String code = ChinaCentralAreaCodeEnum.getCode(name);
		if (null == code) {
			
			code = ChinaEastAreaCodeEnum.getCode(name);
		}
		if (null == code) {
			
			code = ChinaNorthAreaCodeEnum.getCode(name);
		}
		if (null == code) {
			
			code = ChinaNortheastAreaCodeEnum.getCode(name);
		}
		if (null == code) {
			
			code = ChinaNorthwestAreaCodeEnum.getCode(name);
		}
		if (null == code) {
			
			code = ChinaSouthAreaCodeEnum.getCode(name);
		}
		return null == code ? ChinaSouthwestAreaCodeEnum.getCode(name) : code;
	}
	
	/**
	 * 模糊匹配最末级的行政区划代码
	 * 
	 * @param name
	 * @param isContains
	 * @return
	 */
	public static String matchCode(String name) {
		
		String code = ChinaCentralAreaCodeEnum.matchCode(name);
		if (null == code) {
			
			code = ChinaEastAreaCodeEnum.matchCode(name);
		}
		if (null == code) {
			
			code = ChinaNorthAreaCodeEnum.matchCode(name);
		}
		if (null == code) {
			
			code = ChinaNortheastAreaCodeEnum.matchCode(name);
		}
		if (null == code) {
			
			code = ChinaNorthwestAreaCodeEnum.matchCode(name);
		}
		if (null == code) {
			
			code = ChinaSouthAreaCodeEnum.matchCode(name);
		}
		return null == code ? ChinaSouthwestAreaCodeEnum.matchCode(name) : code;
	}
	
	/**
	 * 模糊匹配最末级的行政区划代码
	 * 
	 * @param name
	 * @return
	 */
	public static Map<Object, Object> matchResult(String name) {
		
		return getResult(matchCode(name));
	}

	/**
	 * 获取行政区划名称
	 * 
	 * @param code
	 * @return
	 */
	public static String getName(String code) {
		
		String name = ChinaCentralAreaCodeEnum.getName(code);
		if (null == name) {
			
			name = ChinaEastAreaCodeEnum.getName(code);
		}
		if (null == name) {
			
			name = ChinaNorthAreaCodeEnum.getName(code);
		}
		if (null == name) {
			
			name = ChinaNortheastAreaCodeEnum.getName(code);
		}
		if (null == name) {
			
			name = ChinaNorthwestAreaCodeEnum.getName(code);
		}
		if (null == name) {
			
			name = ChinaSouthAreaCodeEnum.getName(code);
		}
		return null == name ? ChinaSouthwestAreaCodeEnum.getName(code) : name;
	}
	
	/**
	 * 获取行政区划名称(包含省市区)
	 * 
	 * @param code
	 * @return
	 */
	public static String getFullName(String code) {
		
		String fullName = ChinaCentralAreaCodeEnum.getFullName(code);
		if (null == fullName) {
			
			fullName = ChinaEastAreaCodeEnum.getFullName(code);
		}
		if (null == fullName) {
			
			fullName = ChinaNorthAreaCodeEnum.getFullName(code);
		}
		if (null == fullName) {
			
			fullName = ChinaNortheastAreaCodeEnum.getFullName(code);
		}
		if (null == fullName) {
			
			fullName = ChinaNorthwestAreaCodeEnum.getFullName(code);
		}
		if (null == fullName) {
			
			fullName = ChinaSouthAreaCodeEnum.getFullName(code);
		}
		return null == fullName ? ChinaSouthwestAreaCodeEnum.getFullName(code) : fullName;
	}
	
	/**
	 * 获取行政区划结果(包含所有信息)
	 * 
	 * @param code
	 * @return
	 */
	public static Map<Object, Object> getResult(String code) {
		
		Map<Object, Object> map = ChinaCentralAreaCodeEnum.getResult(code);
		if (null == map) {
			
			map = ChinaEastAreaCodeEnum.getResult(code);
		}
		if (null == map) {
			
			map = ChinaNorthAreaCodeEnum.getResult(code);
		}
		if (null == map) {
			
			map = ChinaNortheastAreaCodeEnum.getResult(code);
		}
		if (null == map) {
			
			map = ChinaNorthwestAreaCodeEnum.getResult(code);
		}
		if (null == map) {
			
			map = ChinaSouthAreaCodeEnum.getResult(code);
		}
		return null == map ? ChinaSouthwestAreaCodeEnum.getResult(code) : map;
	}
	
	private AreaUtil() {}
	
	public static void main(String[] args) {
		
		final String REGEX = "省|市|区|县";
		
		//String str = "湖南岳阳君山";
//		String str = "新疆和田地区和田市";
//		String ret = getCode(str);
//		System.out.println(ret);
//		ret = matchCode(str);
//		System.out.println(ret);
		
		String str = "山东省济南市槐荫区腊山路18-25号";
		String code = matchCode(str);
		System.out.println("code: " + code);
		Map<Object, Object> map = matchResult(str);
		System.out.println("map: " + map);
		
		
//		str = str.replaceAll("省|市|区|县", "");
//		str = str.replaceAll("(?s)(.)(?=.*\\1)", "");
//		System.out.println(str);
	}
}
