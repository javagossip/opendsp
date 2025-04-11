package io.github.javagossip.opendsp.dashboard.controller;

import javax.annotation.Resource;

import org.jasypt.encryption.StringEncryptor;

import ai.houyi.dorado.rest.annotation.Controller;
import ai.houyi.dorado.rest.annotation.GET;
import ai.houyi.dorado.rest.annotation.POST;
import ai.houyi.dorado.rest.annotation.Path;
import ai.houyi.dorado.rest.annotation.RequestParam;
import ai.houyi.dorado.rest.http.MultipartFile;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 工具型控制器，用来提供一些通用的工具型接口
 */
@Controller
@Path("/utils")
@Api(tags = "通用类控制器")
public class UtilsController {

    @Resource
    private StringEncryptor stringEncryptor;

    @GET
    @Path("/encrypt")
    @ApiOperation("加密给定的字符串")
    public String encrypt(@RequestParam String text) {
        return stringEncryptor.encrypt(text);
    }

    @POST
    @Path("/upload")
    @ApiOperation("上传文件并返回文件访问url")
    public String uploadFile(MultipartFile[] files) {
        return null;
    }
}
