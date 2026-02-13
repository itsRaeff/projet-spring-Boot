package tn.esprit.arctic.projetspring.Services;

import tn.esprit.arctic.projetspring.Entities.Equipe;
import tn.esprit.arctic.projetspring.Repository.EquipeRepository;

public class EquipeService implements IEquipeService{

EquipeRepository eq;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return eq.save(equipe);
}

}