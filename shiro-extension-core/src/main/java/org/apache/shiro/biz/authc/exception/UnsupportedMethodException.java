package org.apache.shiro.biz.authc.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * Unsupported Method Exception.
 *
 * @author [@Loong Wan](https://github.com/loong10k)
 */
@SuppressWarnings("serial")
public class UnsupportedMethodException extends AuthenticationException {

    public UnsupportedMethodException(String msg) {
        super(msg);
    }
    
}
