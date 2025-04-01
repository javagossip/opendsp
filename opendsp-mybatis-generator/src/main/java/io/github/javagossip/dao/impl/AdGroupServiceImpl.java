package io.github.javagossip.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.model.AdGroup;
import io.github.javagossip.mapper.AdGroupMapper;
import io.github.javagossip.dao.AdGroupService;
import org.springframework.stereotype.Service;

/**
 * 广告组-广告投放策略设置 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class AdGroupServiceImpl extends ServiceImpl<AdGroupMapper, AdGroup>  implements AdGroupService{

}
