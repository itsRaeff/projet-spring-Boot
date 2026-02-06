package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "contrat")
public class Contrat {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;
    
    @Column(nullable = false)
    private Float montant;
    
    @Column(nullable = false)
    private String annee;
    
    @Column(nullable = false)
    private Boolean archived;
}
