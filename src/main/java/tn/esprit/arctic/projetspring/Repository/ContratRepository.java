package tn.esprit.arctic.projetspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.projetspring.Entities.Contrat;

import java.util.List;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long> {

    List<Contrat> findBySponsorIdSponsorAndAnnee(Long idSponsor, String annee);
}
