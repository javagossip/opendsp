package io.github.javagossip.opendsp.dashboard.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Preconditions;
import com.mybatisflex.core.paginate.Page;
import com.mybatisflex.core.query.QueryChain;

import ai.houyi.dorado.rest.util.StringUtils;
import io.github.javagossip.opendsp.core.exception.BizException;
import io.github.javagossip.opendsp.dao.AdvertiserAdxDao;
import io.github.javagossip.opendsp.dao.AdvertiserDao;
import io.github.javagossip.opendsp.dao.AdvertiserQualificationDao;
import io.github.javagossip.opendsp.dao.AdvertiserRechargeDao;
import io.github.javagossip.opendsp.dao.SysUserDao;
import io.github.javagossip.opendsp.dashboard.constant.Constants.ErrorMessages;
import io.github.javagossip.opendsp.dashboard.dto.AdvertiserAuditDto;
import io.github.javagossip.opendsp.dashboard.dto.AdvertiserDto;
import io.github.javagossip.opendsp.dashboard.dto.AdvertiserPasswordDto;
import io.github.javagossip.opendsp.dashboard.factory.SysUserFactory;
import io.github.javagossip.opendsp.dashboard.util.PasswordUtil;
import io.github.javagossip.opendsp.dashboard.validator.Validators;
import io.github.javagossip.opendsp.model.Advertiser;
import io.github.javagossip.opendsp.model.AdvertiserAdx;
import io.github.javagossip.opendsp.model.AdvertiserQualification;
import io.github.javagossip.opendsp.model.AdvertiserRecharge;
import io.github.javagossip.opendsp.model.SysUser;

@Service
public class AdvertiserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdvertiserService.class);

    @Resource
    private AdvertiserDao advertiserDao;
    @Resource
    private AdvertiserQualificationDao advertiserQualificationDao;
    @Resource
    private AdvertiserAdxDao advertiserAdxDao;
    @Resource
    private SysUserService sysUserService;
    @Resource
    private SysUserDao sysUserDao;
    @Resource
    private AdvertiserRechargeDao advertiserRechargeDao;

    @Transactional
    public void addAdvertiser(Advertiser advertiser) {
        LOGGER.info("addAdvertiser:{}", advertiser);
        Validators.validate(advertiser);
        boolean isNew = advertiser.getId() == null;
        if (isNew && advertiserExists(advertiser.getName())) {
            throw new BizException(String.format(ErrorMessages.ADVERTISER_EXISTS, advertiser.getName()));
        }
        //重新设置加密之后的密码
        if (isNew) {
            advertiser.setPassword(PasswordUtil.genPwd(advertiser.getPassword()));
        }
        SysUser sysUser = SysUserFactory.withAdvertiser(advertiser);
        sysUserDao.saveOrUpdate(sysUser);
        advertiser.setSysUserId(sysUser.getId());
        advertiserDao.saveOrUpdate(advertiser);
    }

    public Page<Advertiser> listAdvertisersByName(String name, int page, int size) {
        LOGGER.info("listAdvertisersByName:name={}, page={}, size={}", name, page, size);
        return advertiserDao.page(Page.of(page, size), QueryChain.of(Advertiser.class).like(Advertiser::getName, name));
    }

    public void deleteAdvertiser(Integer id) {
        LOGGER.info("deleteAdvertiser:{}", id);
        Preconditions.checkNotNull(id, ErrorMessages.ADVERTISER_ID_IS_NULL);
        assertAdvertiserExists(id);
        advertiserDao.removeById(id);
    }

    public void disableAdvertiser(Integer id) {
        LOGGER.info("disableAdvertiser:{}", id);
        Preconditions.checkNotNull(id, ErrorMessages.ADVERTISER_ID_IS_NULL);
        assertAdvertiserExists(id);
        advertiserDao.updateById(Advertiser.builder().id(id).status(0).build());
    }

    private void assertAdvertiserExists(Integer id) {
        if (!advertiserExistsById(id)) {
            throw new BizException(String.format(ErrorMessages.ADVERTISER_NOT_EXISTS, id));
        }
    }

    public void enableAdvertiser(Integer id) {
        LOGGER.info("enableAdvertiser:{}", id);
        Preconditions.checkNotNull(id, ErrorMessages.ADVERTISER_ID_IS_NULL);
        assertAdvertiserExists(id);
        advertiserDao.updateById(Advertiser.builder().id(id).status(1).build());
    }

    public AdvertiserDto getAdvertiser(Integer id) {
        Preconditions.checkNotNull(id, ErrorMessages.ADVERTISER_ID_IS_NULL);
        assertAdvertiserExists(id);
        AdvertiserDto advertiserDto = new AdvertiserDto();

        advertiserDto.setAdvertiser(advertiserDao.getById(id));
        advertiserDto.setQualifications(advertiserQualificationDao.list(advertiserQualificationDao.queryChain()
                .eq(AdvertiserQualification::getAdvertiserId, id)));
        advertiserDto.setAdvertiserAdxs(advertiserAdxDao.list(advertiserAdxDao.queryChain()
                .eq(AdvertiserAdx::getAdvertiserId, id)));

        return advertiserDto;
    }

    public void auditAdvertiser(AdvertiserAuditDto advertiserAuditDto) {
        LOGGER.info("auditAdvertiser:{}", advertiserAuditDto);
        Validators.validate(advertiserAuditDto);
        assertAdvertiserExists(advertiserAuditDto.getId());
        advertiserDao.updateById(Advertiser.builder()
                .id(advertiserAuditDto.getId())
                .auditStatus(advertiserAuditDto.getAuditStatus())
                .auditComments(advertiserAuditDto.getAuditComments())
                .build());
    }

    public List<Advertiser> searchAdvertisersByName(String name) {
        Preconditions.checkArgument(StringUtils.isNotBlank(name), ErrorMessages.ADVERTISER_NAME_IS_NULL);
        Preconditions.checkArgument(name.length() >= 2, "输入广告主名称长度不能小于2");

        return advertiserDao.list(advertiserDao.queryChain().like(Advertiser::getName, name));
    }

    public List<AdvertiserQualification> getAdvertiserQualifications(int advertiserId) {
        return advertiserQualificationDao.list(advertiserQualificationDao.queryChain()
                .eq(AdvertiserQualification::getAdvertiserId, advertiserId));
    }

    public void deleteAdvertiserQualification(int qualificationId) {
        advertiserQualificationDao.removeById(qualificationId);
    }

    public boolean advertiserExists(String name) {
        Preconditions.checkArgument(StringUtils.isNotBlank(name), ErrorMessages.ADVERTISER_NAME_IS_NULL);
        return advertiserDao.exists(advertiserDao.queryChain().eq(Advertiser::getName, name));
    }

    public boolean advertiserExistsById(int id) {
        return advertiserDao.exists(advertiserDao.queryChain().eq(Advertiser::getId, id));
    }

    @Transactional
    public void updatePassword(AdvertiserPasswordDto advertiserPasswordDto) {
        LOGGER.info("广告主更新密码, 广告主id: {}", advertiserPasswordDto.getAdvertiserId());
        Validators.validate(advertiserPasswordDto);

        Advertiser advertiser = advertiserDao.getById(advertiserPasswordDto.getAdvertiserId());
        if (advertiser == null) {
            throw new BizException(String.format(ErrorMessages.advertiserNotExists(advertiserPasswordDto.getAdvertiserId())));
        }
        Preconditions.checkNotNull(advertiser.getSysUserId(), ErrorMessages.ADVERTISER_UNBIND_SYS_USER);
        //先验证旧密码，再更新新密码
        SysUser sysUser = sysUserDao.getById(advertiser.getSysUserId());
        if (sysUser == null) {
            throw new BizException(ErrorMessages.userNotExistsById(advertiser.getSysUserId()));
        }
        if (!PasswordUtil.verify(advertiserPasswordDto.getOldPassword(), sysUser.getPassword())) {
            throw new BizException("旧密码输入不正确");
        }
        String newPwd = PasswordUtil.genPwd(advertiserPasswordDto.getNewPassword());
        //advertiser.setPassword(newPwd);
        advertiserDao.updateById(Advertiser.builder().id(advertiser.getId()).password(newPwd).build());
        sysUserDao.updateById(SysUser.builder().id(sysUser.getId()).password(newPwd).build());
    }

    public void recharge(AdvertiserRecharge advertiserRecharge) {
        LOGGER.info("广告主充值, 广告主id: {}, 充值金额: {}",
                advertiserRecharge.getAdvertiserId(),
                advertiserRecharge.getAmount());
        advertiserRechargeDao.save(advertiserRecharge);
        //TODO 广告主充值成功之后，需要发送通知，更新缓存中的广告主余额
    }
}
