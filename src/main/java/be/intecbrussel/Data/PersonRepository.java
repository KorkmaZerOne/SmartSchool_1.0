package be.intecbrussel.Data;

import be.intecbrussel.Model.Person;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class PersonRepository {

    public void addPerson(Person person) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
    }

    public List<Person> getAllPersons() {
        EntityManager em = PersistenceProvider.createEM();
        return em.createQuery("SELECT p FROM Person p ", Person.class).getResultList();
    }

    public Optional<Person> getPersonById(int id) {
        EntityManager em = PersistenceProvider.createEM();
        return Optional.of(em.find(Person.class, id));
    }

    public void updatePerson(Person person) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.merge(person);
        em.getTransaction().commit();
    }

    public void deletePerson(Person person) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.remove(person);
        em.getTransaction().commit();
    }

    public void deletePersonById(int id) {
        getPersonById(id).ifPresent(this::deletePerson);
    }
}
