/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import clients.trafiklab.*;
import java.util.List;

/**
 *
 * @author rober
 */
public class TestingStopLocationsUIController {

    public static StopLocationUIController stopsUIController = new StopLocationUIController();

    public static void main(String[] args) {
//        StopLocationsClient stopClient = new StopLocationsClient();

//        stopsUIController.setStopLocationsClient(stopClient);
//        System.out.println(stopsUIController.stopLocationsClient.getClass());

        showResult();

    }

    static void showResult() {
        stopsUIController.loadStopLocations();

        List<StopLocation> stops = stopsUIController.getFoundStopLocations();

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
