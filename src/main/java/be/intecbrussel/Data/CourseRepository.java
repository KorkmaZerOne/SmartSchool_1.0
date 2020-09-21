package be.intecbrussel.Data;

import be.intecbrussel.Model.Course;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class CourseRepository {

    public void addCourse(Course course) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
    }

    public List<Course> getAllCourses() {
        EntityManager em = PersistenceProvider.createEM();
        return em.createQuery("SELECT c FROM Course c ", Course.class).getResultList();
    }

    public Optional<Course> getCourseById(Long id) {
        EntityManager em = PersistenceProvider.createEM();
        return Optional.of(em.find(Course.class, id));
    }

    public void updateCourse(Course course) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.merge(course);
        em.getTransaction().commit();
    }

    public void deleteCourse(Course course) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.remove(course);
        em.getTransaction().commit();
    }

    public void deleteCourseById(Long id) {
        getCourseById(id).ifPresent(this::deleteCourse);
    }
}
