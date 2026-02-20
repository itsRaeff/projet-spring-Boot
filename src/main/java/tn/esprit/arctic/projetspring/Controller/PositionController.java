package tn.esprit.arctic.projetspring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projetspring.Services.IPositionService;

@RestController
@AllArgsConstructor
public class PositionController {
    
    private IPositionService positionService;
    


}
