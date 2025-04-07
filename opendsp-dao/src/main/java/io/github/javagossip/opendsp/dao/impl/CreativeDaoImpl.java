package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.Creative;
import io.github.javagossip.opendsp.mapper.CreativeMapper;
import io.github.javagossip.opendsp.dao.CreativeDao;
import org.springframework.stereotype.Service;

/**
 * 广告创意 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class CreativeDaoImpl extends ServiceImpl<CreativeMapper, Creative>  implements CreativeDao{

}
