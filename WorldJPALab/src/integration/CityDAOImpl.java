package integration;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import world.domain.City;

public class CityDAOImpl implements CityDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("worldPU");

    @Override
    public List<City> getCityByName(String name) {
        try {
            EntityManager em = emf.createEntityManager();
            List<City> list
                    = em.createQuery("FROM City c WHERE c.name LIKE :name", City.class)
                     .setParameter("name", name)
                    .getResultList();
            return list;
        } catch (Exception e) {
            throw new RuntimeException("DAO getCityByname problem: " + e);
        }
    }

}
