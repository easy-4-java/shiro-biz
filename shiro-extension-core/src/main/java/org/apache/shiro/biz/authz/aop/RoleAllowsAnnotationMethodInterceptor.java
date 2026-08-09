package org.apache.shiro.biz.authz.aop;

import org.apache.shiro.aop.AnnotationResolver;
import org.apache.shiro.authz.aop.AuthorizingAnnotationMethodInterceptor;

/**
 * Role Allows Annotation Method Interceptor.
 *
 * @author [@Loong Wan](https://github.com/loong10k)
 */
public class RoleAllowsAnnotationMethodInterceptor extends AuthorizingAnnotationMethodInterceptor {

	public RoleAllowsAnnotationMethodInterceptor() {
		super(new RolesAllowedAnnotationHandler());
	}

	public RoleAllowsAnnotationMethodInterceptor(AnnotationResolver resolver) {
		super(new RolesAllowedAnnotationHandler(), resolver);
	}

}