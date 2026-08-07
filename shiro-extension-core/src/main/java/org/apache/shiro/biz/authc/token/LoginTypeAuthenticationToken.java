package org.apache.shiro.biz.authc.token;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * 登录类型支持
 * @author [@Loong Wan](https://github.com/loong10k)
 */
public interface LoginTypeAuthenticationToken extends AuthenticationToken {

	public LoginType getLoginType();
	
}
