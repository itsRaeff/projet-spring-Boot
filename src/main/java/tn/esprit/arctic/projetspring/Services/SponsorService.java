package tn.esprit.arctic.projetspring.Services;

import tn.esprit.arctic.projetspring.Entities.Sponsor;
import tn.esprit.arctic.projetspring.Repository.SponsorRepository;

import java.util.List;

public class SponsorService implements ISponsorService{
    SponsorRepository sp;


    @Override
    public Sponsor ajouterSponsor(Sponsor sponsor) {


        return sp.save(sponsor);
    }

    @Override
    public List<Sponsor> ajouterSponsors(List<Sponsor> sponsors) {
        return sp.saveAll(sponsors);
    }

    @Override
    public Sponsor modifierSponsor(Sponsor sponsor) {
        return sp.save(sponsor);
    }

    @Override
    public void supprimerSponsor(Long idSponsor) {
        sp.deleteById(idSponsor);

    }

    @Override
    public List<Sponsor> listSponsors() {

        sp.findAll();
        return List.of();
    }

    @Override
    public Sponsor recupererSponsor(Long idSponsor) {

        return sp.findById(idSponsor).orElse(null);
    }

    @Override
    public Boolean archiverSponsor(Long idSponsor) {
        Sponsor sponsor=sp.findById(idSponsor).orElse(null);
sponsor.setArchived(Boolean.TRUE);
       sp.save(sponsor);
       return sponsor.getArchived();
    }
}
