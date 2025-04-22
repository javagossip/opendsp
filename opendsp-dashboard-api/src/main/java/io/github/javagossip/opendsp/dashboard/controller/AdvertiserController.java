package io.github.javagossip.opendsp.dashboard.controller;

import java.util.List;

import javax.annotation.Resource;

import com.mybatisflex.core.paginate.Page;

import ai.houyi.dorado.rest.annotation.Controller;
import ai.houyi.dorado.rest.annotation.GET;
import ai.houyi.dorado.rest.annotation.POST;
import ai.houyi.dorado.rest.annotation.Path;
import ai.houyi.dorado.rest.annotation.RequestBody;
import ai.houyi.dorado.rest.annotation.RequestParam;
import io.github.javagossip.opendsp.dashboard.dto.AdvertiserAuditDto;
import io.github.javagossip.opendsp.dashboard.dto.AdvertiserDto;
import io.github.javagossip.opendsp.dashboard.dto.AdvertiserPasswordDto;
import io.github.javagossip.opendsp.dashboard.service.AdvertiserService;
import io.github.javagossip.opendsp.model.Advertiser;
import io.github.javagossip.opendsp.model.AdvertiserQualification;
import io.github.javagossip.opendsp.model.AdvertiserRecharge;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Path("/advertisers")
@Api(tags = "广告主管理")
public class AdvertiserController {

    @Resource
    private AdvertiserService advertiserService;

    @POST
    @ApiOperation("添加或更新广告主")
    public Advertiser addOrUpdateAdvertiser(@RequestBody Advertiser advertiser) {
        advertiserService.addAdvertiser(advertiser);
        return advertiser;
    }

    @POST
    @Path("/password")
    @ApiOperation("广告主修改密码")
    public void updatePassword(@RequestBody AdvertiserPasswordDto advertiserPasswordDto) {
        advertiserService.updatePassword(advertiserPasswordDto);
    }

    @GET
    @ApiOperation("根据广告主名称查询广告主")
    public Page<Advertiser> listAdvertisers(@RequestParam String name,
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {
        return advertiserService.listAdvertisersByName(name, page, size);
    }

    @GET
    @Path("/search")
    @ApiOperation("根据广告主名称查询广告主")
    public List<Advertiser> searchAdvertisersByName(@RequestParam String name) {
        return advertiserService.searchAdvertisersByName(name);
    }

    @POST
    @ApiOperation("删除广告主")
    @Path("/delete")
    public void deleteAdvertiser(@RequestParam Integer id) {
        advertiserService.deleteAdvertiser(id);
    }

    @POST
    @Path("/disable")
    @ApiOperation("禁用广告主")
    public void disableAdvertiser(@RequestParam Integer id) {
        advertiserService.disableAdvertiser(id);
    }

    @POST
    @Path("/enable")
    @ApiOperation("启用广告主")
    public void enableAdvertiser(@RequestParam Integer id) {
        advertiserService.enableAdvertiser(id);
    }

    @GET
    @Path("/get")
    @ApiOperation("广告主信息查看")
    public AdvertiserDto getAdvertiser(@RequestParam Integer id) {
        return advertiserService.getAdvertiser(id);
    }

    @POST
    @Path("/audit")
    @ApiOperation("广告主审核")
    public void auditAdvertiser(@RequestBody AdvertiserAuditDto advertiserAuditDto) {
        advertiserService.auditAdvertiser(advertiserAuditDto);
    }

    @GET
    @Path("/qualifications")
    @ApiOperation("广告主资质查看")
    public List<AdvertiserQualification> getAdvertiserQualifications(@RequestParam int advertiserId) {
        return advertiserService.getAdvertiserQualifications(advertiserId);
    }

    @POST
    @Path("/qualifications/delete")
    @ApiOperation("删除广告主资质")
    public void deleteAdvertiserQualification(@RequestParam Integer qualificationId) {
        advertiserService.deleteAdvertiserQualification(qualificationId);
    }

    @POST
    @Path("/recharge")
    @ApiOperation("广告主充值")
    public void rechargeAdvertiser(@RequestBody AdvertiserRecharge advertiserRecharge) {
        advertiserService.recharge(advertiserRecharge);
    }
}
