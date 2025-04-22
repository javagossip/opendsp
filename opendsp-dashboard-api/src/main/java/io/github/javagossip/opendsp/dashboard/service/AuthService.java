package io.github.javagossip.opendsp.dashboard.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.google.common.base.Preconditions;

import io.github.javagossip.opendsp.core.exception.BizException;
import io.github.javagossip.opendsp.dao.SysPermissionDao;
import io.github.javagossip.opendsp.dao.SysRoleDao;
import io.github.javagossip.opendsp.dao.SysUserDao;
import io.github.javagossip.opendsp.dashboard.constant.Constants.ErrorMessages;
import io.github.javagossip.opendsp.dashboard.dto.AuthContext;
import io.github.javagossip.opendsp.dashboard.dto.AuthInfoDto;
import io.github.javagossip.opendsp.dashboard.dto.AuthRequest;
import io.github.javagossip.opendsp.dashboard.dto.SysMenuDto;
import io.github.javagossip.opendsp.dashboard.util.PasswordUtil;
import io.github.javagossip.opendsp.dashboard.util.TokenGenerator;
import io.github.javagossip.opendsp.model.SysPermission;
import io.github.javagossip.opendsp.model.SysRole;
import io.github.javagossip.opendsp.model.SysUser;

import static io.github.javagossip.opendsp.model.table.SysUserTableDef.*;

@Service
public class AuthService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthService.class);

    @Resource
    private SysUserService userService;
    //这里默认使用redis作为token存储，如果使用其他存储方式，请修改为对应的{@link TokenService}实现类
    @Resource(name = "redisTs")
    private TokenService tokenService;
    @Resource
    private SysUserDao sysUserDao;
    @Resource
    private SysRoleDao sysRoleDao;
    @Resource
    private SysPermissionDao sysPermissionDao;
    @Resource
    private SysMenuService sysMenuService;

    public AuthInfoDto auth(AuthRequest authRequest) {
        SysUser sysUser = sysUserDao.getOne(SYS_USER.NAME.eq(authRequest.getUserName()));
        Preconditions.checkNotNull(sysUser, ErrorMessages.userNotExists(authRequest.getUserName()));

        if (PasswordUtil.verify(authRequest.getPassword(), sysUser.getPassword())) {
            throw new BizException("密码输入错误");
        }

        List<SysRole> userRoles = sysRoleDao.selectRolesByUserId(sysUser.getId());
        List<SysPermission> userPermissions = sysPermissionDao.selectPermissionsByUserId(sysUser.getId());
        List<SysMenuDto> menus = sysMenuService.listUserMenus(sysUser.getId());

        AuthInfoDto authInfoDto = AuthInfoDto.builder()
                .token(TokenGenerator.generateToken())
                .user(sysUser)
                .roles(userRoles)
                .menus(menus)
                .permissions(userPermissions)
                .build();
        LOGGER.info("用户{}登录成功, token:{}", sysUser.getName(), authInfoDto.getToken());
        tokenService.saveToken(authInfoDto.getToken(), authInfoDto);
        return authInfoDto;
    }

    public void verifyToken(String token) {
        Preconditions.checkArgument(StringUtils.isNotBlank(token), "token不能为空");
        AuthInfoDto authInfo = tokenService.getAndRefreshToken(token);
        if (authInfo == null) {
            throw new BizException("token无效或已过期");
        }
        AuthContext.get().setAuthInfo(authInfo);
    }

    public void logout() {
        AuthInfoDto authInfo = AuthContext.getAuthInfo();
        if (authInfo == null) {
            return;
        }
        AuthContext.get().clear();
        tokenService.removeToken(authInfo.getToken());
    }
}
