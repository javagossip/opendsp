package io.github.javagossip.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.model.SysRole;
import io.github.javagossip.mapper.SysRoleMapper;
import io.github.javagossip.dao.SysRoleService;
import org.springframework.stereotype.Service;

/**
 * 角色表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole>  implements SysRoleService{

}
