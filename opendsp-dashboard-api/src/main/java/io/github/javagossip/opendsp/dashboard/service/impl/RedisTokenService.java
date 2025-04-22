package io.github.javagossip.opendsp.dashboard.service.impl;

import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import io.github.javagossip.opendsp.commons.redis.FastJsonRedisTemplate;
import io.github.javagossip.opendsp.dashboard.constant.Constants;
import io.github.javagossip.opendsp.dashboard.constant.Constants.RedisKeys;
import io.github.javagossip.opendsp.dashboard.dto.AuthInfoDto;
import io.github.javagossip.opendsp.dashboard.service.TokenService;

@Service("redisTs")
public class RedisTokenService implements TokenService {

    @Resource(name = "fastJsonRedisTemplate")
    private FastJsonRedisTemplate redisTemplate;

    @Override
    public void saveToken(String token, AuthInfoDto authInfo) {
        redisTemplate.opsForValue()
                .set(RedisKeys.authToken(token), authInfo, Constants.DEFAULT_TOKEN_EXPIRE_TIME, TimeUnit.SECONDS);
    }

    @Override
    public AuthInfoDto getAuthInfo(String token) {
        return (AuthInfoDto) redisTemplate.opsForValue().get(RedisKeys.authToken(token));
    }

    @Override
    public AuthInfoDto getAndRefreshToken(String token) {
        return (AuthInfoDto) redisTemplate.opsForValue()
                .getAndExpire(RedisKeys.authToken(token), Constants.DEFAULT_TOKEN_EXPIRE_TIME, TimeUnit.SECONDS);
    }

    @Override
    public void removeToken(String token) {
        redisTemplate.delete(RedisKeys.authToken(token));
    }
}
