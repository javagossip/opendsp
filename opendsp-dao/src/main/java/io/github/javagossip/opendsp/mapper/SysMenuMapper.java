package io.github.javagossip.opendsp.mapper;

import org.apache.ibatis.annotations.Mapper;
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

}
