package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pilote")
public class Pilote {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPilote;
    
    private String libellePilote;
    
    private Integer nbPointsTotaux;
    
    private Integer classementGeneraux;
}
