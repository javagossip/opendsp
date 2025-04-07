package io.github.javagossip.opendsp.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.opendsp.model.NativeAdSpec;
import io.github.javagossip.opendsp.mapper.NativeAdSpecMapper;
import io.github.javagossip.opendsp.dao.NativeAdSpecDao;
import org.springframework.stereotype.Service;

/**
 * 原生广告规格定义 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class NativeAdSpecDaoImpl extends ServiceImpl<NativeAdSpecMapper, NativeAdSpec>  implements NativeAdSpecDao{

}
