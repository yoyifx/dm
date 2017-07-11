/**
 * 工程名：project-util
 * 包名：cn.datawe.util
 */
package cn.datawe.util;


/**
 * 类名：BankCardUtil
 * 
 * @author lishasha
 * @desc 银行卡工具类
 * @version 1.0
 * @since v1.0
 * @Date 2017-2-16上午09:54:46
 */
public class BankCardUtil {

	/**
	 * 校验银行卡卡号 : 1、从卡号最后一位数字开始，逆向将奇数位(1、3、5等等)相加。
	 * 2、从卡号最后一位数字开始，逆向将偶数位数字，先乘以2（如果乘积为两位数，将个位十位数字相加，即将其减去9），再求和。
	 * 3、将奇数位总和加上偶数位总和，结果应该可以被10整除。
	 * 
	 * @author lishasha
	 * @Date 2017-2-16上午10:31:31
	 * @method checkBankCard
	 * @param bankCard
	 * @return
	 * 
	 * @since v1.0
	 */
	public static boolean checkBankCard(String bankCard) {
		if (bankCard.length() < 15 || bankCard.length() > 19) {
			return false;
		}
		char bit = getBankCardCheckCode(bankCard.substring(0, bankCard.length() - 1));
		if (bit == 'N') {
			return false;
		}
		return bankCard.charAt(bankCard.length() - 1) == bit;
	}

	/**
	 * 从不含校验位的银行卡卡号采用 Luhm 校验算法获得校验位
	 * 
	 * @author lishasha
	 * @Date 2017-2-16上午10:31:15
	 * @method getBankCardCheckCode
	 * @param nonCheckCodeBankCard
	 * @return
	 * 
	 * @since v1.0
	 */
	private static char getBankCardCheckCode(String nonCheckCodeBankCard) {
		if (nonCheckCodeBankCard == null || nonCheckCodeBankCard.trim().length() == 0 || !nonCheckCodeBankCard.matches("\\d+")) {
			// 如果传的不是数据返回N
			return 'N';
		}
		char[] chs = nonCheckCodeBankCard.trim().toCharArray();
		int luhmSum = 0;
		for (int i = chs.length - 1, j = 0; i >= 0; i--, j++) {
			int k = chs[i] - '0';
			if (j % 2 == 0) {
				k *= 2;
				k = k / 10 + k % 10;
			}
			luhmSum += k;
		}
		return (luhmSum % 10 == 0) ? '0' : (char) ((10 - luhmSum % 10) + '0');
	}

	private BankCardUtil() {

	}
	
	public static void main(String[] args) {
		String cardno="6222080403003810622";
		System.err.println(!checkBankCard(cardno));
	}

}
