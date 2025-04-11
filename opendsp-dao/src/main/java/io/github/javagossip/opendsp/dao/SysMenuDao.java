package io.github.javagossip.opendsp.dao;

import java.util.List;

import com.mybatisflex.core.service.IService;

import io.github.javagossip.opendsp.model.SysMenu;

/**
 * 系统菜单表 服务层。
 *
 * @author weiping wang
 * @since 2025-04-09
 */
public interface SysMenuDao extends IService<SysMenu> {

    List<SysMenu> selectMenusByUserId(Integer userId);
}
