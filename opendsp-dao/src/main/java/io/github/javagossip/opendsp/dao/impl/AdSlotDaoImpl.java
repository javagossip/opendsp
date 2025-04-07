package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.AdSlot;
import io.github.javagossip.opendsp.mapper.AdSlotMapper;
import io.github.javagossip.opendsp.dao.AdSlotDao;
import org.springframework.stereotype.Service;

/**
 * dsp平台广告位 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class AdSlotDaoImpl extends ServiceImpl<AdSlotMapper, AdSlot>  implements AdSlotDao{

}
