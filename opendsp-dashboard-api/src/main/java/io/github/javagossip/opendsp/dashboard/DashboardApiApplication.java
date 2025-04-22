package io.github.javagossip.opendsp.dashboard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import ai.houyi.dorado.springboot.EnableDorado;
import ai.houyi.dorado.swagger.EnableSwagger;

@SpringBootApplication
@EnableDorado
@EnableSwagger
@MapperScan("io.github.javagossip.opendsp.mapper")
@ComponentScan({
        "io.github.javagossip.opendsp", "ai.houyi.dorado.rest.controller.helper"
})
public class DashboardApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashboardApiApplication.class);
    }
}
