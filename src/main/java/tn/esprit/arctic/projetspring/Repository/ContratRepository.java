package tn.esprit.arctic.projetspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.projetspring.Entities.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long> {

}
