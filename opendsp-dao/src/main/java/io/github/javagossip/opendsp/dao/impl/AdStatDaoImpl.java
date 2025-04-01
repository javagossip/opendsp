package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.AdStat;
import io.github.javagossip.opendsp.mapper.AdStatMapper;
import io.github.javagossip.opendsp.dao.AdStatDao;
import org.springframework.stereotype.Service;

/**
 *  服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class AdStatDaoImpl extends ServiceImpl<AdStatMapper, AdStat>  implements AdStatDao{

}
