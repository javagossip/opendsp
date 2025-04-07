package io.github.javagossip.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.model.AdStat;
import io.github.javagossip.mapper.AdStatMapper;
import io.github.javagossip.dao.AdStatService;
import org.springframework.stereotype.Service;

/**
 *  服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class AdStatServiceImpl extends ServiceImpl<AdStatMapper, AdStat>  implements AdStatService{

}
