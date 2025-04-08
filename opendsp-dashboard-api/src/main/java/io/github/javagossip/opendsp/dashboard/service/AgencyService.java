package io.github.javagossip.opendsp.dashboard.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Preconditions;
import com.mybatisflex.core.paginate.Page;

import io.github.javagossip.opendsp.core.exception.BizException;
import io.github.javagossip.opendsp.dao.AdvertiserDao;
import io.github.javagossip.opendsp.dao.AgencyDao;
import io.github.javagossip.opendsp.dao.SysUserDao;
import io.github.javagossip.opendsp.dashboard.constant.Constants.ErrorMessages;
import io.github.javagossip.opendsp.dashboard.dto.AgencyPasswordDto;
import io.github.javagossip.opendsp.dashboard.factory.SysUserFactory;
import io.github.javagossip.opendsp.dashboard.util.PasswordUtil;
import io.github.javagossip.opendsp.dashboard.validator.Validators;
import io.github.javagossip.opendsp.model.Advertiser;
import io.github.javagossip.opendsp.model.Agency;
import io.github.javagossip.opendsp.model.SysUser;

import static io.github.javagossip.opendsp.model.table.AgencyTableDef.*;

@Service
public class AgencyService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AgencyService.class);

    @Resource
    private AgencyDao agencyDao;
    @Resource
    private AdvertiserDao advertiserDao;
    @Resource
    private SysUserDao sysUserDao;

    // Add or update agency information
    @Transactional
    public void addOrUpdateAgency(Agency agency) {
        LOGGER.info("Adding or updating agency: {}", agency);
        Validators.validate(agency);
        boolean isNew = agency.getId() == null;
        boolean agencyExists = agencyDao.exists(AGENCY.NAME.eq(agency.getName()));
        if (isNew && agencyExists) {
            throw new BizException("代理商已存在: " + agency.getName());
        }
        if (isNew) {
            agency.setPassword(PasswordUtil.genPwd(agency.getPassword()));
        }
        SysUser sysUser = SysUserFactory.withAgency(agency);
        sysUserDao.saveOrUpdate(sysUser);
        agency.setSysUserId(sysUser.getId());
        agencyDao.saveOrUpdate(agency);
    }

    public Page<Agency> pageListAgencies(String name, int page, int size) {
        LOGGER.info("Listing agencies with name: {}, page: {}, size: {}", name, page, size);
        return agencyDao.page(Page.of(page, size),
                agencyDao.queryChain().where(AGENCY.NAME.like(name)).or(AGENCY.COMPANY_NAME.like(name)));
    }

    public Agency getAgency(int id) {
        LOGGER.info("Getting agency with id: {}", id);
        return agencyDao.getById(id);
    }

    public void deleteAgency(int id) {
        LOGGER.info("Deleting agency with id: {}", id);
        if (!agencyDao.exists(AGENCY.ID.eq(id))) {
            throw new BizException(ErrorMessages.agencyNotExistsById(id));
        }
        boolean advertiserExists = advertiserDao.exists(advertiserDao.queryChain().eq(Advertiser::getAgencyId, id));
        if (advertiserExists) {
            throw new BizException("该代理商下存在广告主，不能删除");
        }
        agencyDao.removeById(id);
    }

    public void enableAgency(int id) {
        LOGGER.info("Enabling agency with id: {}", id);
        agencyDao.updateById(Agency.builder().id(id).status(1).build());
        //TODO 发送代理商启用的消息通知
    }

    public void disableAgency(int id) {
        LOGGER.info("Disabling agency with id: {}", id);
        agencyDao.updateById(Agency.builder().id(id).status(0).build());
        //TODO 发送代理商禁用的消息通知
    }

    @Transactional
    public void updatePassword(AgencyPasswordDto agencyPasswordDto) {
        Validators.validate(agencyPasswordDto);
        LOGGER.info("代理商密码修改, 代理商id: {}", agencyPasswordDto.getAgencyId());

        Agency agency = agencyDao.getById(agencyPasswordDto.getAgencyId());
        Preconditions.checkNotNull(agency, ErrorMessages.agencyNotExistsById(agencyPasswordDto.getAgencyId()));
        Preconditions.checkNotNull(agency.getSysUserId(), ErrorMessages.AGENCY_UNBIND_SYS_USER);

        SysUser sysUser = sysUserDao.getById(agency.getSysUserId());
        Preconditions.checkNotNull(sysUser, ErrorMessages.userNotExistsById(agency.getSysUserId()));

        if (!PasswordUtil.verify(agencyPasswordDto.getOldPassword(), sysUser.getPassword())) {
            throw new BizException("旧密码输入不正确");
        }
        String newPwd = PasswordUtil.genPwd(agencyPasswordDto.getNewPassword());
        agencyDao.updateById(Agency.builder().id(agency.getId()).password(newPwd).build());
        sysUserDao.updateById(SysUser.builder().id(sysUser.getId()).password(newPwd).build());
    }
}
