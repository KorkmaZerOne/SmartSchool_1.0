package be.intecbrussel.Service;

import be.intecbrussel.Data.CourseRepository;
import be.intecbrussel.Model.Course;

public class CourseService {

    public void addCourse(Course course) {
        CourseRepository repository = new CourseRepository();
        repository.addCourse(course);
    }

    public void outputAllCourses() {
        CourseRepository repository = new CourseRepository();
        repository.getAllCourses();
    }

    public void outputCourseById(Long id) {
        CourseRepository repository = new CourseRepository();
        repository.getCourseById(id);
    }

    public void updateCourse(Course course){
        CourseRepository repository = new CourseRepository();
        repository.updateCourse(course);
    }

    public void deleteCourse(Course course){
        CourseRepository repository = new CourseRepository();
        repository.deleteCourse(course);
    }

    public void deleteCourseById(Long id){
        CourseRepository repository = new CourseRepository();
            repository.deleteCourseById(id);
    }
}
