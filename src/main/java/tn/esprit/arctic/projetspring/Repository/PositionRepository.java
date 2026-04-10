package tn.esprit.arctic.projetspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.projetspring.Entities.Position;

import java.util.List;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {

    List<Position> findByPiloteIdPiloteAndCourseChampionnatAnnee(Long idPilote, Integer annee);
}
