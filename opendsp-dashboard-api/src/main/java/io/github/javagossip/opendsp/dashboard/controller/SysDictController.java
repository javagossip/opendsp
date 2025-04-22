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
import io.github.javagossip.opendsp.dashboard.dto.DictItemDto;
import io.github.javagossip.opendsp.dashboard.dto.DictTypeDto;
import io.github.javagossip.opendsp.dashboard.dto.RegionDto;
import io.github.javagossip.opendsp.dashboard.service.SysDictService;
import io.github.javagossip.opendsp.model.SysDict;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Path("/dicts")
@Api(tags = "字典管理")
public class SysDictController {

    @Resource
    private SysDictService dictService;

    @POST
    @ApiOperation("添加字典分类")
    @Path("/types")
    public void addDictType(@RequestBody DictTypeDto dictTypeDto) {
        dictService.addDictType(dictTypeDto);
    }

    @POST
    @Path("/items")
    @ApiOperation("添加或更新字典项")
    public SysDict addOrUpdateDict(@RequestBody DictItemDto dict) {
        return dictService.addOrUpdateDict(dict);
    }

    @GET
    @ApiOperation("根据字典名称分页查询字典")
    public Page<SysDict> listDicts(@RequestParam String name,
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {
        return dictService.listDicts(name, page, size);
    }

    @GET
    @Path("/keys")
    @ApiOperation("根据字典key查询字典")
    public List<SysDict> listSysDictsByKey(@RequestParam String key) {
        return dictService.listByDictType(key);
    }

    @GET
    @Path("/industries")
    @ApiOperation("查询行业字典")
    public List<SysDict> listAdExchanges() {
        return dictService.listAdExchanges();
    }

    @GET
    @Path("/user-types")
    @ApiOperation("查询用户类型字典")
    public List<SysDict> listUserTypes() {
        return dictService.listUserTypes();
    }

    @GET
    @Path("/bidding-methods")
    @ApiOperation("查询广告出价方式字典")
    public List<SysDict> listBiddingMethods() {
        return dictService.listBiddingMethods();
    }

    @GET
    @Path("/promotion-types")
    @ApiOperation("查询推广类型/目标字典")
    public List<SysDict> listPromotionTypes() {
        return dictService.listPromotionTypes();
    }

    @GET
    @Path("/types")
    @ApiOperation("获得所有字典类型")
    public List<SysDict> getDictTypes() {
        return dictService.getDictTypes();
    }

    @GET
    @Path("/network-types")
    @ApiOperation("查询网络类型字典")
    public List<SysDict> listNetworkTypes() {
        return dictService.listNetworkTypes();
    }

    @GET
    @Path("/os-types")
    @ApiOperation("查询操作系统类型字典")
    public List<SysDict> listOsTypes() {
        return dictService.listOsTypes();
    }

    @GET
    @Path("/device-types")
    @ApiOperation("查询设备类型字典")
    public List<SysDict> listDeviceTypes() {
        return dictService.listDeviceTypes();
    }

    @GET
    @Path("/regions")
    @ApiOperation("查询地区字典,/regions?parent=xxx")
    public List<RegionDto> listRegions(@RequestParam("parent") Integer parentRegionCode) {
        return dictService.listRegions(parentRegionCode);
    }
}
