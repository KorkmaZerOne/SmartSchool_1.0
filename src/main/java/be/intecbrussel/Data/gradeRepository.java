package be.intecbrussel.Data;

import be.intecbrussel.Model.Course;
import be.intecbrussel.Model.Exam;
import be.intecbrussel.Model.Grade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;

public class gradeRepository {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SmartSchoolDB");

    public Optional<Grade> addGrade(Grade grade) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(grade);
        em.getTransaction().commit();
        return Optional.of(grade);
    }


    public List<Grade> getAllGrades(){
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT g FROM Grade g" , Grade.class).getResultList();
    }

    public Grade getCourseById(Long id) {
        EntityManager em = emf.createEntityManager();
        System.out.println("Grade by ID" + id);
        System.out.println("-------------------------------");
        return em.find(Grade.class, id);
    }
}
