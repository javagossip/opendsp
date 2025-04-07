package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.AdxAdSlot;
import io.github.javagossip.opendsp.mapper.AdxAdSlotMapper;
import io.github.javagossip.opendsp.dao.AdxAdSlotDao;
import org.springframework.stereotype.Service;

/**
 * 广告位-adx关联表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class AdxAdSlotDaoImpl extends ServiceImpl<AdxAdSlotMapper, AdxAdSlot>  implements AdxAdSlotDao{

}
