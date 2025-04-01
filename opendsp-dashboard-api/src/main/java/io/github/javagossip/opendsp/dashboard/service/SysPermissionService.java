package io.github.javagossip.opendsp.dashboard.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mybatisflex.core.paginate.Page;

import io.github.javagossip.opendsp.dao.SysPermissionDao;
import io.github.javagossip.opendsp.model.SysPermission;

@Service
public class SysPermissionService {

    @Resource
    private SysPermissionDao sysPermissionDao;

    public void addOrUpdatePermission(SysPermission permission) {
        sysPermissionDao.saveOrUpdate(permission);
    }

    public Page<SysPermission> listPermissions(String name, int page, int size) {
        return sysPermissionDao.page(Page.of(page, size),
                sysPermissionDao.queryChain().like(SysPermission::getName, name));
    }

    public void deletePermission(int id) {
        sysPermissionDao.removeById(id);
    }
}
