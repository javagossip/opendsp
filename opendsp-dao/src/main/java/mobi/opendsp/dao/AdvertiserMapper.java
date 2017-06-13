package mobi.opendsp.dao;

import java.util.List;
import mobi.opendsp.model.Advertiser;
import mobi.opendsp.model.AdvertiserExample;
import org.apache.ibatis.annotations.Param;

public interface AdvertiserMapper {
    long countByExample(AdvertiserExample example);

    int deleteByExample(AdvertiserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Advertiser record);

    int insertSelective(Advertiser record);

    List<Advertiser> selectByExample(AdvertiserExample example);

    Advertiser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Advertiser record, @Param("example") AdvertiserExample example);

    int updateByExample(@Param("record") Advertiser record, @Param("example") AdvertiserExample example);

    int updateByPrimaryKeySelective(Advertiser record);

    int updateByPrimaryKey(Advertiser record);
}