package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.SysMenu;
import io.github.javagossip.opendsp.mapper.SysMenuMapper;
import io.github.javagossip.opendsp.dao.SysMenuDao;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 系统菜单表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-04-09
 */
@Service
public class SysMenuDaoImpl extends ServiceImpl<SysMenuMapper, SysMenu>  implements SysMenuDao{

    @Override
    public List<SysMenu> selectMenusByUserId(Integer userId) {
        return getMapper().selectListByUserId(userId);
    }
}
