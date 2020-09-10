package be.intecbrussel.Data;

import be.intecbrussel.Model.Course;
import be.intecbrussel.Model.Exam;
import be.intecbrussel.Model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;

public class courseRepository {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SmartSchoolDB");

    public Optional<Course> addCourse(Course course) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
        return Optional.of(course);
    }

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
