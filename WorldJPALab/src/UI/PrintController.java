package UI;

import integration.CityDAO;
import integration.CityDAOImpl;
import integration.CountryDAO;
import integration.CountryDAOImpl;
import java.util.List;
import javax.persistence.NoResultException;
import world.domain.City;
import world.domain.Country;

public class PrintController {

    public static void printCountryByName(String name) {
        CountryDAO countryDAO = new CountryDAOImpl();
        try {
            Country country = countryDAO.getCountryByName(name);
            System.out.println(country.getName() + ", Huvudstad: " + country.getCapital().getName());
            System.out.println("Städer i " + country.getName() + " är:");
//            Set <City> cities = country.getCities(); --> tänkte göra list och soertera men strundatde i det
            for (City city : country.getCities()) {
                System.out.println(city.getName());
            }
        } catch (NoResultException nre) {
            System.out.println("Hittade inget land med det namnet");
        }
    }

    public static void printCityByName(String name) {
        CityDAO cityDAO = new CityDAOImpl();
        List<City> citiesSearch = cityDAO.getCityByName(name);
        System.out.printf("Found %d matches for: %s\n\n", citiesSearch.size(), name);
        int resultNo=0;
        for (City city : citiesSearch) {
            ++resultNo;
            System.out.println(resultNo +" " + city.getName()+ " has a population of " + city.getPopulation() + " and is located in " + city.getCountry().getName());
        }
    }
    
    
    public static void printCountryForEdit(Country country) {
        //CountryDAO countryDAO = new CountryDAOImpl();
//        try {
            //Country country = countryDAO.getCountryByCode(code);
            System.out.println(country.getName()
                    + ", Landskod: " + country.getCode()
                    + ", Huvudstad: " + country.getCapital().getName()
                    + "\n[1]Namn: " + country.getName()
                    + "\n[2]Kontinent: " + country.getContinent()
                    + "\n[3]Region: " + country.getRegion()
                    + "\n[4]Populastion: " + country.getPopulation());
//        } catch (NoResultException nre) {
//            System.out.println("Hittade inget land med det namnet");
//        }
    }



    
}
