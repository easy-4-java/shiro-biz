package org.apache.shiro.biz.spring.security.interceptor;

import org.apache.shiro.authz.aop.AuthorizingAnnotationMethodInterceptor;
import org.apache.shiro.biz.authz.aop.RoleAllowsAnnotationMethodInterceptor;
import org.apache.shiro.spring.security.interceptor.AopAllianceAnnotationsAuthorizingMethodInterceptor;

import java.util.Collection;

/**
 * Extend Annotations Authorizing Method Interceptor.
 *
 * @author [@Loong Wan](https://github.com/loong10k)
 */
public class ExtendAnnotationsAuthorizingMethodInterceptor extends AopAllianceAnnotationsAuthorizingMethodInterceptor {

	public ExtendAnnotationsAuthorizingMethodInterceptor() {
		super();
		
		Collection<AuthorizingAnnotationMethodInterceptor> interceptors = getMethodInterceptors();

		// 自定义
		interceptors.add(new RoleAllowsAnnotationMethodInterceptor());

		super.setMethodInterceptors(interceptors);
		
	}

}