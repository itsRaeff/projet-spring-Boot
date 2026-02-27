package tn.esprit.arctic.projetspring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projetspring.Entities.Pilote;
import tn.esprit.arctic.projetspring.Services.IPiloteService;

@RestController
@AllArgsConstructor
public class PiloteController {
    
    private IPiloteService piloteService;

    @PostMapping("/addPilote")
    public String addPilote(@RequestBody Pilote p) {
        return piloteService.addPilote(p);
    }
}
