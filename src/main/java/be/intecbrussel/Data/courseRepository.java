package be.intecbrussel.Data;

import be.intecbrussel.Model.Course;
import be.intecbrussel.Model.Exam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class courseRepository {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SmartSchoolDB");

    public List<Course> getAllCourses() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT c FROM Course c ", Course.class).getResultList();
    }

    public Course getCourseById(Long id) {
        EntityManager em = emf.createEntityManager();
        System.out.println("Course by ID" + id);
        System.out.println("-------------------------------");
        return em.find(Course.class, id);
    }
}
