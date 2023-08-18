package dev.rpmhub;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
public class Start {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy";
    }

    @GET
    @Path("/no2kmh/{km}")
    @Produces(MediaType.APPLICATION_JSON)
    public String no2kmh(@PathParam("km") Double km){
        Double x= km*1.852;
        String xx= String. valueOf(x);
        return xx;
    }

    @POST
    @Path("/kmh2mih")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public String kmh2mih(@FormParam("kmh") Double kmh){
        Double x=kmh*0.621;
        String xx= String. valueOf(x);
        return xx; 
    }

}
