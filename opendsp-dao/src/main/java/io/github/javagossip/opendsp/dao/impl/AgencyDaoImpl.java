package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.Agency;
import io.github.javagossip.opendsp.mapper.AgencyMapper;
import io.github.javagossip.opendsp.dao.AgencyDao;
import org.springframework.stereotype.Service;

/**
 * 代理商信息 服务层实现。
 *
 * @author weiping wang
 * @since 2025-04-07
 */
@Service
public class AgencyDaoImpl extends ServiceImpl<AgencyMapper, Agency>  implements AgencyDao{

}
