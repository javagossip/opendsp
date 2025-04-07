package io.github.javagossip.opendsp.dashboard.constant;

import java.util.UUID;

public class Constants {

    public interface ErrorCodes {

        int SUCCESS = 0;
        int FAILURE = 1;
    }

    public interface ErrorMessages {

        String ADVERTISER_ID_IS_NULL = "广告主id不能为空";
        String ADVERTISER_NAME_IS_NULL = "广告主名称不能为空";
        String ADVERTISER_EXISTS = "广告主%s已存在";
        String ADVERTISER_NOT_EXISTS = "广告主id为%s的广告主不存在";
        String USER_NOT_EXISTS = "用户[%s]不存在";
        String USER_NOT_EXISTS_BY_ID = "系统用户不存在，用户id:[%s]";
        String ADVERTISER_UNBIND_SYS_USER = "广告主未绑定系统用户账号";

        static String userNotExists(String userName) {
            return String.format(USER_NOT_EXISTS, userName);
        }

        static String advertiserNotExists(Integer advertiserId) {
            return String.format(ADVERTISER_NOT_EXISTS, advertiserId);
        }

        static String userNotExistsById(Integer sysUserId) {
            return String.format(USER_NOT_EXISTS_BY_ID, sysUserId);
        }
    }

    public interface UserTypes {

        //广告主
        int USER_TYPE_ADVERTISER = 1;
        //代理商
        int USER_TYPE_AGENCY = 2;
        //普通用户
        int USER_TYPE_NORMAL = 3;
        //管理员
        int USER_TYPE_ADMIN = 4;
    }

    public interface UserStatus {

        int USER_STATUS_ENABLE = 1;
        int USER_STATUS_DISABLE = 0;
        int USER_STATUS_DELETE = -1;
    }

    public interface RedisKeys {

        String KEY_AUTH_TOKEN = "auth:token:%s";

        public static String authToken() {
            return String.format(KEY_AUTH_TOKEN, UUID.randomUUID().toString().replace("-", ""));
        }
    }
}
