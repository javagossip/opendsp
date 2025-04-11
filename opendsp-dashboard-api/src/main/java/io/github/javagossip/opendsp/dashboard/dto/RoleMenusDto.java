package io.github.javagossip.opendsp.dashboard.dto;

import java.util.List;

import lombok.Data;

@Data
public class RoleMenusDto {

    private Integer roleId;
    private List<Integer> menuIds;
}
