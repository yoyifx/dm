package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 常量类:远程接口来源
 * 
 * @author LiuJiaLe
 * 
 */
public class RemoteSourceConstant {

	/**
	 * NCIIC
	 */
	public static final String NCIIC = "100";

	/**
	 * 鹏元征信
	 */
	public static final String PYCREDIT = "101";

	/**
	 * 百融金服
	 */
	public static final String CREDIT100 = "102";

	/**
	 * 达飞用户中心
	 */
	public static final String DAFYUCENTER = "103";

	/**
	 * 前海征信
	 */
	public static final String PINGAN = "104";

	/**
	 * 增信通
	 */
	public static final String CREDITTONE = "105";

	/**
	 * 魔蝎数据
	 */
	public static final String MOXIE = "106";

	/**
	 * 数据堂
	 */
	public static final String DATATANG = "107";

	/**
	 * 汇法网
	 */
	public static final String LAWXP = "108";

	/**
	 * 融360
	 */
	public static final String RONG360 = "109";

	/**
	 * 邦盛金融
	 */
	public static final String BSFIT = "110";

	/**
	 * 小视科技
	 * */
	public static final String MINIVISION = "111";

	/**
	 * 同程金服
	 * */
	public static final String LY = "112";

	/**
	 * 达飞
	 * */
	public static final String DAFY = "113";

	/**
	 * 前海数维
	 * */
	public static final String DATAWE = "114";

	/**
	 * 葫芦数据
	 * */
	public static final String HULUSHUJU = "115";
	
	/**
	 * 业务数据
	 * */
	public static final String BUSIDATA = "200";

	/**
	 * 特征数据
	 * */
	public static final String FEATURE_DATA = "300";

	public static final Map<String, String> MAP = new HashMap<String, String>();
	static {
		MAP.put(NCIIC, "NCIIC");
		MAP.put(PYCREDIT, "鹏元征信");
		MAP.put(CREDIT100, "百融金服");
		MAP.put(DAFYUCENTER, "达飞用户中心");
		MAP.put(PINGAN, "前海征信");
		MAP.put(CREDITTONE, "增信通");
		MAP.put(MOXIE, "魔蝎数据");
		MAP.put(DATATANG, "数据堂");
		MAP.put(RONG360, "融360");
		MAP.put(BSFIT, "邦盛金融");
		MAP.put(MINIVISION, "小视科技");
		MAP.put(LY, "同程金服");
		MAP.put(DAFY, "达飞");
		MAP.put(DATAWE, "前海数维");
		MAP.put(HULUSHUJU, "葫芦数据");
		MAP.put(BUSIDATA, "业务数据");
		MAP.put(FEATURE_DATA, "特征数据");
	}
}
