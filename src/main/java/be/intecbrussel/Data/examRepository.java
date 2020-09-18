package be.intecbrussel.Data;

import be.intecbrussel.Model.Exam;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class examRepository {

    public void addExam(Exam exam) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.persist(exam);
        em.getTransaction().commit();
    }

    public List<Exam> getAllExams() {
        EntityManager em = PersistenceProvider.createEM();
        return em.createQuery("SELECT e FROM Exam e", Exam.class).getResultList();
    }

    public Optional<Exam> getExamById(Long id) {
        EntityManager em = PersistenceProvider.createEM();
        return Optional.of(em.find(Exam.class, id));
    }

    public void updateExam(Exam exam) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.merge(exam);
        em.getTransaction().commit();
    }

    public void deleteExam(Exam exam) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.remove(exam);
        em.getTransaction().commit();
    }

    public void deleteExamById(Long id) {
        getExamById(id).ifPresent(this::deleteExam);
    }
}
