package clients.trafiklab;

//import javax.json.bind.annotation.JsonbProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rober
 */
@XmlRootElement(name = "StopLocation")
public class StopLocation {

    
    private String id;
    private String extId;
    private String hasMainMast;
    private String mainMastId;
    private String mainMastExtId;
    private String name;
    private String lon;
    private String lat;
    private String weight;
    private String dist;
    private String products;

//    @JsonbProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//    @JsonbProperty("extId")
    public String getExtId() {
        return extId;
    }

    public void setExtId(String extId) {
        this.extId = extId;
    }

//    @JsonbProperty("hasMainMast")
    public String getHasMainMast() {
        return hasMainMast;
    }

    public void setHasMainMast(String hasMainMast) {
        this.hasMainMast = hasMainMast;
    }

//    @JsonbProperty("mainMastId")
    public String getMainMastId() {
        return mainMastId;
    }

    public void setMainMastId(String mainMastId) {
        this.mainMastId = mainMastId;
    }

//    @JsonbProperty("mainMastExtId")
    public String getMainMastExtId() {
        return mainMastExtId;
    }

    public void setMainMastExtId(String mainMastExtId) {
        this.mainMastExtId = mainMastExtId;
    }

//    @JsonbProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @JsonbProperty("lon")
    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

//    @JsonbProperty("lat")
    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

//    @JsonbProperty("weight")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

//    @JsonbProperty("dist")
    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

//    @JsonbProperty("products")
    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "StopLocation{" + "name=" + name + ", lon=" + lon + ", lat=" + lat + ", dist=" + dist + '}';
    }
    
    
    
    
    

    
}
