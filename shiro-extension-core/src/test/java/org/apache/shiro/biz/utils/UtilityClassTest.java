package org.apache.shiro.biz.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.shiro.biz.authc.AuthcResponse;
import org.apache.shiro.biz.authc.AuthcResponseCode;
import org.apache.shiro.biz.web.Constants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for utility and constant classes.
 *
 * @author [@Loong Wan](https://github.com/loong10k)
 */
class UtilityClassTest {

    @Test
    @DisplayName("AuthcResponse success factory method")
    void authcResponseSuccess() {
        AuthcResponse resp = AuthcResponse.success("ok");
        assertThat(resp.getCode()).isEqualTo(AuthcResponseCode.SC_AUTHC_SUCCESS.getCode());
        assertThat(resp.getStatus()).isEqualTo("success");
        assertThat(resp.getMsg()).isEqualTo("ok");
    }

    @Test
    @DisplayName("AuthcResponse fail factory method")
    void authcResponseFail() {
        AuthcResponse resp = AuthcResponse.fail(400, "bad request");
        assertThat(resp.getCode()).isEqualTo("400");
        assertThat(resp.getStatus()).isEqualTo("fail");
        assertThat(resp.getMsg()).isEqualTo("bad request");
    }

    @Test
    @DisplayName("AuthcResponse error factory method")
    void authcResponseError() {
        AuthcResponse resp = AuthcResponse.error("server error");
        assertThat(resp.getStatus()).isEqualTo("error");
    }

    @Test
    @DisplayName("AuthcResponse logout factory method")
    void authcResponseLogout() {
        AuthcResponse resp = AuthcResponse.logout("logged out");
        assertThat(resp.getStatus()).isEqualTo("logout");
    }

    @Test
    @DisplayName("AuthcResponseCode enum values exist")
    void authcResponseCode() {
        assertThat(AuthcResponseCode.SC_AUTHC_SUCCESS).isNotNull();
        assertThat(AuthcResponseCode.SC_AUTHC_FAIL).isNotNull();
        assertThat(AuthcResponseCode.SC_AUTHC_SUCCESS.getCode()).isEqualTo("200");
        assertThat(AuthcResponseCode.SC_AUTHC_SUCCESS.getMsgKey()).isNotEmpty();
    }

    @Test
    @DisplayName("Constants class has expected fields")
    void constants() {
        assertThat(Constants.PARAM_DIGEST).isEqualTo("digest");
        assertThat(Constants.PARAM_USERNAME).isEqualTo("username");
        assertThat(Constants.SESSION_FORCE_LOGOUT_KEY).isNotNull();
        assertThat(Constants.SESSION_KICKOUT_KEY).isNotNull();
        assertThat(Constants.ONLINE_SESSION).isNotNull();
    }

    @Test
    @DisplayName("IDWorker generates unique IDs")
    void idWorker() {
        long id1 = IDWorker.getId();
        long id2 = IDWorker.getId();
        assertThat(id1).isNotEqualTo(id2);
        assertThat(id1).isGreaterThan(0);
    }
}
