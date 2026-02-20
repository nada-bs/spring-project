package tn.esprit.arctic.esprit.Ripository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.esprit.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}