package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.AdvertiserRecharge;
import io.github.javagossip.opendsp.mapper.AdvertiserRechargeMapper;
import io.github.javagossip.opendsp.dao.AdvertiserRechargeDao;
import org.springframework.stereotype.Service;

/**
 * 广告主充值记录表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class AdvertiserRechargeDaoImpl extends ServiceImpl<AdvertiserRechargeMapper, AdvertiserRecharge>  implements AdvertiserRechargeDao{

}
