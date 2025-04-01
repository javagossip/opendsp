package io.github.javagossip.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.model.SysUserRole;
import io.github.javagossip.mapper.SysUserRoleMapper;
import io.github.javagossip.dao.SysUserRoleService;
import org.springframework.stereotype.Service;

/**
 * 用户角色关联表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole>  implements SysUserRoleService{

}
