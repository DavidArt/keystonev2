package com.keystone.rest;

import com.keystone.dto.Observation;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by david on 07-Apr-17.
 */

@Path(RestConstants.SENSOR_DATA_PATH)
public class ObservationResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createObservation(Observation observation) {

        System.out.println("mesage: " + observation);

        return Response
                .ok()
                .entity(observation)
                .build();
    }
}
