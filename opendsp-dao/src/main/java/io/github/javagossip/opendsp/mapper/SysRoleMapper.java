package io.github.javagossip.opendsp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.mybatisflex.core.BaseMapper;

import io.github.javagossip.opendsp.model.SysRole;

/**
 * 角色表 映射层。
 *
 * @author weiping wang
 * @since 2025-04-09
 */
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {

    @Select(" SELECT r.* FROM sys_role r LEFT JOIN sys_user_role ur ON ur.role_id = r.id WHERE ur.user_id = #{userId}")
    List<SysRole> selectRolesByUserId(@Param("userId") Integer userId);
}
