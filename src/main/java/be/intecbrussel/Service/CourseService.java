package be.intecbrussel.Service;

import be.intecbrussel.Data.courseRepository;
import be.intecbrussel.Data.examRepository;
import be.intecbrussel.Model.Course;
import be.intecbrussel.Model.Exam;

public class CourseService {

    public void addCourse(Course course) {
        courseRepository repository = new courseRepository();
        repository.addCourse(course);
    }

    public void outputAllCourses() {
        courseRepository repository = new courseRepository();
        repository.getAllCourses();
    }

    public void outputCourse(Long id) {
        courseRepository repository = new courseRepository();
        repository.getCourseById(id);
    }
}
