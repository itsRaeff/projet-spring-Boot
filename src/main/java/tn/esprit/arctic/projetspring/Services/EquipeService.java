package tn.esprit.arctic.projetspring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projetspring.Entities.Equipe;
import tn.esprit.arctic.projetspring.Repository.EquipeRepository;

@Service
@AllArgsConstructor
public class EquipeService implements IEquipeService{

    private EquipeRepository eq;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return eq.save(equipe);
}

}