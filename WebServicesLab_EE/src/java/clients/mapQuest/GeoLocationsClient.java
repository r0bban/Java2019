package clients.mapQuest;

import com.fasterxml.jackson.annotation.JacksonInject;

import java.util.ArrayList;
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
public class GeoLocations {

    Client client = ClientBuilder.newClient();
    WebTarget target = client.target("http://open.mapquestapi.com/geocoding/v1/address?location={location}{country}&key={key}");

    public List<GeoLocation> getGeoLocationsByAddress(String address) {
        List<Result> results = target
                .resolveTemplate("location", address)
                .resolveTemplate("country", ", Sweden")
                .resolveTemplate("key", "fALDgbA8xlvChAfjfOUYB0KzAAAXAYY1")
                .request()
                .accept(MediaType.APPLICATION_JSON)
                .get(mapQuestResponse.class)
                .getResults();
        List<GeoLocation> locations = new ArrayList<>();
        results.forEach((result) -> {
            result.getLocations().forEach((location) -> {
                locations.add(location);
            });
        });
        return locations;
    }

}
