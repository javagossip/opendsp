package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.CreativeStats;
import io.github.javagossip.opendsp.mapper.CreativeStatsMapper;
import io.github.javagossip.opendsp.dao.CreativeStatsDao;
import org.springframework.stereotype.Service;

/**
 *  服务层实现。
 *
 * @author weiping wang
 * @since 2025-04-16
 */
@Service
public class CreativeStatsDaoImpl extends ServiceImpl<CreativeStatsMapper, CreativeStats>  implements CreativeStatsDao{

}
