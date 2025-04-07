package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.SysRole;
import io.github.javagossip.opendsp.mapper.SysRoleMapper;
import io.github.javagossip.opendsp.dao.SysRoleDao;
import org.springframework.stereotype.Service;

/**
 * 角色表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class SysRoleDaoImpl extends ServiceImpl<SysRoleMapper, SysRole>  implements SysRoleDao{

}
