package tn.esprit.arctic.esprit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.esprit.Services.ICourseService;
import tn.esprit.arctic.esprit.entities.Course;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private ICourseService courseService;

    @PostMapping
    public Course ajouterCourse(@RequestBody Course course) {
        return courseService.ajouterCourse(course);
    }

    @PostMapping("/all")
    public List<Course> ajouterCourses(@RequestBody List<Course> courses) {
        return courseService.ajouterCourses(courses);
    }

    @PutMapping
    public Course modifierCourse(@RequestBody Course course) {
        return courseService.modifierCourse(course);
    }

    @DeleteMapping("/{id}")
    public void supprimerCourse(@PathVariable Long id) {
        courseService.supprimerCourse(id);
    }

    @GetMapping
    public List<Course> listCourses() {
        return courseService.listCourses();
    }

    @GetMapping("/{id}")
    public Course recupererCourse(@PathVariable Long id) {
        return courseService.recupererCourse(id);
    }
}