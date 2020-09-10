package be.intecbrussel.Data;

import be.intecbrussel.Model.Course;
import be.intecbrussel.Model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class personRepository {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SmartSchoolDB");

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
