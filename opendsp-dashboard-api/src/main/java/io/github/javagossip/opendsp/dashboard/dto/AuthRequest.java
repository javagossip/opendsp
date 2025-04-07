package io.github.javagossip.opendsp.dashboard.dto;

import lombok.Data;

@Data
public class AuthRequest {

    private String userName;
    private String password;
    //图片验证码
    private String captcha;
    //图片验证码id
    private String captchaId;
}
