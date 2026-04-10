package tn.esprit.arctic.projetspring.Services;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projetspring.Entities.Pilote;
import tn.esprit.arctic.projetspring.Entities.Position;
import tn.esprit.arctic.projetspring.Repository.PiloteRepository;
import tn.esprit.arctic.projetspring.Repository.PositionRepository;

import java.time.Year;
import java.util.Comparator;
import java.util.List;

@Service
@AllArgsConstructor
public class PiloteService implements IPiloteService {

    private PiloteRepository pil;
    private PositionRepository positionRepository;

    @Override
    public String addPilote(Pilote p) {
        pil.save(p);
        return "Pilote ajoute avec succes";
    }

    @Override
    @Scheduled(cron = "0 15 11 31 12 *")
    public void miseAJourPointsEtClassementPilotes() {
        int anneeCourante = Year.now().getValue();
        List<Pilote> pilotes = pil.findAll();

        for (Pilote pilote : pilotes) {
            List<Position> positions = positionRepository.findByPiloteIdPiloteAndCourseChampionnatAnnee(
                    pilote.getIdPilote(), anneeCourante);
            int totalPoints = 0;
            for (Position position : positions) {
                totalPoints += position.getNbPoints();
            }
            pilote.setNbPointsTotaux(totalPoints);
            pil.save(pilote);
        }

        pilotes.sort(Comparator.comparing(Pilote::getNbPointsTotaux).reversed());

        for (int i = 0; i < pilotes.size(); i++) {
            pilotes.get(i).setClassementGeneraux(i + 1);
            pil.save(pilotes.get(i));
        }
    }
}
