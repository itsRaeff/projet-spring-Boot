package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "equipe")
public class Equipe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipe;
    
    @Column(nullable = false)
    private String libelle;
    
    @Column(nullable = false)
    private Integer nbPointsTotal;
    
    @Column(nullable = false)
    private Integer classementGeneraux;
}
