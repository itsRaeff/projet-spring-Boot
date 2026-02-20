package tn.esprit.arctic.projetspring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projetspring.Entities.Pilote;
import tn.esprit.arctic.projetspring.Repository.PiloteRepository;

@Service
@AllArgsConstructor
public class PiloteService implements IPiloteService{
    
    private PiloteRepository pil;


    @Override
    public String addPilote(Pilote p) {
        pil.save(p);
        return "Pilote ajouté avec succès";
    }
}
