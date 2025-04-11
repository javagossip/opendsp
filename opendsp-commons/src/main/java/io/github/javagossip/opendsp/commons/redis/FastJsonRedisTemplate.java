package io.github.javagossip.opendsp.commons.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

public class FastJsonRedisTemplate extends RedisTemplate<String, Object> {

    public FastJsonRedisTemplate() {
        setDefaultSerializer(StringRedisSerializer.UTF_8);
        setValueSerializer(FastJsonRedisSerializer.instance());
        setKeySerializer(RedisSerializer.string());
        setHashKeySerializer(RedisSerializer.string());
        setHashValueSerializer(FastJsonRedisSerializer.instance());
    }
}
