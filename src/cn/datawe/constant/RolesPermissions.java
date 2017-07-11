package cn.datawe.constant;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 验证菜单与操作权限
 * @author linqy
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@Documented
//@Order(Ordered.HIGHEST_PRECEDENCE)
public @interface RolesPermissions {

	/**
     * 
     * 菜单标记，以便决定是否具有相关权限
     */
	String menu() default "";
	
	/**
     * 
     * 操作权限标记，以便决定是否具有相关权限
     */
	abstract String[] opt() default {};
}
