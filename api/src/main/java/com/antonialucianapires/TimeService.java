package com.antonialucianapires;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@RegisterRestClient(baseUri = "http://localhost:8081/time")
public interface TimeService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTime();

}
