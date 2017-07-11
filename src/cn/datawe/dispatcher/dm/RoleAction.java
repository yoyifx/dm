/**
 * 工程名：dm-util
 * 包名：cn.datawe.dispatcher.dm
 */
package cn.datawe.dispatcher.dm;

import java.util.Map;

import cn.datawe.constant.ActionConstant.RoleActionConstant;
import cn.datawe.dispatcher.MainDispatcher;

import com.lrt.framework.core.pojos.ServiceResponse;

/**
 * 类名：RoleAction
 * 
 * @desc
 * @author lishasha
 * @version 1.0
 * @since v1.0
 * @Date 2017年3月30日上午10:05:38
 */
public class RoleAction extends MainDispatcher {

	private static ServiceResponse excute(String op, Map<Object, Object> condition) {
		return excute("roleAction", op, condition);
	}

	public static ServiceResponse saveRole(Map<Object, Object> condition) {
		return excute(RoleActionConstant.SAVE_ROLE, condition);
	}

	public static ServiceResponse updateRole(Map<Object, Object> condition) {
		return excute(RoleActionConstant.UPDATE_ROLE, condition);
	}

	public static ServiceResponse queryRoleList(Map<Object, Object> condition) {
		return excute(RoleActionConstant.QUERY_ROLE_LIST, condition);
	}

	public static ServiceResponse queryRolePage(Map<Object, Object> condition) {
		return excute(RoleActionConstant.QUERY_ROLE_PAGE, condition);
	}

	public static ServiceResponse deleteRole(Map<Object, Object> condition) {
		return excute(RoleActionConstant.DELETE_ROLE, condition);
	}

	public static ServiceResponse queryPrvList(Map<Object, Object> condition) {
		return excute(RoleActionConstant.QUERY_PRV_LIST, condition);
	}
}
