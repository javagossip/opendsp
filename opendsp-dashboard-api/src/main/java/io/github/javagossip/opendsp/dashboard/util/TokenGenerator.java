package io.github.javagossip.opendsp.dashboard.util;


import java.util.UUID;

public class TokenGenerator {

    public static String generateToken() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
