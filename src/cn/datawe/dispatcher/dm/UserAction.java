/**
 * 工程名：dm-util
 * 包名：cn.datawe.dispatcher.dm
 */
package cn.datawe.dispatcher.dm;

import java.util.Map;

import cn.datawe.constant.ActionConstant.UserActionConstant;
import cn.datawe.dispatcher.MainDispatcher;

import com.lrt.framework.core.pojos.ServiceResponse;

/**
 * 类名：UserAction
 * @desc 
 * @author lishasha
 * @version 1.0
 * @since v1.0
 * @Date 2017年3月28日下午6:54:53
 */
public class UserAction extends MainDispatcher {

	private static ServiceResponse excute(String op, Map<Object, Object> condition) {
		return excute("userAction", op, condition);
	}

	public static ServiceResponse loginInfo(Map<Object, Object> condition) {
		return excute(UserActionConstant.LOGIN_INFO, condition);
	}

	public static ServiceResponse saveUser(Map<Object, Object> condition) {
		return excute(UserActionConstant.SAVE_USER, condition);
	}
	
	public static ServiceResponse updateUserPwd(Map<Object, Object> condition) {
		return excute(UserActionConstant.UPDATE_USER_PWD, condition);
	}
	
	public static ServiceResponse updateUser(Map<Object, Object> condition) {
		return excute(UserActionConstant.UPDATE_USER, condition);
	}
	
	public static ServiceResponse deleteUser(Map<Object, Object> condition) {
		return excute(UserActionConstant.DELETE_USER, condition);
	}
	
	public static ServiceResponse queryUserInfo(Map<Object, Object> condition) {
		return excute(UserActionConstant.QUERY_USER_LIST, condition);
	}
	
	public static ServiceResponse findUserMenu(Map<Object, Object> condition) {
		return excute(UserActionConstant.FIND_USER_MENU, condition);
	}
}
