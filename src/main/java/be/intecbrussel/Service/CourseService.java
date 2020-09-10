package be.intecbrussel.Service;

import be.intecbrussel.Data.courseRepository;
import be.intecbrussel.Data.examRepository;

public class CourseService {

    public void outputAllCourses() {
        courseRepository repository = new courseRepository();
        repository.getAllCourses();
    }

    public void outputCourse(Long id) {
        courseRepository repository = new courseRepository();
        repository.getCourseById(id);
    }
}
