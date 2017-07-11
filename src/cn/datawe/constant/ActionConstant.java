/**
 * 工程名：dm-util
 * 包名：cn.datawe.constant
 */
package cn.datawe.constant;

/**
 * 类名：ActionConstant
 * 
 * @desc
 * @author lishasha
 * @version 1.0
 * @since v1.0
 * @Date 2017年3月30日上午10:08:42
 */
public class ActionConstant {

	public static class UserActionConstant {

		public static final String LOGIN_INFO = "loginInfo";

		public static final String SAVE_USER = "saveUser";

		public static final String UPDATE_USER_PWD = "updateUserPwd";

		public static final String UPDATE_USER = "updateUser";

		public static final String DELETE_USER = "deleteUser";

		public static final String QUERY_USER_LIST = "queryUserInfo";

		public static final String FIND_USER_MENU = "findUserMenu";
	}

	public static class RoleActionConstant {

		public static final String SAVE_ROLE = "saveRole";

		public static final String UPDATE_ROLE = "updateRole";

		public static final String QUERY_ROLE_LIST = "queryRoleList";

		public static final String QUERY_ROLE_PAGE = "queryRolePage";

		public static final String DELETE_ROLE = "deleteRole";

		public static final String QUERY_PRV_LIST = "queryPrvList";
	}
	
	public static class MenuActionConstant{

		public static final String FIND_USER_MENU = "findUserMenu";

		public static final String FIND_LEFT_MENU = "findLeftMenu";
	}

}
