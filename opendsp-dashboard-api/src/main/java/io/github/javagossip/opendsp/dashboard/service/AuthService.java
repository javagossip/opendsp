package io.github.javagossip.opendsp.dashboard.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.google.common.base.Preconditions;

import io.github.javagossip.opendsp.core.exception.BizException;
import io.github.javagossip.opendsp.dao.SysUserDao;
import io.github.javagossip.opendsp.dashboard.constant.Constants.ErrorMessages;
import io.github.javagossip.opendsp.dashboard.dto.AuthInfoDto;
import io.github.javagossip.opendsp.dashboard.dto.AuthRequest;
import io.github.javagossip.opendsp.dashboard.util.PasswordUtil;
import io.github.javagossip.opendsp.model.SysUser;

import static io.github.javagossip.opendsp.model.table.SysUserTableDef.*;

@Service
public class AuthService {

    @Resource
    private SysUserService userService;
    @Resource
    private SysUserDao sysUserDao;

    public AuthInfoDto signIn(AuthRequest authRequest) {
        SysUser sysUser = sysUserDao.getOne(SYS_USER.NAME.eq(authRequest.getUserName()));
        Preconditions.checkNotNull(sysUser, ErrorMessages.userNotExists(authRequest.getUserName()));

        if (PasswordUtil.verify(authRequest.getPassword(), sysUser.getPassword())) {
            throw new BizException("密码输入错误");
        }
        return null;
    }

    public void signOut() {
    }
}
