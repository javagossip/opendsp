package io.github.javagossip.opendsp.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.mybatisflex.core.BaseMapper;
import io.github.javagossip.opendsp.model.AdGroup;

/**
 * 广告组-广告投放策略设置 映射层。
 *
 * @author weiping wang
 * @since 2025-04-28
 */
@Mapper
public interface AdGroupMapper extends BaseMapper<AdGroup> {

}
