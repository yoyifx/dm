package cn.datawe.constant;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IdentityAuthConstant {
	
	public static String[] arr = new String[] { "10002", "10302", "10501", "10903", "11001"};

	public static boolean useSet(String targetValue) {
		Set<String> set = new HashSet<String>(Arrays.asList(arr));
		return set.contains(targetValue);
	}
}
