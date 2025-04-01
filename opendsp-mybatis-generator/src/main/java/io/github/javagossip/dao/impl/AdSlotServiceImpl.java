package io.github.javagossip.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.model.AdSlot;
import io.github.javagossip.mapper.AdSlotMapper;
import io.github.javagossip.dao.AdSlotService;
import org.springframework.stereotype.Service;

/**
 * dsp平台广告位 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class AdSlotServiceImpl extends ServiceImpl<AdSlotMapper, AdSlot>  implements AdSlotService{

}
