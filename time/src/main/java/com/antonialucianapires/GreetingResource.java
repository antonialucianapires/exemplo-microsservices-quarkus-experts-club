package com.antonialucianapires;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.LocalDateTime;
import java.util.Optional;

@Path("/time")
public class GreetingResource {

    @ConfigProperty(name = "configuracao")
    Optional<String> configuracao;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return configuracao.orElse("vazio ") + LocalDateTime.now();
    }
}