package tn.esprit.arctic.projetspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.projetspring.Entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
