package io.github.javagossip.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.model.CreativeAdx;
import io.github.javagossip.mapper.CreativeAdxMapper;
import io.github.javagossip.dao.CreativeAdxService;
import org.springframework.stereotype.Service;

/**
 * 广告创意-adx平台关联表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class CreativeAdxServiceImpl extends ServiceImpl<CreativeAdxMapper, CreativeAdx>  implements CreativeAdxService{

}
