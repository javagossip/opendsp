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
import io.github.javagossip.opendsp.dashboard.service.CampaignService;
import io.github.javagossip.opendsp.model.Campaign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Path("/campaigns")
@Api(tags = "推广计划管理")
public class CampaignController {

    @Resource
    private CampaignService campaignService;

    @POST
    @ApiOperation("添加或更新推广计划")
    public Campaign addOrUpdateCampaign(@RequestBody Campaign campaign) {
        campaignService.addOrUpdateCampaign(campaign);
        return campaign;
    }

    @GET
    @Path("/get")
    @ApiOperation("根据推广计划id查看推广计划")
    public Campaign getCampaign(@RequestParam int id) {
        return campaignService.getCampaign(id);
    }

    @GET
    @ApiOperation("根据名称分页查询推广计划")
    public Page<Campaign> listCampaigns(@RequestParam String name,
            @RequestParam int status,
            @RequestParam int page,
            @RequestParam int size) {
        return campaignService.listCampaigns(name, status, page, size);
    }

    @POST
    @Path("/delete")
    @ApiOperation("删除推广计划")
    public void deleteCampaign(@RequestParam int id) {
        campaignService.deleteCampaign(id);
    }

    @POST
    @Path("/disable")
    @ApiOperation("禁用推广计划")
    public void disableCampaign(@RequestParam int id) {
        campaignService.disableCampaign(id);
    }

    @POST
    @Path("/enable")
    @ApiOperation("启用推广计划")
    public void enableCampaign(@RequestParam int id) {
        campaignService.enableCampaign(id);
    }

    @GET
    @Path("/search")
    @ApiOperation("根据名称查询推广计划")
    public List<Campaign> searchCampaignsByName(@RequestParam String name) {
        return campaignService.searchCampaignsByName(name);
    }
}
