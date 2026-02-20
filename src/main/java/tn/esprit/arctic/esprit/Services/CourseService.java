package tn.esprit.arctic.esprit.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.esprit.Ripository.CourseRepository;
import tn.esprit.arctic.esprit.entities.Course;
import java.util.List;

@Service
public class CourseService implements ICourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course ajouterCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> ajouterCourses(List<Course> courses) {
        return courseRepository.saveAll(courses);
    }

    @Override
    public Course modifierCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void supprimerCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public List<Course> listCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course recupererCourse(Long id) {
        return courseRepository.findById(id).orElse(null);
    }
}