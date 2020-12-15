package integration;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import world.domain.Country;

public class CountryDAOImpl implements CountryDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("worldPU");

    @Override
    public Country getCountryByName(String name) {
        try {
            EntityManager em = emf.createEntityManager();
            Country country
                    = em.createQuery("FROM Country c WHERE c.name LIKE :name", Country.class)
                            .setParameter("name", name)
                            .getSingleResult();
            return country;
        } catch (NoResultException nre) {
            throw nre;
        } catch (Exception e) {
            throw new RuntimeException("DAO getCountryByName problem: " + e);
        }
    }

    @Override
    public boolean createCountry(Country country) {
        EntityManager em = emf.createEntityManager();
        Country cNew = em.find(Country.class, country.getCode());
        if (cNew != null) {
            em.getTransaction().begin();
            em.merge(country);
            em.getTransaction().commit();
            return true;
        } else {
            try {
                em.getTransaction().begin();
                em.persist(country);
                em.getTransaction().commit();
                return true;
            } catch (Exception e) {
                em.getTransaction().rollback();
                throw new RuntimeException("DAO createCountry problem: " + e);
            }
        }
    }

    @Override
    public Country getCountryByCode(String code) {
        try {
            EntityManager em = emf.createEntityManager();
            Country country
                    = em.createQuery("FROM Country c WHERE c.code LIKE :code", Country.class)
                            .setParameter("code", code)
                            .getSingleResult();
            return country;
        } catch (NoResultException nre) {
            throw nre;
        } catch (Exception e) {
            throw new RuntimeException("DAO getCountryByCode problem: " + e);
        }
    }
    
    @Override
    public boolean updateCountry(Country country) {
        try {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.merge(country);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            throw new RuntimeException("DAO updateCountry problem: " + e);
        }
    }


}
