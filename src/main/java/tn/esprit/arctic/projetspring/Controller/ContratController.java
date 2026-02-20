package tn.esprit.arctic.projetspring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projetspring.Services.IContratService;

@RestController
@AllArgsConstructor
public class ContratController {
    
    private IContratService contratService;
    


}
