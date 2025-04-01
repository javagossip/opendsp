package io.github.javagossip.opendsp.dashboard.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mybatisflex.core.paginate.Page;

import io.github.javagossip.opendsp.dao.SysUserDao;
import io.github.javagossip.opendsp.dao.SysUserRoleDao;
import io.github.javagossip.opendsp.dashboard.dto.UserRolesDto;
import io.github.javagossip.opendsp.dashboard.validator.Validators;
import io.github.javagossip.opendsp.model.SysUser;
import io.github.javagossip.opendsp.model.SysUserRole;

import org.springframework.transaction.annotation.Transactional;

@Service
public class SysUserService {

    @Resource
    private SysUserDao sysUserDao;
    @Resource
    private SysUserRoleDao sysUserRoleDao;

    public void addOrUpdateUser(SysUser user) {
        Validators.validate(user);
        sysUserDao.saveOrUpdate(user);
    }

    public Page<SysUser> listUsers(String name, int page, int size) {
        return sysUserDao.page(Page.of(page, size), sysUserDao.queryChain().eq(SysUser::getName, name));
    }

    public void deleteUser(Long id) {
        sysUserDao.removeById(id);
    }

    @Transactional
    public void assignRoles(UserRolesDto userRolesDto) {
        sysUserRoleDao.remove(sysUserRoleDao.queryChain().eq(SysUserRole::getUserId, userRolesDto.getUserId()));
        sysUserRoleDao.saveBatch(userRolesDto.getRoleIds().stream().map(roleId -> {
            SysUserRole sysUserRole = new SysUserRole();
            sysUserRole.setUserId(userRolesDto.getUserId());
            sysUserRole.setRoleId(roleId);
            return sysUserRole;
        }).toList());
    }
}
