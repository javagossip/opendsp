package io.github.javagossip.opendsp.dashboard.controller;

import javax.annotation.Resource;

import ai.houyi.dorado.rest.annotation.Controller;
import ai.houyi.dorado.rest.annotation.POST;
import ai.houyi.dorado.rest.annotation.Path;
import ai.houyi.dorado.rest.annotation.RequestBody;
import io.github.javagossip.opendsp.dashboard.dto.AuthInfoDto;
import io.github.javagossip.opendsp.dashboard.dto.AuthRequest;
import io.github.javagossip.opendsp.dashboard.service.AuthService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Path("/auth")
@Api(tags = "认证管理")
public class AuthController {

    @Resource
    private AuthService authService;

    @POST
    @Path("/login")
    @ApiOperation("用户登录")
    public AuthInfoDto login(@RequestBody AuthRequest authRequest) {
        return authService.auth(authRequest);

    }

    @POST
    @Path("/logout")
    @ApiOperation("用户登出")
    public void logout() {
        authService.logout();
    }
}
