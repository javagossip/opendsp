package io.github.javagossip.opendsp.dashboard.controller;

import javax.annotation.Resource;

import ai.houyi.dorado.rest.annotation.RequestBody;

import com.mybatisflex.core.paginate.Page;

import ai.houyi.dorado.rest.annotation.Controller;
import ai.houyi.dorado.rest.annotation.GET;
import ai.houyi.dorado.rest.annotation.POST;
import ai.houyi.dorado.rest.annotation.Path;
import ai.houyi.dorado.rest.annotation.RequestParam;
import io.github.javagossip.opendsp.dashboard.service.AdSlotService;
import io.github.javagossip.opendsp.model.AdSlot;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Path("/adslots")
@Api(tags = "广告位管理")
public class AdSlotController {

    @Resource
    private AdSlotService adSlotService;

    @POST
    @ApiOperation("添加或更新广告位")
    public AdSlot addOrUpdateAdSlot(@RequestBody AdSlot adSlot) {
        adSlotService.addOrUpdateAdSlot(adSlot);
        return adSlot;
    }

    @GET
    @ApiOperation("根据指定信息查询广告位")
    public Page<AdSlot> listAdSlots(@RequestParam String name,
            @RequestParam Integer status,
            @RequestParam Integer page,
            @RequestParam Integer size) {
        return adSlotService.listAdSlots(name, status, page, size);
    }

    @POST
    @Path("/delete")
    @ApiOperation("删除广告位")
    public void deleteAdSlot(@RequestParam Integer id) {
        adSlotService.deleteAdSlot(id);
    }

    @POST
    @Path("/disable")
    @ApiOperation("禁用广告位")
    public void disableAdSlot(@RequestParam Integer id) {
        adSlotService.disableAdSlot(id);
    }

    @POST
    @Path("/enable")
    @ApiOperation("启用广告位")
    public void enableAdSlot(@RequestParam Integer id) {
        adSlotService.enableAdSlot(id);
    }

    @GET
    @Path("/get")
    @ApiOperation("根据广告位id查看广告位")
    public AdSlot getAdSlot(@RequestParam Integer id) {
        return adSlotService.getAdSlot(id);
    }
}
