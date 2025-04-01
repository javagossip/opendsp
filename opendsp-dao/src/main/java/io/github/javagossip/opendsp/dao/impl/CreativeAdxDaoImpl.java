package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.CreativeAdx;
import io.github.javagossip.opendsp.mapper.CreativeAdxMapper;
import io.github.javagossip.opendsp.dao.CreativeAdxDao;
import org.springframework.stereotype.Service;

/**
 * 广告创意-adx平台关联表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class CreativeAdxDaoImpl extends ServiceImpl<CreativeAdxMapper, CreativeAdx>  implements CreativeAdxDao{

}
