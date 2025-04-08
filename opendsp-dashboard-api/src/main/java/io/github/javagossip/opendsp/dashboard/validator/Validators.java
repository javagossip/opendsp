package io.github.javagossip.opendsp.dashboard.validator;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Preconditions;

import io.github.javagossip.opendsp.dashboard.constant.Constants;
import io.github.javagossip.opendsp.dashboard.constant.Constants.ErrorMessages;
import io.github.javagossip.opendsp.dashboard.dto.AdvertiserAuditDto;
import io.github.javagossip.opendsp.dashboard.dto.AdvertiserPasswordDto;
import io.github.javagossip.opendsp.dashboard.dto.AgencyPasswordDto;
import io.github.javagossip.opendsp.model.AdGroup;
import io.github.javagossip.opendsp.model.Advertiser;
import io.github.javagossip.opendsp.model.Agency;
import io.github.javagossip.opendsp.model.SysUser;

/**
 * 校验器
 */
public class Validators {

    private Validators() {
    }

    public static void validate(AdGroup adGroup) {
        Preconditions.checkNotNull(adGroup);
        Preconditions.checkNotNull(adGroup.getCampaignId(), "所属推广计划id不能为空");
        Preconditions.checkNotNull(adGroup.getName(), "广告组名称不能为空");
        Preconditions.checkNotNull(adGroup.getDailyBudget(), "日预算不能为空");
        Preconditions.checkNotNull(adGroup.getAdvertiserId(), ErrorMessages.ADVERTISER_ID_IS_NULL);
        Preconditions.checkNotNull(adGroup.getPromotionType(), "推广类型不能为空");
        Preconditions.checkNotNull(adGroup.getBidMode(), "出价方式不能为空");
        Preconditions.checkNotNull(adGroup.getBidPrice(), "出价不能为空");
    }

    public static void validate(Advertiser advertiser) {
        Preconditions.checkNotNull(advertiser);
        Preconditions.checkNotNull(advertiser.getName(), "广告主名称不能为空");
        Preconditions.checkNotNull(advertiser.getBusinessLicense(), "营业执照不能为空");
        if (advertiser.getId() == null) {
            Preconditions.checkArgument(StringUtils.isNotBlank(advertiser.getPassword()), "密码不能为空");
            Preconditions.checkArgument(advertiser.getPassword().length() >= Constants.PASSWORD_MIN_LENGTH,
                    ErrorMessages.passwordMinLength());
        } else {
            advertiser.setPassword(null);
        }
    }

    public static void validate(AdvertiserAuditDto advertiserAuditDto) {
        Preconditions.checkNotNull(advertiserAuditDto);
        Preconditions.checkNotNull(advertiserAuditDto.getId(), ErrorMessages.ADVERTISER_ID_IS_NULL);
        Preconditions.checkNotNull(advertiserAuditDto.getAuditStatus(), "审核状态不能为空");
    }

    public static void validate(SysUser user) {
        Preconditions.checkNotNull(user);
        if (user.getId() == null) {
            Preconditions.checkNotNull(user.getName(), "用户名不能为空");
            Preconditions.checkNotNull(user.getPassword(), "密码不能为空");
        }
    }

    public static void validate(AdvertiserPasswordDto advertiserPasswordDto) {
        Preconditions.checkNotNull(advertiserPasswordDto);
        Preconditions.checkNotNull(advertiserPasswordDto.getOldPassword(), "旧密码不能为空");
        Preconditions.checkNotNull(advertiserPasswordDto.getNewPassword(), "新密码不能为空");
        Preconditions.checkNotNull(advertiserPasswordDto.getAdvertiserId(), "广告主id不能为空");
        Preconditions.checkArgument(advertiserPasswordDto.getNewPassword().length() >= 8, "新密码长度不能小于8位");
    }

    public static void validate(Agency agency) {
        Preconditions.checkNotNull(agency);
        Preconditions.checkNotNull(agency.getName(), "代理商名称不能为空");
        //如果是新增操作，则密码不能为空
        if (agency.getId() == null) {
            Preconditions.checkArgument(StringUtils.isNotBlank(agency.getPassword()), "新增代理商密码不能为空");
            Preconditions.checkArgument(agency.getPassword().length() >= Constants.PASSWORD_MIN_LENGTH,
                    ErrorMessages.passwordMinLength());
        } else {
            //如果是更新操作，则重置密码为null
            agency.setPassword(null);
        }
    }

    public static void validate(AgencyPasswordDto agencyPasswordDto) {
        Preconditions.checkNotNull(agencyPasswordDto);
        Preconditions.checkNotNull(agencyPasswordDto.getOldPassword(), "旧密码不能为空");
        Preconditions.checkNotNull(agencyPasswordDto.getNewPassword(), "新密码不能为空");
        Preconditions.checkNotNull(agencyPasswordDto.getAgencyId(), "代理商id不能为空");
        Preconditions.checkArgument(agencyPasswordDto.getNewPassword().length() >= Constants.PASSWORD_MIN_LENGTH,
                ErrorMessages.passwordMinLength());
    }
}
