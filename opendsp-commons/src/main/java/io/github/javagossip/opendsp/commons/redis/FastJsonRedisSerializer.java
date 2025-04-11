package io.github.javagossip.opendsp.commons.redis;

import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler;
import com.alibaba.fastjson2.JSONWriter;

public class FastJsonRedisSerializer implements RedisSerializer<Object> {

    private static final FastJsonRedisSerializer INSTANCE = new FastJsonRedisSerializer();

    private final AutoTypeBeforeHandler autoTypeBeforeHandler;

    public FastJsonRedisSerializer() {
        this.autoTypeBeforeHandler = new OpenDspAutoTypeBeforeHandler();
    }

    public static FastJsonRedisSerializer instance() {
        return INSTANCE;
    }

    @Override
    public byte[] serialize(Object value) throws SerializationException {
        if (value == null) {
            return new byte[0];
        }
        return JSON.toJSONBytes(value, JSONWriter.Feature.WriteClassName);
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        return JSON.parseObject(bytes, Object.class, autoTypeBeforeHandler);
    }

    static class OpenDspAutoTypeBeforeHandler implements AutoTypeBeforeHandler {

        private static final String WHITE_LIST_PACKAGE = "io.github.javagossip.opendsp";

        @Override
        public Class<?> apply(String typeName, Class<?> expectClass, long features) {
            if (typeName != null && typeName.startsWith(WHITE_LIST_PACKAGE)) {
                try {
                    return Class.forName(typeName);
                } catch (ClassNotFoundException e) {
                    throw new JSONException("Class not found: " + typeName);
                }
            }
            throw new SecurityException("AutoType not allowed: " + typeName);
        }
    }
}
