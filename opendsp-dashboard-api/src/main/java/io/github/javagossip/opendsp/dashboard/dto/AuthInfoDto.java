package io.github.javagossip.opendsp.dashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthInfoDto {

    private String token;
    private String userName;
    private Integer userType;
    private Integer userId;
}
