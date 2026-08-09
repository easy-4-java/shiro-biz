package org.apache.shiro.biz.authz.aop;

import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.aop.AuthorizingAnnotationHandler;
import org.apache.shiro.biz.authz.annotation.RolesAllowed;

import java.lang.annotation.Annotation;
import java.util.Arrays;

/**
 * Roles Allowed Annotation Handler.
 *
 * @author [@Loong Wan](https://github.com/loong10k)
 */
public class RolesAllowedAnnotationHandler extends AuthorizingAnnotationHandler {

	public RolesAllowedAnnotationHandler() {
		super(RolesAllowed.class);
	}

	@Override
	public void assertAuthorized(Annotation a) throws AuthorizationException {
		RolesAllowed rrAnnotation = (RolesAllowed) a;
		String[] roles = rrAnnotation.value();
		getSubject().checkRoles(Arrays.asList(roles));
		return;
	}

}