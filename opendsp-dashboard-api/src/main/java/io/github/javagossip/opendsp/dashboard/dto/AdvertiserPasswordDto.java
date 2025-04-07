package io.github.javagossip.opendsp.dashboard.dto;

import lombok.Data;

@Data
public class AdvertiserPasswordDto {
    private Integer advertiserId;
    private String oldPassword;
    private String newPassword;
}
