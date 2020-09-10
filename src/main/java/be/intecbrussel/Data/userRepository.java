package be.intecbrussel.Data;

import be.intecbrussel.Model.Course;
import be.intecbrussel.Model.User;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

public class userRepository {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SmartSchoolDB");

    public Optional<User> addUser(User user) {
        EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        return Optional.of(user);
    }
    public List<User> getAllUsers(){
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT u FROM User u");
        return em.createQuery("SELECT u FROM User u " , User.class).getResultList();
    }

    public User getUserByLogin (String login){
        EntityManager em = emf.createEntityManager();
        System.out.println("User by Login" + login);
        System.out.println("-------------------------------");
        return em.find(User.class , login);
    }
}
