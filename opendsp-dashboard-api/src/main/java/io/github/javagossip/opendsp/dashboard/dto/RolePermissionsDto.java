package io.github.javagossip.opendsp.dashboard.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RolePermissionsDto {

    private Integer roleId;
    private List<Integer> permissionIds;
}
