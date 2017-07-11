package cn.datawe.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public final class SeqNoUtil {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmssSSSS");
	private static Random random = new Random();

	/**
	 * 生成序列号
	 * 
	 * @param busiCode
	 * @return
	 */
	public static synchronized String getSeqNo(String busiCode) {
		StringBuffer sb = new StringBuffer();
		sb.append(busiCode);
		sb.append(getTimeStamp());
		int num = 0;
		for (int i = 0; i <= 4; i++) {
			num = random.nextInt(9);
			sb.append(String.valueOf(num));
		}
		return sb.toString();
	}

	public static String getTimeStamp() {
		return sdf.format(new Date());
	}

//	public static void main(String[] args) {
//		Runnable run1 = new Runnable() {
//			public void run() {
//				for (int i = 0; i < 10; i++) {
//					System.out.println(Thread.currentThread().getName() + "=======" + getSeqNo("AA"));
//				}
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		};
//		Runnable run2 = new Runnable() {
//			public void run() {
//				for (int i = 0; i < 10; i++) {
//					System.out.println(Thread.currentThread().getName() + "=======" + getSeqNo("BB"));
//				}
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		};
//		for (int i = 0; i < 10; i++) {
//			new Thread(run1, "thread1-" + i).start();
//			new Thread(run2, "thread2-" + i).start();
//		}
//	}
}
