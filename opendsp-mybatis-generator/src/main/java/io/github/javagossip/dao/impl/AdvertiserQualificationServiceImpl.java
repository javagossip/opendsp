package io.github.javagossip.dao.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import io.github.javagossip.model.AdvertiserQualification;
import io.github.javagossip.mapper.AdvertiserQualificationMapper;
import io.github.javagossip.dao.AdvertiserQualificationService;
import org.springframework.stereotype.Service;

/**
 * 广告主资质 服务层实现。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Service
public class AdvertiserQualificationServiceImpl extends ServiceImpl<AdvertiserQualificationMapper, AdvertiserQualification>  implements AdvertiserQualificationService{

}
