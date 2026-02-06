package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pilote")
public class Pilote {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPilote;
    
    @Column(nullable = false)
    private String libellePilote;
    
    @Column(nullable = false)
    private Integer nbPointsTotaux;
    
    @Column(nullable = false)
    private Integer classementGeneraux;
}
