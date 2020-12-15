package clients.trafiklab;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class StopLocationsClient {

    Client client = ClientBuilder.newClient();
    WebTarget target = client.target("http://api.sl.se/api2/nearbystopsv2?originCoordLat={inputLat}&originCoordLong={inputLong}&r={searchRadieMeters}&key={key}");

    public List<StopLocation> getStopLocationsByLatLong(String inputLat, String inputLong, String searchRadieMeters) {
        String jsonResponse = target
                .resolveTemplate("inputLat", inputLat)
                .resolveTemplate("inputLong", inputLong)
                .resolveTemplate("searchRadieMeters", searchRadieMeters)
                .resolveTemplate("key", "f89f21a64630451aa054d92e0588a5ef")
                .request()
                .accept(MediaType.APPLICATION_JSON)
                .get(String.class);

        jsonResponse = jsonResponse.replaceAll("StopLocation", "stopLocation");
        ObjectMapper om = new ObjectMapper();

        StopLocationsJsonResponse modifiedStopLocationsJsonResponse = new StopLocationsJsonResponse();

        try {
            modifiedStopLocationsJsonResponse = om.readValue(jsonResponse, StopLocationsJsonResponse.class);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(StopLocationsClient.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Utskrift av mofifierat Response-objekt: " + modifiedStopLocationsJsonResponse);

        List<StopLocation> stopLocations = new ArrayList<>();

        modifiedStopLocationsJsonResponse.getStopLocationOrCoordLocation().forEach((stop) -> {
            stopLocations.add(stop.getStopLocation());
        });

        return stopLocations;
    }

}
