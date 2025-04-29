package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.SysDict;
import io.github.javagossip.opendsp.mapper.SysDictMapper;
import io.github.javagossip.opendsp.dao.SysDictDao;
import org.springframework.stereotype.Service;

/**
 * 通用字典表（支持类型和树结构) 服务层实现。
 *
 * @author weiping wang
 * @since 2025-04-28
 */
@Service
public class SysDictDaoImpl extends ServiceImpl<SysDictMapper, SysDict>  implements SysDictDao{

}
