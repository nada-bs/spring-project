package tn.esprit.arctic.esprit.Services;

import tn.esprit.arctic.esprit.entities.Course;
import java.util.List;

public interface ICourseService {
    Course ajouterCourse(Course course);
    List<Course> ajouterCourses(List<Course> courses);
    Course modifierCourse(Course course);
    void supprimerCourse(Long id);
    List<Course> listCourses();
    Course recupererCourse(Long id);
}