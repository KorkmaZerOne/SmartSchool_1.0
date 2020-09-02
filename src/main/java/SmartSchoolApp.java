import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class SmartSchoolApp {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SmartSchoolDB");
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
        grade1.setName("Weak");
        grade1.setExam(exam1);
        grade1.setPerson(person1);

        User user1 = new User();
        user1.setPerson(person1);
        user1.setLogin("O_M_E_R");
        user1.setPasswordhash("Qwert1234");
        user1.setActive(true);

        List<Course> courses = new ArrayList<Course>();
        List<Module> modules = new ArrayList<Module>();
        List<Exam> exams = new ArrayList<Exam>();
        List<Grade> grades = new ArrayList<Grade>();
        grades.add(grade1);

        person1.setCurse(course1);
        person1.setUser(user1);
        person1.setGrade(grades);

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
