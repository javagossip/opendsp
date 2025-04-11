package io.github.javagossip.opendsp.dashboard.dto;

import java.util.List;

import io.github.javagossip.opendsp.model.SysPermission;
import io.github.javagossip.opendsp.model.SysRole;
import io.github.javagossip.opendsp.model.SysUser;
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
    //用户基本信息
    //用户角色信息
    //用户权限信息
    //用户菜单信息
    private SysUser user;
    private List<SysMenuDto> menus;
    private List<SysRole> roles;
    private List<SysPermission> permissions;
}
