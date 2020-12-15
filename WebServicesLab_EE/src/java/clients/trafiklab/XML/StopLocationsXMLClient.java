package clients.trafiklab.XML;

import clients.trafiklab.StopLocation;
import java.util.Arrays;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author rober
 */
@ApplicationScoped
public class StopLocationsXMLClient {

    Client client = ClientBuilder.newClient();
    WebTarget target = client.target("http://api.sl.se/api2/nearbystopsv2.xml?originCoordLat={inputLat}&originCoordLong={inputLong}&r={searchRadieMeters}&key={key}");

    public List<StopLocation> getStopLocationsByLatLong(String inputLat, String inputLong, String searchRadieMeters) {
//        List<StopLocation> result = target
//                .resolveTemplate("inputLat", inputLat)
//                .resolveTemplate("inputLong", inputLong)
//                .resolveTemplate("searchRadieMeters", searchRadieMeters)
//                .resolveTemplate("key", "f89f21a64630451aa054d92e0588a5ef")
//                .request()
//                .accept(MediaType.APPLICATION_XML)
//                .get(StopLocationsXMLResponse.class)
//                .getLocationList()
//                .getStopLocations();
        
             StopLocation[] StopLocation = target
                .resolveTemplate("inputLat", inputLat)
                .resolveTemplate("inputLong", inputLong)
                .resolveTemplate("searchRadieMeters", searchRadieMeters)
                .resolveTemplate("key", "f89f21a64630451aa054d92e0588a5ef")
                .request()
                .accept(MediaType.APPLICATION_XML)
                .get(StopLocation[].class);
                     
        List<StopLocation> result = Arrays.asList(StopLocation);

        System.out.println(result);
        return result;
    }

}
