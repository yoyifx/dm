package cn.datawe.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 常量类:平安定义参数
 * 
 * @author Fangx
 * 
 */
public class PinganConstant {
	/**
	 * 接口类型:好信度查询
	 */
	public static final String INTERFACE_TYPE_CREDIT = "MSC8005";
	/**
	 * 接口类型:地址通查询
	 */
	public static final String INTERFACE_TYPE_ADDRESS = "MSC8007";
	/**
	 * 接口类型:风险度查询
	 */
	public static final String INTERFACE_TYPE_RISK = "MSC8036";
	/**
	 * 接口类型:风险度报送
	 */
	public static final String INTERFACE_TYPE_RISK_SUBMIT = "MSC9004";
	/**
	 * 接口类型:常贷客查询
	 */
	public static final String INTERFACE_TYPE_LOAN = "MSC8037";
	/**
	 * 接口类型:好信一鉴通V1.0
	 */
	public static final String INTERFACE_TYPE_VERIFY_CREDIT = "MSC8107";
	/**
	 * 接口类型:商户银行卡评分数据
	 */
	public static final String INTERFACE_TYPE_BANKCARDSCORE = "MSC8012";

	/**
	 * 产品id:好信度查询
	 */
	public static final String INTERFACE_PRODUCT_ID_CREDIT = "credoo";
	/**
	 * 产品id:地址通查询
	 */
	public static final String INTERFACE_PRODUCT_ID_ADDRESS = "address";
	/**
	 * 产品id:风险度查询
	 */
	public static final String INTERFACE_PRODUCT_ID_RISK = "rskdoo";
	/**
	 * 产品id:常贷客查询
	 */
	public static final String INTERFACE_PRODUCT_ID_LOAN = "loanee";
	/**
	 * 产品id:好信一鉴通V1.0
	 */
	public static final String INTERFACE_PRODUCT_ID_VERIFY_CREDIT = "eChkPkgs";
	/**
	 * 产品id:商户银行卡评分数据
	 */
	public static final String INTERFACE_PRODUCT_ID_BANKCARDSCORE = "ubzc2m";
	// /**
	// * 接口交易成功
	// */
	// public static final String RESPONSE_CODE_OK = "E000000";
	// /**
	// * 接口交易失败
	// */
	// public static final String RESPONSE_CODE_FAILTURE = "E000001";
	// /**
	// * 没有查询到数据
	// */
	// public static final String RESPONSE_CODE_NOT_FOUND = "E000996";
	/**
	 * 程序错误
	 */
	public static final String RESPONSE_CODE_ERROR = "100001";

	/**
	 * 查询原因:贷款审批
	 */
	public static final String QUERY_TYPE_AUDIT = "01";
	/**
	 * 查询原因:贷中管理
	 */
	public static final String QUERY_TYPE_IN_MANAGE = "02";
	/**
	 * 查询原因:贷后管理
	 */
	public static final String QUERY_TYPE_AFT_MANAGE = "03";
	/**
	 * 查询原因:本人查询
	 */
	public static final String QUERY_TYPE_SELF = "04";
	/**
	 * 查询原因:异议查询
	 */
	public static final String QUERY_TYPE_OBJECT = "05";
	/**
	 * 查询原因:其他
	 */
	public static final String QUERY_TYPE_OTHER = "99";

	/**
	 * 接口产品名称
	 */
	public static final Map<String, String> PROMAP = new HashMap<String, String>();
	static {
		// MAP.put(PinganConstant.RESPONSE_CODE_OK, "成功");
		// MAP.put(PinganConstant.RESPONSE_CODE_ERROR_SYSTEM, "程序错误");
	}

	/** 前海征信返回代码：交易成功 */
	public static final String RETURN_CODE_E000000 = "E000000";
	/** 前海征信返回代码：交易失败 */
	public static final String RETURN_CODE_E000001 = "E000001";
	/** 前海征信返回代码：productId或transName为空 */
	public static final String RETURN_CODE_E000002 = "E000002";
	/** 前海征信返回代码：apiVer为空 */
	public static final String RETURN_CODE_E000003 = "E000003";
	/** 前海征信返回代码：messageCode为空 */
	public static final String RETURN_CODE_E000004 = "E000004";
	/** 前海征信返回代码：请求的ContentType不支持 */
	public static final String RETURN_CODE_E000005 = "E000005";
	/** 前海征信返回代码：请求的内容为空 */
	public static final String RETURN_CODE_E000006 = "E000006";
	/** 前海征信返回代码：读取请求数据发生IO异常 */
	public static final String RETURN_CODE_E000007 = "E000007";
	/** 前海征信返回代码：securityInfo数据为空 */
	public static final String RETURN_CODE_E000008 = "E000008";
	/** 前海征信返回代码：用户名或密码为空 */
	public static final String RETURN_CODE_E000009 = "E000009";
	/** 前海征信返回代码：用户名或密码错误，认证失败 */
	public static final String RETURN_CODE_E000010 = "E000010";
	/** 前海征信返回代码：业务数据为空K */
	public static final String RETURN_CODE_E000011 = "E000011";
	/** 前海征信返回代码：业务数据签名发生异常 */
	public static final String RETURN_CODE_E000012 = "E000012";
	/** 前海征信返回代码：业务数据验签不通过 */
	public static final String RETURN_CODE_E000013 = "E000013";
	/** 前海征信返回代码：业务数据验签发生异常 */
	public static final String RETURN_CODE_E000014 = "E000014";
	/** 前海征信返回代码：未找到渠道信息 */
	public static final String RETURN_CODE_E000015 = "E000015";
	/** 前海征信返回代码：SHA1计算摘要异常 */
	public static final String RETURN_CODE_E000016 = "E000016";
	/** 前海征信返回代码：当前渠道不可用 */
	public static final String RETURN_CODE_E000017 = "E000017";
	/** 前海征信返回代码：虚拟用户非法 */
	public static final String RETURN_CODE_E000018 = "E000018";
	/** 前海征信返回代码：渠道没有查询该产品权限 */
	public static final String RETURN_CODE_E000019 = "E000019";
	/** 前海征信返回代码：授权码为空 */
	public static final String RETURN_CODE_E000020 = "E000020";
	/** 前海征信返回代码：虚拟密码不正确 */
	public static final String RETURN_CODE_E000021 = "E000021";
	/** 前海征信返回代码：报文头为空 */
	public static final String RETURN_CODE_E000022 = "E000022";
	/** 前海征信返回代码：orgCode值为空 */
	public static final String RETURN_CODE_E000023 = "E000023";
	/** 前海征信返回代码：chnlId值为空 */
	public static final String RETURN_CODE_E000024 = "E000024";
	/** 前海征信返回代码：transNo值为空 */
	public static final String RETURN_CODE_E000025 = "E000025";
	/** 前海征信返回代码：transDate值为空 */
	public static final String RETURN_CODE_E000026 = "E000026";
	/** 前海征信返回代码：authCode值为空 */
	public static final String RETURN_CODE_E000027 = "E000027";
	/** 前海征信返回代码：authDate值为空 */
	public static final String RETURN_CODE_E000028 = "E000028";
	/** 前海征信返回代码：未找到证书文件 */
	public static final String RETURN_CODE_E000029 = "E000029";
	/** 前海征信返回代码：获取公钥异常 */
	public static final String RETURN_CODE_E000030 = "E000030";
	/** 前海征信返回代码：未找到私钥文件 */
	public static final String RETURN_CODE_E000031 = "E000031";
	/** 前海征信返回代码：私钥算法异常 */
	public static final String RETURN_CODE_E000032 = "E000032";
	/** 前海征信返回代码：获取私钥异常 */
	public static final String RETURN_CODE_E000033 = "E000033";
	/** 前海征信返回代码：解密异常 */
	public static final String RETURN_CODE_E000034 = "E000034";
	/** 前海征信返回代码：加密异常 */
	public static final String RETURN_CODE_E000035 = "E000035";
	/** 前海征信返回代码：获取密钥失败 */
	public static final String RETURN_CODE_E000036 = "E000036";
	/** 前海征信返回代码：机构代码不存在 */
	public static final String RETURN_CODE_E000037 = "E000037";
	/** 前海征信返回代码：机构不可用 */
	public static final String RETURN_CODE_E000038 = "E000038";
	/** 前海征信返回代码：授权码格式非法 */
	public static final String RETURN_CODE_E000039 = "E000039";
	/** 前海征信返回代码：渠道没有查询该产品权限 */
	public static final String RETURN_CODE_E000040 = "E000040";
	/** 前海征信返回代码：数据包大小超限 */
	public static final String RETURN_CODE_E000041 = "E000041";
	/** 前海征信返回代码：交易请求记录数超限 */
	public static final String RETURN_CODE_E000042 = "E000042";
	/** 前海征信返回代码：查询名单记录集为空 */
	public static final String RETURN_CODE_E000043 = "E000043";
	/** 前海征信返回代码：HTTP响应状态码错误（statuscodeisnot200） */
	public static final String RETURN_CODE_E000044 = "E000044";
	/** 前海征信返回代码：HTTP连接超时 */
	public static final String RETURN_CODE_E000045 = "E000045";
	/** 前海征信返回代码：Socket连接超时 */
	public static final String RETURN_CODE_E000046 = "E000046";
	/** 前海征信返回代码：HTTP(s)请求IO错误 */
	public static final String RETURN_CODE_E000047 = "E000047";
	/** 前海征信返回代码：名单不存在 */
	public static final String RETURN_CODE_E000048 = "E000048";
	/** 前海征信返回代码：不支持HTTP请求 */
	public static final String RETURN_CODE_E000049 = "E000049";
	/** 前海征信返回代码：报送参数:seqNo为空或长度大于24 */
	public static final String RETURN_CODE_E000050 = "E000050";
	/** 前海征信返回代码：报送参数:idNo为空或长度大于128 */
	public static final String RETURN_CODE_E000051 = "E000051";
	/** 前海征信返回代码：报送参数:idType为空或长度大于1 */
	public static final String RETURN_CODE_E000052 = "E000052";
	/** 前海征信返回代码：报送参数:name为空或长度大于64 */
	public static final String RETURN_CODE_E000053 = "E000053";
	/** 前海征信返回代码：报送参数:money为空或长度大于24 */
	public static final String RETURN_CODE_E000054 = "E000054";
	/** 前海征信返回代码：报送参数:gradeReport为空或长度大于2 */
	public static final String RETURN_CODE_E000055 = "E000055";
	/** 前海征信返回代码：报送参数:updatedDate为空或格式不正确【格式：yyyy-MM-ddHH:mm:ss】 */
	public static final String RETURN_CODE_E000056 = "E000056";
	/** 前海征信返回代码：报送参数:cardNo为空或长度大于24 */
	public static final String RETURN_CODE_E000057 = "E000057";
	/** 前海征信返回代码：报送参数:qqNo为空或长度大于24 */
	public static final String RETURN_CODE_E000058 = "E000058";
	/** 前海征信返回代码：报送参数:phoneNo为空或长度大于16 */
	public static final String RETURN_CODE_E000059 = "E000059";
	/** 前海征信返回代码：报送参数:currency为空或长度大于3 */
	public static final String RETURN_CODE_E000060 = "E000060";
	/** 前海征信返回代码：报送参数:currency数据不正确 */
	public static final String RETURN_CODE_E000061 = "E000061";
	/** 前海征信返回代码：报送参数:gradeReport数据不正确 */
	public static final String RETURN_CODE_E000062 = "E000062";
	/** 前海征信返回代码：报送参数:idType数据不正确 */
	public static final String RETURN_CODE_E000063 = "E000063";
	/** 前海征信返回代码：报送参数:数据重复 */
	public static final String RETURN_CODE_E000064 = "E000064";
	/** 前海征信返回代码：来访IP未授权 */
	public static final String RETURN_CODE_E000065 = "E000065";
	/** 前海征信返回代码：批次号长度非法 */
	public static final String RETURN_CODE_E000066 = "E000066";
	/** 前海征信返回代码：MessageObjectisNull */
	public static final String RETURN_CODE_E000067 = "E000067";
	/** 前海征信返回代码：HeaderObjectisNull */
	public static final String RETURN_CODE_E000068 = "E000068";
	/** 前海征信返回代码：SecurityInfoObjectisNull */
	public static final String RETURN_CODE_E000069 = "E000069";
	/** 前海征信返回代码：参数[refId]不存在或者为空; */
	public static final String RETURN_CODE_E000070 = "E000070";
	/** 前海征信返回代码：参数[name]不存在或者为空; */
	public static final String RETURN_CODE_E000071 = "E000071";
	/** 前海征信返回代码：参数[idNo]不存在或者为空; */
	public static final String RETURN_CODE_E000072 = "E000072";
	/** 前海征信返回代码：参数[idNo]长度不合法; */
	public static final String RETURN_CODE_E000073 = "E000073";
	/** 前海征信返回代码：国政通处理出现异常 */
	public static final String RETURN_CODE_E000074 = "E000074";
	/** 前海征信返回代码：参数:orgCode为空或长度大于24 */
	public static final String RETURN_CODE_E000101 = "E000101";
	/** 前海征信返回代码：参数:chnlId为空或长度大于128 */
	public static final String RETURN_CODE_E000102 = "E000102";
	/** 前海征信返回代码：参数:transNo为空或长度大于24 */
	public static final String RETURN_CODE_E000103 = "E000103";
	/** 前海征信返回代码：参数:authCode[{机构授权码}]为空或长度大于16 */
	public static final String RETURN_CODE_E000104 = "E000104";
	/** 前海征信返回代码：参数:batchNo为空或长度大于32 */
	public static final String RETURN_CODE_E000105 = "E000105";
	/** 前海征信返回代码：参数:authCode[{{16位信息主体授权码}]为空或长度大于32 */
	public static final String RETURN_CODE_E000106 = "E000106";
	/** 前海征信返回代码：transNo已被使用 */
	public static final String RETURN_CODE_E000107 = "E000107";
	/** 前海征信返回代码：数据入库异常 */
	public static final String RETURN_CODE_E000888 = "E000888";
	/** 前海征信返回代码：没有查询到数据 */
	public static final String RETURN_CODE_E000996 = "E000996";
	/** 前海征信返回代码：交易异常 */
	public static final String RETURN_CODE_E000999 = "E000999";
	/** 前海征信返回代码：未找到交易服务资源 */
	public static final String RETURN_CODE_E000998 = "E000998";
	/** 前海征信返回代码：应用路由失败，交易请求未送达后台 */
	public static final String RETURN_CODE_E000997 = "E000997";
	/** 前海征信返回代码：日期（交易、授权）格式非法 */
	public static final String RETURN_CODE_E000100 = "E000100";
	/** 前海征信返回代码：认证失败系统ID不存在（系统ID非空校验） */
	public static final String RETURN_CODE_E100002 = "E100002";
	/** 前海征信返回代码：认证失败参数非法（用户、密码非空校验） */
	public static final String RETURN_CODE_E100003 = "E100003";
	/** 前海征信返回代码：认证失败-用户或密码错误 */
	public static final String RETURN_CODE_E100004 = "E100004";
	/** 前海征信返回代码：认证失败-接口未授权 */
	public static final String RETURN_CODE_E100005 = "E100005";
	/** 前海征信返回代码：查询操作超时 */
	public static final String RETURN_CODE_E900002 = "E900002";
	/** 前海征信返回代码：查询token失效 */
	public static final String RETURN_CODE_E900003 = "E900003";
	/** 前海征信返回代码：查询黑名单数据源未授权 */
	public static final String RETURN_CODE_E900004 = "E900004";
	/** 前海征信返回代码：查询接口未授权 */
	public static final String RETURN_CODE_E900005 = "E900005";
	/** 前海征信返回代码：查询超过每天调用次数 */
	public static final String RETURN_CODE_E900006 = "E900006";
	/** 前海征信返回代码：查询参数非法 */
	public static final String RETURN_CODE_E900007 = "E900007";
	/** 前海征信返回代码：查询入参个数超过限制 */
	public static final String RETURN_CODE_E900008 = "E900008";
	/** 前海征信返回代码：查询系统异常 */
	public static final String RETURN_CODE_E900009 = "E900009";
	/** 前海征信返回代码：授权码有效期已过有效截止日期[1] */
	public static final String RETURN_CODE_E000075 = "E000075";
	/** 前海征信返回代码：授权码有效期还未到有效开始日期[2] */
	public static final String RETURN_CODE_E000076 = "E000076";
	/** 前海征信返回代码：授权码有效期没有在有效开始日期与结束日期之间[3] */
	public static final String RETURN_CODE_E000077 = "E000077";
	/** 前海征信返回代码：授权码试用查询总笔数超限 */
	public static final String RETURN_CODE_E000078 = "E000078";
	/** 前海征信返回代码：请求的网络类型与申请类型不一致 */
	public static final String RETURN_CODE_E000079 = "E000079";
	/** 前海征信返回代码：当前渠道仅开通WEB查询权限，暂不支持API查询 */
	public static final String RETURN_CODE_E000080 = "E000080";
	/** 前海征信返回代码：存储报文发生异常 */
	public static final String RETURN_CODE_E000082 = "E000082";
	/** 前海征信返回代码：参数数据不正确(部分参数为空) */
	public static final String RETURN_CODE_E009999 = "E009999";
	/** 前海征信返回代码：您的用户信息错误（用户名不存在） */
	public static final String RETURN_CODE_E0_9998 = "E0-9998";
	/** 前海征信返回代码：您无权查询数据 */
	public static final String RETURN_CODE_E0_9997 = "E0-9997";
	/** 前海征信返回代码：参数请求数据过长 */
	public static final String RETURN_CODE_E0_9996 = "E0-9996";
	/** 前海征信返回代码：该产品已暂停使用 */
	public static final String RETURN_CODE_E0_9995 = "E0-9995";
	/** 前海征信返回代码：参数数据加密错误 */
	public static final String RETURN_CODE_E0_9994 = "E0-9994";
	/** 前海征信返回代码：系统异常 */
	public static final String RETURN_CODE_E00_990 = "E00-990";
	/** 前海征信返回代码：未查到数据 */
	public static final String RETURN_CODE_E0_9999 = "E0-9999";
	/** 前海征信返回代码：参数数据不正确(参数格式不正确) */
	public static final String RETURN_CODE_E0_9919 = "E0-9919";
	/** 前海征信返回代码：参数数据不正确(参数个数不正确) */
	public static final String RETURN_CODE_E0_9929 = "E0-9929";
	/** 前海征信返回代码：您无权查询数据(ip无权限) */
	public static final String RETURN_CODE_E0_9917 = "E0-9917";
	/** 前海征信返回代码：您无权查询数据(没有订购该产品) */
	public static final String RETURN_CODE_E0_9927 = "E0-9927";
	/** 前海征信返回代码：您无权查询数据(产品状态是开始状态) */
	public static final String RETURN_CODE_E0_9937 = "E0-9937";
	/** 前海征信返回代码：您无权查询数据(产品状态是暂停状态) */
	public static final String RETURN_CODE_E0_9947 = "E0-9947";
	/** 前海征信返回代码：您无权查询数据(产品状态是终止状态) */
	public static final String RETURN_CODE_E0_9957 = "E0-9957";
	/** 前海征信返回代码：您无权查询数据(测试量已经用完) */
	public static final String RETURN_CODE_E0_9967 = "E0-9967";
	/** 前海征信返回代码：您无权查询数据(账户余额不足) */
	public static final String RETURN_CODE_E0_9977 = "E0-9977";
	/** 前海征信返回代码：未配置数据来源 */
	public static final String RETURN_CODE_EN20001 = "EN20001";
	/** 前海征信返回代码：未配置识别码 */
	public static final String RETURN_CODE_EN20002 = "EN20002";
	/** 前海征信返回代码：未配置授权码 */
	public static final String RETURN_CODE_EN20003 = "EN20003";
	/** 前海征信返回代码：参数：证件号码不能为空 */
	public static final String RETURN_CODE_EN20004 = "EN20004";
	/** 前海征信返回代码：参数：主体名称不能为空 */
	public static final String RETURN_CODE_EN20005 = "EN20005";
	/** 前海征信返回代码：参数：查询原因不能为空 */
	public static final String RETURN_CODE_EN20006 = "EN20006";
	/** 前海征信返回代码：参数：比对相片不能为空 */
	public static final String RETURN_CODE_EN20007 = "EN20007";
	/** 前海征信返回代码：参数：行政区代码不能为空 */
	public static final String RETURN_CODE_EN20008 = "EN20008";
	/** 前海征信返回代码：参数：序列号不能为空 */
	public static final String RETURN_CODE_EN20009 = "EN20009";
	/** 前海征信返回代码：调用批量查询人脸比对信息接口出现异常 */
	public static final String RETURN_CODE_EN20010 = "EN20010";
	/** 前海征信返回代码：人脸比对接口返回的数据格式不对 */
	public static final String RETURN_CODE_EN20011 = "EN20011";
	/** 前海征信返回代码：解析返回的数据出现异常 */
	public static final String RETURN_CODE_EN20012 = "EN20012";
	/** 前海征信返回代码：实时批量查询公安部人脸比对信息出现异常 */
	public static final String RETURN_CODE_EN20013 = "EN20013";
	/** 前海征信返回代码：参数：批量请求数据不能为空 */
	public static final String RETURN_CODE_EN20014 = "EN20014";
	/** 前海征信返回代码：人脸比对报告待获取 */
	public static final String RETURN_CODE_EN00001 = "EN00001";
	/** 前海征信返回代码：人脸比对报告获取中 */
	public static final String RETURN_CODE_EN00002 = "EN00002";
	/** 前海征信返回代码：人脸比对报告待拆分 */
	public static final String RETURN_CODE_EN00003 = "EN00003";
	/** 前海征信返回代码：人脸比对报告拆分中 */
	public static final String RETURN_CODE_EN00004 = "EN00004";
	/** 前海征信返回代码：人脸比对报告拆分完成 */
	public static final String RETURN_CODE_EN00005 = "EN00005";
	/** 前海征信返回代码：人脸比对报告获取失败 */
	public static final String RETURN_CODE_EN00006 = "EN00006";
	/** 前海征信返回代码：人脸比对报告拆分失败 */
	public static final String RETURN_CODE_EN00007 = "EN00007";
	/** 前海征信返回代码：人脸比对报告复用报告 */
	public static final String RETURN_CODE_EN00009 = "EN00009";
	/** 前海征信返回代码：返回值JSON为NULL */
	public static final String RETURN_CODE_EU00001 = "EU00001";
	/** 前海征信返回代码：返回值DTO为NULL */
	public static final String RETURN_CODE_EU00002 = "EU00002";
	/** 前海征信返回代码：查询失败(error_code不为0) */
	public static final String RETURN_CODE_EU00003 = "EU00003";
	/** 前海征信返回代码：查询失败(reflect调用未通过安全授权) */
	public static final String RETURN_CODE_EU00004 = "EU00004";
	/** 前海征信返回代码：查询失败(开发包非法，未找到方法) */
	public static final String RETURN_CODE_EU00005 = "EU00005";
	/** 前海征信返回代码：交易失败(reflect参数非法) */
	public static final String RETURN_CODE_EU00006 = "EU00006";
	/** 前海征信返回代码：交易失败(reflect调用非法) */
	public static final String RETURN_CODE_EU00007 = "EU00007";
	/** 前海征信返回代码：交易失败(reflect调用目标非法) */
	public static final String RETURN_CODE_EU00008 = "EU00008";
	/** 前海征信返回代码：交易失败(不支持编码) */
	public static final String RETURN_CODE_EU00009 = "EU00009";
	/** 前海征信返回代码：返回报文key\value存在空节点 */
	public static final String RETURN_CODE_EZ00001 = "EZ00001";
	/** 前海征信返回代码：返回报文ORDERLIST节点空 */
	public static final String RETURN_CODE_EZ00002 = "EZ00002";
	/** 前海征信返回代码：返回报文BASIC节点空 */
	public static final String RETURN_CODE_EZ00003 = "EZ00003";
	/** 前海征信返回代码：返回报文非合法XML格式 */
	public static final String RETURN_CODE_EZ00004 = "EZ00004";
	/** 前海征信返回代码：marshal返回报文异常 */
	public static final String RETURN_CODE_EZ00005 = "EZ00005";
	/** 前海征信返回代码：上传文件失败 */
	public static final String RETURN_CODE_ETD0001 = "ETD0001";
	/** 前海征信返回代码：下载文件失败 */
	public static final String RETURN_CODE_ETD0002 = "ETD0002";
	/** 前海征信返回代码：模块L交易发生-1错误 */
	public static final String RETURN_CODE_EL000_1 = "EL000-1";
	/** 前海征信返回代码：模块L交易成功 */
	public static final String RETURN_CODE_EL00000 = "EL00000";
	/** 前海征信返回代码：模块L交易发生40001错误 */
	public static final String RETURN_CODE_EL40001 = "EL40001";
	/** 前海征信返回代码：模块L交易发生40002错误 */
	public static final String RETURN_CODE_EL40002 = "EL40002";
	/** 前海征信返回代码：模块L交易发生40003错误 */
	public static final String RETURN_CODE_EL40003 = "EL40003";
	/** 前海征信返回代码：模块L交易发生40004错误 */
	public static final String RETURN_CODE_EL40004 = "EL40004";
	/** 前海征信返回代码：模块L交易发生40005错误 */
	public static final String RETURN_CODE_EL40005 = "EL40005";
	/** 前海征信返回代码：模块L交易发生40006错误 */
	public static final String RETURN_CODE_EL40006 = "EL40006";
	/** 前海征信返回代码：模块L交易发生40007错误 */
	public static final String RETURN_CODE_EL40007 = "EL40007";
	/** 前海征信返回代码：模块L交易发生40400错误 */
	public static final String RETURN_CODE_EL40400 = "EL40400";
	/** 前海征信返回代码：模块L交易发生43001错误 */
	public static final String RETURN_CODE_EL43001 = "EL43001";
	/** 前海征信返回代码：模块L交易发生43002错误 */
	public static final String RETURN_CODE_EL43002 = "EL43002";
	/** 前海征信返回代码：模块L交易发生43003错误 */
	public static final String RETURN_CODE_EL43003 = "EL43003";
	/** 前海征信返回代码：模块L交易发生44000错误 */
	public static final String RETURN_CODE_EL44000 = "EL44000";
	/** 前海征信返回代码：模块L交易发生44001错误 */
	public static final String RETURN_CODE_EL44001 = "EL44001";
	/** 前海征信返回代码：模块L交易发生44002错误 */
	public static final String RETURN_CODE_EL44002 = "EL44002";
	/** 前海征信返回代码：模块L交易发生44003错误 */
	public static final String RETURN_CODE_EL44003 = "EL44003";
	/** 前海征信返回代码：模块L交易发生44004错误 */
	public static final String RETURN_CODE_EL44004 = "EL44004";
	/** 前海征信返回代码：模块L交易发生44005错误 */
	public static final String RETURN_CODE_EL44005 = "EL44005";
	/** 前海征信返回代码：模块L交易发生44006错误 */
	public static final String RETURN_CODE_EL44006 = "EL44006";
	/** 前海征信返回代码：模块L交易发生44007错误 */
	public static final String RETURN_CODE_EL44007 = "EL44007";
	/** 前海征信返回代码：模块L交易发生44008错误 */
	public static final String RETURN_CODE_EL44008 = "EL44008";
	/** 前海征信返回代码：模块L交易发生44009错误 */
	public static final String RETURN_CODE_EL44009 = "EL44009";
	/** 前海征信返回代码：模块L交易发生44206错误 */
	public static final String RETURN_CODE_EL44206 = "EL44206";
	/** 前海征信返回代码：模块L交易发生50001错误 */
	public static final String RETURN_CODE_EL50001 = "EL50001";
	/** 前海征信返回代码：模块L交易发生50002错误 */
	public static final String RETURN_CODE_EL50002 = "EL50002";
	/** 前海征信返回代码：模块L交易发生-9999错误 */
	public static final String RETURN_CODE_EL_9999 = "EL-9999";
	/** 前海征信返回代码：模块TR交易发生6000错误 */
	public static final String RETURN_CODE_ETR6000 = "ETR6000";
	/** 前海征信返回代码：模块TR交易发生3000错误 */
	public static final String RETURN_CODE_ETR3000 = "ETR3000";
	/** 前海征信返回代码：模块TR交易发生5000错误 */
	public static final String RETURN_CODE_ETR5000 = "ETR5000";
	/** 前海征信返回代码：处理中 */
	public static final String RETURN_CODE_E000990 = "E000990";
	/** 前海征信返回代码：同批次SeqNo必须唯一 */
	public static final String RETURN_CODE_E000991 = "E000991";
	/** 前海征信返回代码：通过CyberArk获取密钥发生异常 */
	public static final String RETURN_CODE_E000992 = "E000992";
	/** 前海征信返回代码：通过CyberArk获取的密钥为空 */
	public static final String RETURN_CODE_E000993 = "E000993";
	/** 前海征信返回代码：子产品信息为空或长度不为10 */
	public static final String RETURN_CODE_E000108 = "E000108";
	/** 前海征信返回代码：子产品信息格式非法 */
	public static final String RETURN_CODE_E000109 = "E000109";
	/** 前海征信返回代码：没有查询任何子产品权限 */
	public static final String RETURN_CODE_E000110 = "E000110";
	/** 前海征信返回代码：没有查询该子产品权限 */
	public static final String RETURN_CODE_E000111 = "E000111";
	/** 前海征信返回代码：'证件号码'校验不通过 */
	public static final String RETURN_CODE_E000112 = "E000112";
	/** 前海征信返回代码：模块TD交易发生100错误 */
	public static final String RETURN_CODE_ETD0100 = "ETD0100";
	/** 前海征信返回代码：模块TD交易发生400错误 */
	public static final String RETURN_CODE_ETD0400 = "ETD0400";
	/** 前海征信返回代码：模块TD交易发生401错误 */
	public static final String RETURN_CODE_ETD0401 = "ETD0401";
	/** 前海征信返回代码：模块TD交易发生403错误 */
	public static final String RETURN_CODE_ETD0403 = "ETD0403";
	/** 前海征信返回代码：模块TD交易发生404错误 */
	public static final String RETURN_CODE_ETD0404 = "ETD0404";
	/** 前海征信返回代码：模块TD交易发生405错误 */
	public static final String RETURN_CODE_ETD0405 = "ETD0405";
	/** 前海征信返回代码：模块TD交易发生410错误 */
	public static final String RETURN_CODE_ETD0410 = "ETD0410";
	/** 前海征信返回代码：系统交易发生E000113错误 */
	public static final String RETURN_CODE_E000113 = "E000113";

	/**
	 * 接口返回信息
	 */
	public static final Map<String, String> MAP = new HashMap<String, String>();

	static {
		MAP.put(RETURN_CODE_E000000, "交易成功");
		MAP.put(RETURN_CODE_E000001, "交易失败");
		MAP.put(RETURN_CODE_E000002, "productId或transName为空");
		MAP.put(RETURN_CODE_E000003, "apiVer为空");
		MAP.put(RETURN_CODE_E000004, "messageCode为空");
		MAP.put(RETURN_CODE_E000005, "请求的ContentType不支持");
		MAP.put(RETURN_CODE_E000006, "请求的内容为空");
		MAP.put(RETURN_CODE_E000007, "读取请求数据发生IO异常");
		MAP.put(RETURN_CODE_E000008, "securityInfo数据为空");
		MAP.put(RETURN_CODE_E000009, "用户名或密码为空");
		MAP.put(RETURN_CODE_E000010, "用户名或密码错误，认证失败");
		MAP.put(RETURN_CODE_E000011, "业务数据为空");
		MAP.put(RETURN_CODE_E000012, "业务数据签名发生异常");
		MAP.put(RETURN_CODE_E000013, "业务数据验签不通过");
		MAP.put(RETURN_CODE_E000014, "业务数据验签发生异常");
		MAP.put(RETURN_CODE_E000015, "未找到渠道信息");
		MAP.put(RETURN_CODE_E000016, "SHA1计算摘要异常");
		MAP.put(RETURN_CODE_E000017, "当前渠道不可用");
		MAP.put(RETURN_CODE_E000018, "虚拟用户非法");
		MAP.put(RETURN_CODE_E000019, "渠道没有查询该产品权限");
		MAP.put(RETURN_CODE_E000020, "授权码为空");
		MAP.put(RETURN_CODE_E000021, "虚拟密码不正确");
		MAP.put(RETURN_CODE_E000022, "报文头为空");
		MAP.put(RETURN_CODE_E000023, "orgCode值为空");
		MAP.put(RETURN_CODE_E000024, "chnlId值为空");
		MAP.put(RETURN_CODE_E000025, "transNo值为空");
		MAP.put(RETURN_CODE_E000026, "transDate值为空");
		MAP.put(RETURN_CODE_E000027, "authCode值为空");
		MAP.put(RETURN_CODE_E000028, "authDate值为空");
		MAP.put(RETURN_CODE_E000029, "未找到证书文件");
		MAP.put(RETURN_CODE_E000030, "获取公钥异常");
		MAP.put(RETURN_CODE_E000031, "未找到私钥文件");
		MAP.put(RETURN_CODE_E000032, "私钥算法异常");
		MAP.put(RETURN_CODE_E000033, "获取私钥异常");
		MAP.put(RETURN_CODE_E000034, "解密异常");
		MAP.put(RETURN_CODE_E000035, "加密异常");
		MAP.put(RETURN_CODE_E000036, "获取密钥失败");
		MAP.put(RETURN_CODE_E000037, "机构代码不存在");
		MAP.put(RETURN_CODE_E000038, "机构不可用");
		MAP.put(RETURN_CODE_E000039, "授权码格式非法");
		MAP.put(RETURN_CODE_E000040, "渠道没有查询该产品权限");
		MAP.put(RETURN_CODE_E000041, "数据包大小超限");
		MAP.put(RETURN_CODE_E000042, "交易请求记录数超限");
		MAP.put(RETURN_CODE_E000043, "查询名单记录集为空");
		MAP.put(RETURN_CODE_E000044, "HTTP响应状态码错误（statuscodeisnot200）");
		MAP.put(RETURN_CODE_E000045, "HTTP连接超时");
		MAP.put(RETURN_CODE_E000046, "Socket连接超时");
		MAP.put(RETURN_CODE_E000047, "HTTP(s)请求IO错误");
		MAP.put(RETURN_CODE_E000048, "名单不存在");
		MAP.put(RETURN_CODE_E000049, "不支持HTTP请求");
		MAP.put(RETURN_CODE_E000050, "报送参数:seqNo为空或长度大于24");
		MAP.put(RETURN_CODE_E000051, "报送参数:idNo为空或长度大于128");
		MAP.put(RETURN_CODE_E000052, "报送参数:idType为空或长度大于1");
		MAP.put(RETURN_CODE_E000053, "报送参数:name为空或长度大于64");
		MAP.put(RETURN_CODE_E000054, "报送参数:money为空或长度大于24");
		MAP.put(RETURN_CODE_E000055, "报送参数:gradeReport为空或长度大于2");
		MAP.put(RETURN_CODE_E000056, "报送参数:updatedDate为空或格式不正确【格式：yyyy-MM-ddHH:mm:ss】");
		MAP.put(RETURN_CODE_E000057, "报送参数:cardNo为空或长度大于24");
		MAP.put(RETURN_CODE_E000058, "报送参数:qqNo为空或长度大于24");
		MAP.put(RETURN_CODE_E000059, "报送参数:phoneNo为空或长度大于16");
		MAP.put(RETURN_CODE_E000060, "报送参数:currency为空或长度大于3");
		MAP.put(RETURN_CODE_E000061, "报送参数:currency数据不正确");
		MAP.put(RETURN_CODE_E000062, "报送参数:gradeReport数据不正确");
		MAP.put(RETURN_CODE_E000063, "报送参数:idType数据不正确");
		MAP.put(RETURN_CODE_E000064, "报送参数:数据重复");
		MAP.put(RETURN_CODE_E000065, "来访IP未授权");
		MAP.put(RETURN_CODE_E000066, "批次号长度非法");
		MAP.put(RETURN_CODE_E000067, "MessageObjectisNull");
		MAP.put(RETURN_CODE_E000068, "HeaderObjectisNull");
		MAP.put(RETURN_CODE_E000069, "SecurityInfoObjectisNull");
		MAP.put(RETURN_CODE_E000070, "参数[refId]不存在或者为空;");
		MAP.put(RETURN_CODE_E000071, "参数[name]不存在或者为空;");
		MAP.put(RETURN_CODE_E000072, "参数[idNo]不存在或者为空;");
		MAP.put(RETURN_CODE_E000073, "参数[idNo]长度不合法;");
		MAP.put(RETURN_CODE_E000074, "国政通处理出现异常");
		MAP.put(RETURN_CODE_E000101, "参数:orgCode为空或长度大于24");
		MAP.put(RETURN_CODE_E000102, "参数:chnlId为空或长度大于128");
		MAP.put(RETURN_CODE_E000103, "参数:transNo为空或长度大于24");
		MAP.put(RETURN_CODE_E000104, "参数:authCode[{机构授权码}]为空或长度大于16");
		MAP.put(RETURN_CODE_E000105, "参数:batchNo为空或长度大于32");
		MAP.put(RETURN_CODE_E000106, "参数:authCode[{{16位信息主体授权码}]为空或长度大于32");
		MAP.put(RETURN_CODE_E000107, "transNo已被使用");
		MAP.put(RETURN_CODE_E000888, "数据入库异常");
		MAP.put(RETURN_CODE_E000996, "没有查询到数据");
		MAP.put(RETURN_CODE_E000999, "交易异常");
		MAP.put(RETURN_CODE_E000998, "未找到交易服务资源");
		MAP.put(RETURN_CODE_E000997, "应用路由失败，交易请求未送达后台");
		MAP.put(RETURN_CODE_E000100, "日期（交易、授权）格式非法");
		MAP.put(RETURN_CODE_E100002, "认证失败系统ID不存在（系统ID非空校验）");
		MAP.put(RETURN_CODE_E100003, "认证失败参数非法（用户、密码非空校验）");
		MAP.put(RETURN_CODE_E100004, "认证失败-用户或密码错误");
		MAP.put(RETURN_CODE_E100005, "认证失败-接口未授权");
		MAP.put(RETURN_CODE_E900002, "查询操作超时");
		MAP.put(RETURN_CODE_E900003, "查询token失效");
		MAP.put(RETURN_CODE_E900004, "查询黑名单数据源未授权");
		MAP.put(RETURN_CODE_E900005, "查询接口未授权");
		MAP.put(RETURN_CODE_E900006, "查询超过每天调用次数");
		MAP.put(RETURN_CODE_E900007, "查询参数非法");
		MAP.put(RETURN_CODE_E900008, "查询入参个数超过限制");
		MAP.put(RETURN_CODE_E900009, "查询系统异常");
		MAP.put(RETURN_CODE_E000075, "授权码有效期已过有效截止日期[1]");
		MAP.put(RETURN_CODE_E000076, "授权码有效期还未到有效开始日期[2]");
		MAP.put(RETURN_CODE_E000077, "授权码有效期没有在有效开始日期与结束日期之间[3]");
		MAP.put(RETURN_CODE_E000078, "授权码试用查询总笔数超限");
		MAP.put(RETURN_CODE_E000079, "请求的网络类型与申请类型不一致");
		MAP.put(RETURN_CODE_E000080, "当前渠道仅开通WEB查询权限，暂不支持API查询");
		MAP.put(RETURN_CODE_E000082, "存储报文发生异常");
		MAP.put(RETURN_CODE_E009999, "参数数据不正确(部分参数为空)");
		MAP.put(RETURN_CODE_E0_9998, "您的用户信息错误（用户名不存在）");
		MAP.put(RETURN_CODE_E0_9997, "您无权查询数据");
		MAP.put(RETURN_CODE_E0_9996, "参数请求数据过长");
		MAP.put(RETURN_CODE_E0_9995, "该产品已暂停使用");
		MAP.put(RETURN_CODE_E0_9994, "参数数据加密错误");
		MAP.put(RETURN_CODE_E00_990, "系统异常");
		MAP.put(RETURN_CODE_E0_9999, "未查到数据");
		MAP.put(RETURN_CODE_E0_9919, "参数数据不正确(参数格式不正确)");
		MAP.put(RETURN_CODE_E0_9929, "参数数据不正确(参数个数不正确)");
		MAP.put(RETURN_CODE_E0_9917, "您无权查询数据(ip无权限)");
		MAP.put(RETURN_CODE_E0_9927, "您无权查询数据(没有订购该产品)");
		MAP.put(RETURN_CODE_E0_9937, "您无权查询数据(产品状态是开始状态)");
		MAP.put(RETURN_CODE_E0_9947, "您无权查询数据(产品状态是暂停状态)");
		MAP.put(RETURN_CODE_E0_9957, "您无权查询数据(产品状态是终止状态)");
		MAP.put(RETURN_CODE_E0_9967, "您无权查询数据(测试量已经用完)");
		MAP.put(RETURN_CODE_E0_9977, "您无权查询数据(账户余额不足)");
		MAP.put(RETURN_CODE_EN20001, "未配置数据来源");
		MAP.put(RETURN_CODE_EN20002, "未配置识别码");
		MAP.put(RETURN_CODE_EN20003, "未配置授权码");
		MAP.put(RETURN_CODE_EN20004, "参数：证件号码不能为空");
		MAP.put(RETURN_CODE_EN20005, "参数：主体名称不能为空");
		MAP.put(RETURN_CODE_EN20006, "参数：查询原因不能为空");
		MAP.put(RETURN_CODE_EN20007, "参数：比对相片不能为空");
		MAP.put(RETURN_CODE_EN20008, "参数：行政区代码不能为空");
		MAP.put(RETURN_CODE_EN20009, "参数：序列号不能为空");
		MAP.put(RETURN_CODE_EN20010, "调用批量查询人脸比对信息接口出现异常");
		MAP.put(RETURN_CODE_EN20011, "人脸比对接口返回的数据格式不对");
		MAP.put(RETURN_CODE_EN20012, "解析返回的数据出现异常");
		MAP.put(RETURN_CODE_EN20013, "实时批量查询公安部人脸比对信息出现异常");
		MAP.put(RETURN_CODE_EN20014, "参数：批量请求数据不能为空");
		MAP.put(RETURN_CODE_EN00001, "人脸比对报告待获取");
		MAP.put(RETURN_CODE_EN00002, "人脸比对报告获取中");
		MAP.put(RETURN_CODE_EN00003, "人脸比对报告待拆分");
		MAP.put(RETURN_CODE_EN00004, "人脸比对报告拆分中");
		MAP.put(RETURN_CODE_EN00005, "人脸比对报告拆分完成");
		MAP.put(RETURN_CODE_EN00006, "人脸比对报告获取失败");
		MAP.put(RETURN_CODE_EN00007, "人脸比对报告拆分失败");
		MAP.put(RETURN_CODE_EN00009, "人脸比对报告复用报告");
		MAP.put(RETURN_CODE_EU00001, "返回值JSON为NULL");
		MAP.put(RETURN_CODE_EU00002, "返回值DTO为NULL");
		MAP.put(RETURN_CODE_EU00003, "查询失败(error_code不为0)");
		MAP.put(RETURN_CODE_EU00004, "查询失败(reflect调用未通过安全授权)");
		MAP.put(RETURN_CODE_EU00005, "查询失败(开发包非法，未找到方法)");
		MAP.put(RETURN_CODE_EU00006, "交易失败(reflect参数非法)");
		MAP.put(RETURN_CODE_EU00007, "交易失败(reflect调用非法)");
		MAP.put(RETURN_CODE_EU00008, "交易失败(reflect调用目标非法)");
		MAP.put(RETURN_CODE_EU00009, "交易失败(不支持编码)");
		MAP.put(RETURN_CODE_EZ00001, "返回报文key\\value存在空节点");
		MAP.put(RETURN_CODE_EZ00002, "返回报文ORDERLIST节点空");
		MAP.put(RETURN_CODE_EZ00003, "返回报文BASIC节点空");
		MAP.put(RETURN_CODE_EZ00004, "返回报文非合法XML格式");
		MAP.put(RETURN_CODE_EZ00005, "marshal返回报文异常");
		MAP.put(RETURN_CODE_ETD0001, "上传文件失败");
		MAP.put(RETURN_CODE_ETD0002, "下载文件失败");
		MAP.put(RETURN_CODE_EL000_1, "模块L交易发生-1错误");
		MAP.put(RETURN_CODE_EL00000, "模块L交易成功");
		MAP.put(RETURN_CODE_EL40001, "模块L交易发生40001错误");
		MAP.put(RETURN_CODE_EL40002, "模块L交易发生40002错误");
		MAP.put(RETURN_CODE_EL40003, "模块L交易发生40003错误");
		MAP.put(RETURN_CODE_EL40004, "模块L交易发生40004错误");
		MAP.put(RETURN_CODE_EL40005, "模块L交易发生40005错误");
		MAP.put(RETURN_CODE_EL40006, "模块L交易发生40006错误");
		MAP.put(RETURN_CODE_EL40007, "模块L交易发生40007错误");
		MAP.put(RETURN_CODE_EL40400, "模块L交易发生40400错误");
		MAP.put(RETURN_CODE_EL43001, "模块L交易发生43001错误");
		MAP.put(RETURN_CODE_EL43002, "模块L交易发生43002错误");
		MAP.put(RETURN_CODE_EL43003, "模块L交易发生43003错误");
		MAP.put(RETURN_CODE_EL44000, "模块L交易发生44000错误");
		MAP.put(RETURN_CODE_EL44001, "模块L交易发生44001错误");
		MAP.put(RETURN_CODE_EL44002, "模块L交易发生44002错误");
		MAP.put(RETURN_CODE_EL44003, "模块L交易发生44003错误");
		MAP.put(RETURN_CODE_EL44004, "模块L交易发生44004错误");
		MAP.put(RETURN_CODE_EL44005, "模块L交易发生44005错误");
		MAP.put(RETURN_CODE_EL44006, "模块L交易发生44006错误");
		MAP.put(RETURN_CODE_EL44007, "模块L交易发生44007错误");
		MAP.put(RETURN_CODE_EL44008, "模块L交易发生44008错误");
		MAP.put(RETURN_CODE_EL44009, "模块L交易发生44009错误");
		MAP.put(RETURN_CODE_EL44206, "模块L交易发生44206错误");
		MAP.put(RETURN_CODE_EL50001, "模块L交易发生50001错误");
		MAP.put(RETURN_CODE_EL50002, "模块L交易发生50002错误");
		MAP.put(RETURN_CODE_EL_9999, "模块L交易发生-9999错误");
		MAP.put(RETURN_CODE_ETR6000, "模块TR交易发生6000错误");
		MAP.put(RETURN_CODE_ETR3000, "模块TR交易发生3000错误");
		MAP.put(RETURN_CODE_ETR5000, "模块TR交易发生5000错误");
		MAP.put(RETURN_CODE_E000990, "处理中");
		MAP.put(RETURN_CODE_E000991, "同批次SeqNo必须唯一");
		MAP.put(RETURN_CODE_E000992, "通过CyberArk获取密钥发生异常");
		MAP.put(RETURN_CODE_E000993, "通过CyberArk获取的密钥为空");
		MAP.put(RETURN_CODE_E000108, "子产品信息为空或长度不为10");
		MAP.put(RETURN_CODE_E000109, "子产品信息格式非法");
		MAP.put(RETURN_CODE_E000110, "没有查询任何子产品权限");
		MAP.put(RETURN_CODE_E000111, "没有查询该子产品权限");
		MAP.put(RETURN_CODE_E000112, "'证件号码'校验不通过");
		MAP.put(RETURN_CODE_ETD0100, "模块TD交易发生100错误");
		MAP.put(RETURN_CODE_ETD0400, "模块TD交易发生400错误");
		MAP.put(RETURN_CODE_ETD0401, "模块TD交易发生401错误");
		MAP.put(RETURN_CODE_ETD0403, "模块TD交易发生403错误");
		MAP.put(RETURN_CODE_ETD0404, "模块TD交易发生404错误");
		MAP.put(RETURN_CODE_ETD0405, "模块TD交易发生405错误");
		MAP.put(RETURN_CODE_ETD0410, "模块TD交易发生410错误");
		MAP.put(RETURN_CODE_E000113, "系统交易发生E000113错误");
	}
	
	/**
	 * Service接口常量
	 * @author   ChenYunyu
	 * @version  1.0
	 * @since    v1.0
	 * @Date     2017-3-23下午4:47:49
	 */
	public class ServiceMethod{
		
		/**
		 * 查询好信度信息
		 */
		public static final String QUERY_CREDIT_INFO = "queryCreditInfo";
		
		/**
		 * 查询地址通信息
		 */
		public static final String QUERY_ADDRESS_INFO = "queryAddressInfo";
		
		/**
		 * 查询风险度信息
		 */
		public static final String QUERY_RISK_INFO = "queryRiskInfo";
		
		/**
		 * 查询常贷客信息
		 */
		public static final String QUERY_LOAN_INFO = "queryLoanInfo";
		
		/**
		 * 工作单位验证
		 */
		public static final String VERIFY_COMPANY_INFO = "verifyCompanyInfo";
		
		/**
		 * 关系人验证
		 */
		public static final String VERIFY_RELATIONAL_INFO = "verifyRelationalInfo";
		
		/**
		 * 查询商户银行卡评分数据
		 */
		public static final String QUERY_BANKCARD_SCORE_INFO = "queryBankCardScoreInfo";
		
	}
}
