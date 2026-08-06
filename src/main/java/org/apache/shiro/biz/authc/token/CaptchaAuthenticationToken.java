package org.apache.shiro.biz.authc.token;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * 验证码支持
 * @author [@Loong Wan](https://github.com/loong10k)
 */
public interface CaptchaAuthenticationToken extends AuthenticationToken {

	String getCaptcha();
	
}
