package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "sponsor")
public class Sponsor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSponsor;
    
    @Column(nullable = false)
    private String nom;
    
    @Column(nullable = false)
    private String pays;
    
    @Column(nullable = false)
    private Float budgetAnnuel;
    
    @Column(nullable = false)
    private Boolean bloquerContrat;
}
