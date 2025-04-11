package io.github.javagossip.opendsp.dao;

import java.util.List;

import com.mybatisflex.core.service.IService;

import io.github.javagossip.opendsp.model.SysPermission;

/**
 * 系统权限表（支持菜单/按钮/API） 服务层。
 *
 * @author weiping wang
 * @since 2025-04-09
 */
public interface SysPermissionDao extends IService<SysPermission> {

    List<SysPermission> selectPermissionsByUserId(Integer userId);
}
