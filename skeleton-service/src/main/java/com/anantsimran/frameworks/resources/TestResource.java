package com.anantsimran.frameworks.resources;

import com.anantsimran.frameworks.service.TestService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



@Path("/test/")
@Api
@Getter
public class TestResource {

    @Inject
    public TestResource(TestService testService) {
        this.testService = testService;
    }

    private TestService testService;


    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public Response helloWorld(){
        return Response.status(200).entity(testService.getTestString()).build();
    }


}
