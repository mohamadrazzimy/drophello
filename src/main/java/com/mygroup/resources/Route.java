package com.mygroup.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class Route {

    public Route() {}
    @GET
    public String sayHelloWorld() {
        String s = "Hello World";
        return s;
    }
    @GET
    @Path("/test")
    public String getHelloWorldTest() {
        String s = "Hello World Test";
        return s;
    }

}