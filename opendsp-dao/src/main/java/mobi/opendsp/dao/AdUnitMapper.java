package mobi.opendsp.dao;

import java.util.List;
import mobi.opendsp.model.AdUnit;
import mobi.opendsp.model.AdUnitExample;
import org.apache.ibatis.annotations.Param;

public interface AdUnitMapper {
    long countByExample(AdUnitExample example);

    int deleteByExample(AdUnitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdUnit record);

    int insertSelective(AdUnit record);

    List<AdUnit> selectByExample(AdUnitExample example);

    AdUnit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdUnit record, @Param("example") AdUnitExample example);

    int updateByExample(@Param("record") AdUnit record, @Param("example") AdUnitExample example);

    int updateByPrimaryKeySelective(AdUnit record);

    int updateByPrimaryKey(AdUnit record);
}