package io.github.javagossip.opendsp.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.mybatisflex.core.BaseMapper;
import io.github.javagossip.opendsp.model.Campaign;

/**
 * 推广计划 映射层。
 *
 * @author weiping wang
 * @since 2025-04-28
 */
@Mapper
public interface CampaignMapper extends BaseMapper<Campaign> {

}
