package io.github.javagossip.opendsp.dashboard.controller;

import javax.annotation.Resource;

import com.mybatisflex.core.paginate.Page;

import ai.houyi.dorado.rest.annotation.Controller;
import ai.houyi.dorado.rest.annotation.GET;
import ai.houyi.dorado.rest.annotation.POST;
import ai.houyi.dorado.rest.annotation.Path;
import ai.houyi.dorado.rest.annotation.RequestBody;
import ai.houyi.dorado.rest.annotation.RequestParam;
import io.github.javagossip.opendsp.dashboard.dto.AgencyPasswordDto;
import io.github.javagossip.opendsp.dashboard.service.AgencyService;
import io.github.javagossip.opendsp.model.Agency;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Path("/agencies")
@Api(tags = "广告代理商管理")
public class AgencyController {

    @Resource
    private AgencyService agencyService;

    @POST
    @ApiOperation("新建或更新代理商")
    public void addOrUpdateAgency(@RequestBody Agency agency) {
        agencyService.addOrUpdateAgency(agency);
    }

    @GET
    @ApiOperation("分页获取代理商列表")
    public Page<Agency> pageListAgencies(@RequestParam String name,
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "20") int size) {
        return agencyService.pageListAgencies(name, page, size);
    }

    @GET
    @Path("/get")
    @ApiOperation("查看代理商信息")
    public Agency getAgency(@RequestParam Integer id) {
        return agencyService.getAgency(id);
    }

    @POST
    @Path("/delete")
    @ApiOperation("删除代理商")
    public void deleteAgency(@RequestParam Integer id) {
        agencyService.deleteAgency(id);
    }

    @POST
    @Path("/enable")
    @ApiOperation("代理商启用")
    public void enableAgency(@RequestParam Integer id) {
        agencyService.enableAgency(id);
    }

    @POST
    @Path("/disable")
    @ApiOperation("代理商禁用")
    public void disableAgency(@RequestParam Integer id) {
        agencyService.disableAgency(id);
    }

    @POST
    @Path("/password")
    @ApiOperation("代理商密码修改")
    public void updatePassword(@RequestBody AgencyPasswordDto agencyPasswordDto) {
        agencyService.updatePassword(agencyPasswordDto);
    }
}
