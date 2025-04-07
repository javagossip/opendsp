package io.github.javagossip.opendsp.dashboard.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRolesDto {

    private Integer userId;
    private List<Integer> roleIds;
}
