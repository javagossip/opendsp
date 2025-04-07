package io.github.javagossip.opendsp.dashboard.controller;

import javax.annotation.Resource;

import com.mybatisflex.core.paginate.Page;

import ai.houyi.dorado.rest.annotation.Controller;
import ai.houyi.dorado.rest.annotation.GET;
import ai.houyi.dorado.rest.annotation.POST;
import ai.houyi.dorado.rest.annotation.Path;
import ai.houyi.dorado.rest.annotation.RequestBody;
import ai.houyi.dorado.rest.annotation.RequestParam;
import io.github.javagossip.opendsp.dashboard.dto.AdGroupQueryDto;
import io.github.javagossip.opendsp.dashboard.service.AdGroupService;
import io.github.javagossip.opendsp.model.AdGroup;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Path("/adgroups")
@Api(tags = "广告组管理")
public class AdGroupController {

    @Resource
    private AdGroupService adGroupService;

    @POST
    @ApiOperation("添加或更新广告组")
    public AdGroup addOrUpdateAdGroup(@RequestBody AdGroup adGroup) {
        adGroupService.addOrUpdateAdGroup(adGroup);
        return adGroup;
    }

    @GET
    @ApiOperation("根据指定信息查询广告组")
    public Page<AdGroup> listAdGroups(AdGroupQueryDto adGroupQueryDto) {
        return adGroupService.listAdGroups(adGroupQueryDto);
    }

    @POST
    @Path("/delete")
    @ApiOperation("删除广告组")
    public void deleteAdGroup(@RequestParam Integer id) {
        adGroupService.deleteAdGroup(id);
    }

    @POST
    @Path("/disable")
    @ApiOperation("禁用广告组")
    public void disableAdGroup(@RequestParam Integer id) {
        adGroupService.disableAdGroup(id);
    }

    @POST
    @Path("/enable")
    @ApiOperation("启用广告组")
    public void enableAdGroup(@RequestParam Integer id) {
        adGroupService.enableAdGroup(id);
    }

    @GET
    @Path("/get")
    @ApiOperation("根据广告组id查看广告组")
    public AdGroup getAdGroup(@RequestParam Integer id) {
        return adGroupService.getAdGroup(id);
    }
}
