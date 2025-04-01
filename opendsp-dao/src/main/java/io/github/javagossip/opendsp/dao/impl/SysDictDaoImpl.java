package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.SysDict;
import io.github.javagossip.opendsp.mapper.SysDictMapper;
import io.github.javagossip.opendsp.dao.SysDictDao;
import org.springframework.stereotype.Service;

/**
 * 系统字典表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class SysDictDaoImpl extends ServiceImpl<SysDictMapper, SysDict>  implements SysDictDao{

}
