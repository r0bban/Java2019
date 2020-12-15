/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients.trafiklab;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author rober
 */
public class Main {

    public static void main(String[] args) {
        
            Client client = ClientBuilder.newClient();
    WebTarget target = client.target("http://api.sl.se/api2/nearbystopsv2?originCoordLat=59.35643&originCoordLong=17.991378&r=2000&key=f89f21a64630451aa054d92e0588a5ef");

        List<StopLocationOrCoordLocation> kalle = new ArrayList<>();
        
                kalle = target
                .request()
                .accept(MediaType.APPLICATION_JSON)
                .get(StopLocationsJsonResponse.class)
                .getStopLocationOrCoordLocation();

//        List<StopLocation> stopLocations = new ArrayList<>();


        System.out.println(kalle);
        
        
    }

  

    }
