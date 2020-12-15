package integration;

import world.domain.*;

public interface CountryDAO {

    public Country getCountryByName(String name);
    
    public Country getCountryByCode(String code);
    public boolean updateCountry(Country country);

    

    public boolean createCountry(Country country);

}
