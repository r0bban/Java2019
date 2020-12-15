package clients.trafiklab;

//import javax.json.bind.annotation.JsonbProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rober
 */
@XmlRootElement(name = "StopLocationOrCoordLocation")
public class StopLocationOrCoordLocation {

    private StopLocation stopLocation;

    @XmlElement(name = "stopLocation")
//    @JsonbProperty(value = "stopLocation", nillable = false)
    public StopLocation getStopLocation() {
        return stopLocation;
    }

    public void setStopLocation(StopLocation stopLocation) {
        this.stopLocation = stopLocation;
    }

    @Override
    public String toString() {
        return "StopLocationOrCoordLocation{" + "stopLocation=" + stopLocation + '}';
    }

}
