package tn.esprit.arctic.projetspring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projetspring.Services.ISponsorService;

@RestController
@AllArgsConstructor
public class SponsorController {
    
    private ISponsorService sponsorService;


}
