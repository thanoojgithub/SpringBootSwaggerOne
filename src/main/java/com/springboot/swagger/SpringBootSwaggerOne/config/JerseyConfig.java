package com.springboot.swagger.SpringBootSwaggerOne.config;

import com.springboot.swagger.SpringBootSwaggerOne.endpoints.UsersEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        System.out.println("start JerseyConfig");
        register(UsersEndpoint.class);
        System.out.println("end JerseyConfig");
    }
}