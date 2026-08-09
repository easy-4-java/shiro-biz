package org.apache.shiro.biz.authc.pam;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.shiro.authc.pam.AuthenticationStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for custom authentication strategy classes.
 *
 * @author [@Loong Wan](https://github.com/loong10k)
 */
class AuthenticatorStrategyTest {

    @Test
    @DisplayName("OnlyOneAuthenticatorStrategy implements AuthenticationStrategy")
    void onlyOneStrategy() {
        OnlyOneAuthenticatorStrategy strategy = new OnlyOneAuthenticatorStrategy();
        assertThat(strategy).isInstanceOf(AuthenticationStrategy.class);
    }

    @Test
    @DisplayName("AtLeastTwoAuthenticatorStrategy implements AuthenticationStrategy")
    void atLeastTwoStrategy() {
        AtLeastTwoAuthenticatorStrategy strategy = new AtLeastTwoAuthenticatorStrategy();
        assertThat(strategy).isInstanceOf(AuthenticationStrategy.class);
    }
}
