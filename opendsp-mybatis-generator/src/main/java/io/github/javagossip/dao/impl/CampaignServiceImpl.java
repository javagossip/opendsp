package io.github.javagossip.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.model.Campaign;
import io.github.javagossip.mapper.CampaignMapper;
import io.github.javagossip.dao.CampaignService;
import org.springframework.stereotype.Service;

/**
 * 推广计划 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class CampaignServiceImpl extends ServiceImpl<CampaignMapper, Campaign>  implements CampaignService{

}
