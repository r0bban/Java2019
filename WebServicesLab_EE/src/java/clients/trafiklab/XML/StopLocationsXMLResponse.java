package clients.trafiklab.XML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author rober
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class StopLocationsXMLResponse {

    private LocationList locationList;

    @XmlElement(name = "LocationList")
    public LocationList getLocationList() {
        return locationList;
    }

    public void setLocationList(LocationList locationList) {
        this.locationList = locationList;
    }
    
    

}
