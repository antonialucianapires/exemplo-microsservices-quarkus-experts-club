package com.antonialucianapires;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;

@Readiness
public class ReadinessProble implements HealthCheck {

    @Inject
    @RestClient
    TimeService timeService;

    @Override
    public HealthCheckResponse call() {
        return timeService.getTime() == null ? HealthCheckResponse.down("Serviço Time com problema.") : HealthCheckResponse.up("Ok!");
    }
}
