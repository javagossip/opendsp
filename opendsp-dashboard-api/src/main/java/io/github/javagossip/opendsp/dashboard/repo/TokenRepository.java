package io.github.javagossip.opendsp.dashboard.repo;

import io.github.javagossip.opendsp.dashboard.dto.AuthInfoDto;

public interface TokenRepository {

    void saveToken(String token, AuthInfoDto authInfo);

    AuthInfoDto getAuthInfo(String token);

    AuthInfoDto getAndRefreshToken(String token);

    void removeToken(String token);
}
