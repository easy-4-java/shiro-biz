package org.apache.shiro.biz.authc.exception;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.CredentialsException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for custom authentication exception classes.
 *
 * @author [@Loong Wan](https://github.com/loong10k)
 */
class AuthenticationExceptionTest {

    @Test
    @DisplayName("CaptchaSendException extends CredentialsException")
    void captchaSendException() {
        CaptchaSendException ex = new CaptchaSendException("send failed");
        assertThat(ex).isInstanceOf(CredentialsException.class);
        assertThat(ex.getMessage()).isEqualTo("send failed");
        assertThat(new CaptchaSendException("msg", new RuntimeException()).getCause()).isNotNull();
    }

    @Test
    @DisplayName("ExpiredCaptchaException extends CredentialsException")
    void expiredCaptchaException() {
        ExpiredCaptchaException ex = new ExpiredCaptchaException("expired");
        assertThat(ex).isInstanceOf(CredentialsException.class);
    }

    @Test
    @DisplayName("ExpiredTicketException extends CredentialsException")
    void expiredTicketException() {
        ExpiredTicketException ex = new ExpiredTicketException("ticket expired");
        assertThat(ex).isInstanceOf(CredentialsException.class);
    }

    @Test
    @DisplayName("ExpiredTokenException extends CredentialsException")
    void expiredTokenException() {
        ExpiredTokenException ex = new ExpiredTokenException("token expired");
        assertThat(ex).isInstanceOf(CredentialsException.class);
    }

    @Test
    @DisplayName("IncorrectCaptchaException extends CredentialsException")
    void incorrectCaptchaException() {
        IncorrectCaptchaException ex = new IncorrectCaptchaException("wrong captcha");
        assertThat(ex).isInstanceOf(CredentialsException.class);
    }

    @Test
    @DisplayName("IncorrectSecretException extends CredentialsException")
    void incorrectSecretException() {
        IncorrectSecretException ex = new IncorrectSecretException("wrong secret");
        assertThat(ex).isInstanceOf(CredentialsException.class);
    }

    @Test
    @DisplayName("IncorrectTicketException extends CredentialsException")
    void incorrectTicketException() {
        IncorrectTicketException ex = new IncorrectTicketException("wrong ticket");
        assertThat(ex).isInstanceOf(CredentialsException.class);
    }

    @Test
    @DisplayName("IncorrectTokenException extends CredentialsException")
    void incorrectTokenException() {
        IncorrectTokenException ex = new IncorrectTokenException("wrong token");
        assertThat(ex).isInstanceOf(CredentialsException.class);
    }

    @Test
    @DisplayName("InvalidAccountException extends AccountException")
    void invalidAccountException() {
        InvalidAccountException ex = new InvalidAccountException("invalid account");
        assertThat(ex).isInstanceOf(AccountException.class);
    }

    @Test
    @DisplayName("InvalidCaptchaException extends CredentialsException")
    void invalidCaptchaException() {
        InvalidCaptchaException ex = new InvalidCaptchaException("invalid captcha");
        assertThat(ex).isInstanceOf(CredentialsException.class);
    }

    @Test
    @DisplayName("InvalidStateException extends AccountException")
    void invalidStateException() {
        InvalidStateException ex = new InvalidStateException("invalid state");
        assertThat(ex).isInstanceOf(AccountException.class);
    }

    @Test
    @DisplayName("InvalidTicketException extends CredentialsException")
    void invalidTicketException() {
        InvalidTicketException ex = new InvalidTicketException("invalid ticket");
        assertThat(ex).isInstanceOf(CredentialsException.class);
    }

    @Test
    @DisplayName("InvalidTokenException extends CredentialsException")
    void invalidTokenException() {
        InvalidTokenException ex = new InvalidTokenException("invalid token");
        assertThat(ex).isInstanceOf(CredentialsException.class);
    }

    @Test
    @DisplayName("NoneCaptchaException extends AccountException")
    void noneCaptchaException() {
        NoneCaptchaException ex = new NoneCaptchaException("no captcha");
        assertThat(ex).isInstanceOf(AccountException.class);
    }

    @Test
    @DisplayName("NoneRoleException extends AccountException")
    void noneRoleException() {
        NoneRoleException ex = new NoneRoleException("no role");
        assertThat(ex).isInstanceOf(AccountException.class);
    }

    @Test
    @DisplayName("NoneTicketException extends AccountException")
    void noneTicketException() {
        NoneTicketException ex = new NoneTicketException("no ticket");
        assertThat(ex).isInstanceOf(AccountException.class);
    }

    @Test
    @DisplayName("NoneTokenException extends AccountException")
    void noneTokenException() {
        NoneTokenException ex = new NoneTokenException("no token");
        assertThat(ex).isInstanceOf(AccountException.class);
    }

    @Test
    @DisplayName("SessionKickedoutException extends AuthenticationException")
    void sessionKickedoutException() {
        SessionKickedoutException ex = new SessionKickedoutException("kicked out");
        assertThat(ex).isInstanceOf(AuthenticationException.class);
    }

    @Test
    @DisplayName("SessionRestrictedException extends AuthenticationException")
    void sessionRestrictedException() {
        SessionRestrictedException ex = new SessionRestrictedException("restricted");
        assertThat(ex).isInstanceOf(AuthenticationException.class);
    }

    @Test
    @DisplayName("TerminalRestrictedException extends AuthenticationException")
    void terminalRestrictedException() {
        TerminalRestrictedException ex = new TerminalRestrictedException("terminal restricted");
        assertThat(ex).isInstanceOf(AuthenticationException.class);
    }

    @Test
    @DisplayName("UnsupportedMethodException extends AuthenticationException")
    void unsupportedMethodException() {
        UnsupportedMethodException ex = new UnsupportedMethodException("unsupported");
        assertThat(ex).isInstanceOf(AuthenticationException.class);
    }
}
