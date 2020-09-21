package be.intecbrussel.Data;

import be.intecbrussel.Model.User;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    public void addUser(User user) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

    public List<User> getAllUsers() {
        EntityManager em = PersistenceProvider.createEM();
        return em.createQuery("SELECT u FROM User u ", User.class).getResultList();
    }

    public Optional<User> getUserByLogin(String login) {
        EntityManager em = PersistenceProvider.createEM();
        return Optional.of(em.find(User.class, login));
    }

    public void updateUser(User user) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
    }

    public void deleteUser(User user) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.remove(user);
        em.getTransaction().commit();
    }

    public void deleteUserByLogin(String login) {
        getUserByLogin(login).ifPresent(this::deleteUser);
    }
}
