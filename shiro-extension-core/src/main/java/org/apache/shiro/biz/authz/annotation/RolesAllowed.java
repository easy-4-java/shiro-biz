package org.apache.shiro.biz.authz.annotation;

import java.lang.annotation.*;

@Documented  
@Target({ElementType.TYPE, ElementType.METHOD})  
@Retention (RetentionPolicy.RUNTIME)  
public @/**
 * Roles Allowed.
 *
 * @author [@Loong Wan](https://github.com/loong10k)
 */
interface RolesAllowed {  
    String[] value();  
}