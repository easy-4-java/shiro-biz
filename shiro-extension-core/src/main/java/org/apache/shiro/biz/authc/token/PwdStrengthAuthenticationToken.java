package org.apache.shiro.biz.authc.token;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * 密码强度支持
 * @author [@Loong Wan](https://github.com/loong10k)
 */
public interface PwdStrengthAuthenticationToken extends AuthenticationToken {

	public int getStrength();
	
}
