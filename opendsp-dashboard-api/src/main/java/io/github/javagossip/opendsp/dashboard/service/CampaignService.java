package io.github.javagossip.opendsp.dashboard.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mybatisflex.core.paginate.Page;

import io.github.javagossip.opendsp.dao.CampaignDao;
import io.github.javagossip.opendsp.model.Campaign;

@Service
public class CampaignService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CampaignService.class);
    @Resource
    private CampaignDao campaignDao;

    public void addOrUpdateCampaign(Campaign campaign) {
        LOGGER.info("addOrUpdateCampaign: {}", campaign);
        campaignDao.saveOrUpdate(campaign);
    }

    public Campaign getCampaign(int id) {
        LOGGER.info("getCampaign: {}", id);
        return campaignDao.getById(id);
    }

    public Page<Campaign> listCampaigns(String name, int status, int page, int size) {
        LOGGER.info("listCampaigns: name={}, status={}, page={}, size={}", name, status, page, size);
        return campaignDao.page(Page.of(page, size),
                campaignDao.queryChain().like(Campaign::getName, name).eq(Campaign::getStatus, status));
    }

    public void deleteCampaign(int id) {
        LOGGER.info("deleteCampaign: {}", id);
        campaignDao.removeById(id);
    }

    public void disableCampaign(int id) {
        LOGGER.info("disableCampaign: {}", id);
        campaignDao.updateById(Campaign.builder().status(0).id(id).build());
    }

    public void enableCampaign(int id) {
        LOGGER.info("enableCampaign: {}", id);
        campaignDao.updateById(Campaign.builder().status(1).id(id).build());
    }

    public List<Campaign> searchCampaignsByName(String name) {
        LOGGER.info("searchCampaignsByName: {}", name);
        return campaignDao.list(campaignDao.queryChain().like(Campaign::getName, name));
    }
}
