package io.github.javagossip.opendsp.dashboard.dto;


public class AuthContext {

    private static final AuthContext AUTH_CONTEXT = new AuthContext();

    private final ThreadLocal<AuthInfoDto> authInfoHolder = new ThreadLocal<>();

    private AuthContext() {
    }

    public static AuthContext get() {
        return AUTH_CONTEXT;
    }

    public static AuthInfoDto getAuthInfo() {
        return get().authInfoHolder.get();
    }

    public void setAuthInfo(AuthInfoDto authInfo) {
        authInfoHolder.set(authInfo);
    }

    public void clear() {
        authInfoHolder.remove();
    }
}
