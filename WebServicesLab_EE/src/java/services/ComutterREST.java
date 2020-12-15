/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import clients.mapQuest.GeoLocation;
import clients.mapQuest.GeoLocationsClient;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author rober
 */
@Path("/rest")
@Stateless
public class ComutterREST {

//    @Context
//    private UriInfo context;

    @Inject
    GeoLocationsClient glc;

    /**
     * Creates a new instance of ComutterREST
     */
    public ComutterREST() {
    }

    /**
     * Retrieves representation of an instance of services.ComutterREST
     *

     * @return an instance of java.lang.String
     */
    @GET
    @Path("locations")
    @Produces(MediaType.APPLICATION_XML)
    public GeoLocation getXml() {
        GeoLocation location = new GeoLocation();
        location.setStreet("Patrick street");
        return location;
    }


    /**
     * PUT method for updating or creating an instance of ComutterREST
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
