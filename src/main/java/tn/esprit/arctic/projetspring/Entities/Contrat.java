package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "contrat")
public class Contrat {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;
    
    private Float montant;
    
    private String annee;
    
    private Boolean archived;
}
