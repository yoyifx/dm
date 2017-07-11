/**
 * 工程名：dm-util
 * 包名：cn.datawe.dispatcher.dm
 */
package cn.datawe.dispatcher.dm;

import java.util.Map;

import cn.datawe.constant.ActionConstant.MenuActionConstant;
import cn.datawe.dispatcher.MainDispatcher;

import com.lrt.framework.core.pojos.ServiceResponse;

/**
 * 类名：MenuAction
 * @desc 
 * @author lishasha
 * @version 1.0
 * @since v1.0
 * @Date 2017年4月11日下午6:13:37
 */
public class MenuAction extends MainDispatcher {

	private static ServiceResponse excute(String op, Map<Object, Object> condition) {
		return excute("menuAction", op, condition);
	}

	public static ServiceResponse findUserMenu(Map<Object, Object> condition) {
		return excute(MenuActionConstant.FIND_USER_MENU, condition);
	}
	
	public static ServiceResponse findLeftMenu(Map<Object, Object> condition) {
		return excute(MenuActionConstant.FIND_LEFT_MENU, condition);
	}
}
