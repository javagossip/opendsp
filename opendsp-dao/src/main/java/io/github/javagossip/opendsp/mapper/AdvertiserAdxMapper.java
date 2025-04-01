package io.github.javagossip.opendsp.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.mybatisflex.core.BaseMapper;
import io.github.javagossip.opendsp.model.AdvertiserAdx;

/**
 * 广告主-adx关联表 映射层。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Mapper
public interface AdvertiserAdxMapper extends BaseMapper<AdvertiserAdx> {

}
