package be.intecbrussel.Data;

import be.intecbrussel.Model.Exam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class examRepository {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SmartSchoolDB");

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
