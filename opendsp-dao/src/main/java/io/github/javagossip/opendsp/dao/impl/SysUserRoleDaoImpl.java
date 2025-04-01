package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.SysUserRole;
import io.github.javagossip.opendsp.mapper.SysUserRoleMapper;
import io.github.javagossip.opendsp.dao.SysUserRoleDao;
import org.springframework.stereotype.Service;

/**
 * 用户角色关联表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class SysUserRoleDaoImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole>  implements SysUserRoleDao{

}
