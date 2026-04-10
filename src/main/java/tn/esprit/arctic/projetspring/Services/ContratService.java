package tn.esprit.arctic.projetspring.Services;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projetspring.Entities.Contrat;
import tn.esprit.arctic.projetspring.Repository.ContratRepository;

import java.time.Year;
import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContratService {

    private ContratRepository contratRepository;

    @Override
    @Scheduled(cron = "0/30 * * * * *")
    public void archiverContratsExpireesEtAffichageContratsActifsParEquipe() {
        int anneeCourante = Year.now().getValue();
        List<Contrat> contrats = contratRepository.findAll();

        for (Contrat contrat : contrats) {
            if (!contrat.getArchived() && Integer.parseInt(contrat.getAnnee()) < anneeCourante) {
                contrat.setArchived(true);
                contratRepository.save(contrat);
            }
        }

        for (Contrat contrat : contrats) {
            if (!contrat.getArchived()) {
                System.out.println("L'equipe " + contrat.getEquipe().getLibelle()
                        + " a un contrat d'un montant de " + contrat.getMontant()
                        + " avec le sponsor " + contrat.getSponsor().getNom());
            }
        }

        System.out.println("Scheduled task is running");


    }
}
