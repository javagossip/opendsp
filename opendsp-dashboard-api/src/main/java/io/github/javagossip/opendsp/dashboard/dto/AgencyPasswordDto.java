package io.github.javagossip.opendsp.dashboard.dto;

import lombok.Data;

@Data
public class AgencyPasswordDto {

    private Integer agencyId;
    private String oldPassword;
    private String newPassword;
}
