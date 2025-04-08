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
@Api(tags = "Agency Management")
public class AgencyController {

    @Resource
    private AgencyService agencyService;

    @POST
    @ApiOperation("Add or update agency")
    public void addOrUpdateAgency(@RequestBody Agency agency) {
        agencyService.addOrUpdateAgency(agency);
    }

    @GET
    public Page<Agency> pageListAgencies(@RequestParam String name,
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "20") int size) {
        return agencyService.pageListAgencies(name, page, size);
    }

    @GET
    @Path("/get")
    @ApiOperation("Get agency by id")
    public Agency getAgency(@RequestParam int id) {
        return agencyService.getAgency(id);
    }

    @POST
    @Path("/delete")
    @ApiOperation("Delete agency by id")
    public void deleteAgency(@RequestParam int id) {
        agencyService.deleteAgency(id);
    }

    @POST
    @Path("/enable")
    @ApiOperation("Enable agency by id")
    public void enableAgency(@RequestParam int id) {
        agencyService.enableAgency(id);
    }

    @POST
    @Path("/disable")
    @ApiOperation("Disable agency by id")
    public void disableAgency(@RequestParam int id) {
        agencyService.disableAgency(id);
    }

    @POST
    @Path("/password")
    @ApiOperation("代理商密码修改")
    public void updatePassword(@RequestBody AgencyPasswordDto agencyPasswordDto) {
        agencyService.updatePassword(agencyPasswordDto);
    }
}
