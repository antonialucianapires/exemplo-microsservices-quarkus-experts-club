package com.antonialucianapires;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.Time;

@Path("/api")
public class GreetingResource {

    @Inject
    @RestClient
    TimeService timeService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return timeService.getTime();
    }
}