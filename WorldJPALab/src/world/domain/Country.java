package world.domain;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Country {

    @Id
    private String code;
    private String name;
    private String continent;
    private String region;
    private int population;
    
    @OneToOne (cascade = CascadeType.PERSIST)
    @JoinColumn(name = "capital")
    private City capital;
    
    @OneToMany(mappedBy = "country")
    private Set<City> cities;

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }
    
    

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }
    
    

    public Country() {
    }
    
    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    
    
    @Override
    public String toString() {
        return "Country{" + "code=" + code + ", name=" + name + ", continent=" + continent + ", region=" + region + ", population=" + population + ", capital=" + capital.getName() + '}';
    }



    
}
