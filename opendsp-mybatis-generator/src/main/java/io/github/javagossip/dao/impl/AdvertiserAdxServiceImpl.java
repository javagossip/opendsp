package io.github.javagossip.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.model.AdvertiserAdx;
import io.github.javagossip.mapper.AdvertiserAdxMapper;
import io.github.javagossip.dao.AdvertiserAdxService;
import org.springframework.stereotype.Service;

/**
 * 广告主-adx关联表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class AdvertiserAdxServiceImpl extends ServiceImpl<AdvertiserAdxMapper, AdvertiserAdx>  implements AdvertiserAdxService{

}
