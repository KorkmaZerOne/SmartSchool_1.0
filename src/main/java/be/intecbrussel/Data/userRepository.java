package be.intecbrussel.Data;

import be.intecbrussel.Model.Course;
import be.intecbrussel.Model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class userRepository {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SmartSchoolDB");

    public List<User> getAllUsers(){
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT u FROM User u " , User.class).getResultList();
    }

    public User getUserByLogin (String login){
        EntityManager em = emf.createEntityManager();
        System.out.println("User by Login" + login);
        System.out.println("-------------------------------");
        return em.find(User.class , login);
    }
}
