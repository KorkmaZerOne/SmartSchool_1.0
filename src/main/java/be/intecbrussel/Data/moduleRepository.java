package be.intecbrussel.Data;

import be.intecbrussel.Model.Module;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class moduleRepository {

    public void addModule(Module module) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.persist(module);
        em.getTransaction().commit();
    }

    public List<Module> getAllModules() {
        EntityManager em = PersistenceProvider.createEM();
        return em.createQuery("SELECT m FROM Module m ", Module.class).getResultList();
    }

    public Optional<Module> getModuleById(Long id) {
        EntityManager em = PersistenceProvider.createEM();
        return Optional.of(em.find(Module.class, id));
    }

    public void updateModule(Module module) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.merge(module);
        em.getTransaction().commit();
    }

    public void deleteModule(Module module) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.remove(module);
        em.getTransaction().commit();
    }

    public void deleteModuleById(Long id) {
        getModuleById(id).ifPresent(this::deleteModule);
    }

}
