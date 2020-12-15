/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import clients.trafiklab.StopLocation;
import clients.trafiklab.StopLocationsClient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author rober
 */
@Named(value = "StopLocationUIController")
@SessionScoped
public class StopLocationUIController implements Serializable {

    @Inject
    StopLocationsClient stopLocationsClient;

    private String inputLat;// = "59.35643";
    private String inputLong;// = "17.991378";
    private String searchRadieMeters = "2000";

    private String searchedStreet;
    private String searchedNeighborhood;
    private String searchedCity;
    private String searchedCounty;
    private String searchedPostalCode;

    private List<StopLocation> foundStopLocations = new ArrayList<>();

    /**
     * Creates a new instance of LocationUIController
     */
    public StopLocationUIController() {
    }

    public void loadStopLocations() {
        foundStopLocations = stopLocationsClient.getStopLocationsByLatLong(inputLat, inputLong, searchRadieMeters);
//        System.out.println("FadkjDASKLJsdkfjsDKLFJKSDj" + foundStopLocations);
    }

    public void refreshStopLocations(String inputLat, String inputLong, String searchRadieMeters) {
        foundStopLocations = stopLocationsClient.getStopLocationsByLatLong(inputLat, inputLong, searchRadieMeters);
    }

    public String navigateFromGeoLocation(String inputLat, String inputLong, String searchedStreet, String searchedNeighborhood, String searchedCity, String searchedCounty, String searchedPostalCode) {
        this.searchedStreet = searchedStreet;
        this.searchedNeighborhood = searchedNeighborhood;
        this.searchedCity = searchedCity;
        this.searchedCounty = searchedCounty;
        this.searchedPostalCode = searchedPostalCode;
        try {
            foundStopLocations = stopLocationsClient.getStopLocationsByLatLong(inputLat, inputLong, searchRadieMeters);
            return "stopLocationsResult.xhtml?faces-redirect=true";
        } catch (Exception e) {
            foundStopLocations.clear();
            return "stopLocationsResult.xhtml?faces-redirect=true";
        }

    }

    public String getInputLat() {
        return inputLat;
    }

    public void setInputLat(String inputLat) {
        this.inputLat = inputLat;
    }

    public String getInputLong() {
        return inputLong;
    }

    public void setInputLong(String inputLong) {
        this.inputLong = inputLong;
    }

    public String getSearchRadieMeters() {
        return searchRadieMeters;
    }

    public void setSearchRadieMeters(String searchRadieMeters) {
        this.searchRadieMeters = searchRadieMeters;
    }

    public List<StopLocation> getFoundStopLocations() {
        return foundStopLocations;
    }

    public void setFoundStopLocations(List<StopLocation> foundStopLocations) {
        this.foundStopLocations = foundStopLocations;
    }

    public String getSearchedStreet() {
        return searchedStreet;
    }

    public void setSearchedStreet(String searchedStreet) {
        this.searchedStreet = searchedStreet;
    }

    public String getSearchedNeighborhood() {
        return searchedNeighborhood;
    }

    public void setSearchedNeighborhood(String searchedNeighborhood) {
        this.searchedNeighborhood = searchedNeighborhood;
    }

    public String getSearchedCity() {
        return searchedCity;
    }

    public void setSearchedCity(String searchedCity) {
        this.searchedCity = searchedCity;
    }

    public String getSearchedCounty() {
        return searchedCounty;
    }

    public void setSearchedCounty(String searchedCounty) {
        this.searchedCounty = searchedCounty;
    }

    public String getSearchedPostalCode() {
        return searchedPostalCode;
    }

    public void setSearchedPostalCode(String searchedPostalCode) {
        this.searchedPostalCode = searchedPostalCode;
    }

   
    

}
