package org.apache.shiro.biz.authc.token;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for authentication token classes.
 *
 * @author [@Loong Wan](https://github.com/loong10k)
 */
class AuthenticationTokenTest {

    @Test
    @DisplayName("LoginType enum values exist")
    void loginTypeValues() {
        assertThat(LoginType.DEFAULE).isNotNull();
        assertThat(LoginType.CAS).isNotNull();
        assertThat(LoginType.JWT).isNotNull();
        assertThat(LoginType.TICKET).isNotNull();
        assertThat(LoginType.values()).hasSize(4);
    }

    @Test
    @DisplayName("LoginType DEFAULE has correct key and desc")
    void loginTypeDefault() {
        assertThat(LoginType.DEFAULE.getKey()).isEqualTo("default");
        assertThat(LoginType.DEFAULE.getDesc()).isNotEmpty();
        assertThat(LoginType.DEFAULE.getRealmName()).isEqualTo("defaultRealm");
    }

    @Test
    @DisplayName("LoginType CAS has correct key")
    void loginTypeCas() {
        assertThat(LoginType.CAS.getKey()).isEqualTo("cas");
    }

    @Test
    @DisplayName("LoginType JWT has correct key")
    void loginTypeJwt() {
        assertThat(LoginType.JWT.getKey()).isEqualTo("jwt");
    }

    @Test
    @DisplayName("LoginType equalsTo works correctly")
    void loginTypeEqualsTo() {
        assertThat(LoginType.DEFAULE.equalsTo("default")).isTrue();
        assertThat(LoginType.DEFAULE.equalsTo("DEFAULT")).isTrue();
        assertThat(LoginType.DEFAULE.equalsTo("cas")).isFalse();
        assertThat(LoginType.DEFAULE.equalsTo(LoginType.DEFAULE)).isTrue();
        assertThat(LoginType.DEFAULE.equalsTo(LoginType.CAS)).isFalse();
    }

    @Test
    @DisplayName("LoginType toString returns desc")
    void loginTypeToString() {
        assertThat(LoginType.DEFAULE.toString()).isEqualTo(LoginType.DEFAULE.getDesc());
    }

    @Test
    @DisplayName("DefaultAuthenticationToken implements all interfaces")
    void defaultTokenInterfaces() {
        DefaultAuthenticationToken token = new DefaultAuthenticationToken();
        assertThat(token).isInstanceOf(CaptchaAuthenticationToken.class);
        assertThat(token).isInstanceOf(PwdStrengthAuthenticationToken.class);
        assertThat(token).isInstanceOf(LoginTypeAuthenticationToken.class);
    }

    @Test
    @DisplayName("DefaultAuthenticationToken setters and getters")
    void defaultTokenGettersSetters() {
        DefaultAuthenticationToken token = new DefaultAuthenticationToken();
        token.setCaptcha("captcha1");
        token.setStrength(3);
        token.setLoginType(LoginType.CAS);
        assertThat(token.getCaptcha()).isEqualTo("captcha1");
        assertThat(token.getStrength()).isEqualTo(3);
        assertThat(token.getLoginType()).isEqualTo(LoginType.CAS);
    }

    @Test
    @DisplayName("UsernameWithoutPwdToken stores username and rememberMe")
    void usernameWithoutPwdToken() {
        UsernameWithoutPwdToken token = new UsernameWithoutPwdToken("user1", true);
        assertThat(token.getUsername()).isEqualTo("user1");
        assertThat(token.isRememberMe()).isTrue();
        assertThat(token.getPrincipal()).isEqualTo("user1");
        assertThat(token.getCredentials()).isNull();
    }

    @Test
    @DisplayName("UsernameWithoutPwdToken default rememberMe is false")
    void usernameWithoutPwdTokenDefaults() {
        UsernameWithoutPwdToken token = new UsernameWithoutPwdToken("user2");
        assertThat(token.isRememberMe()).isFalse();
        assertThat(token.getHost()).isNull();
    }
}
