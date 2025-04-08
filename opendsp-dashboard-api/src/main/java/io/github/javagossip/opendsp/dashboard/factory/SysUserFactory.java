package io.github.javagossip.opendsp.dashboard.factory;

import io.github.javagossip.opendsp.dashboard.constant.Constants.UserTypes;
import io.github.javagossip.opendsp.dashboard.util.PasswordUtil;
import io.github.javagossip.opendsp.dashboard.validator.Validators;
import io.github.javagossip.opendsp.model.Advertiser;
import io.github.javagossip.opendsp.model.Agency;
import io.github.javagossip.opendsp.model.SysUser;

public class SysUserFactory {

    private SysUserFactory() {
    }

    public static SysUser withAdvertiser(Advertiser advertiser) {
        Validators.validate(advertiser);
        return SysUser.builder()
                .name(advertiser.getName())
                .type(UserTypes.USER_TYPE_ADVERTISER)
                .email(advertiser.getEmail())
                .id(advertiser.getSysUserId())
                .password(PasswordUtil.genPwd(advertiser.getPassword()))
                .build();
    }

    public static SysUser withAgency(Agency agency) {
        Validators.validate(agency);
        return SysUser.builder()
                .name(agency.getName())
                .id(agency.getSysUserId())
                .password(PasswordUtil.genPwd(agency.getPassword()))
                .type(UserTypes.USER_TYPE_AGENCY)
                .build();
    }
}
