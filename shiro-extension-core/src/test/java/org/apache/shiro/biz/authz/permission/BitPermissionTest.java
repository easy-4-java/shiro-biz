package org.apache.shiro.biz.authz.permission;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.shiro.authz.Permission;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for permission-related classes.
 *
 * @author [@Loong Wan](https://github.com/loong10k)
 */
class BitPermissionTest {

    @Test
    @DisplayName("BitPermission resolves permission string")
    void bitPermissionCreation() {
        BitPermission perm = new BitPermission("+menu1");
        assertThat(perm).isInstanceOf(Permission.class);
    }

    @Test
    @DisplayName("BitPermission implies same permission")
    void bitPermissionImplies() {
        BitPermission perm = new BitPermission("+menu1");
        assertThat(perm.implies(new BitPermission("+menu1"))).isTrue();
    }

    @Test
    @DisplayName("BitAndWildPermissionResolver can resolve permissions")
    void resolverResolves() {
        BitAndWildPermissionResolver resolver = new BitAndWildPermissionResolver();
        Permission perm = resolver.resolvePermission("+test");
        assertThat(perm).isInstanceOf(BitPermission.class);
    }
}
