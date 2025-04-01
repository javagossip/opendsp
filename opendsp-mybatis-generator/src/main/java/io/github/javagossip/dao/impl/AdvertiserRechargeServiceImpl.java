package io.github.javagossip.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.model.AdvertiserRecharge;
import io.github.javagossip.mapper.AdvertiserRechargeMapper;
import io.github.javagossip.dao.AdvertiserRechargeService;
import org.springframework.stereotype.Service;

/**
 * 广告主充值记录表 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class AdvertiserRechargeServiceImpl extends ServiceImpl<AdvertiserRechargeMapper, AdvertiserRecharge>  implements AdvertiserRechargeService{

}
