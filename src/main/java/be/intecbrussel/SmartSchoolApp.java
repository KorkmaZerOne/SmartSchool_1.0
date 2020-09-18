package be.intecbrussel;

import be.intecbrussel.Model.*;
import be.intecbrussel.Model.Module;
import be.intecbrussel.Service.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SmartSchoolApp {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SmartSchoolDB");

        Person person1 = new Person();
        Person person2 = new Person();
        Course course1 = new Course();
        Module module1 = new Module();
        Exam exam1 = new Exam();
        Grade grade1 = new Grade();
        User user1 = new User();
        User user2 = new User();
        List<Person> persons = new ArrayList<>();
        List<User> users = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        List<Exam> exams = new ArrayList<Exam>();
        List<Module> modules = new ArrayList<Module>();
        List<Grade> grades = new ArrayList<Grade>();

        course1.setName("Java EE");
        course1.setActive(true);
        course1.setCode("java2020");
        course1.setDescription("Deze opleiding richt zich tot werkzoekenden met interesse in programmatie.");
        course1.setImageUrl("http://www.intecbrussel.be/opleidingen/java-developer-1//");
        course1.setModules(modules);
        courses.add(course1);

        module1.setName("Java Fundamental");
        module1.setCourse(course1);
        module1.setExams(exams);
        module1.setDescription("Deze opleiding richt zich tot werkzoekenden met interesse in programmatie.");
        modules.add(module1);

        exam1.setName("Evaluation");
        exam1.setDate(LocalDate.now());
        exam1.setDescription("No comment");
        exam1.setModule(module1);
        exam1.setWeight(50);
        exam1.setTotal(100);
        exam1.setExamGroup(exam1);
        exam1.setSubExams(exams);
        exams.add(exam1);

        grade1.setAbsent(true);
        grade1.setComment("Goed Gedaan");
        grade1.setDate(LocalDate.of(2020, 9, 11));
        grade1.setExam(exam1);
        grade1.setInternalComment("No internal Comment");
        grade1.setPerson(person1);
        grade1.setGradeValue(BigDecimal.ONE);

        person1.setFirstName("Omer");
        person1.setFamilyName("Korkmaz");
        person1.setGender(Gender.AGENDER);
        person1.setCourseActive(course1);
        person1.setCourseHistory(courses);
        person1.setGrade(grades);

        person2.setFirstName("jon");
        person2.setFamilyName("Snow");
        person2.setGender(Gender.BIGENDER);
        person2.setCourseActive(course1);
        person2.setCourseHistory(courses);
        person2.setGrade(grades);

        persons.add(person1);

        user1.setPerson(person1);
        user1.setLogin("O_M_E_R");
        user1.setPasswordHash("Quwerty1234");
        user1.setActive(true);

        user2.setPerson(person2);
        user2.setLogin("J_O_N");
        user2.setPasswordHash("Azerty1234");
        user2.setActive(false);

        users.add(user1);
        users.add(user2);

        UserService userService = new UserService();
        userService.addUser(user1);
        Person person3 = new Person();
        PersonService personService = new PersonService();

        personService.addPerson(person1);

        Person person4 = new Person();
        person4.setFirstName("hay");
        person4.setFamilyName("durden");
        person4.setGender(Gender.AGENDER);
        personService.addPerson(person4);
        personService.deletePerson(person3);
        System.out.println("---------------id:" + person2.getId());
        personService.addPerson(person2);
        personService.outputPersonById(1);
        personService.outputAllPersons();

        // CourseService courseService = new CourseService();
        // courseService.addCourse(course1);

        // ModuleService moduleService = new ModuleService();
        //  moduleService.addModule(module1);

        //  ExamService examService = new ExamService();
        // examService.addExam(exam1);

        //userService.outputUser("O_M_E_R");
        //userService.outputAllUsers();

        // courseService.outputCourse(1L);
        //courseService.outputAllCourses();

        // moduleService.outputModule(1L);
        // moduleService.outputAllModules();

        //  examService.outputExam(1L);
        // examService.outputAllExams();

        emf.close();
    }
}