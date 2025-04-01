package io.github.javagossip.opendsp.dashboard.controller;

import javax.annotation.Resource;

import com.mybatisflex.core.paginate.Page;

import ai.houyi.dorado.rest.annotation.Controller;
import ai.houyi.dorado.rest.annotation.GET;
import ai.houyi.dorado.rest.annotation.POST;
import ai.houyi.dorado.rest.annotation.Path;
import ai.houyi.dorado.rest.annotation.RequestBody;
import ai.houyi.dorado.rest.annotation.RequestParam;
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
    @ApiOperation("添加或更新字典")
    public SysDict addOrUpdateDict(@RequestBody SysDict dict) {
        dictService.addOrUpdateDict(dict);
        return dict;
    }

    @GET
    @ApiOperation("根据字典名称分页查询字典")
    public Page<SysDict> listDicts(@RequestParam String name,
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {
        return dictService.listDicts(name, page, size);
    }
}
