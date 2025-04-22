package io.github.javagossip.opendsp.dashboard.service.impl;

import org.springframework.stereotype.Service;

import io.github.javagossip.opendsp.dashboard.dto.AuthInfoDto;
import io.github.javagossip.opendsp.dashboard.service.TokenService;

@Service("dummyTs")
public class DummyTokenService implements TokenService {

    @Override
    public void saveToken(String token, AuthInfoDto authInfo) {

    }

    @Override
    public AuthInfoDto getAuthInfo(String token) {
        return null;
    }

    @Override
    public AuthInfoDto getAndRefreshToken(String token) {
        return null;
    }

    @Override
    public void removeToken(String token) {

    }
}
