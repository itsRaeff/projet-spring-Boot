package tn.esprit.arctic.projetspring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projetspring.Services.ICourseService;

@RestController
@AllArgsConstructor
public class CourseController {
    
    private ICourseService courseService;

}
