package io.github.javagossip.opendsp.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.mybatisflex.core.BaseMapper;
import io.github.javagossip.opendsp.model.CreativeAdx;

/**
 * 广告创意-adx平台关联表 映射层。
 *
 * @author weiping wang
 * @since 2025-03-21
 */
@Mapper
public interface CreativeAdxMapper extends BaseMapper<CreativeAdx> {

}
