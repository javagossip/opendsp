package mobi.opendsp.dao;

import java.util.List;
import mobi.opendsp.model.AdvertiserInst;
import mobi.opendsp.model.AdvertiserInstExample;
import org.apache.ibatis.annotations.Param;

public interface AdvertiserInstMapper {
    long countByExample(AdvertiserInstExample example);

    int deleteByExample(AdvertiserInstExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdvertiserInst record);

    int insertSelective(AdvertiserInst record);

    List<AdvertiserInst> selectByExample(AdvertiserInstExample example);

    AdvertiserInst selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdvertiserInst record, @Param("example") AdvertiserInstExample example);

    int updateByExample(@Param("record") AdvertiserInst record, @Param("example") AdvertiserInstExample example);

    int updateByPrimaryKeySelective(AdvertiserInst record);

    int updateByPrimaryKey(AdvertiserInst record);
}