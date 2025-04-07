package io.github.javagossip.opendsp.dashboard.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mybatisflex.core.paginate.Page;

import io.github.javagossip.opendsp.dao.AdSlotDao;
import io.github.javagossip.opendsp.model.AdSlot;

@Service
public class AdSlotService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdSlotService.class);
    @Resource
    private AdSlotDao adSlotDao;

    public void addOrUpdateAdSlot(AdSlot adSlot) {
        LOGGER.info("add or update adSlot:{}", adSlot);
        adSlotDao.saveOrUpdate(adSlot);
    }

    public Page<AdSlot> listAdSlots(String name, Integer status, Integer page, Integer size) {
        LOGGER.info("list adSlots:{},{},{},{}", name, status, page, size);
        return adSlotDao.page(Page.of(page, size),
                adSlotDao.queryChain().like(AdSlot::getName, name).eq(AdSlot::getStatus, status));
    }

    public void deleteAdSlot(Integer id) {
        LOGGER.info("delete adSlot:{}", id);
        adSlotDao.removeById(id);
    }

    public void disableAdSlot(Integer id) {
        LOGGER.info("disable adSlot:{}", id);
        adSlotDao.updateById(AdSlot.builder().id(id).status(0).build());
    }

    public void enableAdSlot(Integer id) {
        LOGGER.info("enable adSlot:{}", id);
        adSlotDao.updateById(AdSlot.builder().id(id).status(1).build());
    }

    public AdSlot getAdSlot(Integer id) {
        LOGGER.info("get adSlot:{}", id);
        return adSlotDao.getById(id);
    }
}
