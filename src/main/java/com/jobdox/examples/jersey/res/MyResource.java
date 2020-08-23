package com.jobdox.examples.jersey.res;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/{apiversion : v[^/]+?}/experian/project/{project}")
public class MyResource {

    @Path("my/get")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getMessage(@PathParam("project") String project,
                             @QueryParam("start") String  start) {

        // System.out.println("apiversion:");
        System.out.println(project + ":" + start);
        return "{\"k\": \"v\"}";
    }

    @Path("my/new")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String setMessage(@PathParam("project") String project,
                             MyRequest req) {

        // System.out.println("apiversion:");
        System.out.println(req + ":" + req);
        return "{\"k\": \"v\"}";
    }

}
