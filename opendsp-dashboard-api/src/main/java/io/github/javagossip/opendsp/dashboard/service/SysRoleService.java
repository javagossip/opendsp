package io.github.javagossip.opendsp.dashboard.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Preconditions;
import com.mybatisflex.core.paginate.Page;

import io.github.javagossip.opendsp.dao.SysMenuDao;
import io.github.javagossip.opendsp.dao.SysRoleDao;
import io.github.javagossip.opendsp.dao.SysRoleMenuDao;
import io.github.javagossip.opendsp.dao.SysRolePermissionDao;
import io.github.javagossip.opendsp.dashboard.constant.Constants.ErrorMessages;
import io.github.javagossip.opendsp.dashboard.dto.RoleMenusDto;
import io.github.javagossip.opendsp.dashboard.dto.RolePermissionsDto;
import io.github.javagossip.opendsp.model.SysMenu;
import io.github.javagossip.opendsp.model.SysRole;
import io.github.javagossip.opendsp.model.SysRoleMenu;
import io.github.javagossip.opendsp.model.SysRolePermission;

@Service
public class SysRoleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysRoleService.class);
    @Resource
    private SysRoleDao sysRoleDao;
    @Resource
    private SysRolePermissionDao sysRolePermissionDao;
    @Resource
    private SysRoleMenuDao sysRoleMenuDao;
    @Resource
    private SysMenuDao sysMenuDao;

    public void addOrUpdateRole(SysRole role) {
        sysRoleDao.saveOrUpdate(role);
    }

    public void deleteRole(int id) {
        LOGGER.info("deleteRole: {}", id);
        Preconditions.checkArgument(sysRoleDao.exists(sysRoleDao.queryChain().eq(SysRole::getId, id)),
                ErrorMessages.roleNotExistsById(id));
        sysRoleDao.removeById(id);
    }

    public Page<SysRole> listRoles(String name, int page, int size) {
        return sysRoleDao.page(Page.of(page, size), sysRoleDao.queryChain().like(SysRole::getName, name));
    }

    @Transactional
    public void assignPermissions(RolePermissionsDto rolePermissionsDto) {
        LOGGER.info("assignPermissions: {}", rolePermissionsDto);
        Preconditions.checkNotNull(rolePermissionsDto.getRoleId(), "角色ID不能为空");

        sysRolePermissionDao.remove(sysRolePermissionDao.queryChain()
                .eq(SysRolePermission::getRoleId, rolePermissionsDto.getRoleId()));
        if (rolePermissionsDto.getPermissionIds() == null || rolePermissionsDto.getPermissionIds().isEmpty()) {
            LOGGER.info("The permission ID list is empty, clear all permissions associated with the role: {}",
                    rolePermissionsDto.getRoleId());
            return;
        }
        sysRolePermissionDao.saveBatch(rolePermissionsDto.getPermissionIds().stream().map(permissionId -> {
            SysRolePermission sysRolePermission = new SysRolePermission();
            sysRolePermission.setRoleId(rolePermissionsDto.getRoleId());
            sysRolePermission.setPermissionId(permissionId);
            return sysRolePermission;
        }).toList());
    }

    @Transactional
    public void assignMenus(RoleMenusDto roleMenusDto) {
        LOGGER.info("assignMenus: {}", roleMenusDto);
        Preconditions.checkNotNull(roleMenusDto.getRoleId(), "角色ID不能为空");

        sysRoleMenuDao.remove(sysRoleMenuDao.queryChain().eq(SysRoleMenu::getRoleId, roleMenusDto.getRoleId()));
        if (roleMenusDto.getMenuIds() == null || roleMenusDto.getMenuIds().isEmpty()) {
            LOGGER.info("The menu ID list is empty, clear all menus associated with the role: {}",
                    roleMenusDto.getRoleId());
            return;
        }

        Set<Integer> assignMenuIds = resolveAllMenuIds(roleMenusDto.getMenuIds());
        sysRoleMenuDao.saveBatch(assignMenuIds.stream().map(menuId -> {
            SysRoleMenu sysRoleMenu = new SysRoleMenu();
            sysRoleMenu.setRoleId(roleMenusDto.getRoleId());
            sysRoleMenu.setMenuId(menuId);
            return sysRoleMenu;
        }).toList());
    }

    //判断所有子菜单对应的上级菜单是否在传入的菜单列表中，如果不在则加入，确保菜单数据完整
    private Set<Integer> resolveAllMenuIds(List<Integer> menuIds) {
        Set<Integer> result = new HashSet<>(menuIds);
        for (Integer menuId : menuIds) {
            result.addAll(getAllParentMenuIds(menuId));
        }
        return result;
    }

    private Set<Integer> getAllParentMenuIds(Integer menuId) {
        Set<Integer> result = new HashSet<>();
        SysMenu sysMenu = sysMenuDao.getById(menuId);
        if (sysMenu != null && sysMenu.getParentId() != null) {
            result.add(sysMenu.getParentId());
            result.addAll(getAllParentMenuIds(sysMenu.getParentId()));
        }
        return result;
    }
}
