package io.github.javagossip.opendsp.click.serving.api;

import ai.houyi.dorado.rest.annotation.Controller;
import ai.houyi.dorado.rest.annotation.Path;

@Controller
@Path("/")
public class AdClickController {

    public String adClick() {
        return "click";
    }
}
