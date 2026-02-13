package tn.esprit.arctic.projetspring.Services;

import tn.esprit.arctic.projetspring.Entities.Pilote;
import tn.esprit.arctic.projetspring.Repository.PiloteRepository;

public class PiloteService implements IPiloteService{
    PiloteRepository pil;


    @Override
    public String addPilote(Pilote p) {
        pil.save(p);
        return "Pilote ajouté avec succès";
    }
}
