package io.github.javagossip.opendsp.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.mybatisflex.core.BaseMapper;
import io.github.javagossip.opendsp.model.Advertiser;

/**
 * 广告主信息 映射层。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Mapper
public interface AdvertiserMapper extends BaseMapper<Advertiser> {

}
