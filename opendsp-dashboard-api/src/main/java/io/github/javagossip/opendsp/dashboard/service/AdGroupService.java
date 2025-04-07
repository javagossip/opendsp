package io.github.javagossip.opendsp.dashboard.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mybatisflex.core.paginate.Page;

import io.github.javagossip.opendsp.core.exception.BizException;
import io.github.javagossip.opendsp.dao.AdGroupDao;
import io.github.javagossip.opendsp.dao.CreativeDao;
import io.github.javagossip.opendsp.dashboard.dto.AdGroupQueryDto;
import io.github.javagossip.opendsp.dashboard.validator.Validators;
import io.github.javagossip.opendsp.model.AdGroup;
import io.github.javagossip.opendsp.model.Creative;

@Service
public class AdGroupService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdGroupService.class);
    @Resource
    private AdGroupDao adGroupDao;
    @Resource
    private CreativeDao creativeDao;

    public void addOrUpdateAdGroup(AdGroup adGroup) {
        LOGGER.info("addOrUpdateAdGroup:{}", adGroup);
        Validators.validate(adGroup);
        adGroupDao.saveOrUpdate(adGroup);
    }

    public Page<AdGroup> listAdGroups(AdGroupQueryDto adGroupQueryDto) {
        LOGGER.info("listAdGroups:{}", adGroupQueryDto);
        return adGroupDao.page(Page.of(adGroupQueryDto.getPage(), adGroupQueryDto.getSize()),
                adGroupDao.queryChain()
                        .like(AdGroup::getName, adGroupQueryDto.getName())
                        .eq(AdGroup::getCampaignId, adGroupQueryDto.getCampaignId())
                        .eq(AdGroup::getAdvertiserId, adGroupQueryDto.getAdvertiserId())
                        .eq(AdGroup::getStatus, adGroupQueryDto.getStatus()));
    }

    public void deleteAdGroup(Integer id) {
        LOGGER.info("deleteAdGroup:{}", id);
        boolean creativeExists = creativeDao.exists(creativeDao.queryChain().eq(Creative::getAdGroupId, id));
        if (creativeExists) {
            throw new BizException("该广告组下存在创意，不能删除");
        }
        adGroupDao.removeById(id);
    }

    public void disableAdGroup(Integer id) {
        LOGGER.info("disableAdGroup:{}", id);
        AdGroup adGroup = adGroupDao.getById(id);
        if (adGroup.getStatus() == 0) {
            throw new BizException("广告组已禁用");
        }
        if (adGroup.getStatus() != 1) {
            throw new BizException("广告组正常状态下才能禁用");
        }
        adGroupDao.updateById(AdGroup.builder().id(id).status(0).build());
    }

    public void enableAdGroup(Integer id) {
        LOGGER.info("enableAdGroup:{}", id);
        AdGroup adGroup = adGroupDao.getById(id);
        if (adGroup.getStatus() == 1) {
            throw new BizException("广告组已启用");
        }
        if (adGroup.getStatus() != 0) {
            throw new BizException("广告组禁用状态下才能启用");
        }
        adGroupDao.updateById(AdGroup.builder().id(id).status(1).build());
    }

    public AdGroup getAdGroup(Integer id) {
        return adGroupDao.getById(id);
    }
}
