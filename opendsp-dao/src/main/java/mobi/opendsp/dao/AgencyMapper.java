package mobi.opendsp.dao;

import java.util.List;
import mobi.opendsp.model.Agency;
import mobi.opendsp.model.AgencyExample;
import org.apache.ibatis.annotations.Param;

public interface AgencyMapper {
    long countByExample(AgencyExample example);

    int deleteByExample(AgencyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Agency record);

    int insertSelective(Agency record);

    List<Agency> selectByExample(AgencyExample example);

    Agency selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Agency record, @Param("example") AgencyExample example);

    int updateByExample(@Param("record") Agency record, @Param("example") AgencyExample example);

    int updateByPrimaryKeySelective(Agency record);

    int updateByPrimaryKey(Agency record);
}