package io.github.javagossip.opendsp.dashboard.constant;

import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;

public class Constants {

    public static final int PASSWORD_MIN_LENGTH = 6;

    public static final int DEFAULT_TOKEN_EXPIRE_TIME = 3600 * 24 * 7; // 7天

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
        String AGENCY_NOT_EXISTS = "代理商不存在,ID：[%s]";
        String AGENCY_UNBIND_SYS_USER = "代理商未绑定系统用户账号";
        String MENU_ID_IS_NULL = "菜单id不能为空";
        String MENU_HAS_SUB_MENUS = "菜单下有子菜单，请先删除子菜单";
        String DICT_TYPE_IS_NULL = "字典类型不能为空";
        String DICT_TYPE_EXISTS = "字典类型已存在";

        static String userNotExists(String userName) {
            return String.format(USER_NOT_EXISTS, userName);
        }

        static String advertiserNotExists(Integer advertiserId) {
            return String.format(ADVERTISER_NOT_EXISTS, advertiserId);
        }

        static String userNotExistsById(Integer sysUserId) {
            return String.format(USER_NOT_EXISTS_BY_ID, sysUserId);
        }

        static String agencyNotExistsById(Integer agencyId) {
            return String.format(AGENCY_NOT_EXISTS, agencyId);
        }

        static String passwordMinLength() {
            return String.format("密码长度不能小于%s位", PASSWORD_MIN_LENGTH);
        }

        static String roleNotExistsById(int id) {
            return String.format("角色不存在, id: %s", id);
        }
    }

    public interface TimeWindow {
        int DAY = 1;
        int WEEK = 2;
        int MONTH = 3;
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
        String KEY_ADVERTISER_BALANCE = "advertiser:balance:%s"; //advertiser:balance:{advertiserId}
        String KEY_AGENCY_BALANCE = "agency:balance:%s"; //agency:balance:{agencyId}
        String KEY_CAMPAIGN_BUDGET = "campaign:budget:%s:%s"; //campaign:budget:{campaignId}:{yyMMdd}
        String KEY_ADGROUP_BUDGET = "adgroup:budget:%s:%s"; //adgroup:budget:{adgroupId}:{yyMMdd}
        String KEY_CREATIVE_METRICS = "creative:metrics:%s:%s"; //creative:metrics:{creativeId}:{yyyyMMddHH}

        static String authToken(String token) {
            return String.format(KEY_AUTH_TOKEN, token);
        }

        static String advertiserBalance(int advertiserId) {
            return String.format(KEY_ADVERTISER_BALANCE, advertiserId);
        }

        static String agencyBalance(int agencyId) {
            return String.format(KEY_AGENCY_BALANCE, agencyId);
        }

        static String campaignDailyBudget(int campaignId, Date date) {
            return String.format(KEY_CAMPAIGN_BUDGET, campaignId, DateFormatUtils.format(date, "yyMMdd"));
        }

        static String adgroupDailyBudget(int adgroupId, Date date) {
            return String.format(KEY_ADGROUP_BUDGET, adgroupId, DateFormatUtils.format(date, "yyMMdd"));
        }

        //广告创意每日统计数据
        static String creativeMetrics(int creativeId, Date date) {
            return String.format(KEY_CREATIVE_METRICS, creativeId);
        }
    }
}
