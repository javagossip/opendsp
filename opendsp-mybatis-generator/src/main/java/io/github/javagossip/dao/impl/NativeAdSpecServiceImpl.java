package io.github.javagossip.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.model.NativeAdSpec;
import io.github.javagossip.mapper.NativeAdSpecMapper;
import io.github.javagossip.dao.NativeAdSpecService;
import org.springframework.stereotype.Service;

/**
 * 原生广告规格定义 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class NativeAdSpecServiceImpl extends ServiceImpl<NativeAdSpecMapper, NativeAdSpec>  implements NativeAdSpecService{

}
