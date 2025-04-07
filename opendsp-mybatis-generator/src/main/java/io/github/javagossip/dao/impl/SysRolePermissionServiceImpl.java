package io.github.javagossip.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.model.SysRolePermission;
import io.github.javagossip.mapper.SysRolePermissionMapper;
import io.github.javagossip.dao.SysRolePermissionService;
import org.springframework.stereotype.Service;

/**
 * 角色权限关联表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class SysRolePermissionServiceImpl extends ServiceImpl<SysRolePermissionMapper, SysRolePermission>  implements SysRolePermissionService{

}
