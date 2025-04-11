package io.github.javagossip.opendsp.dashboard.controller;

import javax.annotation.Resource;

import com.mybatisflex.core.paginate.Page;

import ai.houyi.dorado.rest.annotation.Controller;
import ai.houyi.dorado.rest.annotation.GET;
import ai.houyi.dorado.rest.annotation.POST;
import ai.houyi.dorado.rest.annotation.Path;
import ai.houyi.dorado.rest.annotation.RequestBody;
import ai.houyi.dorado.rest.annotation.RequestParam;
import io.github.javagossip.opendsp.dashboard.service.SysPermissionService;
import io.github.javagossip.opendsp.model.SysPermission;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Path("/permissions")
@Api(tags = "权限管理")
public class SysPermissionController {

    @Resource
    private SysPermissionService permissionService;

    @POST
    @ApiOperation("添加或更新权限")
    public SysPermission addOrUpdatePermission(@RequestBody SysPermission permission) {
        permissionService.addOrUpdatePermission(permission);
        return permission;
    }

    @GET
    @ApiOperation("分页查询权限")
    public Page<SysPermission> listPermissions(@RequestParam String name,
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {
        return permissionService.listPermissions(name, page, size);
    }

    @POST
    @Path("/delete")
    @ApiOperation("删除权限")
    public void deletePermission(@RequestParam int id) {
        permissionService.deletePermission(id);
    }

    @GET
    @Path("/get")
    @ApiOperation("根据id查看权限")
    public SysPermission getPermission(@RequestParam int id) {
        return permissionService.getPermission(id);
    }
}
