package com.springboot.swagger.SpringBootSwaggerOne.endpoints;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Component
@Path("/api/user")
public class UsersEndpoint {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String SayHello(@QueryParam("name") @NotNull String name) {
        return "Hello " + name +" !";
    }
}
