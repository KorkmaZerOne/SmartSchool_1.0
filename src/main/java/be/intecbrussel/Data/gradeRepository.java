package be.intecbrussel.Data;

import be.intecbrussel.Model.Grade;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class gradeRepository {

    public void addGrade(Grade grade) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.persist(grade);
        em.getTransaction().commit();
    }

    public List<Grade> getAllGrades() {
        EntityManager em = PersistenceProvider.createEM();
        return em.createQuery("SELECT g FROM Grade g", Grade.class).getResultList();
    }

    public Optional<Grade> getGradeById(Long id) {
        EntityManager em = PersistenceProvider.createEM();
        return Optional.of(em.find(Grade.class, id));
    }

    public void updateGrade(Grade grade) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.merge(grade);
        em.getTransaction().commit();
    }

    public void deleteGrade(Grade grade) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.remove(grade);
        em.getTransaction().commit();
    }

    public void deleteGradeById(Long id) {
        getGradeById(id).ifPresent(this::deleteGrade);
    }
}