package io.github.javagossip.opendsp.dashboard.controller;

import javax.annotation.Resource;

import com.mybatisflex.core.paginate.Page;

import ai.houyi.dorado.rest.annotation.Controller;
import ai.houyi.dorado.rest.annotation.GET;
import ai.houyi.dorado.rest.annotation.POST;
import ai.houyi.dorado.rest.annotation.Path;
import ai.houyi.dorado.rest.annotation.RequestBody;
import ai.houyi.dorado.rest.annotation.RequestParam;
import io.github.javagossip.opendsp.dashboard.dto.RoleMenusDto;
import io.github.javagossip.opendsp.dashboard.dto.RolePermissionsDto;
import io.github.javagossip.opendsp.dashboard.service.SysRoleService;
import io.github.javagossip.opendsp.model.SysRole;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Path("/roles")
@Api(tags = "角色管理")
public class SysRoleController {

    @Resource
    private SysRoleService roleService;

    @POST
    @ApiOperation("添加角色")
    public SysRole addOrUpdateRole(@RequestBody SysRole role) {
        roleService.addOrUpdateRole(role);
        return role;
    }

    @POST
    @Path("/delete")
    @ApiOperation("删除角色")
    public void deleteRole(@RequestParam int id) {
        roleService.deleteRole(id);
    }

    @GET
    @ApiOperation("分页查询角色")
    public Page<SysRole> listRoles(@RequestParam String name,
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {
        return roleService.listRoles(name, page, size);
    }

    @POST
    @Path("/assign-permissions")
    @ApiOperation("为角色分配权限")
    public void assignPermissions(@RequestBody RolePermissionsDto rolePermissionsDto) {
        roleService.assignPermissions(rolePermissionsDto);
    }

    @POST
    @Path("/assign-menus")
    @ApiOperation("为角色分配菜单")
    public void assignMenus(@RequestBody RoleMenusDto roleMenusDto) {
        roleService.assignMenus(roleMenusDto);
    }
}
