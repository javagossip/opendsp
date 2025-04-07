package io.github.javagossip.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.model.SysUser;
import io.github.javagossip.mapper.SysUserMapper;
import io.github.javagossip.dao.SysUserService;
import org.springframework.stereotype.Service;

/**
 * 系统用户表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>  implements SysUserService{

}
