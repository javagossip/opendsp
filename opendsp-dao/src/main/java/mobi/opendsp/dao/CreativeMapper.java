package mobi.opendsp.dao;

import java.util.List;
import mobi.opendsp.model.Creative;
import mobi.opendsp.model.CreativeExample;
import org.apache.ibatis.annotations.Param;

public interface CreativeMapper {
    long countByExample(CreativeExample example);

    int deleteByExample(CreativeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Creative record);

    int insertSelective(Creative record);

    List<Creative> selectByExample(CreativeExample example);

    Creative selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Creative record, @Param("example") CreativeExample example);

    int updateByExample(@Param("record") Creative record, @Param("example") CreativeExample example);

    int updateByPrimaryKeySelective(Creative record);

    int updateByPrimaryKey(Creative record);
}