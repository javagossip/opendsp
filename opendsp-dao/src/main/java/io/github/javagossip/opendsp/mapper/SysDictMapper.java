package io.github.javagossip.opendsp.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.mybatisflex.core.BaseMapper;
import io.github.javagossip.opendsp.model.SysDict;

/**
 * 通用字典表（支持类型和树结构) 映射层。
 *
 * @author weiping wang
 * @since 2025-04-28
 */
@Mapper
public interface SysDictMapper extends BaseMapper<SysDict> {

}
