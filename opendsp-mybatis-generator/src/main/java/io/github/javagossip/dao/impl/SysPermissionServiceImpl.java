package io.github.javagossip.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.model.SysPermission;
import io.github.javagossip.mapper.SysPermissionMapper;
import io.github.javagossip.dao.SysPermissionService;
import org.springframework.stereotype.Service;

/**
 * 系统权限表（支持菜单/按钮/API） 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission>  implements SysPermissionService{

}
