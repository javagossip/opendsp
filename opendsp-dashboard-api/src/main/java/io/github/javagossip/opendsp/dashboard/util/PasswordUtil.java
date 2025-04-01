package io.github.javagossip.opendsp.dashboard.util;

import org.mindrot.jbcrypt.BCrypt;

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
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    /**
     * 验证密码
     *
     * @param password 明文密码
     * @param hashed 加密后的密码
     * @return 是否匹配
     */
    public static boolean verify(String password, String hashed) {
        return BCrypt.checkpw(password, hashed);
    }
}
