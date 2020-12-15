/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients.trafiklab.XML;

import clients.trafiklab.StopLocation;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rober
 */
@XmlRootElement(name = "LocationList")
@XmlAccessorType(XmlAccessType.FIELD)
public class LocationList {

    @XmlElement(name = "StopLocation")
    private List <StopLocation> stopLocations;

    public List<StopLocation> getStopLocations() {
        return stopLocations;
    }

    public void setStopLocations(List<StopLocation> stopLocations) {
        this.stopLocations = stopLocations;
    }

    @Override
    public String toString() {
        return "LocationList{" + "stopLocations=" + stopLocations + '}';
    }



}
