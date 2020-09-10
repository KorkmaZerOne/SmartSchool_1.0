package be.intecbrussel.Data;

import be.intecbrussel.Model.Exam;
import be.intecbrussel.Model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;

public class examRepository {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SmartSchoolDB");

    public Optional<Exam> addExam(Exam exam) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(exam);
        em.getTransaction().commit();
        return Optional.of(exam);
    }


    public List<Exam> getAllExams(){
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT e FROM Exam e" , Exam.class).getResultList();
    }

    public Exam getExamById(Long id) {
        EntityManager em = emf.createEntityManager();
        System.out.println("Exam by ID" + id);
        System.out.println("-------------------------------");
        return em.find(Exam.class, id);
    }
}
