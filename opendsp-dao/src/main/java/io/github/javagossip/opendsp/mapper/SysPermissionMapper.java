package io.github.javagossip.opendsp.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.mybatisflex.core.BaseMapper;
import io.github.javagossip.opendsp.model.SysPermission;

/**
 * 系统权限表（支持菜单/按钮/API） 映射层。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Mapper
public interface SysPermissionMapper extends BaseMapper<SysPermission> {

}
