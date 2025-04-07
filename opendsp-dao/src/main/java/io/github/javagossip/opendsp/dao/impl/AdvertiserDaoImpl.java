package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.Advertiser;
import io.github.javagossip.opendsp.mapper.AdvertiserMapper;
import io.github.javagossip.opendsp.dao.AdvertiserDao;
import org.springframework.stereotype.Service;

/**
 * 广告主信息 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class AdvertiserDaoImpl extends ServiceImpl<AdvertiserMapper, Advertiser>  implements AdvertiserDao{

}
