package io.github.javagossip.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.model.Creative;
import io.github.javagossip.mapper.CreativeMapper;
import io.github.javagossip.dao.CreativeService;
import org.springframework.stereotype.Service;

/**
 * 广告创意 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class CreativeServiceImpl extends ServiceImpl<CreativeMapper, Creative>  implements CreativeService{

}
