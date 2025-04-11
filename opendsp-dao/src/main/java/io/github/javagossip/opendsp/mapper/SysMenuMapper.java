package io.github.javagossip.opendsp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.mybatisflex.core.BaseMapper;

import io.github.javagossip.opendsp.model.SysMenu;

/**
 * 系统菜单表 映射层。
 *
 * @author weiping wang
 * @since 2025-04-09
 */
@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    // 使用表连接的方式重写SQL查询
    @Select("SELECT m.* FROM sys_menu m LEFT JOIN sys_role_menu rm ON m.id = rm.menu_id LEFT JOIN sys_user_role ur ON" +
            " rm.role_id = ur.role_id WHERE ur.user_id = #{userId}")
    List<SysMenu> selectListByUserId(Integer userId);
}
