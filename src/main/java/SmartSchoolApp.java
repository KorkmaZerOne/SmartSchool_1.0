import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;
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
        person1.setGender(Gender.AGENDER);

        Course course1 = new Course();
        course1.setName("Java EEr");
        course1.setActive(true);
        course1.setCode("java2020");
        course1.setDescription("Deze opleiding richt zich tot werkzoekenden met interesse in programmatie.");
        course1.setImageUrl("http://www.intecbrussel.be/opleidingen/java-developer-1//");

        Course course2 = new Course();

        Module module1 = new Module();
        module1.setName("Java Fundamental");
        module1.setCurse(course1);
        module1.setDescription("Deze opleiding richt zich tot werkzoekenden met interesse in programmatie.");

        Module module2 = new Module();

        Exam exam1 = new Exam();
        exam1.setName("Evaluation");
        exam1.setDate(LocalDate.now());
        exam1.setDescription("No comment");
        exam1.setModule(module1);
        exam1.setWeight(50);
        exam1.setTotal(100);

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
        courses.add(course1);
        courses.add(course2);

        List<Module> modules = new ArrayList<Module>();
        modules.add(module1);
        modules.add(module2);

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
