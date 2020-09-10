package be.intecbrussel.Data;

import be.intecbrussel.Model.Grade;
import be.intecbrussel.Model.Module;
import be.intecbrussel.Model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;

public class moduleRepository {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SmartSchoolDB");

    public Optional<Module> addModule(Module module) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(module);
        em.getTransaction().commit();
        return Optional.of(module);
    }

    public List<Module> getAllModules(){
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT m FROM Module m " , Module.class).getResultList();
    }
    public Module getModuleById(Long id) {
        EntityManager em = emf.createEntityManager();
        System.out.println("Module by ID" + id);
        System.out.println("-------------------------------");
        return em.find(Module.class , id);
    }
}
