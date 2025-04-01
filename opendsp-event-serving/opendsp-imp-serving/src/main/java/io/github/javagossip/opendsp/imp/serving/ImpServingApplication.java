package io.github.javagossip.opendsp.imp.serving;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ai.houyi.dorado.springboot.EnableDorado;
import ai.houyi.dorado.swagger.EnableSwagger;

@SpringBootApplication
@EnableDorado
@EnableSwagger
public class ImpServingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImpServingApplication.class);
    }
}
