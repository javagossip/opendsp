package io.github.javagossip.opendsp.commons.redis;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

@Configuration
public class RedisConfiguration {

    @Bean(name = "fastJsonRedisTemplate")
    @ConditionalOnMissingBean
    public FastJsonRedisTemplate redisTemplate(RedisConnectionFactory connectionFactory) {
        FastJsonRedisTemplate fastJsonRedisTemplate = new FastJsonRedisTemplate();
        fastJsonRedisTemplate.setConnectionFactory(connectionFactory);
        return fastJsonRedisTemplate;
    }

    @Bean(name = "stringRedisTemplate")
    @ConditionalOnMissingBean
    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory connectionFactory) {
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
        stringRedisTemplate.setConnectionFactory(connectionFactory);
        return stringRedisTemplate;
    }
}
