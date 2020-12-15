/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients.mapQuest;

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
        
////    Client client = ClientBuilder.newClient();
////    WebTarget target = client.target("http://open.mapquestapi.com/geocoding/v1/address?location=Nybodagatan%203,Sverige&key=fALDgbA8xlvChAfjfOUYB0KzAAAXAYY1");
////
////            List<Result> results = target
////                .request()
////                .accept(MediaType.APPLICATION_JSON)
////                .get(mapQuestResponse.class)
////                .getResults();
////
////        List<GeoLocation> locations = new ArrayList<>();
////
////        for (Result result : results) {
////
////            for (GeoLocation location : result.getLocations()) {
////                locations.add(location);
////            }
////            
////        }
////    
////            
////            System.out.println(locations);
            
        
        
        GeoLocationsClient geoClient = new GeoLocationsClient();
        
        List <GeoLocation> platser = geoClient.getGeoLocationsByAddress("storgatan, sundsvall");
        int platsNo = 0;
        for (GeoLocation geoLocation : platser) {
            System.out.println("\nPlats: "+(++platsNo));
            System.out.println("Gata: " + geoLocation.getStreet());
            System.out.println("Stad: " + geoLocation.getAdminArea5());
            System.out.println("Postnummer: " + geoLocation.getPostalCode());
            System.out.println("Latitud: " + geoLocation.getLatLng().getLat());
            System.out.println("Longitud: " + geoLocation.getLatLng().getLng());
        }
        
        


        
        
    }
    
    
}
