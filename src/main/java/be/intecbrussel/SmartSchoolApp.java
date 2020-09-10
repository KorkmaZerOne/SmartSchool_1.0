package be.intecbrussel;

import be.intecbrussel.Model.*;
import be.intecbrussel.Model.Module;
import be.intecbrussel.Service.*;


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
        Course course1 = new Course();
        Course course2 = new Course();
        Module module1 = new Module();
        Module module2 = new Module();
        Exam exam1 = new Exam();
        Grade grade1 = new Grade();
        User user1 = new User();
        List<Person> persons = new ArrayList<>();
        List<Exam> exams = new ArrayList<Exam>();
        List<Module> modules = new ArrayList<Module>();
        List<Grade> grades = new ArrayList<Grade>();

        person1.setFirstName("Omer");
        person1.setFamilyName("Korkmaz");
        person1.setGender(Gender.AGENDER);

        course1.setName("Java EE");
        course1.setActive(true);
        course1.setCode("java2020");
        course1.setDescription("Deze opleiding richt zich tot werkzoekenden met interesse in programmatie.");
        course1.setImageUrl("http://www.intecbrussel.be/opleidingen/java-developer-1//");

        exam1.setName("Evaluation");
        exam1.setDate(LocalDate.now());
        exam1.setDescription("No comment");
        exam1.setModule(module1);
        exam1.setWeight(50);
        exam1.setTotal(100);

        grade1.setAbsent(true);
        grade1.setComment("Goed Gedaan");
        grade1.setDate(LocalDate.of(2020, 9, 11));
        grade1.setExam(exam1);
        grade1.setInternalComment("No internal Comment");
        grade1.setPerson(person1);
        //grade1.setGradeValue();

        user1.setPerson(person1);
        user1.setLogin("O_M_E_R");
        user1.setPasswordhash("Qwert1234");
        user1.setActive(true);

        List<Course> courses = new ArrayList<Course>();
        courses.add(course1);
        courses.add(course2);

        module1.setName("Java Fundamental");
        module1.setCourse(course1);
        module1.setExams(exams);
        module1.setCourse(course2);
        module1.setDescription("Deze opleiding richt zich tot werkzoekenden met interesse in programmatie.");

        modules.add(module1);
        modules.add(module2);

        grades.add(grade1);

        person1.setUser(user1);
        person1.setGrade(grades);

        em.getTransaction().begin();
        em.persist(person1);
        em.persist(course1);
        em.persist(module1);
        em.persist(exam1);
        em.persist(grade1);
        em.persist(user1);
        em.getTransaction().commit();

        ExamService examService = new ExamService();
        examService.outputExam(1L);
        examService.outputAllExams();

        CourseService courseService = new CourseService();
        courseService.outputCourse(1L);
        courseService.outputAllCourses();

        ModuleService moduleService = new ModuleService();
        moduleService.outputModule(1L);
        moduleService.outputAllModules();

        PersonService personService = new PersonService();
        personService.outputPerson(1);
        personService.outputAllPersons();

        UserService userService = new UserService();
        userService.outputUser("O_M_E_R");
        userService.outputAllUsers();

        em.close();
        emf.close();
    }
}
