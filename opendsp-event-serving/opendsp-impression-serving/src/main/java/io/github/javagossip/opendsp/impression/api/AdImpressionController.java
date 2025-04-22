package io.github.javagossip.opendsp.impression.api;

import ai.houyi.dorado.rest.annotation.Controller;
import ai.houyi.dorado.rest.annotation.GET;
import ai.houyi.dorado.rest.annotation.Path;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Path("/ad-impressions")
@Api("广告曝光记录服务")
public class AdImpressionController {

    @GET
    @ApiOperation("创建广告曝光记录")
    public void impressionAd() {
    }
}
