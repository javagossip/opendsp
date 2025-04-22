package io.github.javagossip.opendsp.dashboard.service;

import io.github.javagossip.opendsp.dashboard.dto.AuthInfoDto;

public interface TokenService {

    void saveToken(String token, AuthInfoDto authInfo);

    AuthInfoDto getAuthInfo(String token);

    AuthInfoDto getAndRefreshToken(String token);

    void removeToken(String token);
}
