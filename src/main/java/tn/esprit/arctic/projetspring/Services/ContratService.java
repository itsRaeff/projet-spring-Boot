package tn.esprit.arctic.projetspring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projetspring.Repository.ContratRepository;

@Service
@AllArgsConstructor
public class ContratService implements IContratService {
    
    private ContratRepository contratRepository;
    


}
