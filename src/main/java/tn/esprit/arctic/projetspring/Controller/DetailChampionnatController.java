package tn.esprit.arctic.projetspring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projetspring.Services.IDetailChampionnatService;

@RestController
@AllArgsConstructor
public class DetailChampionnatController {
    
    private IDetailChampionnatService detailChampionnatService;
    


}
