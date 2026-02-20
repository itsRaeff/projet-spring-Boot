package tn.esprit.arctic.projetspring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projetspring.Repository.CourseRepository;

@Service
@AllArgsConstructor
public class CourseService implements ICourseService {
    
    private CourseRepository courseRepository;
    


}
