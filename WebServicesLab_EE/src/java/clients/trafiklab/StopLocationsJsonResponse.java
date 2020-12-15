/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients.trafiklab;

import java.util.List;
//import javax.json.bind.annotation.JsonbProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rober
 */
@XmlRootElement
public class StopLocationsJsonResponse {
    
    private List<StopLocationOrCoordLocation> stopLocationOrCoordLocation;
    
    private String serverVersion;
    private String dialectVersion;
    private String requestId;


    @XmlElement (name = "stopLocationOrCoordLocation")
//    @JsonbProperty("stopLocationOrCoordLocation")
    public List<StopLocationOrCoordLocation> getStopLocationOrCoordLocation() {
        return stopLocationOrCoordLocation;
    }

    public void setStopLocationOrCoordLocation(List<StopLocationOrCoordLocation> stopLocationOrCoordLocation) {
        this.stopLocationOrCoordLocation = stopLocationOrCoordLocation;
    }

    @Override
    public String toString() {
        return "StopLocationsJsonResponse{" + "stopLocationOrCoordLocation=" + stopLocationOrCoordLocation + '}';
    }

    public String getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    public String getDialectVersion() {
        return dialectVersion;
    }

    public void setDialectVersion(String dialectVersion) {
        this.dialectVersion = dialectVersion;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    

    
    
}
