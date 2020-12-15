package clients.mapQuest;

import javax.inject.Named;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rober
 */
@XmlRootElement(name = "location")
@XmlAccessorType (XmlAccessType.FIELD)
public class GeoLocation {

    @Id
    private Long id;

    private String street;
//    @XmlElement(name = "adminArea6")
    private String adminArea6; //neighborhood
//    @XmlElement(name = "adminArea5")
    private String adminArea5; //city
//    @XmlElement(name = "adminArea4")
    private String adminArea4; //county
//    @XmlElement(name = "adminArea3")
    private String adminArea3; //state
//    @XmlElement(name = "adminArea1")
    private String adminArea1; //countryCode
    private String postalCode;
    private LatLng latLng;
    private String mapUrl;

    private String latitude;
    private String longitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAdminArea6() {
        return adminArea6;
    }

    public void setAdminArea6(String adminArea6) {
        this.adminArea6 = adminArea6;
    }
    public String getAdminArea5() {
        return adminArea5;
    }

    public void setAdminArea5(String adminArea5) {
        this.adminArea5 = adminArea5;
    }

    public String getAdminArea4() {
        return adminArea4;
    }

    public void setAdminArea4(String adminArea4) {
        this.adminArea4 = adminArea4;
    }

    public String getAdminArea3() {
        return adminArea3;
    }

    public void setAdminArea3(String adminArea3) {
        this.adminArea3 = adminArea3;
    }

    public String getAdminArea1() {
        return adminArea1;
    }

    public void setAdminArea1(String adminArea1) {
        this.adminArea1 = adminArea1;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
        this.latitude = latLng.getLat();
        this.longitude = latLng.getLng();
    }

    public String getMapUrl() {
        return mapUrl;
    }

    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }

    @Override
    public String toString() {
        return "GeoLocation{" + "adminArea6=" + adminArea6 + ", adminArea5=" + adminArea5 + ", postalCode=" + postalCode + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}


