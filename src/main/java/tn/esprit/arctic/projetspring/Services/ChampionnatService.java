package tn.esprit.arctic.projetspring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projetspring.Repository.ChampionnatRepository;

@Service
@AllArgsConstructor
public class ChampionnatService implements IChampionnatService {
    
    private ChampionnatRepository championnatRepository;


}
