package tn.esprit.arctic.projetspring.Services;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projetspring.Entities.Contrat;
import tn.esprit.arctic.projetspring.Entities.Sponsor;
import tn.esprit.arctic.projetspring.Repository.ContratRepository;
import tn.esprit.arctic.projetspring.Repository.SponsorRepository;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

@Service
@AllArgsConstructor
public class SponsorService implements ISponsorService{
    
    private SponsorRepository sp;
    private ContratRepository contratRepository;

    @Override
    public Sponsor ajouterSponsor(Sponsor sponsor) {
        sponsor.setDateCreation(LocalDate.now());
        sponsor.setArchived(false);
        sponsor.setBloquerContrat(false);
        return sp.save(sponsor);
    }

    @Override
    public List<Sponsor> ajouterSponsors(List<Sponsor> sponsors) {
        for (Sponsor sponsor : sponsors) {
            sponsor.setDateCreation(LocalDate.now());
            sponsor.setArchived(false);
            sponsor.setBloquerContrat(false);
        }
        return sp.saveAll(sponsors);
    }

    @Override
    public Sponsor modifierSponsor(Sponsor sponsor) {
        sponsor.setDateDerniereModification(LocalDate.now());
        return sp.save(sponsor);
    }

    @Override
    public void supprimerSponsor(Long idSponsor) {
        sp.deleteById(idSponsor);
    }

    @Override
    public List<Sponsor> listSponsors() {
        return sp.findAll();
    }

    @Override
    public Sponsor recupererSponsor(Long idSponsor) {
        return sp.findById(idSponsor).orElse(null);
    }

    @Override
    public Boolean archiverSponsor(Long idSponsor) {
        Sponsor sponsor = sp.findById(idSponsor).orElse(null);
        if (sponsor != null) {
            sponsor.setArchived(true);
            sp.save(sponsor);
            return sponsor.getArchived();
        }
        return false;
    }

    @Override
    public Float pourcentageBudgetAnnuelConsomme(Long idSponsor) {
        Sponsor sponsor = sp.findById(idSponsor).get();
        String anneeCourante = String.valueOf(Year.now().getValue());
        List<Contrat> contrats = contratRepository.findBySponsorIdSponsorAndAnnee(idSponsor, anneeCourante);

        float totalDepense = 0f;
        for (Contrat contrat : contrats) {
            totalDepense += contrat.getMontant();
        }

        return (totalDepense * 100) / sponsor.getBudgetAnnuel();
    }

    @Override


    //@Scheduled(cron = "0/30 * * * * *")
    @Scheduled(cron = "0 0 9 * * MON")
    public void suiviBudgetSponsorsHebdomadaire() {
        List<Sponsor> sponsors = sp.findAll();

        for (Sponsor sponsor : sponsors) {
            float pourcentage = pourcentageBudgetAnnuelConsomme(sponsor.getIdSponsor());
            System.out.println("sponsor: " + sponsor.getNom() + " pourcentage : " + pourcentage);

            if (pourcentage > 70 && pourcentage < 100) {
                System.out.println("attention budget presque consomme : " + pourcentage + " % !");
            }

            if (pourcentage > 100) {
                System.out.println("budget depasse!! vous ne pouvez plus faire de contrats");
                sponsor.setBloquerContrat(true);
                sp.save(sponsor);
            }
        }
        System.out.println("Scheduled task2 is running");


    }
}
