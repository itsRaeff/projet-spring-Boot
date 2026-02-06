package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "equipe")
public class Equipe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipe;
    
    private String libelle;
    
    private Integer nbPointsTotal;
    
    private Integer classementGeneraux;
}
