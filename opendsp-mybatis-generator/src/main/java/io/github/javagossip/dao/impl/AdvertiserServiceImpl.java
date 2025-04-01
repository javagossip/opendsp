package io.github.javagossip.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.model.Advertiser;
import io.github.javagossip.mapper.AdvertiserMapper;
import io.github.javagossip.dao.AdvertiserService;
import org.springframework.stereotype.Service;

/**
 * 广告主信息 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class AdvertiserServiceImpl extends ServiceImpl<AdvertiserMapper, Advertiser>  implements AdvertiserService{

}
