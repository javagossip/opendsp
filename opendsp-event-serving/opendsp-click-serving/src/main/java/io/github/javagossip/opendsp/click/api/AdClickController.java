package io.github.javagossip.opendsp.click.api;

import ai.houyi.dorado.rest.annotation.Controller;
import ai.houyi.dorado.rest.annotation.GET;
import ai.houyi.dorado.rest.annotation.Path;
import io.swagger.annotations.ApiOperation;

@Controller
@Path("/ad-clicks")
public class AdClickController {

    @GET
    @ApiOperation("广告点击")
    public void clickAd() {
        //TODO 广告点击服务
    }
}
