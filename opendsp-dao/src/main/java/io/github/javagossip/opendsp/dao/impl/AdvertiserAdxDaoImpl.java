package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.AdvertiserAdx;
import io.github.javagossip.opendsp.mapper.AdvertiserAdxMapper;
import io.github.javagossip.opendsp.dao.AdvertiserAdxDao;
import org.springframework.stereotype.Service;

/**
 * 广告主-adx关联表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class AdvertiserAdxDaoImpl extends ServiceImpl<AdvertiserAdxMapper, AdvertiserAdx>  implements AdvertiserAdxDao{

}
