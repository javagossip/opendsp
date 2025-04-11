package io.github.javagossip.opendsp.dashboard.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Preconditions;
import com.mybatisflex.core.paginate.Page;

import io.github.javagossip.opendsp.core.exception.BizException;
import io.github.javagossip.opendsp.dao.SysUserDao;
import io.github.javagossip.opendsp.dao.SysUserRoleDao;
import io.github.javagossip.opendsp.dashboard.dto.UserRolesDto;
import io.github.javagossip.opendsp.dashboard.validator.Validators;
import io.github.javagossip.opendsp.model.SysUser;
import io.github.javagossip.opendsp.model.SysUserRole;

@Service
public class SysUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysUserService.class);
    @Resource
    private SysUserDao sysUserDao;
    @Resource
    private SysUserRoleDao sysUserRoleDao;

    public void addOrUpdateUser(SysUser user) {
        LOGGER.info("addOrUpdateUser: {}", user);
        Validators.validate(user);
        sysUserDao.saveOrUpdate(user);
    }

    public Page<SysUser> listUsers(String name, int page, int size) {
        return sysUserDao.page(Page.of(page, size), sysUserDao.queryChain().like(SysUser::getName, name));
    }

    public void deleteUser(Long id) {
        boolean userExists = sysUserDao.exists(sysUserDao.queryChain().eq(SysUser::getId, id));
        if (!userExists) {
            throw new BizException("用户不存在：" + id);
        }
        sysUserDao.removeById(id);
    }

    @Transactional
    public void assignRoles(UserRolesDto userRolesDto) {
        LOGGER.info("assignRoles: {}", userRolesDto);
        Preconditions.checkNotNull(userRolesDto.getUserId(), "用户ID不能为空");

        sysUserRoleDao.remove(sysUserRoleDao.queryChain().eq(SysUserRole::getUserId, userRolesDto.getUserId()));
        if (userRolesDto.getRoleIds() == null) {
            return;
        }
        sysUserRoleDao.saveBatch(userRolesDto.getRoleIds().stream().map(roleId -> {
            SysUserRole sysUserRole = new SysUserRole();
            sysUserRole.setUserId(userRolesDto.getUserId());
            sysUserRole.setRoleId(roleId);
            return sysUserRole;
        }).toList());
    }
}
