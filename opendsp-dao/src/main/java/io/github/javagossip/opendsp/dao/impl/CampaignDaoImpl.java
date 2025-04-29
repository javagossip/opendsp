package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.Campaign;
import io.github.javagossip.opendsp.mapper.CampaignMapper;
import io.github.javagossip.opendsp.dao.CampaignDao;
import org.springframework.stereotype.Service;

/**
 * 推广计划 服务层实现。
 *
 * @author weiping wang
 * @since 2025-04-28
 */
@Service
public class CampaignDaoImpl extends ServiceImpl<CampaignMapper, Campaign>  implements CampaignDao{

}
