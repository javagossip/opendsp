package io.github.javagossip.opendsp.dao;

import java.util.List;

import com.mybatisflex.core.service.IService;

import io.github.javagossip.opendsp.model.SysRole;

/**
 * 角色表 服务层。
 *
 * @author weiping wang
 * @since 2025-04-09
 */
public interface SysRoleDao extends IService<SysRole> {

    List<SysRole> selectRolesByUserId(Integer userId);
}
