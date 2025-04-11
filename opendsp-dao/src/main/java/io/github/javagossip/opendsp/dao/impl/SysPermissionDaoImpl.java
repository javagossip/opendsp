package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.SysPermission;
import io.github.javagossip.opendsp.mapper.SysPermissionMapper;
import io.github.javagossip.opendsp.dao.SysPermissionDao;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 系统权限表（支持菜单/按钮/API） 服务层实现。
 *
 * @author weiping wang
 * @since 2025-04-09
 */
@Service
public class SysPermissionDaoImpl extends ServiceImpl<SysPermissionMapper, SysPermission>  implements SysPermissionDao{

    @Override
    public List<SysPermission> selectPermissionsByUserId(Integer userId) {
        return getMapper().selectPermissionsByUserId(userId);
    }
}
