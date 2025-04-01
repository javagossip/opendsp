package io.github.javagossip.opendsp.dashboard.helper;


import io.github.javagossip.opendsp.model.SysUser;

public class AuthContext {
    private static final AuthContext AUTH_CONTEXT = new AuthContext();

    private final ThreadLocal<SysUser> authUserHolder = new ThreadLocal<>();

    private AuthContext() {
    }

    public static AuthContext get() {
        return AUTH_CONTEXT;
    }

    public static SysUser getAuthUser() {
        return get().authUserHolder.get();
    }
}
