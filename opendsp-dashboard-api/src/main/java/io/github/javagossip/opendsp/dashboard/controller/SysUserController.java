package io.github.javagossip.opendsp.dashboard.controller;

import javax.annotation.Resource;

import com.mybatisflex.core.paginate.Page;

import ai.houyi.dorado.rest.annotation.Controller;
import ai.houyi.dorado.rest.annotation.GET;
import ai.houyi.dorado.rest.annotation.POST;
import ai.houyi.dorado.rest.annotation.Path;
import ai.houyi.dorado.rest.annotation.RequestBody;
import ai.houyi.dorado.rest.annotation.RequestParam;
import io.github.javagossip.opendsp.dashboard.dto.UserRolesDto;
import io.github.javagossip.opendsp.dashboard.service.SysUserService;
import io.github.javagossip.opendsp.model.SysUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Path("/users")
@Api(tags = "系统用户管理")
public class SysUserController {

    @Resource
    private SysUserService userService;

    @POST
    @ApiOperation("添加或更新用户")
    public SysUser addOrUpdateUser(SysUser user) {
        userService.addOrUpdateUser(user);
        return user;
    }

    @GET
    @ApiOperation("根据用户名分页查询用户")
    public Page<SysUser> listUsers(@RequestParam String name,
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {
        return userService.listUsers(name, page, size);
    }

    @POST
    @Path("/delete")
    @ApiOperation("删除用户")
    public void deleteUser(@RequestParam long id) {
        userService.deleteUser(id);
    }

    @POST
    @Path("/assign-roles")
    @ApiOperation("为用户分配角色")
    public void assignRoles(@RequestBody UserRolesDto userRolesDto) {
        userService.assignRoles(userRolesDto);
    }
}
