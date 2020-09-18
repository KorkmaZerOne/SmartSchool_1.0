package be.intecbrussel.Data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceProvider {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("SmartSchoolDB");

    public static EntityManager createEM(){
        return emf.createEntityManager();
    }
}
