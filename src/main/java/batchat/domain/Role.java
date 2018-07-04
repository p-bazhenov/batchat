package batchat.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    SOLDIER, CAPITAN, GENERAL, OBSERVER, ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
