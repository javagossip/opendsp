package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.AdGroup;
import io.github.javagossip.opendsp.mapper.AdGroupMapper;
import io.github.javagossip.opendsp.dao.AdGroupDao;
import org.springframework.stereotype.Service;

/**
 * 广告组-广告投放策略设置 服务层实现。
 *
 * @author weiping wang
 * @since 2025-04-28
 */
@Service
public class AdGroupDaoImpl extends ServiceImpl<AdGroupMapper, AdGroup>  implements AdGroupDao{

}
