package io.github.javagossip.opendsp.dashboard.factory;

import io.github.javagossip.opendsp.dashboard.dto.SysMenuDto;
import io.github.javagossip.opendsp.model.SysMenu;

public class SysMenuDtoFactory {

    private SysMenuDtoFactory() {
    }

    public static SysMenuDto withSysMenu(SysMenu sysMenu) {
        SysMenuDto sysMenuDto = new SysMenuDto();
        sysMenuDto.setId(sysMenu.getId());
        sysMenuDto.setParentId(sysMenu.getParentId());
        sysMenuDto.setName(sysMenu.getName());
        sysMenuDto.setPath(sysMenu.getPath());
        sysMenuDto.setComponent(sysMenu.getComponent());
        sysMenuDto.setIcon(sysMenu.getIcon());
        sysMenuDto.setPermission(sysMenu.getPermission());
        sysMenuDto.setRemark(sysMenu.getRemark());
        return sysMenuDto;
    }
}
