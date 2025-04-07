package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;

import io.github.javagossip.opendsp.dao.SysUserDao;
import io.github.javagossip.opendsp.mapper.SysUserMapper;
import io.github.javagossip.opendsp.model.SysUser;

import org.springframework.stereotype.Service;

/**
 * 系统用户表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-28
 */
@Service
public class SysUserDaoImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserDao {

}
