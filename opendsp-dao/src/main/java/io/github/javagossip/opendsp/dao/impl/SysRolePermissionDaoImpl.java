package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.SysRolePermission;
import io.github.javagossip.opendsp.mapper.SysRolePermissionMapper;
import io.github.javagossip.opendsp.dao.SysRolePermissionDao;
import org.springframework.stereotype.Service;

/**
 * 角色权限关联表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class SysRolePermissionDaoImpl extends ServiceImpl<SysRolePermissionMapper, SysRolePermission>  implements SysRolePermissionDao{

}
