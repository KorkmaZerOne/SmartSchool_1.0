import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class SmartSchoolApp {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("smartSchoolDB");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Person person1 = new Person();
        person1.setFirstName("Omer");
        person1.setFamilyName("Korkmaz");
        person1.setGender(Gender.MALE);

        Course course1 = new Course();
        Course course2 = new Course();

        Module module1 = new Module();
        Module module2 = new Module();

        Exam exam1 = new Exam();
        Grade grade1 = new Grade();

        List<Course> courses = new ArrayList<Course>();
        List<Module> modules = new ArrayList<Module>();
        List<Exam> exams = new ArrayList<Exam>();
        List<Grade> grades = new ArrayList<Grade>();

        em.getTransaction().begin();
        em.persist(person1);
        em.persist(course1);
        em.persist(module1);
        em.persist(exam1);
        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
