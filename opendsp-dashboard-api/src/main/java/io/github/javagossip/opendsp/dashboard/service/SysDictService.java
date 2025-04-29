package io.github.javagossip.opendsp.dashboard.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.google.common.base.Preconditions;
import com.mybatisflex.core.paginate.Page;

import io.github.javagossip.opendsp.core.exception.BizException;
import io.github.javagossip.opendsp.dao.SysDictDao;
import io.github.javagossip.opendsp.dashboard.constant.Constants.ErrorMessages;
import io.github.javagossip.opendsp.dashboard.dto.DictItemDto;
import io.github.javagossip.opendsp.dashboard.dto.DictTypeDto;
import io.github.javagossip.opendsp.dashboard.dto.RegionDto;
import io.github.javagossip.opendsp.dashboard.factory.SysDictFactory;
import io.github.javagossip.opendsp.dashboard.validator.Validators;
import io.github.javagossip.opendsp.model.SysDict;

import static io.github.javagossip.opendsp.model.table.SysDictTableDef.*;

@Service
public class SysDictService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysDictService.class);

    public enum DictType {
        USER_TYPE("user_type"),
        BIDDING_METHOD("bidding_method"),
        PROMOTION_TYPE("promotion_type"),
        AD_EXCHANGE("ad_exchange"),
        NETWORK_TYPE("network_type"),
        OS_TYPE("os"),
        REGION("region"),
        DEVICE_TYPE("device_type"),
        INDUSTRY("industry");

        private final String type;

        DictType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    public List<SysDict> listNetworkTypes() {
        return listByDictType(DictType.NETWORK_TYPE.type);
    }

    @Resource
    private SysDictDao sysDictDao;

    public void addDictType(DictTypeDto dictTypeDto) {
        LOGGER.info("addDictGroup:{}", dictTypeDto);
        boolean isNew = dictTypeDto.getId() == null;
        if (isNew && dictTypeExists(dictTypeDto.getName())) {
            throw new BizException(ErrorMessages.DICT_TYPE_EXISTS);
        }
        SysDict origSysDict = isNew ? null : sysDictDao.getById(dictTypeDto.getId());
        SysDict sysDict = SysDictFactory.withDictTypeDto(dictTypeDto);
        LOGGER.info("updateDictType: {}", sysDict);
        sysDictDao.saveOrUpdate(sysDict);

        if (origSysDict != null) {
            LOGGER.info("update dict items for orig dict type: {}", origSysDict.getDictType());
            sysDictDao.updateChain()
                    .set(SYS_DICT.DICT_TYPE, sysDict.getDictType())
                    .where(SYS_DICT.DICT_TYPE.eq(origSysDict.getDictType()).and(SYS_DICT.ENTRY_TYPE.eq(2)))
                    .update();
        }
    }

    private boolean dictTypeExists(String dictType) {
        return sysDictDao.exists(sysDictDao.query()
                .where(SYS_DICT.DICT_TYPE.eq(dictType))
                .and(SYS_DICT.ENTRY_TYPE.eq(1)));
    }

    public SysDict addOrUpdateDict(DictItemDto dict) {
        LOGGER.info("addOrUpdateDict:{}", dict);
        Validators.validateDictItem(dict);
        SysDict sysDict = SysDictFactory.withDictItemDto(dict);
        sysDictDao.saveOrUpdate(sysDict);
        return sysDict;
    }

    public Page<SysDict> listDicts(String name, int page, int size) {
        LOGGER.info("listDicts:{}", name);
        return sysDictDao.page(Page.of(page, size),
                sysDictDao.queryChain()
                        .where(SYS_DICT.DICT_TYPE.like(name)
                                .or(SYS_DICT.DICT_NAME.like(name))
                                .or(SYS_DICT.DICT_VALUE.like(name))));
    }

    public List<SysDict> listAdExchanges() {
        LOGGER.info("listAdExchanges");
        return listByDictType(DictType.AD_EXCHANGE.type);
    }

    public List<SysDict> listIndustries() {
        LOGGER.info("listIndustries");
        return listByDictType(DictType.INDUSTRY.type);
    }

    public List<SysDict> listUserTypes() {
        LOGGER.info("listUserTypes");
        return listByDictType(DictType.USER_TYPE.type);
    }

    public List<SysDict> listBiddingMethods() {
        LOGGER.info("listBiddingMethods");
        return listByDictType(DictType.BIDDING_METHOD.type);
    }

    public List<SysDict> listPromotionTypes() {
        LOGGER.info("listPromotionTypes");
        return listByDictType(DictType.PROMOTION_TYPE.type);
    }

    public List<SysDict> listOsTypes() {
        LOGGER.info("listOsTypes");
        return listByDictType(DictType.OS_TYPE.type);
    }

    public List<SysDict> listDeviceTypes() {
        LOGGER.info("listDeviceTypes");
        return listByDictType(DictType.DEVICE_TYPE.type);
    }

    public List<RegionDto> listRegions(Integer parentRegionCode) {
        LOGGER.info("listRegions");
        List<SysDict> sysDicts = sysDictDao.queryChain()
                .where(SYS_DICT.DICT_TYPE.eq(DictType.REGION.type)
                        .and(SYS_DICT.ENTRY_TYPE.eq(2))
                        .and(SYS_DICT.STATUS.eq(1))
                        .and(parentRegionCode == null
                                ? SYS_DICT.PARENT_VALUE.isNull()
                                : SYS_DICT.PARENT_VALUE.eq(parentRegionCode)))
                .list();
        return sysDicts.stream().map(RegionDto::of).collect(Collectors.toList());
    }

    public List<SysDict> listByDictType(String dictType) {
        Preconditions.checkNotNull(dictType, ErrorMessages.DICT_TYPE_IS_NULL);
        LOGGER.info("listByDictType:{}", dictType);
        return sysDictDao.queryChain()
                .where(SYS_DICT.DICT_TYPE.eq(dictType).and(SYS_DICT.ENTRY_TYPE.eq(2)).and(SYS_DICT.STATUS.eq(1)))
                .list();
    }

    public List<SysDict> getDictTypes() {
        return sysDictDao.queryChain().where(SYS_DICT.ENTRY_TYPE.eq(1)).list();
    }
}
