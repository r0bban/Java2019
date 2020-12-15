/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients.mapQuest;

import java.util.List;

/**
 *
 * @author rober
 */
public class Result {

    private List<GeoLocation> locations;

    public List<GeoLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<GeoLocation> locations) {
        this.locations = locations;
    }

}
