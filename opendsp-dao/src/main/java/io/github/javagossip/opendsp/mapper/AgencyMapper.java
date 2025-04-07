package io.github.javagossip.opendsp.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.mybatisflex.core.BaseMapper;
import io.github.javagossip.opendsp.model.Agency;

/**
 * 代理商信息 映射层。
 *
 * @author weiping wang
 * @since 2025-04-07
 */
@Mapper
public interface AgencyMapper extends BaseMapper<Agency> {

}
