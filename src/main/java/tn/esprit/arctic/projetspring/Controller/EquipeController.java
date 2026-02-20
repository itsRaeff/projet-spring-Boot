package tn.esprit.arctic.projetspring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projetspring.Services.IEquipeService;

@RestController
@AllArgsConstructor
public class EquipeController {
    
    private IEquipeService equipeService;

}
