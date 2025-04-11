package io.github.javagossip.opendsp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.mybatisflex.core.BaseMapper;

import io.github.javagossip.opendsp.model.SysPermission;

/**
 * 系统权限表（支持菜单/按钮/API） 映射层。
 *
 * @author weiping wang
 * @since 2025-04-09
 */
@Mapper
public interface SysPermissionMapper extends BaseMapper<SysPermission> {

    @Select("SELECT p.* FROM sys_permission p LEFT JOIN sys_role_permission rp ON rp.permission_id = p.id LEFT JOIN " +
            "sys_user_role ur ON ur.role_id = rp.role_id WHERE ur.user_id = #{userId}")
    List<SysPermission> selectPermissionsByUserId(Integer userId);
}
