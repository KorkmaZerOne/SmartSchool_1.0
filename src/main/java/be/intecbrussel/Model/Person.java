package be.intecbrussel.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String familyName;
    //@Enumerated(EnumType.STRING)
    private Gender gender;
    @ManyToOne(cascade = CascadeType.ALL)
    private Course courseActive;
    @ManyToMany(mappedBy = "persons")
    private List<Course> courseHistory;
    //@OneToOne(cascade = CascadeType.ALL)
    //private User user;
    @OneToMany(mappedBy = "person")
    private List<Grade> grade;

    public Person() {
    }

    public Person(String firstName, String familyName, Gender gender, List<Course> courseHistory) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.gender = gender;
        this.courseActive = courseActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Course getCourseActive() {
        return courseActive;
    }

    public void setCourseActive(Course courseActive) {
        this.courseActive = courseActive;
    }

    public List<Course> getCourseHistory() {
        return courseHistory;
    }

    public void setCourseHistory(List<Course> courseHistory) {
        this.courseHistory = courseHistory;
    }

   /* public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/

    public List<Grade> getGrade() {
        return grade;
    }

    public void setGrade(List<Grade> grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", gender=" + gender +
                ", courseActive=" + courseActive +
                ", courseHistory=" + courseHistory +
                ", grade=" + grade +
                '}';
    }
}
