package io.github.javagossip.opendsp.dashboard.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.google.common.base.Preconditions;
import com.mybatisflex.core.paginate.Page;

import io.github.javagossip.opendsp.dao.SysPermissionDao;
import io.github.javagossip.opendsp.dashboard.validator.Validators;
import io.github.javagossip.opendsp.model.SysPermission;

@Service
public class SysPermissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysPermissionService.class);

    @Resource
    private SysPermissionDao sysPermissionDao;

    public void addOrUpdatePermission(SysPermission permission) {
        LOGGER.info("addOrUpdatePermission: {}", permission);
        Validators.validate(permission);

        Preconditions.checkArgument(!sysPermissionDao.exists(sysPermissionDao.queryChain()
                .eq(SysPermission::getName, permission.getName())), "权限已存在: " + permission.getName());
        Preconditions.checkArgument(!sysPermissionDao.exists(sysPermissionDao.queryChain()
                .eq(SysPermission::getKey, permission.getKey())), "权限key已存在: " + permission.getKey());

        sysPermissionDao.saveOrUpdate(permission);
    }

    public Page<SysPermission> listPermissions(String name, int page, int size) {
        return sysPermissionDao.page(Page.of(page, size),
                sysPermissionDao.queryChain().like(SysPermission::getName, name));
    }

    public void deletePermission(int id) {
        LOGGER.info("deletePermission: {}", id);
        sysPermissionDao.removeById(id);
    }

    public SysPermission getPermission(int id) {
        return sysPermissionDao.getById(id);
    }
}
