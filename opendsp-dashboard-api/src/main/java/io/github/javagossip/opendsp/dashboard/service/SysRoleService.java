package io.github.javagossip.opendsp.dashboard.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Preconditions;
import com.mybatisflex.core.paginate.Page;

import io.github.javagossip.opendsp.dao.SysRoleDao;
import io.github.javagossip.opendsp.dao.SysRolePermissionDao;
import io.github.javagossip.opendsp.dashboard.constant.Constants.ErrorMessages;
import io.github.javagossip.opendsp.dashboard.dto.RolePermissionsDto;
import io.github.javagossip.opendsp.model.SysRole;
import io.github.javagossip.opendsp.model.SysRolePermission;

@Service
public class SysRoleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysRoleService.class);
    @Resource
    private SysRoleDao sysRoleDao;
    @Resource
    private SysRolePermissionDao sysRolePermissionDao;

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
        sysRolePermissionDao.remove(sysRolePermissionDao.queryChain()
                .eq(SysRolePermission::getRoleId, rolePermissionsDto.getRoleId()));
        sysRolePermissionDao.saveBatch(rolePermissionsDto.getPermissionIds().stream().map(permissionId -> {
            SysRolePermission sysRolePermission = new SysRolePermission();
            sysRolePermission.setRoleId(rolePermissionsDto.getRoleId());
            sysRolePermission.setPermissionId(permissionId);
            return sysRolePermission;
        }).toList());
    }
}
