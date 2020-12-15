/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import clients.mapQuest.GeoLocation;
import clients.mapQuest.GeoLocationsClient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author rober
 */
@Named(value = "LocationUIController")
@SessionScoped
public class LocationUIController implements Serializable{
    
    @Inject
    GeoLocationsClient glc;
    
    private String searchAddress;
    
    private List<GeoLocation> foundLocations = new ArrayList<>();
    
    public String submit(){
        foundLocations = glc.getGeoLocationsByAddress(searchAddress);
        return "serachLocation.xhtml?faces-redirect=true";
    }

    public String reset(){
        foundLocations.clear();
        searchAddress = null;
        return "serachLocation.xhtml?faces-redirect=true";
    }

    /**
     * Creates a new instance of LocationUIController
     */
    public LocationUIController() {
    }


    public String getSearchAddress() {
        return searchAddress;
    }

    public void setSearchAddress(String searchAddress) {
        this.searchAddress = searchAddress;
    }

    public List<GeoLocation> getFoundLocations() {
        return foundLocations;
    }

    public void setFoundLocations(List<GeoLocation> foundLocations) {
        this.foundLocations = foundLocations;
    }
    
    
    
}
