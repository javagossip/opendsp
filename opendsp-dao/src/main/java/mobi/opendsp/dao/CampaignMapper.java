package mobi.opendsp.dao;

import java.util.List;
import mobi.opendsp.model.Campaign;
import mobi.opendsp.model.CampaignExample;
import org.apache.ibatis.annotations.Param;

public interface CampaignMapper {
    long countByExample(CampaignExample example);

    int deleteByExample(CampaignExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Campaign record);

    int insertSelective(Campaign record);

    List<Campaign> selectByExample(CampaignExample example);

    Campaign selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Campaign record, @Param("example") CampaignExample example);

    int updateByExample(@Param("record") Campaign record, @Param("example") CampaignExample example);

    int updateByPrimaryKeySelective(Campaign record);

    int updateByPrimaryKey(Campaign record);
}