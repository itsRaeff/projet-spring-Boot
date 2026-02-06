package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "position")
public class Position {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPosition;
    
    @Column(nullable = false)
    private Integer classement;
    
    @Column(nullable = false)
    private Integer nbPoints;
}
