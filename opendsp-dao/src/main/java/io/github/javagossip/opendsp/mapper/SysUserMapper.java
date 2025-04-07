package io.github.javagossip.opendsp.mapper;

import com.mybatisflex.core.BaseMapper;

import io.github.javagossip.opendsp.model.SysUser;

import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户表 映射层。
 *
 * @author weiping wang
 * @since 2025-03-28
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}
