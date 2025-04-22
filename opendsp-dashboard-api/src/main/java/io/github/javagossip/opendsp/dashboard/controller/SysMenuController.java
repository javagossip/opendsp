package io.github.javagossip.opendsp.dashboard.controller;

import java.util.List;

import javax.annotation.Resource;

import ai.houyi.dorado.rest.annotation.Controller;
import ai.houyi.dorado.rest.annotation.GET;
import ai.houyi.dorado.rest.annotation.POST;
import ai.houyi.dorado.rest.annotation.Path;
import ai.houyi.dorado.rest.annotation.RequestBody;
import ai.houyi.dorado.rest.annotation.RequestParam;
import io.github.javagossip.opendsp.dashboard.dto.SysMenuDto;
import io.github.javagossip.opendsp.dashboard.dto.AuthContext;
import io.github.javagossip.opendsp.dashboard.service.SysMenuService;
import io.github.javagossip.opendsp.dashboard.validator.Validators;
import io.github.javagossip.opendsp.model.SysMenu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Path("/menus")
@Api(tags = "菜单管理")
public class SysMenuController {

    @Resource
    private SysMenuService sysMenuService;

    @POST
    @ApiOperation("添加或更新菜单")
    public void addOrUpdateMenu(@RequestBody SysMenu menu) {
        Validators.validate(menu);
        sysMenuService.addOrUpdateMenu(menu);
    }

    @GET
    @Path("/tree")
    @ApiOperation("获取菜单树-管理端使用")
    public List<SysMenuDto> menuTree() {
        return sysMenuService.listMenus();
    }

    @POST
    @Path("/hide")
    @ApiOperation("隐藏菜单")
    public void hideMenu(@RequestParam Integer menuId) {
        sysMenuService.hideMenu(menuId);
    }

    @POST
    @Path("/delete")
    @ApiOperation("删除菜单")
    public void deleteMenu(@RequestParam Integer menuId) {
        sysMenuService.deleteMenu(menuId);
    }

    @POST
    @Path("/disable")
    @ApiOperation("禁用菜单")
    public void disableMenu(@RequestParam Integer menuId) {
        sysMenuService.disableMenu(menuId);
    }

    @POST
    @Path("/enable")
    @ApiOperation("启用菜单")
    public void enableMenu(@RequestParam Integer menuId) {
        sysMenuService.enableMenu(menuId);
    }

    @GET
    @Path("/user-tree")
    @ApiOperation("获取用户有权限的菜单树")
    public List<SysMenuDto> userMenus() {
        return sysMenuService.listUserMenus(AuthContext.getAuthInfo().getUser().getId());
    }
}
