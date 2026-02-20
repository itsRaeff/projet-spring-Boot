package tn.esprit.arctic.projetspring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projetspring.Services.IPiloteService;

@RestController
@AllArgsConstructor
public class PiloteController {
    
    private IPiloteService piloteService;


}
