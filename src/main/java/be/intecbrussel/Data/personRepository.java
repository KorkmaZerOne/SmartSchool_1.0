package be.intecbrussel.Data;

import be.intecbrussel.Model.Course;
import be.intecbrussel.Model.Person;
import be.intecbrussel.Model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;

public class personRepository {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SmartSchoolDB");

    public Optional<Person> addPerson(Person person) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        return Optional.of(person);
    }

    public List<Person> getAllPersons(){
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT p FROM Person p " , Person.class).getResultList();
    }

    public Person getPersonById(int id){
        EntityManager em = emf.createEntityManager();
        System.out.println("Person by ID" + id);
        System.out.println("-------------------------------");
        return em.find(Person.class , id);
    }




}
