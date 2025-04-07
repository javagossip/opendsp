package io.github.javagossip.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.model.AdxAdSlot;
import io.github.javagossip.mapper.AdxAdSlotMapper;
import io.github.javagossip.dao.AdxAdSlotService;
import org.springframework.stereotype.Service;

/**
 * 广告位-adx关联表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class AdxAdSlotServiceImpl extends ServiceImpl<AdxAdSlotMapper, AdxAdSlot>  implements AdxAdSlotService{

}
