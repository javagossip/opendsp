package io.github.javagossip.opendsp.dashboard.util;

import java.nio.charset.StandardCharsets;

import org.mindrot.jbcrypt.BCrypt;

import com.google.common.base.Preconditions;
import com.google.common.hash.Hashing;

/**
 * 密码生成工具类,采用bcrypt算法生成密码
 */
public class PasswordUtil {

    private PasswordUtil() {
    }

    /**
     * 生成密码
     *
     * @param password 明文密码
     * @return 加密后的密码
     */
    public static String genPwd(String password) {
        Preconditions.checkNotNull(password, "密码不能为空");
        return BCrypt.hashpw(sha256(password), BCrypt.gensalt());
    }

    /**
     * 验证密码
     *
     * @param password 明文密码
     * @param hashed 加密后的密码
     * @return 是否匹配
     */
    public static boolean verify(String password, String hashed) {
        Preconditions.checkNotNull(password, "密码不能为空");
        return BCrypt.checkpw(sha256(password), hashed);
    }

    private static String sha256(String str) {
        return Hashing.sha256().hashString(str, StandardCharsets.UTF_8).toString();
    }
}
