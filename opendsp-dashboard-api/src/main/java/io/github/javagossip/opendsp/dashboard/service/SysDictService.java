package io.github.javagossip.opendsp.dashboard.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mybatisflex.core.paginate.Page;

import io.github.javagossip.opendsp.dao.SysDictDao;
import io.github.javagossip.opendsp.model.SysDict;

import static io.github.javagossip.opendsp.model.table.SysDictTableDef.*;

@Service
public class SysDictService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysDictService.class);
    @Resource
    private SysDictDao sysDictDao;

    public void addOrUpdateDict(SysDict dict) {
        LOGGER.info("addOrUpdateDict:{}", dict);
        sysDictDao.saveOrUpdate(dict);
    }

    public Page<SysDict> listDicts(String name, int page, int size) {
        LOGGER.info("listDicts:{}", name);
        return sysDictDao.page(Page.of(page, size),
                sysDictDao.queryChain().where(SYS_DICT.DICT_VALUE.like(name).or(SYS_DICT.DICT_KEY.like(name))));
    }
}
