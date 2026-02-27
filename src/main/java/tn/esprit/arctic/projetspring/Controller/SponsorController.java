package tn.esprit.arctic.projetspring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projetspring.Entities.Sponsor;
import tn.esprit.arctic.projetspring.Services.ISponsorService;

import java.util.List;

@RestController
@AllArgsConstructor
public class SponsorController {
    
    private ISponsorService sponsorService;

    @PostMapping("/ajouterSponsor")
    public Sponsor ajouterSponsor(@RequestBody Sponsor sponsor) {
        return sponsorService.ajouterSponsor(sponsor);
    }

    @PostMapping("/ajouterSponsors")
    public List<Sponsor> ajouterSponsors(@RequestBody List<Sponsor> sponsors) {
        return sponsorService.ajouterSponsors(sponsors);
    }

    @PutMapping("/modifierSponsor")
    public Sponsor modifierSponsor(@RequestBody Sponsor sponsor) {
        return sponsorService.modifierSponsor(sponsor);
    }

    @DeleteMapping("/supprimerSponsor/{id}")
    public void supprimerSponsor(@PathVariable("id") Long idSponsor) {
        sponsorService.supprimerSponsor(idSponsor);
    }

    @GetMapping("/listSponsors")
    public List<Sponsor> listSponsors() {
        return sponsorService.listSponsors();
    }

    @GetMapping("/recupererSponsor/{id}")
    public Sponsor recupererSponsor(@PathVariable("id") Long idSponsor) {
        return sponsorService.recupererSponsor(idSponsor);
    }

    @PutMapping("/archiverSponsor/{id}")
    public Boolean archiverSponsor(@PathVariable("id") Long idSponsor) {
        return sponsorService.archiverSponsor(idSponsor);
    }
}
