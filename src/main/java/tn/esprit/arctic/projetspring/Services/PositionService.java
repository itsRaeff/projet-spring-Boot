package tn.esprit.arctic.projetspring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projetspring.Repository.PositionRepository;

@Service
@AllArgsConstructor
public class PositionService implements IPositionService {
    
    private PositionRepository positionRepository;
    


}
