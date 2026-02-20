package tn.esprit.arctic.projetspring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projetspring.Repository.DetailChampionnatRepository;

@Service
@AllArgsConstructor
public class DetailChampionnatService implements IDetailChampionnatService {
    
    private DetailChampionnatRepository detailChampionnatRepository;
    
  

}
