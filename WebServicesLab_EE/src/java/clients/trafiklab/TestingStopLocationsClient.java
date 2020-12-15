/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients.trafiklab;

import controllers.StopLocationUIController;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author rober
 */
public class TestingStopLocationsClient {

    public static StopLocationsClient stopClient = new StopLocationsClient();

    public static void main(String[] args) {


        showResult();

    }

    static void showResult() {
        String inputLat = "59.35643";
        String inputLong = "17.991378";
        String searchRadieMeters = "2000";

        List<StopLocation> stops = stopClient.getStopLocationsByLatLong(inputLat, inputLong, searchRadieMeters);

        int platsNo = 0;
        for (StopLocation stopLocation : stops) {
            System.out.println("\nResultat: " + (++platsNo));
            System.out.println("Hållplatsnamn: " + stopLocation.getName());
            System.out.println("Avstånd från position: " + stopLocation.getDist());
            System.out.println("Latitud: " + stopLocation.getLat());
            System.out.println("Longitud: " + stopLocation.getLon());
        }
    }

}
