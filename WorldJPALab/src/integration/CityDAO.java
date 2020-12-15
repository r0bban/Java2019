package integration;

import java.util.List;
import world.domain.*;

public interface CityDAO {
    
    public List<City> getCityByName(String name);
    
}
